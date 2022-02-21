// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainQRCodeAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>DescribeAntChainQRCodeAuthorizationResponse</p>
 */
public class DescribeAntChainQRCodeAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainQRCodeAuthorizationResponseBody body;

    private DescribeAntChainQRCodeAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainQRCodeAuthorizationResponse create() {
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
    public DescribeAntChainQRCodeAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainQRCodeAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainQRCodeAuthorizationResponseBody body);

        @Override
        DescribeAntChainQRCodeAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainQRCodeAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainQRCodeAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainQRCodeAuthorizationResponse response) {
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
        public Builder body(DescribeAntChainQRCodeAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainQRCodeAuthorizationResponse build() {
            return new DescribeAntChainQRCodeAuthorizationResponse(this);
        } 

    } 

}
