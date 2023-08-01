// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentInfoResponse} extends {@link TeaModel}
 *
 * <p>GetAgentInfoResponse</p>
 */
public class GetAgentInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentInfoResponseBody body;

    private GetAgentInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentInfoResponse create() {
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
    public GetAgentInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentInfoResponseBody body);

        @Override
        GetAgentInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentInfoResponse response) {
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
        public Builder body(GetAgentInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentInfoResponse build() {
            return new GetAgentInfoResponse(this);
        } 

    } 

}
