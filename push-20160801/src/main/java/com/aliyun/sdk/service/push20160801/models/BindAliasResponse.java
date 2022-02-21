// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAliasResponse} extends {@link TeaModel}
 *
 * <p>BindAliasResponse</p>
 */
public class BindAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindAliasResponseBody body;

    private BindAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindAliasResponse create() {
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
    public BindAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindAliasResponseBody body);

        @Override
        BindAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindAliasResponse response) {
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
        public Builder body(BindAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindAliasResponse build() {
            return new BindAliasResponse(this);
        } 

    } 

}
