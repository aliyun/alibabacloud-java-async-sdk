// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRoomsByIdResponse} extends {@link TeaModel}
 *
 * <p>ListLiveRoomsByIdResponse</p>
 */
public class ListLiveRoomsByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLiveRoomsByIdResponseBody body;

    private ListLiveRoomsByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLiveRoomsByIdResponse create() {
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
    public ListLiveRoomsByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLiveRoomsByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLiveRoomsByIdResponseBody body);

        @Override
        ListLiveRoomsByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLiveRoomsByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLiveRoomsByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLiveRoomsByIdResponse response) {
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
        public Builder body(ListLiveRoomsByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLiveRoomsByIdResponse build() {
            return new ListLiveRoomsByIdResponse(this);
        } 

    } 

}
