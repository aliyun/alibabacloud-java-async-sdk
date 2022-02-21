// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryHistoryJobsResponse} extends {@link TeaModel}
 *
 * <p>ListDeliveryHistoryJobsResponse</p>
 */
public class ListDeliveryHistoryJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeliveryHistoryJobsResponseBody body;

    private ListDeliveryHistoryJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeliveryHistoryJobsResponse create() {
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
    public ListDeliveryHistoryJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeliveryHistoryJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeliveryHistoryJobsResponseBody body);

        @Override
        ListDeliveryHistoryJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeliveryHistoryJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeliveryHistoryJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeliveryHistoryJobsResponse response) {
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
        public Builder body(ListDeliveryHistoryJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeliveryHistoryJobsResponse build() {
            return new ListDeliveryHistoryJobsResponse(this);
        } 

    } 

}
