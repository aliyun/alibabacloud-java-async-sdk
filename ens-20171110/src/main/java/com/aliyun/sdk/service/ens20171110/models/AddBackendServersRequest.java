// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBackendServersRequest} extends {@link RequestModel}
 *
 * <p>AddBackendServersRequest</p>
 */
public class AddBackendServersRequest extends Request {
    @Query
    @NameInMap("BackendServers")
    @Validation(required = true)
    private java.util.List < BackendServers> backendServers;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private AddBackendServersRequest(Builder builder) {
        super(builder);
        this.backendServers = builder.backendServers;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBackendServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendServers
     */
    public java.util.List < BackendServers> getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<AddBackendServersRequest, Builder> {
        private java.util.List < BackendServers> backendServers; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(AddBackendServersRequest request) {
            super(request);
            this.backendServers = request.backendServers;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * The list of backend servers that you want to add. You can add at most 20 backend servers.
         * <p>
         * 
         * >  Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.
         */
        public Builder backendServers(java.util.List < BackendServers> backendServers) {
            String backendServersShrink = shrink(backendServers, "BackendServers", "json");
            this.putQueryParameter("BackendServers", backendServersShrink);
            this.backendServers = backendServers;
            return this;
        }

        /**
         * The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: **1** to **65535**.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public AddBackendServersRequest build() {
            return new AddBackendServersRequest(this);
        } 

    } 

    public static class BackendServers extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        @Validation(maximum = 65535)
        private Integer port;

        @NameInMap("ServerId")
        @Validation(required = true)
        private String serverId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        @Validation(maximum = 100)
        private Integer weight;

        private BackendServers(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
            private String ip; 
            private Integer port; 
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * The IP address of the backend server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The backend port that is used by the ELB instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the ENS instance.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The type of the backend server. Valid values:
             * <p>
             * 
             * *   **ens**: ENS instance.
             * *   **eni**: ENI.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the backend server. Default value: 100. Valid values: **0** to **100**.
             * <p>
             * 
             * >  The value 0 indicates that requests are not forwarded to the backend server.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
}
