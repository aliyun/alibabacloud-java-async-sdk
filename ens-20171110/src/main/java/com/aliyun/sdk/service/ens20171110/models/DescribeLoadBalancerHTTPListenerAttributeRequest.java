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
 * {@link DescribeLoadBalancerHTTPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoadBalancerHTTPListenerAttributeRequest</p>
 */
public class DescribeLoadBalancerHTTPListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    private DescribeLoadBalancerHTTPListenerAttributeRequest(Builder builder) {
        super(builder);
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerHTTPListenerAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeLoadBalancerHTTPListenerAttributeRequest, Builder> {
        private Integer listenerPort; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoadBalancerHTTPListenerAttributeRequest request) {
            super(request);
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * <p>The listener port that you want to query. Valid values: <strong>1 to 65535</strong>.</p>
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
         * <p>The ID of the ELB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5snthcyu1x10g7tywj7iu****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public DescribeLoadBalancerHTTPListenerAttributeRequest build() {
            return new DescribeLoadBalancerHTTPListenerAttributeRequest(this);
        } 

    } 

}
