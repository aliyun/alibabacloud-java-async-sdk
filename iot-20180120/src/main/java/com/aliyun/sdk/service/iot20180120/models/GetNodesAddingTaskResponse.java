// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodesAddingTaskResponse} extends {@link TeaModel}
 *
 * <p>GetNodesAddingTaskResponse</p>
 */
public class GetNodesAddingTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodesAddingTaskResponseBody body;

    private GetNodesAddingTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodesAddingTaskResponse create() {
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
    public GetNodesAddingTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodesAddingTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodesAddingTaskResponseBody body);

        @Override
        GetNodesAddingTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodesAddingTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodesAddingTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodesAddingTaskResponse response) {
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
        public Builder body(GetNodesAddingTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodesAddingTaskResponse build() {
            return new GetNodesAddingTaskResponse(this);
        } 

    } 

}
