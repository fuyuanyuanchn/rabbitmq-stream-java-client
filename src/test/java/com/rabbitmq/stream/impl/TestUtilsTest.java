// Copyright (c) 2020-2021 VMware, Inc. or its affiliates.  All rights reserved.
//
// This software, the RabbitMQ Stream Java client library, is dual-licensed under the
// Mozilla Public License 2.0 ("MPL"), and the Apache License version 2 ("ASL").
// For the MPL, please see LICENSE-MPL-RabbitMQ. For the ASL,
// please see LICENSE-APACHE2.
//
// This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND,
// either express or implied. See the LICENSE file for specific language governing
// rights and limitations of this software.
//
// If you have any questions regarding licensing, please contact us at
// info@rabbitmq.com.
package com.rabbitmq.stream.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestUtilsTest {

  @ParameterizedTest
  @CsvSource({
    "3.9.6,3.9.5,false",
    "3.9.6,3.9.0-alpha-stream.232,true",
    "3.9.6,3.9.6-alpha.28,true"
  })
  void atLeastVersion(String expectedVersion, String currentVersion, boolean expected) {
    assertThat(TestUtils.atLeastVersion(expectedVersion, currentVersion)).isEqualTo(expected);
  }
}
