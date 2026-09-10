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
 * {@link ModifyDBEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBEndpointAddressRequest</p>
 */
public class ModifyDBEndpointAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBEndpointId")
    private String DBEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateZoneAddressPrefix")
    private String privateZoneAddressPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateZoneName")
    private String privateZoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBEndpointAddressRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBClusterId = builder.DBClusterId;
        this.DBEndpointId = builder.DBEndpointId;
        this.netType = builder.netType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.privateZoneAddressPrefix = builder.privateZoneAddressPrefix;
        this.privateZoneName = builder.privateZoneName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBEndpointAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBEndpointId
     */
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateZoneAddressPrefix
     */
    public String getPrivateZoneAddressPrefix() {
        return this.privateZoneAddressPrefix;
    }

    /**
     * @return privateZoneName
     */
    public String getPrivateZoneName() {
        return this.privateZoneName;
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

    public static final class Builder extends Request.Builder<ModifyDBEndpointAddressRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBClusterId; 
        private String DBEndpointId; 
        private String netType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String port; 
        private String privateZoneAddressPrefix; 
        private String privateZoneName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBEndpointAddressRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBClusterId = request.DBClusterId;
            this.DBEndpointId = request.DBEndpointId;
            this.netType = request.netType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.privateZoneAddressPrefix = request.privateZoneAddressPrefix;
            this.privateZoneName = request.privateZoneName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The new connection string prefix. The prefix must meet the following requirements:</p>
         * <ul>
         * <li><p>It can contain only lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>It must start with a letter and end with a letter or a digit.</p>
         * </li>
         * <li><p>It must be 6 to 30 characters in length.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in your account, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-***************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the connection address.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query the ID of a connection address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pe-****************</p>
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.putQueryParameter("DBEndpointId", DBEndpointId);
            this.DBEndpointId = DBEndpointId;
            return this;
        }

        /**
         * <p>The network type of the connection address. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: public network</p>
         * </li>
         * <li><p><strong>Private</strong>: private network</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>Inner</strong>: classic network</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Only PolarDB for MySQL clusters support the classic network type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
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
         * <p>The port number. The valid range is 3000 to 5999.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only for PolarDB for MySQL clusters. If you do not specify this parameter, the port defaults to 3306.</li>
         * </ul>
         * </blockquote>
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
         * <p>The prefix of the private domain name. The prefix must meet the following requirements:</p>
         * <ul>
         * <li><p>It can contain only lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>It must start with a letter and end with a letter or a digit.</p>
         * </li>
         * <li><p>It must be 6 to 30 characters in length.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can bind a private domain name to each private endpoint of a PolarDB cluster. This domain name is effective only in the specified VPC within the current region. The private domain name is managed by PrivateZone and is mapped to the built-in private endpoint of the cluster through a CNAME record. This feature incurs a small fee. For more information, see <a href="https://help.aliyun.com/document_detail/71338.html">Pricing</a>.</p>
         * </li>
         * <li><p>This parameter is valid only when <strong>NetType is set to Private</strong>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc</p>
         */
        public Builder privateZoneAddressPrefix(String privateZoneAddressPrefix) {
            this.putQueryParameter("PrivateZoneAddressPrefix", privateZoneAddressPrefix);
            this.privateZoneAddressPrefix = privateZoneAddressPrefix;
            return this;
        }

        /**
         * <p>The private zone name.</p>
         * <blockquote>
         * <p>This parameter is valid only when <strong>NetType is set to Private</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        public Builder privateZoneName(String privateZoneName) {
            this.putQueryParameter("PrivateZoneName", privateZoneName);
            this.privateZoneName = privateZoneName;
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

        @Override
        public ModifyDBEndpointAddressRequest build() {
            return new ModifyDBEndpointAddressRequest(this);
        } 

    } 

}
