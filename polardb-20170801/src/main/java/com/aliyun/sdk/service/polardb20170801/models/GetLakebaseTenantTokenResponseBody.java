// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GetLakebaseTenantTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetLakebaseTenantTokenResponseBody</p>
 */
public class GetLakebaseTenantTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Subdir")
    private String subdir;

    @com.aliyun.core.annotation.NameInMap("Tenant")
    private String tenant;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetLakebaseTenantTokenResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.subdir = builder.subdir;
        this.tenant = builder.tenant;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLakebaseTenantTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subdir
     */
    public String getSubdir() {
        return this.subdir;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 
        private String status; 
        private String subdir; 
        private String tenant; 
        private String token; 

        private Builder() {
        } 

        private Builder(GetLakebaseTenantTokenResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.subdir = model.subdir;
            this.tenant = model.tenant;
            this.token = model.token;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Subdir.
         */
        public Builder subdir(String subdir) {
            this.subdir = subdir;
            return this;
        }

        /**
         * Tenant.
         */
        public Builder tenant(String tenant) {
            this.tenant = tenant;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public GetLakebaseTenantTokenResponseBody build() {
            return new GetLakebaseTenantTokenResponseBody(this);
        } 

    } 

}
