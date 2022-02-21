// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendRoomNotificationResponse} extends {@link TeaModel}
 *
 * <p>SendRoomNotificationResponse</p>
 */
public class SendRoomNotificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendRoomNotificationResponseBody body;

    private SendRoomNotificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendRoomNotificationResponse create() {
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
    public SendRoomNotificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendRoomNotificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendRoomNotificationResponseBody body);

        @Override
        SendRoomNotificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendRoomNotificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendRoomNotificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendRoomNotificationResponse response) {
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
        public Builder body(SendRoomNotificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendRoomNotificationResponse build() {
            return new SendRoomNotificationResponse(this);
        } 

    } 

}
