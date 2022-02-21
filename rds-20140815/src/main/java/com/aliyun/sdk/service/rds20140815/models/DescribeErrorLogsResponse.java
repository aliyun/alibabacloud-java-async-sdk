// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeErrorLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeErrorLogsResponse</p>
 */
public class DescribeErrorLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeErrorLogsResponseBody body;

    private DescribeErrorLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeErrorLogsResponse create() {
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
    public DescribeErrorLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeErrorLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeErrorLogsResponseBody body);

        @Override
        DescribeErrorLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeErrorLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeErrorLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeErrorLogsResponse response) {
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
        public Builder body(DescribeErrorLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeErrorLogsResponse build() {
            return new DescribeErrorLogsResponse(this);
        } 

    } 

}
