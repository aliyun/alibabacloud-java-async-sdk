// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListDRMCertInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListDRMCertInfoResponseBody</p>
 */
public class ListDRMCertInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DRMCertInfoList")
    private java.util.List<DRMCertInfoList> DRMCertInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDRMCertInfoResponseBody(Builder builder) {
        this.DRMCertInfoList = builder.DRMCertInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDRMCertInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DRMCertInfoList
     */
    public java.util.List<DRMCertInfoList> getDRMCertInfoList() {
        return this.DRMCertInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DRMCertInfoList> DRMCertInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDRMCertInfoResponseBody model) {
            this.DRMCertInfoList = model.DRMCertInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * DRMCertInfoList.
         */
        public Builder DRMCertInfoList(java.util.List<DRMCertInfoList> DRMCertInfoList) {
            this.DRMCertInfoList = DRMCertInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDRMCertInfoResponseBody build() {
            return new ListDRMCertInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDRMCertInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListDRMCertInfoResponseBody</p>
     */
    public static class DRMCertInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ask")
        private String ask;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DRMType")
        private String DRMType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PassPhrase")
        private String passPhrase;

        @com.aliyun.core.annotation.NameInMap("PrivateKey")
        private String privateKey;

        @com.aliyun.core.annotation.NameInMap("ServCert")
        private String servCert;

        private DRMCertInfoList(Builder builder) {
            this.ask = builder.ask;
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.creationTime = builder.creationTime;
            this.DRMType = builder.DRMType;
            this.description = builder.description;
            this.passPhrase = builder.passPhrase;
            this.privateKey = builder.privateKey;
            this.servCert = builder.servCert;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DRMCertInfoList create() {
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DRMType
         */
        public String getDRMType() {
            return this.DRMType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return passPhrase
         */
        public String getPassPhrase() {
            return this.passPhrase;
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
            private String creationTime; 
            private String DRMType; 
            private String description; 
            private String passPhrase; 
            private String privateKey; 
            private String servCert; 

            private Builder() {
            } 

            private Builder(DRMCertInfoList model) {
                this.ask = model.ask;
                this.certId = model.certId;
                this.certName = model.certName;
                this.creationTime = model.creationTime;
                this.DRMType = model.DRMType;
                this.description = model.description;
                this.passPhrase = model.passPhrase;
                this.privateKey = model.privateKey;
                this.servCert = model.servCert;
            } 

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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DRMType.
             */
            public Builder DRMType(String DRMType) {
                this.DRMType = DRMType;
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
             * PassPhrase.
             */
            public Builder passPhrase(String passPhrase) {
                this.passPhrase = passPhrase;
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

            public DRMCertInfoList build() {
                return new DRMCertInfoList(this);
            } 

        } 

    }
}
