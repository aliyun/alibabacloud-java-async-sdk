// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstanceDomainsResponse} extends {@link TeaModel}
 *
 * <p>BindInstanceDomainsResponse</p>
 */
public class BindInstanceDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindInstanceDomainsResponseBody body;

    private BindInstanceDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindInstanceDomainsResponse create() {
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
    public BindInstanceDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindInstanceDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindInstanceDomainsResponseBody body);

        @Override
        BindInstanceDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindInstanceDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindInstanceDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindInstanceDomainsResponse response) {
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
        public Builder body(BindInstanceDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindInstanceDomainsResponse build() {
            return new BindInstanceDomainsResponse(this);
        } 

    } 

}
