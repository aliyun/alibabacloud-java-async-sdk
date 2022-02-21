// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceCaptureResponse} extends {@link TeaModel}
 *
 * <p>ModifyDeviceCaptureResponse</p>
 */
public class ModifyDeviceCaptureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDeviceCaptureResponseBody body;

    private ModifyDeviceCaptureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDeviceCaptureResponse create() {
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
    public ModifyDeviceCaptureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDeviceCaptureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDeviceCaptureResponseBody body);

        @Override
        ModifyDeviceCaptureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDeviceCaptureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDeviceCaptureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDeviceCaptureResponse response) {
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
        public Builder body(ModifyDeviceCaptureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDeviceCaptureResponse build() {
            return new ModifyDeviceCaptureResponse(this);
        } 

    } 

}
