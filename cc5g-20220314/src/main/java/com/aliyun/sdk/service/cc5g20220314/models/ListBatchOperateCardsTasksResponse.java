// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBatchOperateCardsTasksResponse} extends {@link TeaModel}
 *
 * <p>ListBatchOperateCardsTasksResponse</p>
 */
public class ListBatchOperateCardsTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBatchOperateCardsTasksResponseBody body;

    private ListBatchOperateCardsTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBatchOperateCardsTasksResponse create() {
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
    public ListBatchOperateCardsTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBatchOperateCardsTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBatchOperateCardsTasksResponseBody body);

        @Override
        ListBatchOperateCardsTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBatchOperateCardsTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBatchOperateCardsTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBatchOperateCardsTasksResponse response) {
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
        public Builder body(ListBatchOperateCardsTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBatchOperateCardsTasksResponse build() {
            return new ListBatchOperateCardsTasksResponse(this);
        } 

    } 

}
