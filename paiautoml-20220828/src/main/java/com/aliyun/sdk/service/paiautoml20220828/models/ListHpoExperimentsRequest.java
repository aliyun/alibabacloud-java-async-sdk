// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoExperimentsRequest} extends {@link RequestModel}
 *
 * <p>ListHpoExperimentsRequest</p>
 */
public class ListHpoExperimentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeConfigData")
    private String includeConfigData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCreateTime")
    private String maxCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinCreateTime")
    private String minCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListHpoExperimentsRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.creator = builder.creator;
        this.includeConfigData = builder.includeConfigData;
        this.maxCreateTime = builder.maxCreateTime;
        this.minCreateTime = builder.minCreateTime;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoExperimentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return includeConfigData
     */
    public String getIncludeConfigData() {
        return this.includeConfigData;
    }

    /**
     * @return maxCreateTime
     */
    public String getMaxCreateTime() {
        return this.maxCreateTime;
    }

    /**
     * @return minCreateTime
     */
    public String getMinCreateTime() {
        return this.minCreateTime;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListHpoExperimentsRequest, Builder> {
        private String accessibility; 
        private String creator; 
        private String includeConfigData; 
        private String maxCreateTime; 
        private String minCreateTime; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String status; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListHpoExperimentsRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.creator = request.creator;
            this.includeConfigData = request.includeConfigData;
            this.maxCreateTime = request.maxCreateTime;
            this.minCreateTime = request.minCreateTime;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * The accessibility of the experiments to be listed.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Who created the expriment.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * Return experiment detailed configuration or not.
         */
        public Builder includeConfigData(String includeConfigData) {
            this.putQueryParameter("IncludeConfigData", includeConfigData);
            this.includeConfigData = includeConfigData;
            return this;
        }

        /**
         * The maximum create time of the experiment.
         */
        public Builder maxCreateTime(String maxCreateTime) {
            this.putQueryParameter("MaxCreateTime", maxCreateTime);
            this.maxCreateTime = maxCreateTime;
            return this;
        }

        /**
         * The minimum create time of the experiment.
         */
        public Builder minCreateTime(String minCreateTime) {
            this.putQueryParameter("MinCreateTime", minCreateTime);
            this.minCreateTime = minCreateTime;
            return this;
        }

        /**
         * Experiment name filter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ASC, DESC.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Record number on each page
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The returned experiments to be sorted by this column.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Experiment status to be listed.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The AI workspace ID the experiments belongs to.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListHpoExperimentsRequest build() {
            return new ListHpoExperimentsRequest(this);
        } 

    } 

}
