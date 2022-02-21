// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmMonitorConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmMonitorConfigResponse</p>
 */
public class DescribeGtmMonitorConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmMonitorConfigResponseBody body;

    private DescribeGtmMonitorConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmMonitorConfigResponse create() {
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
    public DescribeGtmMonitorConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmMonitorConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmMonitorConfigResponseBody body);

        @Override
        DescribeGtmMonitorConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmMonitorConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmMonitorConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmMonitorConfigResponse response) {
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
        public Builder body(DescribeGtmMonitorConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmMonitorConfigResponse build() {
            return new DescribeGtmMonitorConfigResponse(this);
        } 

    } 

}
