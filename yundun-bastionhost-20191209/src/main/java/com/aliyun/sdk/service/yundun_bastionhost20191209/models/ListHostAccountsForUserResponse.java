// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostAccountsForUserResponse} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForUserResponse</p>
 */
public class ListHostAccountsForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostAccountsForUserResponseBody body;

    private ListHostAccountsForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostAccountsForUserResponse create() {
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
    public ListHostAccountsForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostAccountsForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostAccountsForUserResponseBody body);

        @Override
        ListHostAccountsForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostAccountsForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostAccountsForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostAccountsForUserResponse response) {
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
        public Builder body(ListHostAccountsForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostAccountsForUserResponse build() {
            return new ListHostAccountsForUserResponse(this);
        } 

    } 

}
