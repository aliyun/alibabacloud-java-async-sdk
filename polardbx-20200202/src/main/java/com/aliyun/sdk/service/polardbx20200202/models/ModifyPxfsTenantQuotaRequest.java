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
 * {@link ModifyPxfsTenantQuotaRequest} extends {@link RequestModel}
 *
 * <p>ModifyPxfsTenantQuotaRequest</p>
 */
public class ModifyPxfsTenantQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaBytes")
    @com.aliyun.core.annotation.Validation(maximum = 1125899906842624D)
    private Long quotaBytes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaFiles")
    @com.aliyun.core.annotation.Validation(maximum = 1099511627776D)
    private Long quotaFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitRps")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Long rateLimitRps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitWbps")
    @com.aliyun.core.annotation.Validation()
    private Long rateLimitWbps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private ModifyPxfsTenantQuotaRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.quotaBytes = builder.quotaBytes;
        this.quotaFiles = builder.quotaFiles;
        this.rateLimitRps = builder.rateLimitRps;
        this.rateLimitWbps = builder.rateLimitWbps;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPxfsTenantQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyPxfsTenantQuotaRequest, Builder> {
        private String DBInstanceName; 
        private Long quotaBytes; 
        private Long quotaFiles; 
        private Long rateLimitRps; 
        private Long rateLimitWbps; 
        private String regionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPxfsTenantQuotaRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.quotaBytes = request.quotaBytes;
            this.quotaFiles = request.quotaFiles;
            this.rateLimitRps = request.rateLimitRps;
            this.rateLimitWbps = request.rateLimitWbps;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-htri0ori2r****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The capacity quota.</p>
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
         * <p>The file count quota.</p>
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
         * <p>The request rate limit.</p>
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
         * <p>The write bandwidth limit.</p>
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
         * <p>The region ID of the instance.</p>
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
         * <p>The tenant ID.</p>
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
        public ModifyPxfsTenantQuotaRequest build() {
            return new ModifyPxfsTenantQuotaRequest(this);
        } 

    } 

}
