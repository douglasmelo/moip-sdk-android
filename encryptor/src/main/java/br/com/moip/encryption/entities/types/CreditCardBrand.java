package br.com.moip.encryption.entities.types;

public enum CreditCardBrand {

    //@formatter:off
    UNKNOWN("Desconhecido"),
    VISA("Visa"),
    MASTERCARD("MASTERCARD"),
    AMEX("Amex"),
    HIPERCARD("Hipercard"),
    DINERS("Diners"),
    DISCOVERY("Discovery"),
    JCB("JCB");
    //@formatter:on

    private String description;

    private CreditCardBrand(final String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static CreditCardBrand fromDescription(final String description) {
        if (description == null) {
            return UNKNOWN;
        }
        for (CreditCardBrand brand : CreditCardBrand.values()) {
            if (brand.getDescription().equals(description)) {
                return brand;
            }
        }
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return "CreditCardBrand{" +
                "description='" + description + '\'' +
                '}';
    }
}