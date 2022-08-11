// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableListByCategoryResponse} extends {@link TeaModel}
 *
 * <p>GetMetaTableListByCategoryResponse</p>
 */
public class GetMetaTableListByCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaTableListByCategoryResponseBody body;

    private GetMetaTableListByCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaTableListByCategoryResponse create() {
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
    public GetMetaTableListByCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaTableListByCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaTableListByCategoryResponseBody body);

        @Override
        GetMetaTableListByCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaTableListByCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaTableListByCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaTableListByCategoryResponse response) {
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
        public Builder body(GetMetaTableListByCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaTableListByCategoryResponse build() {
            return new GetMetaTableListByCategoryResponse(this);
        } 

    } 

}
