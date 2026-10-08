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
         * <li>(Default) If you do not specify this parameter, the group is a common group.</li>
         * <li>If you set this parameter to <code>hidden</code>, the group is a system default group used by services such as DMS, DTS, and DAS. These groups are not displayed in the console. Deleting or modifying these groups may prevent DMS, DTS, and DAS from accessing ApsaraDB RDS. Proceed with caution.</li>
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
         * <p>The name of the whitelist group to modify. Default value: Default. If the specified group does not exist, a new group is automatically created.</p>
         * <blockquote>
         * <p>Each instance supports up to 200 whitelist groups.</p>
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
         * <p>The target instance ID.</p>
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
         * <p>The list of read-only instances to which the whitelist is synchronized.</p>
         * <ul>
         * <li>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances that have read-only instances.</li>
         * <li>Separate multiple read-only instances with commas (,).</li>
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
         * <li><strong>Cover</strong> (default): overwrites the original IP whitelist with the value of the <strong>SecurityIps</strong> parameter.</li>
         * <li><strong>Append</strong>: appends the IP addresses specified in the <strong>SecurityIps</strong> parameter to the original IP whitelist.</li>
         * <li><strong>Delete</strong>: removes the IP addresses specified in the <strong>SecurityIps</strong> parameter from the original IP whitelist. At least one IP address must be retained.</li>
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
         * <p>The type of IP address. The value is fixed as IPv4. IPv6 is not supported.</p>
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
         * <p>The IP whitelist. Before you modify the IP whitelist, call the <a href="https://help.aliyun.com/document_detail/610518.html">DescribeDBInstanceIPArrayList</a> operation to query the existing IP whitelist information of the instance.</p>
         * <details>
         * <summary>Configuration rules</summary>
         * 
         * <ul>
         * <li><p>IP addresses (such as 10.23.XX.XX) and CIDR blocks (such as 10.23.XX.XX/24) are supported.</p>
         * </li>
         * <li><p>Separate multiple IP addresses or CIDR blocks with commas (,). No spaces are allowed before or after the commas.</p>
         * </li>
         * <li><p>Each instance can contain up to 1,000 IP addresses or CIDR blocks. If you have a large number of IP addresses, merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
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
         * <li><strong>MIX</strong> (default): general mode.</li>
         * <li><strong>Classic</strong>: the classic network in enhanced whitelist mode.</li>
         * <li><strong>VPC</strong>: the virtual private cloud (VPC) in enhanced whitelist mode.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>ApsaraDB RDS for PostgreSQL instances with cloud disks use only the general mode (MIX). If you set this parameter to another mode, the value is automatically converted to MIX.</li>
         * <li>Only ApsaraDB RDS for MySQL 5.1, 5.5, 5.6, and 5.7 instances with Premium Local SSDs and ApsaraDB RDS for PostgreSQL 9.4 and 10 instances with Premium Local SSDs support the enhanced whitelist mode.</li>
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
