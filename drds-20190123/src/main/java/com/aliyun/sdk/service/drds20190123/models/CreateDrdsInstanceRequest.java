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

        private Builder(CreateDrdsInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.duration = request.duration;
            this.instanceSeries = request.instanceSeries;
            this.isAutoRenew = request.isAutoRenew;
            this.masterInstId = request.masterInstId;
            this.mySQLVersion = request.mySQLVersion;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.quantity = request.quantity;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.specification = request.specification;
            this.type = request.type;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
            this.zoneId = request.zoneId;
            this.isHa = request.isHa;
        } 

        /**
         * Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies the description of the instance. The description must meet the following requirements:
         * <p>
         * 
         * *   The description cannot contain the prefix http:// or https://.
         * *   The description must start with a letter or a Chinese character, and can contain uppercase and lowercase letters, Chinese characters, digits, underscores (\_), and hyphens (-).
         * *   The description must be 2 to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies the purchase duration of the subscription instance.
         * <p>
         * 
         * *   If the PricingCycle parameter is set to year, the value range of the Duration parameter is 1 to 3.
         * *   If the PricingCycle parameter is set to month, the value range of the Duration parameter is 1 to 9.
         * 
         * >  This parameter only takes effect when the PayType parameter is set to drdsPre.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Specifies the instance type of the instance. Valid values:
         * <p>
         * 
         * *   **drds.sn2.4c16g**: The instance is of the Starter Edition.
         * *   **drds.sn2.8c32g**: The instance is of the Standard Edition
         * *   **drds.sn2.16c64g**: The instance is of the Enterprise Edition.
         */
        public Builder instanceSeries(String instanceSeries) {
            this.putQueryParameter("InstanceSeries", instanceSeries);
            this.instanceSeries = instanceSeries;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal. Valid values:
         * <p>
         * 
         * *   **true**: If the PricingCycle parameter is set to month, the subscription is automatically renewed for one month. If the PricingCycle parameter is set to year, the subscription is automatically renewed for one year.
         * *   **false**: The auto-renewal feature is disabled for the instance.
         * 
         * >  This parameter only takes effect when the PayType parameter is set to drdsPre.
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.putQueryParameter("IsAutoRenew", isAutoRenew);
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * Specifies the ID of the primary instance. This parameter is only required when you create a read-only instance.
         */
        public Builder masterInstId(String masterInstId) {
            this.putQueryParameter("MasterInstId", masterInstId);
            this.masterInstId = masterInstId;
            return this;
        }

        /**
         * Specifies the MySQL version that is supported by the instance. Valid values:
         * <p>
         * 
         * *   **5**: The instance is fully compatible with MySQL 5.x. This value is the default value.
         * *   **8**: The instance is fully compatible with MySQL 8.0.
         * 
         * >  This parameter only takes effect when you create a primary instance. By default, the MySQL version of the read-only instance is the same as that of the primary instance.
         */
        public Builder mySQLVersion(Integer mySQLVersion) {
            this.putQueryParameter("MySQLVersion", mySQLVersion);
            this.mySQLVersion = mySQLVersion;
            return this;
        }

        /**
         * Specifies the billing method of the instance. Valid values:
         * <p>
         * 
         * *   **drdsPre**: The instance uses the subscription billing method.
         * *   **drdsPost**: The instance uses the pay-as-you-go billing method.
         * *   **drdsRo**: By default, the pay-as-you-go billing method is used when you create read-only instances.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Specifies the unit of the subscription duration of the subscription instance. Valid values:
         * <p>
         * 
         * *   **year**: The unit of the subscription duration is year.
         * *   **month**: The unit of the subscription duration is month.
         * 
         * >  This parameter is required if you set the PayType parameter to drdsPre.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Specifies the number of instances to be created. You can set the value only to 1. The value specifies that you can create one instance each time.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * Specifies the region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies the ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies the specification code of the instance. The value consists of the instance type and the specified instance specification. For example, you can set the value to drds.sn2.4c16g.8c32g.
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * Specifies the type of the instance. Set the value to PRIVATE. The value PRIVATE specifies that the instance is a dedicated instance.
         * <p>
         * 
         * >  You can also set the value to 1 to specify that the instance is a dedicated instance.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Specifies the ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Specifies the ID of the vSwitch.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * Specifies the zone ID of the instance.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Specifies whether the instance is a high-availability instance.
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
