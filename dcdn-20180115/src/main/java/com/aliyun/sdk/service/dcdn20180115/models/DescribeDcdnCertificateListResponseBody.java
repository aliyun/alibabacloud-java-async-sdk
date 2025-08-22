// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnCertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnCertificateListResponseBody</p>
 */
public class DescribeDcdnCertificateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateListModel")
    private CertificateListModel certificateListModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnCertificateListResponseBody(Builder builder) {
        this.certificateListModel = builder.certificateListModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnCertificateListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDcdnCertificateListResponseBody model) {
            this.certificateListModel = model.certificateListModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about certificates.</p>
         */
        public Builder certificateListModel(CertificateListModel certificateListModel) {
            this.certificateListModel = certificateListModel;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC0E34AC-0239-44A7-AB0E-800DE522C8DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnCertificateListResponseBody build() {
            return new DescribeDcdnCertificateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnCertificateListResponseBody</p>
     */
    public static class Cert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("Common")
        private String common;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        private Cert(Builder builder) {
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.common = builder.common;
            this.fingerprint = builder.fingerprint;
            this.issuer = builder.issuer;
            this.lastTime = builder.lastTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cert create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
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
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
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

        public static final class Builder {
            private Long certId; 
            private String certName; 
            private String common; 
            private String fingerprint; 
            private String issuer; 
            private Long lastTime; 

            private Builder() {
            } 

            private Builder(Cert model) {
                this.certId = model.certId;
                this.certName = model.certName;
                this.common = model.common;
                this.fingerprint = model.fingerprint;
                this.issuer = model.issuer;
                this.lastTime = model.lastTime;
            } 

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Certificate 2</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The Common Name (CN) attribute of the certificate. In most cases, the CN is a domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * <p>The fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>0151xxxx</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>DigiCert</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1548065550</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            public Cert build() {
                return new Cert(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnCertificateListResponseBody</p>
     */
    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cert")
        private java.util.List<Cert> cert;

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
        public java.util.List<Cert> getCert() {
            return this.cert;
        }

        public static final class Builder {
            private java.util.List<Cert> cert; 

            private Builder() {
            } 

            private Builder(CertList model) {
                this.cert = model.cert;
            } 

            /**
             * Cert.
             */
            public Builder cert(java.util.List<Cert> cert) {
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
     * {@link DescribeDcdnCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnCertificateListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CertificateListModel model) {
                this.certList = model.certList;
                this.count = model.count;
            } 

            /**
             * <p>Details about each certificate.</p>
             */
            public Builder certList(CertList certList) {
                this.certList = certList;
                return this;
            }

            /**
             * <p>The number of certificates.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
