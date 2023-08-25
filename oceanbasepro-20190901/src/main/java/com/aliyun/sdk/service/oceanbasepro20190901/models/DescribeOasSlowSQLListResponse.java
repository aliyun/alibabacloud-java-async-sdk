// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSlowSQLListResponse} extends {@link TeaModel}
 *
 * <p>DescribeOasSlowSQLListResponse</p>
 */
public class DescribeOasSlowSQLListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOasSlowSQLListResponseBody body;

    private DescribeOasSlowSQLListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOasSlowSQLListResponse create() {
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
    public DescribeOasSlowSQLListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOasSlowSQLListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOasSlowSQLListResponseBody body);

        @Override
        DescribeOasSlowSQLListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOasSlowSQLListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOasSlowSQLListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOasSlowSQLListResponse response) {
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
        public Builder body(DescribeOasSlowSQLListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOasSlowSQLListResponse build() {
            return new DescribeOasSlowSQLListResponse(this);
        } 

    } 

}
