// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAIPlanWithDevicesResponse} extends {@link TeaModel}
 *
 * <p>BindAIPlanWithDevicesResponse</p>
 */
public class BindAIPlanWithDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindAIPlanWithDevicesResponseBody body;

    private BindAIPlanWithDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindAIPlanWithDevicesResponse create() {
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
    public BindAIPlanWithDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindAIPlanWithDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindAIPlanWithDevicesResponseBody body);

        @Override
        BindAIPlanWithDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindAIPlanWithDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindAIPlanWithDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindAIPlanWithDevicesResponse response) {
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
        public Builder body(BindAIPlanWithDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindAIPlanWithDevicesResponse build() {
            return new BindAIPlanWithDevicesResponse(this);
        } 

    } 

}
