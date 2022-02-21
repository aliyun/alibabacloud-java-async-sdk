// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCatalogListResponse} extends {@link TeaModel}
 *
 * <p>GetCatalogListResponse</p>
 */
public class GetCatalogListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCatalogListResponseBody body;

    private GetCatalogListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCatalogListResponse create() {
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
    public GetCatalogListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCatalogListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCatalogListResponseBody body);

        @Override
        GetCatalogListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCatalogListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCatalogListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCatalogListResponse response) {
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
        public Builder body(GetCatalogListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCatalogListResponse build() {
            return new GetCatalogListResponse(this);
        } 

    } 

}
