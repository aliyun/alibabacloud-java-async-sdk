// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GisQueryDeviceLocationResponse} extends {@link TeaModel}
 *
 * <p>GisQueryDeviceLocationResponse</p>
 */
public class GisQueryDeviceLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GisQueryDeviceLocationResponseBody body;

    private GisQueryDeviceLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GisQueryDeviceLocationResponse create() {
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
    public GisQueryDeviceLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GisQueryDeviceLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GisQueryDeviceLocationResponseBody body);

        @Override
        GisQueryDeviceLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GisQueryDeviceLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GisQueryDeviceLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GisQueryDeviceLocationResponse response) {
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
        public Builder body(GisQueryDeviceLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GisQueryDeviceLocationResponse build() {
            return new GisQueryDeviceLocationResponse(this);
        } 

    } 

}
