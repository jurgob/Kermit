/*
 * Copyright (c) 2022 Touchlab
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package co.touchlab.kermit.koin.sample

import co.touchlab.kermit.koin.getLoggerWithTag
import org.koin.core.qualifier.named
import org.koin.dsl.module

actual val platformModule = module {
    // android specific dependencies - SqlDelight database, for instance

    single {
        DataStore(
            context = get(named("app_context")),
            logger = getLoggerWithTag("data_store")
        )
    }
}