// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceCaptureStrategyResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceCaptureStrategyResponse</p>
 */
public class GetDeviceCaptureStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceCaptureStrategyResponseBody body;

    private GetDeviceCaptureStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceCaptureStrategyResponse create() {
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
    public GetDeviceCaptureStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceCaptureStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceCaptureStrategyResponseBody body);

        @Override
        GetDeviceCaptureStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceCaptureStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceCaptureStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceCaptureStrategyResponse response) {
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
        public Builder body(GetDeviceCaptureStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceCaptureStrategyResponse build() {
            return new GetDeviceCaptureStrategyResponse(this);
        } 

    } 

}
