// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EndpointStatusDetail} extends {@link TeaModel}
 *
 * <p>EndpointStatusDetail</p>
 */
public class EndpointStatusDetail extends TeaModel {
    @NameInMap("IpPortMapping")
    private java.util.Map < String, IpPort > ipPortMapping;

    private EndpointStatusDetail(Builder builder) {
        this.ipPortMapping = builder.ipPortMapping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndpointStatusDetail create() {
        return builder().build();
    }

    /**
     * @return ipPortMapping
     */
    public java.util.Map < String, IpPort > getIpPortMapping() {
        return this.ipPortMapping;
    }

    public static final class Builder {
        private java.util.Map < String, IpPort > ipPortMapping; 

        /**
         * IpPortMapping.
         */
        public Builder ipPortMapping(java.util.Map < String, IpPort > ipPortMapping) {
            this.ipPortMapping = ipPortMapping;
            return this;
        }

        public EndpointStatusDetail build() {
            return new EndpointStatusDetail(this);
        } 

    } 

}
