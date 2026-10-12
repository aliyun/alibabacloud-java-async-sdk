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
 * {@link ListResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesRequest</p>
 */
public class ListResourcesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductTypes")
    private String productTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaIds")
    private String quotaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerboseFields")
    private String verboseFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListResourcesRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.labels = builder.labels;
        this.option = builder.option;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productTypes = builder.productTypes;
        this.quotaIds = builder.quotaIds;
        this.resourceName = builder.resourceName;
        this.resourceTypes = builder.resourceTypes;
        this.verbose = builder.verbose;
        this.verboseFields = builder.verboseFields;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return productTypes
     */
    public String getProductTypes() {
        return this.productTypes;
    }

    /**
     * @return quotaIds
     */
    public String getQuotaIds() {
        return this.quotaIds;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return verboseFields
     */
    public String getVerboseFields() {
        return this.verboseFields;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListResourcesRequest, Builder> {
        private String groupName; 
        private String labels; 
        private String option; 
        private Long pageNumber; 
        private Integer pageSize; 
        private String productTypes; 
        private String quotaIds; 
        private String resourceName; 
        private String resourceTypes; 
        private Boolean verbose; 
        private String verboseFields; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.labels = request.labels;
            this.option = request.option;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productTypes = request.productTypes;
            this.quotaIds = request.quotaIds;
            this.resourceName = request.resourceName;
            this.resourceTypes = request.resourceTypes;
            this.verbose = request.verbose;
            this.verboseFields = request.verboseFields;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The name of the resource group. To get the resource group name, see <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a>.</p>
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
         * <p>A comma-separated list of labels. This operation returns only the resources that have all the specified labels.</p>
         * <p>This parameter is available only for resources whose <code>ResourceTypes</code> is set to <code>ACS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>system.supported.dsw=true,system.supported.dlc=true</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The option to query resources. Valid values:</p>
         * <ul>
         * <li><p><code>ListResourceByWorkspace</code> (Default): lists the resources in a workspace.</p>
         * </li>
         * <li><p><code>ListResource</code>: lists the resources of the current user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ListResourceByWorkspace</p>
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>The page number. The value must be greater than or equal to 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 20.</p>
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
         * <p><strong>Deprecated.</strong> This parameter is deprecated. Use the <code>ResourceType</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder productTypes(String productTypes) {
            this.putQueryParameter("ProductTypes", productTypes);
            this.productTypes = productTypes;
            return this;
        }

        /**
         * <p>A comma-separated list of quota IDs. This operation returns only the resources that are associated with all the specified quota IDs.</p>
         * <blockquote>
         * <p>This parameter is available only for resources whose <code>ResourceTypes</code> is set to <code>ACS</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>quota-k<strong><strong><strong>da,quota-cd</strong></strong></strong>w</p>
         */
        public Builder quotaIds(String quotaIds) {
            this.putQueryParameter("QuotaIds", quotaIds);
            this.quotaIds = quotaIds;
            return this;
        }

        /**
         * <p>The resource name. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>The name must be 3 to 28 characters in length.</p>
         * </li>
         * <li><p>The name must be unique within a region.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resource</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The resource types. Valid values:</p>
         * <ul>
         * <li><p><code>MaxCompute</code>: MaxCompute resources.</p>
         * </li>
         * <li><p><code>ECS</code>: ECS resources.</p>
         * </li>
         * <li><p><code>Lingjun</code>: Lingjun computing resources.</p>
         * </li>
         * <li><p><code>ACS</code>: ACS computing resources.</p>
         * </li>
         * <li><p><code>Flink</code>: Flink resources.</p>
         * </li>
         * <li><p><code>SelfManagedAckPro</code>: self-managed AckPro cluster resources.</p>
         * </li>
         * <li><p><code>SelfManagedAckLingjun</code>: self-managed AckLingjun cluster resources.</p>
         * </li>
         * <li><p><code>SelfManagedASI</code>: self-managed ASI cluster resources from a third-party cloud.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>Specifies whether to return detailed information. The detailed information includes the <code>Quotas</code> field. Valid values:</p>
         * <ul>
         * <li><p><code>true</code> (Default): returns detailed information.</p>
         * </li>
         * <li><p><code>false</code>: does not return detailed information.</p>
         * </li>
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
         * <p>A comma-separated list of fields that you want to return. Valid values:</p>
         * <ul>
         * <li><p><code>Quota</code></p>
         * </li>
         * <li><p><code>Label</code></p>
         * </li>
         * <li><p><code>IsDefault</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quota,IsDefault</p>
         */
        public Builder verboseFields(String verboseFields) {
            this.putQueryParameter("VerboseFields", verboseFields);
            this.verboseFields = verboseFields;
            return this;
        }

        /**
         * <p>The ID of the workspace. To get the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <ul>
         * <li><p>This parameter is required if <code>Option</code> is set to <code>ListResourceByWorkspace</code>.</p>
         * </li>
         * <li><p>This parameter is not required if <code>Option</code> is set to <code>ListResource</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListResourcesRequest build() {
            return new ListResourcesRequest(this);
        } 

    } 

}
