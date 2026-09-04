// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreatePxfsUserRequest} extends {@link RequestModel}
 *
 * <p>CreatePxfsUserRequest</p>
 */
public class CreatePxfsUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixGid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long posixGid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long posixUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private CreatePxfsUserRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.identityName = builder.identityName;
        this.posixGid = builder.posixGid;
        this.posixUid = builder.posixUid;
        this.regionId = builder.regionId;
        this.role = builder.role;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePxfsUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return identityName
     */
    public String getIdentityName() {
        return this.identityName;
    }

    /**
     * @return posixGid
     */
    public Long getPosixGid() {
        return this.posixGid;
    }

    /**
     * @return posixUid
     */
    public Long getPosixUid() {
        return this.posixUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePxfsUserRequest, Builder> {
        private String DBInstanceName; 
        private String identityName; 
        private Long posixGid; 
        private Long posixUid; 
        private String regionId; 
        private String role; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePxfsUserRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.identityName = request.identityName;
            this.posixGid = request.posixGid;
            this.posixUid = request.posixUid;
            this.regionId = request.regionId;
            this.role = request.role;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>Agent文件服务关联的PolarDB-X实例ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Agent文件服务租户内的身份名称，不是阿里云账号UID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        public Builder identityName(String identityName) {
            this.putQueryParameter("IdentityName", identityName);
            this.identityName = identityName;
            return this;
        }

        /**
         * <p>POSIX GID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder posixGid(Long posixGid) {
            this.putQueryParameter("PosixGid", posixGid);
            this.posixGid = posixGid;
            return this;
        }

        /**
         * <p>POSIX UID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder posixUid(Long posixUid) {
            this.putQueryParameter("PosixUid", posixUid);
            this.posixUid = posixUid;
            return this;
        }

        /**
         * <p>Agent文件服务实例所属地域的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>租户身份角色，取值为ADMIN或MEMBER。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>Agent文件服务的租户ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePxfsUserRequest build() {
            return new CreatePxfsUserRequest(this);
        } 

    } 

}
