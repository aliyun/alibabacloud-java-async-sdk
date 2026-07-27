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
 * {@link GetLakebaseTenantTokenRequest} extends {@link RequestModel}
 *
 * <p>GetLakebaseTenantTokenRequest</p>
 */
public class GetLakebaseTenantTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subdir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subdir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tenant")
    private String tenant;

    private GetLakebaseTenantTokenRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.subdir = builder.subdir;
        this.tenant = builder.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLakebaseTenantTokenRequest create() {
        return builder().build();
    }

@Override
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
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
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

    public static final class Builder extends Request.Builder<GetLakebaseTenantTokenRequest, Builder> {
        private String DBClusterId; 
        private String polarFsInstanceId; 
        private String subdir; 
        private String tenant; 

        private Builder() {
            super();
        } 

        private Builder(GetLakebaseTenantTokenRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.subdir = request.subdir;
            this.tenant = request.tenant;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/project/p1</p>
         */
        public Builder subdir(String subdir) {
            this.putQueryParameter("Subdir", subdir);
            this.subdir = subdir;
            return this;
        }

        /**
         * Tenant.
         */
        public Builder tenant(String tenant) {
            this.putQueryParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        @Override
        public GetLakebaseTenantTokenRequest build() {
            return new GetLakebaseTenantTokenRequest(this);
        } 

    } 

}
