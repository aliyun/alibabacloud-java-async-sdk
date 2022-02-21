// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFlowResponse} extends {@link TeaModel}
 *
 * <p>SubmitFlowResponse</p>
 */
public class SubmitFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitFlowResponseBody body;

    private SubmitFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitFlowResponse create() {
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
    public SubmitFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitFlowResponseBody body);

        @Override
        SubmitFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitFlowResponse response) {
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
        public Builder body(SubmitFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitFlowResponse build() {
            return new SubmitFlowResponse(this);
        } 

    } 

}
