// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomsResponse} extends {@link TeaModel}
 *
 * <p>ListRoomsResponse</p>
 */
public class ListRoomsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRoomsResponseBody body;

    private ListRoomsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRoomsResponse create() {
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
    public ListRoomsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRoomsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRoomsResponseBody body);

        @Override
        ListRoomsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRoomsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRoomsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRoomsResponse response) {
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
        public Builder body(ListRoomsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRoomsResponse build() {
            return new ListRoomsResponse(this);
        } 

    } 

}
