// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketsResponseBody</p>
 */
public class ListBucketsResponseBody extends TeaModel {
    @NameInMap("BucketInfos")
    private java.util.List < BucketInfos> bucketInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListBucketsResponseBody(Builder builder) {
        this.bucketInfos = builder.bucketInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketInfos
     */
    public java.util.List < BucketInfos> getBucketInfos() {
        return this.bucketInfos;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < BucketInfos> bucketInfos; 
        private String requestId; 
        private Long totalCount; 

        /**
         * BucketInfos.
         */
        public Builder bucketInfos(java.util.List < BucketInfos> bucketInfos) {
            this.bucketInfos = bucketInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBucketsResponseBody build() {
            return new ListBucketsResponseBody(this);
        } 

    } 

    public static class BucketInfos extends TeaModel {
        @NameInMap("BucketAcl")
        private String bucketAcl;

        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataRedundancyType")
        private String dataRedundancyType;

        @NameInMap("DispatcherType")
        private String dispatcherType;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("StorageClass")
        private String storageClass;

        private BucketInfos(Builder builder) {
            this.bucketAcl = builder.bucketAcl;
            this.bucketName = builder.bucketName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.dataRedundancyType = builder.dataRedundancyType;
            this.dispatcherType = builder.dispatcherType;
            this.endpoint = builder.endpoint;
            this.modifyTime = builder.modifyTime;
            this.resourceType = builder.resourceType;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketInfos create() {
            return builder().build();
        }

        /**
         * @return bucketAcl
         */
        public String getBucketAcl() {
            return this.bucketAcl;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataRedundancyType
         */
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        /**
         * @return dispatcherType
         */
        public String getDispatcherType() {
            return this.dispatcherType;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String bucketAcl; 
            private String bucketName; 
            private String comment; 
            private String createTime; 
            private String dataRedundancyType; 
            private String dispatcherType; 
            private String endpoint; 
            private String modifyTime; 
            private String resourceType; 
            private String storageClass; 

            /**
             * BucketAcl.
             */
            public Builder bucketAcl(String bucketAcl) {
                this.bucketAcl = bucketAcl;
                return this;
            }

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
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
             * DataRedundancyType.
             */
            public Builder dataRedundancyType(String dataRedundancyType) {
                this.dataRedundancyType = dataRedundancyType;
                return this;
            }

            /**
             * DispatcherType.
             */
            public Builder dispatcherType(String dispatcherType) {
                this.dispatcherType = dispatcherType;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public BucketInfos build() {
                return new BucketInfos(this);
            } 

        } 

    }
}
