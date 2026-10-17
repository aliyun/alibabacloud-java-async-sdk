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
 * {@link AddImageRequest} extends {@link RequestModel}
 *
 * <p>AddImageRequest</p>
 */
public class AddImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private AddImageRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.imageUri = builder.imageUri;
        this.labels = builder.labels;
        this.name = builder.name;
        this.size = builder.size;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageRequest create() {
        return builder().build();
    }

@Override
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return size
     */
    public Long getSize() {
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

    public static final class Builder extends Request.Builder<AddImageRequest, Builder> {
        private String accessibility; 
        private String description; 
        private String imageId; 
        private String imageUri; 
        private java.util.List<Labels> labels; 
        private String name; 
        private Long size; 
        private String sourceId; 
        private String sourceType; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AddImageRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.description = request.description;
            this.imageId = request.imageId;
            this.imageUri = request.imageUri;
            this.labels = request.labels;
            this.name = request.name;
            this.size = request.size;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the image. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members in the current workspace can manage the image.</li>
         * <li>PRIVATE: Only the creator can manage the image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>NLP model compression training image</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the image. If you do not specify this parameter, the system automatically generates an image ID.
         * The format is image- followed by 18 uppercase or lowercase letters or digits.</p>
         * 
         * <strong>example:</strong>
         * <p>image-k83*****cv</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The URI of the image. The URI can be duplicated. For more information about how to view the image URI, see <a href="https://help.aliyun.com/document_detail/449118.html">ListImage</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/pai-compression/nlp:gpu</p>
         */
        public Builder imageUri(String imageUri) {
            this.putBodyParameter("ImageUri", imageUri);
            this.imageUri = imageUri;
            return this;
        }

        /**
         * <p>The labels of the image. This parameter is an array, and each item in the array contains the key and value fields.
         * Official images have the following label: system.official=true.
         * The following keys are supported:</p>
         * <ul>
         * <li>system.chipType</li>
         * <li>system.dsw.cudaVersion</li>
         * <li>system.dsw.fromImageId</li>
         * <li>system.dsw.fromInstanceId</li>
         * <li>system.dsw.id</li>
         * <li>system.dsw.os</li>
         * <li>system.dsw.osVersion</li>
         * <li>system.dsw.resourceType</li>
         * <li>system.dsw.rootImageId</li>
         * <li>system.dsw.stage</li>
         * <li>system.dsw.tag</li>
         * <li>system.dsw.type</li>
         * <li>system.framework</li>
         * <li>system.origin</li>
         * <li>system.pythonVersion</li>
         * <li>system.source</li>
         * <li>system.supported.dlc</li>
         * <li>system.supported.dsw</li>
         * </ul>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The name of the image. The naming rules are as follows:</p>
         * <ul>
         * <li>The name must be 1 to 50 characters in length.</li>
         * <li>The name can contain lowercase letters, digits, and hyphens (-), and must start with a letter.</li>
         * <li>The name must be unique within the same workspace.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nlp-compression</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The size of the image. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder size(Long size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The source ID of the image. If the source type of the image is Build, the source ID is the image build ID.</p>
         * 
         * <strong>example:</strong>
         * <p>build-****ks92</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type of the image. Valid values:</p>
         * <ul>
         * <li>Import: The image is imported.</li>
         * <li>Build: The image is built.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Build</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The user ID (UID) of the image creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1611******3000</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the image belongs. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>15******45</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AddImageRequest build() {
            return new AddImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddImageRequest} extends {@link TeaModel}
     *
     * <p>AddImageRequest</p>
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
             * <p>The key of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>system.chipType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the label.</p>
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
