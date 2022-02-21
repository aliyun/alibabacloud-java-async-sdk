// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVodRealtimeLogDeliveryDomainsResponse} extends {@link TeaModel}
 *
 * <p>ListVodRealtimeLogDeliveryDomainsResponse</p>
 */
public class ListVodRealtimeLogDeliveryDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVodRealtimeLogDeliveryDomainsResponseBody body;

    private ListVodRealtimeLogDeliveryDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVodRealtimeLogDeliveryDomainsResponse create() {
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
    public ListVodRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVodRealtimeLogDeliveryDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVodRealtimeLogDeliveryDomainsResponseBody body);

        @Override
        ListVodRealtimeLogDeliveryDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVodRealtimeLogDeliveryDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVodRealtimeLogDeliveryDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVodRealtimeLogDeliveryDomainsResponse response) {
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
        public Builder body(ListVodRealtimeLogDeliveryDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVodRealtimeLogDeliveryDomainsResponse build() {
            return new ListVodRealtimeLogDeliveryDomainsResponse(this);
        } 

    } 

}
