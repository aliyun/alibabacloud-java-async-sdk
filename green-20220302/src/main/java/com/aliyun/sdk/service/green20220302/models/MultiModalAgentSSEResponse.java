// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link MultiModalAgentSSEResponse} extends {@link TeaModel}
 *
 * <p>MultiModalAgentSSEResponse</p>
 */
public class MultiModalAgentSSEResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private MultiModalAgentSSEResponseBody body;

    private MultiModalAgentSSEResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static MultiModalAgentSSEResponse create() {
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
    public MultiModalAgentSSEResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MultiModalAgentSSEResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(MultiModalAgentSSEResponseBody body);

        @Override
        MultiModalAgentSSEResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MultiModalAgentSSEResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private MultiModalAgentSSEResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MultiModalAgentSSEResponse response) {
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
        public Builder body(MultiModalAgentSSEResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MultiModalAgentSSEResponse build() {
            return new MultiModalAgentSSEResponse(this);
        } 

    } 

}
