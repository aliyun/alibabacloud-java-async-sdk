// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KickRoomUserResponse} extends {@link TeaModel}
 *
 * <p>KickRoomUserResponse</p>
 */
public class KickRoomUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private KickRoomUserResponseBody body;

    private KickRoomUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static KickRoomUserResponse create() {
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
    public KickRoomUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KickRoomUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(KickRoomUserResponseBody body);

        @Override
        KickRoomUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KickRoomUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private KickRoomUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KickRoomUserResponse response) {
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
        public Builder body(KickRoomUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KickRoomUserResponse build() {
            return new KickRoomUserResponse(this);
        } 

    } 

}
