// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentIndexRealTimeResponse} extends {@link TeaModel}
 *
 * <p>GetAgentIndexRealTimeResponse</p>
 */
public class GetAgentIndexRealTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentIndexRealTimeResponseBody body;

    private GetAgentIndexRealTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentIndexRealTimeResponse create() {
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
    public GetAgentIndexRealTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentIndexRealTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentIndexRealTimeResponseBody body);

        @Override
        GetAgentIndexRealTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentIndexRealTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentIndexRealTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentIndexRealTimeResponse response) {
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
        public Builder body(GetAgentIndexRealTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentIndexRealTimeResponse build() {
            return new GetAgentIndexRealTimeResponse(this);
        } 

    } 

}
