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
 * {@link SourceJDBCParameters} extends {@link TeaModel}
 *
 * <p>SourceJDBCParameters</p>
 */
public class SourceJDBCParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchSize")
    private Integer batchSize;

    @com.aliyun.core.annotation.NameInMap("CustomQuery")
    private String customQuery;

    @com.aliyun.core.annotation.NameInMap("IncrementingColumn")
    private String incrementingColumn;

    @com.aliyun.core.annotation.NameInMap("JdbcUrl")
    private String jdbcUrl;

    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("PollingInterval")
    private Integer pollingInterval;

    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.NameInMap("QueryTimeout")
    private Integer queryTimeout;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("TimestampColumn")
    private String timestampColumn;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private SourceJDBCParameters(Builder builder) {
        this.batchSize = builder.batchSize;
        this.customQuery = builder.customQuery;
        this.incrementingColumn = builder.incrementingColumn;
        this.jdbcUrl = builder.jdbcUrl;
        this.network = builder.network;
        this.password = builder.password;
        this.pollingInterval = builder.pollingInterval;
        this.queryMode = builder.queryMode;
        this.queryTimeout = builder.queryTimeout;
        this.securityGroupId = builder.securityGroupId;
        this.tableName = builder.tableName;
        this.timestampColumn = builder.timestampColumn;
        this.username = builder.username;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceJDBCParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchSize
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return customQuery
     */
    public String getCustomQuery() {
        return this.customQuery;
    }

    /**
     * @return incrementingColumn
     */
    public String getIncrementingColumn() {
        return this.incrementingColumn;
    }

    /**
     * @return jdbcUrl
     */
    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return this.pollingInterval;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return queryTimeout
     */
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return timestampColumn
     */
    public String getTimestampColumn() {
        return this.timestampColumn;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
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
        private Integer batchSize; 
        private String customQuery; 
        private String incrementingColumn; 
        private String jdbcUrl; 
        private String network; 
        private String password; 
        private Integer pollingInterval; 
        private String queryMode; 
        private Integer queryTimeout; 
        private String securityGroupId; 
        private String tableName; 
        private String timestampColumn; 
        private String username; 
        private String vSwitchIds; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SourceJDBCParameters model) {
            this.batchSize = model.batchSize;
            this.customQuery = model.customQuery;
            this.incrementingColumn = model.incrementingColumn;
            this.jdbcUrl = model.jdbcUrl;
            this.network = model.network;
            this.password = model.password;
            this.pollingInterval = model.pollingInterval;
            this.queryMode = model.queryMode;
            this.queryTimeout = model.queryTimeout;
            this.securityGroupId = model.securityGroupId;
            this.tableName = model.tableName;
            this.timestampColumn = model.timestampColumn;
            this.username = model.username;
            this.vSwitchIds = model.vSwitchIds;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The maximum number of rows returned per query. Default value: 1000. Maximum value: 10000.</p>
         */
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * <p>The custom SQL query statement (advanced mode). This parameter is mutually exclusive with TableName.</p>
         */
        public Builder customQuery(String customQuery) {
            this.customQuery = customQuery;
            return this;
        }

        /**
         * <p>The incrementing column name. Required when QueryMode is set to <code>incrementing</code> or <code>timestamp_incrementing</code>.</p>
         */
        public Builder incrementingColumn(String incrementingColumn) {
            this.incrementingColumn = incrementingColumn;
            return this;
        }

        /**
         * <p>The JDBC connection URL. ClickHouse example: <code>jdbc:clickhouse://host:8123/database</code>; MySQL example: <code>jdbc:mysql://host:3306/database</code>. The system automatically identifies the database type.</p>
         */
        public Builder jdbcUrl(String jdbcUrl) {
            this.jdbcUrl = jdbcUrl;
            return this;
        }

        /**
         * <p>The network type. Valid values: <code>PublicNetwork</code> (public network); <code>PrivateNetwork</code> (VPC private network, requires VpcId, VSwitchIds, and SecurityGroupId to be configured).</p>
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * <p>The database password.</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The polling interval, in seconds. Minimum value: 10. Default value: 60.</p>
         */
        public Builder pollingInterval(Integer pollingInterval) {
            this.pollingInterval = pollingInterval;
            return this;
        }

        /**
         * <p>The query mode. Valid values: <code>bulk</code> (full query); <code>incrementing</code> (incrementing column tracking); <code>timestamp</code> (timestamp tracking); <code>timestamp_incrementing</code> (timestamp and incrementing column dual tracking).</p>
         */
        public Builder queryMode(String queryMode) {
            this.queryMode = queryMode;
            return this;
        }

        /**
         * <p>The SQL query timeout period, in seconds. Default value: 30. Maximum value: 300.</p>
         */
        public Builder queryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * <p>The security group ID. Required when Network is set to PrivateNetwork.</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The target table name. This parameter is mutually exclusive with CustomQuery. Required when custom SQL is not used.</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The timestamp column name. Required when QueryMode is set to <code>timestamp</code> or <code>timestamp_incrementing</code>.</p>
         */
        public Builder timestampColumn(String timestampColumn) {
            this.timestampColumn = timestampColumn;
            return this;
        }

        /**
         * <p>The database username.</p>
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * <p>The vSwitch ID. Required when Network is set to PrivateNetwork.</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The VPC ID. Required when Network is set to PrivateNetwork.</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public SourceJDBCParameters build() {
            return new SourceJDBCParameters(this);
        } 

    } 

}
