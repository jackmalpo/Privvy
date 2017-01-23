package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.buttons.ButtonComponent;
import com.malpo.sliver.sample.ui.buttons.ButtonModule;
import com.malpo.sliver.sample.ui.number.NumberComponent;
import com.malpo.sliver.sample.ui.number.NumberModule;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {NumberComponent.class, ButtonComponent.class})
class SliverModule {

    @Provides
    NumberComponent provideNumberComponent(NumberComponent.Builder builder) {
        return builder.numberModule(new NumberModule()).build();
    }

    @Provides
    ButtonComponent provideButtonComponent(ButtonComponent.Builder builder) {
        return builder.buttonModule(new ButtonModule()).build();
    }
}
