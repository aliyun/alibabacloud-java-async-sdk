// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyRouterInterfaceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyRouterInterfaceSpecRequest</p>
 */
public class ModifyRouterInterfaceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouterInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private ModifyRouterInterfaceSpecRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routerInterfaceId = builder.routerInterfaceId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouterInterfaceSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return routerInterfaceId
     */
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<ModifyRouterInterfaceSpecRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routerInterfaceId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRouterInterfaceSpecRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routerInterfaceId = request.routerInterfaceId;
            this.spec = request.spec;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may vary for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>The region where the router interface is located.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The ID of the router interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r4urzd****</p>
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.putQueryParameter("RouterInterfaceId", routerInterfaceId);
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }

        /**
         * <p>The specification of the router interface. The following specifications and their corresponding bandwidths are available:</p>
         * <ul>
         * <li><p><strong>Mini.2</strong>: 2 Mbps</p>
         * </li>
         * <li><p><strong>Mini.5</strong>: 5 Mbps</p>
         * </li>
         * <li><p><strong>Small.1</strong>: 10 Mbps</p>
         * </li>
         * <li><p><strong>Small.2</strong>: 20 Mbps</p>
         * </li>
         * <li><p><strong>Small.5</strong>: 50 Mbps</p>
         * </li>
         * <li><p><strong>Middle.1</strong>: 100 Mbps</p>
         * </li>
         * <li><p><strong>Middle.2</strong>: 200 Mbps</p>
         * </li>
         * <li><p><strong>Middle.5</strong>: 500 Mbps</p>
         * </li>
         * <li><p><strong>Large.1</strong>: 1000 Mbps</p>
         * </li>
         * <li><p><strong>Large.2</strong>: 2000 Mbps</p>
         * </li>
         * <li><p><strong>Large.5</strong>: 5000 Mbps</p>
         * </li>
         * <li><p><strong>Xlarge.1</strong>: 10000 Mbps</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If <strong>Role</strong> is set to <strong>AcceptingSide</strong> (accepter VPC), set <strong>Spec</strong> to <strong>Negative</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Small.1</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public ModifyRouterInterfaceSpecRequest build() {
            return new ModifyRouterInterfaceSpecRequest(this);
        } 

    } 

}
