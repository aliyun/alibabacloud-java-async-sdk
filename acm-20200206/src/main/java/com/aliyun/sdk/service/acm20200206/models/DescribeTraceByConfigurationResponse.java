// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceByConfigurationResponse} extends {@link TeaModel}
 *
 * <p>DescribeTraceByConfigurationResponse</p>
 */
public class DescribeTraceByConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTraceByConfigurationResponseBody body;

    private DescribeTraceByConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTraceByConfigurationResponse create() {
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
    public DescribeTraceByConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTraceByConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTraceByConfigurationResponseBody body);

        @Override
        DescribeTraceByConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTraceByConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTraceByConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTraceByConfigurationResponse response) {
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
        public Builder body(DescribeTraceByConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTraceByConfigurationResponse build() {
            return new DescribeTraceByConfigurationResponse(this);
        } 

    } 

}
