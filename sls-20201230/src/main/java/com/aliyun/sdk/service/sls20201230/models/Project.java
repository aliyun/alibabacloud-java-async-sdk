// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Project} extends {@link TeaModel}
 *
 * <p>Project</p>
 */
public class Project extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("dataRedundancyType")
    private String dataRedundancyType;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private String lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("quota")
    private java.util.Map<String, ?> quota;

    @com.aliyun.core.annotation.NameInMap("recycleBinEnabled")
    private Boolean recycleBinEnabled;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private Project(Builder builder) {
        this.createTime = builder.createTime;
        this.dataRedundancyType = builder.dataRedundancyType;
        this.description = builder.description;
        this.lastModifyTime = builder.lastModifyTime;
        this.location = builder.location;
        this.owner = builder.owner;
        this.projectName = builder.projectName;
        this.quota = builder.quota;
        this.recycleBinEnabled = builder.recycleBinEnabled;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Project create() {
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
     * @return dataRedundancyType
     */
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return quota
     */
    public java.util.Map<String, ?> getQuota() {
        return this.quota;
    }

    /**
     * @return recycleBinEnabled
     */
    public Boolean getRecycleBinEnabled() {
        return this.recycleBinEnabled;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String createTime; 
        private String dataRedundancyType; 
        private String description; 
        private String lastModifyTime; 
        private String location; 
        private String owner; 
        private String projectName; 
        private java.util.Map<String, ?> quota; 
        private Boolean recycleBinEnabled; 
        private String region; 
        private String resourceGroupId; 
        private String status; 

        private Builder() {
        } 

        private Builder(Project model) {
            this.createTime = model.createTime;
            this.dataRedundancyType = model.dataRedundancyType;
            this.description = model.description;
            this.lastModifyTime = model.lastModifyTime;
            this.location = model.location;
            this.owner = model.owner;
            this.projectName = model.projectName;
            this.quota = model.quota;
            this.recycleBinEnabled = model.recycleBinEnabled;
            this.region = model.region;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * dataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * quota.
         */
        public Builder quota(java.util.Map<String, ?> quota) {
            this.quota = quota;
            return this;
        }

        /**
         * recycleBinEnabled.
         */
        public Builder recycleBinEnabled(Boolean recycleBinEnabled) {
            this.recycleBinEnabled = recycleBinEnabled;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Project build() {
            return new Project(this);
        } 

    } 

}
