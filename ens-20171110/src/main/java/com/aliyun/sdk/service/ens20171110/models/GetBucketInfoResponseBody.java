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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetBucketInfoResponseBody model) {
            this.bucketInfo = model.bucketInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Bucket information list.</p>
         */
        public Builder bucketInfo(BucketInfo bucketInfo) {
            this.bucketInfo = bucketInfo;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5831388-2D4B-46F4-A96B-D4E6BD06E7521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBucketInfoResponseBody build() {
            return new GetBucketInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBucketInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBucketInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BucketInfo model) {
                this.bucketAcl = model.bucketAcl;
                this.bucketName = model.bucketName;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.logicalBucketType = model.logicalBucketType;
                this.modifyTime = model.modifyTime;
            } 

            /**
             * <p>Bucket access control list type:</p>
             * <ul>
             * <li><p><strong>public-read-write</strong>: public-read-write</p>
             * </li>
             * <li><p><strong>public-read</strong>: public-read</p>
             * </li>
             * <li><p><strong>private</strong>: private (default)</p>
             * </li>
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
             * <p>Bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>Comments.</p>
             * 
             * <strong>example:</strong>
             * <p>das</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Bucket creation time. Represented in ISO8601 standard, using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-12T05:45:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Single node storage. Value: sink.</p>
             * 
             * <strong>example:</strong>
             * <p>sink</p>
             */
            public Builder logicalBucketType(String logicalBucketType) {
                this.logicalBucketType = logicalBucketType;
                return this;
            }

            /**
             * <p>Bucket modification time. Represented in ISO8601 standard, using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-12T06:45:00Z</p>
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
