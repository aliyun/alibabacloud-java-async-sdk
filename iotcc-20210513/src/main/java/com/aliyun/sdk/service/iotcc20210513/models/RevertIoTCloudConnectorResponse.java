// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevertIoTCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>RevertIoTCloudConnectorResponse</p>
 */
public class RevertIoTCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevertIoTCloudConnectorResponseBody body;

    private RevertIoTCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevertIoTCloudConnectorResponse create() {
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
    public RevertIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevertIoTCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevertIoTCloudConnectorResponseBody body);

        @Override
        RevertIoTCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevertIoTCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevertIoTCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevertIoTCloudConnectorResponse response) {
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
        public Builder body(RevertIoTCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevertIoTCloudConnectorResponse build() {
            return new RevertIoTCloudConnectorResponse(this);
        } 

    } 

}
