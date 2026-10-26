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
         * <p>The attribute of the whitelist group.</p>
         * <ul>
         * <li>If you do not specify this parameter, the group is a regular group. This is the default value.</li>
         * <li>If you set this parameter to <code>hidden</code>, the group is a hidden group that is automatically created by the system for services such as DMS, DTS, and DAS. Hidden groups are not displayed in the console. If you delete or modify a hidden group, services such as DMS, DTS, and DAS cannot access the ApsaraDB RDS instance. Proceed with caution.</li>
         * </ul>
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
         * <p>The name of the IP address whitelist group to be modified. Default value: Default. If the specified group does not exist, the system automatically creates the group.</p>
         * <blockquote>
         * <p>You can create up to 200 whitelist groups for a single instance.</p>
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
         * <p>The instance ID.</p>
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
         * <p>The read-only instances to which the whitelist is synchronized.</p>
         * <ul>
         * <li>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances that have read-only instances.</li>
         * <li>If multiple read-only instances exist, separate their IDs with commas (,).</li>
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
         * <p>The modification mode. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: overwrites the original IP address whitelist with the IP addresses specified by the <strong>SecurityIps</strong> parameter. This is the default value.</li>
         * <li><strong>Append</strong>: appends the IP addresses specified by the <strong>SecurityIps</strong> parameter to the original IP address whitelist.</li>
         * <li><strong>Delete</strong>: deletes the IP addresses specified by the <strong>SecurityIps</strong> parameter from the original IP address whitelist. You must retain at least one IP address in the whitelist.</li>
         * </ul>
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
         * <p>The type of the IP address. Set the value to IPv4. IPv6 is not supported.</p>
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
         * <p>The IP address whitelist. Before you modify the IP address whitelist, call the <a href="https://help.aliyun.com/document_detail/610518.html">DescribeDBInstanceIPArrayList</a> operation to query the existing IP address whitelist of the instance.</p>
         * <details>
         * <summary>Configuration rules</summary>
         * 
         * <ul>
         * <li><p>You can enter IP addresses (such as 10.23.XX.XX) or CIDR blocks (such as 10.23.XX.XX/24).</p>
         * </li>
         * <li><p>Separate multiple IP addresses or CIDR blocks with commas (,). Do not add spaces before or after the commas.</p>
         * </li>
         * <li><p>You can add up to 1,000 IP addresses or CIDR blocks to the whitelist of a single instance. If you have a large number of IP addresses, we recommend that you merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
         * </details></li>
         * </ul>
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
         * <p>The network type of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>MIX</strong>: the general mode. This is the default value.</li>
         * <li><strong>Classic</strong>: the classic network in the enhanced whitelist mode.</li>
         * <li><strong>VPC</strong>: the VPC in the enhanced whitelist mode.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For ApsaraDB RDS for PostgreSQL instances with cloud disks, the network type is fixed to the general mode (MIX). If you configure another mode, the system automatically changes it to the general mode.</li>
         * <li>The enhanced whitelist mode is supported only by ApsaraDB RDS for MySQL 5.1, 5.5, 5.6, and 5.7 instances with premium local SSDs, and ApsaraDB RDS for PostgreSQL 9.4 and 10 instances with premium local SSDs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MIX</p>
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
