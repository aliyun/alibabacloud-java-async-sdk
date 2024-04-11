// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSubscriptionInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSubscriptionInstanceRequest</p>
 */
public class ConfigureSubscriptionInstanceRequest extends Request {
    @Query
    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @Query
    @NameInMap("SubscriptionDataType")
    private SubscriptionDataType subscriptionDataType;

    @Query
    @NameInMap("SubscriptionInstance")
    private SubscriptionInstance subscriptionInstance;

    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    @Query
    @NameInMap("SubscriptionInstanceName")
    private String subscriptionInstanceName;

    @Query
    @NameInMap("SubscriptionInstanceNetworkType")
    private String subscriptionInstanceNetworkType;

    @Body
    @NameInMap("SubscriptionObject")
    @Validation(required = true)
    private String subscriptionObject;

    private ConfigureSubscriptionInstanceRequest(Builder builder) {
        super(builder);
        this.sourceEndpoint = builder.sourceEndpoint;
        this.subscriptionDataType = builder.subscriptionDataType;
        this.subscriptionInstance = builder.subscriptionInstance;
        this.accountId = builder.accountId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
        this.subscriptionInstanceName = builder.subscriptionInstanceName;
        this.subscriptionInstanceNetworkType = builder.subscriptionInstanceNetworkType;
        this.subscriptionObject = builder.subscriptionObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSubscriptionInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return subscriptionDataType
     */
    public SubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    /**
     * @return subscriptionInstance
     */
    public SubscriptionInstance getSubscriptionInstance() {
        return this.subscriptionInstance;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    /**
     * @return subscriptionInstanceName
     */
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    /**
     * @return subscriptionInstanceNetworkType
     */
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    /**
     * @return subscriptionObject
     */
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static final class Builder extends Request.Builder<ConfigureSubscriptionInstanceRequest, Builder> {
        private SourceEndpoint sourceEndpoint; 
        private SubscriptionDataType subscriptionDataType; 
        private SubscriptionInstance subscriptionInstance; 
        private String accountId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 
        private String subscriptionInstanceName; 
        private String subscriptionInstanceNetworkType; 
        private String subscriptionObject; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSubscriptionInstanceRequest request) {
            super(request);
            this.sourceEndpoint = request.sourceEndpoint;
            this.subscriptionDataType = request.subscriptionDataType;
            this.subscriptionInstance = request.subscriptionInstance;
            this.accountId = request.accountId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
            this.subscriptionInstanceName = request.subscriptionInstanceName;
            this.subscriptionInstanceNetworkType = request.subscriptionInstanceNetworkType;
            this.subscriptionObject = request.subscriptionObject;
        } 

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * SubscriptionDataType.
         */
        public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
            this.putQueryParameter("SubscriptionDataType", subscriptionDataType);
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }

        /**
         * SubscriptionInstance.
         */
        public Builder subscriptionInstance(SubscriptionInstance subscriptionInstance) {
            this.putQueryParameter("SubscriptionInstance", subscriptionInstance);
            this.subscriptionInstance = subscriptionInstance;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter is discontinued.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the region in which the change tracking instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * The ID of the change tracking instance. You can call the [DescribeSubscriptionInstances](~~49442~~) operation to query the instance ID.
         */
        public Builder subscriptionInstanceName(String subscriptionInstanceName) {
            this.putQueryParameter("SubscriptionInstanceName", subscriptionInstanceName);
            this.subscriptionInstanceName = subscriptionInstanceName;
            return this;
        }

        /**
         * The network type of the change tracking instance. Set the value to **vpc**. A value of vpc indicates the Virtual Private Cloud (VPC) network type.
         * <p>
         * 
         * > 
         * *   To use the new version of the change tracking feature, you must specify the SubscriptionInstanceNetworkType parameter. You must also specify the **SubscriptionInstance.VPCId** and **SubscriptionInstance.VSwitchID** parameters. If you do not specify the SubscriptionInstanceNetworkType parameter, the previous version of the change tracking feature is used.
         * *   The previous version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. The new version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.
         */
        public Builder subscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
            this.putQueryParameter("SubscriptionInstanceNetworkType", subscriptionInstanceNetworkType);
            this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
            return this;
        }

        /**
         * The objects for which you want to track data changes. The value is a JSON string and can contain regular expressions. For more information, see [SubscriptionObjects](~~141902~~).
         */
        public Builder subscriptionObject(String subscriptionObject) {
            this.putBodyParameter("SubscriptionObject", subscriptionObject);
            this.subscriptionObject = subscriptionObject;
            return this;
        }

        @Override
        public ConfigureSubscriptionInstanceRequest build() {
            return new ConfigureSubscriptionInstanceRequest(this);
        } 

    } 

    public static class SourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("OwnerID")
        private String ownerID;

        @NameInMap("Password")
        private String password;

        @NameInMap("Port")
        private String port;

        @NameInMap("Role")
        private String role;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.oracleSID = builder.oracleSID;
            this.ownerID = builder.ownerID;
            this.password = builder.password;
            this.port = builder.port;
            this.role = builder.role;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String ip; 
            private String instanceID; 
            private String instanceType; 
            private String oracleSID; 
            private String ownerID; 
            private String password; 
            private String port; 
            private String role; 
            private String userName; 

            /**
             * The name of the source database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The IP address of the source database.
             * <p>
             * 
             * >  This parameter is required only when the source database is a self-managed database.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the source database.
             * <p>
             * 
             * >  This parameter is required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source database. Valid values:
             * <p>
             * 
             * *   **RDS**: ApsaraDB RDS for MySQL instance
             * *   **PolarDB**: PolarDB for MySQL cluster
             * *   **LocalInstance**: self-managed database with a public IP address
             * *   **ECS**: self-managed database hosted on an Elastic Compute Service (ECS) instance
             * *   **Express**: self-managed database connected over Express Connect
             * *   **CEN**: self-managed database connected over Cloud Enterprise Network (CEN)
             * *   **dg**: self-managed database connected over Database Gateway
             * 
             * >  The engine of a self-managed database can be MySQL or Oracle. You must specify the engine type when you call the [CreateSubscriptionInstance](~~49436~~) operation.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is required only when the source database is a self-managed Oracle database and is not deployed in the Real Application Clusters (RAC) architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the source database belongs.
             * <p>
             * 
             * >  This parameter is required only when you track data changes across different Alibaba Cloud accounts.
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * The password of the account that is used to connect to the source database.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The service port number of the source database.
             * <p>
             * 
             * >  This parameter is required only when the source database is a self-managed database.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The RAM role that is authorized to access the source database. This parameter is required if the source database does not belong to the Alibaba Cloud account that you use to configure the change tracking instance. In this case, you must authorize the Alibaba Cloud account to access the source database by using a RAM role.
             * <p>
             * 
             * >  For more information about the permissions that are required for the RAM role and how to grant permissions to the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The username of the account that is used to connect to the source database.
             * <p>
             * 
             * >  The permissions that are required for the database account vary with the change tracking scenario. For more information, see [Overview of change tracking scenarios](~~145715~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    public static class SubscriptionDataType extends TeaModel {
        @NameInMap("DDL")
        @Validation(required = true)
        private Boolean DDL;

        @NameInMap("DML")
        @Validation(required = true)
        private Boolean DML;

        private SubscriptionDataType(Builder builder) {
            this.DDL = builder.DDL;
            this.DML = builder.DML;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return DDL
         */
        public Boolean getDDL() {
            return this.DDL;
        }

        /**
         * @return DML
         */
        public Boolean getDML() {
            return this.DML;
        }

        public static final class Builder {
            private Boolean DDL; 
            private Boolean DML; 

            /**
             * Specifies whether to track DDL statements. Default value: true. Valid values:
             * <p>
             * 
             * *   **true**: tracks DDL statements.
             * *   **false**: does not track DDL statements.
             */
            public Builder DDL(Boolean DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * Specifies whether to track DML statements. Default value: true. Valid values:
             * <p>
             * 
             * *   **true**: tracks DML statements.
             * *   **false**: does not tack DML statements.
             */
            public Builder DML(Boolean DML) {
                this.DML = DML;
                return this;
            }

            public SubscriptionDataType build() {
                return new SubscriptionDataType(this);
            } 

        } 

    }
    public static class SubscriptionInstance extends TeaModel {
        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private SubscriptionInstance(Builder builder) {
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionInstance create() {
            return builder().build();
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String VPCId; 
            private String vSwitchId; 

            /**
             * The ID of the VPC in which the change tracking instance is deployed.
             * <p>
             * 
             * >  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch in the specified VPC.
             * <p>
             * 
             * >  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public SubscriptionInstance build() {
                return new SubscriptionInstance(this);
            } 

        } 

    }
}
