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
 * {@link QueryCubePerformanceRequest} extends {@link RequestModel}
 *
 * <p>QueryCubePerformanceRequest</p>
 */
public class QueryCubePerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostTimeAvgMin")
    private Integer costTimeAvgMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    private String cubeId;

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
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private QueryCubePerformanceRequest(Builder builder) {
        super(builder);
        this.costTimeAvgMin = builder.costTimeAvgMin;
        this.cubeId = builder.cubeId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCubePerformanceRequest create() {
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
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryCubePerformanceRequest, Builder> {
        private Integer costTimeAvgMin; 
        private String cubeId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String queryType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCubePerformanceRequest request) {
            super(request);
            this.costTimeAvgMin = request.costTimeAvgMin;
            this.cubeId = request.cubeId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
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
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * <p>The current page number of the workspace member list:</p>
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
         * <p>100</p>
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
        public QueryCubePerformanceRequest build() {
            return new QueryCubePerformanceRequest(this);
        } 

    } 

}
