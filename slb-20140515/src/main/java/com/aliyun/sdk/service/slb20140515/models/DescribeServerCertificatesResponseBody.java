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
 * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerCertificatesResponseBody</p>
 */
public class DescribeServerCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerCertificates")
    private ServerCertificates serverCertificates;

    private DescribeServerCertificatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serverCertificates = builder.serverCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverCertificates
     */
    public ServerCertificates getServerCertificates() {
        return this.serverCertificates;
    }

    public static final class Builder {
        private String requestId; 
        private ServerCertificates serverCertificates; 

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

        /**
         * <p>The server certificates.</p>
         */
        public Builder serverCertificates(ServerCertificates serverCertificates) {
            this.serverCertificates = serverCertificates;
            return this;
        }

        public DescribeServerCertificatesResponseBody build() {
            return new DescribeServerCertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerCertificatesResponseBody</p>
     */
    public static class SubjectAlternativeNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeName")
        private java.util.List<String> subjectAlternativeName;

        private SubjectAlternativeNames(Builder builder) {
            this.subjectAlternativeName = builder.subjectAlternativeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectAlternativeNames create() {
            return builder().build();
        }

        /**
         * @return subjectAlternativeName
         */
        public java.util.List<String> getSubjectAlternativeName() {
            return this.subjectAlternativeName;
        }

        public static final class Builder {
            private java.util.List<String> subjectAlternativeName; 

            /**
             * SubjectAlternativeName.
             */
            public Builder subjectAlternativeName(java.util.List<String> subjectAlternativeName) {
                this.subjectAlternativeName = subjectAlternativeName;
                return this;
            }

            public SubjectAlternativeNames build() {
                return new SubjectAlternativeNames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerCertificatesResponseBody</p>
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
             * <p>The tag keys of the resource.</p>
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
     * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerCertificatesResponseBody</p>
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
     * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerCertificatesResponseBody</p>
     */
    public static class ServerCertificate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliCloudCertificateId")
        private String aliCloudCertificateId;

        @com.aliyun.core.annotation.NameInMap("AliCloudCertificateName")
        private String aliCloudCertificateName;

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

        @com.aliyun.core.annotation.NameInMap("IsAliCloudCertificate")
        private Integer isAliCloudCertificate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
        private String serverCertificateId;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateName")
        private String serverCertificateName;

        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
        private SubjectAlternativeNames subjectAlternativeNames;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private ServerCertificate(Builder builder) {
            this.aliCloudCertificateId = builder.aliCloudCertificateId;
            this.aliCloudCertificateName = builder.aliCloudCertificateName;
            this.commonName = builder.commonName;
            this.createTime = builder.createTime;
            this.createTimeStamp = builder.createTimeStamp;
            this.expireTime = builder.expireTime;
            this.expireTimeStamp = builder.expireTimeStamp;
            this.fingerprint = builder.fingerprint;
            this.isAliCloudCertificate = builder.isAliCloudCertificate;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serverCertificateId = builder.serverCertificateId;
            this.serverCertificateName = builder.serverCertificateName;
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerCertificate create() {
            return builder().build();
        }

        /**
         * @return aliCloudCertificateId
         */
        public String getAliCloudCertificateId() {
            return this.aliCloudCertificateId;
        }

        /**
         * @return aliCloudCertificateName
         */
        public String getAliCloudCertificateName() {
            return this.aliCloudCertificateName;
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
         * @return isAliCloudCertificate
         */
        public Integer getIsAliCloudCertificate() {
            return this.isAliCloudCertificate;
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
         * @return serverCertificateId
         */
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        /**
         * @return serverCertificateName
         */
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }

        /**
         * @return subjectAlternativeNames
         */
        public SubjectAlternativeNames getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String aliCloudCertificateId; 
            private String aliCloudCertificateName; 
            private String commonName; 
            private String createTime; 
            private Long createTimeStamp; 
            private String expireTime; 
            private Long expireTimeStamp; 
            private String fingerprint; 
            private Integer isAliCloudCertificate; 
            private String regionId; 
            private String resourceGroupId; 
            private String serverCertificateId; 
            private String serverCertificateName; 
            private SubjectAlternativeNames subjectAlternativeNames; 
            private Tags tags; 

            /**
             * <p>The ID of the server certificate from Alibaba Cloud Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>7309********_15d97e7709a_71445759hr_789289731</p>
             */
            public Builder aliCloudCertificateId(String aliCloudCertificateId) {
                this.aliCloudCertificateId = aliCloudCertificateId;
                return this;
            }

            /**
             * <p>The name of the server certificate from Alibaba Cloud Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>testcertkey</p>
             */
            public Builder aliCloudCertificateName(String aliCloudCertificateName) {
                this.aliCloudCertificateName = aliCloudCertificateName;
                return this;
            }

            /**
             * <p>The domain name of the server certificate. The domain name is specified in the <code>CommonName</code> field.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The time when the server certificate was uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-31T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp when the server certificate was uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>1504147745000</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>The time when the server certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-26T23:59:59Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The timestamp when the server certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>15041477450</p>
             */
            public Builder expireTimeStamp(Long expireTimeStamp) {
                this.expireTimeStamp = expireTimeStamp;
                return this;
            }

            /**
             * <p>The fingerprint of the server certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>68:08:1a:f8:2c:97:69:a3:a1:e6:16:41:4b:ca:4f:5d:ee:a5:ef:0d</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>Indicates whether the server certificate is from Alibaba Cloud Certificate Management Service. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isAliCloudCertificate(Integer isAliCloudCertificate) {
                this.isAliCloudCertificate = isAliCloudCertificate;
                return this;
            }

            /**
             * <p>The region ID of the server certificate.</p>
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
             * <p>The server certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123157********_166f8204689_1714763408_709981430-cn-east-hangzhou-02</p>
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            /**
             * <p>The name of the server certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>slb</p>
             */
            public Builder serverCertificateName(String serverCertificateName) {
                this.serverCertificateName = serverCertificateName;
                return this;
            }

            /**
             * <p>The alternative domain names of the server certificate. The alternative domain names are specified in the Subject Alternative Name field of the server certificate.</p>
             */
            public Builder subjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ServerCertificate build() {
                return new ServerCertificate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerCertificatesResponseBody</p>
     */
    public static class ServerCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerCertificate")
        private java.util.List<ServerCertificate> serverCertificate;

        private ServerCertificates(Builder builder) {
            this.serverCertificate = builder.serverCertificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerCertificates create() {
            return builder().build();
        }

        /**
         * @return serverCertificate
         */
        public java.util.List<ServerCertificate> getServerCertificate() {
            return this.serverCertificate;
        }

        public static final class Builder {
            private java.util.List<ServerCertificate> serverCertificate; 

            /**
             * ServerCertificate.
             */
            public Builder serverCertificate(java.util.List<ServerCertificate> serverCertificate) {
                this.serverCertificate = serverCertificate;
                return this;
            }

            public ServerCertificates build() {
                return new ServerCertificates(this);
            } 

        } 

    }
}
