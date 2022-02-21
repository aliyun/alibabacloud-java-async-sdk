// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartFlowResponse} extends {@link TeaModel}
 *
 * <p>StartFlowResponse</p>
 */
public class StartFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartFlowResponseBody body;

    private StartFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartFlowResponse create() {
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
    public StartFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartFlowResponseBody body);

        @Override
        StartFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartFlowResponse response) {
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
        public Builder body(StartFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartFlowResponse build() {
            return new StartFlowResponse(this);
        } 

    } 

}
