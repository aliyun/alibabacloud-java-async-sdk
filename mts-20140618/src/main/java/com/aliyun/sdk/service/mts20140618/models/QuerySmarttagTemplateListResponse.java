// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmarttagTemplateListResponse} extends {@link TeaModel}
 *
 * <p>QuerySmarttagTemplateListResponse</p>
 */
public class QuerySmarttagTemplateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySmarttagTemplateListResponseBody body;

    private QuerySmarttagTemplateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySmarttagTemplateListResponse create() {
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
    public QuerySmarttagTemplateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySmarttagTemplateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySmarttagTemplateListResponseBody body);

        @Override
        QuerySmarttagTemplateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySmarttagTemplateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySmarttagTemplateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySmarttagTemplateListResponse response) {
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
        public Builder body(QuerySmarttagTemplateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySmarttagTemplateListResponse build() {
            return new QuerySmarttagTemplateListResponse(this);
        } 

    } 

}
