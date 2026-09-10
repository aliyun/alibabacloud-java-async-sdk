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
 * {@link IncidentEscalationPolicyForView} extends {@link TeaModel}
 *
 * <p>IncidentEscalationPolicyForView</p>
 */
public class IncidentEscalationPolicyForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("escalationStageList")
    private java.util.List<IncidentEscalationStageForView> escalationStageList;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("ownerType")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("syncFromType")
    private String syncFromType;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentEscalationPolicyForView(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enable = builder.enable;
        this.escalationStageList = builder.escalationStageList;
        this.name = builder.name;
        this.ownerType = builder.ownerType;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.syncFromType = builder.syncFromType;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEscalationPolicyForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return escalationStageList
     */
    public java.util.List<IncidentEscalationStageForView> getEscalationStageList() {
        return this.escalationStageList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return syncFromType
     */
    public String getSyncFromType() {
        return this.syncFromType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private Boolean enable; 
        private java.util.List<IncidentEscalationStageForView> escalationStageList; 
        private String name; 
        private String ownerType; 
        private String regionId; 
        private String source; 
        private String syncFromType; 
        private String updateTime; 
        private String userId; 
        private String uuid; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentEscalationPolicyForView model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.enable = model.enable;
            this.escalationStageList = model.escalationStageList;
            this.name = model.name;
            this.ownerType = model.ownerType;
            this.regionId = model.regionId;
            this.source = model.source;
            this.syncFromType = model.syncFromType;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.uuid = model.uuid;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace api monitor update test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The list of escalation stages.</p>
         */
        public Builder escalationStageList(java.util.List<IncidentEscalationStageForView> escalationStageList) {
            this.escalationStageList = escalationStageList;
            return this;
        }

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Critical-Alert-Escalation&quot;</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The owner type.</p>
         * <ul>
         * <li><p><strong>USER</strong>: User. This is the default value.</p>
         * </li>
         * <li><p><strong>APP</strong>: Application.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;USER&quot;</p>
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cn-hangzhou&quot;</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;MANUAL&quot;</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The source type of the synchronization policy.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ARMS&quot;</p>
         */
        public Builder syncFromType(String syncFromType) {
            this.syncFromType = syncFromType;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-15T02:02:50Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;user-abc123&quot;</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The globally unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;a1b2c3d4-e5f6-7890-1234-567890abcdef&quot;</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ws-xyz789&quot;</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentEscalationPolicyForView build() {
            return new IncidentEscalationPolicyForView(this);
        } 

    } 

}
