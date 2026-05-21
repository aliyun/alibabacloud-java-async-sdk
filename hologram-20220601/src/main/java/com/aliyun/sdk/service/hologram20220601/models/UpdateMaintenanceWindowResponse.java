// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateMaintenanceWindowResponse} extends {@link TeaModel}
 *
 * <p>UpdateMaintenanceWindowResponse</p>
 */
public class UpdateMaintenanceWindowResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateMaintenanceWindowResponseBody body;

    private UpdateMaintenanceWindowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateMaintenanceWindowResponse create() {
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
    public UpdateMaintenanceWindowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMaintenanceWindowResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateMaintenanceWindowResponseBody body);

        @Override
        UpdateMaintenanceWindowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMaintenanceWindowResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateMaintenanceWindowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMaintenanceWindowResponse response) {
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
        public Builder body(UpdateMaintenanceWindowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMaintenanceWindowResponse build() {
            return new UpdateMaintenanceWindowResponse(this);
        } 

    } 

}
