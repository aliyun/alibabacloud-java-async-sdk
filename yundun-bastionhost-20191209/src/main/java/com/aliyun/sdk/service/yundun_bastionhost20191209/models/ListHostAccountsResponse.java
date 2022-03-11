// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostAccountsResponse} extends {@link TeaModel}
 *
 * <p>ListHostAccountsResponse</p>
 */
public class ListHostAccountsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostAccountsResponseBody body;

    private ListHostAccountsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostAccountsResponse create() {
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
    public ListHostAccountsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostAccountsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostAccountsResponseBody body);

        @Override
        ListHostAccountsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostAccountsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostAccountsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostAccountsResponse response) {
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
        public Builder body(ListHostAccountsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostAccountsResponse build() {
            return new ListHostAccountsResponse(this);
        } 

    } 

}
