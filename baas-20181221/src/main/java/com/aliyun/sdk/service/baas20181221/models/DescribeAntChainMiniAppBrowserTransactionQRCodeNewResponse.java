// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse</p>
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body;

    private DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse create() {
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
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body);

        @Override
        DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse response) {
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
        public Builder body(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse build() {
            return new DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse(this);
        } 

    } 

}
