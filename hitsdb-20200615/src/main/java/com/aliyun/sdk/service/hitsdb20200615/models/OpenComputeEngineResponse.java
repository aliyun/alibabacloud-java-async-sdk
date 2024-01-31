// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenComputeEngineResponse} extends {@link TeaModel}
 *
 * <p>OpenComputeEngineResponse</p>
 */
public class OpenComputeEngineResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private OpenComputeEngineResponseBody body;

    private OpenComputeEngineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OpenComputeEngineResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public OpenComputeEngineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenComputeEngineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(OpenComputeEngineResponseBody body);

        @Override
        OpenComputeEngineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenComputeEngineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private OpenComputeEngineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenComputeEngineResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(OpenComputeEngineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenComputeEngineResponse build() {
            return new OpenComputeEngineResponse(this);
        } 

    } 

}
