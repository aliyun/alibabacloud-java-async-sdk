// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocResponseBody</p>
 */
public class DescribeDocResponseBody extends TeaModel {
    @NameInMap("DocId")
    private String docId;

    @NameInMap("FailReason")
    private String failReason;

    @NameInMap("Name")
    private String name;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Size")
    private String size;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("Type")
    private String type;

    @NameInMap("UploadTime")
    private String uploadTime;

    private DescribeDocResponseBody(Builder builder) {
        this.docId = builder.docId;
        this.failReason = builder.failReason;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.status = builder.status;
        this.tags = builder.tags;
        this.type = builder.type;
        this.uploadTime = builder.uploadTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocResponseBody create() {
        return builder().build();
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return failReason
     */
    public String getFailReason() {
        return this.failReason;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uploadTime
     */
    public String getUploadTime() {
        return this.uploadTime;
    }

    public static final class Builder {
        private String docId; 
        private String failReason; 
        private String name; 
        private String ownerId; 
        private String requestId; 
        private String size; 
        private String status; 
        private java.util.List < Tags> tags; 
        private String type; 
        private String uploadTime; 

        /**
         * DocId.
         */
        public Builder docId(String docId) {
            this.docId = docId;
            return this;
        }

        /**
         * FailReason.
         */
        public Builder failReason(String failReason) {
            this.failReason = failReason;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
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
         * Size.
         */
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UploadTime.
         */
        public Builder uploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        public DescribeDocResponseBody build() {
            return new DescribeDocResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagId")
        private String tagId;

        @NameInMap("TagName")
        private String tagName;

        private Tags(Builder builder) {
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String tagId; 
            private String tagName; 

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
