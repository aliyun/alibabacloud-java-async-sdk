// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMasterSlaveServerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMasterSlaveServerGroupRequest</p>
 */
public class CreateMasterSlaveServerGroupRequest extends Request {
    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("MasterSlaveBackendServers")
    private String masterSlaveBackendServers;

    @Query
    @NameInMap("MasterSlaveServerGroupName")
    private String masterSlaveServerGroupName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
    public java.util.List < Tag> getTag() {
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
        private java.util.List < Tag> tag; 

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
         * The ID of the SLB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The backend servers in the primary/secondary server group.
         * <p>
         * 
         * The value of this parameter must be a STRING list in the JSON format. You can specify up to 20 elements in each request.
         * 
         * *   **ServerId**: Required. Specify the ID of the backend server. The value must be of the STRING type.
         * 
         * *   **Port**: Required. Specify the port that is used by the backend server. The value must be of the INTEGER type. Valid values: **1** to **65535**.
         * 
         * *   **Weight**: Required. Specify the weight of the backend server. The value must be of the INTEGER type. Valid values: **0** to **100**.
         * 
         * *   \*\*Description \*\*: Optional. The description of the backend server. The value must be of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).
         * 
         * *   **ServerType**: the type of the backend server. The value must be of the STRING type. Valid values:
         * 
         *     *   **Master**
         * 
         * *   **Slave**
         * 
         * *   **Type**: the service type of backend server. The value must be of the STRING type. Valid values:
         * 
         *     *   **ecs**
         *     *   **eni**
         * 
         * *   **ServerIp**
         * 
         * A primary/secondary server group can contain up to two backend servers.
         * 
         * If you do not specify this parameter, an empty primary/secondary server group is created.
         * 
         * Examples:
         * 
         * *   ECS instances:
         * 
         * `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"82","ServerType":"Master","Description":"test-112" }, { "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"84","ServerType":"Slave","Description":"test-112" }]`
         * 
         * *   ENIs:
         * 
         *     `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "Port":"80","ServerType":"Master","Description":"test-112" }, { "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","ServerType":"Slave","Description":"test-112" }]`
         * 
         * *   IP addresses of ENIs:
         * 
         *     `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni","ServerIp": "192.168.**.**", "Port":"80","ServerType":"Master","Description":"test-112" }, { "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni","ServerIp": "192.168.**.**", "Port":"80","ServerType":"Slave","Description":"test-112" }]`
         */
        public Builder masterSlaveBackendServers(String masterSlaveBackendServers) {
            this.putQueryParameter("MasterSlaveBackendServers", masterSlaveBackendServers);
            this.masterSlaveBackendServers = masterSlaveBackendServers;
            return this;
        }

        /**
         * The name of the primary/secondary server group.
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
         * The ID of the region where the Server Load Balancer (SLB) instance is deployed.
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
         * 标签列表。
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateMasterSlaveServerGroupRequest build() {
            return new CreateMasterSlaveServerGroupRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * 资源标签键。N的取值范围：**1**~**20**。一旦输入该值，则不允许为空字符串。
             * <p>
             * 
             * 最多支持64个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 资源的标签值。N的取值范围：**1~20**。一旦输入该值，可以为空字符串。
             * <p>
             * 最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。
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
