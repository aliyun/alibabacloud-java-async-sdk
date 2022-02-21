// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSAMLProvidersResponse} extends {@link TeaModel}
 *
 * <p>ListSAMLProvidersResponse</p>
 */
public class ListSAMLProvidersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSAMLProvidersResponseBody body;

    private ListSAMLProvidersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSAMLProvidersResponse create() {
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
    public ListSAMLProvidersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSAMLProvidersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSAMLProvidersResponseBody body);

        @Override
        ListSAMLProvidersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSAMLProvidersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSAMLProvidersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSAMLProvidersResponse response) {
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
        public Builder body(ListSAMLProvidersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSAMLProvidersResponse build() {
            return new ListSAMLProvidersResponse(this);
        } 

    } 

}
