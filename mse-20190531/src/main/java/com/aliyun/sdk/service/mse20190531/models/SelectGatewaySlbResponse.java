// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SelectGatewaySlbResponse} extends {@link TeaModel}
 *
 * <p>SelectGatewaySlbResponse</p>
 */
public class SelectGatewaySlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SelectGatewaySlbResponseBody body;

    private SelectGatewaySlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SelectGatewaySlbResponse create() {
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
    public SelectGatewaySlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SelectGatewaySlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SelectGatewaySlbResponseBody body);

        @Override
        SelectGatewaySlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SelectGatewaySlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SelectGatewaySlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SelectGatewaySlbResponse response) {
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
        public Builder body(SelectGatewaySlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SelectGatewaySlbResponse build() {
            return new SelectGatewaySlbResponse(this);
        } 

    } 

}
