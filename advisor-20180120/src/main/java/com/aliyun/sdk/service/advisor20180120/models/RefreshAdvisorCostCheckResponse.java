// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAdvisorCostCheckResponse} extends {@link TeaModel}
 *
 * <p>RefreshAdvisorCostCheckResponse</p>
 */
public class RefreshAdvisorCostCheckResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RefreshAdvisorCostCheckResponseBody body;

    private RefreshAdvisorCostCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RefreshAdvisorCostCheckResponse create() {
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
    public RefreshAdvisorCostCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshAdvisorCostCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RefreshAdvisorCostCheckResponseBody body);

        @Override
        RefreshAdvisorCostCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshAdvisorCostCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RefreshAdvisorCostCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshAdvisorCostCheckResponse response) {
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
        public Builder body(RefreshAdvisorCostCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshAdvisorCostCheckResponse build() {
            return new RefreshAdvisorCostCheckResponse(this);
        } 

    } 

}
