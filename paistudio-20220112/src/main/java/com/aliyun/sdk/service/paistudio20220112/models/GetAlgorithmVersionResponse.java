// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmVersionResponse} extends {@link TeaModel}
 *
 * <p>GetAlgorithmVersionResponse</p>
 */
public class GetAlgorithmVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAlgorithmVersionResponseBody body;

    private GetAlgorithmVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAlgorithmVersionResponse create() {
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
    public GetAlgorithmVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlgorithmVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAlgorithmVersionResponseBody body);

        @Override
        GetAlgorithmVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlgorithmVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAlgorithmVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlgorithmVersionResponse response) {
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
        public Builder body(GetAlgorithmVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAlgorithmVersionResponse build() {
            return new GetAlgorithmVersionResponse(this);
        } 

    } 

}
