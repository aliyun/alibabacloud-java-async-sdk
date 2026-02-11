// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetDiscoveryEndpointsOutput} extends {@link TeaModel}
 *
 * <p>GetDiscoveryEndpointsOutput</p>
 */
public class GetDiscoveryEndpointsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("discoveryEndpoints")
    private java.util.List<DiscoveryEndpoint> discoveryEndpoints;

    private GetDiscoveryEndpointsOutput(Builder builder) {
        this.discoveryEndpoints = builder.discoveryEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveryEndpointsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return discoveryEndpoints
     */
    public java.util.List<DiscoveryEndpoint> getDiscoveryEndpoints() {
        return this.discoveryEndpoints;
    }

    public static final class Builder {
        private java.util.List<DiscoveryEndpoint> discoveryEndpoints; 

        private Builder() {
        } 

        private Builder(GetDiscoveryEndpointsOutput model) {
            this.discoveryEndpoints = model.discoveryEndpoints;
        } 

        /**
         * discoveryEndpoints.
         */
        public Builder discoveryEndpoints(java.util.List<DiscoveryEndpoint> discoveryEndpoints) {
            this.discoveryEndpoints = discoveryEndpoints;
            return this;
        }

        public GetDiscoveryEndpointsOutput build() {
            return new GetDiscoveryEndpointsOutput(this);
        } 

    } 

}
