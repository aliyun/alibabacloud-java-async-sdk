// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnsubscribeDeviceEventResponse} extends {@link TeaModel}
 *
 * <p>UnsubscribeDeviceEventResponse</p>
 */
public class UnsubscribeDeviceEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnsubscribeDeviceEventResponseBody body;

    private UnsubscribeDeviceEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnsubscribeDeviceEventResponse create() {
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
    public UnsubscribeDeviceEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnsubscribeDeviceEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnsubscribeDeviceEventResponseBody body);

        @Override
        UnsubscribeDeviceEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnsubscribeDeviceEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnsubscribeDeviceEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnsubscribeDeviceEventResponse response) {
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
        public Builder body(UnsubscribeDeviceEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnsubscribeDeviceEventResponse build() {
            return new UnsubscribeDeviceEventResponse(this);
        } 

    } 

}
