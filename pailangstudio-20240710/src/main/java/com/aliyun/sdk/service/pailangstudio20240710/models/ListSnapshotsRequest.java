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
 * {@link ListSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotsRequest</p>
 */
public class ListSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationType")
    private String creationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

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
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotResourceId")
    private String snapshotResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotResourceType")
    private String snapshotResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotStatus")
    private String snapshotStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListSnapshotsRequest(Builder builder) {
        super(builder);
        this.creationType = builder.creationType;
        this.creator = builder.creator;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.snapshotId = builder.snapshotId;
        this.snapshotResourceId = builder.snapshotResourceId;
        this.snapshotResourceType = builder.snapshotResourceType;
        this.snapshotStatus = builder.snapshotStatus;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationType
     */
    public String getCreationType() {
        return this.creationType;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return snapshotResourceId
     */
    public String getSnapshotResourceId() {
        return this.snapshotResourceId;
    }

    /**
     * @return snapshotResourceType
     */
    public String getSnapshotResourceType() {
        return this.snapshotResourceType;
    }

    /**
     * @return snapshotStatus
     */
    public String getSnapshotStatus() {
        return this.snapshotStatus;
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

    public static final class Builder extends Request.Builder<ListSnapshotsRequest, Builder> {
        private String creationType; 
        private String creator; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String snapshotId; 
        private String snapshotResourceId; 
        private String snapshotResourceType; 
        private String snapshotStatus; 
        private String sortBy; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotsRequest request) {
            super(request);
            this.creationType = request.creationType;
            this.creator = request.creator;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.snapshotId = request.snapshotId;
            this.snapshotResourceId = request.snapshotResourceId;
            this.snapshotResourceType = request.snapshotResourceType;
            this.snapshotStatus = request.snapshotStatus;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The creation type of the snapshot. To query multiple types at the same time, separate them with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>ManualCreated,DeploymentAutoCreated</p>
         */
        public Builder creationType(String creationType) {
            this.putQueryParameter("CreationType", creationType);
            this.creationType = creationType;
            return this;
        }

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2003******4844</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>The maximum number of records allowed to be returned in this request.</p>
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
         * <p>Pagination cursor used to retrieve results for the next page.</p>
         * <ul>
         * <li>Leave empty for the first request.</li>
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
         * <p>Sorting order.</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order.</li>
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
         * <p>Page number of the current page in paged query.</p>
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
         * <p>Snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>snap-asfg******123</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>Snapshot resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-asfg******1234</p>
         */
        public Builder snapshotResourceId(String snapshotResourceId) {
            this.putQueryParameter("SnapshotResourceId", snapshotResourceId);
            this.snapshotResourceId = snapshotResourceId;
            return this;
        }

        /**
         * <p>The snapshot resource type. Valid values:</p>
         * <ul>
         * <li>Flow: pipeline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Flow</p>
         */
        public Builder snapshotResourceType(String snapshotResourceType) {
            this.putQueryParameter("SnapshotResourceType", snapshotResourceType);
            this.snapshotResourceType = snapshotResourceType;
            return this;
        }

        /**
         * SnapshotStatus.
         */
        public Builder snapshotStatus(String snapshotStatus) {
            this.putQueryParameter("SnapshotStatus", snapshotStatus);
            this.snapshotStatus = snapshotStatus;
            return this;
        }

        /**
         * <p>Sorting field used in paged query. The default value is GmtCreateTime. Valid values:</p>
         * <ul>
         * <li>GmtCreateTime (default): sort by Creation Time.</li>
         * <li>GmtModifiedTime: sort by Updated At.</li>
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
         * <p>The workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListSnapshotsRequest build() {
            return new ListSnapshotsRequest(this);
        } 

    } 

}
