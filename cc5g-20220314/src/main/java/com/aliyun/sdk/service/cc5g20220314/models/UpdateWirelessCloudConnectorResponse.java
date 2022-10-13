// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWirelessCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>UpdateWirelessCloudConnectorResponse</p>
 */
public class UpdateWirelessCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWirelessCloudConnectorResponseBody body;

    private UpdateWirelessCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWirelessCloudConnectorResponse create() {
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
    public UpdateWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWirelessCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWirelessCloudConnectorResponseBody body);

        @Override
        UpdateWirelessCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWirelessCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWirelessCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWirelessCloudConnectorResponse response) {
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
        public Builder body(UpdateWirelessCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWirelessCloudConnectorResponse build() {
            return new UpdateWirelessCloudConnectorResponse(this);
        } 

    } 

}
