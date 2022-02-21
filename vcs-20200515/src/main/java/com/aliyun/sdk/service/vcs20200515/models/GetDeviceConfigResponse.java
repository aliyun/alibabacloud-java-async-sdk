// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceConfigResponse</p>
 */
public class GetDeviceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceConfigResponseBody body;

    private GetDeviceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceConfigResponse create() {
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
    public GetDeviceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceConfigResponseBody body);

        @Override
        GetDeviceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceConfigResponse response) {
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
        public Builder body(GetDeviceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceConfigResponse build() {
            return new GetDeviceConfigResponse(this);
        } 

    } 

}
