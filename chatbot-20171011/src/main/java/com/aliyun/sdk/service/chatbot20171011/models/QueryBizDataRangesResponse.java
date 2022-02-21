// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBizDataRangesResponse} extends {@link TeaModel}
 *
 * <p>QueryBizDataRangesResponse</p>
 */
public class QueryBizDataRangesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBizDataRangesResponseBody body;

    private QueryBizDataRangesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBizDataRangesResponse create() {
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
    public QueryBizDataRangesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBizDataRangesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBizDataRangesResponseBody body);

        @Override
        QueryBizDataRangesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBizDataRangesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBizDataRangesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBizDataRangesResponse response) {
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
        public Builder body(QueryBizDataRangesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBizDataRangesResponse build() {
            return new QueryBizDataRangesResponse(this);
        } 

    } 

}
