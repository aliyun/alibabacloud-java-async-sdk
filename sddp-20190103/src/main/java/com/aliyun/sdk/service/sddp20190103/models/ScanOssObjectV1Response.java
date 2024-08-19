// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScanOssObjectV1Response} extends {@link TeaModel}
 *
 * <p>ScanOssObjectV1Response</p>
 */
public class ScanOssObjectV1Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ScanOssObjectV1ResponseBody body;

    private ScanOssObjectV1Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ScanOssObjectV1Response create() {
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
    public ScanOssObjectV1ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScanOssObjectV1Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ScanOssObjectV1ResponseBody body);

        @Override
        ScanOssObjectV1Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScanOssObjectV1Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ScanOssObjectV1ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScanOssObjectV1Response response) {
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
        public Builder body(ScanOssObjectV1ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScanOssObjectV1Response build() {
            return new ScanOssObjectV1Response(this);
        } 

    } 

}
