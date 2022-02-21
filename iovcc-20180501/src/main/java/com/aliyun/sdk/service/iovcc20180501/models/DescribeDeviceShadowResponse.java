// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceShadowResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeviceShadowResponse</p>
 */
public class DescribeDeviceShadowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeviceShadowResponseBody body;

    private DescribeDeviceShadowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeviceShadowResponse create() {
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
    public DescribeDeviceShadowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeviceShadowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeviceShadowResponseBody body);

        @Override
        DescribeDeviceShadowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeviceShadowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeviceShadowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeviceShadowResponse response) {
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
        public Builder body(DescribeDeviceShadowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeviceShadowResponse build() {
            return new DescribeDeviceShadowResponse(this);
        } 

    } 

}
