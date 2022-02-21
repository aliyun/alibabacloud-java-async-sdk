// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityGroupRequest</p>
 */
public class ListSecurityGroupRequest extends Request {
    @Query
    @NameInMap("DepositType")
    private String depositType;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ListSecurityGroupRequest(Builder builder) {
        super(builder);
        this.depositType = builder.depositType;
        this.netType = builder.netType;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return depositType
     */
    public String getDepositType() {
        return this.depositType;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListSecurityGroupRequest, Builder> {
        private String depositType; 
        private String netType; 
        private String productType; 
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityGroupRequest response) {
            super(response);
            this.depositType = response.depositType;
            this.netType = response.netType;
            this.productType = response.productType;
            this.regionId = response.regionId;
            this.vpcId = response.vpcId;
        } 

        /**
         * DepositType.
         */
        public Builder depositType(String depositType) {
            this.putQueryParameter("DepositType", depositType);
            this.depositType = depositType;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public ListSecurityGroupRequest build() {
            return new ListSecurityGroupRequest(this);
        } 

    } 

}
