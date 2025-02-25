// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshAdvisorCheckResponse} extends {@link TeaModel}
 *
 * <p>RefreshAdvisorCheckResponse</p>
 */
public class RefreshAdvisorCheckResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RefreshAdvisorCheckResponseBody body;

    private RefreshAdvisorCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RefreshAdvisorCheckResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public RefreshAdvisorCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshAdvisorCheckResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RefreshAdvisorCheckResponseBody body);

        @Override
        RefreshAdvisorCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshAdvisorCheckResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RefreshAdvisorCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshAdvisorCheckResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(RefreshAdvisorCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshAdvisorCheckResponse build() {
            return new RefreshAdvisorCheckResponse(this);
        } 

    } 

}
