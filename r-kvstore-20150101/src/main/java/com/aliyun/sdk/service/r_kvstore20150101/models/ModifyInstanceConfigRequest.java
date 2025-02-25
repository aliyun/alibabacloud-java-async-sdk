// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceConfigRequest</p>
 */
public class ModifyInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamNoLooseSentinelEnabled")
    private String paramNoLooseSentinelEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    private String paramNoLooseSentinelPasswordFreeAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    private String paramNoLooseSentinelPasswordFreeCommands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamReplMode")
    private String paramReplMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamSemisyncReplTimeout")
    private String paramSemisyncReplTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamSentinelCompatEnable")
    private String paramSentinelCompatEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ModifyInstanceConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.paramNoLooseSentinelEnabled = builder.paramNoLooseSentinelEnabled;
        this.paramNoLooseSentinelPasswordFreeAccess = builder.paramNoLooseSentinelPasswordFreeAccess;
        this.paramNoLooseSentinelPasswordFreeCommands = builder.paramNoLooseSentinelPasswordFreeCommands;
        this.paramReplMode = builder.paramReplMode;
        this.paramSemisyncReplTimeout = builder.paramSemisyncReplTimeout;
        this.paramSentinelCompatEnable = builder.paramSentinelCompatEnable;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return paramNoLooseSentinelEnabled
     */
    public String getParamNoLooseSentinelEnabled() {
        return this.paramNoLooseSentinelEnabled;
    }

    /**
     * @return paramNoLooseSentinelPasswordFreeAccess
     */
    public String getParamNoLooseSentinelPasswordFreeAccess() {
        return this.paramNoLooseSentinelPasswordFreeAccess;
    }

    /**
     * @return paramNoLooseSentinelPasswordFreeCommands
     */
    public String getParamNoLooseSentinelPasswordFreeCommands() {
        return this.paramNoLooseSentinelPasswordFreeCommands;
    }

    /**
     * @return paramReplMode
     */
    public String getParamReplMode() {
        return this.paramReplMode;
    }

    /**
     * @return paramSemisyncReplTimeout
     */
    public String getParamSemisyncReplTimeout() {
        return this.paramSemisyncReplTimeout;
    }

    /**
     * @return paramSentinelCompatEnable
     */
    public String getParamSentinelCompatEnable() {
        return this.paramSentinelCompatEnable;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceConfigRequest, Builder> {
        private String regionId; 
        private String config; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String paramNoLooseSentinelEnabled; 
        private String paramNoLooseSentinelPasswordFreeAccess; 
        private String paramNoLooseSentinelPasswordFreeCommands; 
        private String paramReplMode; 
        private String paramSemisyncReplTimeout; 
        private String paramSentinelCompatEnable; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.paramNoLooseSentinelEnabled = request.paramNoLooseSentinelEnabled;
            this.paramNoLooseSentinelPasswordFreeAccess = request.paramNoLooseSentinelPasswordFreeAccess;
            this.paramNoLooseSentinelPasswordFreeCommands = request.paramNoLooseSentinelPasswordFreeCommands;
            this.paramReplMode = request.paramReplMode;
            this.paramSemisyncReplTimeout = request.paramSemisyncReplTimeout;
            this.paramSentinelCompatEnable = request.paramSentinelCompatEnable;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance parameter settings that you want to modify. Specify this parameter in the JSON format. The new value of a parameter overwrites the original value.</p>
         * <p>**</p>
         * <p><strong>Description</strong> For more information, see <a href="https://help.aliyun.com/document_detail/259681.html">Supported parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxmemory-policy&quot;:&quot;volatile-lru&quot;,&quot;zset-max-ziplist-entries&quot;:128,&quot;zset-max-ziplist-value&quot;:64,&quot;hash-max-ziplist-entries&quot;:512,&quot;set-max-intset-entries&quot;:512}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * ParamNoLooseSentinelEnabled.
         */
        public Builder paramNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
            this.putQueryParameter("ParamNoLooseSentinelEnabled", paramNoLooseSentinelEnabled);
            this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
            return this;
        }

        /**
         * ParamNoLooseSentinelPasswordFreeAccess.
         */
        public Builder paramNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
            this.putQueryParameter("ParamNoLooseSentinelPasswordFreeAccess", paramNoLooseSentinelPasswordFreeAccess);
            this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
            return this;
        }

        /**
         * ParamNoLooseSentinelPasswordFreeCommands.
         */
        public Builder paramNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
            this.putQueryParameter("ParamNoLooseSentinelPasswordFreeCommands", paramNoLooseSentinelPasswordFreeCommands);
            this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
            return this;
        }

        /**
         * ParamReplMode.
         */
        public Builder paramReplMode(String paramReplMode) {
            this.putQueryParameter("ParamReplMode", paramReplMode);
            this.paramReplMode = paramReplMode;
            return this;
        }

        /**
         * ParamSemisyncReplTimeout.
         */
        public Builder paramSemisyncReplTimeout(String paramSemisyncReplTimeout) {
            this.putQueryParameter("ParamSemisyncReplTimeout", paramSemisyncReplTimeout);
            this.paramSemisyncReplTimeout = paramSemisyncReplTimeout;
            return this;
        }

        /**
         * ParamSentinelCompatEnable.
         */
        public Builder paramSentinelCompatEnable(String paramSentinelCompatEnable) {
            this.putQueryParameter("ParamSentinelCompatEnable", paramSentinelCompatEnable);
            this.paramSentinelCompatEnable = paramSentinelCompatEnable;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ModifyInstanceConfigRequest build() {
            return new ModifyInstanceConfigRequest(this);
        } 

    } 

}
