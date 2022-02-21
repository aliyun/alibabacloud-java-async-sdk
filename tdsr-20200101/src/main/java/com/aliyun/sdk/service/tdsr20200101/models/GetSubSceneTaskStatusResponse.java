// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubSceneTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>GetSubSceneTaskStatusResponse</p>
 */
public class GetSubSceneTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSubSceneTaskStatusResponseBody body;

    private GetSubSceneTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSubSceneTaskStatusResponse create() {
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
    public GetSubSceneTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSubSceneTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSubSceneTaskStatusResponseBody body);

        @Override
        GetSubSceneTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSubSceneTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSubSceneTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSubSceneTaskStatusResponse response) {
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
        public Builder body(GetSubSceneTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSubSceneTaskStatusResponse build() {
            return new GetSubSceneTaskStatusResponse(this);
        } 

    } 

}
