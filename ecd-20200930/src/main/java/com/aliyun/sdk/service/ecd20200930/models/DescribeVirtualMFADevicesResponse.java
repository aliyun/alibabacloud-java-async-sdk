// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualMFADevicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeVirtualMFADevicesResponse</p>
 */
public class DescribeVirtualMFADevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVirtualMFADevicesResponseBody body;

    private DescribeVirtualMFADevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVirtualMFADevicesResponse create() {
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
    public DescribeVirtualMFADevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVirtualMFADevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVirtualMFADevicesResponseBody body);

        @Override
        DescribeVirtualMFADevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVirtualMFADevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVirtualMFADevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVirtualMFADevicesResponse response) {
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
        public Builder body(DescribeVirtualMFADevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVirtualMFADevicesResponse build() {
            return new DescribeVirtualMFADevicesResponse(this);
        } 

    } 

}
