// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindAIPlanWithDevicesResponse} extends {@link TeaModel}
 *
 * <p>UnbindAIPlanWithDevicesResponse</p>
 */
public class UnbindAIPlanWithDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindAIPlanWithDevicesResponseBody body;

    private UnbindAIPlanWithDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindAIPlanWithDevicesResponse create() {
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
    public UnbindAIPlanWithDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindAIPlanWithDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindAIPlanWithDevicesResponseBody body);

        @Override
        UnbindAIPlanWithDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindAIPlanWithDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindAIPlanWithDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindAIPlanWithDevicesResponse response) {
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
        public Builder body(UnbindAIPlanWithDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindAIPlanWithDevicesResponse build() {
            return new UnbindAIPlanWithDevicesResponse(this);
        } 

    } 

}
