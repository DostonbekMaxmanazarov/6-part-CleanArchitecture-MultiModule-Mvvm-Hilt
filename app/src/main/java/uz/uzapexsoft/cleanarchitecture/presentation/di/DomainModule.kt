package uz.uzapexsoft.cleanarchitecture.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.uzapexsoft.domain.repository.AuthRepository
import uz.uzapexsoft.domain.usecase.GetAuthUseCase
import uz.uzapexsoft.domain.usecase.SaveAuthUseCase
import uz.uzapexsoft.domain.usecase.impl.GetAuthUseCaseImpl
import uz.uzapexsoft.domain.usecase.impl.SaveAuthUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {
    @Provides
    fun provideGetAuthUseCase(authRepository: AuthRepository): GetAuthUseCase =
        GetAuthUseCaseImpl(authRepository = authRepository)

    @Provides
    fun provideSaveAuthUseCase(authRepository: AuthRepository): SaveAuthUseCase =
        SaveAuthUseCaseImpl(authRepository = authRepository)
}