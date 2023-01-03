// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVccsRequest} extends {@link RequestModel}
 *
 * <p>ListVccsRequest</p>
 */
public class ListVccsRequest extends Request {
    @Body
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Body
    @NameInMap("CenId")
    private String cenId;

    @Body
    @NameInMap("EnablePage")
    private Boolean enablePage;

    @Body
    @NameInMap("ExStatus")
    private String exStatus;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("VccId")
    private String vccId;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    @Body
    @NameInMap("VpdId")
    private String vpdId;

    private ListVccsRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.cenId = builder.cenId;
        this.enablePage = builder.enablePage;
        this.exStatus = builder.exStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.vccId = builder.vccId;
        this.vpcId = builder.vpcId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return exStatus
     */
    public String getExStatus() {
        return this.exStatus;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<ListVccsRequest, Builder> {
        private Integer bandwidth; 
        private String cenId; 
        private Boolean enablePage; 
        private String exStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 
        private String vccId; 
        private String vpcId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(ListVccsRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.cenId = request.cenId;
            this.enablePage = request.enablePage;
            this.exStatus = request.exStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
            this.vccId = request.vccId;
            this.vpcId = request.vpcId;
            this.vpdId = request.vpdId;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * EnablePage.
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * 除外的状态，Status存在则不生效
         */
        public Builder exStatus(String exStatus) {
            this.putBodyParameter("ExStatus", exStatus);
            this.exStatus = exStatus;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VccId.
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpdId.
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public ListVccsRequest build() {
            return new ListVccsRequest(this);
        } 

    } 

}
