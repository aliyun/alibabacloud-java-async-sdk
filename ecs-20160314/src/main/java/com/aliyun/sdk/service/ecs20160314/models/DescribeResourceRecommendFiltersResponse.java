// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceRecommendFiltersResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceRecommendFiltersResponse</p>
 */
public class DescribeResourceRecommendFiltersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceRecommendFiltersResponseBody body;

    private DescribeResourceRecommendFiltersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceRecommendFiltersResponse create() {
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
    public DescribeResourceRecommendFiltersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceRecommendFiltersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceRecommendFiltersResponseBody body);

        @Override
        DescribeResourceRecommendFiltersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceRecommendFiltersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceRecommendFiltersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceRecommendFiltersResponse response) {
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
        public Builder body(DescribeResourceRecommendFiltersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceRecommendFiltersResponse build() {
            return new DescribeResourceRecommendFiltersResponse(this);
        } 

    } 

}
