// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVodRealtimeLogDeliveryInfosResponse} extends {@link TeaModel}
 *
 * <p>ListVodRealtimeLogDeliveryInfosResponse</p>
 */
public class ListVodRealtimeLogDeliveryInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVodRealtimeLogDeliveryInfosResponseBody body;

    private ListVodRealtimeLogDeliveryInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVodRealtimeLogDeliveryInfosResponse create() {
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
    public ListVodRealtimeLogDeliveryInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVodRealtimeLogDeliveryInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVodRealtimeLogDeliveryInfosResponseBody body);

        @Override
        ListVodRealtimeLogDeliveryInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVodRealtimeLogDeliveryInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVodRealtimeLogDeliveryInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVodRealtimeLogDeliveryInfosResponse response) {
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
        public Builder body(ListVodRealtimeLogDeliveryInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVodRealtimeLogDeliveryInfosResponse build() {
            return new ListVodRealtimeLogDeliveryInfosResponse(this);
        } 

    } 

}
