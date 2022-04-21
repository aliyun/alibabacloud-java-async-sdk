// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebHostingCertificateDetailResponseBody</p>
 */
public class GetWebHostingCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetWebHostingCertificateDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebHostingCertificateDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWebHostingCertificateDetailResponseBody build() {
            return new GetWebHostingCertificateDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CertDomainName")
        private String certDomainName;

        @NameInMap("CertExpiredTime")
        private Long certExpiredTime;

        @NameInMap("CertLife")
        private String certLife;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("ServerCertificateStatus")
        private String serverCertificateStatus;

        private Data(Builder builder) {
            this.certDomainName = builder.certDomainName;
            this.certExpiredTime = builder.certExpiredTime;
            this.certLife = builder.certLife;
            this.certName = builder.certName;
            this.certType = builder.certType;
            this.serverCertificateStatus = builder.serverCertificateStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certDomainName
         */
        public String getCertDomainName() {
            return this.certDomainName;
        }

        /**
         * @return certExpiredTime
         */
        public Long getCertExpiredTime() {
            return this.certExpiredTime;
        }

        /**
         * @return certLife
         */
        public String getCertLife() {
            return this.certLife;
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
         * @return serverCertificateStatus
         */
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public static final class Builder {
            private String certDomainName; 
            private Long certExpiredTime; 
            private String certLife; 
            private String certName; 
            private String certType; 
            private String serverCertificateStatus; 

            /**
             * CertDomainName.
             */
            public Builder certDomainName(String certDomainName) {
                this.certDomainName = certDomainName;
                return this;
            }

            /**
             * CertExpiredTime.
             */
            public Builder certExpiredTime(Long certExpiredTime) {
                this.certExpiredTime = certExpiredTime;
                return this;
            }

            /**
             * CertLife.
             */
            public Builder certLife(String certLife) {
                this.certLife = certLife;
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
             * CertType.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * ServerCertificateStatus.
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
