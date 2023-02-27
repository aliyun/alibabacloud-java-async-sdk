// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartEditContactFlowResponse} extends {@link TeaModel}
 *
 * <p>StartEditContactFlowResponse</p>
 */
public class StartEditContactFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartEditContactFlowResponseBody body;

    private StartEditContactFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartEditContactFlowResponse create() {
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
    public StartEditContactFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartEditContactFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartEditContactFlowResponseBody body);

        @Override
        StartEditContactFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartEditContactFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartEditContactFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartEditContactFlowResponse response) {
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
        public Builder body(StartEditContactFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartEditContactFlowResponse build() {
            return new StartEditContactFlowResponse(this);
        } 

    } 

}
