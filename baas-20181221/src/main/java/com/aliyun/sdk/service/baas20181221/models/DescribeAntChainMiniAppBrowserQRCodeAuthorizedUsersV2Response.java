// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response</p>
 */
public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody body;

    private DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response create() {
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
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody body);

        @Override
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response response) {
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
        public Builder body(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response build() {
            return new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response(this);
        } 

    } 

}
