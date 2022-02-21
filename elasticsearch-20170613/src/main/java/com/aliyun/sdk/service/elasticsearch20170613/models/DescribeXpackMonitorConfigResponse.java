// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeXpackMonitorConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeXpackMonitorConfigResponse</p>
 */
public class DescribeXpackMonitorConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeXpackMonitorConfigResponseBody body;

    private DescribeXpackMonitorConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeXpackMonitorConfigResponse create() {
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
    public DescribeXpackMonitorConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeXpackMonitorConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeXpackMonitorConfigResponseBody body);

        @Override
        DescribeXpackMonitorConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeXpackMonitorConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeXpackMonitorConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeXpackMonitorConfigResponse response) {
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
        public Builder body(DescribeXpackMonitorConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeXpackMonitorConfigResponse build() {
            return new DescribeXpackMonitorConfigResponse(this);
        } 

    } 

}
