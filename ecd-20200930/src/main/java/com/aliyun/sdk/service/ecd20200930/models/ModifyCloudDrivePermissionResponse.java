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
 * {@link ModifyCloudDrivePermissionResponse} extends {@link TeaModel}
 *
 * <p>ModifyCloudDrivePermissionResponse</p>
 */
public class ModifyCloudDrivePermissionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyCloudDrivePermissionResponseBody body;

    private ModifyCloudDrivePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyCloudDrivePermissionResponse create() {
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
    public ModifyCloudDrivePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCloudDrivePermissionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyCloudDrivePermissionResponseBody body);

        @Override
        ModifyCloudDrivePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCloudDrivePermissionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyCloudDrivePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCloudDrivePermissionResponse response) {
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
        public Builder body(ModifyCloudDrivePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCloudDrivePermissionResponse build() {
            return new ModifyCloudDrivePermissionResponse(this);
        } 

    } 

}
