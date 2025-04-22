// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetImageResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageResponseBody</p>
 */
public class GetImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("ImageUri")
    private String imageUri;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentUserId")
    private String parentUserId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetImageResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.imageUri = builder.imageUri;
        this.labels = builder.labels;
        this.name = builder.name;
        this.parentUserId = builder.parentUserId;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentUserId
     */
    public String getParentUserId() {
        return this.parentUserId;
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
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String imageUri; 
        private java.util.List<Labels> labels; 
        private String name; 
        private String parentUserId; 
        private String requestId; 
        private Integer size; 
        private String sourceId; 
        private String sourceType; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetImageResponseBody model) {
            this.accessibility = model.accessibility;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.imageUri = model.imageUri;
            this.labels = model.labels;
            this.name = model.name;
            this.parentUserId = model.parentUserId;
            this.requestId = model.requestId;
            this.size = model.size;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The accessibility of the image. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members can access the workspace.</li>
         * <li>PRIVATE: Only the creator can access the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The image description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the image is created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the image is modified, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The image address, which contains the version number.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.******ession/nlp:gpu</p>
         */
        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        /**
         * <p>The image tags, which are of the array data type. Each element in the array contains a key-value pair. The key of official tags is system.official and the tag value is true.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>nlp-compression</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>15577******8921</p>
         */
        public Builder parentUserId(String parentUserId) {
            this.parentUserId = parentUserId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The size of the image. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * <p>镜像来源 ID</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>镜像来源类型</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The user ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>15577******8921</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15945</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>system.chipType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>GPU</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
