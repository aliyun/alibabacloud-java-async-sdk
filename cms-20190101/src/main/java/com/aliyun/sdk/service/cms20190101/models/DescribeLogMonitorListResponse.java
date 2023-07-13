// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMonitorListResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogMonitorListResponse</p>
 */
public class DescribeLogMonitorListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogMonitorListResponseBody body;

    private DescribeLogMonitorListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogMonitorListResponse create() {
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
    public DescribeLogMonitorListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogMonitorListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogMonitorListResponseBody body);

        @Override
        DescribeLogMonitorListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogMonitorListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogMonitorListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogMonitorListResponse response) {
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
        public Builder body(DescribeLogMonitorListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogMonitorListResponse build() {
            return new DescribeLogMonitorListResponse(this);
        } 

    } 

}
