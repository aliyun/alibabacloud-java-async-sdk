// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTimeTemplateResponse} extends {@link TeaModel}
 *
 * <p>QueryTimeTemplateResponse</p>
 */
public class QueryTimeTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTimeTemplateResponseBody body;

    private QueryTimeTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTimeTemplateResponse create() {
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
    public QueryTimeTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTimeTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTimeTemplateResponseBody body);

        @Override
        QueryTimeTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTimeTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTimeTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTimeTemplateResponse response) {
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
        public Builder body(QueryTimeTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTimeTemplateResponse build() {
            return new QueryTimeTemplateResponse(this);
        } 

    } 

}
