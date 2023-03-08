/*
 * Copyright 2022 Joel Kanyi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kanyideveloper.mealtime.navigation

import android.net.Uri
import androidx.navigation.NavController
import com.ramcosta.composedestinations.dynamic.within
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.swayy.home.presentation.destinations.CollectionDetailScreenDestination
import com.swayy.home.presentation.destinations.HomeScreenDestination
import com.swayy.home.presentation.home.HomeNavigator
import com.swayy.profile.presentation.SettingsNavigator

class CoreFeatureNavigator(
    private val navGraph: NavGraphSpec,
    private val navController: NavController
) : HomeNavigator, SettingsNavigator {

    override fun openHome() {
        navController.navigate(HomeScreenDestination within navGraph)
    }

    override fun popBackStack() {
        navController.popBackStack()
    }

    override fun openCollectionDetails(collectionId: String) {
        navController.navigate(CollectionDetailScreenDestination(collectionId = collectionId) within navGraph)
    }

    override fun openAllergiesScreen() {}

}