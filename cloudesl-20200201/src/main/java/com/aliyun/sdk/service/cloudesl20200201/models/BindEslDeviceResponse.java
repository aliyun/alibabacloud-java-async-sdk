// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEslDeviceResponse} extends {@link TeaModel}
 *
 * <p>BindEslDeviceResponse</p>
 */
public class BindEslDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindEslDeviceResponseBody body;

    private BindEslDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindEslDeviceResponse create() {
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
    public BindEslDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindEslDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindEslDeviceResponseBody body);

        @Override
        BindEslDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindEslDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindEslDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindEslDeviceResponse response) {
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
        public Builder body(BindEslDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindEslDeviceResponse build() {
            return new BindEslDeviceResponse(this);
        } 

    } 

}
