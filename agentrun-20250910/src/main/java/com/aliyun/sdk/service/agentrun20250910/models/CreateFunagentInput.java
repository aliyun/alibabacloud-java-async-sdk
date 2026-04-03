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
 * {@link CreateFunagentInput} extends {@link TeaModel}
 *
 * <p>CreateFunagentInput</p>
 */
public class CreateFunagentInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("adminName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminName;

    @com.aliyun.core.annotation.NameInMap("adminSecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminSecret;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("dbConnections")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dbConnections;

    @com.aliyun.core.annotation.NameInMap("dbHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbHost;

    @com.aliyun.core.annotation.NameInMap("dbInstanceId")
    private String dbInstanceId;

    @com.aliyun.core.annotation.NameInMap("dbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("dbPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbPassword;

    @com.aliyun.core.annotation.NameInMap("dbPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dbPort;

    @com.aliyun.core.annotation.NameInMap("dbType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("dbUsername")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbUsername;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.NameInMap("funAgentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String funAgentName;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("replicas")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer replicas;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("vswitchIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vswitchIds;

    private CreateFunagentInput(Builder builder) {
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
        this.funAgentName = builder.funAgentName;
        this.memory = builder.memory;
        this.regionId = builder.regionId;
        this.replicas = builder.replicas;
        this.securityGroupId = builder.securityGroupId;
        this.vpcId = builder.vpcId;
        this.vswitchIds = builder.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunagentInput create() {
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
     * @return funAgentName
     */
    public String getFunAgentName() {
        return this.funAgentName;
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
        private Integer dbConnections; 
        private String dbHost; 
        private String dbInstanceId; 
        private String dbName; 
        private String dbPassword; 
        private Integer dbPort; 
        private String dbType; 
        private String dbUsername; 
        private String description; 
        private String funAgentName; 
        private Integer memory; 
        private String regionId; 
        private Integer replicas; 
        private String securityGroupId; 
        private String vpcId; 
        private String vswitchIds; 

        private Builder() {
        } 

        private Builder(CreateFunagentInput model) {
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
            this.funAgentName = model.funAgentName;
            this.memory = model.memory;
            this.regionId = model.regionId;
            this.replicas = model.replicas;
            this.securityGroupId = model.securityGroupId;
            this.vpcId = model.vpcId;
            this.vswitchIds = model.vswitchIds;
        } 

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder adminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder adminSecret(String adminSecret) {
            this.adminSecret = adminSecret;
            return this;
        }

        /**
         * <p><code>float64</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p><code>int32</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbConnections(Integer dbConnections) {
            this.dbConnections = dbConnections;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbHost(String dbHost) {
            this.dbHost = dbHost;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }

        /**
         * <p><code>int32</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbPort(Integer dbPort) {
            this.dbPort = dbPort;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder dbUsername(String dbUsername) {
            this.dbUsername = dbUsername;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder funAgentName(String funAgentName) {
            this.funAgentName = funAgentName;
            return this;
        }

        /**
         * <p><code>int32</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>可选； <code>omitempty</code></p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p><code>int32</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder replicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p><code>string</code>，必填</p>
         * <p>This parameter is required.</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p><code>string</code>，必填；JSON 数组 [{vswitchId, zoneId}]（core 解码为 <code>*string</code> 但校验非空）</p>
         * <p>This parameter is required.</p>
         */
        public Builder vswitchIds(String vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }

        public CreateFunagentInput build() {
            return new CreateFunagentInput(this);
        } 

    } 

}
