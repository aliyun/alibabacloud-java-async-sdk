// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindPersonResponse} extends {@link TeaModel}
 *
 * <p>UnbindPersonResponse</p>
 */
public class UnbindPersonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindPersonResponseBody body;

    private UnbindPersonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindPersonResponse create() {
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
    public UnbindPersonResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindPersonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindPersonResponseBody body);

        @Override
        UnbindPersonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindPersonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindPersonResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindPersonResponse response) {
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
        public Builder body(UnbindPersonResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindPersonResponse build() {
            return new UnbindPersonResponse(this);
        } 

    } 

}
