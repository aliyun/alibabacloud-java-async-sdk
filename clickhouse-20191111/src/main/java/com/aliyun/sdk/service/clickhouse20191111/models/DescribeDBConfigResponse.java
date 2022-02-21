// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBConfigResponse</p>
 */
public class DescribeDBConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBConfigResponseBody body;

    private DescribeDBConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBConfigResponse create() {
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
    public DescribeDBConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBConfigResponseBody body);

        @Override
        DescribeDBConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBConfigResponse response) {
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
        public Builder body(DescribeDBConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBConfigResponse build() {
            return new DescribeDBConfigResponse(this);
        } 

    } 

}
