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
 * {@link DeleteWorkspaceResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceResourceRequest</p>
 */
public class DeleteWorkspaceResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Option")
    private String option;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DeleteWorkspaceResourceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.groupName = builder.groupName;
        this.labels = builder.labels;
        this.option = builder.option;
        this.productType = builder.productType;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceResourceRequest create() {
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
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
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
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DeleteWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String groupName; 
        private String labels; 
        private String option; 
        private String productType; 
        private String resourceIds; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceResourceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.groupName = request.groupName;
            this.labels = request.labels;
            this.option = request.option;
            this.productType = request.productType;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
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
         * <p>The name of the resource group. You can call <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a> to obtain the name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The tags. Multiple tags are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>system.supported.eas=true</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The operation to perform. Valid values:</p>
         * <ul>
         * <li>DetachAndDelete: disassociates a resource from a workspace and deletes the resource in the workspace. This is the default value.</li>
         * <li>Detach: disassociates a resource group from a workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DetachAndDelete</p>
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>**This field is no longer used and will be removed. Use the ResourceType field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>DLC</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The resource IDs. Multiple resource IDs are separated by commas (,). The GroupName values for the specified resources must be the same. You cannot leave both GroupName and ResourceIds empty. You can specify both parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource-dks<strong><strong><strong>jkf,Resource-adf</strong></strong></strong>dss</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>ECS</li>
         * <li>Lingjun</li>
         * <li>ACS</li>
         * <li>FLINK</li>
         * <li>MaxCompute (This resource type is valid only if Option is set to Detach.)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DLC</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DeleteWorkspaceResourceRequest build() {
            return new DeleteWorkspaceResourceRequest(this);
        } 

    } 

}
