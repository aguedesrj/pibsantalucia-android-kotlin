package br.com.pibsantalucia.ui.registerpessoa.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/fragment/IAddressFragment;", "", "fail", "", "message", "", "showErrorCep", "", "success", "viaCep", "Lbr/com/pibsantalucia/model/ViaCep;", "app_release"})
public abstract interface IAddressFragment {
    
    public abstract void showErrorCep(int message);
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.ViaCep viaCep);
    
    public abstract void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}