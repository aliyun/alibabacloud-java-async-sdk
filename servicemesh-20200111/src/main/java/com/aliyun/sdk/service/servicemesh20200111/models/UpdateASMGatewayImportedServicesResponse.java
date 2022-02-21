// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateASMGatewayImportedServicesResponse} extends {@link TeaModel}
 *
 * <p>UpdateASMGatewayImportedServicesResponse</p>
 */
public class UpdateASMGatewayImportedServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateASMGatewayImportedServicesResponseBody body;

    private UpdateASMGatewayImportedServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateASMGatewayImportedServicesResponse create() {
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
    public UpdateASMGatewayImportedServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateASMGatewayImportedServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateASMGatewayImportedServicesResponseBody body);

        @Override
        UpdateASMGatewayImportedServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateASMGatewayImportedServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateASMGatewayImportedServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateASMGatewayImportedServicesResponse response) {
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
        public Builder body(UpdateASMGatewayImportedServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateASMGatewayImportedServicesResponse build() {
            return new UpdateASMGatewayImportedServicesResponse(this);
        } 

    } 

}
