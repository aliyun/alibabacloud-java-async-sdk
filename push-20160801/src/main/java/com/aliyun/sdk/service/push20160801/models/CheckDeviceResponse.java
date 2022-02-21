// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDeviceResponse} extends {@link TeaModel}
 *
 * <p>CheckDeviceResponse</p>
 */
public class CheckDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDeviceResponseBody body;

    private CheckDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDeviceResponse create() {
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
    public CheckDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDeviceResponseBody body);

        @Override
        CheckDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDeviceResponse response) {
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
        public Builder body(CheckDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDeviceResponse build() {
            return new CheckDeviceResponse(this);
        } 

    } 

}
