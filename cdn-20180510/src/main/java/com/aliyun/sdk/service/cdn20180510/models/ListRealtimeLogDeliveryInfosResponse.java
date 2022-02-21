// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealtimeLogDeliveryInfosResponse} extends {@link TeaModel}
 *
 * <p>ListRealtimeLogDeliveryInfosResponse</p>
 */
public class ListRealtimeLogDeliveryInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRealtimeLogDeliveryInfosResponseBody body;

    private ListRealtimeLogDeliveryInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRealtimeLogDeliveryInfosResponse create() {
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
    public ListRealtimeLogDeliveryInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRealtimeLogDeliveryInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRealtimeLogDeliveryInfosResponseBody body);

        @Override
        ListRealtimeLogDeliveryInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRealtimeLogDeliveryInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRealtimeLogDeliveryInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRealtimeLogDeliveryInfosResponse response) {
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
        public Builder body(ListRealtimeLogDeliveryInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRealtimeLogDeliveryInfosResponse build() {
            return new ListRealtimeLogDeliveryInfosResponse(this);
        } 

    } 

}
