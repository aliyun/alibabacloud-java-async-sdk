// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link ListUsersResponse} extends {@link TeaModel}
 *
 * <p>ListUsersResponse</p>
 */
public class ListUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUsersResponseBody body;

    private ListUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUsersResponse create() {
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
    public ListUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUsersResponseBody body);

        @Override
        ListUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUsersResponse response) {
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
        public Builder body(ListUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUsersResponse build() {
            return new ListUsersResponse(this);
        } 

    } 

}
