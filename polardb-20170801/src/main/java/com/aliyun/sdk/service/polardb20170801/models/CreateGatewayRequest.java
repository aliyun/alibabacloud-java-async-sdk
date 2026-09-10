// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterClass")
    private String DBClusterClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

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
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateGatewayRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBType = builder.DBType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayRequest create() {
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
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateGatewayRequest, Builder> {
        private Boolean autoRenew; 
        private String DBClusterClass; 
        private String DBType; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String securityGroupId; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.DBClusterClass = request.DBClusterClass;
            this.DBType = request.DBType;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.securityGroupId = request.securityGroupId;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables auto-renewal.</p>
         * </li>
         * <li><p><strong>false</strong>: disables auto-renewal.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter applies only when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The cluster specification.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * <p>The database engine type. Valid values:</p>
         * <ul>
         * <li><p>MySQL</p>
         * </li>
         * <li><p>PostgreSQL</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: subscription</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * <ul>
         * <li><p><strong>Year</strong>: The subscription duration is measured in years.</p>
         * </li>
         * <li><p><strong>Month</strong>: The subscription duration is measured in months.</p>
         * </li>
         * </ul>
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
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp**************</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The subscription duration. This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * <ul>
         * <li><p>If <strong>Period</strong> is set to <strong>Month</strong>, the value must be an integer from <code>1</code> to <code>9</code>.</p>
         * </li>
         * <li><p>If <strong>Period</strong> is set to <strong>Year</strong>, the value must be an integer from <code>1</code> to <code>3</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The availability zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-l</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateGatewayRequest build() {
            return new CreateGatewayRequest(this);
        } 

    } 

}
