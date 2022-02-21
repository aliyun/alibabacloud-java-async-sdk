// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindAliasResponse} extends {@link TeaModel}
 *
 * <p>UnbindAliasResponse</p>
 */
public class UnbindAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindAliasResponseBody body;

    private UnbindAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindAliasResponse create() {
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
    public UnbindAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindAliasResponseBody body);

        @Override
        UnbindAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindAliasResponse response) {
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
        public Builder body(UnbindAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindAliasResponse build() {
            return new UnbindAliasResponse(this);
        } 

    } 

}
