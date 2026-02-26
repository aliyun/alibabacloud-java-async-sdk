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
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("discoveryEndpoints")
    private java.util.List<DiscoveryEndpoint> discoveryEndpoints;

    private GetDiscoveryEndpointsOutput(Builder builder) {
        this.credentialName = builder.credentialName;
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
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return discoveryEndpoints
     */
    public java.util.List<DiscoveryEndpoint> getDiscoveryEndpoints() {
        return this.discoveryEndpoints;
    }

    public static final class Builder {
        private String credentialName; 
        private java.util.List<DiscoveryEndpoint> discoveryEndpoints; 

        private Builder() {
        } 

        private Builder(GetDiscoveryEndpointsOutput model) {
            this.credentialName = model.credentialName;
            this.discoveryEndpoints = model.discoveryEndpoints;
        } 

        /**
         * credentialName.
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
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
