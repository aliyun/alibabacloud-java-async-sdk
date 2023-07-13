// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceListResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceListResponse</p>
 */
public class GetDeviceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceListResponseBody body;

    private GetDeviceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceListResponse create() {
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
    public GetDeviceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceListResponseBody body);

        @Override
        GetDeviceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceListResponse response) {
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
        public Builder body(GetDeviceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceListResponse build() {
            return new GetDeviceListResponse(this);
        } 

    } 

}
