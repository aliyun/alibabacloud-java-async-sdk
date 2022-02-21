// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsTemplateResponse} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateResponse</p>
 */
public class QuerySmsTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySmsTemplateResponseBody body;

    private QuerySmsTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySmsTemplateResponse create() {
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
    public QuerySmsTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySmsTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySmsTemplateResponseBody body);

        @Override
        QuerySmsTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySmsTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySmsTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySmsTemplateResponse response) {
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
        public Builder body(QuerySmsTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySmsTemplateResponse build() {
            return new QuerySmsTemplateResponse(this);
        } 

    } 

}
