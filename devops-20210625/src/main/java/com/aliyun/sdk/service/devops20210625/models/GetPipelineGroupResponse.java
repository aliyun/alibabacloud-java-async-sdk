// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineGroupResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineGroupResponse</p>
 */
public class GetPipelineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineGroupResponseBody body;

    private GetPipelineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineGroupResponse create() {
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
    public GetPipelineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineGroupResponseBody body);

        @Override
        GetPipelineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineGroupResponse response) {
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
        public Builder body(GetPipelineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineGroupResponse build() {
            return new GetPipelineGroupResponse(this);
        } 

    } 

}
