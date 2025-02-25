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
 * {@link GetRenderingInstanceStreamingInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRenderingInstanceStreamingInfoResponseBody</p>
 */
public class GetRenderingInstanceStreamingInfoResponseBody extends TeaModel {
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

    private GetRenderingInstanceStreamingInfoResponseBody(Builder builder) {
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

    public static GetRenderingInstanceStreamingInfoResponseBody create() {
        return builder().build();
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRenderingInstanceStreamingInfoResponseBody build() {
            return new GetRenderingInstanceStreamingInfoResponseBody(this);
        } 

    } 

}
