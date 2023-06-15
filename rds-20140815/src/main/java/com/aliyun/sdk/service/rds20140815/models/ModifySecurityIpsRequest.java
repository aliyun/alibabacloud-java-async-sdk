// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIpsRequest</p>
 */
public class ModifySecurityIpsRequest extends Request {
    @Query
    @NameInMap("DBInstanceIPArrayAttribute")
    private String DBInstanceIPArrayAttribute;

    @Query
    @NameInMap("DBInstanceIPArrayName")
    private String DBInstanceIPArrayName;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("FreshWhiteListReadins")
    private String freshWhiteListReadins;

    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityIPType")
    private String securityIPType;

    @Query
    @NameInMap("SecurityIps")
    @Validation(required = true)
    private String securityIps;

    @Query
    @NameInMap("WhitelistNetworkType")
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
         * The attribute of the IP address whitelist. By default, this parameter is empty.
         * <p>
         * 
         * > The IP address whitelists that have the hidden attribute are not displayed in the ApsaraDB RDS console. These IP address whitelists are used to access Alibaba Cloud services, such as Data Transmission Service (DTS).
         */
        public Builder DBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.putQueryParameter("DBInstanceIPArrayAttribute", DBInstanceIPArrayAttribute);
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }

        /**
         * The name of the IP address whitelist that you want to modify. Default value: Default.
         * <p>
         * 
         * > A maximum of 200 IP address whitelists can be configured for each instance.
         */
        public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.putQueryParameter("DBInstanceIPArrayName", DBInstanceIPArrayName);
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The read-only instances to which you want to synchronize the IP address whitelist.
         * <p>
         * 
         * *   This parameter applies only to ApsaraDB RDS for PostgreSQL instances.
         * *   If the instance is attached with a read-only instance, you can use this parameter to synchronize the IP address whitelist to the read-only instance. If the instance is attached with multiple read-only instances, separate the read-only instances with commas (,).
         * *   If the instance is not attached with a read-only instance, leave this parameter empty.
         */
        public Builder freshWhiteListReadins(String freshWhiteListReadins) {
            this.putQueryParameter("FreshWhiteListReadins", freshWhiteListReadins);
            this.freshWhiteListReadins = freshWhiteListReadins;
            return this;
        }

        /**
         * The method that is used to modify the IP address whitelist. Valid values:
         * <p>
         * 
         * *   **Cover**: Use the IP addresses and CIDR blocks that are specified in the **SecurityIps** parameter to overwrite the existing IP addresses and CIDR blocks in the IP address whitelist.
         * *   **Append**: Add the IP addresses and CIDR blocks that are specified in the **SecurityIps** parameter to the IP address whitelist.
         * *   **Delete**: Delete the IP addresses and CIDR blocks that are specified in the **SecurityIps** parameter from the IP address whitelist. You must retain at least one IP address or CIDR block.
         * 
         * Default value: **Cover**.
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
         * The type of the IP addresses in the IP address whitelist. Set the value to IPv4. IPv6 is not supported.
         */
        public Builder securityIPType(String securityIPType) {
            this.putQueryParameter("SecurityIPType", securityIPType);
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * The IP addresses and CIDR blocks that you want to include in the IP address whitelist. If the IP address whitelist contains more than one IP address or CIDR block, separate these IP addresses and CIDR blocks with commas (,). Each IP address or CIDR block in an IP address whitelist must be unique. For more information, see [Configure an IP address whitelist for an ApsaraDB RDS instance](~~43185~~). The entries in the IP address whitelist must be in one of the following formats:
         * <p>
         * 
         * *   IP addresses, such as 10.23.XX.XX.
         * *   CIDR blocks, such as 10.23.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.
         * 
         * > A maximum of 1,000 IP addresses or CIDR blocks can be added for each instance. If you want to add a large number of IP addresses, we recommend that you merge them into CIDR blocks, such as 10.23.XX.XX/24.
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        /**
         * The network type of the IP address whitelist. Valid values:
         * <p>
         * 
         * *   **Classic**: classic network in enhanced whitelist mode
         * *   **VPC**: virtual private cloud (VPC) in enhanced whitelist mode
         * *   **MIX**: standard whitelist mode
         * 
         * Default value: **MIX**.
         * 
         * > In standard whitelist mode, IP addresses and CIDR blocks are added only to the default IP address whitelist. In enhanced whitelist mode, IP addresses and CIDR blocks are added to the IP address whitelists of the classic network type and the VPC network type.
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
