// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostImageCategoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostImageCategoriesResponse</p>
 */
public class DescribeDedicatedHostImageCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDedicatedHostImageCategoriesResponseBody body;

    private DescribeDedicatedHostImageCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDedicatedHostImageCategoriesResponse create() {
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
    public DescribeDedicatedHostImageCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDedicatedHostImageCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDedicatedHostImageCategoriesResponseBody body);

        @Override
        DescribeDedicatedHostImageCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDedicatedHostImageCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDedicatedHostImageCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDedicatedHostImageCategoriesResponse response) {
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
        public Builder body(DescribeDedicatedHostImageCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDedicatedHostImageCategoriesResponse build() {
            return new DescribeDedicatedHostImageCategoriesResponse(this);
        } 

    } 

}
