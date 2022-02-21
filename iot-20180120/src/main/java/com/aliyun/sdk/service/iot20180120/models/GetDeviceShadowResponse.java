// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceShadowResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceShadowResponse</p>
 */
public class GetDeviceShadowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceShadowResponseBody body;

    private GetDeviceShadowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceShadowResponse create() {
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
    public GetDeviceShadowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceShadowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceShadowResponseBody body);

        @Override
        GetDeviceShadowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceShadowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceShadowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceShadowResponse response) {
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
        public Builder body(GetDeviceShadowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceShadowResponse build() {
            return new GetDeviceShadowResponse(this);
        } 

    } 

}
