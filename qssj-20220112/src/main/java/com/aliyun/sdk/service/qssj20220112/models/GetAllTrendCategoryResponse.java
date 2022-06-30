// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllTrendCategoryResponse} extends {@link TeaModel}
 *
 * <p>GetAllTrendCategoryResponse</p>
 */
public class GetAllTrendCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllTrendCategoryResponseBody body;

    private GetAllTrendCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllTrendCategoryResponse create() {
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
    public GetAllTrendCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllTrendCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllTrendCategoryResponseBody body);

        @Override
        GetAllTrendCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllTrendCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllTrendCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllTrendCategoryResponse response) {
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
        public Builder body(GetAllTrendCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllTrendCategoryResponse build() {
            return new GetAllTrendCategoryResponse(this);
        } 

    } 

}
