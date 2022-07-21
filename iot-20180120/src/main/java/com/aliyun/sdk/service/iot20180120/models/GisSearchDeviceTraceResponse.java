// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GisSearchDeviceTraceResponse} extends {@link TeaModel}
 *
 * <p>GisSearchDeviceTraceResponse</p>
 */
public class GisSearchDeviceTraceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GisSearchDeviceTraceResponseBody body;

    private GisSearchDeviceTraceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GisSearchDeviceTraceResponse create() {
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
    public GisSearchDeviceTraceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GisSearchDeviceTraceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GisSearchDeviceTraceResponseBody body);

        @Override
        GisSearchDeviceTraceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GisSearchDeviceTraceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GisSearchDeviceTraceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GisSearchDeviceTraceResponse response) {
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
        public Builder body(GisSearchDeviceTraceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GisSearchDeviceTraceResponse build() {
            return new GisSearchDeviceTraceResponse(this);
        } 

    } 

}
