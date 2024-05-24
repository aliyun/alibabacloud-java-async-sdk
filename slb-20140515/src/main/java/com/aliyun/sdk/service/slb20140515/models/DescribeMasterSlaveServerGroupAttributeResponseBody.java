// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMasterSlaveServerGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMasterSlaveServerGroupAttributeResponseBody</p>
 */
public class DescribeMasterSlaveServerGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("MasterSlaveBackendServers")
    private MasterSlaveBackendServers masterSlaveBackendServers;

    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupName")
    private String masterSlaveServerGroupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    private DescribeMasterSlaveServerGroupAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveBackendServers = builder.masterSlaveBackendServers;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.masterSlaveServerGroupName = builder.masterSlaveServerGroupName;
        this.requestId = builder.requestId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMasterSlaveServerGroupAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
    public MasterSlaveBackendServers getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    /**
     * @return masterSlaveServerGroupId
     */
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    /**
     * @return masterSlaveServerGroupName
     */
    public String getMasterSlaveServerGroupName() {
        return this.masterSlaveServerGroupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String createTime; 
        private String loadBalancerId; 
        private MasterSlaveBackendServers masterSlaveBackendServers; 
        private String masterSlaveServerGroupId; 
        private String masterSlaveServerGroupName; 
        private String requestId; 
        private Tags tags; 

        /**
         * The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The ID of the associated CLB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The list of backend servers in the primary/secondary server group.
         */
        public Builder masterSlaveBackendServers(MasterSlaveBackendServers masterSlaveBackendServers) {
            this.masterSlaveBackendServers = masterSlaveBackendServers;
            return this;
        }

        /**
         * The ID of the primary/secondary server group.
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }

        /**
         * The name of the primary/secondary server group.
         */
        public Builder masterSlaveServerGroupName(String masterSlaveServerGroupName) {
            this.masterSlaveServerGroupName = masterSlaveServerGroupName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag list.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBody build() {
            return new DescribeMasterSlaveServerGroupAttributeResponseBody(this);
        } 

    } 

    public static class MasterSlaveBackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private MasterSlaveBackendServer(Builder builder) {
            this.description = builder.description;
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.serverType = builder.serverType;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterSlaveBackendServer create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String description; 
            private Integer port; 
            private String serverId; 
            private String serverType; 
            private String type; 
            private Integer weight; 

            /**
             * The description of the primary/secondary server group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The port used by the backend server.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the ECS instance or ENI.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The type of backend server. Valid values: **Master and Slave. Default value: Master.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * The type of the backend server. Valid values:
             * <p>
             * 
             * *   **ecs** (default): an Elastic Compute Service (ECS) instance
             * *   **eni**: an elastic network interface (ENI)
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the backend server.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public MasterSlaveBackendServer build() {
                return new MasterSlaveBackendServer(this);
            } 

        } 

    }
    public static class MasterSlaveBackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MasterSlaveBackendServer")
        private java.util.List < MasterSlaveBackendServer> masterSlaveBackendServer;

        private MasterSlaveBackendServers(Builder builder) {
            this.masterSlaveBackendServer = builder.masterSlaveBackendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterSlaveBackendServers create() {
            return builder().build();
        }

        /**
         * @return masterSlaveBackendServer
         */
        public java.util.List < MasterSlaveBackendServer> getMasterSlaveBackendServer() {
            return this.masterSlaveBackendServer;
        }

        public static final class Builder {
            private java.util.List < MasterSlaveBackendServer> masterSlaveBackendServer; 

            /**
             * MasterSlaveBackendServer.
             */
            public Builder masterSlaveBackendServer(java.util.List < MasterSlaveBackendServer> masterSlaveBackendServer) {
                this.masterSlaveBackendServer = masterSlaveBackendServer;
                return this;
            }

            public MasterSlaveBackendServers build() {
                return new MasterSlaveBackendServers(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
