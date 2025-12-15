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
 * {@link RebootProxyRequest} extends {@link RequestModel}
 *
 * <p>RebootProxyRequest</p>
 */
public class RebootProxyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("ProxyList")
    private String proxyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyNodeList")
    private String proxyNodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootMode")
    private String rebootMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private RebootProxyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.proxyList = builder.proxyList;
        this.proxyNodeList = builder.proxyNodeList;
        this.rebootMode = builder.rebootMode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootProxyRequest create() {
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
     * @return proxyList
     */
    public String getProxyList() {
        return this.proxyList;
    }

    /**
     * @return proxyNodeList
     */
    public String getProxyNodeList() {
        return this.proxyNodeList;
    }

    /**
     * @return rebootMode
     */
    public String getRebootMode() {
        return this.rebootMode;
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

    public static final class Builder extends Request.Builder<RebootProxyRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String proxyList; 
        private String proxyNodeList; 
        private String rebootMode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RebootProxyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.proxyList = request.proxyList;
            this.proxyNodeList = request.proxyNodeList;
            this.rebootMode = request.rebootMode;
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1ymwrhvq79zj****</p>
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
         * <p>The IDs of the proxy nodes that you want to restart or rebuild. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>90310144,90310144</p>
         */
        public Builder proxyList(String proxyList) {
            this.putQueryParameter("ProxyList", proxyList);
            this.proxyList = proxyList;
            return this;
        }

        /**
         * <p>The IDs of the hosts on which the proxy nodes are deployed. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>36912280,36912282</p>
         */
        public Builder proxyNodeList(String proxyNodeList) {
            this.putQueryParameter("ProxyNodeList", proxyNodeList);
            this.proxyNodeList = proxyNodeList;
            return this;
        }

        /**
         * <p>The type of operation that you want to perform. Valid values:</p>
         * <ul>
         * <li><strong>reboot</strong>: restarts the proxy node.</li>
         * <li><strong>rebuild</strong>: rebuilds the proxy node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reboot</p>
         */
        public Builder rebootMode(String rebootMode) {
            this.putQueryParameter("RebootMode", rebootMode);
            this.rebootMode = rebootMode;
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
        public RebootProxyRequest build() {
            return new RebootProxyRequest(this);
        } 

    } 

}
