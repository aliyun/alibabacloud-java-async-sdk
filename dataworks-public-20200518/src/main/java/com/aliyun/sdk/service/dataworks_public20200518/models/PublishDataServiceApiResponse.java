// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>PublishDataServiceApiResponse</p>
 */
public class PublishDataServiceApiResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PublishDataServiceApiResponseBody body;

    private PublishDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PublishDataServiceApiResponse create() {
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
    public PublishDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PublishDataServiceApiResponseBody body);

        @Override
        PublishDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PublishDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishDataServiceApiResponse response) {
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
        public Builder body(PublishDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishDataServiceApiResponse build() {
            return new PublishDataServiceApiResponse(this);
        } 

    } 

}
