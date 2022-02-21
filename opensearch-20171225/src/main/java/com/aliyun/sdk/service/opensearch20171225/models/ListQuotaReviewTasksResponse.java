// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaReviewTasksResponse} extends {@link TeaModel}
 *
 * <p>ListQuotaReviewTasksResponse</p>
 */
public class ListQuotaReviewTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQuotaReviewTasksResponseBody body;

    private ListQuotaReviewTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQuotaReviewTasksResponse create() {
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
    public ListQuotaReviewTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQuotaReviewTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQuotaReviewTasksResponseBody body);

        @Override
        ListQuotaReviewTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQuotaReviewTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQuotaReviewTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQuotaReviewTasksResponse response) {
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
        public Builder body(ListQuotaReviewTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQuotaReviewTasksResponse build() {
            return new ListQuotaReviewTasksResponse(this);
        } 

    } 

}
