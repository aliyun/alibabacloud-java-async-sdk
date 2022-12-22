// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableFlowResponse} extends {@link TeaModel}
 *
 * <p>EnableFlowResponse</p>
 */
public class EnableFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableFlowResponseBody body;

    private EnableFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableFlowResponse create() {
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
    public EnableFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableFlowResponseBody body);

        @Override
        EnableFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableFlowResponse response) {
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
        public Builder body(EnableFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableFlowResponse build() {
            return new EnableFlowResponse(this);
        } 

    } 

}
