// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowResponse} extends {@link TeaModel}
 *
 * <p>GetFlowResponse</p>
 */
public class GetFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFlowResponseBody body;

    private GetFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFlowResponse create() {
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
    public GetFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFlowResponseBody body);

        @Override
        GetFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFlowResponse response) {
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
        public Builder body(GetFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFlowResponse build() {
            return new GetFlowResponse(this);
        } 

    } 

}
