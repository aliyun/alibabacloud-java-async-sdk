// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardLatestFlowResponse} extends {@link TeaModel}
 *
 * <p>GetCardLatestFlowResponse</p>
 */
public class GetCardLatestFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCardLatestFlowResponseBody body;

    private GetCardLatestFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCardLatestFlowResponse create() {
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
    public GetCardLatestFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCardLatestFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCardLatestFlowResponseBody body);

        @Override
        GetCardLatestFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCardLatestFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCardLatestFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCardLatestFlowResponse response) {
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
        public Builder body(GetCardLatestFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCardLatestFlowResponse build() {
            return new GetCardLatestFlowResponse(this);
        } 

    } 

}
