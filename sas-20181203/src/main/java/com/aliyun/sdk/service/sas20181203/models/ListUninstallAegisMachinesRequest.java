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
         * <p>The page number of the first page to display in the query results. Default value: <strong>1</strong>, which indicates that the query results are displayed from page 1.</p>
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
         * <p>The operating system.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to obtain supported operating systems from the <strong>Values</strong> of the item whose <strong>Name</strong> is <strong>osType</strong>.</p>
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
         * <p>The number of entries per page in a paged query. Default value: <strong>5</strong>, which indicates that 5 entries are displayed per page.</p>
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
         * <p>The region where the server resides.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to obtain supported regions from the <strong>Values</strong> of the item whose <strong>Name</strong> is <strong>regionId</strong>.</p>
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
         * <p>The region where the server resides.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to obtain supported regions from the <strong>Values</strong> of the item whose <strong>Name</strong> is <strong>regionId</strong>.</p>
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
         * <p>The asset information to query. You can set this parameter to the asset name or public IP address.</p>
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
         * <p>The IP address of the access source.</p>
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
         * <p>The server vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: non-cloud asset</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: third-party cloud asset</li>
         * <li><strong>8</strong>: lightweight asset.</li>
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
