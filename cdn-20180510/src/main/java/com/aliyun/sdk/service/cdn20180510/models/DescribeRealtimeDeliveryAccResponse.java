// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRealtimeDeliveryAccResponse} extends {@link TeaModel}
 *
 * <p>DescribeRealtimeDeliveryAccResponse</p>
 */
public class DescribeRealtimeDeliveryAccResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRealtimeDeliveryAccResponseBody body;

    private DescribeRealtimeDeliveryAccResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRealtimeDeliveryAccResponse create() {
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
    public DescribeRealtimeDeliveryAccResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRealtimeDeliveryAccResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRealtimeDeliveryAccResponseBody body);

        @Override
        DescribeRealtimeDeliveryAccResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRealtimeDeliveryAccResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRealtimeDeliveryAccResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRealtimeDeliveryAccResponse response) {
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
        public Builder body(DescribeRealtimeDeliveryAccResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRealtimeDeliveryAccResponse build() {
            return new DescribeRealtimeDeliveryAccResponse(this);
        } 

    } 

}
