// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsCertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsCertificateListResponseBody</p>
 */
public class DescribeVsCertificateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateListModel")
    private CertificateListModel certificateListModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsCertificateListResponseBody(Builder builder) {
        this.certificateListModel = builder.certificateListModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsCertificateListResponseBody create() {
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

        private Builder(DescribeVsCertificateListResponseBody model) {
            this.certificateListModel = model.certificateListModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Certificate ID.</p>
         */
        public Builder certificateListModel(CertificateListModel certificateListModel) {
            this.certificateListModel = certificateListModel;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6E310519-E035-51AB-80D4-C1CBECD39EB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsCertificateListResponseBody build() {
            return new DescribeVsCertificateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsCertificateListResponseBody</p>
     */
    public static class CertList extends TeaModel {
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

        private CertList(Builder builder) {
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

        public static CertList create() {
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

            private Builder(CertList model) {
                this.certId = model.certId;
                this.certName = model.certName;
                this.common = model.common;
                this.fingerprint = model.fingerprint;
                this.issuer = model.issuer;
                this.lastTime = model.lastTime;
            } 

            /**
             * <p>ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>6338888</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>Name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-5391062</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>Common Name (CN) field in the certificate. Usually a domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * <p>Fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>3EB2585309AE5C8F369****7CDA6A8F5CEC8B2D4</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>Issuer of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxCert Inc</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1632462708</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVsCertificateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsCertificateListResponseBody</p>
     */
    public static class CertificateListModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertList")
        private java.util.List<CertList> certList;

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
        public java.util.List<CertList> getCertList() {
            return this.certList;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private java.util.List<CertList> certList; 
            private Integer count; 

            private Builder() {
            } 

            private Builder(CertificateListModel model) {
                this.certList = model.certList;
                this.count = model.count;
            } 

            /**
             * <p>List of certificates.</p>
             */
            public Builder certList(java.util.List<CertList> certList) {
                this.certList = certList;
                return this;
            }

            /**
             * <p>Number of certificates.</p>
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
