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
 * {@link QueryAccountRealNameInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountRealNameInfoResponseBody</p>
 */
public class QueryAccountRealNameInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProfileInfo")
    private ProfileInfo profileInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAccountRealNameInfoResponseBody(Builder builder) {
        this.profileInfo = builder.profileInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountRealNameInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profileInfo
     */
    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProfileInfo profileInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAccountRealNameInfoResponseBody model) {
            this.profileInfo = model.profileInfo;
            this.requestId = model.requestId;
        } 

        /**
         * ProfileInfo.
         */
        public Builder profileInfo(ProfileInfo profileInfo) {
            this.profileInfo = profileInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAccountRealNameInfoResponseBody build() {
            return new QueryAccountRealNameInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountRealNameInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountRealNameInfoResponseBody</p>
     */
    public static class ProfileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountCertifyType")
        private String accountCertifyType;

        @com.aliyun.core.annotation.NameInMap("AuthAlipay")
        private String authAlipay;

        @com.aliyun.core.annotation.NameInMap("AuthBeiAnCid")
        private String authBeiAnCid;

        @com.aliyun.core.annotation.NameInMap("AuthDomain")
        private String authDomain;

        @com.aliyun.core.annotation.NameInMap("CertifiedFrom")
        private String certifiedFrom;

        @com.aliyun.core.annotation.NameInMap("CertifiedTime")
        private String certifiedTime;

        @com.aliyun.core.annotation.NameInMap("IsBankIDAuth")
        private String isBankIDAuth;

        @com.aliyun.core.annotation.NameInMap("IsCertified")
        private String isCertified;

        @com.aliyun.core.annotation.NameInMap("LicenseNumber")
        private String licenseNumber;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProcessingEnterpriseCertify")
        private Boolean processingEnterpriseCertify;

        private ProfileInfo(Builder builder) {
            this.accountCertifyType = builder.accountCertifyType;
            this.authAlipay = builder.authAlipay;
            this.authBeiAnCid = builder.authBeiAnCid;
            this.authDomain = builder.authDomain;
            this.certifiedFrom = builder.certifiedFrom;
            this.certifiedTime = builder.certifiedTime;
            this.isBankIDAuth = builder.isBankIDAuth;
            this.isCertified = builder.isCertified;
            this.licenseNumber = builder.licenseNumber;
            this.licenseType = builder.licenseType;
            this.name = builder.name;
            this.processingEnterpriseCertify = builder.processingEnterpriseCertify;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfileInfo create() {
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
         * @return isBankIDAuth
         */
        public String getIsBankIDAuth() {
            return this.isBankIDAuth;
        }

        /**
         * @return isCertified
         */
        public String getIsCertified() {
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
         * @return processingEnterpriseCertify
         */
        public Boolean getProcessingEnterpriseCertify() {
            return this.processingEnterpriseCertify;
        }

        public static final class Builder {
            private String accountCertifyType; 
            private String authAlipay; 
            private String authBeiAnCid; 
            private String authDomain; 
            private String certifiedFrom; 
            private String certifiedTime; 
            private String isBankIDAuth; 
            private String isCertified; 
            private String licenseNumber; 
            private String licenseType; 
            private String name; 
            private Boolean processingEnterpriseCertify; 

            private Builder() {
            } 

            private Builder(ProfileInfo model) {
                this.accountCertifyType = model.accountCertifyType;
                this.authAlipay = model.authAlipay;
                this.authBeiAnCid = model.authBeiAnCid;
                this.authDomain = model.authDomain;
                this.certifiedFrom = model.certifiedFrom;
                this.certifiedTime = model.certifiedTime;
                this.isBankIDAuth = model.isBankIDAuth;
                this.isCertified = model.isCertified;
                this.licenseNumber = model.licenseNumber;
                this.licenseType = model.licenseType;
                this.name = model.name;
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
             * IsBankIDAuth.
             */
            public Builder isBankIDAuth(String isBankIDAuth) {
                this.isBankIDAuth = isBankIDAuth;
                return this;
            }

            /**
             * IsCertified.
             */
            public Builder isCertified(String isCertified) {
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
             * ProcessingEnterpriseCertify.
             */
            public Builder processingEnterpriseCertify(Boolean processingEnterpriseCertify) {
                this.processingEnterpriseCertify = processingEnterpriseCertify;
                return this;
            }

            public ProfileInfo build() {
                return new ProfileInfo(this);
            } 

        } 

    }
}
