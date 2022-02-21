// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupConfigurationResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupConfigurationResponse</p>
 */
public class DescribeSecurityGroupConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecurityGroupConfigurationResponseBody body;

    private DescribeSecurityGroupConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecurityGroupConfigurationResponse create() {
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
    public DescribeSecurityGroupConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecurityGroupConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecurityGroupConfigurationResponseBody body);

        @Override
        DescribeSecurityGroupConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecurityGroupConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecurityGroupConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecurityGroupConfigurationResponse response) {
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
        public Builder body(DescribeSecurityGroupConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecurityGroupConfigurationResponse build() {
            return new DescribeSecurityGroupConfigurationResponse(this);
        } 

    } 

}
