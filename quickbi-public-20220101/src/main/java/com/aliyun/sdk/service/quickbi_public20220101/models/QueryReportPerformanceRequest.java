// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryReportPerformanceRequest} extends {@link RequestModel}
 *
 * <p>QueryReportPerformanceRequest</p>
 */
public class QueryReportPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostTimeAvgMin")
    private Integer costTimeAvgMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The average duration (minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder costTimeAvgMin(Integer costTimeAvgMin) {
            this.putQueryParameter("CostTimeAvgMin", costTimeAvgMin);
            this.costTimeAvgMin = costTimeAvgMin;
            return this;
        }

        /**
         * <p>Current page number for organization member list:</p>
         * <ul>
         * <li>Pages start from page 1.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of rows per page in a paged query.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * <li>Maximum value: 1,000.</li>
         * </ul>
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
         * <p>The query type. Valid values:</p>
         * <ul>
         * <li><strong>lastDay</strong>: Yesterday</li>
         * <li><strong>sevenDays</strong>: Within seven days</li>
         * <li><strong>thirtyDays</strong>: Within 30 days</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sevenDays</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The ID of the security report.</p>
         * 
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The resource types.</p>
         * 
         * <strong>example:</strong>
         * <p>report</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
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
