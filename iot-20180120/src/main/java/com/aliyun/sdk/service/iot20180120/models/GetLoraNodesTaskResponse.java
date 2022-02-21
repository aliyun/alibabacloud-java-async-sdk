// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoraNodesTaskResponse} extends {@link TeaModel}
 *
 * <p>GetLoraNodesTaskResponse</p>
 */
public class GetLoraNodesTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLoraNodesTaskResponseBody body;

    private GetLoraNodesTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLoraNodesTaskResponse create() {
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
    public GetLoraNodesTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLoraNodesTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLoraNodesTaskResponseBody body);

        @Override
        GetLoraNodesTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLoraNodesTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLoraNodesTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLoraNodesTaskResponse response) {
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
        public Builder body(GetLoraNodesTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLoraNodesTaskResponse build() {
            return new GetLoraNodesTaskResponse(this);
        } 

    } 

}
