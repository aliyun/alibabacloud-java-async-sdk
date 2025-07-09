// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
         * <p>需修改的实例参数，格式为JSON，修改后的值会覆盖原来的值。例如您只希望修改<strong>maxmemory-policy</strong>参数为<strong>noeviction</strong>，您可以传入<code>{&quot;maxmemory-policy&quot;:&quot;noeviction&quot;}</code>。</p>
         * <blockquote>
         * <p>关于各参数的详细说明，请参见<a href="https://help.aliyun.com/document_detail/259681.html">参数说明</a>。</p>
         * </blockquote>
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
         * <p>实例ID。</p>
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
         * <p>哨兵兼容模式，适用于非集群实例。取值说明：</p>
         * <ul>
         * <li><strong>no</strong>（默认）：未开启</li>
         * <li><strong>yes</strong>：开启<blockquote>
         * <p>更多信息请参见<a href="https://help.aliyun.com/document_detail/178911.html">Sentinel兼容模式</a>。</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder paramNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
            this.putQueryParameter("ParamNoLooseSentinelEnabled", paramNoLooseSentinelEnabled);
            this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
            return this;
        }

        /**
         * <p>开启哨兵模式时，是否允许免密执行Sentinel相关命令，取值说明：</p>
         * <ul>
         * <li><strong>no</strong>（默认）：关闭。</li>
         * <li><strong>yes</strong>：开启。开启后，可以在任意连接上免密执行Sentinel命令以及使用SENTINEL命令监听+switch-master通道。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder paramNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
            this.putQueryParameter("ParamNoLooseSentinelPasswordFreeAccess", paramNoLooseSentinelPasswordFreeAccess);
            this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
            return this;
        }

        /**
         * <p>启用哨兵模式及ParamNoLooseSentinelPasswordFreeAccess参数后，可通过本参数添加额外的免密命令列表（默认为空）。</p>
         * <blockquote>
         * <ul>
         * <li>设置后可在任意连接上无需密码执行对应命令，请谨慎操作。</li>
         * <li>命令需使用小写字母，多个命令以英文逗号(,)分隔。</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder paramNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
            this.putQueryParameter("ParamNoLooseSentinelPasswordFreeCommands", paramNoLooseSentinelPasswordFreeCommands);
            this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
            return this;
        }

        /**
         * <p>同步模式：</p>
         * <ul>
         * <li><strong>async</strong>（默认）：异步</li>
         * <li><strong>semisync</strong>：半同步</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>async</p>
         */
        public Builder paramReplMode(String paramReplMode) {
            this.putQueryParameter("ParamReplMode", paramReplMode);
            this.paramReplMode = paramReplMode;
            return this;
        }

        /**
         * <p>半同步模式的降级阈值。仅半同步支持配置该参数，单位为ms，取值范围为10~60000，默认为500。</p>
         * <blockquote>
         * <ul>
         * <li>当同步延迟超出该阈值时，同步模式会自动转为异步，当同步延迟消除后，同步模式会自动转换为半同步。</li>
         * <li>仅Tair企业版实例支持，该功能公测中。</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder paramSemisyncReplTimeout(String paramSemisyncReplTimeout) {
            this.putQueryParameter("ParamSemisyncReplTimeout", paramSemisyncReplTimeout);
            this.paramSemisyncReplTimeout = paramSemisyncReplTimeout;
            return this;
        }

        /**
         * <p>哨兵兼容模式，适用于集群架构代理连接模式或读写分离架构的实例，取值说明：</p>
         * <ul>
         * <li><strong>0</strong>（默认）：未开启</li>
         * <li><strong>1</strong>：开启<blockquote>
         * <p>更多信息请参见<a href="https://help.aliyun.com/document_detail/178911.html">Sentinel兼容模式</a>。</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
