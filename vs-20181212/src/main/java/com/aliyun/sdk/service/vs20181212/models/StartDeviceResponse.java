// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDeviceResponse} extends {@link TeaModel}
 *
 * <p>StartDeviceResponse</p>
 */
public class StartDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDeviceResponseBody body;

    private StartDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDeviceResponse create() {
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
    public StartDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDeviceResponseBody body);

        @Override
        StartDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDeviceResponse response) {
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
        public Builder body(StartDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDeviceResponse build() {
            return new StartDeviceResponse(this);
        } 

    } 

}
