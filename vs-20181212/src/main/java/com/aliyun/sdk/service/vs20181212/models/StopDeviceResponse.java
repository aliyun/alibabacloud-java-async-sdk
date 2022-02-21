// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDeviceResponse} extends {@link TeaModel}
 *
 * <p>StopDeviceResponse</p>
 */
public class StopDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDeviceResponseBody body;

    private StopDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDeviceResponse create() {
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
    public StopDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDeviceResponseBody body);

        @Override
        StopDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDeviceResponse response) {
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
        public Builder body(StopDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDeviceResponse build() {
            return new StopDeviceResponse(this);
        } 

    } 

}
