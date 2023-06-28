// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReportPerformanceRequest} extends {@link RequestModel}
 *
 * <p>QueryReportPerformanceRequest</p>
 */
public class QueryReportPerformanceRequest extends Request {
    @Query
    @NameInMap("CostTimeAvgMin")
    private Integer costTimeAvgMin;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryType")
    @Validation(required = true)
    private String queryType;

    @Query
    @NameInMap("ReportId")
    private String reportId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private QueryReportPerformanceRequest(Builder builder) {
        super(builder);
        this.costTimeAvgMin = builder.costTimeAvgMin;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.reportId = builder.reportId;
        this.resourceType = builder.resourceType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReportPerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costTimeAvgMin
     */
    public Integer getCostTimeAvgMin() {
        return this.costTimeAvgMin;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryReportPerformanceRequest, Builder> {
        private Integer costTimeAvgMin; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String queryType; 
        private String reportId; 
        private String resourceType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryReportPerformanceRequest request) {
            super(request);
            this.costTimeAvgMin = request.costTimeAvgMin;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.reportId = request.reportId;
            this.resourceType = request.resourceType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * CostTimeAvgMin.
         */
        public Builder costTimeAvgMin(Integer costTimeAvgMin) {
            this.putQueryParameter("CostTimeAvgMin", costTimeAvgMin);
            this.costTimeAvgMin = costTimeAvgMin;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryReportPerformanceRequest build() {
            return new QueryReportPerformanceRequest(this);
        } 

    } 

}
