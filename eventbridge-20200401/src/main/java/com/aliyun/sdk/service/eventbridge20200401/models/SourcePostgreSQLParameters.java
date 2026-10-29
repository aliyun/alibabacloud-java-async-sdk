// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SourcePostgreSQLParameters} extends {@link TeaModel}
 *
 * <p>SourcePostgreSQLParameters</p>
 */
public class SourcePostgreSQLParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SnapshotMode")
    private String snapshotMode;

    @com.aliyun.core.annotation.NameInMap("TableNames")
    private String tableNames;

    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private SourcePostgreSQLParameters(Builder builder) {
        this.databaseName = builder.databaseName;
        this.hostName = builder.hostName;
        this.networkType = builder.networkType;
        this.password = builder.password;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.schemaName = builder.schemaName;
        this.securityGroupId = builder.securityGroupId;
        this.snapshotMode = builder.snapshotMode;
        this.tableNames = builder.tableNames;
        this.user = builder.user;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourcePostgreSQLParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return snapshotMode
     */
    public String getSnapshotMode() {
        return this.snapshotMode;
    }

    /**
     * @return tableNames
     */
    public String getTableNames() {
        return this.tableNames;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String databaseName; 
        private String hostName; 
        private String networkType; 
        private String password; 
        private Integer port; 
        private String regionId; 
        private String schemaName; 
        private String securityGroupId; 
        private String snapshotMode; 
        private String tableNames; 
        private String user; 
        private String vSwitchIds; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SourcePostgreSQLParameters model) {
            this.databaseName = model.databaseName;
            this.hostName = model.hostName;
            this.networkType = model.networkType;
            this.password = model.password;
            this.port = model.port;
            this.regionId = model.regionId;
            this.schemaName = model.schemaName;
            this.securityGroupId = model.securityGroupId;
            this.snapshotMode = model.snapshotMode;
            this.tableNames = model.tableNames;
            this.user = model.user;
            this.vSwitchIds = model.vSwitchIds;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The name of the PostgreSQL database to connect to.</p>
         * 
         * <strong>example:</strong>
         * <p>analytics_db</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The hostname or IP address of the PostgreSQL database server.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1xxxxx.pg.rds.aliyuncs.com</p>
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The network type used to connect to the PostgreSQL data source. Valid values: PublicNetwork (public network) and PrivateNetwork (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The password of the database connection user.</p>
         * 
         * <strong>example:</strong>
         * <p>your_password</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The connection port of the PostgreSQL database server.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The ID of the region where the PostgreSQL data source resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the PostgreSQL schema to synchronize.</p>
         * 
         * <strong>example:</strong>
         * <p>test_schema</p>
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The ID of the security group used to connect to the PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The snapshot mode used when PostgreSQL data synchronization is started for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>when_needed</p>
         */
        public Builder snapshotMode(String snapshotMode) {
            this.snapshotMode = snapshotMode;
            return this;
        }

        /**
         * <p>The names of the PostgreSQL tables to synchronize. Separate multiple table names with commas. Each table name must be in the {SchemaName}.{TableName} format.</p>
         * 
         * <strong>example:</strong>
         * <p>test_schema.test_table</p>
         */
        public Builder tableNames(String tableNames) {
            this.tableNames = tableNames;
            return this;
        }

        /**
         * <p>The username for the database connection.</p>
         * 
         * <strong>example:</strong>
         * <p>readonly_user</p>
         */
        public Builder user(String user) {
            this.user = user;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>[vsw-a1b2c3d4e5f6g7h8i9j0k]</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the VPC where the PostgreSQL instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public SourcePostgreSQLParameters build() {
            return new SourcePostgreSQLParameters(this);
        } 

    } 

}
