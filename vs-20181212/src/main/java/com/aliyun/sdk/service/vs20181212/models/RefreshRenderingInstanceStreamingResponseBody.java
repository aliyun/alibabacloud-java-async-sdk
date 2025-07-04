// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link RefreshRenderingInstanceStreamingResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshRenderingInstanceStreamingResponseBody</p>
 */
public class RefreshRenderingInstanceStreamingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("Gateway")
    private String gateway;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshRenderingInstanceStreamingResponseBody(Builder builder) {
        this.flowId = builder.flowId;
        this.gateway = builder.gateway;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshRenderingInstanceStreamingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return gateway
     */
    public String getGateway() {
        return this.gateway;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String flowId; 
        private String gateway; 
        private String hostname; 
        private String port; 
        private String renderingInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RefreshRenderingInstanceStreamingResponseBody model) {
            this.flowId = model.flowId;
            this.gateway = model.gateway;
            this.hostname = model.hostname;
            this.port = model.port;
            this.renderingInstanceId = model.renderingInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * Gateway.
         */
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshRenderingInstanceStreamingResponseBody build() {
            return new RefreshRenderingInstanceStreamingResponseBody(this);
        } 

    } 

}
