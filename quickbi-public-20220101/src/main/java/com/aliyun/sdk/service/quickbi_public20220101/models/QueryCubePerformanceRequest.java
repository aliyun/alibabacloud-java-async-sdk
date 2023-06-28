// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCubePerformanceRequest} extends {@link RequestModel}
 *
 * <p>QueryCubePerformanceRequest</p>
 */
public class QueryCubePerformanceRequest extends Request {
    @Query
    @NameInMap("CostTimeAvgMin")
    private Integer costTimeAvgMin;

    @Query
    @NameInMap("CubeId")
    private String cubeId;

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
    @NameInMap("WorkspaceId")
    @Validation(required = true)
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
         * CostTimeAvgMin.
         */
        public Builder costTimeAvgMin(Integer costTimeAvgMin) {
            this.putQueryParameter("CostTimeAvgMin", costTimeAvgMin);
            this.costTimeAvgMin = costTimeAvgMin;
            return this;
        }

        /**
         * CubeId.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
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
         * WorkspaceId.
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
