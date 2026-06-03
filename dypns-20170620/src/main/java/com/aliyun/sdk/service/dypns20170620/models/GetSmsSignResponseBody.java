// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link GetSmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsSignResponseBody</p>
 */
public class GetSmsSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSmsSignResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsSignResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSmsSignResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public GetSmsSignResponseBody build() {
            return new GetSmsSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmsSignResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsSignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUrl")
        private String appUrl;

        @com.aliyun.core.annotation.NameInMap("AuditResult")
        private String auditResult;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseCert")
        private String businessLicenseCert;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseCertId")
        private String businessLicenseCertId;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private Long createDate;

        @com.aliyun.core.annotation.NameInMap("DefaultFlag")
        private Boolean defaultFlag;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrganizationCodeCert")
        private String organizationCodeCert;

        @com.aliyun.core.annotation.NameInMap("OrganizationCodeCertId")
        private String organizationCodeCertId;

        @com.aliyun.core.annotation.NameInMap("SmsSignName")
        private String smsSignName;

        @com.aliyun.core.annotation.NameInMap("SmsSignRemark")
        private String smsSignRemark;

        @com.aliyun.core.annotation.NameInMap("SmsSignSource")
        private String smsSignSource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaxRegistrationCert")
        private String taxRegistrationCert;

        @com.aliyun.core.annotation.NameInMap("TaxRegistrationCertId")
        private String taxRegistrationCertId;

        @com.aliyun.core.annotation.NameInMap("TestFlag")
        private Boolean testFlag;

        private Data(Builder builder) {
            this.appUrl = builder.appUrl;
            this.auditResult = builder.auditResult;
            this.businessLicenseCert = builder.businessLicenseCert;
            this.businessLicenseCertId = builder.businessLicenseCertId;
            this.certType = builder.certType;
            this.createDate = builder.createDate;
            this.defaultFlag = builder.defaultFlag;
            this.orderId = builder.orderId;
            this.organizationCodeCert = builder.organizationCodeCert;
            this.organizationCodeCertId = builder.organizationCodeCertId;
            this.smsSignName = builder.smsSignName;
            this.smsSignRemark = builder.smsSignRemark;
            this.smsSignSource = builder.smsSignSource;
            this.status = builder.status;
            this.taxRegistrationCert = builder.taxRegistrationCert;
            this.taxRegistrationCertId = builder.taxRegistrationCertId;
            this.testFlag = builder.testFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appUrl
         */
        public String getAppUrl() {
            return this.appUrl;
        }

        /**
         * @return auditResult
         */
        public String getAuditResult() {
            return this.auditResult;
        }

        /**
         * @return businessLicenseCert
         */
        public String getBusinessLicenseCert() {
            return this.businessLicenseCert;
        }

        /**
         * @return businessLicenseCertId
         */
        public String getBusinessLicenseCertId() {
            return this.businessLicenseCertId;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return createDate
         */
        public Long getCreateDate() {
            return this.createDate;
        }

        /**
         * @return defaultFlag
         */
        public Boolean getDefaultFlag() {
            return this.defaultFlag;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return organizationCodeCert
         */
        public String getOrganizationCodeCert() {
            return this.organizationCodeCert;
        }

        /**
         * @return organizationCodeCertId
         */
        public String getOrganizationCodeCertId() {
            return this.organizationCodeCertId;
        }

        /**
         * @return smsSignName
         */
        public String getSmsSignName() {
            return this.smsSignName;
        }

        /**
         * @return smsSignRemark
         */
        public String getSmsSignRemark() {
            return this.smsSignRemark;
        }

        /**
         * @return smsSignSource
         */
        public String getSmsSignSource() {
            return this.smsSignSource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taxRegistrationCert
         */
        public String getTaxRegistrationCert() {
            return this.taxRegistrationCert;
        }

        /**
         * @return taxRegistrationCertId
         */
        public String getTaxRegistrationCertId() {
            return this.taxRegistrationCertId;
        }

        /**
         * @return testFlag
         */
        public Boolean getTestFlag() {
            return this.testFlag;
        }

        public static final class Builder {
            private String appUrl; 
            private String auditResult; 
            private String businessLicenseCert; 
            private String businessLicenseCertId; 
            private String certType; 
            private Long createDate; 
            private Boolean defaultFlag; 
            private String orderId; 
            private String organizationCodeCert; 
            private String organizationCodeCertId; 
            private String smsSignName; 
            private String smsSignRemark; 
            private String smsSignSource; 
            private String status; 
            private String taxRegistrationCert; 
            private String taxRegistrationCertId; 
            private Boolean testFlag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appUrl = model.appUrl;
                this.auditResult = model.auditResult;
                this.businessLicenseCert = model.businessLicenseCert;
                this.businessLicenseCertId = model.businessLicenseCertId;
                this.certType = model.certType;
                this.createDate = model.createDate;
                this.defaultFlag = model.defaultFlag;
                this.orderId = model.orderId;
                this.organizationCodeCert = model.organizationCodeCert;
                this.organizationCodeCertId = model.organizationCodeCertId;
                this.smsSignName = model.smsSignName;
                this.smsSignRemark = model.smsSignRemark;
                this.smsSignSource = model.smsSignSource;
                this.status = model.status;
                this.taxRegistrationCert = model.taxRegistrationCert;
                this.taxRegistrationCertId = model.taxRegistrationCertId;
                this.testFlag = model.testFlag;
            } 

            /**
             * AppUrl.
             */
            public Builder appUrl(String appUrl) {
                this.appUrl = appUrl;
                return this;
            }

            /**
             * AuditResult.
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * BusinessLicenseCert.
             */
            public Builder businessLicenseCert(String businessLicenseCert) {
                this.businessLicenseCert = businessLicenseCert;
                return this;
            }

            /**
             * BusinessLicenseCertId.
             */
            public Builder businessLicenseCertId(String businessLicenseCertId) {
                this.businessLicenseCertId = businessLicenseCertId;
                return this;
            }

            /**
             * CertType.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(Long createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DefaultFlag.
             */
            public Builder defaultFlag(Boolean defaultFlag) {
                this.defaultFlag = defaultFlag;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrganizationCodeCert.
             */
            public Builder organizationCodeCert(String organizationCodeCert) {
                this.organizationCodeCert = organizationCodeCert;
                return this;
            }

            /**
             * OrganizationCodeCertId.
             */
            public Builder organizationCodeCertId(String organizationCodeCertId) {
                this.organizationCodeCertId = organizationCodeCertId;
                return this;
            }

            /**
             * SmsSignName.
             */
            public Builder smsSignName(String smsSignName) {
                this.smsSignName = smsSignName;
                return this;
            }

            /**
             * SmsSignRemark.
             */
            public Builder smsSignRemark(String smsSignRemark) {
                this.smsSignRemark = smsSignRemark;
                return this;
            }

            /**
             * SmsSignSource.
             */
            public Builder smsSignSource(String smsSignSource) {
                this.smsSignSource = smsSignSource;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaxRegistrationCert.
             */
            public Builder taxRegistrationCert(String taxRegistrationCert) {
                this.taxRegistrationCert = taxRegistrationCert;
                return this;
            }

            /**
             * TaxRegistrationCertId.
             */
            public Builder taxRegistrationCertId(String taxRegistrationCertId) {
                this.taxRegistrationCertId = taxRegistrationCertId;
                return this;
            }

            /**
             * TestFlag.
             */
            public Builder testFlag(Boolean testFlag) {
                this.testFlag = testFlag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
