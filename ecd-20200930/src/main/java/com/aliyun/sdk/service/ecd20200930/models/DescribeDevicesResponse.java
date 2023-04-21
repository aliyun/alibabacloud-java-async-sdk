// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDevicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDevicesResponse</p>
 */
public class DescribeDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDevicesResponseBody body;

    private DescribeDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDevicesResponse create() {
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
    public DescribeDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDevicesResponseBody body);

        @Override
        DescribeDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDevicesResponse response) {
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
        public Builder body(DescribeDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDevicesResponse build() {
            return new DescribeDevicesResponse(this);
        } 

    } 

}
