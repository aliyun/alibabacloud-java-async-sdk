// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListUninstallAegisMachinesRequest} extends {@link RequestModel}
 *
 * <p>ListUninstallAegisMachinesRequest</p>
 */
public class ListUninstallAegisMachinesRequest extends Request {
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

    private ListUninstallAegisMachinesRequest(Builder builder) {
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

    public static ListUninstallAegisMachinesRequest create() {
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

    public static final class Builder extends Request.Builder<ListUninstallAegisMachinesRequest, Builder> {
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

        private Builder(ListUninstallAegisMachinesRequest request) {
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The operating system of the server.</p>
         * <blockquote>
         * <p> The value of this parameter is the value of the Values parameter that is returned by calling the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation. If the value of the <strong>Name</strong> parameter in the response is <strong>osType</strong>, the value of the <strong>Values</strong> parameter indicates an operating system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the server resides.</p>
         * <blockquote>
         * <p> The value of this parameter is the value of the Values parameter that is returned by calling the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation. If the value of the <strong>Name</strong> parameter in the response is <strong>regionId</strong>, the value of the <strong>Values</strong> parameter indicates a region ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionIdStr(String regionIdStr) {
            this.putQueryParameter("RegionIdStr", regionIdStr);
            this.regionIdStr = regionIdStr;
            return this;
        }

        /**
         * <p>The region in which the server resides.</p>
         * <blockquote>
         * <p> The value of this parameter is the value of the Values parameter that is returned by calling the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation. If the value of the <strong>Name</strong> parameter in the response is <strong>regionId</strong>, the value of the <strong>Values</strong> parameter indicates a region ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The information about the server that you want to query. The value can be the name or the public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>180.113.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The source of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
         * <li><strong>1</strong>: a third-party cloud server</li>
         * <li><strong>2</strong>: a server in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
         * <li><strong>8</strong>: a lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListUninstallAegisMachinesRequest build() {
            return new ListUninstallAegisMachinesRequest(this);
        } 

    } 

}
