// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateReadOnlyDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateReadOnlyDBInstanceRequest</p>
 */
public class CreateReadOnlyDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreateProxy")
    private Boolean autoCreateProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BpeEnabled")
    private String bpeEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GdnInstanceName")
    private String gdnInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstructionSetArch")
    private String instructionSetArch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

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
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

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
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForMaster")
    private String targetDedicatedHostIdForMaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TddlBizType")
    private String tddlBizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TddlRegionConfig")
    private String tddlRegionConfig;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateReadOnlyDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoCreateProxy = builder.autoCreateProxy;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bpeEnabled = builder.bpeEnabled;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.deletionProtection = builder.deletionProtection;
        this.engineVersion = builder.engineVersion;
        this.gdnInstanceName = builder.gdnInstanceName;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instructionSetArch = builder.instructionSetArch;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.promotionCode = builder.promotionCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetDedicatedHostIdForMaster = builder.targetDedicatedHostIdForMaster;
        this.tddlBizType = builder.tddlBizType;
        this.tddlRegionConfig = builder.tddlRegionConfig;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReadOnlyDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCreateProxy
     */
    public Boolean getAutoCreateProxy() {
        return this.autoCreateProxy;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return bpeEnabled
     */
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
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
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return gdnInstanceName
     */
    public String getGdnInstanceName() {
        return this.gdnInstanceName;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return instructionSetArch
     */
    public String getInstructionSetArch() {
        return this.instructionSetArch;
    }

    /**
     * @return ioAccelerationEnabled
     */
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
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
     * @return targetDedicatedHostIdForMaster
     */
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    /**
     * @return tddlBizType
     */
    public String getTddlBizType() {
        return this.tddlBizType;
    }

    /**
     * @return tddlRegionConfig
     */
    public String getTddlRegionConfig() {
        return this.tddlRegionConfig;
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

    public static final class Builder extends Request.Builder<CreateReadOnlyDBInstanceRequest, Builder> {
        private Boolean autoCreateProxy; 
        private Boolean autoPay; 
        private String autoRenew; 
        private Boolean autoUseCoupon; 
        private String bpeEnabled; 
        private Boolean burstingEnabled; 
        private String category; 
        private String clientToken; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String dedicatedHostGroupId; 
        private Boolean deletionProtection; 
        private String engineVersion; 
        private String gdnInstanceName; 
        private String instanceNetworkType; 
        private String instructionSetArch; 
        private String ioAccelerationEnabled; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String port; 
        private String privateIpAddress; 
        private String promotionCode; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetDedicatedHostIdForMaster; 
        private String tddlBizType; 
        private String tddlRegionConfig; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReadOnlyDBInstanceRequest request) {
            super(request);
            this.autoCreateProxy = request.autoCreateProxy;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.bpeEnabled = request.bpeEnabled;
            this.burstingEnabled = request.burstingEnabled;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.deletionProtection = request.deletionProtection;
            this.engineVersion = request.engineVersion;
            this.gdnInstanceName = request.gdnInstanceName;
            this.instanceNetworkType = request.instanceNetworkType;
            this.instructionSetArch = request.instructionSetArch;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.promotionCode = request.promotionCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetDedicatedHostIdForMaster = request.targetDedicatedHostIdForMaster;
            this.tddlBizType = request.tddlBizType;
            this.tddlRegionConfig = request.tddlRegionConfig;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to automatically create database proxies. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: automatically creates database proxies. By default, general-purpose database proxies are created.</li>
         * <li><strong>false</strong>: does not automatically create database proxies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCreateProxy(Boolean autoCreateProxy) {
            this.putQueryParameter("AutoCreateProxy", autoCreateProxy);
            this.autoCreateProxy = autoCreateProxy;
            return this;
        }

        /**
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ol>
         * <li><strong>true</strong>: automatically completes the payment. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
         * </ol>
         * <blockquote>
         * <p> Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable the auto-renewal feature for the read-only instance. If you set the PayType parameter to Prepaid, you must also specify this parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set the Period parameter to Month, the auto-renewal cycle is one month.</li>
         * <li>If you set the Period parameter to Year, the auto-renewal cycle is one year.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
            return this;
        }

        /**
         * <p>An invalid parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition</li>
         * <li><strong>HighAvailability</strong> (default): RDS High-availability Edition</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition</li>
         * </ul>
         * <blockquote>
         * <p> The read-only instances of the primary instance that run PostgreSQL and use cloud disks run RDS Basic Edition. Therefore, set this parameter to <strong>Basic</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOC****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance type of the read-only instance. For more information, see <a href="https://help.aliyun.com/document_detail/145759.html">Read-only instance types</a>. We recommend that you specify an instance type whose specifications are higher than or equal to the specifications of the instance type of the primary instance. If the specifications of the read-only instance are lower than the specifications of the primary instance, the read-only instance may encounter issues such as high latency and heavy load.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mys2.small</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The description of the read-only instance. The description must be 2 to 256 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The value must start with a letter</p>
         * <blockquote>
         * <p>The value cannot start with <a href="http://https://%E3%80%82">http:// or https://.</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test read-only instance</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The primary instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The storage capacity of the read-only instance. The storage capacity of the read-only instance must be greater than or equal to that of the primary instance. For more information, see the <strong>Storage capacity</strong> column in <a href="https://help.aliyun.com/document_detail/145759.html">Read-only instance types</a>. This value must be a multiple of 5. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSDs</li>
         * <li><strong>cloud_ssd</strong>: standard SSDs</li>
         * <li><strong>cloud_essd</strong>: enhanced SSDs (ESSDs) of performance level 1 (PL1)</li>
         * <li><strong>cloud_essd2</strong>: ESSDs of PL2</li>
         * <li><strong>cloud_essd3</strong>: ESSDs of PL3</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the primary instance runs MySQL with local disks, you must set this parameter to <strong>local_ssd</strong>. If the primary instance runs MySQL with cloud disks, you must set this parameter to cloud_ssd, cloud_essd, cloud_essd2, or cloud_essd3.</li>
         * <li>If the primary instance runs SQL Server, you must set this parameter to cloud_ssd, cloud_essd, cloud_essd2, or cloud_essd3.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The ID of the dedicated cluster to which the read-only instance belongs. This parameter is valid when you create the read-only instance in a dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-4n****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the release protection feature for the read-only instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> You can enable the release protection feature for the read-only instance only when you set the <strong>PayType</strong> parameter to <strong>Postpaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The version of the database engine. The read-only instance and the primary instance must run the same major engine version.</p>
         * <ul>
         * <li>If the read-only instance runs MySQL, set this parameter to <strong>5.6</strong>, <strong>5.7</strong>, or <strong>8.0</strong>.</li>
         * <li>If the read-only instance runs MySQL, set this parameter to <strong>2017_ent, 2019_ent, or 2022_ent</strong>.</li>
         * <li>If the read-only instance runs PostgreSQL, set this parameter to <strong>10.0, 11.0, 12.0, 13.0, 14.0, or 15.0</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder gdnInstanceName(String gdnInstanceName) {
            this.putQueryParameter("GdnInstanceName", gdnInstanceName);
            this.gdnInstanceName = gdnInstanceName;
            return this;
        }

        /**
         * <p>The network type of the read-only instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>Classic</strong></li>
         * </ul>
         * <p>Default value: VPC. If you set this parameter to VPC, you must also specify the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
         * <blockquote>
         * <p> The network type of the read-only instance can be different from the network type of the primary instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Classic</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder instructionSetArch(String instructionSetArch) {
            this.putQueryParameter("InstructionSetArch", instructionSetArch);
            this.instructionSetArch = instructionSetArch;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
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
         * <p>The billing method of the read-only instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The renewal cycle of the read-only instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
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
         * <p>The port that can be initialized when you create a read-only ApsaraDB RDS for MySQL instance.</p>
         * <p>Valid values: 1000 to 65534.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The private IP address of the read-only instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. The system assigns a private IP address to the read-only instance based on the values of the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * PromotionCode.
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region ID. The read-only instance and the primary instance must reside in the same region. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
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
         * <p>The ID of the host on which the primary instance resides. This parameter is valid when you create the read-only instance in a dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp****</p>
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder tddlBizType(String tddlBizType) {
            this.putQueryParameter("TddlBizType", tddlBizType);
            this.tddlBizType = tddlBizType;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder tddlRegionConfig(String tddlRegionConfig) {
            this.putQueryParameter("TddlRegionConfig", tddlRegionConfig);
            this.tddlRegionConfig = tddlRegionConfig;
            return this;
        }

        /**
         * <p>The subscription duration of the read-only instance. Valid values:</p>
         * <ul>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1</strong> to <strong>5</strong>.</li>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1</strong> to <strong>9</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If you set the <strong>PayType</strong> parameter to <strong>Prepaid</strong>, you must specify the UsedTime parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID of the read-only instance. If you leave the <strong>InstanceNetworkType</strong> parameter empty or set it to <strong>VPC</strong>, you must also specify this parameter.</p>
         * <blockquote>
         * <ul>
         * <li>If the primary instance uses local disks, the read-only instance and the primary instance can belong to the same VPC or different VPCs.</li>
         * <li>If the primary instance uses cloud disks, the read-only instance and the primary instance must belong to the same VPC.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the read-only instance. If you leave the <strong>InstanceNetworkType</strong> parameter empty or set it to <strong>VPC</strong>, you must specify the VSwitchId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2p****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID. You can call the DescribeRegions operation to query the zone ID.</p>
         * <ul>
         * <li>If you use the single-zone deployment method, set this parameter to the ID of one zone. Example: <code>cn-hangzhou-b</code>.</li>
         * <li>If you use the multi-zone deployment method, set this parameter to the IDs of multiple zones and separate the IDs with colons (:). Example: <code>cn-hangzhou-b:cn-hangzhou-c</code>.</li>
         * <li>The number of zone IDs that you specify must be less than or equal to the number of nodes created for the read-only instance. If you create a read-only instance that runs RDS Basic Edition, only one node is provisioned. If you create a read-only instance that runs RDS High-availability Edition, one primary node and one secondary node are provisioned.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateReadOnlyDBInstanceRequest build() {
            return new CreateReadOnlyDBInstanceRequest(this);
        } 

    } 

}
