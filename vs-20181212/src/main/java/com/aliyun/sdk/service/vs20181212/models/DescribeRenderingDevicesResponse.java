// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRenderingDevicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRenderingDevicesResponse</p>
 */
public class DescribeRenderingDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRenderingDevicesResponseBody body;

    private DescribeRenderingDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRenderingDevicesResponse create() {
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
    public DescribeRenderingDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRenderingDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRenderingDevicesResponseBody body);

        @Override
        DescribeRenderingDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRenderingDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRenderingDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRenderingDevicesResponse response) {
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
        public Builder body(DescribeRenderingDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRenderingDevicesResponse build() {
            return new DescribeRenderingDevicesResponse(this);
        } 

    } 

}
