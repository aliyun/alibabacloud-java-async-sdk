// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewaySpecResponse} extends {@link TeaModel}
 *
 * <p>UpdateGatewaySpecResponse</p>
 */
public class UpdateGatewaySpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGatewaySpecResponseBody body;

    private UpdateGatewaySpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGatewaySpecResponse create() {
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
    public UpdateGatewaySpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGatewaySpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGatewaySpecResponseBody body);

        @Override
        UpdateGatewaySpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGatewaySpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGatewaySpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGatewaySpecResponse response) {
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
        public Builder body(UpdateGatewaySpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGatewaySpecResponse build() {
            return new UpdateGatewaySpecResponse(this);
        } 

    } 

}
