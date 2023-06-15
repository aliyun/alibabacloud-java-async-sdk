// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReadWriteSplittingConnectionRequest} extends {@link RequestModel}
 *
 * <p>ModifyReadWriteSplittingConnectionRequest</p>
 */
public class ModifyReadWriteSplittingConnectionRequest extends Request {
    @Query
    @NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DistributionType")
    private String distributionType;

    @Query
    @NameInMap("MaxDelayTime")
    private String maxDelayTime;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Weight")
    private String weight;

    private ModifyReadWriteSplittingConnectionRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceId = builder.DBInstanceId;
        this.distributionType = builder.distributionType;
        this.maxDelayTime = builder.maxDelayTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReadWriteSplittingConnectionRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return distributionType
     */
    public String getDistributionType() {
        return this.distributionType;
    }

    /**
     * @return maxDelayTime
     */
    public String getMaxDelayTime() {
        return this.maxDelayTime;
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
     * @return weight
     */
    public String getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<ModifyReadWriteSplittingConnectionRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBInstanceId; 
        private String distributionType; 
        private String maxDelayTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String port; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String weight; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReadWriteSplittingConnectionRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceId = request.DBInstanceId;
            this.distributionType = request.distributionType;
            this.maxDelayTime = request.maxDelayTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.weight = request.weight;
        } 

        /**
         * The prefix of the read/write splitting endpoint. The prefix must be unique. It can be up to 30 characters in length and can contain lowercase letters and hyphens (-). It must start with a lowercase letter.
         * <p>
         * 
         * > The default prefix consists of the name of the primary instance followed by the letters rw.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * The ID of the primary instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The method that is used to assign read weights. Valid values:
         * <p>
         * 
         * *   **Standard**: The system automatically assigns read weights to the primary and read-only instances based on the specifications of these instances.
         * *   **Custom**: You must manually assign a read weight to each instance.
         * 
         * > You must specify at least one of **MaxDelayTime** and **DistributionType**.
         */
        public Builder distributionType(String distributionType) {
            this.putQueryParameter("DistributionType", distributionType);
            this.distributionType = distributionType;
            return this;
        }

        /**
         * The latency threshold that is allowed by the read/write splitting link. Unit: seconds. If the latency on a read-only instance exceeds the specified threshold, the system no longer routes read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained.
         * <p>
         * 
         * > 
         * 
         * *   If the primary instance runs SQL Server 2017 on RDS Cluster Edition, the **MaxDelayTime** parameter is not supported.
         * 
         * *   You must specify at least one of **MaxDelayTime** and **DistributionType**.
         */
        public Builder maxDelayTime(String maxDelayTime) {
            this.putQueryParameter("MaxDelayTime", maxDelayTime);
            this.maxDelayTime = maxDelayTime;
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
         * The port that is associated with the read/write splitting endpoint.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
         * The read weights of the primary instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10,000.
         * <p>
         * 
         * *   For ApsaraDB RDS instances, the value of this parameter is in the following format: `{"<ID of the read-only instance >":<Weight>,"master":<Weight>,"slave":<Weight>}`.
         * *   For ApsaraDB MyBase instances, the value of this parameter is in the following format: `[{"instanceName":"<ID of the primary instance>","weight":<Weight>,"role":"master"},{"instanceName":"<ID of the primary instance>","weight":<Weight>,"role":"slave"},{"instanceName":"<ID of the read-only instance>","weight":<Weight>,"role":"master"}]`
         * 
         * > 
         * 
         * *   This parameter must be specified when **DistributionType** is set to **Custom**.
         * 
         * *   If **DistributionType** is set to **Standard**, this parameter is invalid.
         */
        public Builder weight(String weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ModifyReadWriteSplittingConnectionRequest build() {
            return new ModifyReadWriteSplittingConnectionRequest(this);
        } 

    } 

}
