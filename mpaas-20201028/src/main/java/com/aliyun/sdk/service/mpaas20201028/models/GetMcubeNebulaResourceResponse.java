// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcubeNebulaResourceResponse} extends {@link TeaModel}
 *
 * <p>GetMcubeNebulaResourceResponse</p>
 */
public class GetMcubeNebulaResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMcubeNebulaResourceResponseBody body;

    private GetMcubeNebulaResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMcubeNebulaResourceResponse create() {
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
    public GetMcubeNebulaResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMcubeNebulaResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMcubeNebulaResourceResponseBody body);

        @Override
        GetMcubeNebulaResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMcubeNebulaResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMcubeNebulaResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMcubeNebulaResourceResponse response) {
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
        public Builder body(GetMcubeNebulaResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMcubeNebulaResourceResponse build() {
            return new GetMcubeNebulaResourceResponse(this);
        } 

    } 

}
