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
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * escalationStageList.
         */
        public Builder escalationStageList(java.util.List<IncidentEscalationStageForView> escalationStageList) {
            this.escalationStageList = escalationStageList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ownerType.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * syncFromType.
         */
        public Builder syncFromType(String syncFromType) {
            this.syncFromType = syncFromType;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * workspace.
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
