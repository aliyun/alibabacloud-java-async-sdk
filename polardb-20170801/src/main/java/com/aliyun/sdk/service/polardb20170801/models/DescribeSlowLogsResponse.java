// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogsResponse</p>
 */
public class DescribeSlowLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlowLogsResponseBody body;

    private DescribeSlowLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlowLogsResponse create() {
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
    public DescribeSlowLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlowLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlowLogsResponseBody body);

        @Override
        DescribeSlowLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlowLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlowLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlowLogsResponse response) {
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
        public Builder body(DescribeSlowLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlowLogsResponse build() {
            return new DescribeSlowLogsResponse(this);
        } 

    } 

}
