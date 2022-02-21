// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskResponse} extends {@link TeaModel}
 *
 * <p>GetTaskResponse</p>
 */
public class GetTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskResponseBody body;

    private GetTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskResponse create() {
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
    public GetTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskResponseBody body);

        @Override
        GetTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskResponse response) {
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
        public Builder body(GetTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskResponse build() {
            return new GetTaskResponse(this);
        } 

    } 

}
