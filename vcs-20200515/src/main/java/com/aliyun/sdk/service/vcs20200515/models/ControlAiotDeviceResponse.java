// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlAiotDeviceResponse} extends {@link TeaModel}
 *
 * <p>ControlAiotDeviceResponse</p>
 */
public class ControlAiotDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ControlAiotDeviceResponseBody body;

    private ControlAiotDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ControlAiotDeviceResponse create() {
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
    public ControlAiotDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ControlAiotDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ControlAiotDeviceResponseBody body);

        @Override
        ControlAiotDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ControlAiotDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ControlAiotDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ControlAiotDeviceResponse response) {
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
        public Builder body(ControlAiotDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ControlAiotDeviceResponse build() {
            return new ControlAiotDeviceResponse(this);
        } 

    } 

}
