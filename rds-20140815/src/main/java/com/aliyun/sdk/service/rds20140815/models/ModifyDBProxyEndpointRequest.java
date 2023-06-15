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
         * The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: `Feature 1:Status;Feature 2:Status;...`. Do not add a semicolon (;) at the end of the last value.
         * <p>
         * 
         * Valid feature values:
         * 
         * *   **ReadWriteSpliting**: read/write splitting
         * *   **ConnectionPersist**: connection pooling
         * *   **TransactionReadSqlRouteOptimizeStatus**: transaction splitting
         * 
         * Valid status values:
         * 
         * *   **1**: enabled
         * *   **0**: disabled
         * 
         * > If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by **ReadWriteSpliting**.
         */
        public Builder configDBProxyFeatures(String configDBProxyFeatures) {
            this.putQueryParameter("ConfigDBProxyFeatures", configDBProxyFeatures);
            this.configDBProxyFeatures = configDBProxyFeatures;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the proxy endpoint. You can call the [DescribeDBProxyEndpoint](~~140955~~) operation to query the ID of the proxy endpoint.
         * <p>
         * 
         * > 
         * 
         * *   If the instance runs MySQL and you set **DbEndpointOperator** to **Delete** or **Modify**, you must specify DBProxyEndpointId.
         * 
         * *   If the instance runs PostgreSQL and you set **DbEndpointOperator** to **Delete**, **Modify**, or **Create**, you must specify DBProxyEndpointId.
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.putQueryParameter("DBProxyEndpointId", DBProxyEndpointId);
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * An internal parameter. You do not need to specify this parameter.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * The description of the proxy terminal.
         */
        public Builder dbEndpointAliases(String dbEndpointAliases) {
            this.putQueryParameter("DbEndpointAliases", dbEndpointAliases);
            this.dbEndpointAliases = dbEndpointAliases;
            return this;
        }

        /**
         * The type of operation that you want to perform. Valid values:
         * <p>
         * 
         * *   **Modify**: Modify a proxy terminal. This is the default value.
         * *   **Create**: Create a proxy terminal.
         * *   **Delete**: Delete a proxy terminal.
         */
        public Builder dbEndpointOperator(String dbEndpointOperator) {
            this.putQueryParameter("DbEndpointOperator", dbEndpointOperator);
            this.dbEndpointOperator = dbEndpointOperator;
            return this;
        }

        /**
         * The read and write attributes of the proxy terminal. Valid values:
         * <p>
         * 
         * *   **ReadWrite**: The proxy terminal connects to the primary instance and can receive both read and write requests.
         * *   **ReadOnly**: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
         * 
         * > 
         * 
         * *   If you set **DbEndpointOperator** to **Create**, you must also specify DbEndpointReadWriteMode.
         * 
         * *   If the instance runs MySQL and you change the value of this parameter from **ReadWrite** to **ReadOnly**, the transaction splitting feature is disabled.
         */
        public Builder dbEndpointReadWriteMode(String dbEndpointReadWriteMode) {
            this.putQueryParameter("DbEndpointReadWriteMode", dbEndpointReadWriteMode);
            this.dbEndpointReadWriteMode = dbEndpointReadWriteMode;
            return this;
        }

        /**
         * The type of the proxy terminal. This is a reserved parameter. You do not need to specify this parameter.
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
         * The policy that is used to allocate read weights. Valid values:
         * <p>
         * 
         * *   **Standard**: The system automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
         * *   **Custom**: You must manually allocate read weights to the instance and its read-only instances.
         * 
         * > You must specify this parameter only when the read/write splitting feature is enabled. For more information about the permission allocation policy, see [Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances](~~96076~~) and [Enable and configure the database proxy feature for an ApsaraDB RDS for PostgreSQL instance](~~418272~~).
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            this.putQueryParameter("ReadOnlyInstanceDistributionType", readOnlyInstanceDistributionType);
            this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * The latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, the system no longer forwards read requests to the read-only instance. Unit: seconds If you do not specify this parameter, the original value of this parameter is retained. Valid values: **0** to **3600**. Default value: **30**.
         * <p>
         * 
         * > You must specify this parameter only when the read/write splitting feature is enabled.
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.putQueryParameter("ReadOnlyInstanceMaxDelayTime", readOnlyInstanceMaxDelayTime);
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * The read weights of the instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10000. Formats:
         * <p>
         * 
         * *   Standard instance: `{"ID of the primary instance":"Weight","ID of the read-only instance":"Weight"...}`
         * 
         *     Example: `{"rm-uf6wjk5xxxx":"500","rr-tfhfgk5xxx":"200"...}`
         * 
         * *   Instance on RDS Cluster Edition: `{"ID of the read-only instance ID":"Weight","DBClusterNode":{"ID of the primary node":"Weight","ID of the secondary node ID":"Weight","ID of the secondary node ID":"Weight"...}}`
         * 
         *     Example: `{"rr-tfhfgk5xxx":"200","DBClusterNode":{"rn-2z****":"0","rn-2z****":"400","rn-2z****":"400"...}}`
         * 
         *     **
         * 
         *     **Note****DBClusterNode** is required if the instance runs RDS Cluster Edition. The DBClusterNode parameter includes information about **IDs** and **weights** of the primary and secondary nodes.
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.putQueryParameter("ReadOnlyInstanceWeight", readOnlyInstanceWeight);
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query most recent region list.
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
