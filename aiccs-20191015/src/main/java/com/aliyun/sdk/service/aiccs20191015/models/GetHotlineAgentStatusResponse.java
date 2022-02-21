// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineAgentStatusResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineAgentStatusResponse</p>
 */
public class GetHotlineAgentStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineAgentStatusResponseBody body;

    private GetHotlineAgentStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineAgentStatusResponse create() {
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
    public GetHotlineAgentStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineAgentStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineAgentStatusResponseBody body);

        @Override
        GetHotlineAgentStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineAgentStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineAgentStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineAgentStatusResponse response) {
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
        public Builder body(GetHotlineAgentStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineAgentStatusResponse build() {
            return new GetHotlineAgentStatusResponse(this);
        } 

    } 

}
