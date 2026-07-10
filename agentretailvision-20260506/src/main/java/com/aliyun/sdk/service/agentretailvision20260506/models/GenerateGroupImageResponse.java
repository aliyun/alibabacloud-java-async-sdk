// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link GenerateGroupImageResponse} extends {@link TeaModel}
 *
 * <p>GenerateGroupImageResponse</p>
 */
public class GenerateGroupImageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GenerateGroupImageResponseBody body;

    private GenerateGroupImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateGroupImageResponse create() {
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
    public GenerateGroupImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateGroupImageResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateGroupImageResponseBody body);

        @Override
        GenerateGroupImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateGroupImageResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GenerateGroupImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateGroupImageResponse response) {
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
        public Builder body(GenerateGroupImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateGroupImageResponse build() {
            return new GenerateGroupImageResponse(this);
        } 

    } 

}
