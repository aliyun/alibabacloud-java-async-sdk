// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowSQLLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlowSQLLogsResponse</p>
 */
public class DescribeSlowSQLLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlowSQLLogsResponseBody body;

    private DescribeSlowSQLLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlowSQLLogsResponse create() {
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
    public DescribeSlowSQLLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlowSQLLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlowSQLLogsResponseBody body);

        @Override
        DescribeSlowSQLLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlowSQLLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlowSQLLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlowSQLLogsResponse response) {
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
        public Builder body(DescribeSlowSQLLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlowSQLLogsResponse build() {
            return new DescribeSlowSQLLogsResponse(this);
        } 

    } 

}
