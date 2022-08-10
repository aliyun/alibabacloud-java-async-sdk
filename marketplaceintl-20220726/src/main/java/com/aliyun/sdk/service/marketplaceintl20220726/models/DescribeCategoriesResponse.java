// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCategoriesResponse</p>
 */
public class DescribeCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCategoriesResponseBody body;

    private DescribeCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCategoriesResponse create() {
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
    public DescribeCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCategoriesResponseBody body);

        @Override
        DescribeCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCategoriesResponse response) {
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
        public Builder body(DescribeCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCategoriesResponse build() {
            return new DescribeCategoriesResponse(this);
        } 

    } 

}
