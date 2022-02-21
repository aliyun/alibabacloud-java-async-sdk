// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDevicesResponse} extends {@link TeaModel}
 *
 * <p>CheckDevicesResponse</p>
 */
public class CheckDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDevicesResponseBody body;

    private CheckDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDevicesResponse create() {
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
    public CheckDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDevicesResponseBody body);

        @Override
        CheckDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDevicesResponse response) {
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
        public Builder body(CheckDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDevicesResponse build() {
            return new CheckDevicesResponse(this);
        } 

    } 

}
