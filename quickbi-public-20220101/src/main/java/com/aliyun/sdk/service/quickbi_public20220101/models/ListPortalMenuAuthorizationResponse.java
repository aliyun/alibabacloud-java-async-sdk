// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPortalMenuAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>ListPortalMenuAuthorizationResponse</p>
 */
public class ListPortalMenuAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPortalMenuAuthorizationResponseBody body;

    private ListPortalMenuAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPortalMenuAuthorizationResponse create() {
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
    public ListPortalMenuAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPortalMenuAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPortalMenuAuthorizationResponseBody body);

        @Override
        ListPortalMenuAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPortalMenuAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPortalMenuAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPortalMenuAuthorizationResponse response) {
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
        public Builder body(ListPortalMenuAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPortalMenuAuthorizationResponse build() {
            return new ListPortalMenuAuthorizationResponse(this);
        } 

    } 

}
