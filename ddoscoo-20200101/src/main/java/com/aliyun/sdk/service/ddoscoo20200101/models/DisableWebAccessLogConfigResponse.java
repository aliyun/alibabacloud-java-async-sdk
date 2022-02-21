// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableWebAccessLogConfigResponse} extends {@link TeaModel}
 *
 * <p>DisableWebAccessLogConfigResponse</p>
 */
public class DisableWebAccessLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableWebAccessLogConfigResponseBody body;

    private DisableWebAccessLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableWebAccessLogConfigResponse create() {
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
    public DisableWebAccessLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableWebAccessLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableWebAccessLogConfigResponseBody body);

        @Override
        DisableWebAccessLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableWebAccessLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableWebAccessLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableWebAccessLogConfigResponse response) {
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
        public Builder body(DisableWebAccessLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableWebAccessLogConfigResponse build() {
            return new DisableWebAccessLogConfigResponse(this);
        } 

    } 

}
