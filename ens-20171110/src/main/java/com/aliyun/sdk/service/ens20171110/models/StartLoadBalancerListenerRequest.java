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
 * {@link StartLoadBalancerListenerRequest} extends {@link RequestModel}
 *
 * <p>StartLoadBalancerListenerRequest</p>
 */
public class StartLoadBalancerListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    private StartLoadBalancerListenerRequest(Builder builder) {
        super(builder);
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartLoadBalancerListenerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<StartLoadBalancerListenerRequest, Builder> {
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(StartLoadBalancerListenerRequest request) {
            super(request);
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * <p>The listener port to be enabled. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The frontend protocol that is used by the ELB instance. Valid values:</p>
         * <ul>
         * <li>tcp</li>
         * <li>udp</li>
         * <li>http</li>
         * <li>https</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the same port is used by listeners that use different protocols.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The ID of the ELB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5saivuir6b1mupxjfbhmk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public StartLoadBalancerListenerRequest build() {
            return new StartLoadBalancerListenerRequest(this);
        } 

    } 

}
