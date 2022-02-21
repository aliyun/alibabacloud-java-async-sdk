// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindInstanceDomainsResponse} extends {@link TeaModel}
 *
 * <p>UnbindInstanceDomainsResponse</p>
 */
public class UnbindInstanceDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindInstanceDomainsResponseBody body;

    private UnbindInstanceDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindInstanceDomainsResponse create() {
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
    public UnbindInstanceDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindInstanceDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindInstanceDomainsResponseBody body);

        @Override
        UnbindInstanceDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindInstanceDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindInstanceDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindInstanceDomainsResponse response) {
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
        public Builder body(UnbindInstanceDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindInstanceDomainsResponse build() {
            return new UnbindInstanceDomainsResponse(this);
        } 

    } 

}
