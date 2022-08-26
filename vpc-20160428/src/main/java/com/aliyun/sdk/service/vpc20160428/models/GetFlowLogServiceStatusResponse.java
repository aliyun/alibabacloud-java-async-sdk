// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowLogServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetFlowLogServiceStatusResponse</p>
 */
public class GetFlowLogServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFlowLogServiceStatusResponseBody body;

    private GetFlowLogServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFlowLogServiceStatusResponse create() {
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
    public GetFlowLogServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFlowLogServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFlowLogServiceStatusResponseBody body);

        @Override
        GetFlowLogServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFlowLogServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFlowLogServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFlowLogServiceStatusResponse response) {
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
        public Builder body(GetFlowLogServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFlowLogServiceStatusResponse build() {
            return new GetFlowLogServiceStatusResponse(this);
        } 

    } 

}
