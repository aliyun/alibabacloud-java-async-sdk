// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentByIdResponse} extends {@link TeaModel}
 *
 * <p>GetAgentByIdResponse</p>
 */
public class GetAgentByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentByIdResponseBody body;

    private GetAgentByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentByIdResponse create() {
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
    public GetAgentByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentByIdResponseBody body);

        @Override
        GetAgentByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentByIdResponse response) {
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
        public Builder body(GetAgentByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentByIdResponse build() {
            return new GetAgentByIdResponse(this);
        } 

    } 

}
