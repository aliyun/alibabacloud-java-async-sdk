// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterSSLRequest</p>
 */
public class ModifyDBClusterSSLRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBEndpointId")
    private String DBEndpointId;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SSLAutoRotate")
    private String SSLAutoRotate;

    @Query
    @NameInMap("SSLEnabled")
    private String SSLEnabled;

    private ModifyDBClusterSSLRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBEndpointId = builder.DBEndpointId;
        this.netType = builder.netType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.SSLAutoRotate = builder.SSLAutoRotate;
        this.SSLEnabled = builder.SSLEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterSSLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return SSLAutoRotate
     */
    public String getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    /**
     * @return SSLEnabled
     */
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterSSLRequest, Builder> {
        private String DBClusterId; 
        private String DBEndpointId; 
        private String netType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String SSLAutoRotate; 
        private String SSLEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterSSLRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBEndpointId = request.DBEndpointId;
            this.netType = request.netType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.SSLAutoRotate = request.SSLAutoRotate;
            this.SSLEnabled = request.SSLEnabled;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The ID of the endpoint.
         * <p>
         * 
         * > 
         * 
         * *   This parameter is required for a PolarDB for MySQL cluster.
         * 
         * *   This parameter is not required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. By default, SSL encryption is enabled for all endpoints.
         * *   You can call the [DescribeDBClusterSSL](~~153414~~) operation to view the details of the endpoint.
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.putQueryParameter("DBEndpointId", DBEndpointId);
            this.DBEndpointId = DBEndpointId;
            return this;
        }

        /**
         * The network type supported by the endpoint that is specified by **DBEndpointId**. Valid values:
         * <p>
         * 
         * *   **Public**
         * *   **Private**
         * *   **Inner**
         * 
         * > 
         * 
         * *   This parameter is required for a PolarDB for MySQL cluster.
         * 
         * *   This parameter is not required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. By default, SSL encryption is enabled for all endpoints.
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
         * Specifies whether automatic rotation of SSL certificates is enabled.
         * <p>
         * 
         * *   **Enable**: The feature is enabled.
         * *   **Disable**: The feature is disabled.
         */
        public Builder SSLAutoRotate(String SSLAutoRotate) {
            this.putQueryParameter("SSLAutoRotate", SSLAutoRotate);
            this.SSLAutoRotate = SSLAutoRotate;
            return this;
        }

        /**
         * The SSL encryption status. Valid values:
         * <p>
         * 
         * *   **Disable**: SSL encryption is disabled.
         * *   **Enable**: SSL encryption is enabled.
         * *   **Update**: The SSL certificate is updated.
         * 
         * > After you enable SSL encryption or update the SSL certificate, you must download and configure the certificate. For more information, see [Configure SSL encryption](~~153182~~).
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.putQueryParameter("SSLEnabled", SSLEnabled);
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        @Override
        public ModifyDBClusterSSLRequest build() {
            return new ModifyDBClusterSSLRequest(this);
        } 

    } 

}
