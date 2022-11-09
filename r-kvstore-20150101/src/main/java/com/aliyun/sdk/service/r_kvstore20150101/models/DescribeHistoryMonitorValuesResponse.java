// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryMonitorValuesResponse} extends {@link TeaModel}
 *
 * <p>DescribeHistoryMonitorValuesResponse</p>
 */
public class DescribeHistoryMonitorValuesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHistoryMonitorValuesResponseBody body;

    private DescribeHistoryMonitorValuesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHistoryMonitorValuesResponse create() {
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
    public DescribeHistoryMonitorValuesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHistoryMonitorValuesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHistoryMonitorValuesResponseBody body);

        @Override
        DescribeHistoryMonitorValuesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHistoryMonitorValuesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHistoryMonitorValuesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHistoryMonitorValuesResponse response) {
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
        public Builder body(DescribeHistoryMonitorValuesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHistoryMonitorValuesResponse build() {
            return new DescribeHistoryMonitorValuesResponse(this);
        } 

    } 

}
