// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AddBackendServersRequest} extends {@link RequestModel}
 *
 * <p>AddBackendServersRequest</p>
 */
public class AddBackendServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<BackendServers> backendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<BackendServers> getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<AddBackendServersRequest, Builder> {
        private java.util.List<BackendServers> backendServers; 
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
         * <p>The list of backend servers that you want to add to the Edge Load Balancer (ELB) instance. You can add up to 20 backend servers at a time.</p>
         * <blockquote>
         * <p> Only Edge Node Service (ENS) instances that are in the running state can be added to the ELB instance as backend servers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder backendServers(java.util.List<BackendServers> backendServers) {
            String backendServersShrink = shrink(backendServers, "BackendServers", "json");
            this.putQueryParameter("BackendServers", backendServersShrink);
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5qzdmxefgrpxd7oz2mefonvtx</p>
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

    /**
     * 
     * {@link AddBackendServersRequest} extends {@link TeaModel}
     *
     * <p>AddBackendServersRequest</p>
     */
    public static class BackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(maximum = 65535)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(maximum = 100)
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

            private Builder() {
            } 

            private Builder(BackendServers model) {
                this.ip = model.ip;
                this.port = model.port;
                this.serverId = model.serverId;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.X.X</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The backend port that is used by the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3309</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5uf6dwyzch3wly790****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>ens</strong>: ENS instance</li>
             * <li><strong>eni</strong>: elastic network interface (ENI)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ens</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the backend server. Default value: 100. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * <blockquote>
             * <p> The value 0 indicates that requests are not forwarded to the backend server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
