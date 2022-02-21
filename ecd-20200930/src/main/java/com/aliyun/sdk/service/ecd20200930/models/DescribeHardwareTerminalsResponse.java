// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHardwareTerminalsResponse} extends {@link TeaModel}
 *
 * <p>DescribeHardwareTerminalsResponse</p>
 */
public class DescribeHardwareTerminalsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHardwareTerminalsResponseBody body;

    private DescribeHardwareTerminalsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHardwareTerminalsResponse create() {
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
    public DescribeHardwareTerminalsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHardwareTerminalsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHardwareTerminalsResponseBody body);

        @Override
        DescribeHardwareTerminalsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHardwareTerminalsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHardwareTerminalsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHardwareTerminalsResponse response) {
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
        public Builder body(DescribeHardwareTerminalsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHardwareTerminalsResponse build() {
            return new DescribeHardwareTerminalsResponse(this);
        } 

    } 

}
