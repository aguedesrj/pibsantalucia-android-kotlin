package br.com.pibsantalucia.ui.registerpessoa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/RegisterPessoaViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "repository", "Lbr/com/pibsantalucia/repository/PessoaRepository;", "getRepository", "()Lbr/com/pibsantalucia/repository/PessoaRepository;", "setRepository", "(Lbr/com/pibsantalucia/repository/PessoaRepository;)V", "view", "Lbr/com/pibsantalucia/ui/registerpessoa/IRegisterPessoaActivity;", "getView", "()Lbr/com/pibsantalucia/ui/registerpessoa/IRegisterPessoaActivity;", "setView", "(Lbr/com/pibsantalucia/ui/registerpessoa/IRegisterPessoaActivity;)V", "save", "", "person", "Lbr/com/pibsantalucia/model/Person;", "app_release"})
public final class RegisterPessoaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private br.com.pibsantalucia.repository.PessoaRepository repository;
    @org.jetbrains.annotations.NotNull
    public br.com.pibsantalucia.ui.registerpessoa.IRegisterPessoaActivity view;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.repository.PessoaRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.repository.PessoaRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.ui.registerpessoa.IRegisterPessoaActivity getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.registerpessoa.IRegisterPessoaActivity p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void save(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person) {
    }
    
    public RegisterPessoaViewModel() {
        super();
    }
}