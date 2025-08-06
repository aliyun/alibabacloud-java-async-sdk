// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetCustomerConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCustomerConfigRequest</p>
 */
public class SetCustomerConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIConfig")
    private String AIConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditConfig")
    private String auditConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
    private String downloadSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricConfig")
    private String metricConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SetCustomerConfigRequest(Builder builder) {
        super(builder);
        this.AIConfig = builder.AIConfig;
        this.appId = builder.appId;
        this.auditConfig = builder.auditConfig;
        this.downloadSwitch = builder.downloadSwitch;
        this.metricConfig = builder.metricConfig;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCustomerConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIConfig
     */
    public String getAIConfig() {
        return this.AIConfig;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return auditConfig
     */
    public String getAuditConfig() {
        return this.auditConfig;
    }

    /**
     * @return downloadSwitch
     */
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    /**
     * @return metricConfig
     */
    public String getMetricConfig() {
        return this.metricConfig;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<SetCustomerConfigRequest, Builder> {
        private String AIConfig; 
        private String appId; 
        private String auditConfig; 
        private String downloadSwitch; 
        private String metricConfig; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SetCustomerConfigRequest request) {
            super(request);
            this.AIConfig = request.AIConfig;
            this.appId = request.appId;
            this.auditConfig = request.auditConfig;
            this.downloadSwitch = request.downloadSwitch;
            this.metricConfig = request.metricConfig;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AIConfig.
         */
        public Builder AIConfig(String AIConfig) {
            this.putQueryParameter("AIConfig", AIConfig);
            this.AIConfig = AIConfig;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AuditConfig.
         */
        public Builder auditConfig(String auditConfig) {
            this.putQueryParameter("AuditConfig", auditConfig);
            this.auditConfig = auditConfig;
            return this;
        }

        /**
         * DownloadSwitch.
         */
        public Builder downloadSwitch(String downloadSwitch) {
            this.putQueryParameter("DownloadSwitch", downloadSwitch);
            this.downloadSwitch = downloadSwitch;
            return this;
        }

        /**
         * MetricConfig.
         */
        public Builder metricConfig(String metricConfig) {
            this.putQueryParameter("MetricConfig", metricConfig);
            this.metricConfig = metricConfig;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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

        @Override
        public SetCustomerConfigRequest build() {
            return new SetCustomerConfigRequest(this);
        } 

    } 

}
