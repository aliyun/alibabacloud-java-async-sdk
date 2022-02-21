// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstanceCategoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceCategoriesResponse</p>
 */
public class DescribeReservedInstanceCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReservedInstanceCategoriesResponseBody body;

    private DescribeReservedInstanceCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReservedInstanceCategoriesResponse create() {
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
    public DescribeReservedInstanceCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReservedInstanceCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReservedInstanceCategoriesResponseBody body);

        @Override
        DescribeReservedInstanceCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReservedInstanceCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReservedInstanceCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReservedInstanceCategoriesResponse response) {
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
        public Builder body(DescribeReservedInstanceCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReservedInstanceCategoriesResponse build() {
            return new DescribeReservedInstanceCategoriesResponse(this);
        } 

    } 

}
