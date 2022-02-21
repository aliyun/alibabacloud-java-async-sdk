// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNatGatewayNatTypeResponse} extends {@link TeaModel}
 *
 * <p>UpdateNatGatewayNatTypeResponse</p>
 */
public class UpdateNatGatewayNatTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNatGatewayNatTypeResponseBody body;

    private UpdateNatGatewayNatTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNatGatewayNatTypeResponse create() {
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
    public UpdateNatGatewayNatTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNatGatewayNatTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNatGatewayNatTypeResponseBody body);

        @Override
        UpdateNatGatewayNatTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNatGatewayNatTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNatGatewayNatTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNatGatewayNatTypeResponse response) {
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
        public Builder body(UpdateNatGatewayNatTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNatGatewayNatTypeResponse build() {
            return new UpdateNatGatewayNatTypeResponse(this);
        } 

    } 

}
