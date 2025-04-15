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

}
