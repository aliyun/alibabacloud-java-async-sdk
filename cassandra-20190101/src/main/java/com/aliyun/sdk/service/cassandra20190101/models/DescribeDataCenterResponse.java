// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCenterResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataCenterResponse</p>
 */
public class DescribeDataCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataCenterResponseBody body;

    private DescribeDataCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataCenterResponse create() {
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
    public DescribeDataCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataCenterResponseBody body);

        @Override
        DescribeDataCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataCenterResponse response) {
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
        public Builder body(DescribeDataCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataCenterResponse build() {
            return new DescribeDataCenterResponse(this);
        } 

    } 

}
