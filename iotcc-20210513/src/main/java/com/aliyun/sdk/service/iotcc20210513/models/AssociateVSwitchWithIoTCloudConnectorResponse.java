// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateVSwitchWithIoTCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>AssociateVSwitchWithIoTCloudConnectorResponse</p>
 */
public class AssociateVSwitchWithIoTCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateVSwitchWithIoTCloudConnectorResponseBody body;

    private AssociateVSwitchWithIoTCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateVSwitchWithIoTCloudConnectorResponse create() {
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
    public AssociateVSwitchWithIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateVSwitchWithIoTCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateVSwitchWithIoTCloudConnectorResponseBody body);

        @Override
        AssociateVSwitchWithIoTCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateVSwitchWithIoTCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateVSwitchWithIoTCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateVSwitchWithIoTCloudConnectorResponse response) {
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
        public Builder body(AssociateVSwitchWithIoTCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateVSwitchWithIoTCloudConnectorResponse build() {
            return new AssociateVSwitchWithIoTCloudConnectorResponse(this);
        } 

    } 

}
