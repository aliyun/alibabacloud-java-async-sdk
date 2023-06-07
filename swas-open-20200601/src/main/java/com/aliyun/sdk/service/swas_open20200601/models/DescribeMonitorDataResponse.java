// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitorDataResponse</p>
 */
public class DescribeMonitorDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitorDataResponseBody body;

    private DescribeMonitorDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitorDataResponse create() {
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
    public DescribeMonitorDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitorDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitorDataResponseBody body);

        @Override
        DescribeMonitorDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitorDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitorDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitorDataResponse response) {
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
        public Builder body(DescribeMonitorDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitorDataResponse build() {
            return new DescribeMonitorDataResponse(this);
        } 

    } 

}
