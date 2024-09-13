// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerUDPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoadBalancerUDPListenerAttributeRequest</p>
 */
public class DescribeLoadBalancerUDPListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    private DescribeLoadBalancerUDPListenerAttributeRequest(Builder builder) {
        super(builder);
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerUDPListenerAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeLoadBalancerUDPListenerAttributeRequest, Builder> {
        private Integer listenerPort; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoadBalancerUDPListenerAttributeRequest request) {
            super(request);
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * The listening port that you want to query. Valid values: **1** to **65535**.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The ID of the ELB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public DescribeLoadBalancerUDPListenerAttributeRequest build() {
            return new DescribeLoadBalancerUDPListenerAttributeRequest(this);
        } 

    } 

}
