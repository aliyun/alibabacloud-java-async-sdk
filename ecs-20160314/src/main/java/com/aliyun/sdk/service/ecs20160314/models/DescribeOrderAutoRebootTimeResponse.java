// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrderAutoRebootTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeOrderAutoRebootTimeResponse</p>
 */
public class DescribeOrderAutoRebootTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOrderAutoRebootTimeResponseBody body;

    private DescribeOrderAutoRebootTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOrderAutoRebootTimeResponse create() {
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
    public DescribeOrderAutoRebootTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOrderAutoRebootTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOrderAutoRebootTimeResponseBody body);

        @Override
        DescribeOrderAutoRebootTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOrderAutoRebootTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOrderAutoRebootTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOrderAutoRebootTimeResponse response) {
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
        public Builder body(DescribeOrderAutoRebootTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOrderAutoRebootTimeResponse build() {
            return new DescribeOrderAutoRebootTimeResponse(this);
        } 

    } 

}
