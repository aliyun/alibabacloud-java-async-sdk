// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionHistoryResponse} extends {@link TeaModel}
 *
 * <p>ListInterceptionHistoryResponse</p>
 */
public class ListInterceptionHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterceptionHistoryResponseBody body;

    private ListInterceptionHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterceptionHistoryResponse create() {
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
    public ListInterceptionHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterceptionHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterceptionHistoryResponseBody body);

        @Override
        ListInterceptionHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterceptionHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterceptionHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterceptionHistoryResponse response) {
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
        public Builder body(ListInterceptionHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterceptionHistoryResponse build() {
            return new ListInterceptionHistoryResponse(this);
        } 

    } 

}
