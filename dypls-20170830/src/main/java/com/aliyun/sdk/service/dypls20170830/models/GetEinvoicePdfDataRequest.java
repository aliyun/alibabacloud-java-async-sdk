// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEinvoicePdfDataRequest} extends {@link RequestModel}
 *
 * <p>GetEinvoicePdfDataRequest</p>
 */
public class GetEinvoicePdfDataRequest extends Request {
    @Body
    @NameInMap("AppCode")
    private String appCode;

    @Body
    @NameInMap("Customer")
    private Customer customer;

    @Body
    @NameInMap("EncryptProps")
    private java.util.Map < String, String > encryptProps;

    @Body
    @NameInMap("InvoiceCode")
    private String invoiceCode;

    @Body
    @NameInMap("InvoiceNo")
    private String invoiceNo;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("Sign")
    private String sign;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    private GetEinvoicePdfDataRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.customer = builder.customer;
        this.encryptProps = builder.encryptProps;
        this.invoiceCode = builder.invoiceCode;
        this.invoiceNo = builder.invoiceNo;
        this.language = builder.language;
        this.sign = builder.sign;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEinvoicePdfDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return customer
     */
    public Customer getCustomer() {
        return this.customer;
    }

    /**
     * @return encryptProps
     */
    public java.util.Map < String, String > getEncryptProps() {
        return this.encryptProps;
    }

    /**
     * @return invoiceCode
     */
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    /**
     * @return invoiceNo
     */
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetEinvoicePdfDataRequest, Builder> {
        private String appCode; 
        private Customer customer; 
        private java.util.Map < String, String > encryptProps; 
        private String invoiceCode; 
        private String invoiceNo; 
        private String language; 
        private String sign; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetEinvoicePdfDataRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.customer = request.customer;
            this.encryptProps = request.encryptProps;
            this.invoiceCode = request.invoiceCode;
            this.invoiceNo = request.invoiceNo;
            this.language = request.language;
            this.sign = request.sign;
            this.uuid = request.uuid;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * Customer.
         */
        public Builder customer(Customer customer) {
            this.putBodyParameter("Customer", customer);
            this.customer = customer;
            return this;
        }

        /**
         * EncryptProps.
         */
        public Builder encryptProps(java.util.Map < String, String > encryptProps) {
            this.putBodyParameter("EncryptProps", encryptProps);
            this.encryptProps = encryptProps;
            return this;
        }

        /**
         * InvoiceCode.
         */
        public Builder invoiceCode(String invoiceCode) {
            this.putBodyParameter("InvoiceCode", invoiceCode);
            this.invoiceCode = invoiceCode;
            return this;
        }

        /**
         * InvoiceNo.
         */
        public Builder invoiceNo(String invoiceNo) {
            this.putBodyParameter("InvoiceNo", invoiceNo);
            this.invoiceNo = invoiceNo;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Sign.
         */
        public Builder sign(String sign) {
            this.putBodyParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetEinvoicePdfDataRequest build() {
            return new GetEinvoicePdfDataRequest(this);
        } 

    } 

    public static class Customer extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CustomerId")
        private String customerId;

        @NameInMap("CustomerSite")
        private String customerSite;

        @NameInMap("CustomerSystem")
        private String customerSystem;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("Language")
        private String language;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Uuid")
        private String uuid;

        private Customer(Builder builder) {
            this.appCode = builder.appCode;
            this.customerId = builder.customerId;
            this.customerSite = builder.customerSite;
            this.customerSystem = builder.customerSystem;
            this.encryptProps = builder.encryptProps;
            this.language = builder.language;
            this.sign = builder.sign;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customer create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerSite
         */
        public String getCustomerSite() {
            return this.customerSite;
        }

        /**
         * @return customerSystem
         */
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String appCode; 
            private String customerId; 
            private String customerSite; 
            private String customerSystem; 
            private java.util.Map < String, String > encryptProps; 
            private String language; 
            private String sign; 
            private String uuid; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * CustomerSite.
             */
            public Builder customerSite(String customerSite) {
                this.customerSite = customerSite;
                return this;
            }

            /**
             * CustomerSystem.
             */
            public Builder customerSystem(String customerSystem) {
                this.customerSystem = customerSystem;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Customer build() {
                return new Customer(this);
            } 

        } 

    }
}
