// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketsResponseBody</p>
 */
public class ListBucketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketInfos")
    private java.util.List < BucketInfos> bucketInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The list of bucket information.
         */
        public Builder bucketInfos(java.util.List < BucketInfos> bucketInfos) {
            this.bucketInfos = bucketInfos;
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
         * The total number of buckets that match the conditions.
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
        @com.aliyun.core.annotation.NameInMap("BucketAcl")
        private String bucketAcl;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("LogicalBucketType")
        private String logicalBucketType;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        private BucketInfos(Builder builder) {
            this.bucketAcl = builder.bucketAcl;
            this.bucketName = builder.bucketName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.ensRegionId = builder.ensRegionId;
            this.logicalBucketType = builder.logicalBucketType;
            this.modifyTime = builder.modifyTime;
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
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return logicalBucketType
         */
        public String getLogicalBucketType() {
            return this.logicalBucketType;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        public static final class Builder {
            private String bucketAcl; 
            private String bucketName; 
            private String comment; 
            private String createTime; 
            private String ensRegionId; 
            private String logicalBucketType; 
            private String modifyTime; 

            /**
             * The access control list (ACL) of the bucket.
             */
            public Builder bucketAcl(String bucketAcl) {
                this.bucketAcl = bucketAcl;
                return this;
            }

            /**
             * The name of the bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the bucket was created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the region where the node is located.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * Single-node storage. Set the value to sink.
             */
            public Builder logicalBucketType(String logicalBucketType) {
                this.logicalBucketType = logicalBucketType;
                return this;
            }

            /**
             * The time when the bucket was modified. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            public BucketInfos build() {
                return new BucketInfos(this);
            } 

        } 

    }
}
