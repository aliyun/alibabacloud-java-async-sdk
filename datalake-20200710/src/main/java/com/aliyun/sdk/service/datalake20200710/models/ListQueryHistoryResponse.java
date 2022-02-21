// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryHistoryResponse} extends {@link TeaModel}
 *
 * <p>ListQueryHistoryResponse</p>
 */
public class ListQueryHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueryHistoryResponseBody body;

    private ListQueryHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueryHistoryResponse create() {
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
    public ListQueryHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueryHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueryHistoryResponseBody body);

        @Override
        ListQueryHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueryHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueryHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueryHistoryResponse response) {
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
        public Builder body(ListQueryHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueryHistoryResponse build() {
            return new ListQueryHistoryResponse(this);
        } 

    } 

}
