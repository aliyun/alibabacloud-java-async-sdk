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
 * {@link ModifyVServerGroupBackendServersRequest} extends {@link RequestModel}
 *
 * <p>ModifyVServerGroupBackendServersRequest</p>
 */
public class ModifyVServerGroupBackendServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewBackendServers")
    private String newBackendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldBackendServers")
    private String oldBackendServers;

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

    private ModifyVServerGroupBackendServersRequest(Builder builder) {
        super(builder);
        this.newBackendServers = builder.newBackendServers;
        this.oldBackendServers = builder.oldBackendServers;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVServerGroupBackendServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newBackendServers
     */
    public String getNewBackendServers() {
        return this.newBackendServers;
    }

    /**
     * @return oldBackendServers
     */
    public String getOldBackendServers() {
        return this.oldBackendServers;
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

    public static final class Builder extends Request.Builder<ModifyVServerGroupBackendServersRequest, Builder> {
        private String newBackendServers; 
        private String oldBackendServers; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vServerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVServerGroupBackendServersRequest request) {
            super(request);
            this.newBackendServers = request.newBackendServers;
            this.oldBackendServers = request.oldBackendServers;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vServerGroupId = request.vServerGroupId;
        } 

        /**
         * <p>The backend servers that you want to add to the vServer group. Configure the following parameters:</p>
         * <ul>
         * <li><p><strong>ServerId</strong>: required. The IDs of the backend servers. Specify the IDs in a string. You can specify the IDs of ECS instances, ENIs, and elastic container instances. If you set <strong>ServerId</strong> to the IDs of ENIs or elastic container instances, you must configure the <strong>Type</strong> parameter.</p>
         * </li>
         * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If you set the weight of a backend server to 0, no requests are forwarded to the backend server.</p>
         * </li>
         * <li><p><strong>Description</strong>: optional. The description of the backend servers. Specify the description in a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/). periods (.), and underscores (_).</p>
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
         * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance SLB instances.</p>
         * </blockquote>
         * <ul>
         * <li><strong>ServerIp</strong>: the IP address of the ENI or elastic container instance.</li>
         * <li><strong>Port</strong>: the backend port.</li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li><p>Add an ECS instance:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
         * </li>
         * <li><p>Add an ENI:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
         * </li>
         * <li><p>Add an ENI with multiple IP addresses:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>172.166.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</code></p>
         * </li>
         * <li><p>Add an elastic container instance</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eci-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eci&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-114&quot; }]</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can add only running backend servers to SLB instances. You can specify at most 20 backend servers in each call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;<code>192.168.**.**</code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;<code>172.166.**.**</code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</p>
         */
        public Builder newBackendServers(String newBackendServers) {
            this.putQueryParameter("NewBackendServers", newBackendServers);
            this.newBackendServers = newBackendServers;
            return this;
        }

        /**
         * <p>The backend servers that you want to replace. Configure the following parameters:</p>
         * <ul>
         * <li><p><strong>ServerId</strong>: required. The IDs of the backend servers. Specify the IDs in a string. You can specify the IDs of Elastic Compute Service (ECS) instances, elastic network interfaces (ENIs), and elastic container instances. If you set <strong>ServerId</strong> to the IDs of ENIs or elastic container instances, you must configure the <strong>Type</strong> parameter.</p>
         * </li>
         * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If you set the weight of a backend server to 0, no requests are forwarded to the backend server.</p>
         * </li>
         * <li><p><strong>Description</strong>: optional. The description of the backend servers. Specify the description in a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/). periods (.), and underscores (_).</p>
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
         * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance SLB instances.</p>
         * </blockquote>
         * <ul>
         * <li><strong>ServerIp</strong>: the IP address of the ENI or elastic container instance.</li>
         * <li><strong>Port</strong>: the backend port.</li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li><p>Add an ECS instance:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
         * </li>
         * <li><p>Add an ENI:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
         * </li>
         * <li><p>Add an ENI with multiple IP addresses:</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;</code>172.166.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</code></p>
         * </li>
         * <li><p>Add an elastic container instance</p>
         * <p><code>[{ &quot;ServerId&quot;: &quot;eci-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eci&quot;, &quot;ServerIp&quot;: &quot;</code>192.168.<strong>.</strong><code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-114&quot; }]</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can add only running backend servers to SLB instances. You can specify at most 20 backend servers in each call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;,  &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</p>
         */
        public Builder oldBackendServers(String oldBackendServers) {
            this.putQueryParameter("OldBackendServers", oldBackendServers);
            this.oldBackendServers = oldBackendServers;
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
         * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
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
         * <p>The ID of the vServer group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6j****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        @Override
        public ModifyVServerGroupBackendServersRequest build() {
            return new ModifyVServerGroupBackendServersRequest(this);
        } 

    } 

}
