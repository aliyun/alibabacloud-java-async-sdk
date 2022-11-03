// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkChargeFlowResponse} extends {@link TeaModel}
 *
 * <p>SdkChargeFlowResponse</p>
 */
public class SdkChargeFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SdkChargeFlowResponseBody body;

    private SdkChargeFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SdkChargeFlowResponse create() {
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
    public SdkChargeFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SdkChargeFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SdkChargeFlowResponseBody body);

        @Override
        SdkChargeFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SdkChargeFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SdkChargeFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SdkChargeFlowResponse response) {
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
        public Builder body(SdkChargeFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SdkChargeFlowResponse build() {
            return new SdkChargeFlowResponse(this);
        } 

    } 

}
