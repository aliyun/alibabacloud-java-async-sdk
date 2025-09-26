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
 * {@link CreateAgentRuntimeEndpointResponse} extends {@link TeaModel}
 *
 * <p>CreateAgentRuntimeEndpointResponse</p>
 */
public class CreateAgentRuntimeEndpointResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AgentRuntimeEndpointResult body;

    private CreateAgentRuntimeEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateAgentRuntimeEndpointResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public AgentRuntimeEndpointResult getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAgentRuntimeEndpointResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AgentRuntimeEndpointResult body);

        @Override
        CreateAgentRuntimeEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAgentRuntimeEndpointResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AgentRuntimeEndpointResult body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAgentRuntimeEndpointResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(AgentRuntimeEndpointResult body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentRuntimeEndpointResponse build() {
            return new CreateAgentRuntimeEndpointResponse(this);
        } 

    } 

}
