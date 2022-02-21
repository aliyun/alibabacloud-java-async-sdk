// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStandardAIAppTemplatesResponse} extends {@link TeaModel}
 *
 * <p>QueryStandardAIAppTemplatesResponse</p>
 */
public class QueryStandardAIAppTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryStandardAIAppTemplatesResponseBody body;

    private QueryStandardAIAppTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryStandardAIAppTemplatesResponse create() {
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
    public QueryStandardAIAppTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStandardAIAppTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryStandardAIAppTemplatesResponseBody body);

        @Override
        QueryStandardAIAppTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStandardAIAppTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryStandardAIAppTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStandardAIAppTemplatesResponse response) {
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
        public Builder body(QueryStandardAIAppTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStandardAIAppTemplatesResponse build() {
            return new QueryStandardAIAppTemplatesResponse(this);
        } 

    } 

}
