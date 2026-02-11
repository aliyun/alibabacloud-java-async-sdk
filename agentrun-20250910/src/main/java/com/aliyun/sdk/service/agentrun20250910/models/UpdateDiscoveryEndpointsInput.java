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
 * {@link UpdateDiscoveryEndpointsInput} extends {@link TeaModel}
 *
 * <p>UpdateDiscoveryEndpointsInput</p>
 */
public class UpdateDiscoveryEndpointsInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("discoveryEndpoints")
    private java.util.List<DiscoveryEndpoint> discoveryEndpoints;

    private UpdateDiscoveryEndpointsInput(Builder builder) {
        this.discoveryEndpoints = builder.discoveryEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDiscoveryEndpointsInput create() {
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

        private Builder(UpdateDiscoveryEndpointsInput model) {
            this.discoveryEndpoints = model.discoveryEndpoints;
        } 

        /**
         * discoveryEndpoints.
         */
        public Builder discoveryEndpoints(java.util.List<DiscoveryEndpoint> discoveryEndpoints) {
            this.discoveryEndpoints = discoveryEndpoints;
            return this;
        }

        public UpdateDiscoveryEndpointsInput build() {
            return new UpdateDiscoveryEndpointsInput(this);
        } 

    } 

}
