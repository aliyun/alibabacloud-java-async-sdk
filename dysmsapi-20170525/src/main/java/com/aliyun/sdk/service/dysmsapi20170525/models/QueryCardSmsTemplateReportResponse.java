// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCardSmsTemplateReportResponse} extends {@link TeaModel}
 *
 * <p>QueryCardSmsTemplateReportResponse</p>
 */
public class QueryCardSmsTemplateReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCardSmsTemplateReportResponseBody body;

    private QueryCardSmsTemplateReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCardSmsTemplateReportResponse create() {
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
    public QueryCardSmsTemplateReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCardSmsTemplateReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCardSmsTemplateReportResponseBody body);

        @Override
        QueryCardSmsTemplateReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCardSmsTemplateReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCardSmsTemplateReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCardSmsTemplateReportResponse response) {
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
        public Builder body(QueryCardSmsTemplateReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCardSmsTemplateReportResponse build() {
            return new QueryCardSmsTemplateReportResponse(this);
        } 

    } 

}
