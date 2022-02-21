// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDrdsInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDrdsInstanceRequest</p>
 */
public class CreateDrdsInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("InstanceSeries")
    @Validation(required = true)
    private String instanceSeries;

    @Query
    @NameInMap("IsAutoRenew")
    private Boolean isAutoRenew;

    @Query
    @NameInMap("MasterInstId")
    private String masterInstId;

    @Query
    @NameInMap("MySQLVersion")
    private Integer mySQLVersion;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("Quantity")
    @Validation(required = true)
    private Integer quantity;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Specification")
    @Validation(required = true)
    private String specification;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VswitchId")
    private String vswitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    @Query
    @NameInMap("isHa")
    private Boolean isHa;

    private CreateDrdsInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.duration = builder.duration;
        this.instanceSeries = builder.instanceSeries;
        this.isAutoRenew = builder.isAutoRenew;
        this.masterInstId = builder.masterInstId;
        this.mySQLVersion = builder.mySQLVersion;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.specification = builder.specification;
        this.type = builder.type;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
        this.isHa = builder.isHa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDrdsInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceSeries
     */
    public String getInstanceSeries() {
        return this.instanceSeries;
    }

    /**
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    /**
     * @return masterInstId
     */
    public String getMasterInstId() {
        return this.masterInstId;
    }

    /**
     * @return mySQLVersion
     */
    public Integer getMySQLVersion() {
        return this.mySQLVersion;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return isHa
     */
    public Boolean getIsHa() {
        return this.isHa;
    }

    public static final class Builder extends Request.Builder<CreateDrdsInstanceRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Integer duration; 
        private String instanceSeries; 
        private Boolean isAutoRenew; 
        private String masterInstId; 
        private Integer mySQLVersion; 
        private String payType; 
        private String pricingCycle; 
        private Integer quantity; 
        private String regionId; 
        private String resourceGroupId; 
        private String specification; 
        private String type; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 
        private Boolean isHa; 

        private Builder() {
            super();
        } 

        private Builder(CreateDrdsInstanceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.duration = response.duration;
            this.instanceSeries = response.instanceSeries;
            this.isAutoRenew = response.isAutoRenew;
            this.masterInstId = response.masterInstId;
            this.mySQLVersion = response.mySQLVersion;
            this.payType = response.payType;
            this.pricingCycle = response.pricingCycle;
            this.quantity = response.quantity;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.specification = response.specification;
            this.type = response.type;
            this.vpcId = response.vpcId;
            this.vswitchId = response.vswitchId;
            this.zoneId = response.zoneId;
            this.isHa = response.isHa;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceSeries.
         */
        public Builder instanceSeries(String instanceSeries) {
            this.putQueryParameter("InstanceSeries", instanceSeries);
            this.instanceSeries = instanceSeries;
            return this;
        }

        /**
         * IsAutoRenew.
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.putQueryParameter("IsAutoRenew", isAutoRenew);
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * MasterInstId.
         */
        public Builder masterInstId(String masterInstId) {
            this.putQueryParameter("MasterInstId", masterInstId);
            this.masterInstId = masterInstId;
            return this;
        }

        /**
         * MySQLVersion.
         */
        public Builder mySQLVersion(Integer mySQLVersion) {
            this.putQueryParameter("MySQLVersion", mySQLVersion);
            this.mySQLVersion = mySQLVersion;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specification.
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * isHa.
         */
        public Builder isHa(Boolean isHa) {
            this.putQueryParameter("isHa", isHa);
            this.isHa = isHa;
            return this;
        }

        @Override
        public CreateDrdsInstanceRequest build() {
            return new CreateDrdsInstanceRequest(this);
        } 

    } 

}
