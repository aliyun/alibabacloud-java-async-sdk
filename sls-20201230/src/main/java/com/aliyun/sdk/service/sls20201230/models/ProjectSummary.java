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
 * {@link ProjectSummary} extends {@link TeaModel}
 *
 * <p>ProjectSummary</p>
 */
public class ProjectSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long updateTime;

    private ProjectSummary(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectSummary create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
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
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String projectName; 
        private String region; 
        private String resourceGroupId; 
        private Long updateTime; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * <p>This parameter is required.</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ProjectSummary build() {
            return new ProjectSummary(this);
        } 

    } 

}
