// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateASMGatewayResponse} extends {@link TeaModel}
 *
 * <p>UpdateASMGatewayResponse</p>
 */
public class UpdateASMGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateASMGatewayResponseBody body;

    private UpdateASMGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateASMGatewayResponse create() {
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
    public UpdateASMGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateASMGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateASMGatewayResponseBody body);

        @Override
        UpdateASMGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateASMGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateASMGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateASMGatewayResponse response) {
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
        public Builder body(UpdateASMGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateASMGatewayResponse build() {
            return new UpdateASMGatewayResponse(this);
        } 

    } 

}
