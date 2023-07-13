// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceInfoResponse</p>
 */
public class GetDeviceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceInfoResponseBody body;

    private GetDeviceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceInfoResponse create() {
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
    public GetDeviceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceInfoResponseBody body);

        @Override
        GetDeviceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceInfoResponse response) {
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
        public Builder body(GetDeviceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceInfoResponse build() {
            return new GetDeviceInfoResponse(this);
        } 

    } 

}
