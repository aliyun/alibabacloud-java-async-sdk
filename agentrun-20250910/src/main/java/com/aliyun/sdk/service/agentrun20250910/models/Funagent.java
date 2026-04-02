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
 * {@link Funagent} extends {@link TeaModel}
 *
 * <p>Funagent</p>
 */
public class Funagent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("adminName")
    private String adminName;

    @com.aliyun.core.annotation.NameInMap("adminSecret")
    private String adminSecret;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("dbConnections")
    private Integer dbConnections;

    @com.aliyun.core.annotation.NameInMap("dbHost")
    private String dbHost;

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

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("funagentId")
    private String funagentId;

    @com.aliyun.core.annotation.NameInMap("funagentName")
    private String funagentName;

    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("vswitchIds")
    private String vswitchIds;

    private Funagent(Builder builder) {
        this.adminName = builder.adminName;
        this.adminSecret = builder.adminSecret;
        this.cpu = builder.cpu;
        this.createdAt = builder.createdAt;
        this.dbConnections = builder.dbConnections;
        this.dbHost = builder.dbHost;
        this.dbName = builder.dbName;
        this.dbPassword = builder.dbPassword;
        this.dbPort = builder.dbPort;
        this.dbType = builder.dbType;
        this.dbUsername = builder.dbUsername;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.funagentId = builder.funagentId;
        this.funagentName = builder.funagentName;
        this.imageUrl = builder.imageUrl;
        this.memory = builder.memory;
        this.regionId = builder.regionId;
        this.replicas = builder.replicas;
        this.securityGroupId = builder.securityGroupId;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.updatedAt = builder.updatedAt;
        this.version = builder.version;
        this.vpcId = builder.vpcId;
        this.vswitchIds = builder.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Funagent create() {
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
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return funagentId
     */
    public String getFunagentId() {
        return this.funagentId;
    }

    /**
     * @return funagentName
     */
    public String getFunagentName() {
        return this.funagentName;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchIds
     */
    public String getVswitchIds() {
        return this.vswitchIds;
    }

    public static final class Builder {
        private String adminName; 
        private String adminSecret; 
        private Float cpu; 
        private String createdAt; 
        private Integer dbConnections; 
        private String dbHost; 
        private String dbName; 
        private String dbPassword; 
        private Integer dbPort; 
        private String dbType; 
        private String dbUsername; 
        private String description; 
        private String endpoint; 
        private String funagentId; 
        private String funagentName; 
        private String imageUrl; 
        private Integer memory; 
        private String regionId; 
        private Integer replicas; 
        private String securityGroupId; 
        private String status; 
        private String tenantId; 
        private String updatedAt; 
        private String version; 
        private String vpcId; 
        private String vswitchIds; 

        private Builder() {
        } 

        private Builder(Funagent model) {
            this.adminName = model.adminName;
            this.adminSecret = model.adminSecret;
            this.cpu = model.cpu;
            this.createdAt = model.createdAt;
            this.dbConnections = model.dbConnections;
            this.dbHost = model.dbHost;
            this.dbName = model.dbName;
            this.dbPassword = model.dbPassword;
            this.dbPort = model.dbPort;
            this.dbType = model.dbType;
            this.dbUsername = model.dbUsername;
            this.description = model.description;
            this.endpoint = model.endpoint;
            this.funagentId = model.funagentId;
            this.funagentName = model.funagentName;
            this.imageUrl = model.imageUrl;
            this.memory = model.memory;
            this.regionId = model.regionId;
            this.replicas = model.replicas;
            this.securityGroupId = model.securityGroupId;
            this.status = model.status;
            this.tenantId = model.tenantId;
            this.updatedAt = model.updatedAt;
            this.version = model.version;
            this.vpcId = model.vpcId;
            this.vswitchIds = model.vswitchIds;
        } 

        /**
         * adminName.
         */
        public Builder adminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        /**
         * <p>敏感；响应中应脱敏</p>
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
         * <p>ISO 8601</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>敏感；响应中应脱敏</p>
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
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>UUID 字符串</p>
         */
        public Builder funagentId(String funagentId) {
            this.funagentId = funagentId;
            return this;
        }

        /**
         * funagentName.
         */
        public Builder funagentName(String funagentName) {
            this.funagentName = funagentName;
            return this;
        }

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * securityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>ISO 8601</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>与存储一致时为 JSON 字符串</p>
         */
        public Builder vswitchIds(String vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }

        public Funagent build() {
            return new Funagent(this);
        } 

    } 

}
