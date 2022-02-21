// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableWebAccessLogConfigResponse} extends {@link TeaModel}
 *
 * <p>EnableWebAccessLogConfigResponse</p>
 */
public class EnableWebAccessLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableWebAccessLogConfigResponseBody body;

    private EnableWebAccessLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableWebAccessLogConfigResponse create() {
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
     * @return body
     */
    public EnableWebAccessLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableWebAccessLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableWebAccessLogConfigResponseBody body);

        @Override
        EnableWebAccessLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableWebAccessLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableWebAccessLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableWebAccessLogConfigResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(EnableWebAccessLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableWebAccessLogConfigResponse build() {
            return new EnableWebAccessLogConfigResponse(this);
        } 

    } 

}
