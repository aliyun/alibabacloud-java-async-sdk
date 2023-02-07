// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetAgentStatisticsRequest</p>
 */
public class GetAgentStatisticsRequest extends Request {
    @Query
    @NameInMap("AgentIds")
    private java.util.List < Long > agentIds;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DepIds")
    private java.util.List < Long > depIds;

    @Query
    @NameInMap("EndDate")
    private Long endDate;

    @Query
    @NameInMap("ExistAgentGrouping")
    private Boolean existAgentGrouping;

    @Query
    @NameInMap("ExistDepartmentGrouping")
    private Boolean existDepartmentGrouping;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    private Long startDate;

    @Query
    @NameInMap("TimeLatitudeType")
    private String timeLatitudeType;

    private GetAgentStatisticsRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.existAgentGrouping = builder.existAgentGrouping;
        this.existDepartmentGrouping = builder.existDepartmentGrouping;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.timeLatitudeType = builder.timeLatitudeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIds
     */
    public java.util.List < Long > getAgentIds() {
        return this.agentIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return depIds
     */
    public java.util.List < Long > getDepIds() {
        return this.depIds;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return existAgentGrouping
     */
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    /**
     * @return existDepartmentGrouping
     */
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return timeLatitudeType
     */
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

    public static final class Builder extends Request.Builder<GetAgentStatisticsRequest, Builder> {
        private java.util.List < Long > agentIds; 
        private Integer currentPage; 
        private java.util.List < Long > depIds; 
        private Long endDate; 
        private Boolean existAgentGrouping; 
        private Boolean existDepartmentGrouping; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 
        private String timeLatitudeType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentStatisticsRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.endDate = request.endDate;
            this.existAgentGrouping = request.existAgentGrouping;
            this.existDepartmentGrouping = request.existDepartmentGrouping;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.timeLatitudeType = request.timeLatitudeType;
        } 

        /**
         * 坐席id列表
         */
        public Builder agentIds(java.util.List < Long > agentIds) {
            String agentIdsShrink = shrink(agentIds, "AgentIds", "simple");
            this.putQueryParameter("AgentIds", agentIdsShrink);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * 当前页（默认为1）
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 部门id列表
         */
        public Builder depIds(java.util.List < Long > depIds) {
            String depIdsShrink = shrink(depIds, "DepIds", "simple");
            this.putQueryParameter("DepIds", depIdsShrink);
            this.depIds = depIds;
            return this;
        }

        /**
         * 结束日期时间戳（毫秒）
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * 是否根据坐席分组
         */
        public Builder existAgentGrouping(Boolean existAgentGrouping) {
            this.putQueryParameter("ExistAgentGrouping", existAgentGrouping);
            this.existAgentGrouping = existAgentGrouping;
            return this;
        }

        /**
         * 是否根据部门分组
         */
        public Builder existDepartmentGrouping(Boolean existDepartmentGrouping) {
            this.putQueryParameter("ExistDepartmentGrouping", existDepartmentGrouping);
            this.existDepartmentGrouping = existDepartmentGrouping;
            return this;
        }

        /**
         * AICCS实例ID，在智能联络中心控制台上可以看到
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 每页大小（默认为10)
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 开始日期时间戳（毫秒）
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * 时间纬度类型
         */
        public Builder timeLatitudeType(String timeLatitudeType) {
            this.putQueryParameter("TimeLatitudeType", timeLatitudeType);
            this.timeLatitudeType = timeLatitudeType;
            return this;
        }

        @Override
        public GetAgentStatisticsRequest build() {
            return new GetAgentStatisticsRequest(this);
        } 

    } 

}
