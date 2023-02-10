// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearDeviceDesiredPropertyResponse} extends {@link TeaModel}
 *
 * <p>ClearDeviceDesiredPropertyResponse</p>
 */
public class ClearDeviceDesiredPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClearDeviceDesiredPropertyResponseBody body;

    private ClearDeviceDesiredPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClearDeviceDesiredPropertyResponse create() {
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
    public ClearDeviceDesiredPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClearDeviceDesiredPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClearDeviceDesiredPropertyResponseBody body);

        @Override
        ClearDeviceDesiredPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClearDeviceDesiredPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClearDeviceDesiredPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClearDeviceDesiredPropertyResponse response) {
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
        public Builder body(ClearDeviceDesiredPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClearDeviceDesiredPropertyResponse build() {
            return new ClearDeviceDesiredPropertyResponse(this);
        } 

    } 

}
