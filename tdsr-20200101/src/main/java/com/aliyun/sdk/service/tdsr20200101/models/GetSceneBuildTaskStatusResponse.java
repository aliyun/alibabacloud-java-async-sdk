// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSceneBuildTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>GetSceneBuildTaskStatusResponse</p>
 */
public class GetSceneBuildTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSceneBuildTaskStatusResponseBody body;

    private GetSceneBuildTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSceneBuildTaskStatusResponse create() {
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
    public GetSceneBuildTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSceneBuildTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSceneBuildTaskStatusResponseBody body);

        @Override
        GetSceneBuildTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSceneBuildTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSceneBuildTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSceneBuildTaskStatusResponse response) {
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
        public Builder body(GetSceneBuildTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSceneBuildTaskStatusResponse build() {
            return new GetSceneBuildTaskStatusResponse(this);
        } 

    } 

}
