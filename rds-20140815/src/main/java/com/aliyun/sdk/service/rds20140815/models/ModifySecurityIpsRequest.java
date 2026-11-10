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
    @com.aliyun.core.annotation.NameInMap("BatchMode")
    private Boolean batchMode;

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
    @com.aliyun.core.annotation.NameInMap("GroupItems")
    private java.util.List<GroupItems> groupItems;

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
    private String securityIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistNetworkType")
    private String whitelistNetworkType;

    private ModifySecurityIpsRequest(Builder builder) {
        super(builder);
        this.batchMode = builder.batchMode;
        this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
        this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
        this.DBInstanceId = builder.DBInstanceId;
        this.freshWhiteListReadins = builder.freshWhiteListReadins;
        this.groupItems = builder.groupItems;
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
     * @return batchMode
     */
    public Boolean getBatchMode() {
        return this.batchMode;
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
     * @return groupItems
     */
    public java.util.List<GroupItems> getGroupItems() {
        return this.groupItems;
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
        private Boolean batchMode; 
        private String DBInstanceIPArrayAttribute; 
        private String DBInstanceIPArrayName; 
        private String DBInstanceId; 
        private String freshWhiteListReadins; 
        private java.util.List<GroupItems> groupItems; 
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
            this.batchMode = request.batchMode;
            this.DBInstanceIPArrayAttribute = request.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = request.DBInstanceIPArrayName;
            this.DBInstanceId = request.DBInstanceId;
            this.freshWhiteListReadins = request.freshWhiteListReadins;
            this.groupItems = request.groupItems;
            this.modifyMode = request.modifyMode;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityIPType = request.securityIPType;
            this.securityIps = request.securityIps;
            this.whitelistNetworkType = request.whitelistNetworkType;
        } 

        /**
         * <p>Specifies whether to enable the batch modification mode. Valid values:</p>
         * <p>true: batch mode. Modifies multiple whitelist groups at a time based on the GroupItems parameter. In this case, the single-group parameters such as SecurityIps, DBInstanceIPArrayName, and DBInstanceIPArrayAttribute do not take effect.</p>
         * <p>false: single-group mode. Modifies a single whitelist group based on parameters such as SecurityIps. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder batchMode(Boolean batchMode) {
            this.putQueryParameter("BatchMode", batchMode);
            this.batchMode = batchMode;
            return this;
        }

        /**
         * <p>The attribute of the IP whitelist group.</p>
         * <ul>
         * <li>If you do not specify this parameter, the group is a regular group. This is the default value.</li>
         * <li>If you set this parameter to <code>hidden</code>, the group is a system-generated group used by services such as DMS, DTS, and DAS. These groups are not displayed in the console. Deleting or modifying these groups causes services such as DMS, DTS, and DAS to fail to access the ApsaraDB RDS instance. Proceed with caution.</li>
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
         * <p>The name of the IP whitelist group to be modified. Default value: Default. If the specified group does not exist, the system automatically creates the group.</p>
         * <blockquote>
         * <p>A single instance supports up to 200 IP whitelist groups.</p>
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
         * <p>The instance ID of the target instance.</p>
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
         * <li>This parameter applies only to ApsaraDB RDS for PostgreSQL instances for which read-only instances are created.</li>
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
         * <p>The details of the whitelist groups. This parameter is required when BatchMode is set to true. In each group, GroupName is required and must be unique. You must specify at least one of SecurityIPList and GroupTag.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;GroupName&quot;:&quot;default&quot;,&quot;SecurityIPList&quot;:&quot;127.0.0.1&quot;},{&quot;GroupName&quot;:&quot;test&quot;,&quot;SecurityIPList&quot;:&quot;10.23.XX.XX,10.24.XX.XX&quot;}]</p>
         */
        public Builder groupItems(java.util.List<GroupItems> groupItems) {
            this.putQueryParameter("GroupItems", groupItems);
            this.groupItems = groupItems;
            return this;
        }

        /**
         * <p>The modification mode. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: overwrites the original IP whitelist with the value of the <strong>SecurityIps</strong> parameter. This is the default value.</li>
         * <li><strong>Append</strong>: appends the IP addresses specified in the <strong>SecurityIps</strong> parameter to the original IP whitelist.</li>
         * <li><strong>Delete</strong>: deletes the IP addresses specified in the <strong>SecurityIps</strong> parameter from the original IP whitelist. You must retain at least one IP address.</li>
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
         * <p>The IP whitelist. Before you modify the IP whitelist, call the <a href="https://help.aliyun.com/document_detail/610518.html">DescribeDBInstanceIPArrayList</a> operation to query the existing IP whitelist of the instance.</p>
         * <details>
         * <summary>Configuration rules</summary>
         * 
         * <ul>
         * <li><p>IP addresses (such as 10.23.XX.XX) and CIDR blocks (such as 10.23.XX.XX/24) are supported.</p>
         * </li>
         * <li><p>Separate multiple IP addresses or CIDR blocks with commas (,). Do not add spaces before or after the commas.</p>
         * </li>
         * <li><p>You can add up to 1,000 IP addresses or CIDR blocks to a single instance. If you have a large number of IP addresses, we recommend that you merge scattered IP addresses into CIDR blocks, such as 10.23.XX.XX/24.</p>
         * </details></li>
         * </ul>
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
         * <li><strong>MIX</strong>: general mode. This is the default value.</li>
         * <li><strong>Classic</strong>: classic network in enhanced whitelist mode.</li>
         * <li><strong>VPC</strong>: VPC in enhanced whitelist mode.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For ApsaraDB RDS for PostgreSQL instances with cloud disks, the network type is fixed to MIX. If you configure another mode, the system automatically converts it to MIX.</li>
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

    /**
     * 
     * {@link ModifySecurityIpsRequest} extends {@link TeaModel}
     *
     * <p>ModifySecurityIpsRequest</p>
     */
    public static class GroupItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupTag")
        private String groupTag;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        private GroupItems(Builder builder) {
            this.groupName = builder.groupName;
            this.groupTag = builder.groupTag;
            this.securityIPList = builder.securityIPList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItems create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupTag
         */
        public String getGroupTag() {
            return this.groupTag;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public static final class Builder {
            private String groupName; 
            private String groupTag; 
            private String securityIPList; 

            private Builder() {
            } 

            private Builder(GroupItems model) {
                this.groupName = model.groupName;
                this.groupTag = model.groupTag;
                this.securityIPList = model.securityIPList;
            } 

            /**
             * <p>The name of the whitelist group. This parameter is required in batch mode and must be unique within the same GroupItems list.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The attribute of the whitelist group. If you set this parameter to hidden, the group is a system-generated group used by services such as DMS, DTS, and DAS. These groups are not displayed in the console. Proceed with caution. Generally, you do not need to specify this parameter. You must specify at least one of this parameter and SecurityIPList.</p>
             * 
             * <strong>example:</strong>
             * <p>hidden</p>
             */
            public Builder groupTag(String groupTag) {
                this.groupTag = groupTag;
                return this;
            }

            /**
             * <p>The modified IP address whitelist of the group. Separate multiple IP addresses with commas (,). You must specify at least one of this parameter and GroupTag.</p>
             * 
             * <strong>example:</strong>
             * <p>10.23.XX.XX,10.24.XX.XX</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            public GroupItems build() {
                return new GroupItems(this);
            } 

        } 

    }
}
