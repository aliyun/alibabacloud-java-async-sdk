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
 * {@link GetPermissionRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionRequest</p>
 */
public class GetPermissionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PermissionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Option")
    private String option;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    private GetPermissionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.permissionCode = builder.permissionCode;
        this.accessibility = builder.accessibility;
        this.creator = builder.creator;
        this.labels = builder.labels;
        this.option = builder.option;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionRequest create() {
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
     * @return permissionCode
     */
    public String getPermissionCode() {
        return this.permissionCode;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    public static final class Builder extends Request.Builder<GetPermissionRequest, Builder> {
        private String workspaceId; 
        private String permissionCode; 
        private String accessibility; 
        private String creator; 
        private java.util.Map<String, ?> labels; 
        private String option; 
        private String resource; 

        private Builder() {
            super();
        } 

        private Builder(GetPermissionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.permissionCode = request.permissionCode;
            this.accessibility = request.accessibility;
            this.creator = request.creator;
            this.labels = request.labels;
            this.option = request.option;
            this.resource = request.resource;
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
         * <p>The permission name, which is unique in a region. For more information about permissions, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>. For more information about how to obtain the permission name, see <a href="https://help.aliyun.com/document_detail/449132.html">ListPermissions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiDLC:GetTensorboard</p>
         */
        public Builder permissionCode(String permissionCode) {
            this.putPathParameter("PermissionCode", permissionCode);
            this.permissionCode = permissionCode;
            return this;
        }

        /**
         * <p>The accessibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members in the workspace can access the workspace.</li>
         * <li>PRIVATE: Only the creator can access the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account that is used to create the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>17915******4216</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The configuration. Separate multiple configurations with commas (,). Valid values:</p>
         * <ul>
         * <li>ResourceEmpty: The Resource parameter is not configured.</li>
         * <li>DisableRam: The RAM check is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceEmpty,DisableRam</p>
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>The resource.</p>
         * 
         * <strong>example:</strong>
         * <p>job/dlc-ksd******s12</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        @Override
        public GetPermissionRequest build() {
            return new GetPermissionRequest(this);
        } 

    } 

}
