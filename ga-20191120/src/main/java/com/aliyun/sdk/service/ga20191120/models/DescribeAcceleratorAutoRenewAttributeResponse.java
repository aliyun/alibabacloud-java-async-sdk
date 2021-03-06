// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAcceleratorAutoRenewAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeAcceleratorAutoRenewAttributeResponse</p>
 */
public class DescribeAcceleratorAutoRenewAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAcceleratorAutoRenewAttributeResponseBody body;

    private DescribeAcceleratorAutoRenewAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAcceleratorAutoRenewAttributeResponse create() {
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
    public DescribeAcceleratorAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAcceleratorAutoRenewAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAcceleratorAutoRenewAttributeResponseBody body);

        @Override
        DescribeAcceleratorAutoRenewAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAcceleratorAutoRenewAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAcceleratorAutoRenewAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAcceleratorAutoRenewAttributeResponse response) {
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
        public Builder body(DescribeAcceleratorAutoRenewAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAcceleratorAutoRenewAttributeResponse build() {
            return new DescribeAcceleratorAutoRenewAttributeResponse(this);
        } 

    } 

}
