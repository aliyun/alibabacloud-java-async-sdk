// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationRecorderResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigurationRecorderResponse</p>
 */
public class DescribeConfigurationRecorderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigurationRecorderResponseBody body;

    private DescribeConfigurationRecorderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigurationRecorderResponse create() {
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
    public DescribeConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigurationRecorderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigurationRecorderResponseBody body);

        @Override
        DescribeConfigurationRecorderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigurationRecorderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigurationRecorderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigurationRecorderResponse response) {
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
        public Builder body(DescribeConfigurationRecorderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigurationRecorderResponse build() {
            return new DescribeConfigurationRecorderResponse(this);
        } 

    } 

}
