// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedServicesForAccountResponse} extends {@link TeaModel}
 *
 * <p>ListDelegatedServicesForAccountResponse</p>
 */
public class ListDelegatedServicesForAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDelegatedServicesForAccountResponseBody body;

    private ListDelegatedServicesForAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDelegatedServicesForAccountResponse create() {
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
    public ListDelegatedServicesForAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDelegatedServicesForAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDelegatedServicesForAccountResponseBody body);

        @Override
        ListDelegatedServicesForAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDelegatedServicesForAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDelegatedServicesForAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDelegatedServicesForAccountResponse response) {
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
        public Builder body(ListDelegatedServicesForAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDelegatedServicesForAccountResponse build() {
            return new ListDelegatedServicesForAccountResponse(this);
        } 

    } 

}
