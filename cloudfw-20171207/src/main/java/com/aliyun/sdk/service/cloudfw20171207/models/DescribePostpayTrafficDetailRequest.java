// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePostpayTrafficDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePostpayTrafficDetailRequest</p>
 */
public class DescribePostpayTrafficDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchItem")
    private String searchItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficType;

    private DescribePostpayTrafficDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.searchItem = builder.searchItem;
        this.startTime = builder.startTime;
        this.trafficType = builder.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayTrafficDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return searchItem
     */
    public String getSearchItem() {
        return this.searchItem;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficType
     */
    public String getTrafficType() {
        return this.trafficType;
    }

    public static final class Builder extends Request.Builder<DescribePostpayTrafficDetailRequest, Builder> {
        private Long currentPage; 
        private String endTime; 
        private String lang; 
        private String order; 
        private Long pageSize; 
        private String regionNo; 
        private String searchItem; 
        private String startTime; 
        private String trafficType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePostpayTrafficDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.searchItem = request.searchItem;
            this.startTime = request.startTime;
            this.trafficType = request.trafficType;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify a value in the YYYYMMDD format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20230130</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The field based on which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li><strong>resourceId</strong></li>
         * <li><strong>trafficDay</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resourceId</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The instance ID or the IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify a value in the YYYYMMDD format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20230101</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The traffic type. This parameter is required. Valid values:</p>
         * <ul>
         * <li><strong>EIP_TRAFFIC</strong>: traffic for the Internet firewall.</li>
         * <li><strong>NatGateway_TRAFFIC</strong>: traffic for NAT firewalls.</li>
         * <li><strong>VPC_TRAFFIC</strong>: traffic for virtual private cloud (VPC) firewalls.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EIP_TRAFFIC</p>
         */
        public Builder trafficType(String trafficType) {
            this.putQueryParameter("TrafficType", trafficType);
            this.trafficType = trafficType;
            return this;
        }

        @Override
        public DescribePostpayTrafficDetailRequest build() {
            return new DescribePostpayTrafficDetailRequest(this);
        } 

    } 

}
