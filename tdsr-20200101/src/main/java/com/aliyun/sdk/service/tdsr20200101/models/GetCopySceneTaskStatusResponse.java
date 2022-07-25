// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCopySceneTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>GetCopySceneTaskStatusResponse</p>
 */
public class GetCopySceneTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCopySceneTaskStatusResponseBody body;

    private GetCopySceneTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCopySceneTaskStatusResponse create() {
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
    public GetCopySceneTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCopySceneTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCopySceneTaskStatusResponseBody body);

        @Override
        GetCopySceneTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCopySceneTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCopySceneTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCopySceneTaskStatusResponse response) {
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
        public Builder body(GetCopySceneTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCopySceneTaskStatusResponse build() {
            return new GetCopySceneTaskStatusResponse(this);
        } 

    } 

}
