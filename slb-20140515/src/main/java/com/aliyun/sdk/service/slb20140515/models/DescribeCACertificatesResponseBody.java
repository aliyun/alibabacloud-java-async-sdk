// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
         * <p>The information about the CA certificate.</p>
         */
        public Builder CACertificates(CACertificates CACertificates) {
            this.CACertificates = CACertificates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCACertificatesResponseBody build() {
            return new DescribeCACertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCACertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCACertificatesResponseBody</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeCACertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCACertificatesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCACertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCACertificatesResponseBody</p>
     */
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
             * <p>The CA certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>139a00604bd-cn-east-hangzho****</p>
             */
            public Builder CACertificateId(String CACertificateId) {
                this.CACertificateId = CACertificateId;
                return this;
            }

            /**
             * <p>The CA certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder CACertificateName(String CACertificateName) {
                this.CACertificateName = CACertificateName;
                return this;
            }

            /**
             * <p>The domain name of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The time when the CA certificate was created. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-31T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp when the CA certificate was created. Unit: milliseconds.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1504147745000</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>The time when the CA certificate expires. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-21T06:04:25Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the CA certificate expires. Unit: milliseconds.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1732169065000</p>
             */
            public Builder expireTimeStamp(Long expireTimeStamp) {
                this.expireTimeStamp = expireTimeStamp;
                return this;
            }

            /**
             * <p>The fingerprint of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>79:43:fb:7d:a4:7f:44:32:61:16:57:17:e3:e8:b7:36:03:57:f6:89</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The region of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tag.</p>
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
    /**
     * 
     * {@link DescribeCACertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCACertificatesResponseBody</p>
     */
    public static class CACertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CACertificate")
        private java.util.List<CACertificate> CACertificate;

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
        public java.util.List<CACertificate> getCACertificate() {
            return this.CACertificate;
        }

        public static final class Builder {
            private java.util.List<CACertificate> CACertificate; 

            /**
             * CACertificate.
             */
            public Builder CACertificate(java.util.List<CACertificate> CACertificate) {
                this.CACertificate = CACertificate;
                return this;
            }

            public CACertificates build() {
                return new CACertificates(this);
            } 

        } 

    }
}
