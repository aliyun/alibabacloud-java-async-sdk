// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotPersonTableItemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAiotPersonTableItemsResponse</p>
 */
public class DescribeAiotPersonTableItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAiotPersonTableItemsResponseBody body;

    private DescribeAiotPersonTableItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAiotPersonTableItemsResponse create() {
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
    public DescribeAiotPersonTableItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAiotPersonTableItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAiotPersonTableItemsResponseBody body);

        @Override
        DescribeAiotPersonTableItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAiotPersonTableItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAiotPersonTableItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAiotPersonTableItemsResponse response) {
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
        public Builder body(DescribeAiotPersonTableItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAiotPersonTableItemsResponse build() {
            return new DescribeAiotPersonTableItemsResponse(this);
        } 

    } 

}
