// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FindFinanceTaxDetailResponseBody} extends {@link TeaModel}
 *
 * <p>FindFinanceTaxDetailResponseBody</p>
 */
public class FindFinanceTaxDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Finance")
    private Finance finance;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindFinanceTaxDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.finance = builder.finance;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindFinanceTaxDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return finance
     */
    public Finance getFinance() {
        return this.finance;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Finance finance; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindFinanceTaxDetailResponseBody model) {
            this.code = model.code;
            this.finance = model.finance;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Finance.
         */
        public Builder finance(Finance finance) {
            this.finance = finance;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FindFinanceTaxDetailResponseBody build() {
            return new FindFinanceTaxDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindFinanceTaxDetailResponseBody} extends {@link TeaModel}
     *
     * <p>FindFinanceTaxDetailResponseBody</p>
     */
    public static class Finance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinanceTaxCertificateImgName")
        private String financeTaxCertificateImgName;

        @com.aliyun.core.annotation.NameInMap("Tax")
        private String tax;

        @com.aliyun.core.annotation.NameInMap("financeTaxCertificateImgUrl")
        private String financeTaxCertificateImgUrl;

        @com.aliyun.core.annotation.NameInMap("secondFinanceTax")
        private String secondFinanceTax;

        @com.aliyun.core.annotation.NameInMap("secondFinanceTaxCertificateImgName")
        private String secondFinanceTaxCertificateImgName;

        @com.aliyun.core.annotation.NameInMap("secondFinanceTaxCertificateImgUrl")
        private String secondFinanceTaxCertificateImgUrl;

        private Finance(Builder builder) {
            this.financeTaxCertificateImgName = builder.financeTaxCertificateImgName;
            this.tax = builder.tax;
            this.financeTaxCertificateImgUrl = builder.financeTaxCertificateImgUrl;
            this.secondFinanceTax = builder.secondFinanceTax;
            this.secondFinanceTaxCertificateImgName = builder.secondFinanceTaxCertificateImgName;
            this.secondFinanceTaxCertificateImgUrl = builder.secondFinanceTaxCertificateImgUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Finance create() {
            return builder().build();
        }

        /**
         * @return financeTaxCertificateImgName
         */
        public String getFinanceTaxCertificateImgName() {
            return this.financeTaxCertificateImgName;
        }

        /**
         * @return tax
         */
        public String getTax() {
            return this.tax;
        }

        /**
         * @return financeTaxCertificateImgUrl
         */
        public String getFinanceTaxCertificateImgUrl() {
            return this.financeTaxCertificateImgUrl;
        }

        /**
         * @return secondFinanceTax
         */
        public String getSecondFinanceTax() {
            return this.secondFinanceTax;
        }

        /**
         * @return secondFinanceTaxCertificateImgName
         */
        public String getSecondFinanceTaxCertificateImgName() {
            return this.secondFinanceTaxCertificateImgName;
        }

        /**
         * @return secondFinanceTaxCertificateImgUrl
         */
        public String getSecondFinanceTaxCertificateImgUrl() {
            return this.secondFinanceTaxCertificateImgUrl;
        }

        public static final class Builder {
            private String financeTaxCertificateImgName; 
            private String tax; 
            private String financeTaxCertificateImgUrl; 
            private String secondFinanceTax; 
            private String secondFinanceTaxCertificateImgName; 
            private String secondFinanceTaxCertificateImgUrl; 

            private Builder() {
            } 

            private Builder(Finance model) {
                this.financeTaxCertificateImgName = model.financeTaxCertificateImgName;
                this.tax = model.tax;
                this.financeTaxCertificateImgUrl = model.financeTaxCertificateImgUrl;
                this.secondFinanceTax = model.secondFinanceTax;
                this.secondFinanceTaxCertificateImgName = model.secondFinanceTaxCertificateImgName;
                this.secondFinanceTaxCertificateImgUrl = model.secondFinanceTaxCertificateImgUrl;
            } 

            /**
             * FinanceTaxCertificateImgName.
             */
            public Builder financeTaxCertificateImgName(String financeTaxCertificateImgName) {
                this.financeTaxCertificateImgName = financeTaxCertificateImgName;
                return this;
            }

            /**
             * Tax.
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            /**
             * financeTaxCertificateImgUrl.
             */
            public Builder financeTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
                this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
                return this;
            }

            /**
             * secondFinanceTax.
             */
            public Builder secondFinanceTax(String secondFinanceTax) {
                this.secondFinanceTax = secondFinanceTax;
                return this;
            }

            /**
             * secondFinanceTaxCertificateImgName.
             */
            public Builder secondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
                this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
                return this;
            }

            /**
             * secondFinanceTaxCertificateImgUrl.
             */
            public Builder secondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
                this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
                return this;
            }

            public Finance build() {
                return new Finance(this);
            } 

        } 

    }
}
