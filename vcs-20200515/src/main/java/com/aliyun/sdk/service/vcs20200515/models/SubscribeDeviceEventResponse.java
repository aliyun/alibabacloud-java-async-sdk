// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeDeviceEventResponse} extends {@link TeaModel}
 *
 * <p>SubscribeDeviceEventResponse</p>
 */
public class SubscribeDeviceEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubscribeDeviceEventResponseBody body;

    private SubscribeDeviceEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubscribeDeviceEventResponse create() {
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
    public SubscribeDeviceEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubscribeDeviceEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubscribeDeviceEventResponseBody body);

        @Override
        SubscribeDeviceEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubscribeDeviceEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubscribeDeviceEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubscribeDeviceEventResponse response) {
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
        public Builder body(SubscribeDeviceEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubscribeDeviceEventResponse build() {
            return new SubscribeDeviceEventResponse(this);
        } 

    } 

}
