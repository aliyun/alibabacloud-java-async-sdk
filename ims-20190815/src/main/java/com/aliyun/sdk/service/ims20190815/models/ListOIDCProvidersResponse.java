// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOIDCProvidersResponse} extends {@link TeaModel}
 *
 * <p>ListOIDCProvidersResponse</p>
 */
public class ListOIDCProvidersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOIDCProvidersResponseBody body;

    private ListOIDCProvidersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOIDCProvidersResponse create() {
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
    public ListOIDCProvidersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOIDCProvidersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOIDCProvidersResponseBody body);

        @Override
        ListOIDCProvidersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOIDCProvidersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOIDCProvidersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOIDCProvidersResponse response) {
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
        public Builder body(ListOIDCProvidersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOIDCProvidersResponse build() {
            return new ListOIDCProvidersResponse(this);
        } 

    } 

}
