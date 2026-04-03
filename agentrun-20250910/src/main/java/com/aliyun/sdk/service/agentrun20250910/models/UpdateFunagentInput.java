// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateFunagentInput} extends {@link TeaModel}
 *
 * <p>UpdateFunagentInput</p>
 */
public class UpdateFunagentInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("adminName")
    private String adminName;

    @com.aliyun.core.annotation.NameInMap("adminSecret")
    private String adminSecret;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("dbConnections")
    private Integer dbConnections;

    @com.aliyun.core.annotation.NameInMap("dbHost")
    private String dbHost;

    @com.aliyun.core.annotation.NameInMap("dbInstanceId")
    private String dbInstanceId;

    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("dbPassword")
    private String dbPassword;

    @com.aliyun.core.annotation.NameInMap("dbPort")
    private Integer dbPort;

    @com.aliyun.core.annotation.NameInMap("dbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("dbUsername")
    private String dbUsername;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private UpdateFunagentInput(Builder builder) {
        this.adminName = builder.adminName;
        this.adminSecret = builder.adminSecret;
        this.cpu = builder.cpu;
        this.dbConnections = builder.dbConnections;
        this.dbHost = builder.dbHost;
        this.dbInstanceId = builder.dbInstanceId;
        this.dbName = builder.dbName;
        this.dbPassword = builder.dbPassword;
        this.dbPort = builder.dbPort;
        this.dbType = builder.dbType;
        this.dbUsername = builder.dbUsername;
        this.description = builder.description;
        this.memory = builder.memory;
        this.replicas = builder.replicas;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunagentInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminName
     */
    public String getAdminName() {
        return this.adminName;
    }

    /**
     * @return adminSecret
     */
    public String getAdminSecret() {
        return this.adminSecret;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return dbConnections
     */
    public Integer getDbConnections() {
        return this.dbConnections;
    }

    /**
     * @return dbHost
     */
    public String getDbHost() {
        return this.dbHost;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dbPassword
     */
    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * @return dbPort
     */
    public Integer getDbPort() {
        return this.dbPort;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return dbUsername
     */
    public String getDbUsername() {
        return this.dbUsername;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String adminName; 
        private String adminSecret; 
        private Float cpu; 
        private Integer dbConnections; 
        private String dbHost; 
        private String dbInstanceId; 
        private String dbName; 
        private String dbPassword; 
        private Integer dbPort; 
        private String dbType; 
        private String dbUsername; 
        private String description; 
        private Integer memory; 
        private Integer replicas; 
        private String version; 

        private Builder() {
        } 

        private Builder(UpdateFunagentInput model) {
            this.adminName = model.adminName;
            this.adminSecret = model.adminSecret;
            this.cpu = model.cpu;
            this.dbConnections = model.dbConnections;
            this.dbHost = model.dbHost;
            this.dbInstanceId = model.dbInstanceId;
            this.dbName = model.dbName;
            this.dbPassword = model.dbPassword;
            this.dbPort = model.dbPort;
            this.dbType = model.dbType;
            this.dbUsername = model.dbUsername;
            this.description = model.description;
            this.memory = model.memory;
            this.replicas = model.replicas;
            this.version = model.version;
        } 

        /**
         * adminName.
         */
        public Builder adminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        /**
         * <p>敏感字段</p>
         */
        public Builder adminSecret(String adminSecret) {
            this.adminSecret = adminSecret;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * dbConnections.
         */
        public Builder dbConnections(Integer dbConnections) {
            this.dbConnections = dbConnections;
            return this;
        }

        /**
         * dbHost.
         */
        public Builder dbHost(String dbHost) {
            this.dbHost = dbHost;
            return this;
        }

        /**
         * dbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>敏感字段</p>
         */
        public Builder dbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }

        /**
         * dbPort.
         */
        public Builder dbPort(Integer dbPort) {
            this.dbPort = dbPort;
            return this;
        }

        /**
         * dbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * dbUsername.
         */
        public Builder dbUsername(String dbUsername) {
            this.dbUsername = dbUsername;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * replicas.
         */
        public Builder replicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public UpdateFunagentInput build() {
            return new UpdateFunagentInput(this);
        } 

    } 

}
