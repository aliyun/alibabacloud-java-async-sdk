// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmMonitorAvailableConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmMonitorAvailableConfigResponse</p>
 */
public class DescribeGtmMonitorAvailableConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmMonitorAvailableConfigResponseBody body;

    private DescribeGtmMonitorAvailableConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmMonitorAvailableConfigResponse create() {
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
    public DescribeGtmMonitorAvailableConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmMonitorAvailableConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmMonitorAvailableConfigResponseBody body);

        @Override
        DescribeGtmMonitorAvailableConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmMonitorAvailableConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmMonitorAvailableConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmMonitorAvailableConfigResponse response) {
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
        public Builder body(DescribeGtmMonitorAvailableConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmMonitorAvailableConfigResponse build() {
            return new DescribeGtmMonitorAvailableConfigResponse(this);
        } 

    } 

}
