// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetSkillGroupServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetSkillGroupServiceStatusRequest</p>
 */
public class GetSkillGroupServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIds")
    private java.util.List<Long> agentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepIds")
    private java.util.List<Long> depIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistAgentGrouping")
    private Boolean existAgentGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistChannelInstanceGrouping")
    private Boolean existChannelInstanceGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistDepartmentGrouping")
    private Boolean existDepartmentGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistRobotInstanceGrouping")
    private Boolean existRobotInstanceGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistSkillGroupGrouping")
    private Boolean existSkillGroupGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<Long> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeLatitudeType")
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
    public java.util.List<Long> getAgentIds() {
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
    public java.util.List<Long> getDepIds() {
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
    public java.util.List<Long> getGroupIds() {
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
        private java.util.List<Long> agentIds; 
        private Integer currentPage; 
        private java.util.List<Long> depIds; 
        private Long endDate; 
        private Boolean existAgentGrouping; 
        private Boolean existChannelInstanceGrouping; 
        private Boolean existDepartmentGrouping; 
        private Boolean existRobotInstanceGrouping; 
        private Boolean existSkillGroupGrouping; 
        private java.util.List<Long> groupIds; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 
        private String timeLatitudeType; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillGroupServiceStatusRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.endDate = request.endDate;
            this.existAgentGrouping = request.existAgentGrouping;
            this.existChannelInstanceGrouping = request.existChannelInstanceGrouping;
            this.existDepartmentGrouping = request.existDepartmentGrouping;
            this.existRobotInstanceGrouping = request.existRobotInstanceGrouping;
            this.existSkillGroupGrouping = request.existSkillGroupGrouping;
            this.groupIds = request.groupIds;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.timeLatitudeType = request.timeLatitudeType;
        } 

        /**
         * AgentIds.
         */
        public Builder agentIds(java.util.List<Long> agentIds) {
            String agentIdsShrink = shrink(agentIds, "AgentIds", "simple");
            this.putQueryParameter("AgentIds", agentIdsShrink);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DepIds.
         */
        public Builder depIds(java.util.List<Long> depIds) {
            String depIdsShrink = shrink(depIds, "DepIds", "simple");
            this.putQueryParameter("DepIds", depIdsShrink);
            this.depIds = depIds;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ExistAgentGrouping.
         */
        public Builder existAgentGrouping(Boolean existAgentGrouping) {
            this.putQueryParameter("ExistAgentGrouping", existAgentGrouping);
            this.existAgentGrouping = existAgentGrouping;
            return this;
        }

        /**
         * ExistChannelInstanceGrouping.
         */
        public Builder existChannelInstanceGrouping(Boolean existChannelInstanceGrouping) {
            this.putQueryParameter("ExistChannelInstanceGrouping", existChannelInstanceGrouping);
            this.existChannelInstanceGrouping = existChannelInstanceGrouping;
            return this;
        }

        /**
         * ExistDepartmentGrouping.
         */
        public Builder existDepartmentGrouping(Boolean existDepartmentGrouping) {
            this.putQueryParameter("ExistDepartmentGrouping", existDepartmentGrouping);
            this.existDepartmentGrouping = existDepartmentGrouping;
            return this;
        }

        /**
         * ExistRobotInstanceGrouping.
         */
        public Builder existRobotInstanceGrouping(Boolean existRobotInstanceGrouping) {
            this.putQueryParameter("ExistRobotInstanceGrouping", existRobotInstanceGrouping);
            this.existRobotInstanceGrouping = existRobotInstanceGrouping;
            return this;
        }

        /**
         * ExistSkillGroupGrouping.
         */
        public Builder existSkillGroupGrouping(Boolean existSkillGroupGrouping) {
            this.putQueryParameter("ExistSkillGroupGrouping", existSkillGroupGrouping);
            this.existSkillGroupGrouping = existSkillGroupGrouping;
            return this;
        }

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List<Long> groupIds) {
            String groupIdsShrink = shrink(groupIds, "GroupIds", "simple");
            this.putQueryParameter("GroupIds", groupIdsShrink);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TimeLatitudeType.
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
