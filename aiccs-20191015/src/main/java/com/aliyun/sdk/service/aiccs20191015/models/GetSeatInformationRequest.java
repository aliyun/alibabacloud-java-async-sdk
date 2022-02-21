// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSeatInformationRequest} extends {@link RequestModel}
 *
 * <p>GetSeatInformationRequest</p>
 */
public class GetSeatInformationRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("currentPage")
    private Integer currentPage;

    @Query
    @NameInMap("depIds")
    private java.util.List < Long > depIds;

    @Query
    @NameInMap("endDate")
    private Long endDate;

    @Query
    @NameInMap("existDepartmentGrouping")
    private Boolean existDepartmentGrouping;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("startDate")
    private Long startDate;

    private GetSeatInformationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.existDepartmentGrouping = builder.existDepartmentGrouping;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSeatInformationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<GetSeatInformationRequest, Builder> {
        private String instanceId; 
        private Integer currentPage; 
        private java.util.List < Long > depIds; 
        private Long endDate; 
        private Boolean existDepartmentGrouping; 
        private Integer pageSize; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetSeatInformationRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.currentPage = response.currentPage;
            this.depIds = response.depIds;
            this.endDate = response.endDate;
            this.existDepartmentGrouping = response.existDepartmentGrouping;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
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
         * 当前页（默认为1）
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 部门id列表
         */
        public Builder depIds(java.util.List < Long > depIds) {
            this.putQueryParameter("depIds", depIds);
            this.depIds = depIds;
            return this;
        }

        /**
         * 结束日期时间戳（毫秒）
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * 是否根据部门分组
         */
        public Builder existDepartmentGrouping(Boolean existDepartmentGrouping) {
            this.putQueryParameter("existDepartmentGrouping", existDepartmentGrouping);
            this.existDepartmentGrouping = existDepartmentGrouping;
            return this;
        }

        /**
         * 每页大小（默认为10)
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 开始日期时间戳（毫秒）
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetSeatInformationRequest build() {
            return new GetSeatInformationRequest(this);
        } 

    } 

}
