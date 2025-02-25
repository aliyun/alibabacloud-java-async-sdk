// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEndpointResponse} extends {@link TeaModel}
 *
 * <p>UnbindEndpointResponse</p>
 */
public class UnbindEndpointResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UnbindEndpointResponseBody body;

    private UnbindEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UnbindEndpointResponse create() {
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
    public UnbindEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UnbindEndpointResponseBody body);

        @Override
        UnbindEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UnbindEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindEndpointResponse response) {
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
        public Builder body(UnbindEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindEndpointResponse build() {
            return new UnbindEndpointResponse(this);
        } 

    } 

}
