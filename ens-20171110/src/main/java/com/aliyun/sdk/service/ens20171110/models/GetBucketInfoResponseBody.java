// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketInfoResponseBody</p>
 */
public class GetBucketInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketInfo")
    private BucketInfo bucketInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The list of bucket information.
         */
        public Builder bucketInfo(BucketInfo bucketInfo) {
            this.bucketInfo = bucketInfo;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("BucketAcl")
        private String bucketAcl;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LogicalBucketType")
        private String logicalBucketType;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        private BucketInfo(Builder builder) {
            this.bucketAcl = builder.bucketAcl;
            this.bucketName = builder.bucketName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.logicalBucketType = builder.logicalBucketType;
            this.modifyTime = builder.modifyTime;
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
            private String logicalBucketType; 
            private String modifyTime; 

            /**
             * The ACL of the bucket.
             * <p>
             * 
             * *   **public-read-write**
             * *   **public-read**
             * *   **private** (default)
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
             * The time when the bucket was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * The time when the bucket was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            public BucketInfo build() {
                return new BucketInfo(this);
            } 

        } 

    }
}
