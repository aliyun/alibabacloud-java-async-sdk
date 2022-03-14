// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedStatisticsDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedStatisticsDetailRequest</p>
 */
public class DescribeExposedStatisticsDetailRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StatisticsType")
    @Validation(required = true)
    private String statisticsType;

    @Query
    @NameInMap("StatisticsTypeGatewayType")
    private String statisticsTypeGatewayType;

    @Query
    @NameInMap("StatisticsTypeInstanceValue")
    private String statisticsTypeInstanceValue;

    private DescribeExposedStatisticsDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.statisticsType = builder.statisticsType;
        this.statisticsTypeGatewayType = builder.statisticsTypeGatewayType;
        this.statisticsTypeInstanceValue = builder.statisticsTypeInstanceValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedStatisticsDetailRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return statisticsType
     */
    public String getStatisticsType() {
        return this.statisticsType;
    }

    /**
     * @return statisticsTypeGatewayType
     */
    public String getStatisticsTypeGatewayType() {
        return this.statisticsTypeGatewayType;
    }

    /**
     * @return statisticsTypeInstanceValue
     */
    public String getStatisticsTypeInstanceValue() {
        return this.statisticsTypeInstanceValue;
    }

    public static final class Builder extends Request.Builder<DescribeExposedStatisticsDetailRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String statisticsType; 
        private String statisticsTypeGatewayType; 
        private String statisticsTypeInstanceValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedStatisticsDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.statisticsType = request.statisticsType;
            this.statisticsTypeGatewayType = request.statisticsTypeGatewayType;
            this.statisticsTypeInstanceValue = request.statisticsTypeInstanceValue;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StatisticsType.
         */
        public Builder statisticsType(String statisticsType) {
            this.putQueryParameter("StatisticsType", statisticsType);
            this.statisticsType = statisticsType;
            return this;
        }

        /**
         * StatisticsTypeGatewayType.
         */
        public Builder statisticsTypeGatewayType(String statisticsTypeGatewayType) {
            this.putQueryParameter("StatisticsTypeGatewayType", statisticsTypeGatewayType);
            this.statisticsTypeGatewayType = statisticsTypeGatewayType;
            return this;
        }

        /**
         * StatisticsTypeInstanceValue.
         */
        public Builder statisticsTypeInstanceValue(String statisticsTypeInstanceValue) {
            this.putQueryParameter("StatisticsTypeInstanceValue", statisticsTypeInstanceValue);
            this.statisticsTypeInstanceValue = statisticsTypeInstanceValue;
            return this;
        }

        @Override
        public DescribeExposedStatisticsDetailRequest build() {
            return new DescribeExposedStatisticsDetailRequest(this);
        } 

    } 

}
