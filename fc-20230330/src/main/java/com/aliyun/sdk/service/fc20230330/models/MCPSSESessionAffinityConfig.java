// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link MCPSSESessionAffinityConfig} extends {@link TeaModel}
 *
 * <p>MCPSSESessionAffinityConfig</p>
 */
public class MCPSSESessionAffinityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("sessionConcurrencyPerInstance")
    private Long sessionConcurrencyPerInstance;

    @com.aliyun.core.annotation.NameInMap("sseEndpointPath")
    private String sseEndpointPath;

    private MCPSSESessionAffinityConfig(Builder builder) {
        this.sessionConcurrencyPerInstance = builder.sessionConcurrencyPerInstance;
        this.sseEndpointPath = builder.sseEndpointPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPSSESessionAffinityConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionConcurrencyPerInstance
     */
    public Long getSessionConcurrencyPerInstance() {
        return this.sessionConcurrencyPerInstance;
    }

    /**
     * @return sseEndpointPath
     */
    public String getSseEndpointPath() {
        return this.sseEndpointPath;
    }

    public static final class Builder {
        private Long sessionConcurrencyPerInstance; 
        private String sseEndpointPath; 

        private Builder() {
        } 

        private Builder(MCPSSESessionAffinityConfig model) {
            this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
            this.sseEndpointPath = model.sseEndpointPath;
        } 

        /**
         * sessionConcurrencyPerInstance.
         */
        public Builder sessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }

        /**
         * sseEndpointPath.
         */
        public Builder sseEndpointPath(String sseEndpointPath) {
            this.sseEndpointPath = sseEndpointPath;
            return this;
        }

        public MCPSSESessionAffinityConfig build() {
            return new MCPSSESessionAffinityConfig(this);
        } 

    } 

}
