// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedAdministratorsResponse} extends {@link TeaModel}
 *
 * <p>ListDelegatedAdministratorsResponse</p>
 */
public class ListDelegatedAdministratorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDelegatedAdministratorsResponseBody body;

    private ListDelegatedAdministratorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDelegatedAdministratorsResponse create() {
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
    public ListDelegatedAdministratorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDelegatedAdministratorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDelegatedAdministratorsResponseBody body);

        @Override
        ListDelegatedAdministratorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDelegatedAdministratorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDelegatedAdministratorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDelegatedAdministratorsResponse response) {
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
        public Builder body(ListDelegatedAdministratorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDelegatedAdministratorsResponse build() {
            return new ListDelegatedAdministratorsResponse(this);
        } 

    } 

}
