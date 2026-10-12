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
 * {@link ListWorkspaceRolesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkspaceRolesRequest</p>
 */
public class ListWorkspaceRolesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private String roleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerboseFields")
    private String verboseFields;

    private ListWorkspaceRolesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.roleIds = builder.roleIds;
        this.roleName = builder.roleName;
        this.roleType = builder.roleType;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.verboseFields = builder.verboseFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspaceRolesRequest create() {
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
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return roleIds
     */
    public String getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return verboseFields
     */
    public String getVerboseFields() {
        return this.verboseFields;
    }

    public static final class Builder extends Request.Builder<ListWorkspaceRolesRequest, Builder> {
        private String workspaceId; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String roleIds; 
        private String roleName; 
        private String roleType; 
        private String sortBy; 
        private String status; 
        private String verboseFields; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkspaceRolesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.roleIds = request.roleIds;
            this.roleName = request.roleName;
            this.roleType = request.roleType;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.verboseFields = request.verboseFields;
        } 

        /**
         * <p>The workspace ID. Call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to get it.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The sort order for the specified sort field. Valid values:</p>
         * <ul>
         * <li><p><code>ASC</code> (default): Ascending order.</p>
         * </li>
         * <li><p><code>DESC</code>: Descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. The default value is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>A comma-separated list of role IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>role-dhg*******</p>
         */
        public Builder roleIds(String roleIds) {
            this.putQueryParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-test</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The role type.</p>
         * <ul>
         * <li><code>custom</code>: A custom role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The sort field for paginated queries. Valid values:</p>
         * <ul>
         * <li><p><code>GmtCreateTime</code> (default): Sorts by creation time.</p>
         * </li>
         * <li><p><code>GmtModifiedTime</code>: Sorts by modification time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p><code>Creating</code></p>
         * </li>
         * <li><p><code>Updating</code></p>
         * </li>
         * <li><p><code>Deleting</code></p>
         * </li>
         * <li><p><code>Succeeded</code>: A terminal state.</p>
         * </li>
         * <li><p><code>Failed</code>: A terminal state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>A comma-separated list of fields to return. Currently, only <code>ModulePermissions</code> is supported, which returns the permission configuration of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>ModulePermissions</p>
         */
        public Builder verboseFields(String verboseFields) {
            this.putQueryParameter("VerboseFields", verboseFields);
            this.verboseFields = verboseFields;
            return this;
        }

        @Override
        public ListWorkspaceRolesRequest build() {
            return new ListWorkspaceRolesRequest(this);
        } 

    } 

}
