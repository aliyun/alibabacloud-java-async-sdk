// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateVSwitchFromIoTCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>DissociateVSwitchFromIoTCloudConnectorResponse</p>
 */
public class DissociateVSwitchFromIoTCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateVSwitchFromIoTCloudConnectorResponseBody body;

    private DissociateVSwitchFromIoTCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateVSwitchFromIoTCloudConnectorResponse create() {
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
    public DissociateVSwitchFromIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateVSwitchFromIoTCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateVSwitchFromIoTCloudConnectorResponseBody body);

        @Override
        DissociateVSwitchFromIoTCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateVSwitchFromIoTCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateVSwitchFromIoTCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateVSwitchFromIoTCloudConnectorResponse response) {
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
        public Builder body(DissociateVSwitchFromIoTCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateVSwitchFromIoTCloudConnectorResponse build() {
            return new DissociateVSwitchFromIoTCloudConnectorResponse(this);
        } 

    } 

}
