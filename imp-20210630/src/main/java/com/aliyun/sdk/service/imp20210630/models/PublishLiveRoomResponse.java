// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLiveRoomResponse} extends {@link TeaModel}
 *
 * <p>PublishLiveRoomResponse</p>
 */
public class PublishLiveRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishLiveRoomResponseBody body;

    private PublishLiveRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishLiveRoomResponse create() {
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
    public PublishLiveRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishLiveRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishLiveRoomResponseBody body);

        @Override
        PublishLiveRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishLiveRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishLiveRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishLiveRoomResponse response) {
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
        public Builder body(PublishLiveRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishLiveRoomResponse build() {
            return new PublishLiveRoomResponse(this);
        } 

    } 

}
