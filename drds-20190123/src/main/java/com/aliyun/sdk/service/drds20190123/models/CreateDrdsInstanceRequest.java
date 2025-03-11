// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link CreateDrdsInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDrdsInstanceRequest</p>
 */
public class CreateDrdsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSeries")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSeries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAutoRenew")
    private Boolean isAutoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstId")
    private String masterInstId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MySQLVersion")
    private Integer mySQLVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Specification")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isHa")
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
         * <p>Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c1dd299c-10c6-11ea-bbbb-************</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies the description of the instance. The description must meet the following requirements:</p>
         * <ul>
         * <li>The description cannot contain the prefix http:// or https://.</li>
         * <li>The description must start with a letter or a Chinese character, and can contain uppercase and lowercase letters, Chinese characters, digits, underscores (_), and hyphens (-).</li>
         * <li>The description must be 2 to 256 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies the purchase duration of the subscription instance.</p>
         * <ul>
         * <li>If the PricingCycle parameter is set to year, the value range of the Duration parameter is 1 to 3.</li>
         * <li>If the PricingCycle parameter is set to month, the value range of the Duration parameter is 1 to 9.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter only takes effect when the PayType parameter is set to drdsPre.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies the instance type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>drds.sn2.4c16g</strong>: The instance is of the Starter Edition.</li>
         * <li><strong>drds.sn2.8c32g</strong>: The instance is of the Standard Edition</li>
         * <li><strong>drds.sn2.16c64g</strong>: The instance is of the Enterprise Edition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds.sn2.4c16g</p>
         */
        public Builder instanceSeries(String instanceSeries) {
            this.putQueryParameter("InstanceSeries", instanceSeries);
            this.instanceSeries = instanceSeries;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic renewal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: If the PricingCycle parameter is set to month, the subscription is automatically renewed for one month. If the PricingCycle parameter is set to year, the subscription is automatically renewed for one year.</li>
         * <li><strong>false</strong>: The auto-renewal feature is disabled for the instance.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter only takes effect when the PayType parameter is set to drdsPre.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.putQueryParameter("IsAutoRenew", isAutoRenew);
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * <p>Specifies the ID of the primary instance. This parameter is only required when you create a read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drds***********</p>
         */
        public Builder masterInstId(String masterInstId) {
            this.putQueryParameter("MasterInstId", masterInstId);
            this.masterInstId = masterInstId;
            return this;
        }

        /**
         * <p>Specifies the MySQL version that is supported by the instance. Valid values:</p>
         * <ul>
         * <li><strong>5</strong>: The instance is fully compatible with MySQL 5.x. This value is the default value.</li>
         * <li><strong>8</strong>: The instance is fully compatible with MySQL 8.0.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter only takes effect when you create a primary instance. By default, the MySQL version of the read-only instance is the same as that of the primary instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder mySQLVersion(Integer mySQLVersion) {
            this.putQueryParameter("MySQLVersion", mySQLVersion);
            this.mySQLVersion = mySQLVersion;
            return this;
        }

        /**
         * <p>Specifies the billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>drdsPre</strong>: The instance uses the subscription billing method.</li>
         * <li><strong>drdsPost</strong>: The instance uses the pay-as-you-go billing method.</li>
         * <li><strong>drdsRo</strong>: By default, the pay-as-you-go billing method is used when you create read-only instances.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drdsPost</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>Specifies the unit of the subscription duration of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>year</strong>: The unit of the subscription duration is year.</li>
         * <li><strong>month</strong>: The unit of the subscription duration is month.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set the PayType parameter to drdsPre.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>Specifies the number of instances to be created. You can set the value only to 1. The value specifies that you can create one instance each time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>Specifies the region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies the ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies the specification code of the instance. The value consists of the instance type and the specified instance specification. For example, you can set the value to drds.sn2.4c16g.8c32g.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds.sn2.4c16g.8C32g</p>
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * <p>Specifies the type of the instance. Set the value to PRIVATE. The value PRIVATE specifies that the instance is a dedicated instance.</p>
         * <blockquote>
         * <p> You can also set the value to 1 to specify that the instance is a dedicated instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Specifies the ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-**********</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Specifies the ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-**********</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>Specifies the zone ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>Specifies whether the instance is a high-availability instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
