// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link LockVirtualMFADeviceResponse} extends {@link TeaModel}
 *
 * <p>LockVirtualMFADeviceResponse</p>
 */
public class LockVirtualMFADeviceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private LockVirtualMFADeviceResponseBody body;

    private LockVirtualMFADeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static LockVirtualMFADeviceResponse create() {
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
    public LockVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LockVirtualMFADeviceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(LockVirtualMFADeviceResponseBody body);

        @Override
        LockVirtualMFADeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LockVirtualMFADeviceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private LockVirtualMFADeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LockVirtualMFADeviceResponse response) {
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
        public Builder body(LockVirtualMFADeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LockVirtualMFADeviceResponse build() {
            return new LockVirtualMFADeviceResponse(this);
        } 

    } 

}
