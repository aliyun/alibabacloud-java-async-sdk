// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmIoTCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>ConfirmIoTCloudConnectorResponse</p>
 */
public class ConfirmIoTCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmIoTCloudConnectorResponseBody body;

    private ConfirmIoTCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmIoTCloudConnectorResponse create() {
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
    public ConfirmIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmIoTCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmIoTCloudConnectorResponseBody body);

        @Override
        ConfirmIoTCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmIoTCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmIoTCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmIoTCloudConnectorResponse response) {
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
        public Builder body(ConfirmIoTCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmIoTCloudConnectorResponse build() {
            return new ConfirmIoTCloudConnectorResponse(this);
        } 

    } 

}
