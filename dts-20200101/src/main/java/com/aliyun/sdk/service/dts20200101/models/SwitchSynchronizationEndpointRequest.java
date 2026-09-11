// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link SwitchSynchronizationEndpointRequest} extends {@link RequestModel}
 *
 * <p>SwitchSynchronizationEndpointRequest</p>
 */
public class SwitchSynchronizationEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private Endpoint endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synchronizationJobId;

    private SwitchSynchronizationEndpointRequest(Builder builder) {
        super(builder);
        this.endpoint = builder.endpoint;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchSynchronizationEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static final class Builder extends Request.Builder<SwitchSynchronizationEndpointRequest, Builder> {
        private Endpoint endpoint; 
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchSynchronizationEndpointRequest request) {
            super(request);
            this.endpoint = request.endpoint;
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
        } 

        /**
         * Endpoint.
         */
        public Builder endpoint(Endpoint endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID. You do not need to specify this parameter because it will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: forward.</li>
         * <li><strong>Reverse</strong>: reverse.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>Forward</strong>. The value <strong>Reverse</strong> takes effect only when the synchronization topology of the data synchronization instance is two-way synchronization.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>Instance ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsexjk1alb116****</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        @Override
        public SwitchSynchronizationEndpointRequest build() {
            return new SwitchSynchronizationEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link SwitchSynchronizationEndpointRequest} extends {@link TeaModel}
     *
     * <p>SwitchSynchronizationEndpointRequest</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private String port;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Endpoint(Builder builder) {
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.port = builder.port;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String type; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.ip = model.ip;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.port = model.port;
                this.type = model.type;
            } 

            /**
             * <p>新数据库的IP地址。</p>
             * <blockquote>
             * <p>当<strong>Endpoint.InstanceType</strong>取值为<strong>Express</strong>时，本参数才可用且必须传入。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.15.185.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>ECS或专有网络的实例ID。</p>
             * <blockquote>
             * <ul>
             * <li>当<strong>Endpoint.InstanceType</strong>取值为<strong>ECS</strong>时，本参数需传入ECS实例的ID。</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>当<strong>Endpoint.InstanceType</strong>取值为<strong>Express</strong>时，本参数需传入专有网络ID。</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp11haem1kpkhoup****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>新数据库所属的实例类型，取值：</p>
             * <ul>
             * <li><strong>LocalInstance</strong>：有公网IP的自建数据库；</li>
             * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
             * <li><strong>Express</strong>：通过专线接入的自建数据库。</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>新的数据库服务端口。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>待调整连接信息的实例，取值：</p>
             * <ul>
             * <li><strong>Source</strong>：源实例。</li>
             * <li><strong>Destination</strong>：目标实例。</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Destination</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link SwitchSynchronizationEndpointRequest} extends {@link TeaModel}
     *
     * <p>SwitchSynchronizationEndpointRequest</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private SourceEndpoint(Builder builder) {
            this.ownerID = builder.ownerID;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String ownerID; 
            private String role; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.ownerID = model.ownerID;
                this.role = model.role;
            } 

            /**
             * <p>当源实例与目标实例所属阿里云账号不同时，您需要传入该参数指定源实例的所属阿里云账号的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>14069264****</p>
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * <p>当源实例与目标实例所属阿里云账号不同时，需传入该参数，来指定源实例的授权角色，以允许目标实例阿里云账号访问源实例的实例信息。</p>
             * <blockquote>
             * <p>角色所需的权限及授权方式，请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
