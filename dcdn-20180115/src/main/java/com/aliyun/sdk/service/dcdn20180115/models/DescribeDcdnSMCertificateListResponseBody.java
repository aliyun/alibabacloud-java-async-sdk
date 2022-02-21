// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSMCertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSMCertificateListResponseBody</p>
 */
public class DescribeDcdnSMCertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateListModel")
    private CertificateListModel certificateListModel;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnSMCertificateListResponseBody(Builder builder) {
        this.certificateListModel = builder.certificateListModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSMCertificateListResponseBody create() {
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
         * CertificateListModel.
         */
        public Builder certificateListModel(CertificateListModel certificateListModel) {
            this.certificateListModel = certificateListModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnSMCertificateListResponseBody build() {
            return new DescribeDcdnSMCertificateListResponseBody(this);
        } 

    } 

    public static class CertList extends TeaModel {
        @NameInMap("CertIdentifier")
        private String certIdentifier;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("Common")
        private String common;

        @NameInMap("Issuer")
        private String issuer;

        private CertList(Builder builder) {
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.common = builder.common;
            this.issuer = builder.issuer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertList create() {
            return builder().build();
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
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        public static final class Builder {
            private String certIdentifier; 
            private String certName; 
            private String common; 
            private String issuer; 

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * CertName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
    public static class CertificateListModel extends TeaModel {
        @NameInMap("CertList")
        private java.util.List < CertList> certList;

        @NameInMap("Count")
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
        public java.util.List < CertList> getCertList() {
            return this.certList;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private java.util.List < CertList> certList; 
            private Integer count; 

            /**
             * CertList.
             */
            public Builder certList(java.util.List < CertList> certList) {
                this.certList = certList;
                return this;
            }

            /**
             * Count.
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
