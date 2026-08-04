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
 * {@link FindFinanceTaxResponseBody} extends {@link TeaModel}
 *
 * <p>FindFinanceTaxResponseBody</p>
 */
public class FindFinanceTaxResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FinanceVersion")
    private FinanceVersion financeVersion;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindFinanceTaxResponseBody(Builder builder) {
        this.code = builder.code;
        this.financeVersion = builder.financeVersion;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindFinanceTaxResponseBody create() {
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
     * @return financeVersion
     */
    public FinanceVersion getFinanceVersion() {
        return this.financeVersion;
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
        private FinanceVersion financeVersion; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindFinanceTaxResponseBody model) {
            this.code = model.code;
            this.financeVersion = model.financeVersion;
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
         * FinanceVersion.
         */
        public Builder financeVersion(FinanceVersion financeVersion) {
            this.financeVersion = financeVersion;
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

        public FindFinanceTaxResponseBody build() {
            return new FindFinanceTaxResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindFinanceTaxResponseBody} extends {@link TeaModel}
     *
     * <p>FindFinanceTaxResponseBody</p>
     */
    public static class FinanceVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinanceTaxCertificateImgName")
        private String financeTaxCertificateImgName;

        @com.aliyun.core.annotation.NameInMap("FinanceTaxCertificateImgUrl")
        private String financeTaxCertificateImgUrl;

        @com.aliyun.core.annotation.NameInMap("SecondFinanceTax")
        private String secondFinanceTax;

        @com.aliyun.core.annotation.NameInMap("SecondFinanceTaxCertificateImgName")
        private String secondFinanceTaxCertificateImgName;

        @com.aliyun.core.annotation.NameInMap("SecondFinanceTaxCertificateImgUrl")
        private String secondFinanceTaxCertificateImgUrl;

        @com.aliyun.core.annotation.NameInMap("Tax")
        private String tax;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private FinanceVersion(Builder builder) {
            this.financeTaxCertificateImgName = builder.financeTaxCertificateImgName;
            this.financeTaxCertificateImgUrl = builder.financeTaxCertificateImgUrl;
            this.secondFinanceTax = builder.secondFinanceTax;
            this.secondFinanceTaxCertificateImgName = builder.secondFinanceTaxCertificateImgName;
            this.secondFinanceTaxCertificateImgUrl = builder.secondFinanceTaxCertificateImgUrl;
            this.tax = builder.tax;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FinanceVersion create() {
            return builder().build();
        }

        /**
         * @return financeTaxCertificateImgName
         */
        public String getFinanceTaxCertificateImgName() {
            return this.financeTaxCertificateImgName;
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

        /**
         * @return tax
         */
        public String getTax() {
            return this.tax;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String financeTaxCertificateImgName; 
            private String financeTaxCertificateImgUrl; 
            private String secondFinanceTax; 
            private String secondFinanceTaxCertificateImgName; 
            private String secondFinanceTaxCertificateImgUrl; 
            private String tax; 
            private String version; 

            private Builder() {
            } 

            private Builder(FinanceVersion model) {
                this.financeTaxCertificateImgName = model.financeTaxCertificateImgName;
                this.financeTaxCertificateImgUrl = model.financeTaxCertificateImgUrl;
                this.secondFinanceTax = model.secondFinanceTax;
                this.secondFinanceTaxCertificateImgName = model.secondFinanceTaxCertificateImgName;
                this.secondFinanceTaxCertificateImgUrl = model.secondFinanceTaxCertificateImgUrl;
                this.tax = model.tax;
                this.version = model.version;
            } 

            /**
             * FinanceTaxCertificateImgName.
             */
            public Builder financeTaxCertificateImgName(String financeTaxCertificateImgName) {
                this.financeTaxCertificateImgName = financeTaxCertificateImgName;
                return this;
            }

            /**
             * FinanceTaxCertificateImgUrl.
             */
            public Builder financeTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
                this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
                return this;
            }

            /**
             * SecondFinanceTax.
             */
            public Builder secondFinanceTax(String secondFinanceTax) {
                this.secondFinanceTax = secondFinanceTax;
                return this;
            }

            /**
             * SecondFinanceTaxCertificateImgName.
             */
            public Builder secondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
                this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
                return this;
            }

            /**
             * SecondFinanceTaxCertificateImgUrl.
             */
            public Builder secondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
                this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public FinanceVersion build() {
                return new FinanceVersion(this);
            } 

        } 

    }
}
