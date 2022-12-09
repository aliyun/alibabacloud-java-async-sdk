// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantTagsResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantTagsResponse</p>
 */
public class DescribeTenantTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantTagsResponseBody body;

    private DescribeTenantTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantTagsResponse create() {
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
    public DescribeTenantTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantTagsResponseBody body);

        @Override
        DescribeTenantTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantTagsResponse response) {
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
        public Builder body(DescribeTenantTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantTagsResponse build() {
            return new DescribeTenantTagsResponse(this);
        } 

    } 

}
