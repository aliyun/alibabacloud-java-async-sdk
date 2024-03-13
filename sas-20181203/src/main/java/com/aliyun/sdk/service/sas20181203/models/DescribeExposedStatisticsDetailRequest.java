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
    @NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

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
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Long resourceDirectoryAccountId; 
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
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.statisticsType = request.statisticsType;
            this.statisticsTypeGatewayType = request.statisticsTypeGatewayType;
            this.statisticsTypeInstanceValue = request.statisticsTypeInstanceValue;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The type of the exposed asset. Valid values:
         * <p>
         * 
         * *   **exposureType**: gateway assets
         * *   **exposurePort**: ports
         * *   **exposureComponent**: system components
         * *   **exposureIp**: IP addresses
         */
        public Builder statisticsType(String statisticsType) {
            this.putQueryParameter("StatisticsType", statisticsType);
            this.statisticsType = statisticsType;
            return this;
        }

        /**
         * The type of the gateway asset. This parameter is required when the **StatisticsType** parameter is set to **exposureType**. Valid values:
         * <p>
         * 
         * *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
         * *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
         */
        public Builder statisticsTypeGatewayType(String statisticsTypeGatewayType) {
            this.putQueryParameter("StatisticsTypeGatewayType", statisticsTypeGatewayType);
            this.statisticsTypeGatewayType = statisticsTypeGatewayType;
            return this;
        }

        /**
         * The ID of the gateway asset. This parameter is required when the **StatisticsType** parameter is set to **exposureType**.
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
