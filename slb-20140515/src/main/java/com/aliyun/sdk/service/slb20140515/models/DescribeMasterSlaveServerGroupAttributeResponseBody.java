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
         * <p>The time when the CLB instance was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02T02:49:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the associated CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-14fadafw4343a******</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>A list of backend servers in the primary/secondary server group.</p>
         */
        public Builder masterSlaveBackendServers(MasterSlaveBackendServers masterSlaveBackendServers) {
            this.masterSlaveBackendServers = masterSlaveBackendServers;
            return this;
        }

        /**
         * <p>The ID of the primary/secondary server group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6******</p>
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }

        /**
         * <p>The name of the primary/secondary server group.</p>
         * 
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        public Builder masterSlaveServerGroupName(String masterSlaveServerGroupName) {
            this.masterSlaveServerGroupName = masterSlaveServerGroupName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag list.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBody build() {
            return new DescribeMasterSlaveServerGroupAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMasterSlaveServerGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupAttributeResponseBody</p>
     */
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
             * <p>The description of the primary/secondary server group.</p>
             * 
             * <strong>example:</strong>
             * <p>Primary and secondary server group description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port that is used by the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>vm-hrf******</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of backend server. Valid values: <strong>Master</strong> and <strong>Slave</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Slave</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>ecs</strong> (default): Elastic Compute Service (ECS) instance</li>
             * <li><strong>eni</strong>: elastic network interface (ENI)</li>
             * <li><strong>eci</strong>: elastic container instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupAttributeResponseBody</p>
     */
    public static class MasterSlaveBackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MasterSlaveBackendServer")
        private java.util.List<MasterSlaveBackendServer> masterSlaveBackendServer;

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
        public java.util.List<MasterSlaveBackendServer> getMasterSlaveBackendServer() {
            return this.masterSlaveBackendServer;
        }

        public static final class Builder {
            private java.util.List<MasterSlaveBackendServer> masterSlaveBackendServer; 

            /**
             * MasterSlaveBackendServer.
             */
            public Builder masterSlaveBackendServer(java.util.List<MasterSlaveBackendServer> masterSlaveBackendServer) {
                this.masterSlaveBackendServer = masterSlaveBackendServer;
                return this;
            }

            public MasterSlaveBackendServers build() {
                return new MasterSlaveBackendServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupAttributeResponseBody</p>
     */
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
             * <p>The tag key. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
