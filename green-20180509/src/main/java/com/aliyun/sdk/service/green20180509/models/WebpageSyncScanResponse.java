// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WebpageSyncScanResponse} extends {@link TeaModel}
 *
 * <p>WebpageSyncScanResponse</p>
 */
public class WebpageSyncScanResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private WebpageSyncScanResponseBody body;

    private WebpageSyncScanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static WebpageSyncScanResponse create() {
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
    public WebpageSyncScanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WebpageSyncScanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(WebpageSyncScanResponseBody body);

        @Override
        WebpageSyncScanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WebpageSyncScanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private WebpageSyncScanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WebpageSyncScanResponse response) {
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
        public Builder body(WebpageSyncScanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WebpageSyncScanResponse build() {
            return new WebpageSyncScanResponse(this);
        } 

    } 

}
