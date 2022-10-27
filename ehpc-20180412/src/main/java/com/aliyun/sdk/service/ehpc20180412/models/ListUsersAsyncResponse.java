// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersAsyncResponse} extends {@link TeaModel}
 *
 * <p>ListUsersAsyncResponse</p>
 */
public class ListUsersAsyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUsersAsyncResponseBody body;

    private ListUsersAsyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUsersAsyncResponse create() {
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
    public ListUsersAsyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUsersAsyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUsersAsyncResponseBody body);

        @Override
        ListUsersAsyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUsersAsyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUsersAsyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUsersAsyncResponse response) {
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
        public Builder body(ListUsersAsyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUsersAsyncResponse build() {
            return new ListUsersAsyncResponse(this);
        } 

    } 

}
