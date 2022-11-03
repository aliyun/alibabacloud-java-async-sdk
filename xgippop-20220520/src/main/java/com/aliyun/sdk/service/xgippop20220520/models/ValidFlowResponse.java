// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidFlowResponse} extends {@link TeaModel}
 *
 * <p>ValidFlowResponse</p>
 */
public class ValidFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidFlowResponseBody body;

    private ValidFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidFlowResponse create() {
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
    public ValidFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidFlowResponseBody body);

        @Override
        ValidFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidFlowResponse response) {
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
        public Builder body(ValidFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidFlowResponse build() {
            return new ValidFlowResponse(this);
        } 

    } 

}
