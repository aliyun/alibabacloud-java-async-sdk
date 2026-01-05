// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link EndpointStatusDetail} extends {@link TeaModel}
 *
 * <p>EndpointStatusDetail</p>
 */
public class EndpointStatusDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpPortMapping")
    private java.util.Map<String, IpPort> ipPortMapping;

    private EndpointStatusDetail(Builder builder) {
        this.ipPortMapping = builder.ipPortMapping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndpointStatusDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipPortMapping
     */
    public java.util.Map<String, IpPort> getIpPortMapping() {
        return this.ipPortMapping;
    }

    public static final class Builder {
        private java.util.Map<String, IpPort> ipPortMapping; 

        private Builder() {
        } 

        private Builder(EndpointStatusDetail model) {
            this.ipPortMapping = model.ipPortMapping;
        } 

        /**
         * IpPortMapping.
         */
        public Builder ipPortMapping(java.util.Map<String, IpPort> ipPortMapping) {
            this.ipPortMapping = ipPortMapping;
            return this;
        }

        public EndpointStatusDetail build() {
            return new EndpointStatusDetail(this);
        } 

    } 

}
