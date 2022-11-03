// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChargeFlowResponse} extends {@link TeaModel}
 *
 * <p>ChargeFlowResponse</p>
 */
public class ChargeFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChargeFlowResponseBody body;

    private ChargeFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChargeFlowResponse create() {
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
    public ChargeFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChargeFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChargeFlowResponseBody body);

        @Override
        ChargeFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChargeFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChargeFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChargeFlowResponse response) {
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
        public Builder body(ChargeFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChargeFlowResponse build() {
            return new ChargeFlowResponse(this);
        } 

    } 

}
