// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketsResponseBody</p>
 */
public class ListBucketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketInfos")
    private java.util.List<BucketInfos> bucketInfos;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketInfos
     */
    public java.util.List<BucketInfos> getBucketInfos() {
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
        private java.util.List<BucketInfos> bucketInfos; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListBucketsResponseBody model) {
            this.bucketInfos = model.bucketInfos;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of bucket information.</p>
         */
        public Builder bucketInfos(java.util.List<BucketInfos> bucketInfos) {
            this.bucketInfos = bucketInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>435769C7-AA6F-4DC5-B3DB-A3DC0DE7E853</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of buckets that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBucketsResponseBody build() {
            return new ListBucketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBucketsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBucketsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BucketInfos model) {
                this.bucketAcl = model.bucketAcl;
                this.bucketName = model.bucketName;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.ensRegionId = model.ensRegionId;
                this.logicalBucketType = model.logicalBucketType;
                this.modifyTime = model.modifyTime;
            } 

            /**
             * <p>The access control list (ACL) of the bucket.</p>
             * <ul>
             * <li><strong>public-read-write</strong></li>
             * <li><strong>public-read</strong></li>
             * <li><strong>private</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder bucketAcl(String bucketAcl) {
                this.bucketAcl = bucketAcl;
                return this;
            }

            /**
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>numb</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the bucket was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-12T05:45:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the region where the node is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-dalian-unicom</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The type of the single-node storage. Set the value to sink.</p>
             * 
             * <strong>example:</strong>
             * <p>sink</p>
             */
            public Builder logicalBucketType(String logicalBucketType) {
                this.logicalBucketType = logicalBucketType;
                return this;
            }

            /**
             * <p>The time when the bucket was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-12T06:45:00Z</p>
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
