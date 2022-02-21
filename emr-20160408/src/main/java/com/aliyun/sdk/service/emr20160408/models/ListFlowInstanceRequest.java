// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListFlowInstanceRequest</p>
 */
public class ListFlowInstanceRequest extends Request {
    @Query
    @NameInMap("FlowId")
    private String flowId;

    @Query
    @NameInMap("FlowName")
    private String flowName;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NodeInstanceId")
    private String nodeInstanceId;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("Owner")
    private String owner;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Query
    @NameInMap("TimeRange")
    private String timeRange;

    private ListFlowInstanceRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.nodeInstanceId = builder.nodeInstanceId;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.statusList = builder.statusList;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeInstanceId
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<ListFlowInstanceRequest, Builder> {
        private String flowId; 
        private String flowName; 
        private String id; 
        private String instanceId; 
        private String nodeInstanceId; 
        private String orderBy; 
        private String orderType; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 
        private java.util.List < String > statusList; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowInstanceRequest response) {
            super(response);
            this.flowId = response.flowId;
            this.flowName = response.flowName;
            this.id = response.id;
            this.instanceId = response.instanceId;
            this.nodeInstanceId = response.nodeInstanceId;
            this.orderBy = response.orderBy;
            this.orderType = response.orderType;
            this.owner = response.owner;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.statusList = response.statusList;
            this.timeRange = response.timeRange;
        } 

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeInstanceId.
         */
        public Builder nodeInstanceId(String nodeInstanceId) {
            this.putQueryParameter("NodeInstanceId", nodeInstanceId);
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public ListFlowInstanceRequest build() {
            return new ListFlowInstanceRequest(this);
        } 

    } 

}
