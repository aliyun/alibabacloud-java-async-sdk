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
 * {@link ProtocolSettings} extends {@link TeaModel}
 *
 * <p>ProtocolSettings</p>
 */
public class ProtocolSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("A2AAgentCard")
    @Deprecated
    private String a2AAgentCard;

    @com.aliyun.core.annotation.NameInMap("a2aAgentCard")
    private String a2aAgentCard;

    @com.aliyun.core.annotation.NameInMap("a2aAgentCardUrl")
    private String a2aAgentCardUrl;

    @com.aliyun.core.annotation.NameInMap("headers")
    private String headers;

    @com.aliyun.core.annotation.NameInMap("inputBodyJsonSchema")
    private String inputBodyJsonSchema;

    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("outputBodyJsonSchema")
    private String outputBodyJsonSchema;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("pathPrefix")
    private String pathPrefix;

    @com.aliyun.core.annotation.NameInMap("requestContentType")
    private String requestContentType;

    @com.aliyun.core.annotation.NameInMap("responseContentType")
    private String responseContentType;

    private ProtocolSettings(Builder builder) {
        this.a2AAgentCard = builder.a2AAgentCard;
        this.a2aAgentCard = builder.a2aAgentCard;
        this.a2aAgentCardUrl = builder.a2aAgentCardUrl;
        this.headers = builder.headers;
        this.inputBodyJsonSchema = builder.inputBodyJsonSchema;
        this.method = builder.method;
        this.name = builder.name;
        this.outputBodyJsonSchema = builder.outputBodyJsonSchema;
        this.path = builder.path;
        this.pathPrefix = builder.pathPrefix;
        this.requestContentType = builder.requestContentType;
        this.responseContentType = builder.responseContentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProtocolSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return a2AAgentCard
     */
    public String getA2AAgentCard() {
        return this.a2AAgentCard;
    }

    /**
     * @return a2aAgentCard
     */
    public String getA2aAgentCard() {
        return this.a2aAgentCard;
    }

    /**
     * @return a2aAgentCardUrl
     */
    public String getA2aAgentCardUrl() {
        return this.a2aAgentCardUrl;
    }

    /**
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return inputBodyJsonSchema
     */
    public String getInputBodyJsonSchema() {
        return this.inputBodyJsonSchema;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputBodyJsonSchema
     */
    public String getOutputBodyJsonSchema() {
        return this.outputBodyJsonSchema;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return pathPrefix
     */
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * @return requestContentType
     */
    public String getRequestContentType() {
        return this.requestContentType;
    }

    /**
     * @return responseContentType
     */
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public static final class Builder {
        private String a2AAgentCard; 
        private String a2aAgentCard; 
        private String a2aAgentCardUrl; 
        private String headers; 
        private String inputBodyJsonSchema; 
        private String method; 
        private String name; 
        private String outputBodyJsonSchema; 
        private String path; 
        private String pathPrefix; 
        private String requestContentType; 
        private String responseContentType; 

        private Builder() {
        } 

        private Builder(ProtocolSettings model) {
            this.a2AAgentCard = model.a2AAgentCard;
            this.a2aAgentCard = model.a2aAgentCard;
            this.a2aAgentCardUrl = model.a2aAgentCardUrl;
            this.headers = model.headers;
            this.inputBodyJsonSchema = model.inputBodyJsonSchema;
            this.method = model.method;
            this.name = model.name;
            this.outputBodyJsonSchema = model.outputBodyJsonSchema;
            this.path = model.path;
            this.pathPrefix = model.pathPrefix;
            this.requestContentType = model.requestContentType;
            this.responseContentType = model.responseContentType;
        } 

        /**
         * <p>A2A Agent Card</p>
         */
        public Builder a2AAgentCard(String a2AAgentCard) {
            this.a2AAgentCard = a2AAgentCard;
            return this;
        }

        /**
         * a2aAgentCard.
         */
        public Builder a2aAgentCard(String a2aAgentCard) {
            this.a2aAgentCard = a2aAgentCard;
            return this;
        }

        /**
         * a2aAgentCardUrl.
         */
        public Builder a2aAgentCardUrl(String a2aAgentCardUrl) {
            this.a2aAgentCardUrl = a2aAgentCardUrl;
            return this;
        }

        /**
         * <p>请求头</p>
         */
        public Builder headers(String headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>请求体JSON模式</p>
         */
        public Builder inputBodyJsonSchema(String inputBodyJsonSchema) {
            this.inputBodyJsonSchema = inputBodyJsonSchema;
            return this;
        }

        /**
         * <p>HTTP方法</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>协议名称</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>响应体JSON模式</p>
         */
        public Builder outputBodyJsonSchema(String outputBodyJsonSchema) {
            this.outputBodyJsonSchema = outputBodyJsonSchema;
            return this;
        }

        /**
         * <p>协议路径</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>协议路径前缀</p>
         */
        public Builder pathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * <p>请求内容类型</p>
         */
        public Builder requestContentType(String requestContentType) {
            this.requestContentType = requestContentType;
            return this;
        }

        /**
         * <p>响应内容类型</p>
         */
        public Builder responseContentType(String responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }

        public ProtocolSettings build() {
            return new ProtocolSettings(this);
        } 

    } 

}
