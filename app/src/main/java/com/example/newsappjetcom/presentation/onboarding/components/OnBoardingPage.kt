package com.example.newsappjetcom.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsappjetcom.R
import com.example.newsappjetcom.presentation.Dimens.SmallFraction1
import com.example.newsappjetcom.presentation.Dimens.SmallPadding1
import com.example.newsappjetcom.presentation.Dimens.SmallPadding2
import com.example.newsappjetcom.presentation.onboarding.Page
import com.example.newsappjetcom.presentation.onboarding.pages
import com.example.newsappjetcom.ui.theme.NewsAppJetComTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {

    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = SmallFraction1),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(SmallPadding1))

        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = SmallPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )

        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = SmallPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }

}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun OnBoardingPagePreview() {
    NewsAppJetComTheme {
        OnBoardingPage(page = pages[0])
    }
}