// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionDefaultInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionDefaultInstanceResponse</p>
 */
public class GetFunctionDefaultInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionDefaultInstanceResponseBody body;

    private GetFunctionDefaultInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionDefaultInstanceResponse create() {
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
    public GetFunctionDefaultInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionDefaultInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionDefaultInstanceResponseBody body);

        @Override
        GetFunctionDefaultInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionDefaultInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionDefaultInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionDefaultInstanceResponse response) {
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
        public Builder body(GetFunctionDefaultInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionDefaultInstanceResponse build() {
            return new GetFunctionDefaultInstanceResponse(this);
        } 

    } 

}
