// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupLatitudeStateRequest} extends {@link RequestModel}
 *
 * <p>GetSkillGroupLatitudeStateRequest</p>
 */
public class GetSkillGroupLatitudeStateRequest extends Request {
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
    @NameInMap("ExistDepartmentGrouping")
    private Boolean existDepartmentGrouping;

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

    private GetSkillGroupLatitudeStateRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.existDepartmentGrouping = builder.existDepartmentGrouping;
        this.existSkillGroupGrouping = builder.existSkillGroupGrouping;
        this.groupIds = builder.groupIds;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillGroupLatitudeStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return existDepartmentGrouping
     */
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
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

    public static final class Builder extends Request.Builder<GetSkillGroupLatitudeStateRequest, Builder> {
        private Integer currentPage; 
        private java.util.List < Long > depIds; 
        private Long endDate; 
        private Boolean existDepartmentGrouping; 
        private Boolean existSkillGroupGrouping; 
        private java.util.List < Long > groupIds; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillGroupLatitudeStateRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.depIds = response.depIds;
            this.endDate = response.endDate;
            this.existDepartmentGrouping = response.existDepartmentGrouping;
            this.existSkillGroupGrouping = response.existSkillGroupGrouping;
            this.groupIds = response.groupIds;
            this.instanceId = response.instanceId;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
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
         * 是否根据部门分组
         */
        public Builder existDepartmentGrouping(Boolean existDepartmentGrouping) {
            this.putQueryParameter("ExistDepartmentGrouping", existDepartmentGrouping);
            this.existDepartmentGrouping = existDepartmentGrouping;
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

        @Override
        public GetSkillGroupLatitudeStateRequest build() {
            return new GetSkillGroupLatitudeStateRequest(this);
        } 

    } 

}
