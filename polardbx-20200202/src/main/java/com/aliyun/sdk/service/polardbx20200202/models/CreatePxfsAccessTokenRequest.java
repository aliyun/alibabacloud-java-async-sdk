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
 * {@link CreatePxfsAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>CreatePxfsAccessTokenRequest</p>
 */
public class CreatePxfsAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtlSeconds")
    private Long ttlSeconds;

    private CreatePxfsAccessTokenRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.identityName = builder.identityName;
        this.label = builder.label;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.ttlSeconds = builder.ttlSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePxfsAccessTokenRequest create() {
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
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return ttlSeconds
     */
    public Long getTtlSeconds() {
        return this.ttlSeconds;
    }

    public static final class Builder extends Request.Builder<CreatePxfsAccessTokenRequest, Builder> {
        private String DBInstanceName; 
        private String identityName; 
        private String label; 
        private String regionId; 
        private String tenantId; 
        private Long ttlSeconds; 

        private Builder() {
            super();
        } 

        private Builder(CreatePxfsAccessTokenRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.identityName = request.identityName;
            this.label = request.label;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
            this.ttlSeconds = request.ttlSeconds;
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
         * <p>访问Token的用途标签。</p>
         * 
         * <strong>example:</strong>
         * <p>production-agent</p>
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
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

        /**
         * <p>访问Token的有效期，单位为秒，最大值为31536000。</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder ttlSeconds(Long ttlSeconds) {
            this.putQueryParameter("TtlSeconds", ttlSeconds);
            this.ttlSeconds = ttlSeconds;
            return this;
        }

        @Override
        public CreatePxfsAccessTokenRequest build() {
            return new CreatePxfsAccessTokenRequest(this);
        } 

    } 

}
