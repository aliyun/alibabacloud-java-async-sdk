// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExposedStatisticsDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedStatisticsDetailRequest</p>
 */
public class DescribeExposedStatisticsDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statisticsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsTypeGatewayType")
    private String statisticsTypeGatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsTypeInstanceValue")
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
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The type of the exposed asset. Valid values:</p>
         * <ul>
         * <li><strong>exposureType</strong>: gateway assets</li>
         * <li><strong>exposurePort</strong>: ports</li>
         * <li><strong>exposureComponent</strong>: system components</li>
         * <li><strong>exposureIp</strong>: IP addresses</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exposureType</p>
         */
        public Builder statisticsType(String statisticsType) {
            this.putQueryParameter("StatisticsType", statisticsType);
            this.statisticsType = statisticsType;
            return this;
        }

        /**
         * <p>The type of the gateway asset. This parameter is required when the <strong>StatisticsType</strong> parameter is set to <strong>exposureType</strong>. Valid values:</p>
         * <ul>
         * <li><strong>SLB</strong>: the public IP address of a Server Load Balancer (SLB) instance</li>
         * <li><strong>DNAT</strong>: the NAT gateway that connects to the Internet by using the DNAT feature</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        public Builder statisticsTypeGatewayType(String statisticsTypeGatewayType) {
            this.putQueryParameter("StatisticsTypeGatewayType", statisticsTypeGatewayType);
            this.statisticsTypeGatewayType = statisticsTypeGatewayType;
            return this;
        }

        /**
         * <p>The ID of the gateway asset. This parameter is required when the <strong>StatisticsType</strong> parameter is set to <strong>exposureType</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2ze4rso39h4nczcqs****</p>
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
