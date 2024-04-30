// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceForRebuildRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceForRebuildRequest</p>
 */
public class CreateDBInstanceForRebuildRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
    private String DBInstanceNetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private CreateDBInstanceForRebuildRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceNetType = builder.DBInstanceNetType;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIPList = builder.securityIPList;
        this.securityToken = builder.securityToken;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
        this.zoneIdSlave2 = builder.zoneIdSlave2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceForRebuildRequest create() {
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
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceNetType
     */
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
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

    /**
     * @return zoneIdSlave1
     */
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    /**
     * @return zoneIdSlave2
     */
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceForRebuildRequest, Builder> {
        private String clientToken; 
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private String DBInstanceNetType; 
        private String instanceNetworkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityIPList; 
        private String securityToken; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceForRebuildRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceNetType = request.DBInstanceNetType;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityIPList = request.securityIPList;
            this.securityToken = request.securityToken;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The name of the instance. The name must be 2 to 256 characters in length. The name can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         * <p>
         * 
         * > : The name cannot start with http:// or https://.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The type of the network connection to the instance. Valid values:
         * <p>
         * 
         * *   **Internet**
         * *   **Intranet**
         */
        public Builder DBInstanceNetType(String DBInstanceNetType) {
            this.putQueryParameter("DBInstanceNetType", DBInstanceNetType);
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   **VPC**
         * *   **Classic**
         * 
         * Default value: Classic.
         * 
         * >  The **VPCId** and **VSwitchId** parameters must be specified when this parameter is set to **VPC**.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The billing method of the destination instance. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         * 
         * >  If you set the PayType parameter to **Prepaid**, you must specify this parameter.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~610399~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group. The value of this parameter can be NULL.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The IP address whitelist of the serverless instance. For more information, see [Use a database client or the CLI to connect to an ApsaraDB RDS for PostgreSQL instance](~~43185~~). If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. You can specify up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:
         * <p>
         * 
         * *   IP addresses, such as 10.10.XX.XX.
         * *   CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.
         * 
         * If this parameter is not specified, the default IP address whitelist is used.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The subscription duration of the instance. Valid values:
         * <p>
         * 
         * *   If you set **Period** to **Year**, the value of **UsedTime** ranges from **1** to **5**.
         * *   If you set **Period** to **Month**, the value of **UsedTime** ranges from **1** to **11**.
         * 
         * > If you set **PayType** to **Prepaid**, you must specify this parameter.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The VPC ID of the instance. If you set **InstanceNetworkType** to **VPC**, you must specify this parameter.
         * <p>
         * 
         * > : If you specify this parameter, you must also specify **ZoneId**.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The ID of the vSwitch. The vSwitch must belong to the zone that is specified by **ZoneId**.
         * <p>
         * 
         * > 
         * 
         * *   If you set **InstanceNetworkType** to **VPC**, you must also specify this parameter.
         * 
         * *   If you specify the ZoneSlaveId1 parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID of the primary instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.
         * <p>
         * 
         * > If you specify a virtual private cloud (VPC) and a vSwitch, you must specify this parameter to identify the zone for the vSwitch.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The zone ID of the secondary instance.
         * <p>
         * 
         * >  If the instance does not run RDS Basic Edition, you must specify this parameter.
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * The zone ID of the logger instance.
         * <p>
         * 
         * >  This parameter is available only when the instance runs RDS Enterprise Edition.
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public CreateDBInstanceForRebuildRequest build() {
            return new CreateDBInstanceForRebuildRequest(this);
        } 

    } 

}
