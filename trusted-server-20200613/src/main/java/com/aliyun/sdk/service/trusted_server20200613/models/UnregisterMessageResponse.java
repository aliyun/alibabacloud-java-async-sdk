// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnregisterMessageResponse} extends {@link TeaModel}
 *
 * <p>UnregisterMessageResponse</p>
 */
public class UnregisterMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnregisterMessageResponseBody body;

    private UnregisterMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnregisterMessageResponse create() {
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
    public UnregisterMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnregisterMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnregisterMessageResponseBody body);

        @Override
        UnregisterMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnregisterMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnregisterMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnregisterMessageResponse response) {
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
        public Builder body(UnregisterMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnregisterMessageResponse build() {
            return new UnregisterMessageResponse(this);
        } 

    } 

}
