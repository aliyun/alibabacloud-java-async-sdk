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
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    private java.util.Map<String, ?> spec;

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
    public java.util.List<Labels> getLabels() {
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
    public java.util.List<String> getResourceIds() {
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
    public java.util.Map<String, ?> getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String groupName; 
        private Boolean isDefault; 
        private java.util.List<Labels> labels; 
        private String productType; 
        private java.util.List<String> resourceIds; 
        private String resourceType; 
        private java.util.Map<String, ?> spec; 

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
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>group-kjds******sd</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Specifies whether the resource is the default resource. This parameter can only be set to true and cannot be set to false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putBodyParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The resource tags. If you specify multiple tags, only resources that meet all the specified tag-based filter conditions are returned.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>**This field is no longer used and will be removed. Use the ResourceType field.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The resource IDs.</p>
         * <p>You cannot leave both GroupName and ResourceIds empty. If you specify both the parameters, the value of GroupName of each resource ID in the dataset must be the same.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putBodyParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>MaxCompute</li>
         * <li>ECS</li>
         * <li>Lingjun</li>
         * <li>ACS</li>
         * <li>FLINK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The specification of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;clusterType&quot;: &quot;share&quot;
         * }</p>
         */
        public Builder spec(java.util.Map<String, ?> spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public UpdateWorkspaceResourceRequest build() {
            return new UpdateWorkspaceResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkspaceResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceResourceRequest</p>
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
             * <p>system.******</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
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
