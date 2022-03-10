// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentViewReportsResponse} extends {@link TeaModel}
 *
 * <p>ListRecentViewReportsResponse</p>
 */
public class ListRecentViewReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecentViewReportsResponseBody body;

    private ListRecentViewReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecentViewReportsResponse create() {
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
    public ListRecentViewReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecentViewReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecentViewReportsResponseBody body);

        @Override
        ListRecentViewReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecentViewReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecentViewReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecentViewReportsResponse response) {
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
        public Builder body(ListRecentViewReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecentViewReportsResponse build() {
            return new ListRecentViewReportsResponse(this);
        } 

    } 

}
