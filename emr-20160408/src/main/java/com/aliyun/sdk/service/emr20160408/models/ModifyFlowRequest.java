// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowRequest</p>
 */
public class ModifyFlowRequest extends Request {
    @Query
    @NameInMap("AlertConf")
    private String alertConf;

    @Query
    @NameInMap("AlertDingDingGroupBizId")
    private String alertDingDingGroupBizId;

    @Query
    @NameInMap("AlertUserGroupBizId")
    private String alertUserGroupBizId;

    @Query
    @NameInMap("Application")
    private String application;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CreateCluster")
    private Boolean createCluster;

    @Query
    @NameInMap("CronExpr")
    private String cronExpr;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndSchedule")
    private Long endSchedule;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Lifecycle")
    private String lifecycle;

    @Query
    @NameInMap("LogArchiveLocation")
    private String logArchiveLocation;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("ParentCategory")
    private String parentCategory;

    @Query
    @NameInMap("ParentFlowList")
    private String parentFlowList;

    @Query
    @NameInMap("Periodic")
    private Boolean periodic;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartSchedule")
    private Long startSchedule;

    @Query
    @NameInMap("Status")
    private String status;

    private ModifyFlowRequest(Builder builder) {
        super(builder);
        this.alertConf = builder.alertConf;
        this.alertDingDingGroupBizId = builder.alertDingDingGroupBizId;
        this.alertUserGroupBizId = builder.alertUserGroupBizId;
        this.application = builder.application;
        this.clusterId = builder.clusterId;
        this.createCluster = builder.createCluster;
        this.cronExpr = builder.cronExpr;
        this.description = builder.description;
        this.endSchedule = builder.endSchedule;
        this.hostName = builder.hostName;
        this.id = builder.id;
        this.lifecycle = builder.lifecycle;
        this.logArchiveLocation = builder.logArchiveLocation;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentCategory = builder.parentCategory;
        this.parentFlowList = builder.parentFlowList;
        this.periodic = builder.periodic;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startSchedule = builder.startSchedule;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConf
     */
    public String getAlertConf() {
        return this.alertConf;
    }

    /**
     * @return alertDingDingGroupBizId
     */
    public String getAlertDingDingGroupBizId() {
        return this.alertDingDingGroupBizId;
    }

    /**
     * @return alertUserGroupBizId
     */
    public String getAlertUserGroupBizId() {
        return this.alertUserGroupBizId;
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createCluster
     */
    public Boolean getCreateCluster() {
        return this.createCluster;
    }

    /**
     * @return cronExpr
     */
    public String getCronExpr() {
        return this.cronExpr;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endSchedule
     */
    public Long getEndSchedule() {
        return this.endSchedule;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lifecycle
     */
    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return logArchiveLocation
     */
    public String getLogArchiveLocation() {
        return this.logArchiveLocation;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return parentCategory
     */
    public String getParentCategory() {
        return this.parentCategory;
    }

    /**
     * @return parentFlowList
     */
    public String getParentFlowList() {
        return this.parentFlowList;
    }

    /**
     * @return periodic
     */
    public Boolean getPeriodic() {
        return this.periodic;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startSchedule
     */
    public Long getStartSchedule() {
        return this.startSchedule;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyFlowRequest, Builder> {
        private String alertConf; 
        private String alertDingDingGroupBizId; 
        private String alertUserGroupBizId; 
        private String application; 
        private String clusterId; 
        private Boolean createCluster; 
        private String cronExpr; 
        private String description; 
        private Long endSchedule; 
        private String hostName; 
        private String id; 
        private String lifecycle; 
        private String logArchiveLocation; 
        private String name; 
        private String namespace; 
        private String parentCategory; 
        private String parentFlowList; 
        private Boolean periodic; 
        private String projectId; 
        private String regionId; 
        private Long startSchedule; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowRequest response) {
            super(response);
            this.alertConf = response.alertConf;
            this.alertDingDingGroupBizId = response.alertDingDingGroupBizId;
            this.alertUserGroupBizId = response.alertUserGroupBizId;
            this.application = response.application;
            this.clusterId = response.clusterId;
            this.createCluster = response.createCluster;
            this.cronExpr = response.cronExpr;
            this.description = response.description;
            this.endSchedule = response.endSchedule;
            this.hostName = response.hostName;
            this.id = response.id;
            this.lifecycle = response.lifecycle;
            this.logArchiveLocation = response.logArchiveLocation;
            this.name = response.name;
            this.namespace = response.namespace;
            this.parentCategory = response.parentCategory;
            this.parentFlowList = response.parentFlowList;
            this.periodic = response.periodic;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startSchedule = response.startSchedule;
            this.status = response.status;
        } 

        /**
         * AlertConf.
         */
        public Builder alertConf(String alertConf) {
            this.putQueryParameter("AlertConf", alertConf);
            this.alertConf = alertConf;
            return this;
        }

        /**
         * AlertDingDingGroupBizId.
         */
        public Builder alertDingDingGroupBizId(String alertDingDingGroupBizId) {
            this.putQueryParameter("AlertDingDingGroupBizId", alertDingDingGroupBizId);
            this.alertDingDingGroupBizId = alertDingDingGroupBizId;
            return this;
        }

        /**
         * AlertUserGroupBizId.
         */
        public Builder alertUserGroupBizId(String alertUserGroupBizId) {
            this.putQueryParameter("AlertUserGroupBizId", alertUserGroupBizId);
            this.alertUserGroupBizId = alertUserGroupBizId;
            return this;
        }

        /**
         * Application.
         */
        public Builder application(String application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CreateCluster.
         */
        public Builder createCluster(Boolean createCluster) {
            this.putQueryParameter("CreateCluster", createCluster);
            this.createCluster = createCluster;
            return this;
        }

        /**
         * CronExpr.
         */
        public Builder cronExpr(String cronExpr) {
            this.putQueryParameter("CronExpr", cronExpr);
            this.cronExpr = cronExpr;
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
         * EndSchedule.
         */
        public Builder endSchedule(Long endSchedule) {
            this.putQueryParameter("EndSchedule", endSchedule);
            this.endSchedule = endSchedule;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lifecycle.
         */
        public Builder lifecycle(String lifecycle) {
            this.putQueryParameter("Lifecycle", lifecycle);
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * LogArchiveLocation.
         */
        public Builder logArchiveLocation(String logArchiveLocation) {
            this.putQueryParameter("LogArchiveLocation", logArchiveLocation);
            this.logArchiveLocation = logArchiveLocation;
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
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ParentCategory.
         */
        public Builder parentCategory(String parentCategory) {
            this.putQueryParameter("ParentCategory", parentCategory);
            this.parentCategory = parentCategory;
            return this;
        }

        /**
         * ParentFlowList.
         */
        public Builder parentFlowList(String parentFlowList) {
            this.putQueryParameter("ParentFlowList", parentFlowList);
            this.parentFlowList = parentFlowList;
            return this;
        }

        /**
         * Periodic.
         */
        public Builder periodic(Boolean periodic) {
            this.putQueryParameter("Periodic", periodic);
            this.periodic = periodic;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartSchedule.
         */
        public Builder startSchedule(Long startSchedule) {
            this.putQueryParameter("StartSchedule", startSchedule);
            this.startSchedule = startSchedule;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyFlowRequest build() {
            return new ModifyFlowRequest(this);
        } 

    } 

}
