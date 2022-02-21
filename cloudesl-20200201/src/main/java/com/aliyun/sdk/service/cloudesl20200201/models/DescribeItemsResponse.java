// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeItemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeItemsResponse</p>
 */
public class DescribeItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeItemsResponseBody body;

    private DescribeItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeItemsResponse create() {
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
    public DescribeItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeItemsResponseBody body);

        @Override
        DescribeItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeItemsResponse response) {
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
        public Builder body(DescribeItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeItemsResponse build() {
            return new DescribeItemsResponse(this);
        } 

    } 

}
