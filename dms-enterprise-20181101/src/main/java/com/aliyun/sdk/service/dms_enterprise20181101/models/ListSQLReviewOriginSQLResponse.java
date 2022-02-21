// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSQLReviewOriginSQLResponse} extends {@link TeaModel}
 *
 * <p>ListSQLReviewOriginSQLResponse</p>
 */
public class ListSQLReviewOriginSQLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSQLReviewOriginSQLResponseBody body;

    private ListSQLReviewOriginSQLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSQLReviewOriginSQLResponse create() {
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
    public ListSQLReviewOriginSQLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSQLReviewOriginSQLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSQLReviewOriginSQLResponseBody body);

        @Override
        ListSQLReviewOriginSQLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSQLReviewOriginSQLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSQLReviewOriginSQLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSQLReviewOriginSQLResponse response) {
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
        public Builder body(ListSQLReviewOriginSQLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSQLReviewOriginSQLResponse build() {
            return new ListSQLReviewOriginSQLResponse(this);
        } 

    } 

}
