// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCACertificatesResponseBody</p>
 */
public class DescribeCACertificatesResponseBody extends TeaModel {
    @NameInMap("CACertificates")
    private CACertificates CACertificates;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCACertificatesResponseBody(Builder builder) {
        this.CACertificates = builder.CACertificates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCACertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return CACertificates
     */
    public CACertificates getCACertificates() {
        return this.CACertificates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CACertificates CACertificates; 
        private String requestId; 

        /**
         * CACertificates.
         */
        public Builder CACertificates(CACertificates CACertificates) {
            this.CACertificates = CACertificates;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCACertificatesResponseBody build() {
            return new DescribeCACertificatesResponseBody(this);
        } 

    } 

    public static class CACertificate extends TeaModel {
        @NameInMap("CACertificateId")
        private String CACertificateId;

        @NameInMap("CACertificateName")
        private String CACertificateName;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ExpireTimeStamp")
        private Long expireTimeStamp;

        @NameInMap("Fingerprint")
        private String fingerprint;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private CACertificate(Builder builder) {
            this.CACertificateId = builder.CACertificateId;
            this.CACertificateName = builder.CACertificateName;
            this.commonName = builder.commonName;
            this.createTime = builder.createTime;
            this.createTimeStamp = builder.createTimeStamp;
            this.expireTime = builder.expireTime;
            this.expireTimeStamp = builder.expireTimeStamp;
            this.fingerprint = builder.fingerprint;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CACertificate create() {
            return builder().build();
        }

        /**
         * @return CACertificateId
         */
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        /**
         * @return CACertificateName
         */
        public String getCACertificateName() {
            return this.CACertificateName;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeStamp
         */
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expireTimeStamp
         */
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String CACertificateId; 
            private String CACertificateName; 
            private String commonName; 
            private String createTime; 
            private Long createTimeStamp; 
            private String expireTime; 
            private Long expireTimeStamp; 
            private String fingerprint; 
            private String regionId; 
            private String resourceGroupId; 

            /**
             * CACertificateId.
             */
            public Builder CACertificateId(String CACertificateId) {
                this.CACertificateId = CACertificateId;
                return this;
            }

            /**
             * CACertificateName.
             */
            public Builder CACertificateName(String CACertificateName) {
                this.CACertificateName = CACertificateName;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimeStamp.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ExpireTimeStamp.
             */
            public Builder expireTimeStamp(Long expireTimeStamp) {
                this.expireTimeStamp = expireTimeStamp;
                return this;
            }

            /**
             * Fingerprint.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public CACertificate build() {
                return new CACertificate(this);
            } 

        } 

    }
    public static class CACertificates extends TeaModel {
        @NameInMap("CACertificate")
        private java.util.List < CACertificate> CACertificate;

        private CACertificates(Builder builder) {
            this.CACertificate = builder.CACertificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CACertificates create() {
            return builder().build();
        }

        /**
         * @return CACertificate
         */
        public java.util.List < CACertificate> getCACertificate() {
            return this.CACertificate;
        }

        public static final class Builder {
            private java.util.List < CACertificate> CACertificate; 

            /**
             * CACertificate.
             */
            public Builder CACertificate(java.util.List < CACertificate> CACertificate) {
                this.CACertificate = CACertificate;
                return this;
            }

            public CACertificates build() {
                return new CACertificates(this);
            } 

        } 

    }
}
