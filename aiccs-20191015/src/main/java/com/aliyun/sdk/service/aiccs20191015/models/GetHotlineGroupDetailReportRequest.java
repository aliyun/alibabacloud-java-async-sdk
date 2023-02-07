// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineGroupDetailReportRequest} extends {@link RequestModel}
 *
 * <p>GetHotlineGroupDetailReportRequest</p>
 */
public class GetHotlineGroupDetailReportRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(maximum = 1000, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("DepIds")
    private java.util.List < Long > depIds;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true, minimum = 1)
    private Long endDate;

    @Query
    @NameInMap("GroupIds")
    private java.util.List < Long > groupIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true, minimum = 1)
    private Long startDate;

    private GetHotlineGroupDetailReportRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.groupIds = builder.groupIds;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineGroupDetailReportRequest create() {
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

    public static final class Builder extends Request.Builder<GetHotlineGroupDetailReportRequest, Builder> {
        private Integer currentPage; 
        private java.util.List < Long > depIds; 
        private Long endDate; 
        private java.util.List < Long > groupIds; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetHotlineGroupDetailReportRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.endDate = request.endDate;
            this.groupIds = request.groupIds;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
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
        public Builder depIds(java.util.List < Long > depIds) {
            this.putQueryParameter("DepIds", depIds);
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
         * GroupIds.
         */
        public Builder groupIds(java.util.List < Long > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
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

        @Override
        public GetHotlineGroupDetailReportRequest build() {
            return new GetHotlineGroupDetailReportRequest(this);
        } 

    } 

}
