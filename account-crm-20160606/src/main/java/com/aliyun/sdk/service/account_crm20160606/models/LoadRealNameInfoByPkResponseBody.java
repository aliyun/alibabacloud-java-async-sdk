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
 * {@link LoadRealNameInfoByPkResponseBody} extends {@link TeaModel}
 *
 * <p>LoadRealNameInfoByPkResponseBody</p>
 */
public class LoadRealNameInfoByPkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LoadRealNameInfoByPkResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadRealNameInfoByPkResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LoadRealNameInfoByPkResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LoadRealNameInfoByPkResponseBody build() {
            return new LoadRealNameInfoByPkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LoadRealNameInfoByPkResponseBody} extends {@link TeaModel}
     *
     * <p>LoadRealNameInfoByPkResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountCertifyType")
        private String accountCertifyType;

        @com.aliyun.core.annotation.NameInMap("AuthAlipay")
        private String authAlipay;

        @com.aliyun.core.annotation.NameInMap("AuthAlipayDomain")
        private String authAlipayDomain;

        @com.aliyun.core.annotation.NameInMap("AuthAlipayLoginId")
        private String authAlipayLoginId;

        @com.aliyun.core.annotation.NameInMap("AuthBeiAnCid")
        private String authBeiAnCid;

        @com.aliyun.core.annotation.NameInMap("AuthDomain")
        private String authDomain;

        @com.aliyun.core.annotation.NameInMap("CertifiedFrom")
        private String certifiedFrom;

        @com.aliyun.core.annotation.NameInMap("CertifiedTime")
        private String certifiedTime;

        @com.aliyun.core.annotation.NameInMap("CertifyStatus")
        private Integer certifyStatus;

        @com.aliyun.core.annotation.NameInMap("CicCertifyFrom")
        private Integer cicCertifyFrom;

        @com.aliyun.core.annotation.NameInMap("CicCertifyProduct")
        private Long cicCertifyProduct;

        @com.aliyun.core.annotation.NameInMap("IsBankIDAuth")
        private Boolean isBankIDAuth;

        @com.aliyun.core.annotation.NameInMap("IsCertified")
        private Boolean isCertified;

        @com.aliyun.core.annotation.NameInMap("LicenseNumber")
        private String licenseNumber;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewUnityRealNameAccount")
        private String newUnityRealNameAccount;

        @com.aliyun.core.annotation.NameInMap("ProcessingEnterpriseCertify")
        private Boolean processingEnterpriseCertify;

        private Data(Builder builder) {
            this.accountCertifyType = builder.accountCertifyType;
            this.authAlipay = builder.authAlipay;
            this.authAlipayDomain = builder.authAlipayDomain;
            this.authAlipayLoginId = builder.authAlipayLoginId;
            this.authBeiAnCid = builder.authBeiAnCid;
            this.authDomain = builder.authDomain;
            this.certifiedFrom = builder.certifiedFrom;
            this.certifiedTime = builder.certifiedTime;
            this.certifyStatus = builder.certifyStatus;
            this.cicCertifyFrom = builder.cicCertifyFrom;
            this.cicCertifyProduct = builder.cicCertifyProduct;
            this.isBankIDAuth = builder.isBankIDAuth;
            this.isCertified = builder.isCertified;
            this.licenseNumber = builder.licenseNumber;
            this.licenseType = builder.licenseType;
            this.name = builder.name;
            this.newUnityRealNameAccount = builder.newUnityRealNameAccount;
            this.processingEnterpriseCertify = builder.processingEnterpriseCertify;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountCertifyType
         */
        public String getAccountCertifyType() {
            return this.accountCertifyType;
        }

        /**
         * @return authAlipay
         */
        public String getAuthAlipay() {
            return this.authAlipay;
        }

        /**
         * @return authAlipayDomain
         */
        public String getAuthAlipayDomain() {
            return this.authAlipayDomain;
        }

        /**
         * @return authAlipayLoginId
         */
        public String getAuthAlipayLoginId() {
            return this.authAlipayLoginId;
        }

        /**
         * @return authBeiAnCid
         */
        public String getAuthBeiAnCid() {
            return this.authBeiAnCid;
        }

        /**
         * @return authDomain
         */
        public String getAuthDomain() {
            return this.authDomain;
        }

        /**
         * @return certifiedFrom
         */
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        /**
         * @return certifiedTime
         */
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        /**
         * @return certifyStatus
         */
        public Integer getCertifyStatus() {
            return this.certifyStatus;
        }

        /**
         * @return cicCertifyFrom
         */
        public Integer getCicCertifyFrom() {
            return this.cicCertifyFrom;
        }

        /**
         * @return cicCertifyProduct
         */
        public Long getCicCertifyProduct() {
            return this.cicCertifyProduct;
        }

        /**
         * @return isBankIDAuth
         */
        public Boolean getIsBankIDAuth() {
            return this.isBankIDAuth;
        }

        /**
         * @return isCertified
         */
        public Boolean getIsCertified() {
            return this.isCertified;
        }

        /**
         * @return licenseNumber
         */
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        /**
         * @return licenseType
         */
        public String getLicenseType() {
            return this.licenseType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newUnityRealNameAccount
         */
        public String getNewUnityRealNameAccount() {
            return this.newUnityRealNameAccount;
        }

        /**
         * @return processingEnterpriseCertify
         */
        public Boolean getProcessingEnterpriseCertify() {
            return this.processingEnterpriseCertify;
        }

        public static final class Builder {
            private String accountCertifyType; 
            private String authAlipay; 
            private String authAlipayDomain; 
            private String authAlipayLoginId; 
            private String authBeiAnCid; 
            private String authDomain; 
            private String certifiedFrom; 
            private String certifiedTime; 
            private Integer certifyStatus; 
            private Integer cicCertifyFrom; 
            private Long cicCertifyProduct; 
            private Boolean isBankIDAuth; 
            private Boolean isCertified; 
            private String licenseNumber; 
            private String licenseType; 
            private String name; 
            private String newUnityRealNameAccount; 
            private Boolean processingEnterpriseCertify; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountCertifyType = model.accountCertifyType;
                this.authAlipay = model.authAlipay;
                this.authAlipayDomain = model.authAlipayDomain;
                this.authAlipayLoginId = model.authAlipayLoginId;
                this.authBeiAnCid = model.authBeiAnCid;
                this.authDomain = model.authDomain;
                this.certifiedFrom = model.certifiedFrom;
                this.certifiedTime = model.certifiedTime;
                this.certifyStatus = model.certifyStatus;
                this.cicCertifyFrom = model.cicCertifyFrom;
                this.cicCertifyProduct = model.cicCertifyProduct;
                this.isBankIDAuth = model.isBankIDAuth;
                this.isCertified = model.isCertified;
                this.licenseNumber = model.licenseNumber;
                this.licenseType = model.licenseType;
                this.name = model.name;
                this.newUnityRealNameAccount = model.newUnityRealNameAccount;
                this.processingEnterpriseCertify = model.processingEnterpriseCertify;
            } 

            /**
             * AccountCertifyType.
             */
            public Builder accountCertifyType(String accountCertifyType) {
                this.accountCertifyType = accountCertifyType;
                return this;
            }

            /**
             * AuthAlipay.
             */
            public Builder authAlipay(String authAlipay) {
                this.authAlipay = authAlipay;
                return this;
            }

            /**
             * AuthAlipayDomain.
             */
            public Builder authAlipayDomain(String authAlipayDomain) {
                this.authAlipayDomain = authAlipayDomain;
                return this;
            }

            /**
             * AuthAlipayLoginId.
             */
            public Builder authAlipayLoginId(String authAlipayLoginId) {
                this.authAlipayLoginId = authAlipayLoginId;
                return this;
            }

            /**
             * AuthBeiAnCid.
             */
            public Builder authBeiAnCid(String authBeiAnCid) {
                this.authBeiAnCid = authBeiAnCid;
                return this;
            }

            /**
             * AuthDomain.
             */
            public Builder authDomain(String authDomain) {
                this.authDomain = authDomain;
                return this;
            }

            /**
             * CertifiedFrom.
             */
            public Builder certifiedFrom(String certifiedFrom) {
                this.certifiedFrom = certifiedFrom;
                return this;
            }

            /**
             * CertifiedTime.
             */
            public Builder certifiedTime(String certifiedTime) {
                this.certifiedTime = certifiedTime;
                return this;
            }

            /**
             * CertifyStatus.
             */
            public Builder certifyStatus(Integer certifyStatus) {
                this.certifyStatus = certifyStatus;
                return this;
            }

            /**
             * CicCertifyFrom.
             */
            public Builder cicCertifyFrom(Integer cicCertifyFrom) {
                this.cicCertifyFrom = cicCertifyFrom;
                return this;
            }

            /**
             * CicCertifyProduct.
             */
            public Builder cicCertifyProduct(Long cicCertifyProduct) {
                this.cicCertifyProduct = cicCertifyProduct;
                return this;
            }

            /**
             * IsBankIDAuth.
             */
            public Builder isBankIDAuth(Boolean isBankIDAuth) {
                this.isBankIDAuth = isBankIDAuth;
                return this;
            }

            /**
             * IsCertified.
             */
            public Builder isCertified(Boolean isCertified) {
                this.isCertified = isCertified;
                return this;
            }

            /**
             * LicenseNumber.
             */
            public Builder licenseNumber(String licenseNumber) {
                this.licenseNumber = licenseNumber;
                return this;
            }

            /**
             * LicenseType.
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewUnityRealNameAccount.
             */
            public Builder newUnityRealNameAccount(String newUnityRealNameAccount) {
                this.newUnityRealNameAccount = newUnityRealNameAccount;
                return this;
            }

            /**
             * ProcessingEnterpriseCertify.
             */
            public Builder processingEnterpriseCertify(Boolean processingEnterpriseCertify) {
                this.processingEnterpriseCertify = processingEnterpriseCertify;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
