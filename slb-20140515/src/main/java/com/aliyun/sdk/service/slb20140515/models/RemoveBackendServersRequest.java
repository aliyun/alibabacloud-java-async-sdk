// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link RemoveBackendServersRequest} extends {@link RequestModel}
 *
 * <p>RemoveBackendServersRequest</p>
 */
public class RemoveBackendServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private RemoveBackendServersRequest(Builder builder) {
        super(builder);
        this.backendServers = builder.backendServers;
        this.loadBalancerId = builder.loadBalancerId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveBackendServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendServers
     */
    public String getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
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

    public static final class Builder extends Request.Builder<RemoveBackendServersRequest, Builder> {
        private String backendServers; 
        private String loadBalancerId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveBackendServersRequest request) {
            super(request);
            this.backendServers = request.backendServers;
            this.loadBalancerId = request.loadBalancerId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The backend servers that you want to remove.</p>
         * <ul>
         * <li><p><strong>ServerId</strong>: The IDs of the backend servers. Set the value to a string. This parameter is required.</p>
         * </li>
         * <li><p><strong>Type</strong>: the type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong> (default): Elastic Compute Service (ECS) instance</li>
         * <li><strong>eni</strong>: elastic network interface (ENI)</li>
         * <li><strong>eci</strong>: elastic container instance</li>
         * </ul>
         * </li>
         * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Set the value to an integer.</p>
         * </li>
         * </ul>
         * <p>You can specify at most 20 backend servers in each call. Examples:</p>
         * <ul>
         * <li>Remove ECS instances:</li>
         * </ul>
         * <p><code>[{&quot;ServerId&quot;:&quot;i-bp1fq61enf4loa5i****&quot;, &quot;Type&quot;: &quot;ecs&quot;,&quot;Weight&quot;:&quot;100&quot;}]</code></p>
         * <ul>
         * <li>Remove ENIs:</li>
         * </ul>
         * <p><code>[{&quot;ServerId&quot;:&quot;eni-2ze1sdp5****&quot;,&quot;Type&quot;: &quot;eni&quot;,&quot;Weight&quot;:&quot;100&quot;}]</code></p>
         * <ul>
         * <li>Remove elastic container instances:</li>
         * </ul>
         * <p><code>[{&quot;ServerId&quot;:&quot;eci-2ze1sdp5****&quot;,&quot;Type&quot;: &quot;eci&quot;,&quot;Weight&quot;:&quot;100&quot;}]</code></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ServerId&quot;:&quot;i-bp1fq61enf4loa5i****&quot;, &quot;Type&quot;: &quot;ecs&quot;,&quot;Weight&quot;:&quot;100&quot;}]</p>
         */
        public Builder backendServers(String backendServers) {
            this.putQueryParameter("BackendServers", backendServers);
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The ID of the CLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp15lbk8uja8rvm4a****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
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
         * <p>The ID of the region where the CLB instance is deployed.</p>
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

        @Override
        public RemoveBackendServersRequest build() {
            return new RemoveBackendServersRequest(this);
        } 

    } 

}
