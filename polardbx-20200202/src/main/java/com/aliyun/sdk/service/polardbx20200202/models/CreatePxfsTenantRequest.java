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
 * {@link CreatePxfsTenantRequest} extends {@link RequestModel}
 *
 * <p>CreatePxfsTenantRequest</p>
 */
public class CreatePxfsTenantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long quotaBytes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaFiles")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long quotaFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitRps")
    private Long rateLimitRps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitWbps")
    private Long rateLimitWbps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantName;

    private CreatePxfsTenantRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.quotaBytes = builder.quotaBytes;
        this.quotaFiles = builder.quotaFiles;
        this.rateLimitRps = builder.rateLimitRps;
        this.rateLimitWbps = builder.rateLimitWbps;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePxfsTenantRequest create() {
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
     * @return quotaBytes
     */
    public Long getQuotaBytes() {
        return this.quotaBytes;
    }

    /**
     * @return quotaFiles
     */
    public Long getQuotaFiles() {
        return this.quotaFiles;
    }

    /**
     * @return rateLimitRps
     */
    public Long getRateLimitRps() {
        return this.rateLimitRps;
    }

    /**
     * @return rateLimitWbps
     */
    public Long getRateLimitWbps() {
        return this.rateLimitWbps;
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
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    public static final class Builder extends Request.Builder<CreatePxfsTenantRequest, Builder> {
        private String DBInstanceName; 
        private Long quotaBytes; 
        private Long quotaFiles; 
        private Long rateLimitRps; 
        private Long rateLimitWbps; 
        private String regionId; 
        private String tenantId; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePxfsTenantRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.quotaBytes = request.quotaBytes;
            this.quotaFiles = request.quotaFiles;
            this.rateLimitRps = request.rateLimitRps;
            this.rateLimitWbps = request.rateLimitWbps;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
            this.tenantName = request.tenantName;
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
         * <p>租户容量配额，单位为字节；0表示禁止新增数据。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        public Builder quotaBytes(Long quotaBytes) {
            this.putQueryParameter("QuotaBytes", quotaBytes);
            this.quotaBytes = quotaBytes;
            return this;
        }

        /**
         * <p>租户文件数量配额；0表示禁止新增文件。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder quotaFiles(Long quotaFiles) {
            this.putQueryParameter("QuotaFiles", quotaFiles);
            this.quotaFiles = quotaFiles;
            return this;
        }

        /**
         * <p>租户每秒请求数上限；0表示不限制。</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder rateLimitRps(Long rateLimitRps) {
            this.putQueryParameter("RateLimitRps", rateLimitRps);
            this.rateLimitRps = rateLimitRps;
            return this;
        }

        /**
         * <p>租户每秒写入字节数上限；0表示不限制。</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        public Builder rateLimitWbps(Long rateLimitWbps) {
            this.putQueryParameter("RateLimitWbps", rateLimitWbps);
            this.rateLimitWbps = rateLimitWbps;
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
         * <p>Agent文件服务的租户名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-files</p>
         */
        public Builder tenantName(String tenantName) {
            this.putQueryParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        @Override
        public CreatePxfsTenantRequest build() {
            return new CreatePxfsTenantRequest(this);
        } 

    } 

}
