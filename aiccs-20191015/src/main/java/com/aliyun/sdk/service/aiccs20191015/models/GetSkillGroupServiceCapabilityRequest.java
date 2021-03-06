// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupServiceCapabilityRequest} extends {@link RequestModel}
 *
 * <p>GetSkillGroupServiceCapabilityRequest</p>
 */
public class GetSkillGroupServiceCapabilityRequest extends Request {
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

    private GetSkillGroupServiceCapabilityRequest(Builder builder) {
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

    public static GetSkillGroupServiceCapabilityRequest create() {
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

    public static final class Builder extends Request.Builder<GetSkillGroupServiceCapabilityRequest, Builder> {
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

        private Builder(GetSkillGroupServiceCapabilityRequest response) {
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
         * ?????????????????????1???
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ??????id??????
         */
        public Builder depIds(java.util.List < Long > depIds) {
            this.putQueryParameter("DepIds", depIds);
            this.depIds = depIds;
            return this;
        }

        /**
         * ?????????????????????????????????
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder existDepartmentGrouping(Boolean existDepartmentGrouping) {
            this.putQueryParameter("ExistDepartmentGrouping", existDepartmentGrouping);
            this.existDepartmentGrouping = existDepartmentGrouping;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder existSkillGroupGrouping(Boolean existSkillGroupGrouping) {
            this.putQueryParameter("ExistSkillGroupGrouping", existSkillGroupGrouping);
            this.existSkillGroupGrouping = existSkillGroupGrouping;
            return this;
        }

        /**
         * ?????????id??????
         */
        public Builder groupIds(java.util.List < Long > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * AICCS??????ID????????????????????????????????????????????????
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ????????????????????????10)
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ?????????????????????????????????
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetSkillGroupServiceCapabilityRequest build() {
            return new GetSkillGroupServiceCapabilityRequest(this);
        } 

    } 

}
