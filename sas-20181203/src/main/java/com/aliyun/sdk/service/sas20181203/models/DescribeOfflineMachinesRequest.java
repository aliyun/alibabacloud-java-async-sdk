// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfflineMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeOfflineMachinesRequest</p>
 */
public class DescribeOfflineMachinesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Os")
    private String os;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionIdStr")
    private String regionIdStr;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Vendor")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
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
         * RegionIdStr.
         */
        public Builder regionIdStr(String regionIdStr) {
            this.putQueryParameter("RegionIdStr", regionIdStr);
            this.regionIdStr = regionIdStr;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Vendor.
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
