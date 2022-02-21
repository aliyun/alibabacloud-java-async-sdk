// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceIdByHardwareIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeviceIdByHardwareIdResponse</p>
 */
public class DescribeDeviceIdByHardwareIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeviceIdByHardwareIdResponseBody body;

    private DescribeDeviceIdByHardwareIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeviceIdByHardwareIdResponse create() {
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
    public DescribeDeviceIdByHardwareIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeviceIdByHardwareIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeviceIdByHardwareIdResponseBody body);

        @Override
        DescribeDeviceIdByHardwareIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeviceIdByHardwareIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeviceIdByHardwareIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeviceIdByHardwareIdResponse response) {
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
        public Builder body(DescribeDeviceIdByHardwareIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeviceIdByHardwareIdResponse build() {
            return new DescribeDeviceIdByHardwareIdResponse(this);
        } 

    } 

}
