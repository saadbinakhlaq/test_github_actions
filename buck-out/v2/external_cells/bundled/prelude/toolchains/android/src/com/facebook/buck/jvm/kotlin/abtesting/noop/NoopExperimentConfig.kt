/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under both the MIT license found in the
 * LICENSE-MIT file in the root directory of this source tree and the Apache
 * License, Version 2.0 found in the LICENSE-APACHE file in the root directory
 * of this source tree.
 */

package com.facebook.buck.jvm.kotlin.abtesting.noop

import com.facebook.buck.jvm.kotlin.abtesting.ExperimentConfig

internal object NoopExperimentConfig : ExperimentConfig {
  override fun getBoolParam(param: String, default: Boolean): Boolean = default

  override fun getIntParam(param: String, default: Int): Int = default

  override fun getStringParam(param: String, default: String): String = default
}
