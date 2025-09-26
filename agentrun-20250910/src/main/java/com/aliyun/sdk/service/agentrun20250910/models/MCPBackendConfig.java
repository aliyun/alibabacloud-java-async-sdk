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
 * {@link MCPBackendConfig} extends {@link TeaModel}
 *
 * <p>MCPBackendConfig</p>
 */
public class MCPBackendConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.List<MCPServiceConfig> services;

    private MCPBackendConfig(Builder builder) {
        this.scene = builder.scene;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPBackendConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return services
     */
    public java.util.List<MCPServiceConfig> getServices() {
        return this.services;
    }

    public static final class Builder {
        private String scene; 
        private java.util.List<MCPServiceConfig> services; 

        private Builder() {
        } 

        private Builder(MCPBackendConfig model) {
            this.scene = model.scene;
            this.services = model.services;
        } 

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.scene = scene;
            return this;
        }

        /**
         * services.
         */
        public Builder services(java.util.List<MCPServiceConfig> services) {
            this.services = services;
            return this;
        }

        public MCPBackendConfig build() {
            return new MCPBackendConfig(this);
        } 

    } 

}
