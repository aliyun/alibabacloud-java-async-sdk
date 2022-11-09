// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorItemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitorItemsResponse</p>
 */
public class DescribeMonitorItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitorItemsResponseBody body;

    private DescribeMonitorItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitorItemsResponse create() {
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
    public DescribeMonitorItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitorItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitorItemsResponseBody body);

        @Override
        DescribeMonitorItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitorItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitorItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitorItemsResponse response) {
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
        public Builder body(DescribeMonitorItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitorItemsResponse build() {
            return new DescribeMonitorItemsResponse(this);
        } 

    } 

}
