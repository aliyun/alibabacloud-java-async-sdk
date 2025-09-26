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
 * {@link MCPServerConfig} extends {@link TeaModel}
 *
 * <p>MCPServerConfig</p>
 */
public class MCPServerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("serverUrl")
    private String serverUrl;

    @com.aliyun.core.annotation.NameInMap("ssePath")
    private String ssePath;

    @com.aliyun.core.annotation.NameInMap("transportType")
    private String transportType;

    private MCPServerConfig(Builder builder) {
        this.serverUrl = builder.serverUrl;
        this.ssePath = builder.ssePath;
        this.transportType = builder.transportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPServerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serverUrl
     */
    public String getServerUrl() {
        return this.serverUrl;
    }

    /**
     * @return ssePath
     */
    public String getSsePath() {
        return this.ssePath;
    }

    /**
     * @return transportType
     */
    public String getTransportType() {
        return this.transportType;
    }

    public static final class Builder {
        private String serverUrl; 
        private String ssePath; 
        private String transportType; 

        private Builder() {
        } 

        private Builder(MCPServerConfig model) {
            this.serverUrl = model.serverUrl;
            this.ssePath = model.ssePath;
            this.transportType = model.transportType;
        } 

        /**
         * serverUrl.
         */
        public Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        /**
         * ssePath.
         */
        public Builder ssePath(String ssePath) {
            this.ssePath = ssePath;
            return this;
        }

        /**
         * transportType.
         */
        public Builder transportType(String transportType) {
            this.transportType = transportType;
            return this;
        }

        public MCPServerConfig build() {
            return new MCPServerConfig(this);
        } 

    } 

}
