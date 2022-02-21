// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoomResponse} extends {@link TeaModel}
 *
 * <p>UpdateRoomResponse</p>
 */
public class UpdateRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRoomResponseBody body;

    private UpdateRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRoomResponse create() {
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
    public UpdateRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRoomResponseBody body);

        @Override
        UpdateRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRoomResponse response) {
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
        public Builder body(UpdateRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRoomResponse build() {
            return new UpdateRoomResponse(this);
        } 

    } 

}
