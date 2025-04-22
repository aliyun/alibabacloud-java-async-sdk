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
 * {@link ListRunsRequest} extends {@link RequestModel}
 *
 * <p>ListRunsRequest</p>
 */
public class ListRunsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageToken")
    private Long pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListRunsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.labels = builder.labels;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.sortBy = builder.sortBy;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public Long getPageToken() {
        return this.pageToken;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
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
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListRunsRequest, Builder> {
        private String experimentId; 
        private String gmtCreateTime; 
        private String labels; 
        private Long maxResults; 
        private String name; 
        private String order; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long pageToken; 
        private String sortBy; 
        private String sourceId; 
        private String sourceType; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListRunsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.gmtCreateTime = request.gmtCreateTime;
            this.labels = request.labels;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pageToken = request.pageToken;
            this.sortBy = request.sortBy;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.verbose = request.verbose;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the experiment that the run belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-1zpfthdx******</p>
         */
        public Builder experimentId(String experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.putQueryParameter("GmtCreateTime", gmtCreateTime);
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The label. Exact match is supported. Valid values:</p>
         * <ul>
         * <li>Single-label query: Set the value to is_evaluation.</li>
         * <li>Multi-label query (not recommended in non-special scenarios and may have performance issues): Set the value to is_evaluation:true,LLM_evaluation:true. Multiple labels are separated with commas (,), indicating that the key-value pairs of multiple labels must be matched at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>is_evaluation:true</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The maximum number of entries in the request. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The run name.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The order in which the entries are sorted by the specific field on the returned page. This parameter must be used together with SortBy.</p>
         * <ul>
         * <li>ASC</li>
         * <li>DESC (default)</li>
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
         * <p>The strings by which the results are sorted. The following parameters can be used to sort the results: GmtCreateTime and Name. The sorting order can be ASC (default) and DESC. Separate multiple strings with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime DESC,Name ASC</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number. The value must be greater than 0. Default value: 1.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pagination token, which starts from 0. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageToken(Long pageToken) {
            this.putQueryParameter("PageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * <p>The field used for sorting. Valid values:</p>
         * <ul>
         * <li>Name: the name of the run.</li>
         * <li>GmtCreateTime: the time when the run is created.</li>
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
         * <p>The ID of the workload associated with the run.</p>
         * 
         * <strong>example:</strong>
         * <p>job-rbvg5wzlj****</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The type of the workload associated with the run.</p>
         * 
         * <strong>example:</strong>
         * <p>TrainingService</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>Specifies whether to show detailed information, including Metrics, Params, and Labels. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
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
         * <p>The ID of the workspace to which the experiment belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <blockquote>
         * <p> If you do not specify a workspace ID, the system returns the runs of the default workspace.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22840</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListRunsRequest build() {
            return new ListRunsRequest(this);
        } 

    } 

}
