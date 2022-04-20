// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioGatewayRoutesResponse} extends {@link TeaModel}
 *
 * <p>UpdateIstioGatewayRoutesResponse</p>
 */
public class UpdateIstioGatewayRoutesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIstioGatewayRoutesResponseBody body;

    private UpdateIstioGatewayRoutesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIstioGatewayRoutesResponse create() {
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
    public UpdateIstioGatewayRoutesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIstioGatewayRoutesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIstioGatewayRoutesResponseBody body);

        @Override
        UpdateIstioGatewayRoutesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIstioGatewayRoutesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIstioGatewayRoutesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIstioGatewayRoutesResponse response) {
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
        public Builder body(UpdateIstioGatewayRoutesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIstioGatewayRoutesResponse build() {
            return new UpdateIstioGatewayRoutesResponse(this);
        } 

    } 

}
