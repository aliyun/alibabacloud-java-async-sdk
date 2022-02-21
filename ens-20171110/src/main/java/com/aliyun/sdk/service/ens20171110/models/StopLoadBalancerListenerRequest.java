// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLoadBalancerListenerRequest} extends {@link RequestModel}
 *
 * <p>StopLoadBalancerListenerRequest</p>
 */
public class StopLoadBalancerListenerRequest extends Request {
    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private StopLoadBalancerListenerRequest(Builder builder) {
        super(builder);
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopLoadBalancerListenerRequest create() {
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
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<StopLoadBalancerListenerRequest, Builder> {
        private Integer listenerPort; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(StopLoadBalancerListenerRequest response) {
            super(response);
            this.listenerPort = response.listenerPort;
            this.loadBalancerId = response.loadBalancerId;
        } 

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
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
        public StopLoadBalancerListenerRequest build() {
            return new StopLoadBalancerListenerRequest(this);
        } 

    } 

}
