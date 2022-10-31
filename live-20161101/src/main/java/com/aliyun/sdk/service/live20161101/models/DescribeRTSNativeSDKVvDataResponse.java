// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKVvDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKVvDataResponse</p>
 */
public class DescribeRTSNativeSDKVvDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRTSNativeSDKVvDataResponseBody body;

    private DescribeRTSNativeSDKVvDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRTSNativeSDKVvDataResponse create() {
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
    public DescribeRTSNativeSDKVvDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRTSNativeSDKVvDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRTSNativeSDKVvDataResponseBody body);

        @Override
        DescribeRTSNativeSDKVvDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRTSNativeSDKVvDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRTSNativeSDKVvDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRTSNativeSDKVvDataResponse response) {
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
        public Builder body(DescribeRTSNativeSDKVvDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRTSNativeSDKVvDataResponse build() {
            return new DescribeRTSNativeSDKVvDataResponse(this);
        } 

    } 

}
