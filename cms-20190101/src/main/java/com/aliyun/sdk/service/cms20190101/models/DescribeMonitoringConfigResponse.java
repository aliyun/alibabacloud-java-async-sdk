// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringConfigResponse</p>
 */
public class DescribeMonitoringConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitoringConfigResponseBody body;

    private DescribeMonitoringConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitoringConfigResponse create() {
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
    public DescribeMonitoringConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitoringConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitoringConfigResponseBody body);

        @Override
        DescribeMonitoringConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitoringConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitoringConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitoringConfigResponse response) {
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
        public Builder body(DescribeMonitoringConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitoringConfigResponse build() {
            return new DescribeMonitoringConfigResponse(this);
        } 

    } 

}
