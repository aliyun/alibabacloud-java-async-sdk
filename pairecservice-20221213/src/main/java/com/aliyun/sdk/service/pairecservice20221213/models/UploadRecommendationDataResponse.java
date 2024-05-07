// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRecommendationDataResponse} extends {@link TeaModel}
 *
 * <p>UploadRecommendationDataResponse</p>
 */
public class UploadRecommendationDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UploadRecommendationDataResponseBody body;

    private UploadRecommendationDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UploadRecommendationDataResponse create() {
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
    public UploadRecommendationDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadRecommendationDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UploadRecommendationDataResponseBody body);

        @Override
        UploadRecommendationDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadRecommendationDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UploadRecommendationDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadRecommendationDataResponse response) {
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
        public Builder body(UploadRecommendationDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadRecommendationDataResponse build() {
            return new UploadRecommendationDataResponse(this);
        } 

    } 

}
