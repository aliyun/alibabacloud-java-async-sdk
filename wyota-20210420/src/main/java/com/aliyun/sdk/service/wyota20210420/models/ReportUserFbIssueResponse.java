// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportUserFbIssueResponse} extends {@link TeaModel}
 *
 * <p>ReportUserFbIssueResponse</p>
 */
public class ReportUserFbIssueResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReportUserFbIssueResponseBody body;

    private ReportUserFbIssueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReportUserFbIssueResponse create() {
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
    public ReportUserFbIssueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReportUserFbIssueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReportUserFbIssueResponseBody body);

        @Override
        ReportUserFbIssueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReportUserFbIssueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReportUserFbIssueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReportUserFbIssueResponse response) {
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
        public Builder body(ReportUserFbIssueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReportUserFbIssueResponse build() {
            return new ReportUserFbIssueResponse(this);
        } 

    } 

}
