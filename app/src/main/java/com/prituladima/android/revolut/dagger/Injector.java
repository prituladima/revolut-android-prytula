package com.prituladima.android.revolut.dagger;

import com.prituladima.android.revolut.RevolutApplication;
import com.prituladima.android.revolut.model.Repository;
import com.prituladima.android.revolut.presenter.LastCurrencyPresenter;
import com.prituladima.android.revolut.view.LastCurrencyActivity;
import com.prituladima.android.revolut.view.adapter.LastCurrencyAdapter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                ContextModule.class,
                ApiModule.class,
                BusModule.class,
                UIModule.class
        }
)
public interface Injector {

    void inject(RevolutApplication keeperApplication);

    void inject(LastCurrencyActivity lastCurrencyActivity);

    void inject(LastCurrencyPresenter lastCurrencyPresenter);

    void inject(Repository repository);

    void inject(LastCurrencyAdapter adapter);

}