// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportInsightCustomValueResponse} extends {@link TeaModel}
 *
 * <p>ExportInsightCustomValueResponse</p>
 */
public class ExportInsightCustomValueResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExportInsightCustomValueResponseBody body;

    private ExportInsightCustomValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExportInsightCustomValueResponse create() {
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
    public ExportInsightCustomValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportInsightCustomValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExportInsightCustomValueResponseBody body);

        @Override
        ExportInsightCustomValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportInsightCustomValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ExportInsightCustomValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportInsightCustomValueResponse response) {
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
        public Builder body(ExportInsightCustomValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportInsightCustomValueResponse build() {
            return new ExportInsightCustomValueResponse(this);
        } 

    } 

}
