// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPartnerIntentionListResponse} extends {@link TeaModel}
 *
 * <p>QueryPartnerIntentionListResponse</p>
 */
public class QueryPartnerIntentionListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPartnerIntentionListResponseBody body;

    private QueryPartnerIntentionListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPartnerIntentionListResponse create() {
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
    public QueryPartnerIntentionListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPartnerIntentionListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPartnerIntentionListResponseBody body);

        @Override
        QueryPartnerIntentionListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPartnerIntentionListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPartnerIntentionListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPartnerIntentionListResponse response) {
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
        public Builder body(QueryPartnerIntentionListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPartnerIntentionListResponse build() {
            return new QueryPartnerIntentionListResponse(this);
        } 

    } 

}
