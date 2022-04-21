// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenIoTCloudConnectorServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenIoTCloudConnectorServiceResponse</p>
 */
public class OpenIoTCloudConnectorServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenIoTCloudConnectorServiceResponseBody body;

    private OpenIoTCloudConnectorServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenIoTCloudConnectorServiceResponse create() {
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
    public OpenIoTCloudConnectorServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenIoTCloudConnectorServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenIoTCloudConnectorServiceResponseBody body);

        @Override
        OpenIoTCloudConnectorServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenIoTCloudConnectorServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenIoTCloudConnectorServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenIoTCloudConnectorServiceResponse response) {
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
        public Builder body(OpenIoTCloudConnectorServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenIoTCloudConnectorServiceResponse build() {
            return new OpenIoTCloudConnectorServiceResponse(this);
        } 

    } 

}
