// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApsActionLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeApsActionLogsResponse</p>
 */
public class DescribeApsActionLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApsActionLogsResponseBody body;

    private DescribeApsActionLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApsActionLogsResponse create() {
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
    public DescribeApsActionLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApsActionLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApsActionLogsResponseBody body);

        @Override
        DescribeApsActionLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApsActionLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApsActionLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApsActionLogsResponse response) {
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
        public Builder body(DescribeApsActionLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApsActionLogsResponse build() {
            return new DescribeApsActionLogsResponse(this);
        } 

    } 

}
