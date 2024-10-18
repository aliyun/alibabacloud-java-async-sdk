// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIpsRequest</p>
 */
public class ModifySecurityIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceIPArrayAttribute")
    private String DBInstanceIPArrayAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceIPArrayName")
    private String DBInstanceIPArrayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreshWhiteListReadins")
    private String freshWhiteListReadins;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPType")
    private String securityIPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistNetworkType")
    private String whitelistNetworkType;

    private ModifySecurityIpsRequest(Builder builder) {
        super(builder);
        this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
        this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
        this.DBInstanceId = builder.DBInstanceId;
        this.freshWhiteListReadins = builder.freshWhiteListReadins;
        this.modifyMode = builder.modifyMode;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIPType = builder.securityIPType;
        this.securityIps = builder.securityIps;
        this.whitelistNetworkType = builder.whitelistNetworkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceIPArrayAttribute
     */
    public String getDBInstanceIPArrayAttribute() {
        return this.DBInstanceIPArrayAttribute;
    }

    /**
     * @return DBInstanceIPArrayName
     */
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return freshWhiteListReadins
     */
    public String getFreshWhiteListReadins() {
        return this.freshWhiteListReadins;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityIPType
     */
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    /**
     * @return whitelistNetworkType
     */
    public String getWhitelistNetworkType() {
        return this.whitelistNetworkType;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIpsRequest, Builder> {
        private String DBInstanceIPArrayAttribute; 
        private String DBInstanceIPArrayName; 
        private String DBInstanceId; 
        private String freshWhiteListReadins; 
        private String modifyMode; 
        private Long resourceOwnerId; 
        private String securityIPType; 
        private String securityIps; 
        private String whitelistNetworkType; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIpsRequest request) {
            super(request);
            this.DBInstanceIPArrayAttribute = request.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = request.DBInstanceIPArrayName;
            this.DBInstanceId = request.DBInstanceId;
            this.freshWhiteListReadins = request.freshWhiteListReadins;
            this.modifyMode = request.modifyMode;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityIPType = request.securityIPType;
            this.securityIps = request.securityIps;
            this.whitelistNetworkType = request.whitelistNetworkType;
        } 

        /**
         * <p>The attribute of the IP address whitelist. By default, this parameter is empty.</p>
         * <blockquote>
         * <p>The IP address whitelists that have the hidden attribute are not displayed in the ApsaraDB RDS console. These IP address whitelists are used to access Alibaba Cloud services, such as Data Transmission Service (DTS).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hidden</p>
         */
        public Builder DBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.putQueryParameter("DBInstanceIPArrayAttribute", DBInstanceIPArrayAttribute);
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }

        /**
         * <p>The name of the IP address whitelist that you want to modify. Default value: <strong>Default</strong>.</p>
         * <blockquote>
         * <p>A maximum of 200 IP address whitelists can be configured for each instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.putQueryParameter("DBInstanceIPArrayName", DBInstanceIPArrayName);
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp18n0c8zt45****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The read-only instances to which you want to synchronize the IP address whitelist.</p>
         * <ul>
         * <li>This parameter applies only to ApsaraDB RDS for PostgreSQL instances.</li>
         * <li>If the instance is attached with a read-only instance, you can use this parameter to synchronize the IP address whitelist to the read-only instance. If the instance is attached with multiple read-only instances, separate the read-only instances with commas (,).</li>
         * <li>If the instance is not attached with a read-only instance, leave this parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pgr-bp17yuz4dn3d****,pgr-bp1vn2ph54u1****</p>
         */
        public Builder freshWhiteListReadins(String freshWhiteListReadins) {
            this.putQueryParameter("FreshWhiteListReadins", freshWhiteListReadins);
            this.freshWhiteListReadins = freshWhiteListReadins;
            return this;
        }

        /**
         * <p>The method that is used to modify the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: Use the IP addresses and CIDR blocks that are specified in the <strong>SecurityIps</strong> parameter to overwrite the existing IP addresses and CIDR blocks in the IP address whitelist.</li>
         * <li><strong>Append</strong>: Add the IP addresses and CIDR blocks that are specified in the <strong>SecurityIps</strong> parameter to the IP address whitelist.</li>
         * <li><strong>Delete</strong>: Delete the IP addresses and CIDR blocks that are specified in the <strong>SecurityIps</strong> parameter from the IP address whitelist. You must retain at least one IP address or CIDR block.</li>
         * </ul>
         * <p>Default value: <strong>Cover</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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
         * <p>The IP address type. The value is fixed as IPv4.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder securityIPType(String securityIPType) {
            this.putQueryParameter("SecurityIPType", securityIPType);
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * <p>The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The entries in the IP address whitelist must be in one of the following formats:</p>
         * <ul>
         * <li>IP addresses, such as 10.23.XX.XX.</li>
         * <li>CIDR blocks, such as 10.23.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</li>
         * </ul>
         * <blockquote>
         * <p>A maximum of 1,000 IP addresses or CIDR blocks can be added for each instance. If you want to add a large number of IP addresses, we recommend that you merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.XX.XX</p>
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        /**
         * <p>The network type of the IP address whitelist. Valid values:</p>
         * <ul>
         * <li><strong>Classic</strong>: classic network in enhanced whitelist mode</li>
         * <li><strong>VPC</strong>: virtual private cloud (VPC) network type in enhanced whitelist mode.</li>
         * <li><strong>MIX</strong>: standard whitelist mode</li>
         * </ul>
         * <p>Default value: <strong>MIX</strong>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>In standard whitelist mode, IP addresses and CIDR blocks are added only to the default IP address whitelist. In enhanced whitelist mode, IP addresses and CIDR blocks are added to the IP address whitelists of the classic network type and the VPC network type.</p>
         * </li>
         * <li><p>If your RDS instance runs PostgreSQL and uses cloud disks, set this parameter to MIX. If you set it to another value, the system automatically changes the value to MIX.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Classic</p>
         */
        public Builder whitelistNetworkType(String whitelistNetworkType) {
            this.putQueryParameter("WhitelistNetworkType", whitelistNetworkType);
            this.whitelistNetworkType = whitelistNetworkType;
            return this;
        }

        @Override
        public ModifySecurityIpsRequest build() {
            return new ModifySecurityIpsRequest(this);
        } 

    } 

}
