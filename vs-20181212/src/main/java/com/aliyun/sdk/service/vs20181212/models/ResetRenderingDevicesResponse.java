// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetRenderingDevicesResponse} extends {@link TeaModel}
 *
 * <p>ResetRenderingDevicesResponse</p>
 */
public class ResetRenderingDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetRenderingDevicesResponseBody body;

    private ResetRenderingDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetRenderingDevicesResponse create() {
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
    public ResetRenderingDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetRenderingDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetRenderingDevicesResponseBody body);

        @Override
        ResetRenderingDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetRenderingDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetRenderingDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetRenderingDevicesResponse response) {
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
        public Builder body(ResetRenderingDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetRenderingDevicesResponse build() {
            return new ResetRenderingDevicesResponse(this);
        } 

    } 

}
