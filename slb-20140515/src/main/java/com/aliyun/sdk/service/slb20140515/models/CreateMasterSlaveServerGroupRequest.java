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
 * {@link CreateMasterSlaveServerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMasterSlaveServerGroupRequest</p>
 */
public class CreateMasterSlaveServerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterSlaveBackendServers")
    private String masterSlaveBackendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupName")
    private String masterSlaveServerGroupName;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateMasterSlaveServerGroupRequest(Builder builder) {
        super(builder);
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveBackendServers = builder.masterSlaveBackendServers;
        this.masterSlaveServerGroupName = builder.masterSlaveServerGroupName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMasterSlaveServerGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return masterSlaveBackendServers
     */
    public String getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    /**
     * @return masterSlaveServerGroupName
     */
    public String getMasterSlaveServerGroupName() {
        return this.masterSlaveServerGroupName;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateMasterSlaveServerGroupRequest, Builder> {
        private String loadBalancerId; 
        private String masterSlaveBackendServers; 
        private String masterSlaveServerGroupName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateMasterSlaveServerGroupRequest request) {
            super(request);
            this.loadBalancerId = request.loadBalancerId;
            this.masterSlaveBackendServers = request.masterSlaveBackendServers;
            this.masterSlaveServerGroupName = request.masterSlaveServerGroupName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * <p>The CLB instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1hv944r69al4j******</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The backend servers in the primary/secondary server group. Each primary/secondary server group consists of two backend servers.</p>
         * <p>Configure the following parameters:</p>
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
         * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance CLB instances.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>ServerIp</strong>: the IP address of the ENI or elastic container instance.</p>
         * </li>
         * <li><p><strong>Port</strong>: the backend port.</p>
         * </li>
         * <li><p><strong>ServerType</strong>: Specify the primary and secondary backend servers in a string. Valid values:</p>
         * <ul>
         * <li><strong>Master</strong>: primary server</li>
         * <li><strong>Slave</strong>: secondary server</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;,  &quot;Port&quot;:&quot;82&quot;,&quot;ServerType&quot;:&quot;Master&quot;,&quot;Description&quot;:&quot;test-112&quot; },  { &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;,  &quot;Port&quot;:&quot;84&quot;,&quot;ServerType&quot;:&quot;Slave&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</p>
         */
        public Builder masterSlaveBackendServers(String masterSlaveBackendServers) {
            this.putQueryParameter("MasterSlaveBackendServers", masterSlaveBackendServers);
            this.masterSlaveBackendServers = masterSlaveBackendServers;
            return this;
        }

        /**
         * <p>The name of the primary/secondary server group.</p>
         * 
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        public Builder masterSlaveServerGroupName(String masterSlaveServerGroupName) {
            this.putQueryParameter("MasterSlaveServerGroupName", masterSlaveServerGroupName);
            this.masterSlaveServerGroupName = masterSlaveServerGroupName;
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
         * <p>The region ID of the Classic Load Balancer (CLB) instance.</p>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateMasterSlaveServerGroupRequest build() {
            return new CreateMasterSlaveServerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMasterSlaveServerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateMasterSlaveServerGroupRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string. The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
