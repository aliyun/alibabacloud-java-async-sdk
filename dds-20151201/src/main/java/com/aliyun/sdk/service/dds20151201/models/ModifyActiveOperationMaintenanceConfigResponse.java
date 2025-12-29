// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifyActiveOperationMaintenanceConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationMaintenanceConfigResponse</p>
 */
public class ModifyActiveOperationMaintenanceConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyActiveOperationMaintenanceConfigResponseBody body;

    private ModifyActiveOperationMaintenanceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyActiveOperationMaintenanceConfigResponse create() {
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
    public ModifyActiveOperationMaintenanceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyActiveOperationMaintenanceConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyActiveOperationMaintenanceConfigResponseBody body);

        @Override
        ModifyActiveOperationMaintenanceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyActiveOperationMaintenanceConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyActiveOperationMaintenanceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyActiveOperationMaintenanceConfigResponse response) {
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
        public Builder body(ModifyActiveOperationMaintenanceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyActiveOperationMaintenanceConfigResponse build() {
            return new ModifyActiveOperationMaintenanceConfigResponse(this);
        } 

    } 

}
