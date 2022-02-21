// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTimeTemplateDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryTimeTemplateDetailResponse</p>
 */
public class QueryTimeTemplateDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTimeTemplateDetailResponseBody body;

    private QueryTimeTemplateDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTimeTemplateDetailResponse create() {
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
    public QueryTimeTemplateDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTimeTemplateDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTimeTemplateDetailResponseBody body);

        @Override
        QueryTimeTemplateDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTimeTemplateDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTimeTemplateDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTimeTemplateDetailResponse response) {
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
        public Builder body(QueryTimeTemplateDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTimeTemplateDetailResponse build() {
            return new QueryTimeTemplateDetailResponse(this);
        } 

    } 

}
