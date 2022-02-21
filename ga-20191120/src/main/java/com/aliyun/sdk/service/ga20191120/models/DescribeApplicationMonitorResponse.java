// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationMonitorResponse} extends {@link TeaModel}
 *
 * <p>DescribeApplicationMonitorResponse</p>
 */
public class DescribeApplicationMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApplicationMonitorResponseBody body;

    private DescribeApplicationMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApplicationMonitorResponse create() {
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
    public DescribeApplicationMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApplicationMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApplicationMonitorResponseBody body);

        @Override
        DescribeApplicationMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApplicationMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApplicationMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApplicationMonitorResponse response) {
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
        public Builder body(DescribeApplicationMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApplicationMonitorResponse build() {
            return new DescribeApplicationMonitorResponse(this);
        } 

    } 

}
