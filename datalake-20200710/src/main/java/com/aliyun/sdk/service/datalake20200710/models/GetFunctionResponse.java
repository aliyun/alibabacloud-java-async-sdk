// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionResponse</p>
 */
public class GetFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionResponseBody body;

    private GetFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionResponse create() {
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
    public GetFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionResponseBody body);

        @Override
        GetFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionResponse response) {
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
        public Builder body(GetFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionResponse build() {
            return new GetFunctionResponse(this);
        } 

    } 

}
