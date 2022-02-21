// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaProductListResponse} extends {@link TeaModel}
 *
 * <p>GetMetaProductListResponse</p>
 */
public class GetMetaProductListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaProductListResponseBody body;

    private GetMetaProductListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaProductListResponse create() {
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
    public GetMetaProductListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaProductListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaProductListResponseBody body);

        @Override
        GetMetaProductListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaProductListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaProductListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaProductListResponse response) {
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
        public Builder body(GetMetaProductListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaProductListResponse build() {
            return new GetMetaProductListResponse(this);
        } 

    } 

}
