// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDeviceResponse} extends {@link TeaModel}
 *
 * <p>DescribeEslDeviceResponse</p>
 */
public class DescribeEslDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEslDeviceResponseBody body;

    private DescribeEslDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEslDeviceResponse create() {
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
    public DescribeEslDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEslDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEslDeviceResponseBody body);

        @Override
        DescribeEslDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEslDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEslDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEslDeviceResponse response) {
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
        public Builder body(DescribeEslDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEslDeviceResponse build() {
            return new DescribeEslDeviceResponse(this);
        } 

    } 

}
