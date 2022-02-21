// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessCategoryListResponse} extends {@link TeaModel}
 *
 * <p>GetBusinessCategoryListResponse</p>
 */
public class GetBusinessCategoryListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBusinessCategoryListResponseBody body;

    private GetBusinessCategoryListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBusinessCategoryListResponse create() {
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
    public GetBusinessCategoryListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBusinessCategoryListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBusinessCategoryListResponseBody body);

        @Override
        GetBusinessCategoryListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBusinessCategoryListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBusinessCategoryListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBusinessCategoryListResponse response) {
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
        public Builder body(GetBusinessCategoryListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBusinessCategoryListResponse build() {
            return new GetBusinessCategoryListResponse(this);
        } 

    } 

}
