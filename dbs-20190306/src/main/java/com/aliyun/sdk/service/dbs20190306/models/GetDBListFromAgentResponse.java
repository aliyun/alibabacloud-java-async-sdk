// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBListFromAgentResponse} extends {@link TeaModel}
 *
 * <p>GetDBListFromAgentResponse</p>
 */
public class GetDBListFromAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDBListFromAgentResponseBody body;

    private GetDBListFromAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDBListFromAgentResponse create() {
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
    public GetDBListFromAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDBListFromAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDBListFromAgentResponseBody body);

        @Override
        GetDBListFromAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDBListFromAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDBListFromAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDBListFromAgentResponse response) {
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
        public Builder body(GetDBListFromAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDBListFromAgentResponse build() {
            return new GetDBListFromAgentResponse(this);
        } 

    } 

}
