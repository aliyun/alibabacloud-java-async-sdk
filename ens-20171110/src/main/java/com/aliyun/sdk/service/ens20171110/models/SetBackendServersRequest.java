// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBackendServersRequest} extends {@link RequestModel}
 *
 * <p>SetBackendServersRequest</p>
 */
public class SetBackendServersRequest extends Request {
    @Query
    @NameInMap("BackendServers")
    @Validation(required = true)
    private java.util.List < BackendServers> backendServers;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private SetBackendServersRequest(Builder builder) {
        super(builder);
        this.backendServers = builder.backendServers;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBackendServersRequest create() {
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

    public static final class Builder extends Request.Builder<SetBackendServersRequest, Builder> {
        private java.util.List < BackendServers> backendServers; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(SetBackendServersRequest request) {
            super(request);
            this.backendServers = request.backendServers;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * BackendServers.
         */
        public Builder backendServers(java.util.List < BackendServers> backendServers) {
            String backendServersShrink = shrink(backendServers, "BackendServers", "json");
            this.putQueryParameter("BackendServers", backendServersShrink);
            this.backendServers = backendServers;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public SetBackendServersRequest build() {
            return new SetBackendServersRequest(this);
        } 

    } 

    public static class BackendServers extends TeaModel {
        @NameInMap("ServerId")
        @Validation(required = true)
        private String serverId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        @Validation(required = true, maximum = 100)
        private Integer weight;

        private BackendServers(Builder builder) {
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
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * 后端服务器类型。  ens：ENS实例（默认）
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 后端服务器的权重。  取值：0~100  默认值为100，如果值为0，则不会将请求转发给该后端服务器。
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
