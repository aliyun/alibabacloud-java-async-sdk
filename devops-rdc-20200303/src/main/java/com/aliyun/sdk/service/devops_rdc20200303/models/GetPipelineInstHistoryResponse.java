// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstHistoryResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineInstHistoryResponse</p>
 */
public class GetPipelineInstHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineInstHistoryResponseBody body;

    private GetPipelineInstHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineInstHistoryResponse create() {
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
    public GetPipelineInstHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineInstHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineInstHistoryResponseBody body);

        @Override
        GetPipelineInstHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineInstHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineInstHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineInstHistoryResponse response) {
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
        public Builder body(GetPipelineInstHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineInstHistoryResponse build() {
            return new GetPipelineInstHistoryResponse(this);
        } 

    } 

}
