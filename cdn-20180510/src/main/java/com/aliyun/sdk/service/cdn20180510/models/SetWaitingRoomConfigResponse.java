// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWaitingRoomConfigResponse} extends {@link TeaModel}
 *
 * <p>SetWaitingRoomConfigResponse</p>
 */
public class SetWaitingRoomConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetWaitingRoomConfigResponseBody body;

    private SetWaitingRoomConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetWaitingRoomConfigResponse create() {
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
    public SetWaitingRoomConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetWaitingRoomConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetWaitingRoomConfigResponseBody body);

        @Override
        SetWaitingRoomConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetWaitingRoomConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetWaitingRoomConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetWaitingRoomConfigResponse response) {
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
        public Builder body(SetWaitingRoomConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetWaitingRoomConfigResponse build() {
            return new SetWaitingRoomConfigResponse(this);
        } 

    } 

}
