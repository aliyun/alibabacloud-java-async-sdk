// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link ListDeploymentsRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentsRequest</p>
 */
public class ListDeploymentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentStatus")
    private String deploymentStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

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
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSnapshotId")
    private String resourceSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDeploymentsRequest(Builder builder) {
        super(builder);
        this.creator = builder.creator;
        this.deploymentId = builder.deploymentId;
        this.deploymentStatus = builder.deploymentStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.operationType = builder.operationType;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceId = builder.resourceId;
        this.resourceSnapshotId = builder.resourceSnapshotId;
        this.resourceType = builder.resourceType;
        this.serviceName = builder.serviceName;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return deploymentStatus
     */
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceSnapshotId
     */
    public String getResourceSnapshotId() {
        return this.resourceSnapshotId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDeploymentsRequest, Builder> {
        private String creator; 
        private String deploymentId; 
        private String deploymentStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String operationType; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceId; 
        private String resourceSnapshotId; 
        private String resourceType; 
        private String serviceName; 
        private String sortBy; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentsRequest request) {
            super(request);
            this.creator = request.creator;
            this.deploymentId = request.deploymentId;
            this.deploymentStatus = request.deploymentStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.operationType = request.operationType;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceId = request.resourceId;
            this.resourceSnapshotId = request.resourceSnapshotId;
            this.resourceType = request.resourceType;
            this.serviceName = request.serviceName;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2680******4103</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>Deployment job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dploy-asdf******1234</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.putQueryParameter("DeploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * <p>The deployment job status. To query multiple statuses simultaneously, separate them with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating,Running</p>
         */
        public Builder deploymentStatus(String deploymentStatus) {
            this.putQueryParameter("DeploymentStatus", deploymentStatus);
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * <p>Maximum number of records allowed to be returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Pagination cursor used to retrieve the next page of results.  </p>
         * <ul>
         * <li>Leave empty for the first request.  </li>
         * <li>For subsequent requests, pass the NextToken value returned in the previous response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The operation type. Valid values:  </p>
         * <ul>
         * <li>Create: Create a service.  </li>
         * <li>Update: Update an existing service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>Sorting order.  </p>
         * <ul>
         * <li>ASC: ascending.  </li>
         * <li>DESC: descending.</li>
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
         * <p>The page number of the current page in a paged query.</p>
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
         * <p>Number of items displayed per page. Default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The resource ID to be deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-asdf******123</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The snapshot ID of the resource to be deployed. If this parameter is provided, the system deploys directly based on this snapshot. If it is not provided, the system first creates a new snapshot for the resource and then executes the deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>snap-asfg******123</p>
         */
        public Builder resourceSnapshotId(String resourceSnapshotId) {
            this.putQueryParameter("ResourceSnapshotId", resourceSnapshotId);
            this.resourceSnapshotId = resourceSnapshotId;
            return this;
        }

        /**
         * <p>The resource type to be deployed. Valid values:  </p>
         * <ul>
         * <li>Flow: A project of the pipeline pattern  </li>
         * <li>Code: A project of the Code pattern</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Flow</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The service name. Fuzzy search by service name is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>myservice01</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>Field used for sorting in paged queries. The default field is GmtCreateTime. Valid values are as follows:  </p>
         * <ul>
         * <li>GmtCreateTime (default): sort by creation time.  </li>
         * <li>GmtModifiedTime: sort by updated time.</li>
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
         * <p>Workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>478***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDeploymentsRequest build() {
            return new ListDeploymentsRequest(this);
        } 

    } 

}
