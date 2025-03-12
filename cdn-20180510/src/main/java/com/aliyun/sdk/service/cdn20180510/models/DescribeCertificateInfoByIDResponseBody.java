// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCertificateInfoByIDResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateInfoByIDResponseBody</p>
 */
public class DescribeCertificateInfoByIDResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertInfos")
    private CertInfos certInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the certificate.</p>
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertificateInfoByIDResponseBody build() {
            return new DescribeCertificateInfoByIDResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCertificateInfoByIDResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCertificateInfoByIDResponseBody</p>
     */
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertExpireTime")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("HttpsCrt")
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
             * <p>The time at which the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2098-02-08 08:02:07 +0000 UTC</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1644xx</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>example_cert</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The type of the certificate.</p>
             * <ul>
             * <li>free: a free certificate</li>
             * <li>cas: a certificate purchased by using Certificate Management Service</li>
             * <li>upload: a user-uploaded certificate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cas</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>The time when the certificate became effective.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-21 08:02:07 +0000 UTC</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain names that use the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;example.com&quot;]</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>The content of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----\nxxx-----END CERTIFICATE-----\n</p>
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
    /**
     * 
     * {@link DescribeCertificateInfoByIDResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCertificateInfoByIDResponseBody</p>
     */
    public static class CertInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertInfo")
        private java.util.List<CertInfo> certInfo;

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
        public java.util.List<CertInfo> getCertInfo() {
            return this.certInfo;
        }

        public static final class Builder {
            private java.util.List<CertInfo> certInfo; 

            /**
             * CertInfo.
             */
            public Builder certInfo(java.util.List<CertInfo> certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            public CertInfos build() {
                return new CertInfos(this);
            } 

        } 

    }
}
