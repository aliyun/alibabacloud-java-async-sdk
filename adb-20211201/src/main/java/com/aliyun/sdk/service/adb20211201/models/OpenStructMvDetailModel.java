// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link OpenStructMvDetailModel} extends {@link TeaModel}
 *
 * <p>OpenStructMvDetailModel</p>
 */
public class OpenStructMvDetailModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaseTableInfos")
    private java.util.List<BaseTableInfos> baseTableInfos;

    @com.aliyun.core.annotation.NameInMap("BaseTableNames")
    private java.util.List<java.util.List<String>> baseTableNames;

    @com.aliyun.core.annotation.NameInMap("ExplicitHit")
    private Long explicitHit;

    @com.aliyun.core.annotation.NameInMap("FirstRefreshTime")
    private String firstRefreshTime;

    @com.aliyun.core.annotation.NameInMap("ImplicitHit")
    private Long implicitHit;

    @com.aliyun.core.annotation.NameInMap("IsInactive")
    private Boolean isInactive;

    @com.aliyun.core.annotation.NameInMap("LocalSize")
    private Long localSize;

    @com.aliyun.core.annotation.NameInMap("QueryRewriteEnabled")
    private Boolean queryRewriteEnabled;

    @com.aliyun.core.annotation.NameInMap("RefreshInterval")
    private String refreshInterval;

    @com.aliyun.core.annotation.NameInMap("RefreshState")
    private String refreshState;

    @com.aliyun.core.annotation.NameInMap("RemoteSize")
    private Long remoteSize;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private OpenStructMvDetailModel(Builder builder) {
        this.baseTableInfos = builder.baseTableInfos;
        this.baseTableNames = builder.baseTableNames;
        this.explicitHit = builder.explicitHit;
        this.firstRefreshTime = builder.firstRefreshTime;
        this.implicitHit = builder.implicitHit;
        this.isInactive = builder.isInactive;
        this.localSize = builder.localSize;
        this.queryRewriteEnabled = builder.queryRewriteEnabled;
        this.refreshInterval = builder.refreshInterval;
        this.refreshState = builder.refreshState;
        this.remoteSize = builder.remoteSize;
        this.resourceGroup = builder.resourceGroup;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructMvDetailModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseTableInfos
     */
    public java.util.List<BaseTableInfos> getBaseTableInfos() {
        return this.baseTableInfos;
    }

    /**
     * @return baseTableNames
     */
    public java.util.List<java.util.List<String>> getBaseTableNames() {
        return this.baseTableNames;
    }

    /**
     * @return explicitHit
     */
    public Long getExplicitHit() {
        return this.explicitHit;
    }

    /**
     * @return firstRefreshTime
     */
    public String getFirstRefreshTime() {
        return this.firstRefreshTime;
    }

    /**
     * @return implicitHit
     */
    public Long getImplicitHit() {
        return this.implicitHit;
    }

    /**
     * @return isInactive
     */
    public Boolean getIsInactive() {
        return this.isInactive;
    }

    /**
     * @return localSize
     */
    public Long getLocalSize() {
        return this.localSize;
    }

    /**
     * @return queryRewriteEnabled
     */
    public Boolean getQueryRewriteEnabled() {
        return this.queryRewriteEnabled;
    }

    /**
     * @return refreshInterval
     */
    public String getRefreshInterval() {
        return this.refreshInterval;
    }

    /**
     * @return refreshState
     */
    public String getRefreshState() {
        return this.refreshState;
    }

    /**
     * @return remoteSize
     */
    public Long getRemoteSize() {
        return this.remoteSize;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private java.util.List<BaseTableInfos> baseTableInfos; 
        private java.util.List<java.util.List<String>> baseTableNames; 
        private Long explicitHit; 
        private String firstRefreshTime; 
        private Long implicitHit; 
        private Boolean isInactive; 
        private Long localSize; 
        private Boolean queryRewriteEnabled; 
        private String refreshInterval; 
        private String refreshState; 
        private Long remoteSize; 
        private String resourceGroup; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(OpenStructMvDetailModel model) {
            this.baseTableInfos = model.baseTableInfos;
            this.baseTableNames = model.baseTableNames;
            this.explicitHit = model.explicitHit;
            this.firstRefreshTime = model.firstRefreshTime;
            this.implicitHit = model.implicitHit;
            this.isInactive = model.isInactive;
            this.localSize = model.localSize;
            this.queryRewriteEnabled = model.queryRewriteEnabled;
            this.refreshInterval = model.refreshInterval;
            this.refreshState = model.refreshState;
            this.remoteSize = model.remoteSize;
            this.resourceGroup = model.resourceGroup;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * BaseTableInfos.
         */
        public Builder baseTableInfos(java.util.List<BaseTableInfos> baseTableInfos) {
            this.baseTableInfos = baseTableInfos;
            return this;
        }

        /**
         * BaseTableNames.
         */
        public Builder baseTableNames(java.util.List<java.util.List<String>> baseTableNames) {
            this.baseTableNames = baseTableNames;
            return this;
        }

        /**
         * ExplicitHit.
         */
        public Builder explicitHit(Long explicitHit) {
            this.explicitHit = explicitHit;
            return this;
        }

        /**
         * FirstRefreshTime.
         */
        public Builder firstRefreshTime(String firstRefreshTime) {
            this.firstRefreshTime = firstRefreshTime;
            return this;
        }

        /**
         * ImplicitHit.
         */
        public Builder implicitHit(Long implicitHit) {
            this.implicitHit = implicitHit;
            return this;
        }

        /**
         * IsInactive.
         */
        public Builder isInactive(Boolean isInactive) {
            this.isInactive = isInactive;
            return this;
        }

        /**
         * LocalSize.
         */
        public Builder localSize(Long localSize) {
            this.localSize = localSize;
            return this;
        }

        /**
         * QueryRewriteEnabled.
         */
        public Builder queryRewriteEnabled(Boolean queryRewriteEnabled) {
            this.queryRewriteEnabled = queryRewriteEnabled;
            return this;
        }

        /**
         * RefreshInterval.
         */
        public Builder refreshInterval(String refreshInterval) {
            this.refreshInterval = refreshInterval;
            return this;
        }

        /**
         * RefreshState.
         */
        public Builder refreshState(String refreshState) {
            this.refreshState = refreshState;
            return this;
        }

        /**
         * RemoteSize.
         */
        public Builder remoteSize(Long remoteSize) {
            this.remoteSize = remoteSize;
            return this;
        }

        /**
         * ResourceGroup.
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * UpdatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public OpenStructMvDetailModel build() {
            return new OpenStructMvDetailModel(this);
        } 

    } 

    /**
     * 
     * {@link OpenStructMvDetailModel} extends {@link TeaModel}
     *
     * <p>OpenStructMvDetailModel</p>
     */
    public static class BaseTableInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseTableIsMv")
        private Boolean baseTableIsMv;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private BaseTableInfos(Builder builder) {
            this.baseTableIsMv = builder.baseTableIsMv;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseTableInfos create() {
            return builder().build();
        }

        /**
         * @return baseTableIsMv
         */
        public Boolean getBaseTableIsMv() {
            return this.baseTableIsMv;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Boolean baseTableIsMv; 
            private String schemaName; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(BaseTableInfos model) {
                this.baseTableIsMv = model.baseTableIsMv;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
            } 

            /**
             * BaseTableIsMv.
             */
            public Builder baseTableIsMv(Boolean baseTableIsMv) {
                this.baseTableIsMv = baseTableIsMv;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public BaseTableInfos build() {
                return new BaseTableInfos(this);
            } 

        } 

    }
}
