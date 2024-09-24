// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigAuditLogRequest} extends {@link RequestModel}
 *
 * <p>ConfigAuditLogRequest</p>
 */
public class ConfigAuditLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auditAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditOssBucket")
    private String auditOssBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ConfigAuditLogRequest(Builder builder) {
        super(builder);
        this.auditAction = builder.auditAction;
        this.auditOssBucket = builder.auditOssBucket;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigAuditLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditAction
     */
    public String getAuditAction() {
        return this.auditAction;
    }

    /**
     * @return auditOssBucket
     */
    public String getAuditOssBucket() {
        return this.auditOssBucket;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigAuditLogRequest, Builder> {
        private String auditAction; 
        private String auditOssBucket; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigAuditLogRequest request) {
            super(request);
            this.auditAction = request.auditAction;
            this.auditOssBucket = request.auditOssBucket;
            this.regionId = request.regionId;
        } 

        /**
         * The status of the audit log feature.
         * <p>
         * 
         * *   enable
         * *   disable
         */
        public Builder auditAction(String auditAction) {
            this.putQueryParameter("AuditAction", auditAction);
            this.auditAction = auditAction;
            return this;
        }

        /**
         * The bucket to which audit logs are delivered.
         */
        public Builder auditOssBucket(String auditOssBucket) {
            this.putQueryParameter("AuditOssBucket", auditOssBucket);
            this.auditOssBucket = auditOssBucket;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigAuditLogRequest build() {
            return new ConfigAuditLogRequest(this);
        } 

    } 

}
