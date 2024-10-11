// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodCertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodCertificateListResponseBody</p>
 */
public class DescribeVodCertificateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateListModel")
    private CertificateListModel certificateListModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodCertificateListResponseBody(Builder builder) {
        this.certificateListModel = builder.certificateListModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodCertificateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateListModel
     */
    public CertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertificateListModel certificateListModel; 
        private String requestId; 

        /**
         * <p>The information about each certificate.</p>
         */
        public Builder certificateListModel(CertificateListModel certificateListModel) {
            this.certificateListModel = certificateListModel;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC0E34AC-0239-44A7-****-800DE522C8DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodCertificateListResponseBody build() {
            return new DescribeVodCertificateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodCertificateListResponseBody</p>
     */
    public static class Cert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("Common")
        private String common;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DomainMatchCert")
        private Boolean domainMatchCert;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("SignAlgorithm")
        private String signAlgorithm;

        private Cert(Builder builder) {
            this.algorithm = builder.algorithm;
            this.certId = builder.certId;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.common = builder.common;
            this.createTime = builder.createTime;
            this.domainMatchCert = builder.domainMatchCert;
            this.endTime = builder.endTime;
            this.fingerprint = builder.fingerprint;
            this.instanceId = builder.instanceId;
            this.issuer = builder.issuer;
            this.lastTime = builder.lastTime;
            this.signAlgorithm = builder.signAlgorithm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cert create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return common
         */
        public String getCommon() {
            return this.common;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainMatchCert
         */
        public Boolean getDomainMatchCert() {
            return this.domainMatchCert;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return signAlgorithm
         */
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public static final class Builder {
            private String algorithm; 
            private Long certId; 
            private String certIdentifier; 
            private String certName; 
            private String common; 
            private Long createTime; 
            private Boolean domainMatchCert; 
            private Long endTime; 
            private String fingerprint; 
            private String instanceId; 
            private String issuer; 
            private Long lastTime; 
            private String signAlgorithm; 

            /**
             * <p>The algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>235437</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>14173772-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>certificate</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The common name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * <p>The time when the certificate was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1725206400000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>DomainMatchCert.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder domainMatchCert(Boolean domainMatchCert) {
                this.domainMatchCert = domainMatchCert;
                return this;
            }

            /**
             * <p>The time when the certificate expired.</p>
             * 
             * <strong>example:</strong>
             * <p>1759507200000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-cn-cd806ae0fdfbfa60</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The time when the certificate was issued. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1512388610</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The signAlgorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256withrsa</p>
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            public Cert build() {
                return new Cert(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodCertificateListResponseBody</p>
     */
    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cert")
        private java.util.List < Cert> cert;

        private CertList(Builder builder) {
            this.cert = builder.cert;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertList create() {
            return builder().build();
        }

        /**
         * @return cert
         */
        public java.util.List < Cert> getCert() {
            return this.cert;
        }

        public static final class Builder {
            private java.util.List < Cert> cert; 

            /**
             * Cert.
             */
            public Builder cert(java.util.List < Cert> cert) {
                this.cert = cert;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodCertificateListResponseBody</p>
     */
    public static class CertificateListModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertList")
        private CertList certList;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private CertificateListModel(Builder builder) {
            this.certList = builder.certList;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateListModel create() {
            return builder().build();
        }

        /**
         * @return certList
         */
        public CertList getCertList() {
            return this.certList;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private CertList certList; 
            private Integer count; 

            /**
             * <p>The list of certificates.</p>
             */
            public Builder certList(CertList certList) {
                this.certList = certList;
                return this;
            }

            /**
             * <p>The number of certificates that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public CertificateListModel build() {
                return new CertificateListModel(this);
            } 

        } 

    }
}
