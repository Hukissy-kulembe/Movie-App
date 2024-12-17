package com.example.filme.di;

import android.content.Context;
import com.example.filme.domain.repository.WorkManagerRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideWorkManagerRepositoryFactory implements Factory<WorkManagerRepository> {
  private final Provider<Context> ctxProvider;

  public AppModule_ProvideWorkManagerRepositoryFactory(Provider<Context> ctxProvider) {
    this.ctxProvider = ctxProvider;
  }

  @Override
  public WorkManagerRepository get() {
    return provideWorkManagerRepository(ctxProvider.get());
  }

  public static AppModule_ProvideWorkManagerRepositoryFactory create(
      Provider<Context> ctxProvider) {
    return new AppModule_ProvideWorkManagerRepositoryFactory(ctxProvider);
  }

  public static WorkManagerRepository provideWorkManagerRepository(Context ctx) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWorkManagerRepository(ctx));
  }
}
