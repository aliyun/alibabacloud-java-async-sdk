// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityTaskResponse} extends {@link TeaModel}
 *
 * <p>GetActivityTaskResponse</p>
 */
public class GetActivityTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetActivityTaskResponseBody body;

    private GetActivityTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetActivityTaskResponse create() {
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
    public GetActivityTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetActivityTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetActivityTaskResponseBody body);

        @Override
        GetActivityTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetActivityTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetActivityTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetActivityTaskResponse response) {
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
        public Builder body(GetActivityTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetActivityTaskResponse build() {
            return new GetActivityTaskResponse(this);
        } 

    } 

}
