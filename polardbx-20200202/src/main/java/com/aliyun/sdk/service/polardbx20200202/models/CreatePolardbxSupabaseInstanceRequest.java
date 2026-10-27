// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreatePolardbxSupabaseInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreatePolardbxSupabaseInstanceRequest</p>
 */
public class CreatePolardbxSupabaseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashboardPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dashboardPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceDescription")
    private String dbInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeSpec")
    private String nodeSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantMode")
    private Boolean tenantMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreatePolardbxSupabaseInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.dashboardPassword = builder.dashboardPassword;
        this.dbInstanceDescription = builder.dbInstanceDescription;
        this.dbPassword = builder.dbPassword;
        this.nodeSpec = builder.nodeSpec;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tenantMode = builder.tenantMode;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolardbxSupabaseInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dashboardPassword
     */
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    /**
     * @return dbInstanceDescription
     */
    public String getDbInstanceDescription() {
        return this.dbInstanceDescription;
    }

    /**
     * @return dbPassword
     */
    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * @return nodeSpec
     */
    public String getNodeSpec() {
        return this.nodeSpec;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
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
     * @return tenantMode
     */
    public Boolean getTenantMode() {
        return this.tenantMode;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreatePolardbxSupabaseInstanceRequest, Builder> {
        private Boolean autoRenew; 
        private String clientToken; 
        private String dashboardPassword; 
        private String dbInstanceDescription; 
        private String dbPassword; 
        private String nodeSpec; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean tenantMode; 
        private Integer usedTime; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolardbxSupabaseInstanceRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.dashboardPassword = request.dashboardPassword;
            this.dbInstanceDescription = request.dbInstanceDescription;
            this.dbPassword = request.dbPassword;
            this.nodeSpec = request.nodeSpec;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tenantMode = request.tenantMode;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The Dashboard password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dTyMQem0o3HOAFh!</p>
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.putQueryParameter("DashboardPassword", dashboardPassword);
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Supabase instance</p>
         */
        public Builder dbInstanceDescription(String dbInstanceDescription) {
            this.putQueryParameter("DbInstanceDescription", dbInstanceDescription);
            this.dbInstanceDescription = dbInstanceDescription;
            return this;
        }

        /**
         * <p>The database password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dTyMQem0o3HOAFh!</p>
         */
        public Builder dbPassword(String dbPassword) {
            this.putQueryParameter("DbPassword", dbPassword);
            this.dbPassword = dbPassword;
            return this;
        }

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.supabase.x2.small</p>
         */
        public Builder nodeSpec(String nodeSpec) {
            this.putQueryParameter("NodeSpec", nodeSpec);
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * <p>The billing method. Valid values: PREPAY and POSTPAY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle. Valid values: Year, Month, and Hour.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable multi-tenant mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder tenantMode(Boolean tenantMode) {
            this.putQueryParameter("TenantMode", tenantMode);
            this.tenantMode = tenantMode;
            return this;
        }

        /**
         * <p>The subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ndoug37dtwoedlmru0</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreatePolardbxSupabaseInstanceRequest build() {
            return new CreatePolardbxSupabaseInstanceRequest(this);
        } 

    } 

}
