// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendRoomUserNotificationResponse} extends {@link TeaModel}
 *
 * <p>SendRoomUserNotificationResponse</p>
 */
public class SendRoomUserNotificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendRoomUserNotificationResponseBody body;

    private SendRoomUserNotificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendRoomUserNotificationResponse create() {
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
    public SendRoomUserNotificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendRoomUserNotificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendRoomUserNotificationResponseBody body);

        @Override
        SendRoomUserNotificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendRoomUserNotificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendRoomUserNotificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendRoomUserNotificationResponse response) {
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
        public Builder body(SendRoomUserNotificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendRoomUserNotificationResponse build() {
            return new SendRoomUserNotificationResponse(this);
        } 

    } 

}
