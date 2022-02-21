// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRealtimeLogDeliveryDomainsResponse} extends {@link TeaModel}
 *
 * <p>ListLiveRealtimeLogDeliveryDomainsResponse</p>
 */
public class ListLiveRealtimeLogDeliveryDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLiveRealtimeLogDeliveryDomainsResponseBody body;

    private ListLiveRealtimeLogDeliveryDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLiveRealtimeLogDeliveryDomainsResponse create() {
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
    public ListLiveRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLiveRealtimeLogDeliveryDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLiveRealtimeLogDeliveryDomainsResponseBody body);

        @Override
        ListLiveRealtimeLogDeliveryDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLiveRealtimeLogDeliveryDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLiveRealtimeLogDeliveryDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLiveRealtimeLogDeliveryDomainsResponse response) {
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
        public Builder body(ListLiveRealtimeLogDeliveryDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLiveRealtimeLogDeliveryDomainsResponse build() {
            return new ListLiveRealtimeLogDeliveryDomainsResponse(this);
        } 

    } 

}
