// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBProxyEndpointRequest</p>
 */
public class ModifyDBProxyEndpointRequest extends Request {
    @Query
    @NameInMap("ConfigDBProxyFeatures")
    private String configDBProxyFeatures;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBProxyEndpointId")
    private String DBProxyEndpointId;

    @Query
    @NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @Query
    @NameInMap("DbEndpointAliases")
    private String dbEndpointAliases;

    @Query
    @NameInMap("DbEndpointOperator")
    private String dbEndpointOperator;

    @Query
    @NameInMap("DbEndpointReadWriteMode")
    private String dbEndpointReadWriteMode;

    @Query
    @NameInMap("DbEndpointType")
    private String dbEndpointType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReadOnlyInstanceDistributionType")
    private String readOnlyInstanceDistributionType;

    @Query
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    private String readOnlyInstanceMaxDelayTime;

    @Query
    @NameInMap("ReadOnlyInstanceWeight")
    private String readOnlyInstanceWeight;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBProxyEndpointRequest(Builder builder) {
        super(builder);
        this.configDBProxyFeatures = builder.configDBProxyFeatures;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.dbEndpointAliases = builder.dbEndpointAliases;
        this.dbEndpointOperator = builder.dbEndpointOperator;
        this.dbEndpointReadWriteMode = builder.dbEndpointReadWriteMode;
        this.dbEndpointType = builder.dbEndpointType;
        this.ownerId = builder.ownerId;
        this.readOnlyInstanceDistributionType = builder.readOnlyInstanceDistributionType;
        this.readOnlyInstanceMaxDelayTime = builder.readOnlyInstanceMaxDelayTime;
        this.readOnlyInstanceWeight = builder.readOnlyInstanceWeight;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBProxyEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configDBProxyFeatures
     */
    public String getConfigDBProxyFeatures() {
        return this.configDBProxyFeatures;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBProxyEndpointId
     */
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return dbEndpointAliases
     */
    public String getDbEndpointAliases() {
        return this.dbEndpointAliases;
    }

    /**
     * @return dbEndpointOperator
     */
    public String getDbEndpointOperator() {
        return this.dbEndpointOperator;
    }

    /**
     * @return dbEndpointReadWriteMode
     */
    public String getDbEndpointReadWriteMode() {
        return this.dbEndpointReadWriteMode;
    }

    /**
     * @return dbEndpointType
     */
    public String getDbEndpointType() {
        return this.dbEndpointType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return readOnlyInstanceDistributionType
     */
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    /**
     * @return readOnlyInstanceMaxDelayTime
     */
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    /**
     * @return readOnlyInstanceWeight
     */
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyDBProxyEndpointRequest, Builder> {
        private String configDBProxyFeatures; 
        private String DBInstanceId; 
        private String DBProxyEndpointId; 
        private String DBProxyEngineType; 
        private String dbEndpointAliases; 
        private String dbEndpointOperator; 
        private String dbEndpointReadWriteMode; 
        private String dbEndpointType; 
        private Long ownerId; 
        private String readOnlyInstanceDistributionType; 
        private String readOnlyInstanceMaxDelayTime; 
        private String readOnlyInstanceWeight; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyEndpointRequest request) {
            super(request);
            this.configDBProxyFeatures = request.configDBProxyFeatures;
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEndpointId = request.DBProxyEndpointId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.dbEndpointAliases = request.dbEndpointAliases;
            this.dbEndpointOperator = request.dbEndpointOperator;
            this.dbEndpointReadWriteMode = request.dbEndpointReadWriteMode;
            this.dbEndpointType = request.dbEndpointType;
            this.ownerId = request.ownerId;
            this.readOnlyInstanceDistributionType = request.readOnlyInstanceDistributionType;
            this.readOnlyInstanceMaxDelayTime = request.readOnlyInstanceMaxDelayTime;
            this.readOnlyInstanceWeight = request.readOnlyInstanceWeight;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ConfigDBProxyFeatures.
         */
        public Builder configDBProxyFeatures(String configDBProxyFeatures) {
            this.putQueryParameter("ConfigDBProxyFeatures", configDBProxyFeatures);
            this.configDBProxyFeatures = configDBProxyFeatures;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBProxyEndpointId.
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.putQueryParameter("DBProxyEndpointId", DBProxyEndpointId);
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * DBProxyEngineType.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * DbEndpointAliases.
         */
        public Builder dbEndpointAliases(String dbEndpointAliases) {
            this.putQueryParameter("DbEndpointAliases", dbEndpointAliases);
            this.dbEndpointAliases = dbEndpointAliases;
            return this;
        }

        /**
         * DbEndpointOperator.
         */
        public Builder dbEndpointOperator(String dbEndpointOperator) {
            this.putQueryParameter("DbEndpointOperator", dbEndpointOperator);
            this.dbEndpointOperator = dbEndpointOperator;
            return this;
        }

        /**
         * DbEndpointReadWriteMode.
         */
        public Builder dbEndpointReadWriteMode(String dbEndpointReadWriteMode) {
            this.putQueryParameter("DbEndpointReadWriteMode", dbEndpointReadWriteMode);
            this.dbEndpointReadWriteMode = dbEndpointReadWriteMode;
            return this;
        }

        /**
         * DbEndpointType.
         */
        public Builder dbEndpointType(String dbEndpointType) {
            this.putQueryParameter("DbEndpointType", dbEndpointType);
            this.dbEndpointType = dbEndpointType;
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
         * ReadOnlyInstanceDistributionType.
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            this.putQueryParameter("ReadOnlyInstanceDistributionType", readOnlyInstanceDistributionType);
            this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * ReadOnlyInstanceMaxDelayTime.
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.putQueryParameter("ReadOnlyInstanceMaxDelayTime", readOnlyInstanceMaxDelayTime);
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * ReadOnlyInstanceWeight.
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.putQueryParameter("ReadOnlyInstanceWeight", readOnlyInstanceWeight);
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ModifyDBProxyEndpointRequest build() {
            return new ModifyDBProxyEndpointRequest(this);
        } 

    } 

}
