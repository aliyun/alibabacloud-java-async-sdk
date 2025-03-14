// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PublicSyncAndCreateImageScanTaskResponse} extends {@link TeaModel}
 *
 * <p>PublicSyncAndCreateImageScanTaskResponse</p>
 */
public class PublicSyncAndCreateImageScanTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PublicSyncAndCreateImageScanTaskResponseBody body;

    private PublicSyncAndCreateImageScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PublicSyncAndCreateImageScanTaskResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public PublicSyncAndCreateImageScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublicSyncAndCreateImageScanTaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(PublicSyncAndCreateImageScanTaskResponseBody body);

        @Override
        PublicSyncAndCreateImageScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublicSyncAndCreateImageScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private PublicSyncAndCreateImageScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublicSyncAndCreateImageScanTaskResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(PublicSyncAndCreateImageScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublicSyncAndCreateImageScanTaskResponse build() {
            return new PublicSyncAndCreateImageScanTaskResponse(this);
        } 

    } 

}
