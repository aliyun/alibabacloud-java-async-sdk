// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyPairsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeyPairsResponseBody</p>
 */
public class DescribeKeyPairsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairs")
    private KeyPairs keyPairs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeKeyPairsResponseBody(Builder builder) {
        this.keyPairs = builder.keyPairs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyPairsResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyPairs
     */
    public KeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private KeyPairs keyPairs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information of the key pairs.
         */
        public Builder keyPairs(KeyPairs keyPairs) {
            this.keyPairs = keyPairs;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of key pairs.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeKeyPairsResponseBody build() {
            return new DescribeKeyPairsResponseBody(this);
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
             * The tag key of the key pair.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the key pair.
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
    public static class KeyPair extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("KeyPairFingerPrint")
        private String keyPairFingerPrint;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private KeyPair(Builder builder) {
            this.creationTime = builder.creationTime;
            this.keyPairFingerPrint = builder.keyPairFingerPrint;
            this.keyPairName = builder.keyPairName;
            this.publicKey = builder.publicKey;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPair create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return keyPairFingerPrint
         */
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
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
            private String creationTime; 
            private String keyPairFingerPrint; 
            private String keyPairName; 
            private String publicKey; 
            private String resourceGroupId; 
            private Tags tags; 

            /**
             * The time when the key pair was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The fingerprint of the key pair.
             */
            public Builder keyPairFingerPrint(String keyPairFingerPrint) {
                this.keyPairFingerPrint = keyPairFingerPrint;
                return this;
            }

            /**
             * The name of the key pair.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * The content of the public key.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
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
             * The tags of the key pair.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public KeyPair build() {
                return new KeyPair(this);
            } 

        } 

    }
    public static class KeyPairs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyPair")
        private java.util.List < KeyPair> keyPair;

        private KeyPairs(Builder builder) {
            this.keyPair = builder.keyPair;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPairs create() {
            return builder().build();
        }

        /**
         * @return keyPair
         */
        public java.util.List < KeyPair> getKeyPair() {
            return this.keyPair;
        }

        public static final class Builder {
            private java.util.List < KeyPair> keyPair; 

            /**
             * KeyPair.
             */
            public Builder keyPair(java.util.List < KeyPair> keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            public KeyPairs build() {
                return new KeyPairs(this);
            } 

        } 

    }
}
