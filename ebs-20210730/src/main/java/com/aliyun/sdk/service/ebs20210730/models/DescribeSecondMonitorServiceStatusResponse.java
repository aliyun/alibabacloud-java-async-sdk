// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecondMonitorServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecondMonitorServiceStatusResponse</p>
 */
public class DescribeSecondMonitorServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecondMonitorServiceStatusResponseBody body;

    private DescribeSecondMonitorServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecondMonitorServiceStatusResponse create() {
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
    public DescribeSecondMonitorServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecondMonitorServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecondMonitorServiceStatusResponseBody body);

        @Override
        DescribeSecondMonitorServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecondMonitorServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecondMonitorServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecondMonitorServiceStatusResponse response) {
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
        public Builder body(DescribeSecondMonitorServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecondMonitorServiceStatusResponse build() {
            return new DescribeSecondMonitorServiceStatusResponse(this);
        } 

    } 

}
