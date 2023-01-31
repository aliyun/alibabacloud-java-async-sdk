// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllTenantBindNumberBindingResponse} extends {@link TeaModel}
 *
 * <p>ListAllTenantBindNumberBindingResponse</p>
 */
public class ListAllTenantBindNumberBindingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAllTenantBindNumberBindingResponseBody body;

    private ListAllTenantBindNumberBindingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAllTenantBindNumberBindingResponse create() {
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
    public ListAllTenantBindNumberBindingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllTenantBindNumberBindingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAllTenantBindNumberBindingResponseBody body);

        @Override
        ListAllTenantBindNumberBindingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllTenantBindNumberBindingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAllTenantBindNumberBindingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllTenantBindNumberBindingResponse response) {
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
        public Builder body(ListAllTenantBindNumberBindingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllTenantBindNumberBindingResponse build() {
            return new ListAllTenantBindNumberBindingResponse(this);
        } 

    } 

}
