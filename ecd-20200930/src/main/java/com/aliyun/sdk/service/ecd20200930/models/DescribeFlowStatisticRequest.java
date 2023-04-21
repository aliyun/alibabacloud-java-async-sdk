// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowStatisticRequest</p>
 */
public class DescribeFlowStatisticRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 500)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500)
    private Integer pageSize;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeFlowStatisticRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.period = builder.period;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFlowStatisticRequest, Builder> {
        private String desktopId; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer period; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowStatisticRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.period = request.period;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud desktop.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The number of the page to return.\
         * <p>
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The interval to query the traffic data. Unit: seconds. Valid values:
         * <p>
         * 
         * *   3600
         * *   10800
         * *   86400
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFlowStatisticRequest build() {
            return new DescribeFlowStatisticRequest(this);
        } 

    } 

}
