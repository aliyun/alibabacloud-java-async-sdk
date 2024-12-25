// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchUnbindParentPlatformDevicesResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindParentPlatformDevicesResponse</p>
 */
public class BatchUnbindParentPlatformDevicesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchUnbindParentPlatformDevicesResponseBody body;

    private BatchUnbindParentPlatformDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchUnbindParentPlatformDevicesResponse create() {
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
    public BatchUnbindParentPlatformDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindParentPlatformDevicesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchUnbindParentPlatformDevicesResponseBody body);

        @Override
        BatchUnbindParentPlatformDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindParentPlatformDevicesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private BatchUnbindParentPlatformDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindParentPlatformDevicesResponse response) {
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
        public Builder body(BatchUnbindParentPlatformDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindParentPlatformDevicesResponse build() {
            return new BatchUnbindParentPlatformDevicesResponse(this);
        } 

    } 

}
