// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionApplyOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionApplyOrdersRequest</p>
 */
public class ListPermissionApplyOrdersRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("EngineType")
    @Validation(required = true)
    private String engineType;

    @Query
    @NameInMap("FlowStatus")
    private Integer flowStatus;

    @Query
    @NameInMap("MaxComputeProjectName")
    private String maxComputeProjectName;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true, maximum = 1, minimum = 1)
    private Integer orderType;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryType")
    @Validation(required = true, maximum = 1)
    private Integer queryType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("TableName")
    private String tableName;

    @Query
    @NameInMap("WorkspaceId")
    private Integer workspaceId;

    private ListPermissionApplyOrdersRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.engineType = builder.engineType;
        this.flowStatus = builder.flowStatus;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.tableName = builder.tableName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionApplyOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return flowStatus
     */
    public Integer getFlowStatus() {
        return this.flowStatus;
    }

    /**
     * @return maxComputeProjectName
     */
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    /**
     * @return orderType
     */
    public Integer getOrderType() {
        return this.orderType;
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
    public Integer getQueryType() {
        return this.queryType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return workspaceId
     */
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListPermissionApplyOrdersRequest, Builder> {
        private Long endTime; 
        private String engineType; 
        private Integer flowStatus; 
        private String maxComputeProjectName; 
        private Integer orderType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer queryType; 
        private String regionId; 
        private Long startTime; 
        private String tableName; 
        private Integer workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionApplyOrdersRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.engineType = request.engineType;
            this.flowStatus = request.flowStatus;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.tableName = request.tableName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * FlowStatus.
         */
        public Builder flowStatus(Integer flowStatus) {
            this.putQueryParameter("FlowStatus", flowStatus);
            this.flowStatus = flowStatus;
            return this;
        }

        /**
         * MaxComputeProjectName.
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(Integer orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
        public Builder queryType(Integer queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Integer workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListPermissionApplyOrdersRequest build() {
            return new ListPermissionApplyOrdersRequest(this);
        } 

    } 

}
