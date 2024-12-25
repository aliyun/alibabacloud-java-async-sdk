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
 * {@link SetVServerGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetVServerGroupAttributeRequest</p>
 */
public class SetVServerGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private String backendServers;

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
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupName")
    private String vServerGroupName;

    private SetVServerGroupAttributeRequest(Builder builder) {
        super(builder);
        this.backendServers = builder.backendServers;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vServerGroupId = builder.vServerGroupId;
        this.vServerGroupName = builder.vServerGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVServerGroupAttributeRequest create() {
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
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    /**
     * @return vServerGroupName
     */
    public String getVServerGroupName() {
        return this.vServerGroupName;
    }

    public static final class Builder extends Request.Builder<SetVServerGroupAttributeRequest, Builder> {
        private String backendServers; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vServerGroupId; 
        private String vServerGroupName; 

        private Builder() {
            super();
        } 

        private Builder(SetVServerGroupAttributeRequest request) {
            super(request);
            this.backendServers = request.backendServers;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vServerGroupId = request.vServerGroupId;
            this.vServerGroupName = request.vServerGroupName;
        } 

        /**
         * <p>The backend servers. This operation only can be used to modify the weights of backend servers and names of vServer groups. Configure the following parameters:</p>
         * <ul>
         * <li><p><strong>ServerId</strong>: Required. The ID of the backend server. Specify the value in a string. You can specify the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. If you set <strong>ServerId</strong> to the ID of an ENI or an elastic container instance, you must configure the <strong>Type</strong> parameter.</p>
         * </li>
         * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If you set the weight of a backend server to 0, no requests are forwarded to the backend server.</p>
         * </li>
         * <li><p><strong>Description</strong>: Optional. The description of the backend server. Specify the value in a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * </li>
         * <li><p><strong>Type</strong>: the type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong> (default): ECS instance</li>
         * <li><strong>eni</strong>: ENI</li>
         * <li><strong>eci</strong>: elastic container instance</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance CLB instances.</p>
         * </blockquote>
         * <ul>
         * <li><strong>ServerIp</strong>: the IP address of an ENI or an elastic container instance.</li>
         * <li><strong>Port</strong>: the backend port.</li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li><p>Add ECS instances:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
         * </li>
         * <li><p>Add ENIs:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
         * </li>
         * <li><p>Add ENIs with multiple IP addresses:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>172.166.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</code></p>
         * </li>
         * <li><p>Add elastic container instances:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eci-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eci&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-114&quot; }]</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can add only running backend servers to SLB instances. You can specify at most 20 backend servers in each call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;192.XX.XX.6&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;172.XX.XX.6&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</p>
         */
        public Builder backendServers(String backendServers) {
            this.putQueryParameter("BackendServers", backendServers);
            this.backendServers = backendServers;
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
         * <p>The region ID of the Server Load Balancer (SLB) instance, which cannot be modified.</p>
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
         * <p>The vServer group ID, which cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>The vServer group name. You can specify a name.</p>
         * 
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        public Builder vServerGroupName(String vServerGroupName) {
            this.putQueryParameter("VServerGroupName", vServerGroupName);
            this.vServerGroupName = vServerGroupName;
            return this;
        }

        @Override
        public SetVServerGroupAttributeRequest build() {
            return new SetVServerGroupAttributeRequest(this);
        } 

    } 

}
