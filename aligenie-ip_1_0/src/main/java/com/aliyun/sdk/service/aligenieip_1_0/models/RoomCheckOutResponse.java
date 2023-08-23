// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RoomCheckOutResponse} extends {@link TeaModel}
 *
 * <p>RoomCheckOutResponse</p>
 */
public class RoomCheckOutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RoomCheckOutResponseBody body;

    private RoomCheckOutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RoomCheckOutResponse create() {
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
    public RoomCheckOutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RoomCheckOutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RoomCheckOutResponseBody body);

        @Override
        RoomCheckOutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RoomCheckOutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RoomCheckOutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RoomCheckOutResponse response) {
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
        public Builder body(RoomCheckOutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RoomCheckOutResponse build() {
            return new RoomCheckOutResponse(this);
        } 

    } 

}
