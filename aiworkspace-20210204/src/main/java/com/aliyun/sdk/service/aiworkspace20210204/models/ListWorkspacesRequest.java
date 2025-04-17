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
 * {@link ListWorkspacesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkspacesRequest</p>
 */
public class ListWorkspacesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleList")
    private String moduleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Option")
    private String option;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceIds")
    private String workspaceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private ListWorkspacesRequest(Builder builder) {
        super(builder);
        this.fields = builder.fields;
        this.moduleList = builder.moduleList;
        this.option = builder.option;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.verbose = builder.verbose;
        this.workspaceIds = builder.workspaceIds;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return moduleList
     */
    public String getModuleList() {
        return this.moduleList;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<ListWorkspacesRequest, Builder> {
        private String fields; 
        private String moduleList; 
        private String option; 
        private String order; 
        private Long pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String sortBy; 
        private String status; 
        private Boolean verbose; 
        private String workspaceIds; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkspacesRequest request) {
            super(request);
            this.fields = request.fields;
            this.moduleList = request.moduleList;
            this.option = request.option;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.verbose = request.verbose;
            this.workspaceIds = request.workspaceIds;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>The list of returned fields of workspace details. Used to limit the fields in the returned results. Separate multiple fields with commas (,). Currently, only Id is supported, which is the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Id</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The modules, separated by commas (,). Default value: PAI.</p>
         * 
         * <strong>example:</strong>
         * <p>PAI</p>
         */
        public Builder moduleList(String moduleList) {
            this.putQueryParameter("ModuleList", moduleList);
            this.moduleList = moduleList;
            return this;
        }

        /**
         * <p>The query options. Valid values:</p>
         * <ul>
         * <li>GetWorkspaces (default): Obtains a list of Workspaces.</li>
         * <li>GetResourceLimits: Obtains a list of ResourceLimits.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GetWorkspaces</p>
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>The order of results (ascending or descending). Valid values:</p>
         * <ul>
         * <li>ASC: ascending order. This is the default value.</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number of the workspace list. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
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
         * <p>The resource group ID. To obtain the ID of a resource group, see <a href="https://help.aliyun.com/zh/resource-management/resource-group/user-guide/view-basic-information-of-a-resource-group?spm=a2c4g.11186623.help-menu-94362.d_2_0_1.86386c21FKqhTk&scm=20140722.H_151181._.OR_help-T_cn~zh-V_1">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwp7rky****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies how to sort the results. Default value: GmtCreateTime. Valid values:</p>
         * <ul>
         * <li>GmtCreateTime: Sort by the time when created.</li>
         * <li>GmtModifiedTime: Sort by the time when modified.</li>
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
         * <p>The workspace status. Valid values:</p>
         * <ul>
         * <li>ENABLED</li>
         * <li>INITIALIZING</li>
         * <li>FAILURE</li>
         * <li>DISABLED</li>
         * <li>FROZEN</li>
         * <li>UPDATING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Specifies whether to display workspace details. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * <p>The workspace IDs. Separate multiple IDs by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>123,234</p>
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public ListWorkspacesRequest build() {
            return new ListWorkspacesRequest(this);
        } 

    } 

}
