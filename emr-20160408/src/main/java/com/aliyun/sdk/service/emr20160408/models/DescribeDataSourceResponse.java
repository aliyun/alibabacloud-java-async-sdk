// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceResponse</p>
 */
public class DescribeDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataSourceResponseBody body;

    private DescribeDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataSourceResponse create() {
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
    public DescribeDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataSourceResponseBody body);

        @Override
        DescribeDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataSourceResponse response) {
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
        public Builder body(DescribeDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataSourceResponse build() {
            return new DescribeDataSourceResponse(this);
        } 

    } 

}
