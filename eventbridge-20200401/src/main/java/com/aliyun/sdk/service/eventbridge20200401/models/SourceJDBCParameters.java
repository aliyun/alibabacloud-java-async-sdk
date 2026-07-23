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
         * BatchSize.
         */
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * CustomQuery.
         */
        public Builder customQuery(String customQuery) {
            this.customQuery = customQuery;
            return this;
        }

        /**
         * IncrementingColumn.
         */
        public Builder incrementingColumn(String incrementingColumn) {
            this.incrementingColumn = incrementingColumn;
            return this;
        }

        /**
         * JdbcUrl.
         */
        public Builder jdbcUrl(String jdbcUrl) {
            this.jdbcUrl = jdbcUrl;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * PollingInterval.
         */
        public Builder pollingInterval(Integer pollingInterval) {
            this.pollingInterval = pollingInterval;
            return this;
        }

        /**
         * QueryMode.
         */
        public Builder queryMode(String queryMode) {
            this.queryMode = queryMode;
            return this;
        }

        /**
         * QueryTimeout.
         */
        public Builder queryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * TimestampColumn.
         */
        public Builder timestampColumn(String timestampColumn) {
            this.timestampColumn = timestampColumn;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * VpcId.
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
