// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileAsyncScanResultsResponse} extends {@link TeaModel}
 *
 * <p>FileAsyncScanResultsResponse</p>
 */
public class FileAsyncScanResultsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private FileAsyncScanResultsResponseBody body;

    private FileAsyncScanResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static FileAsyncScanResultsResponse create() {
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
    public FileAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FileAsyncScanResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(FileAsyncScanResultsResponseBody body);

        @Override
        FileAsyncScanResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FileAsyncScanResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private FileAsyncScanResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FileAsyncScanResultsResponse response) {
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
        public Builder body(FileAsyncScanResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FileAsyncScanResultsResponse build() {
            return new FileAsyncScanResultsResponse(this);
        } 

    } 

}
