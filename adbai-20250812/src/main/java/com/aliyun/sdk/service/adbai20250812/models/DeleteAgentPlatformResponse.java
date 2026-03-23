// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DeleteAgentPlatformResponse} extends {@link TeaModel}
 *
 * <p>DeleteAgentPlatformResponse</p>
 */
public class DeleteAgentPlatformResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteAgentPlatformResponseBody body;

    private DeleteAgentPlatformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAgentPlatformResponse create() {
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
    public DeleteAgentPlatformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAgentPlatformResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAgentPlatformResponseBody body);

        @Override
        DeleteAgentPlatformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAgentPlatformResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteAgentPlatformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAgentPlatformResponse response) {
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
        public Builder body(DeleteAgentPlatformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAgentPlatformResponse build() {
            return new DeleteAgentPlatformResponse(this);
        } 

    } 

}
