// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionApplyOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionApplyOrdersRequest</p>
 */
public class ListPermissionApplyOrdersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowStatus")
    private Integer flowStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeProjectName")
    private String maxComputeProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1, minimum = 1)
    private Integer orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
    private Integer queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Integer workspaceId;

    private ListPermissionApplyOrdersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.engineType = builder.engineType;
        this.flowStatus = builder.flowStatus;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private Long endTime; 
        private String engineType; 
        private Integer flowStatus; 
        private String maxComputeProjectName; 
        private Integer orderType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer queryType; 
        private Long startTime; 
        private String tableName; 
        private Integer workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionApplyOrdersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.engineType = request.engineType;
            this.flowStatus = request.flowStatus;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.startTime = request.startTime;
            this.tableName = request.tableName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system determines the value of this parameter based on the endpoint that is used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The end of the time range to query. You can query all the permissions request orders that have been submitted before the time. The parameter value is a UNIX timestamp. If you do not specify the parameter, all permission request orders that are submitted before the current time are queried.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the compute engine with which the permission request order is associated. The parameter value is odps and cannot be changed. This value indicates that you can request permissions only on fields of tables in the MaxCompute compute engine.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * The status of the permission request order. Valid values:
         * <p>
         * 
         * *   1: to be processed
         * *   2: approved and authorized
         * *   3: approved but authorization failed
         * *   4: rejected
         * 
         * Valid values:
         * 
         * *   0
         * *   1
         * *   2
         * *   3
         * *   4
         * *   5
         */
        public Builder flowStatus(Integer flowStatus) {
            this.putQueryParameter("FlowStatus", flowStatus);
            this.flowStatus = flowStatus;
            return this;
        }

        /**
         * The name of the MaxCompute project with which the permission request order is associated. If you do not specify the parameter, the permission request orders of all MaxCompute projects are returned.
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.
         */
        public Builder orderType(Integer orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query type of the permission request order. Valid values:
         * <p>
         * 
         * *   0: The permission request orders you submitted.
         * *   1: The permission request orders you approved.
         */
        public Builder queryType(Integer queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * The beginning of the time range to query. You can query all the permissions request orders that have been submitted after the time. The parameter value is a UNIX timestamp. If you do not specify the parameter, all permission request orders are queried.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the table with which the permission request order is associated. If you do not specify the parameter, the permission request orders of all tables are returned.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The ID of the DataWorks workspace that is associated with the permission request order. If you do not specify the parameter, the permission request orders of all workspaces are returned. You can go to the Workspace page in the DataWorks console to obtain the workspace ID.
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
