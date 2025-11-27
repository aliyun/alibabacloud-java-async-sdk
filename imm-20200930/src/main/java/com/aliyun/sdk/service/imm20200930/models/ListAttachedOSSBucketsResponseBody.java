// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ListAttachedOSSBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAttachedOSSBucketsResponseBody</p>
 */
public class ListAttachedOSSBucketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachedOSSBuckets")
    private java.util.List<AttachedOSSBuckets> attachedOSSBuckets;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAttachedOSSBucketsResponseBody(Builder builder) {
        this.attachedOSSBuckets = builder.attachedOSSBuckets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttachedOSSBucketsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachedOSSBuckets
     */
    public java.util.List<AttachedOSSBuckets> getAttachedOSSBuckets() {
        return this.attachedOSSBuckets;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AttachedOSSBuckets> attachedOSSBuckets; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAttachedOSSBucketsResponseBody model) {
            this.attachedOSSBuckets = model.attachedOSSBuckets;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of bound OSS Buckets.</p>
         */
        public Builder attachedOSSBuckets(java.util.List<AttachedOSSBuckets> attachedOSSBuckets) {
            this.attachedOSSBuckets = attachedOSSBuckets;
            return this;
        }

        /**
         * <p>Pagination token. When the total number of tasks in the list exceeds the set MaxResults, this token is used for pagination. This parameter has a value only when not all matching task lists are returned.</p>
         * <p>Use this value as NextToken in the next call to return the subsequent task list.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9847E7D0-A9A3-0053-84C6-BA16FF******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAttachedOSSBucketsResponseBody build() {
            return new ListAttachedOSSBucketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAttachedOSSBucketsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAttachedOSSBucketsResponseBody</p>
     */
    public static class AttachedOSSBuckets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OSSBucket")
        private String OSSBucket;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private AttachedOSSBuckets(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.OSSBucket = builder.OSSBucket;
            this.ownerId = builder.ownerId;
            this.projectName = builder.projectName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedOSSBuckets create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String OSSBucket; 
            private String ownerId; 
            private String projectName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(AttachedOSSBuckets model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.OSSBucket = model.OSSBucket;
                this.ownerId = model.ownerId;
                this.projectName = model.projectName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Timestamp of the project creation time, formatted as RFC3339Nano.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-29T14:50:13.011643661+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>test bucket</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>OSS Bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket</p>
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1023***********</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Project name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Timestamp of the project modification time, formatted as RFC3339Nano.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-29T14:50:13.011643661+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AttachedOSSBuckets build() {
                return new AttachedOSSBuckets(this);
            } 

        } 

    }
}
