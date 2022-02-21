// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentStatusResponse} extends {@link TeaModel}
 *
 * <p>GetAgentStatusResponse</p>
 */
public class GetAgentStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentStatusResponseBody body;

    private GetAgentStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentStatusResponse create() {
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
    public GetAgentStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentStatusResponseBody body);

        @Override
        GetAgentStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentStatusResponse response) {
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
        public Builder body(GetAgentStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentStatusResponse build() {
            return new GetAgentStatusResponse(this);
        } 

    } 

}
