// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoomResponse} extends {@link TeaModel}
 *
 * <p>CreateRoomResponse</p>
 */
public class CreateRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRoomResponseBody body;

    private CreateRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRoomResponse create() {
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
    public CreateRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRoomResponseBody body);

        @Override
        CreateRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRoomResponse response) {
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
        public Builder body(CreateRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRoomResponse build() {
            return new CreateRoomResponse(this);
        } 

    } 

}
