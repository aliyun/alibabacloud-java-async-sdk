// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomUsersResponse} extends {@link TeaModel}
 *
 * <p>ListRoomUsersResponse</p>
 */
public class ListRoomUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRoomUsersResponseBody body;

    private ListRoomUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRoomUsersResponse create() {
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
    public ListRoomUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRoomUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRoomUsersResponseBody body);

        @Override
        ListRoomUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRoomUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRoomUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRoomUsersResponse response) {
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
        public Builder body(ListRoomUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRoomUsersResponse build() {
            return new ListRoomUsersResponse(this);
        } 

    } 

}
