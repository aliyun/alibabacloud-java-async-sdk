// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeSampleDownloadUrlResponse</p>
 */
public class DescribeSampleDownloadUrlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSampleDownloadUrlResponseBody body;

    private DescribeSampleDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSampleDownloadUrlResponse create() {
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
    public DescribeSampleDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSampleDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSampleDownloadUrlResponseBody body);

        @Override
        DescribeSampleDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSampleDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeSampleDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSampleDownloadUrlResponse response) {
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
        public Builder body(DescribeSampleDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSampleDownloadUrlResponse build() {
            return new DescribeSampleDownloadUrlResponse(this);
        } 

    } 

}
