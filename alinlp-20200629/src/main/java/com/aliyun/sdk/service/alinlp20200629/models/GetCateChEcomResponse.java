// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCateChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetCateChEcomResponse</p>
 */
public class GetCateChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCateChEcomResponseBody body;

    private GetCateChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCateChEcomResponse create() {
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
    public GetCateChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCateChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCateChEcomResponseBody body);

        @Override
        GetCateChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCateChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCateChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCateChEcomResponse response) {
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
        public Builder body(GetCateChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCateChEcomResponse build() {
            return new GetCateChEcomResponse(this);
        } 

    } 

}
