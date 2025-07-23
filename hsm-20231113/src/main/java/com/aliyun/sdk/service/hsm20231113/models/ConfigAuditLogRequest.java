// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
         * <p>Specifies whether to enable the audit log feature. Valid values:</p>
         * <ul>
         * <li>enable</li>
         * <li>disable</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder auditAction(String auditAction) {
            this.putQueryParameter("AuditAction", auditAction);
            this.auditAction = auditAction;
            return this;
        }

        /**
         * <p>The bucket to which audit logs are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-log</p>
         */
        public Builder auditOssBucket(String auditOssBucket) {
            this.putQueryParameter("AuditOssBucket", auditOssBucket);
            this.auditOssBucket = auditOssBucket;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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

        @Override
        public ConfigAuditLogRequest build() {
            return new ConfigAuditLogRequest(this);
        } 

    } 

}
