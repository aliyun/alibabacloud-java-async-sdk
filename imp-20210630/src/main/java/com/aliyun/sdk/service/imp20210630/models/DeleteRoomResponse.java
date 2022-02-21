// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoomResponse} extends {@link TeaModel}
 *
 * <p>DeleteRoomResponse</p>
 */
public class DeleteRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRoomResponseBody body;

    private DeleteRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRoomResponse create() {
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
    public DeleteRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRoomResponseBody body);

        @Override
        DeleteRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRoomResponse response) {
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
        public Builder body(DeleteRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRoomResponse build() {
            return new DeleteRoomResponse(this);
        } 

    } 

}
