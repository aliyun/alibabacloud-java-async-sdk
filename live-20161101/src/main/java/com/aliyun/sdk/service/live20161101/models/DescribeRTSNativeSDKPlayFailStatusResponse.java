// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKPlayFailStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKPlayFailStatusResponse</p>
 */
public class DescribeRTSNativeSDKPlayFailStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRTSNativeSDKPlayFailStatusResponseBody body;

    private DescribeRTSNativeSDKPlayFailStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRTSNativeSDKPlayFailStatusResponse create() {
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
    public DescribeRTSNativeSDKPlayFailStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRTSNativeSDKPlayFailStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRTSNativeSDKPlayFailStatusResponseBody body);

        @Override
        DescribeRTSNativeSDKPlayFailStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRTSNativeSDKPlayFailStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRTSNativeSDKPlayFailStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRTSNativeSDKPlayFailStatusResponse response) {
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
        public Builder body(DescribeRTSNativeSDKPlayFailStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRTSNativeSDKPlayFailStatusResponse build() {
            return new DescribeRTSNativeSDKPlayFailStatusResponse(this);
        } 

    } 

}
