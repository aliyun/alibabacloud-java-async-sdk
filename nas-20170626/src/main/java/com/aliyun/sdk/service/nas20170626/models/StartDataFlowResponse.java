// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDataFlowResponse} extends {@link TeaModel}
 *
 * <p>StartDataFlowResponse</p>
 */
public class StartDataFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDataFlowResponseBody body;

    private StartDataFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDataFlowResponse create() {
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
    public StartDataFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDataFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDataFlowResponseBody body);

        @Override
        StartDataFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDataFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDataFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDataFlowResponse response) {
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
        public Builder body(StartDataFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDataFlowResponse build() {
            return new StartDataFlowResponse(this);
        } 

    } 

}
