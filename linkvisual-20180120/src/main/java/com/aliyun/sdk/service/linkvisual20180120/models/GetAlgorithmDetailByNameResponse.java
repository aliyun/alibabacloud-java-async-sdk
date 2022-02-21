// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmDetailByNameResponse} extends {@link TeaModel}
 *
 * <p>GetAlgorithmDetailByNameResponse</p>
 */
public class GetAlgorithmDetailByNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAlgorithmDetailByNameResponseBody body;

    private GetAlgorithmDetailByNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAlgorithmDetailByNameResponse create() {
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
    public GetAlgorithmDetailByNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlgorithmDetailByNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAlgorithmDetailByNameResponseBody body);

        @Override
        GetAlgorithmDetailByNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlgorithmDetailByNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAlgorithmDetailByNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlgorithmDetailByNameResponse response) {
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
        public Builder body(GetAlgorithmDetailByNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAlgorithmDetailByNameResponse build() {
            return new GetAlgorithmDetailByNameResponse(this);
        } 

    } 

}
