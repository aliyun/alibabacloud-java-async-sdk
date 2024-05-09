// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectionStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeConnectionStatusRequest</p>
 */
public class DescribeConnectionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointArchitecture")
    private String destinationEndpointArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointDatabaseName")
    private String destinationEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointIP")
    private String destinationEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointOracleSID")
    private String destinationEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPassword")
    private String destinationEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPort")
    private String destinationEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointArchitecture")
    private String sourceEndpointArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPort")
    private String sourceEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    private DescribeConnectionStatusRequest(Builder builder) {
        super(builder);
        this.destinationEndpointArchitecture = builder.destinationEndpointArchitecture;
        this.destinationEndpointDatabaseName = builder.destinationEndpointDatabaseName;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationEndpointIP = builder.destinationEndpointIP;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
        this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointPort = builder.destinationEndpointPort;
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceEndpointArchitecture = builder.sourceEndpointArchitecture;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpointArchitecture
     */
    public String getDestinationEndpointArchitecture() {
        return this.destinationEndpointArchitecture;
    }

    /**
     * @return destinationEndpointDatabaseName
     */
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    /**
     * @return destinationEndpointEngineName
     */
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    /**
     * @return destinationEndpointIP
     */
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    /**
     * @return destinationEndpointInstanceID
     */
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    /**
     * @return destinationEndpointInstanceType
     */
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    /**
     * @return destinationEndpointOracleSID
     */
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    /**
     * @return destinationEndpointPassword
     */
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    /**
     * @return destinationEndpointPort
     */
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    /**
     * @return destinationEndpointRegion
     */
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    /**
     * @return destinationEndpointUserName
     */
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
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
     * @return sourceEndpointArchitecture
     */
    public String getSourceEndpointArchitecture() {
        return this.sourceEndpointArchitecture;
    }

    /**
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    /**
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    /**
     * @return sourceEndpointIP
     */
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    /**
     * @return sourceEndpointInstanceID
     */
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    /**
     * @return sourceEndpointInstanceType
     */
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    /**
     * @return sourceEndpointOracleSID
     */
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    /**
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointPort
     */
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public static final class Builder extends Request.Builder<DescribeConnectionStatusRequest, Builder> {
        private String destinationEndpointArchitecture; 
        private String destinationEndpointDatabaseName; 
        private String destinationEndpointEngineName; 
        private String destinationEndpointIP; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointInstanceType; 
        private String destinationEndpointOracleSID; 
        private String destinationEndpointPassword; 
        private String destinationEndpointPort; 
        private String destinationEndpointRegion; 
        private String destinationEndpointUserName; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceEndpointArchitecture; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointEngineName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointPassword; 
        private String sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConnectionStatusRequest request) {
            super(request);
            this.destinationEndpointArchitecture = request.destinationEndpointArchitecture;
            this.destinationEndpointDatabaseName = request.destinationEndpointDatabaseName;
            this.destinationEndpointEngineName = request.destinationEndpointEngineName;
            this.destinationEndpointIP = request.destinationEndpointIP;
            this.destinationEndpointInstanceID = request.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = request.destinationEndpointInstanceType;
            this.destinationEndpointOracleSID = request.destinationEndpointOracleSID;
            this.destinationEndpointPassword = request.destinationEndpointPassword;
            this.destinationEndpointPort = request.destinationEndpointPort;
            this.destinationEndpointRegion = request.destinationEndpointRegion;
            this.destinationEndpointUserName = request.destinationEndpointUserName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceEndpointArchitecture = request.sourceEndpointArchitecture;
            this.sourceEndpointDatabaseName = request.sourceEndpointDatabaseName;
            this.sourceEndpointEngineName = request.sourceEndpointEngineName;
            this.sourceEndpointIP = request.sourceEndpointIP;
            this.sourceEndpointInstanceID = request.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = request.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = request.sourceEndpointOracleSID;
            this.sourceEndpointPassword = request.sourceEndpointPassword;
            this.sourceEndpointPort = request.sourceEndpointPort;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.sourceEndpointUserName = request.sourceEndpointUserName;
        } 

        /**
         * You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **Oracle**. Valid values:
         * <p>
         * 
         * *   **SID**: non-RAC architecture
         * *   **RAC**: Real Application Cluster (RAC) architecture
         * 
         * >  This parameter is optional. The data type of this parameter is String.
         */
        public Builder destinationEndpointArchitecture(String destinationEndpointArchitecture) {
            this.putQueryParameter("DestinationEndpointArchitecture", destinationEndpointArchitecture);
            this.destinationEndpointArchitecture = destinationEndpointArchitecture;
            return this;
        }

        /**
         * The name of the destination database or the authentication database.
         * <p>
         * 
         * > 
         * *   You must specify this parameter if the **DestinationEndpointEngineName** parameter is set to **PostgreSQL**, **DRDS**, or **MongoDB**. You must also specify this parameter if the **DestinationEndpointInstanceType** parameter is set to **PolarDB_o**.
         * *   If the **DestinationEndpointEngineName** parameter is set to **PostgreSQL** or **DRDS**, specify the name of the destination database. If the DestinationEndpointEngineName parameter is set to **MongoDB**, specify the name of the authentication database.
         * *   If the **DestinationEndpointInstanceType** parameter is set to **PolarDB_o**, specify the name of the destination database.
         */
        public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
            return this;
        }

        /**
         * The engine type of the destination database. Valid values: **MySQL**, **DRDS**, **SQLServer**, **PostgreSQL**, **PPAS**, **MongoDB**, and **Redis**.
         * <p>
         * 
         * >  You must specify this parameter only if the **DestinationEndpointInstanceType** parameter is set to **RDS**, **DRDS**, **ECS**, **LocalInstance**, or **Express**.
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * The endpoint of the destination database.
         * <p>
         * 
         * >  You must specify this parameter only if the **DestinationEndpointInstanceType** parameter is set to **LocalInstance** or **Express**.
         */
        public Builder destinationEndpointIP(String destinationEndpointIP) {
            this.putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
            this.destinationEndpointIP = destinationEndpointIP;
            return this;
        }

        /**
         * The ID of the destination instance.
         */
        public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }

        /**
         * The instance type of the destination database. Valid values:
         * <p>
         * 
         * > 
         * *   **ECS**: self-managed database that is hosted on Elastic Compute Service (ECS)
         * *   **LocalInstance**: self-managed database with a public IP address
         * *   **RDS**: ApsaraDB RDS instance
         * *   **DRDS**: PolarDB-X instance
         * *   **MongoDB**: ApsaraDB for MongoDB instance
         * *   **Redis**: ApsaraDB for Redis instance
         * *   **PetaData**: HybridDB for MySQL instance
         * *   **POLARDB**: PolarDB for MySQL cluster
         * *   **PolarDB_o**: PolarDB for Oracle cluster
         * *   **AnalyticDB**: AnalyticDB for MySQL cluster V3.0 or V2.0
         * *   **Greenplum**: AnalyticDB for PostgreSQL instance
         */
        public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }

        /**
         * You must specify this parameter only if the **DestinationEndpointEngineName** parameter is set to **Oracle**. Valid values:
         * <p>
         * 
         * *   **SID**: non-RAC architecture
         * *   **RAC**: RAC architecture
         * 
         * >  This parameter is optional. The data type of this parameter is String.
         */
        public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }

        /**
         * The password of the destination database account.
         */
        public Builder destinationEndpointPassword(String destinationEndpointPassword) {
            this.putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
            this.destinationEndpointPassword = destinationEndpointPassword;
            return this;
        }

        /**
         * The service port number of the source database.
         * <p>
         * 
         * >  You must specify this parameter only if the **SourceEndpointInstanceType** parameter is set to **ECS**, **LocalInstance**, or **Express**.
         */
        public Builder destinationEndpointPort(String destinationEndpointPort) {
            this.putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
            this.destinationEndpointPort = destinationEndpointPort;
            return this;
        }

        /**
         * The ID of the region where the destination instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            this.putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }

        /**
         * The database account of the destination database.
         * <p>
         * 
         * >  The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see [Overview of data migration scenarios](~~26618~~) and [Overview of data synchronization scenarios](~~130744~~).
         */
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            this.putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }

        /**
         * The ID of the region where the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
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
         * You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **Oracle**. Valid values:
         * <p>
         * 
         * *   **SID**: non-RAC architecture
         * *   **RAC**: RAC architecture
         * 
         * >  This parameter is optional.
         */
        public Builder sourceEndpointArchitecture(String sourceEndpointArchitecture) {
            this.putQueryParameter("SourceEndpointArchitecture", sourceEndpointArchitecture);
            this.sourceEndpointArchitecture = sourceEndpointArchitecture;
            return this;
        }

        /**
         * The name of the source database or the authentication database.
         * <p>
         * 
         * > 
         * *   You must specify this parameter if the **SourceEndpointEngineName** parameter is set to **PostgreSQL** or **MongoDB**. You must also specify this parameter if the **SourceEndpointInstanceType** parameter is set to **PolarDB_o**.
         * *   If the **SourceEndpointEngineName** parameter is set to **PostgreSQL** or **DRDS**, specify the name of the source database. If the SourceEndpointEngineName parameter is set to **MongoDB**, specify the name of the authentication database.
         * *   If the **SourceEndpointInstanceType** parameter is set to **PolarDB_o**, specify the name of the source database.
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * The engine type of the source database. Valid values: **MySQL**, **TiDB**, **SQLServer**, **PostgreSQL**, **Oracle**, **MongoDB**, and **Redis**.
         * <p>
         * 
         * >  Default value: **MySQL**.
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * The endpoint of the source database.
         * <p>
         * 
         * >  You must specify this parameter only if the **SourceEndpointInstanceType** parameter is set to **LocalInstance** or **Express**.
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * The ID of the source instance.
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * The type of the source instance. Valid values:
         * <p>
         * 
         * *   **RDS**: ApsaraDB RDS instance
         * *   **LocalInstance**: self-managed database with a public IP address
         * *   **ECS**: self-managed database that is hosted on ECS
         * *   **Express**: self-managed database that is connected over Express Connect
         * *   **dg**: self-managed database that is connected over Database Gateway
         * *   **MongoDB**: ApsaraDB for MongoDB instance
         * *   **POLARDB**: PolarDB for MySQL cluster
         * *   **PolarDB_o**: PolarDB for Oracle cluster
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * The SID of the Oracle database.
         * <p>
         * 
         * >  You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * The password of the source database account.
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * The service port number of the source database.
         * <p>
         * 
         * >  You must specify this parameter only if the **SourceEndpointInstanceType** parameter is set to **ECS**, **LocalInstance**, or **Express**.
         */
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * The ID of the region where the source instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * The database account of the source database.
         * <p>
         * 
         * >  The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see [Overview of data migration scenarios](~~26618~~) and [Overview of data synchronization scenarios](~~130744~~).
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        @Override
        public DescribeConnectionStatusRequest build() {
            return new DescribeConnectionStatusRequest(this);
        } 

    } 

}
