// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindUserDesktopResponse} extends {@link TeaModel}
 *
 * <p>UnbindUserDesktopResponse</p>
 */
public class UnbindUserDesktopResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindUserDesktopResponseBody body;

    private UnbindUserDesktopResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindUserDesktopResponse create() {
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
    public UnbindUserDesktopResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindUserDesktopResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindUserDesktopResponseBody body);

        @Override
        UnbindUserDesktopResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindUserDesktopResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindUserDesktopResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindUserDesktopResponse response) {
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
        public Builder body(UnbindUserDesktopResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindUserDesktopResponse build() {
            return new UnbindUserDesktopResponse(this);
        } 

    } 

}
