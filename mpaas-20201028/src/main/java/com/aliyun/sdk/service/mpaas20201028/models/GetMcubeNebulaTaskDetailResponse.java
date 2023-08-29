// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcubeNebulaTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>GetMcubeNebulaTaskDetailResponse</p>
 */
public class GetMcubeNebulaTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMcubeNebulaTaskDetailResponseBody body;

    private GetMcubeNebulaTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMcubeNebulaTaskDetailResponse create() {
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
    public GetMcubeNebulaTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMcubeNebulaTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMcubeNebulaTaskDetailResponseBody body);

        @Override
        GetMcubeNebulaTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMcubeNebulaTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMcubeNebulaTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMcubeNebulaTaskDetailResponse response) {
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
        public Builder body(GetMcubeNebulaTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMcubeNebulaTaskDetailResponse build() {
            return new GetMcubeNebulaTaskDetailResponse(this);
        } 

    } 

}
