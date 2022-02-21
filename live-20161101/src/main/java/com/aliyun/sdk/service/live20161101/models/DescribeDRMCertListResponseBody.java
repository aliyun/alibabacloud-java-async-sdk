// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDRMCertListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDRMCertListResponseBody</p>
 */
public class DescribeDRMCertListResponseBody extends TeaModel {
    @NameInMap("DRMCertInfoListList")
    private DRMCertInfoListList DRMCertInfoListList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDRMCertListResponseBody(Builder builder) {
        this.DRMCertInfoListList = builder.DRMCertInfoListList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDRMCertListResponseBody create() {
        return builder().build();
    }

    /**
     * @return DRMCertInfoListList
     */
    public DRMCertInfoListList getDRMCertInfoListList() {
        return this.DRMCertInfoListList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DRMCertInfoListList DRMCertInfoListList; 
        private String requestId; 

        /**
         * DRMCertInfoListList.
         */
        public Builder DRMCertInfoListList(DRMCertInfoListList DRMCertInfoListList) {
            this.DRMCertInfoListList = DRMCertInfoListList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDRMCertListResponseBody build() {
            return new DescribeDRMCertListResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @NameInMap("Ask")
        private String ask;

        @NameInMap("CertId")
        private String certId;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Passphrase")
        private String passphrase;

        @NameInMap("PrivateKey")
        private String privateKey;

        @NameInMap("ServCert")
        private String servCert;

        private CertInfo(Builder builder) {
            this.ask = builder.ask;
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.passphrase = builder.passphrase;
            this.privateKey = builder.privateKey;
            this.servCert = builder.servCert;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return ask
         */
        public String getAsk() {
            return this.ask;
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
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return passphrase
         */
        public String getPassphrase() {
            return this.passphrase;
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        /**
         * @return servCert
         */
        public String getServCert() {
            return this.servCert;
        }

        public static final class Builder {
            private String ask; 
            private String certId; 
            private String certName; 
            private String createDate; 
            private String description; 
            private String passphrase; 
            private String privateKey; 
            private String servCert; 

            /**
             * Ask.
             */
            public Builder ask(String ask) {
                this.ask = ask;
                return this;
            }

            /**
             * CertId.
             */
            public Builder certId(String certId) {
                this.certId = certId;
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
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Passphrase.
             */
            public Builder passphrase(String passphrase) {
                this.passphrase = passphrase;
                return this;
            }

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * ServCert.
             */
            public Builder servCert(String servCert) {
                this.servCert = servCert;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    public static class DRMCertInfoListList extends TeaModel {
        @NameInMap("CertInfo")
        private java.util.List < CertInfo> certInfo;

        private DRMCertInfoListList(Builder builder) {
            this.certInfo = builder.certInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DRMCertInfoListList create() {
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

            public DRMCertInfoListList build() {
                return new DRMCertInfoListList(this);
            } 

        } 

    }
}
