// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeCertDetailResponse</p>
 */
public class DescribeCertDetailResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCertDetailResponseBody body;

    private DescribeCertDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCertDetailResponse create() {
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
    public DescribeCertDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCertDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCertDetailResponseBody body);

        @Override
        DescribeCertDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCertDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeCertDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCertDetailResponse response) {
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
        public Builder body(DescribeCertDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCertDetailResponse build() {
            return new DescribeCertDetailResponse(this);
        } 

    } 

}
