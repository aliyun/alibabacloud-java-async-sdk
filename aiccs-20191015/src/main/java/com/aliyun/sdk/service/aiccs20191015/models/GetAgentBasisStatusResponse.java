// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentBasisStatusResponse} extends {@link TeaModel}
 *
 * <p>GetAgentBasisStatusResponse</p>
 */
public class GetAgentBasisStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentBasisStatusResponseBody body;

    private GetAgentBasisStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentBasisStatusResponse create() {
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
    public GetAgentBasisStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentBasisStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentBasisStatusResponseBody body);

        @Override
        GetAgentBasisStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentBasisStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentBasisStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentBasisStatusResponse response) {
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
        public Builder body(GetAgentBasisStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentBasisStatusResponse build() {
            return new GetAgentBasisStatusResponse(this);
        } 

    } 

}
