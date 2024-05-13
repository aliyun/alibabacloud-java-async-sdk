// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnalyzeConversationResponse} extends {@link TeaModel}
 *
 * <p>AnalyzeConversationResponse</p>
 */
public class AnalyzeConversationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AnalyzeConversationResponseBody body;

    private AnalyzeConversationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AnalyzeConversationResponse create() {
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
    public AnalyzeConversationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AnalyzeConversationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AnalyzeConversationResponseBody body);

        @Override
        AnalyzeConversationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AnalyzeConversationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AnalyzeConversationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AnalyzeConversationResponse response) {
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
        public Builder body(AnalyzeConversationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AnalyzeConversationResponse build() {
            return new AnalyzeConversationResponse(this);
        } 

    } 

}
