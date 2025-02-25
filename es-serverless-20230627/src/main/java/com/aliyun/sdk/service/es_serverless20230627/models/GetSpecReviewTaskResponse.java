// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpecReviewTaskResponse} extends {@link TeaModel}
 *
 * <p>GetSpecReviewTaskResponse</p>
 */
public class GetSpecReviewTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSpecReviewTaskResponseBody body;

    private GetSpecReviewTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSpecReviewTaskResponse create() {
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
    public GetSpecReviewTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSpecReviewTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSpecReviewTaskResponseBody body);

        @Override
        GetSpecReviewTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSpecReviewTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSpecReviewTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSpecReviewTaskResponse response) {
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
        public Builder body(GetSpecReviewTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSpecReviewTaskResponse build() {
            return new GetSpecReviewTaskResponse(this);
        } 

    } 

}
