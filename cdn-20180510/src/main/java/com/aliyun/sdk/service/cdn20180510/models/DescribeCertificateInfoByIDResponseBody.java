// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateInfoByIDResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateInfoByIDResponseBody</p>
 */
public class DescribeCertificateInfoByIDResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    private CertInfos certInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCertificateInfoByIDResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateInfoByIDResponseBody create() {
        return builder().build();
    }

    /**
     * @return certInfos
     */
    public CertInfos getCertInfos() {
        return this.certInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertInfos certInfos; 
        private String requestId; 

        /**
         * The information about the certificate.
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertificateInfoByIDResponseBody build() {
            return new DescribeCertificateInfoByIDResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @NameInMap("CertExpireTime")
        private String certExpireTime;

        @NameInMap("CertId")
        private String certId;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainList")
        private String domainList;

        @NameInMap("HttpsCrt")
        private String httpsCrt;

        private CertInfo(Builder builder) {
            this.certExpireTime = builder.certExpireTime;
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.certType = builder.certType;
            this.createTime = builder.createTime;
            this.domainList = builder.domainList;
            this.httpsCrt = builder.httpsCrt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainList
         */
        public String getDomainList() {
            return this.domainList;
        }

        /**
         * @return httpsCrt
         */
        public String getHttpsCrt() {
            return this.httpsCrt;
        }

        public static final class Builder {
            private String certExpireTime; 
            private String certId; 
            private String certName; 
            private String certType; 
            private String createTime; 
            private String domainList; 
            private String httpsCrt; 

            /**
             * The time at which the certificate expires.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * The ID of the certificate.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The type of the certificate.
             * <p>
             * 
             * *   free: a free certificate
             * *   cas: a certificate purchased by using Certificate Management Service
             * *   upload: a user-uploaded certificate
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The time when the certificate became effective.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The domain names that use the certificate.
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * The content of the certificate.
             */
            public Builder httpsCrt(String httpsCrt) {
                this.httpsCrt = httpsCrt;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    public static class CertInfos extends TeaModel {
        @NameInMap("CertInfo")
        private java.util.List < CertInfo> certInfo;

        private CertInfos(Builder builder) {
            this.certInfo = builder.certInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfos create() {
            return builder().build();
        }

        /**
         * @return certInfo
         */
        public java.util.List < CertInfo> getCertInfo() {
            return this.certInfo;
        }

        public static final class Builder {
            private java.util.List < CertInfo> certInfo; 

            /**
             * CertInfo.
             */
            public Builder certInfo(java.util.List < CertInfo> certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            public CertInfos build() {
                return new CertInfos(this);
            } 

        } 

    }
}
