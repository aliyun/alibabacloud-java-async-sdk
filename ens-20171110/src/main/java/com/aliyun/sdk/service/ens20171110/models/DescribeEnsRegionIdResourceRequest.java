// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRegionIdResourceRequest</p>
 */
public class DescribeEnsRegionIdResourceRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("OrderByParams")
    private String orderByParams;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private String pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeEnsRegionIdResourceRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.isp = builder.isp;
        this.orderByParams = builder.orderByParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionIdResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return orderByParams
     */
    public String getOrderByParams() {
        return this.orderByParams;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEnsRegionIdResourceRequest, Builder> {
        private String endTime; 
        private String isp; 
        private String orderByParams; 
        private Integer pageNumber; 
        private String pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRegionIdResourceRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.isp = request.isp;
            this.orderByParams = request.orderByParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * The end time of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The Internet service provider (ISP). Valid values:
         * <p>
         * 
         * *   cmcc: China Mobile
         * *   telecom: China Telecom
         * *   unicom: China Unicom
         * *   multiCarrier: multi-line ISP
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The order in which the resources to return are sorted. Valid values:
         * <p>
         * 
         * *   InstanceCount: desc
         * *   Area: asc
         * *   InternetBandwidth: asc
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **100**. Default value: **10**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEnsRegionIdResourceRequest build() {
            return new DescribeEnsRegionIdResourceRequest(this);
        } 

    } 

}
