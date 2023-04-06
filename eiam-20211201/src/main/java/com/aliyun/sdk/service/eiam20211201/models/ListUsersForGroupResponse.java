// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersForGroupResponse} extends {@link TeaModel}
 *
 * <p>ListUsersForGroupResponse</p>
 */
public class ListUsersForGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUsersForGroupResponseBody body;

    private ListUsersForGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUsersForGroupResponse create() {
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
    public ListUsersForGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUsersForGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUsersForGroupResponseBody body);

        @Override
        ListUsersForGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUsersForGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUsersForGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUsersForGroupResponse response) {
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
        public Builder body(ListUsersForGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUsersForGroupResponse build() {
            return new ListUsersForGroupResponse(this);
        } 

    } 

}
