// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketInfoResponseBody</p>
 */
public class GetBucketInfoResponseBody extends TeaModel {
    @NameInMap("BucketInfo")
    private BucketInfo bucketInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetBucketInfoResponseBody(Builder builder) {
        this.bucketInfo = builder.bucketInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketInfo
     */
    public BucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BucketInfo bucketInfo; 
        private String requestId; 

        /**
         * BucketInfo.
         */
        public Builder bucketInfo(BucketInfo bucketInfo) {
            this.bucketInfo = bucketInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBucketInfoResponseBody build() {
            return new GetBucketInfoResponseBody(this);
        } 

    } 

    public static class BucketInfo extends TeaModel {
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

        private BucketInfo(Builder builder) {
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

        public static BucketInfo create() {
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

            public BucketInfo build() {
                return new BucketInfo(this);
            } 

        } 

    }
}
