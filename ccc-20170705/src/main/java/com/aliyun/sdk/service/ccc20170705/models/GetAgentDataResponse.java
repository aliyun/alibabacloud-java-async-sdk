// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentDataResponse} extends {@link TeaModel}
 *
 * <p>GetAgentDataResponse</p>
 */
public class GetAgentDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentDataResponseBody body;

    private GetAgentDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentDataResponse create() {
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
    public GetAgentDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentDataResponseBody body);

        @Override
        GetAgentDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentDataResponse response) {
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
        public Builder body(GetAgentDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentDataResponse build() {
            return new GetAgentDataResponse(this);
        } 

    } 

}
