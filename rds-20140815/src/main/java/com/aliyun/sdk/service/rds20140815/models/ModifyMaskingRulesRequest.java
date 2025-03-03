// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyMaskingRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifyMaskingRulesRequest</p>
 */
public class ModifyMaskingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAlgo")
    private String defaultAlgo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private String enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaskingAlgo")
    private String maskingAlgo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    private RuleConfig ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private ModifyMaskingRulesRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.DBName = builder.DBName;
        this.defaultAlgo = builder.defaultAlgo;
        this.enabled = builder.enabled;
        this.maskingAlgo = builder.maskingAlgo;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleConfig = builder.ruleConfig;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMaskingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return defaultAlgo
     */
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    /**
     * @return enabled
     */
    public String getEnabled() {
        return this.enabled;
    }

    /**
     * @return maskingAlgo
     */
    public String getMaskingAlgo() {
        return this.maskingAlgo;
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

    /**
     * @return ruleConfig
     */
    public RuleConfig getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ModifyMaskingRulesRequest, Builder> {
        private String DBInstanceName; 
        private String DBName; 
        private String defaultAlgo; 
        private String enabled; 
        private String maskingAlgo; 
        private String ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private RuleConfig ruleConfig; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMaskingRulesRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.DBName = request.DBName;
            this.defaultAlgo = request.defaultAlgo;
            this.enabled = request.enabled;
            this.maskingAlgo = request.maskingAlgo;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleConfig = request.ruleConfig;
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * DefaultAlgo.
         */
        public Builder defaultAlgo(String defaultAlgo) {
            this.putQueryParameter("DefaultAlgo", defaultAlgo);
            this.defaultAlgo = defaultAlgo;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(String enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * MaskingAlgo.
         */
        public Builder maskingAlgo(String maskingAlgo) {
            this.putQueryParameter("MaskingAlgo", maskingAlgo);
            this.maskingAlgo = maskingAlgo;
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

        /**
         * RuleConfig.
         */
        public Builder ruleConfig(RuleConfig ruleConfig) {
            String ruleConfigShrink = shrink(ruleConfig, "RuleConfig", "json");
            this.putQueryParameter("RuleConfig", ruleConfigShrink);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public ModifyMaskingRulesRequest build() {
            return new ModifyMaskingRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyMaskingRulesRequest} extends {@link TeaModel}
     *
     * <p>ModifyMaskingRulesRequest</p>
     */
    public static class RuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List<String> databases;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        private RuleConfig(Builder builder) {
            this.columns = builder.columns;
            this.databases = builder.databases;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConfig create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return databases
         */
        public java.util.List<String> getDatabases() {
            return this.databases;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private java.util.List<String> databases; 
            private java.util.List<String> tables; 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Databases.
             */
            public Builder databases(java.util.List<String> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            public RuleConfig build() {
                return new RuleConfig(this);
            } 

        } 

    }
}
