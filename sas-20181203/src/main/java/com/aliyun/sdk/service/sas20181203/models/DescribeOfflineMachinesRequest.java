// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfflineMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeOfflineMachinesRequest</p>
 */
public class DescribeOfflineMachinesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIdStr")
    private String regionIdStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private Integer vendor;

    private DescribeOfflineMachinesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.os = builder.os;
        this.pageSize = builder.pageSize;
        this.regionIdStr = builder.regionIdStr;
        this.regionNo = builder.regionNo;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfflineMachinesRequest create() {
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
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionIdStr
     */
    public String getRegionIdStr() {
        return this.regionIdStr;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<DescribeOfflineMachinesRequest, Builder> {
        private Integer currentPage; 
        private String os; 
        private Integer pageSize; 
        private String regionIdStr; 
        private String regionNo; 
        private String remark; 
        private String sourceIp; 
        private Integer vendor; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOfflineMachinesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.os = request.os;
            this.pageSize = request.pageSize;
            this.regionIdStr = request.regionIdStr;
            this.regionNo = request.regionNo;
            this.remark = request.remark;
            this.sourceIp = request.sourceIp;
            this.vendor = request.vendor;
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The operating system of the server.
         * <p>
         * 
         * >  The value of this parameter is the value of the Values parameter that is returned by calling the [DescribeCriteria](~~DescribeCriteria~~) operation. If the value of the **Name** parameter in the response is **osType**, the value of the **Values** parameter indicates an operating system.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **5**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region in which the server resides.
         * <p>
         * 
         * >  The value of this parameter is the value of the Values parameter that is returned by calling the [DescribeCriteria](~~DescribeCriteria~~) operation. If the value of the **Name** parameter in the response is **regionId**, the value of the **Values** parameter indicates a region ID.
         */
        public Builder regionIdStr(String regionIdStr) {
            this.putQueryParameter("RegionIdStr", regionIdStr);
            this.regionIdStr = regionIdStr;
            return this;
        }

        /**
         * The region in which the server resides.
         * <p>
         * 
         * >  The value of this parameter is the value of the Values parameter that is returned by calling the [DescribeCriteria](~~DescribeCriteria~~) operation. If the value of the **Name** parameter in the response is **regionId**, the value of the **Values** parameter indicates a region ID.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * The information about the server that you want to query. The value can be the name or the public IP address of the server.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The source of the server. Valid values:
         * <p>
         * 
         * *   **0**: an asset provided by Alibaba Cloud.
         * *   **1**: a third-party cloud server
         * *   **2**: a server in a data center
         * *   **3**, **4**, **5**, and **7**: other cloud asset
         * *   **8**: a lightweight asset
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public DescribeOfflineMachinesRequest build() {
            return new DescribeOfflineMachinesRequest(this);
        } 

    } 

}
