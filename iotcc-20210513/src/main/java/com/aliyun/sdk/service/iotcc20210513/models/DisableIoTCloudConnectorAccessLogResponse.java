// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableIoTCloudConnectorAccessLogResponse} extends {@link TeaModel}
 *
 * <p>DisableIoTCloudConnectorAccessLogResponse</p>
 */
public class DisableIoTCloudConnectorAccessLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableIoTCloudConnectorAccessLogResponseBody body;

    private DisableIoTCloudConnectorAccessLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableIoTCloudConnectorAccessLogResponse create() {
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
    public DisableIoTCloudConnectorAccessLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableIoTCloudConnectorAccessLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableIoTCloudConnectorAccessLogResponseBody body);

        @Override
        DisableIoTCloudConnectorAccessLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableIoTCloudConnectorAccessLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableIoTCloudConnectorAccessLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableIoTCloudConnectorAccessLogResponse response) {
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
        public Builder body(DisableIoTCloudConnectorAccessLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableIoTCloudConnectorAccessLogResponse build() {
            return new DisableIoTCloudConnectorAccessLogResponse(this);
        } 

    } 

}
