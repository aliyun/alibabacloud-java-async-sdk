// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchProductResponse} extends {@link TeaModel}
 *
 * <p>LaunchProductResponse</p>
 */
public class LaunchProductResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private LaunchProductResponseBody body;

    private LaunchProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static LaunchProductResponse create() {
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
    public LaunchProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LaunchProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(LaunchProductResponseBody body);

        @Override
        LaunchProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LaunchProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private LaunchProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LaunchProductResponse response) {
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
        public Builder body(LaunchProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LaunchProductResponse build() {
            return new LaunchProductResponse(this);
        } 

    } 

}
