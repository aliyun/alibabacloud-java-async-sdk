// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRealtimeDeliveryAccResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveRealtimeDeliveryAccResponse</p>
 */
public class DescribeLiveRealtimeDeliveryAccResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveRealtimeDeliveryAccResponseBody body;

    private DescribeLiveRealtimeDeliveryAccResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveRealtimeDeliveryAccResponse create() {
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
    public DescribeLiveRealtimeDeliveryAccResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveRealtimeDeliveryAccResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveRealtimeDeliveryAccResponseBody body);

        @Override
        DescribeLiveRealtimeDeliveryAccResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveRealtimeDeliveryAccResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveRealtimeDeliveryAccResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveRealtimeDeliveryAccResponse response) {
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
        public Builder body(DescribeLiveRealtimeDeliveryAccResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveRealtimeDeliveryAccResponse build() {
            return new DescribeLiveRealtimeDeliveryAccResponse(this);
        } 

    } 

}
