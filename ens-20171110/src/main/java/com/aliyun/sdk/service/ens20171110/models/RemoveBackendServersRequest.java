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
 * {@link RemoveBackendServersRequest} extends {@link RequestModel}
 *
 * <p>RemoveBackendServersRequest</p>
 */
public class RemoveBackendServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<BackendServers> backendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    private RemoveBackendServersRequest(Builder builder) {
        super(builder);
        this.backendServers = builder.backendServers;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveBackendServersRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveBackendServersRequest, Builder> {
        private java.util.List<BackendServers> backendServers; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveBackendServersRequest request) {
            super(request);
            this.backendServers = request.backendServers;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * <p>The list of backend servers that you want to remove. You can remove up to 20 backend servers at a time.</p>
         * <p>This parameter is required.</p>
         */
        public Builder backendServers(java.util.List<BackendServers> backendServers) {
            String backendServersShrink = shrink(backendServers, "BackendServers", "json");
            this.putQueryParameter("BackendServers", backendServersShrink);
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5ovkn1piwqmoqrfjdyhq4****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public RemoveBackendServersRequest build() {
            return new RemoveBackendServersRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveBackendServersRequest} extends {@link TeaModel}
     *
     * <p>RemoveBackendServersRequest</p>
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

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XXX.X.X</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The backend port that is used by the Edge Load Balancer (ELB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The instance ID of the backend server.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5uf68ts0fqexe1a4n****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of backend server. Valid values:</p>
             * <ul>
             * <li><strong>ens</strong>: an Edge Node Service (ENS) instance.</li>
             * <li><strong>eni</strong>: an Elastic Network Interface (ENI).</li>
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
             * <p>The weight of the backend server.</p>
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
