// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceResourceRequest</p>
 */
public class UpdateWorkspaceResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    private java.util.Map < String, ? > spec;

    private UpdateWorkspaceResourceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.groupName = builder.groupName;
        this.isDefault = builder.isDefault;
        this.labels = builder.labels;
        this.productType = builder.productType;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return spec
     */
    public java.util.Map < String, ? > getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String groupName; 
        private Boolean isDefault; 
        private java.util.List < Labels> labels; 
        private String productType; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 
        private java.util.Map < String, ? > spec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceResourceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.groupName = request.groupName;
            this.isDefault = request.isDefault;
            this.labels = request.labels;
            this.productType = request.productType;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.spec = request.spec;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.putBodyParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putBodyParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(java.util.Map < String, ? > spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public UpdateWorkspaceResourceRequest build() {
            return new UpdateWorkspaceResourceRequest(this);
        } 

    } 

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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
