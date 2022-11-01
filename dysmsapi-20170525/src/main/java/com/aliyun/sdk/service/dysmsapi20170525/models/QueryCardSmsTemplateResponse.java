// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCardSmsTemplateResponse} extends {@link TeaModel}
 *
 * <p>QueryCardSmsTemplateResponse</p>
 */
public class QueryCardSmsTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCardSmsTemplateResponseBody body;

    private QueryCardSmsTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCardSmsTemplateResponse create() {
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
    public QueryCardSmsTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCardSmsTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCardSmsTemplateResponseBody body);

        @Override
        QueryCardSmsTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCardSmsTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCardSmsTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCardSmsTemplateResponse response) {
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
        public Builder body(QueryCardSmsTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCardSmsTemplateResponse build() {
            return new QueryCardSmsTemplateResponse(this);
        } 

    } 

}
