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
 * {@link ListExperimentRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentRequest</p>
 */
public class ListExperimentRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Options")
    private Options options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageToken")
    private Long pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListExperimentRequest(Builder builder) {
        super(builder);
        this.labels = builder.labels;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.options = builder.options;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.sortBy = builder.sortBy;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return options
     */
    public Options getOptions() {
        return this.options;
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

    public static final class Builder extends Request.Builder<ListExperimentRequest, Builder> {
        private String labels; 
        private Long maxResults; 
        private String name; 
        private Options options; 
        private String order; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long pageToken; 
        private String sortBy; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentRequest request) {
            super(request);
            this.labels = request.labels;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.options = request.options;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pageToken = request.pageToken;
            this.sortBy = request.sortBy;
            this.verbose = request.verbose;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The tag filter conditions. Multiple conditions are separated by commas (,). The format of a single condition filter is <code>key=value</code>.</p>
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
         * <p>The experiment name.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The optional parameters.</p>
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "Options", "json");
            this.putQueryParameter("Options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * <p>The order of specific fields of results in a paged query (ascending or descending).</p>
         * <ul>
         * <li>ASC: ascending order</li>
         * <li>DESC: descending order. This is the default value.</li>
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
         * <p>The strings used for sorting. The following fields can be used for sorting: GmtCreateTime, Name, GmtModifiedTime, and ExperimentId. The sorting order can be ASC (default) and DESC.</p>
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
         * <p>The page number. The value starts from 1.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The field used for sorting. The GmtCreateTime field is used.</p>
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
         * <p>Specifies whether to obtain the LatestRun value that is related to the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the experiment belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <blockquote>
         * <p> If you do not specify a workspace ID, the system returns the experiments in the default workspace.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>151739</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListExperimentRequest build() {
            return new ListExperimentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentRequest} extends {@link TeaModel}
     *
     * <p>ListExperimentRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match_name_exactly")
        private String matchNameExactly;

        private Options(Builder builder) {
            this.matchNameExactly = builder.matchNameExactly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return matchNameExactly
         */
        public String getMatchNameExactly() {
            return this.matchNameExactly;
        }

        public static final class Builder {
            private String matchNameExactly; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.matchNameExactly = model.matchNameExactly;
            } 

            /**
             * <p>Specifies whether to exactly match the experiment by name. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder matchNameExactly(String matchNameExactly) {
                this.matchNameExactly = matchNameExactly;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
