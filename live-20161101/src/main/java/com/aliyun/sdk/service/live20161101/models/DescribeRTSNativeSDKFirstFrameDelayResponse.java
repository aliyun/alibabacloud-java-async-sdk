// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKFirstFrameDelayResponse} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKFirstFrameDelayResponse</p>
 */
public class DescribeRTSNativeSDKFirstFrameDelayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRTSNativeSDKFirstFrameDelayResponseBody body;

    private DescribeRTSNativeSDKFirstFrameDelayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRTSNativeSDKFirstFrameDelayResponse create() {
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
    public DescribeRTSNativeSDKFirstFrameDelayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRTSNativeSDKFirstFrameDelayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRTSNativeSDKFirstFrameDelayResponseBody body);

        @Override
        DescribeRTSNativeSDKFirstFrameDelayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRTSNativeSDKFirstFrameDelayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRTSNativeSDKFirstFrameDelayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRTSNativeSDKFirstFrameDelayResponse response) {
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
        public Builder body(DescribeRTSNativeSDKFirstFrameDelayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRTSNativeSDKFirstFrameDelayResponse build() {
            return new DescribeRTSNativeSDKFirstFrameDelayResponse(this);
        } 

    } 

}
