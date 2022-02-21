// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceIPArrayListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceIPArrayListResponse</p>
 */
public class DescribeDBInstanceIPArrayListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBInstanceIPArrayListResponseBody body;

    private DescribeDBInstanceIPArrayListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBInstanceIPArrayListResponse create() {
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
    public DescribeDBInstanceIPArrayListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBInstanceIPArrayListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBInstanceIPArrayListResponseBody body);

        @Override
        DescribeDBInstanceIPArrayListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBInstanceIPArrayListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBInstanceIPArrayListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBInstanceIPArrayListResponse response) {
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
        public Builder body(DescribeDBInstanceIPArrayListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBInstanceIPArrayListResponse build() {
            return new DescribeDBInstanceIPArrayListResponse(this);
        } 

    } 

}
