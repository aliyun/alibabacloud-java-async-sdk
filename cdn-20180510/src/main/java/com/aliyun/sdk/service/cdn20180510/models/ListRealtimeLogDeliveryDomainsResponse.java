// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealtimeLogDeliveryDomainsResponse} extends {@link TeaModel}
 *
 * <p>ListRealtimeLogDeliveryDomainsResponse</p>
 */
public class ListRealtimeLogDeliveryDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRealtimeLogDeliveryDomainsResponseBody body;

    private ListRealtimeLogDeliveryDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRealtimeLogDeliveryDomainsResponse create() {
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
    public ListRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRealtimeLogDeliveryDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRealtimeLogDeliveryDomainsResponseBody body);

        @Override
        ListRealtimeLogDeliveryDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRealtimeLogDeliveryDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRealtimeLogDeliveryDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRealtimeLogDeliveryDomainsResponse response) {
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
        public Builder body(ListRealtimeLogDeliveryDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRealtimeLogDeliveryDomainsResponse build() {
            return new ListRealtimeLogDeliveryDomainsResponse(this);
        } 

    } 

}
