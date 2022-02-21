// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetSkillGroupServiceStatusRequest</p>
 */
public class GetSkillGroupServiceStatusRequest extends Request {
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
    @NameInMap("ExistChannelInstanceGrouping")
    private Boolean existChannelInstanceGrouping;

    @Query
    @NameInMap("ExistDepartmentGrouping")
    private Boolean existDepartmentGrouping;

    @Query
    @NameInMap("ExistRobotInstanceGrouping")
    private Boolean existRobotInstanceGrouping;

    @Query
    @NameInMap("ExistSkillGroupGrouping")
    private Boolean existSkillGroupGrouping;

    @Query
    @NameInMap("GroupIds")
    private java.util.List < Long > groupIds;

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

    private GetSkillGroupServiceStatusRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.existAgentGrouping = builder.existAgentGrouping;
        this.existChannelInstanceGrouping = builder.existChannelInstanceGrouping;
        this.existDepartmentGrouping = builder.existDepartmentGrouping;
        this.existRobotInstanceGrouping = builder.existRobotInstanceGrouping;
        this.existSkillGroupGrouping = builder.existSkillGroupGrouping;
        this.groupIds = builder.groupIds;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.timeLatitudeType = builder.timeLatitudeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillGroupServiceStatusRequest create() {
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
     * @return existChannelInstanceGrouping
     */
    public Boolean getExistChannelInstanceGrouping() {
        return this.existChannelInstanceGrouping;
    }

    /**
     * @return existDepartmentGrouping
     */
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    /**
     * @return existRobotInstanceGrouping
     */
    public Boolean getExistRobotInstanceGrouping() {
        return this.existRobotInstanceGrouping;
    }

    /**
     * @return existSkillGroupGrouping
     */
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    /**
     * @return groupIds
     */
    public java.util.List < Long > getGroupIds() {
        return this.groupIds;
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

    public static final class Builder extends Request.Builder<GetSkillGroupServiceStatusRequest, Builder> {
        private java.util.List < Long > agentIds; 
        private Integer currentPage; 
        private java.util.List < Long > depIds; 
        private Long endDate; 
        private Boolean existAgentGrouping; 
        private Boolean existChannelInstanceGrouping; 
        private Boolean existDepartmentGrouping; 
        private Boolean existRobotInstanceGrouping; 
        private Boolean existSkillGroupGrouping; 
        private java.util.List < Long > groupIds; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 
        private String timeLatitudeType; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillGroupServiceStatusRequest response) {
            super(response);
            this.agentIds = response.agentIds;
            this.currentPage = response.currentPage;
            this.depIds = response.depIds;
            this.endDate = response.endDate;
            this.existAgentGrouping = response.existAgentGrouping;
            this.existChannelInstanceGrouping = response.existChannelInstanceGrouping;
            this.existDepartmentGrouping = response.existDepartmentGrouping;
            this.existRobotInstanceGrouping = response.existRobotInstanceGrouping;
            this.existSkillGroupGrouping = response.existSkillGroupGrouping;
            this.groupIds = response.groupIds;
            this.instanceId = response.instanceId;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
            this.timeLatitudeType = response.timeLatitudeType;
        } 

        /**
         * 技能组id列表
         */
        public Builder agentIds(java.util.List < Long > agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
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
            this.putQueryParameter("DepIds", depIds);
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
         * 是否根据技能组分组
         */
        public Builder existAgentGrouping(Boolean existAgentGrouping) {
            this.putQueryParameter("ExistAgentGrouping", existAgentGrouping);
            this.existAgentGrouping = existAgentGrouping;
            return this;
        }

        /**
         * 是否根据渠道实例分组
         */
        public Builder existChannelInstanceGrouping(Boolean existChannelInstanceGrouping) {
            this.putQueryParameter("ExistChannelInstanceGrouping", existChannelInstanceGrouping);
            this.existChannelInstanceGrouping = existChannelInstanceGrouping;
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
         * 是否根据机器实例分组
         */
        public Builder existRobotInstanceGrouping(Boolean existRobotInstanceGrouping) {
            this.putQueryParameter("ExistRobotInstanceGrouping", existRobotInstanceGrouping);
            this.existRobotInstanceGrouping = existRobotInstanceGrouping;
            return this;
        }

        /**
         * 是否根据技能组分组
         */
        public Builder existSkillGroupGrouping(Boolean existSkillGroupGrouping) {
            this.putQueryParameter("ExistSkillGroupGrouping", existSkillGroupGrouping);
            this.existSkillGroupGrouping = existSkillGroupGrouping;
            return this;
        }

        /**
         * 技能组id列表
         */
        public Builder groupIds(java.util.List < Long > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
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
        public GetSkillGroupServiceStatusRequest build() {
            return new GetSkillGroupServiceStatusRequest(this);
        } 

    } 

}
