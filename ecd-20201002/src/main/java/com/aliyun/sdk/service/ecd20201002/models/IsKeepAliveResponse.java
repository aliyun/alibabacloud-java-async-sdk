// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsKeepAliveResponse} extends {@link TeaModel}
 *
 * <p>IsKeepAliveResponse</p>
 */
public class IsKeepAliveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IsKeepAliveResponseBody body;

    private IsKeepAliveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IsKeepAliveResponse create() {
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
    public IsKeepAliveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IsKeepAliveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IsKeepAliveResponseBody body);

        @Override
        IsKeepAliveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IsKeepAliveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IsKeepAliveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IsKeepAliveResponse response) {
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
        public Builder body(IsKeepAliveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IsKeepAliveResponse build() {
            return new IsKeepAliveResponse(this);
        } 

    } 

}
