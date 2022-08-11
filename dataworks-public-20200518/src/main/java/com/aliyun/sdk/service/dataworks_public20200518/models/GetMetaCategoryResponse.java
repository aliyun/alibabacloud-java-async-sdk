// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaCategoryResponse} extends {@link TeaModel}
 *
 * <p>GetMetaCategoryResponse</p>
 */
public class GetMetaCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaCategoryResponseBody body;

    private GetMetaCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaCategoryResponse create() {
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
    public GetMetaCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaCategoryResponseBody body);

        @Override
        GetMetaCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaCategoryResponse response) {
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
        public Builder body(GetMetaCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaCategoryResponse build() {
            return new GetMetaCategoryResponse(this);
        } 

    } 

}
