// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWaterMarkTemplateListResponse} extends {@link TeaModel}
 *
 * <p>QueryWaterMarkTemplateListResponse</p>
 */
public class QueryWaterMarkTemplateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryWaterMarkTemplateListResponseBody body;

    private QueryWaterMarkTemplateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryWaterMarkTemplateListResponse create() {
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
    public QueryWaterMarkTemplateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWaterMarkTemplateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryWaterMarkTemplateListResponseBody body);

        @Override
        QueryWaterMarkTemplateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWaterMarkTemplateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryWaterMarkTemplateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWaterMarkTemplateListResponse response) {
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
        public Builder body(QueryWaterMarkTemplateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWaterMarkTemplateListResponse build() {
            return new QueryWaterMarkTemplateListResponse(this);
        } 

    } 

}
