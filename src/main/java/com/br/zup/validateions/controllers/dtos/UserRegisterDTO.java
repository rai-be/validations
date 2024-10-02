package com.br.zup.validateions.controllers.dtos;

import jakarta.validation.constraints.*;


public class UserRegisterDTO {

    @NotBlank(message = "Nome (obrigatório)")
    @Size(min = 2, message = "Nome deve ter nome e o sobrenome")
    private String name;

    @NotNull(message = "Idade (obrigatório)")
    @Min(value = 18, message = "Idade não pode ser 0 e precisa ser de maior")
    @Max(value = 100, message = "Idade deve ser menor que 110 anos")
    private Integer age;

    @NotNull(message = "Ano de nascimento (obrigatório)")
    private Integer yearOfBirth;

    @NotBlank(message = "Email (obrigatório)")
    @Email(message = "Email deve estar no formato correto")
    private String email;

    public @NotBlank(message = "Nome (obrigatório)") @Size(min = 2, message = "Nome deve conter nome e sobrenome") String getName() {
        return name;
    }

    public @NotNull(message = "Idade é obrigatória") @Min(value = 1, message = "Idade não pode ser 0") @Max(value = 109, message = "Idade deve ser menor que 110 anos") Integer getAge() {
        return age;
    }

    public @NotNull(message = "Ano de nascimento é obrigatório") Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public @NotBlank(message = "Email é obrigatório") @Email(message = "Email deve estar no formato válido") String getEmail() {
        return email;
    }

    public void setName(@NotBlank(message = "Nome é obrigatório") @Size(min = 2, message = "Nome deve conter nome e sobrenome") String name) {
        this.name = name;
    }

    public void setAge(@NotNull(message = "Idade é obrigatória") @Min(value = 1, message = "Idade não pode ser 0") @Max(value = 109, message = "Idade deve ser menor que 110 anos") Integer age) {
        this.age = age;
    }

    public void setYearOfBirth(@NotNull(message = "Ano de nascimento é obrigatório") Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatório") @Email(message = "Email deve estar no formato válido") String email) {
        this.email = email;
    }
}
