// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of server certificates.
         */
        public Builder serverCertificates(ServerCertificates serverCertificates) {
            this.serverCertificates = serverCertificates;
            return this;
        }

        public DescribeServerCertificatesResponseBody build() {
            return new DescribeServerCertificatesResponseBody(this);
        } 

    } 

    public static class SubjectAlternativeNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeName")
        private java.util.List < String > subjectAlternativeName;

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
        public java.util.List < String > getSubjectAlternativeName() {
            return this.subjectAlternativeName;
        }

        public static final class Builder {
            private java.util.List < String > subjectAlternativeName; 

            /**
             * SubjectAlternativeName.
             */
            public Builder subjectAlternativeName(java.util.List < String > subjectAlternativeName) {
                this.subjectAlternativeName = subjectAlternativeName;
                return this;
            }

            public SubjectAlternativeNames build() {
                return new SubjectAlternativeNames(this);
            } 

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
             * The tag keys of the resource.
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
             * The ID of the server certificate from Alibaba Cloud Certificate Management Service.
             */
            public Builder aliCloudCertificateId(String aliCloudCertificateId) {
                this.aliCloudCertificateId = aliCloudCertificateId;
                return this;
            }

            /**
             * The name of the server certificate from Alibaba Cloud Certificate Management Service.
             */
            public Builder aliCloudCertificateName(String aliCloudCertificateName) {
                this.aliCloudCertificateName = aliCloudCertificateName;
                return this;
            }

            /**
             * The domain name of the certificate. The domain name is specified in the `CommonName` field.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The time when the server certificate is uploaded.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp generated when the server certificate is uploaded.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The timestamp that indicates when the certificate expires.
             */
            public Builder expireTimeStamp(Long expireTimeStamp) {
                this.expireTimeStamp = expireTimeStamp;
                return this;
            }

            /**
             * The fingerprint of the server certificate.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * Indicates whether the server certificate is from Alibaba Cloud Certificate Management Service. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder isAliCloudCertificate(Integer isAliCloudCertificate) {
                this.isAliCloudCertificate = isAliCloudCertificate;
                return this;
            }

            /**
             * The ID of the region where the server certificate is created.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the server certificate.
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            /**
             * The name of the server certificate.
             */
            public Builder serverCertificateName(String serverCertificateName) {
                this.serverCertificateName = serverCertificateName;
                return this;
            }

            /**
             * The list of alternative domain names of the server certificate. The alternative domain names are specified in the `Subject Alternative Name` field of the server certificate.
             */
            public Builder subjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            /**
             * The tags.
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
    public static class ServerCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerCertificate")
        private java.util.List < ServerCertificate> serverCertificate;

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
        public java.util.List < ServerCertificate> getServerCertificate() {
            return this.serverCertificate;
        }

        public static final class Builder {
            private java.util.List < ServerCertificate> serverCertificate; 

            /**
             * ServerCertificate.
             */
            public Builder serverCertificate(java.util.List < ServerCertificate> serverCertificate) {
                this.serverCertificate = serverCertificate;
                return this;
            }

            public ServerCertificates build() {
                return new ServerCertificates(this);
            } 

        } 

    }
}
