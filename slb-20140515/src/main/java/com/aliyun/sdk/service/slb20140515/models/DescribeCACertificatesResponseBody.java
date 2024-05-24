// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCACertificatesResponseBody</p>
 */
public class DescribeCACertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CACertificates")
    private CACertificates CACertificates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The information about the CA certificate.
         */
        public Builder CACertificates(CACertificates CACertificates) {
            this.CACertificates = CACertificates;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCACertificatesResponseBody build() {
            return new DescribeCACertificatesResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class CACertificate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CACertificateId")
        private String CACertificateId;

        @com.aliyun.core.annotation.NameInMap("CACertificateName")
        private String CACertificateName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTimeStamp")
        private Long expireTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

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
            this.tags = builder.tags;
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

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private Tags tags; 

            /**
             * The CA certificate ID.
             */
            public Builder CACertificateId(String CACertificateId) {
                this.CACertificateId = CACertificateId;
                return this;
            }

            /**
             * The CA certificate name.
             */
            public Builder CACertificateName(String CACertificateName) {
                this.CACertificateName = CACertificateName;
                return this;
            }

            /**
             * The domain name of the CA certificate.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The time when the CA certificate was created. The time is in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp when the CA certificate was created. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * The time when the CA certificate expires. The time is in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The timestamp that indicates when the CA certificate expires. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder expireTimeStamp(Long expireTimeStamp) {
                this.expireTimeStamp = expireTimeStamp;
                return this;
            }

            /**
             * The fingerprint of the CA certificate.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * The region of the CA certificate.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public CACertificate build() {
                return new CACertificate(this);
            } 

        } 

    }
    public static class CACertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CACertificate")
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
