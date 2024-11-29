// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCacheAnalysisJobResponse} extends {@link TeaModel}
 *
 * <p>CreateCacheAnalysisJobResponse</p>
 */
public class CreateCacheAnalysisJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateCacheAnalysisJobResponseBody body;

    private CreateCacheAnalysisJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateCacheAnalysisJobResponse create() {
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
    public CreateCacheAnalysisJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCacheAnalysisJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateCacheAnalysisJobResponseBody body);

        @Override
        CreateCacheAnalysisJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCacheAnalysisJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateCacheAnalysisJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCacheAnalysisJobResponse response) {
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
        public Builder body(CreateCacheAnalysisJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCacheAnalysisJobResponse build() {
            return new CreateCacheAnalysisJobResponse(this);
        } 

    } 

}
