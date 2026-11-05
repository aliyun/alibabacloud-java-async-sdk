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
 * {@link CmsV1MigrationCandidate} extends {@link TeaModel}
 *
 * <p>CmsV1MigrationCandidate</p>
 */
public class CmsV1MigrationCandidate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("migrationStatus")
    private String migrationStatus;

    @com.aliyun.core.annotation.NameInMap("observeGroupId")
    private String observeGroupId;

    @com.aliyun.core.annotation.NameInMap("originGroupId")
    private String originGroupId;

    @com.aliyun.core.annotation.NameInMap("rejectionReason")
    private String rejectionReason;

    @com.aliyun.core.annotation.NameInMap("selectable")
    private Boolean selectable;

    @com.aliyun.core.annotation.NameInMap("sourceReadOnly")
    private Boolean sourceReadOnly;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("targetGroupName")
    private String targetGroupName;

    private CmsV1MigrationCandidate(Builder builder) {
        this.groupName = builder.groupName;
        this.migrationStatus = builder.migrationStatus;
        this.observeGroupId = builder.observeGroupId;
        this.originGroupId = builder.originGroupId;
        this.rejectionReason = builder.rejectionReason;
        this.selectable = builder.selectable;
        this.sourceReadOnly = builder.sourceReadOnly;
        this.sourceType = builder.sourceType;
        this.targetGroupName = builder.targetGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CmsV1MigrationCandidate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return migrationStatus
     */
    public String getMigrationStatus() {
        return this.migrationStatus;
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
     * @return rejectionReason
     */
    public String getRejectionReason() {
        return this.rejectionReason;
    }

    /**
     * @return selectable
     */
    public Boolean getSelectable() {
        return this.selectable;
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
        private String groupName; 
        private String migrationStatus; 
        private String observeGroupId; 
        private String originGroupId; 
        private String rejectionReason; 
        private Boolean selectable; 
        private Boolean sourceReadOnly; 
        private String sourceType; 
        private String targetGroupName; 

        private Builder() {
        } 

        private Builder(CmsV1MigrationCandidate model) {
            this.groupName = model.groupName;
            this.migrationStatus = model.migrationStatus;
            this.observeGroupId = model.observeGroupId;
            this.originGroupId = model.originGroupId;
            this.rejectionReason = model.rejectionReason;
            this.selectable = model.selectable;
            this.sourceReadOnly = model.sourceReadOnly;
            this.sourceType = model.sourceType;
            this.targetGroupName = model.targetGroupName;
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
         * <p>The current migration or takeover status of the source group. Valid values: NOT_MIGRATED: Not migrated. PROCESSING: In progress. MIGRATED: Migrated. If a historical task lacks proof of source read-only status, NEEDS_REVIEW is returned through rejectionReason.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
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
         * <p>The reason why the group cannot be selected.</p>
         * 
         * <strong>example:</strong>
         * <p>NEEDS_REVIEW</p>
         */
        public Builder rejectionReason(String rejectionReason) {
            this.rejectionReason = rejectionReason;
            return this;
        }

        /**
         * <p>Specifies whether the group can be selected for migration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder selectable(Boolean selectable) {
            this.selectable = selectable;
            return this;
        }

        /**
         * <p>Specifies whether the source 1.0 group is persistently read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceReadOnly(Boolean sourceReadOnly) {
            this.sourceReadOnly = sourceReadOnly;
            return this;
        }

        /**
         * <p>The type of the source application group. Valid values: custom: Custom group. tag: Tag-based group. regMgr: Resource group-based group.</p>
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

        public CmsV1MigrationCandidate build() {
            return new CmsV1MigrationCandidate(this);
        } 

    } 

}
