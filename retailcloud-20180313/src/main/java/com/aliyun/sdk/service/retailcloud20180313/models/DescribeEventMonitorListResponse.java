// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventMonitorListResponse} extends {@link TeaModel}
 *
 * <p>DescribeEventMonitorListResponse</p>
 */
public class DescribeEventMonitorListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEventMonitorListResponseBody body;

    private DescribeEventMonitorListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEventMonitorListResponse create() {
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
    public DescribeEventMonitorListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEventMonitorListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEventMonitorListResponseBody body);

        @Override
        DescribeEventMonitorListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEventMonitorListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEventMonitorListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEventMonitorListResponse response) {
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
        public Builder body(DescribeEventMonitorListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEventMonitorListResponse build() {
            return new DescribeEventMonitorListResponse(this);
        } 

    } 

}
