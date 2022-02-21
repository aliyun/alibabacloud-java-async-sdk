// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>GetVideoTaskResponse</p>
 */
public class GetVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVideoTaskResponseBody body;

    private GetVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVideoTaskResponse create() {
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
    public GetVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVideoTaskResponseBody body);

        @Override
        GetVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoTaskResponse response) {
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
        public Builder body(GetVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoTaskResponse build() {
            return new GetVideoTaskResponse(this);
        } 

    } 

}
