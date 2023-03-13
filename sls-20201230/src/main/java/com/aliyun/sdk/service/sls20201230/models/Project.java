// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Project} extends {@link TeaModel}
 *
 * <p>Project</p>
 */
public class Project extends TeaModel {
    @NameInMap("createTime")
    private String createTime;

    @NameInMap("lastModifyTime")
    private String lastModifyTime;

    @NameInMap("projectDesc")
    @Validation(required = true)
    private String projectDesc;

    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @NameInMap("projectOwner")
    private String projectOwner;

    @NameInMap("projectStatus")
    private String projectStatus;

    @NameInMap("region")
    private String region;

    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    private Project(Builder builder) {
        this.createTime = builder.createTime;
        this.lastModifyTime = builder.lastModifyTime;
        this.projectDesc = builder.projectDesc;
        this.projectName = builder.projectName;
        this.projectOwner = builder.projectOwner;
        this.projectStatus = builder.projectStatus;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Project create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return projectDesc
     */
    public String getProjectDesc() {
        return this.projectDesc;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return projectOwner
     */
    public String getProjectOwner() {
        return this.projectOwner;
    }

    /**
     * @return projectStatus
     */
    public String getProjectStatus() {
        return this.projectStatus;
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

    public static final class Builder {
        private String createTime; 
        private String lastModifyTime; 
        private String projectDesc; 
        private String projectName; 
        private String projectOwner; 
        private String projectStatus; 
        private String region; 
        private String resourceGroupId; 

        /**
         * 创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 最后更新时间
         */
        public Builder lastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * 描述
         */
        public Builder projectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        /**
         * Project名称
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * owner
         */
        public Builder projectOwner(String projectOwner) {
            this.projectOwner = projectOwner;
            return this;
        }

        /**
         * 状态
         */
        public Builder projectStatus(String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }

        /**
         * 所在区域
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * 资源组Id
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Project build() {
            return new Project(this);
        } 

    } 

}
