// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBInstanceNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceNetworkTypeRequest</p>
 */
public class ModifyDBInstanceNetworkTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClassicExpiredDays")
    private String classicExpiredDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadWriteSplittingClassicExpiredDays")
    private Integer readWriteSplittingClassicExpiredDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadWriteSplittingPrivateIpAddress")
    private String readWriteSplittingPrivateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainClassic")
    private String retainClassic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private ModifyDBInstanceNetworkTypeRequest(Builder builder) {
        super(builder);
        this.classicExpiredDays = builder.classicExpiredDays;
        this.DBInstanceId = builder.DBInstanceId;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.readWriteSplittingClassicExpiredDays = builder.readWriteSplittingClassicExpiredDays;
        this.readWriteSplittingPrivateIpAddress = builder.readWriteSplittingPrivateIpAddress;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retainClassic = builder.retainClassic;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceNetworkTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classicExpiredDays
     */
    public String getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return readWriteSplittingClassicExpiredDays
     */
    public Integer getReadWriteSplittingClassicExpiredDays() {
        return this.readWriteSplittingClassicExpiredDays;
    }

    /**
     * @return readWriteSplittingPrivateIpAddress
     */
    public String getReadWriteSplittingPrivateIpAddress() {
        return this.readWriteSplittingPrivateIpAddress;
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
     * @return retainClassic
     */
    public String getRetainClassic() {
        return this.retainClassic;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceNetworkTypeRequest, Builder> {
        private String classicExpiredDays; 
        private String DBInstanceId; 
        private String instanceNetworkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String privateIpAddress; 
        private Integer readWriteSplittingClassicExpiredDays; 
        private String readWriteSplittingPrivateIpAddress; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String retainClassic; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceNetworkTypeRequest request) {
            super(request);
            this.classicExpiredDays = request.classicExpiredDays;
            this.DBInstanceId = request.DBInstanceId;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privateIpAddress = request.privateIpAddress;
            this.readWriteSplittingClassicExpiredDays = request.readWriteSplittingClassicExpiredDays;
            this.readWriteSplittingPrivateIpAddress = request.readWriteSplittingPrivateIpAddress;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retainClassic = request.retainClassic;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The number of days for which you want to retain the classic network endpoint. Valid values: <strong>1 to 120</strong>. Default value: <strong>7</strong>.</p>
         * <blockquote>
         * <p>If you set the <strong>RetainClassic</strong> parameter to <strong>True</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder classicExpiredDays(String classicExpiredDays) {
            this.putQueryParameter("ClassicExpiredDays", classicExpiredDays);
            this.classicExpiredDays = classicExpiredDays;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The network type after the modification. Set the value to <strong>VPC</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
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
         * <p>The internal IP address of the instance. The internal IP address must be within the CIDR block supported by the specified vSwitch. The system automatically assigns a private IP address to an instance based on the values of <strong>VPCId</strong> and <strong>VSwitchId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>172.10.40.25</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The number of days for which you want to retain the read/write splitting endpoint of the classic network type. Valid values: <strong>1 to 120</strong>. Default value: <strong>7</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when a read/write splitting endpoint of the classic network type exists and the <strong>RetainClassic</strong> parameter is set to <strong>True</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder readWriteSplittingClassicExpiredDays(Integer readWriteSplittingClassicExpiredDays) {
            this.putQueryParameter("ReadWriteSplittingClassicExpiredDays", readWriteSplittingClassicExpiredDays);
            this.readWriteSplittingClassicExpiredDays = readWriteSplittingClassicExpiredDays;
            return this;
        }

        /**
         * <p>The internal IP address that corresponds to the read/write splitting endpoint of the instance. The internal IP address must be within the CIDR block supported by the specified vSwitch. The system automatically assigns a private IP address to an instance based on the values of <strong>VPCId</strong> and <strong>VSwitchId</strong>.</p>
         * <blockquote>
         * <p> This parameter is valid when a read/write splitting endpoint of the classic network type exists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.22</p>
         */
        public Builder readWriteSplittingPrivateIpAddress(String readWriteSplittingPrivateIpAddress) {
            this.putQueryParameter("ReadWriteSplittingPrivateIpAddress", readWriteSplittingPrivateIpAddress);
            this.readWriteSplittingPrivateIpAddress = readWriteSplittingPrivateIpAddress;
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
         * <p>Specifies whether to retain the classic network endpoint. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: retains the classic network endpoint.</li>
         * <li><strong>False</strong> (default): does not retain the classic network endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder retainClassic(String retainClassic) {
            this.putQueryParameter("RetainClassic", retainClassic);
            this.retainClassic = retainClassic;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90xxxxxx</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. This parameter is required if the <strong>VPCId</strong> parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2pxxxxx</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyDBInstanceNetworkTypeRequest build() {
            return new ModifyDBInstanceNetworkTypeRequest(this);
        } 

    } 

}
