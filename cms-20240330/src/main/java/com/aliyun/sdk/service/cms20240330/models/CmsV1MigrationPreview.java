// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CmsV1MigrationPreview} extends {@link TeaModel}
 *
 * <p>CmsV1MigrationPreview</p>
 */
public class CmsV1MigrationPreview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checks")
    private java.util.List<CmsV1MigrationCheck> checks;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("migratable")
    private Boolean migratable;

    @com.aliyun.core.annotation.NameInMap("observeGroupId")
    private String observeGroupId;

    @com.aliyun.core.annotation.NameInMap("originGroupId")
    private String originGroupId;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("sourceReadOnly")
    private Boolean sourceReadOnly;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("targetGroupName")
    private String targetGroupName;

    private CmsV1MigrationPreview(Builder builder) {
        this.checks = builder.checks;
        this.groupName = builder.groupName;
        this.migratable = builder.migratable;
        this.observeGroupId = builder.observeGroupId;
        this.originGroupId = builder.originGroupId;
        this.reason = builder.reason;
        this.sourceReadOnly = builder.sourceReadOnly;
        this.sourceType = builder.sourceType;
        this.targetGroupName = builder.targetGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CmsV1MigrationPreview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checks
     */
    public java.util.List<CmsV1MigrationCheck> getChecks() {
        return this.checks;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return migratable
     */
    public Boolean getMigratable() {
        return this.migratable;
    }

    /**
     * @return observeGroupId
     */
    public String getObserveGroupId() {
        return this.observeGroupId;
    }

    /**
     * @return originGroupId
     */
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sourceReadOnly
     */
    public Boolean getSourceReadOnly() {
        return this.sourceReadOnly;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return targetGroupName
     */
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    public static final class Builder {
        private java.util.List<CmsV1MigrationCheck> checks; 
        private String groupName; 
        private Boolean migratable; 
        private String observeGroupId; 
        private String originGroupId; 
        private String reason; 
        private Boolean sourceReadOnly; 
        private String sourceType; 
        private String targetGroupName; 

        private Builder() {
        } 

        private Builder(CmsV1MigrationPreview model) {
            this.checks = model.checks;
            this.groupName = model.groupName;
            this.migratable = model.migratable;
            this.observeGroupId = model.observeGroupId;
            this.originGroupId = model.originGroupId;
            this.reason = model.reason;
            this.sourceReadOnly = model.sourceReadOnly;
            this.sourceType = model.sourceType;
            this.targetGroupName = model.targetGroupName;
        } 

        /**
         * <p>The itemized check results for name and resource support.</p>
         */
        public Builder checks(java.util.List<CmsV1MigrationCheck> checks) {
            this.checks = checks;
            return this;
        }

        /**
         * <p>The name of the source application group.</p>
         * 
         * <strong>example:</strong>
         * <p>order-service</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Indicates whether the dry run is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder migratable(Boolean migratable) {
            this.migratable = migratable;
            return this;
        }

        /**
         * <p>The ID of the target observation group.</p>
         * 
         * <strong>example:</strong>
         * <p>og-0123456789abcdef</p>
         */
        public Builder observeGroupId(String observeGroupId) {
            this.observeGroupId = observeGroupId;
            return this;
        }

        /**
         * <p>The ID of the source CloudMonitor 1.0 application group.</p>
         * 
         * <strong>example:</strong>
         * <p>247675311</p>
         */
        public Builder originGroupId(String originGroupId) {
            this.originGroupId = originGroupId;
            return this;
        }

        /**
         * <p>The reason for the dry run failure.</p>
         * 
         * <strong>example:</strong>
         * <p>NAME_INVALID</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>Indicates whether the source 1.0 group is persistently read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceReadOnly(Boolean sourceReadOnly) {
            this.sourceReadOnly = sourceReadOnly;
            return this;
        }

        /**
         * <p>The type of the source application group. custom indicates a custom group, tag indicates a tag-based group, and regMgr indicates a resource group-based group.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The name of the target observation group.</p>
         * 
         * <strong>example:</strong>
         * <p>order-service</p>
         */
        public Builder targetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }

        public CmsV1MigrationPreview build() {
            return new CmsV1MigrationPreview(this);
        } 

    } 

}
