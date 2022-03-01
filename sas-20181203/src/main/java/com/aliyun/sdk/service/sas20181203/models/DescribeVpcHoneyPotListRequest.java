// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcHoneyPotListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcHoneyPotListRequest</p>
 */
public class DescribeVpcHoneyPotListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("HoneyPotExistence")
    private Boolean honeyPotExistence;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VpcName")
    private String vpcName;

    @Query
    @NameInMap("VpcRegionId")
    private String vpcRegionId;

    private DescribeVpcHoneyPotListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.honeyPotExistence = builder.honeyPotExistence;
        this.pageSize = builder.pageSize;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcHoneyPotListRequest create() {
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
     * @return honeyPotExistence
     */
    public Boolean getHoneyPotExistence() {
        return this.honeyPotExistence;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcHoneyPotListRequest, Builder> {
        private Integer currentPage; 
        private Boolean honeyPotExistence; 
        private Integer pageSize; 
        private String vpcId; 
        private String vpcName; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcHoneyPotListRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.honeyPotExistence = response.honeyPotExistence;
            this.pageSize = response.pageSize;
            this.vpcId = response.vpcId;
            this.vpcName = response.vpcName;
            this.vpcRegionId = response.vpcRegionId;
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
         * HoneyPotExistence.
         */
        public Builder honeyPotExistence(Boolean honeyPotExistence) {
            this.putQueryParameter("HoneyPotExistence", honeyPotExistence);
            this.honeyPotExistence = honeyPotExistence;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcName.
         */
        public Builder vpcName(String vpcName) {
            this.putQueryParameter("VpcName", vpcName);
            this.vpcName = vpcName;
            return this;
        }

        /**
         * VpcRegionId.
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putQueryParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public DescribeVpcHoneyPotListRequest build() {
            return new DescribeVpcHoneyPotListRequest(this);
        } 

    } 

}
