// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppOtaTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAppOtaTaskRequest</p>
 */
public class CreateAppOtaTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersionUid")
    private String appVersionUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIdList")
    private java.util.List < String > clientIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceUpgrade")
    private Integer forceUpgrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List < String > regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private Integer taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private CreateAppOtaTaskRequest(Builder builder) {
        super(builder);
        this.appVersionUid = builder.appVersionUid;
        this.channel = builder.channel;
        this.clientIdList = builder.clientIdList;
        this.clientType = builder.clientType;
        this.creator = builder.creator;
        this.description = builder.description;
        this.forceUpgrade = builder.forceUpgrade;
        this.label = builder.label;
        this.name = builder.name;
        this.project = builder.project;
        this.regions = builder.regions;
        this.status = builder.status;
        this.taskType = builder.taskType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppOtaTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersionUid
     */
    public String getAppVersionUid() {
        return this.appVersionUid;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return clientIdList
     */
    public java.util.List < String > getClientIdList() {
        return this.clientIdList;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return forceUpgrade
     */
    public Integer getForceUpgrade() {
        return this.forceUpgrade;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regions
     */
    public java.util.List < String > getRegions() {
        return this.regions;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateAppOtaTaskRequest, Builder> {
        private String appVersionUid; 
        private String channel; 
        private java.util.List < String > clientIdList; 
        private Integer clientType; 
        private String creator; 
        private String description; 
        private Integer forceUpgrade; 
        private String label; 
        private String name; 
        private String project; 
        private java.util.List < String > regions; 
        private Integer status; 
        private Integer taskType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppOtaTaskRequest request) {
            super(request);
            this.appVersionUid = request.appVersionUid;
            this.channel = request.channel;
            this.clientIdList = request.clientIdList;
            this.clientType = request.clientType;
            this.creator = request.creator;
            this.description = request.description;
            this.forceUpgrade = request.forceUpgrade;
            this.label = request.label;
            this.name = request.name;
            this.project = request.project;
            this.regions = request.regions;
            this.status = request.status;
            this.taskType = request.taskType;
            this.tenantId = request.tenantId;
        } 

        /**
         * AppVersionUid.
         */
        public Builder appVersionUid(String appVersionUid) {
            this.putQueryParameter("AppVersionUid", appVersionUid);
            this.appVersionUid = appVersionUid;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ClientIdList.
         */
        public Builder clientIdList(java.util.List < String > clientIdList) {
            this.putQueryParameter("ClientIdList", clientIdList);
            this.clientIdList = clientIdList;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ForceUpgrade.
         */
        public Builder forceUpgrade(Integer forceUpgrade) {
            this.putQueryParameter("ForceUpgrade", forceUpgrade);
            this.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(java.util.List < String > regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(Integer taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateAppOtaTaskRequest build() {
            return new CreateAppOtaTaskRequest(this);
        } 

    } 

}
