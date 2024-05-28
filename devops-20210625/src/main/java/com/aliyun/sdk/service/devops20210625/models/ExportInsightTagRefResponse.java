// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportInsightTagRefResponse} extends {@link TeaModel}
 *
 * <p>ExportInsightTagRefResponse</p>
 */
public class ExportInsightTagRefResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExportInsightTagRefResponseBody body;

    private ExportInsightTagRefResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExportInsightTagRefResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ExportInsightTagRefResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportInsightTagRefResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExportInsightTagRefResponseBody body);

        @Override
        ExportInsightTagRefResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportInsightTagRefResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ExportInsightTagRefResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportInsightTagRefResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ExportInsightTagRefResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportInsightTagRefResponse build() {
            return new ExportInsightTagRefResponse(this);
        } 

    } 

}
