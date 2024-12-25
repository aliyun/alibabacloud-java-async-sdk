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
 * {@link CreateMasterSlaveServerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMasterSlaveServerGroupResponseBody</p>
 */
public class CreateMasterSlaveServerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MasterSlaveBackendServers")
    private MasterSlaveBackendServers masterSlaveBackendServers;

    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMasterSlaveServerGroupResponseBody(Builder builder) {
        this.masterSlaveBackendServers = builder.masterSlaveBackendServers;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMasterSlaveServerGroupResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MasterSlaveBackendServers masterSlaveBackendServers; 
        private String masterSlaveServerGroupId; 
        private String requestId; 

        /**
         * <p>The backend servers in the primary/secondary server group.</p>
         */
        public Builder masterSlaveBackendServers(MasterSlaveBackendServers masterSlaveBackendServers) {
            this.masterSlaveBackendServers = masterSlaveBackendServers;
            return this;
        }

        /**
         * <p>The ID of the active/standby server group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp19au4******</p>
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7CA4DB76-4D32-523B-822E-5C9494613D46</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMasterSlaveServerGroupResponseBody build() {
            return new CreateMasterSlaveServerGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMasterSlaveServerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMasterSlaveServerGroupResponseBody</p>
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
             * <p>test-112</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port that is used by the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>82</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server that you want to add.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1fq61enf4loa5i****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of backend server.</p>
             * <p>Valid values: <strong>Master</strong> and <strong>Slave</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The type of backend server. Valid values:</p>
             * <ul>
             * <li><strong>ecs</strong>: ECS instance</li>
             * <li><strong>eni</strong>: ENI</li>
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
     * {@link CreateMasterSlaveServerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMasterSlaveServerGroupResponseBody</p>
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
}
