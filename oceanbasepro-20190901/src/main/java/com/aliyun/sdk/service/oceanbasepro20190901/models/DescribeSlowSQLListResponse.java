// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowSQLListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlowSQLListResponse</p>
 */
public class DescribeSlowSQLListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlowSQLListResponseBody body;

    private DescribeSlowSQLListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlowSQLListResponse create() {
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
    public DescribeSlowSQLListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlowSQLListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlowSQLListResponseBody body);

        @Override
        DescribeSlowSQLListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlowSQLListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlowSQLListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlowSQLListResponse response) {
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
        public Builder body(DescribeSlowSQLListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlowSQLListResponse build() {
            return new DescribeSlowSQLListResponse(this);
        } 

    } 

}
