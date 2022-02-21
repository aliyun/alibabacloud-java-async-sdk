// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRoomsResponse} extends {@link TeaModel}
 *
 * <p>ListLiveRoomsResponse</p>
 */
public class ListLiveRoomsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLiveRoomsResponseBody body;

    private ListLiveRoomsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLiveRoomsResponse create() {
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
    public ListLiveRoomsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLiveRoomsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLiveRoomsResponseBody body);

        @Override
        ListLiveRoomsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLiveRoomsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLiveRoomsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLiveRoomsResponse response) {
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
        public Builder body(ListLiveRoomsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLiveRoomsResponse build() {
            return new ListLiveRoomsResponse(this);
        } 

    } 

}
