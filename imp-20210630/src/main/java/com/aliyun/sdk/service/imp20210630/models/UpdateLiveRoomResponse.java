// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRoomResponse} extends {@link TeaModel}
 *
 * <p>UpdateLiveRoomResponse</p>
 */
public class UpdateLiveRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLiveRoomResponseBody body;

    private UpdateLiveRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLiveRoomResponse create() {
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
    public UpdateLiveRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLiveRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLiveRoomResponseBody body);

        @Override
        UpdateLiveRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLiveRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLiveRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLiveRoomResponse response) {
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
        public Builder body(UpdateLiveRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLiveRoomResponse build() {
            return new UpdateLiveRoomResponse(this);
        } 

    } 

}
