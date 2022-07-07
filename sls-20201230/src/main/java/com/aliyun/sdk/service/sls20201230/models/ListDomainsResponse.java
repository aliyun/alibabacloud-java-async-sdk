// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListDomainsResponse} extends {@link TeaModel}
 *
 * <p>ListDomainsResponse</p>
 */
public class ListDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDomainsResponseBody body;

    private ListDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDomainsResponse create() {
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
    public ListDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDomainsResponseBody body);

        @Override
        ListDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDomainsResponse response) {
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
        public Builder body(ListDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDomainsResponse build() {
            return new ListDomainsResponse(this);
        } 

    } 

}
