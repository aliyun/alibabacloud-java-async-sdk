// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBrandChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetBrandChEcomResponse</p>
 */
public class GetBrandChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBrandChEcomResponseBody body;

    private GetBrandChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBrandChEcomResponse create() {
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
    public GetBrandChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBrandChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBrandChEcomResponseBody body);

        @Override
        GetBrandChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBrandChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBrandChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBrandChEcomResponse response) {
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
        public Builder body(GetBrandChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBrandChEcomResponse build() {
            return new GetBrandChEcomResponse(this);
        } 

    } 

}
