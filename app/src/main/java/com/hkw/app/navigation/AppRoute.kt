package com.hkw.app.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hkw.app.ui.screen.onboarding.OnboardingView

object NavRoute{
    const val ONBOARDING = "onboarding"
}

@Composable
fun AppRoute(
    modifier: Modifier,
    navController: NavHostController,
){
    NavHost(
        navController = navController,
        startDestination = NavRoute.ONBOARDING,
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300),
            ) + fadeIn(animationSpec = tween(300))
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300),
            ) + fadeOut(animationSpec = tween(300))
        },
    ){
        composable(
            route = NavRoute.ONBOARDING
        ){
            OnboardingView(
                modifier = modifier
            )
        }
    }
}