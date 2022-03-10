// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPortalMenusResponse} extends {@link TeaModel}
 *
 * <p>ListPortalMenusResponse</p>
 */
public class ListPortalMenusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPortalMenusResponseBody body;

    private ListPortalMenusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPortalMenusResponse create() {
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
    public ListPortalMenusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPortalMenusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPortalMenusResponseBody body);

        @Override
        ListPortalMenusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPortalMenusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPortalMenusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPortalMenusResponse response) {
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
        public Builder body(ListPortalMenusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPortalMenusResponse build() {
            return new ListPortalMenusResponse(this);
        } 

    } 

}
