// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowRequest</p>
 */
public class CreateFlowRequest extends Request {
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
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CreateCluster")
    private Boolean createCluster;

    @Query
    @NameInMap("CronExpression")
    private String cronExpression;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("EndSchedule")
    private Long endSchedule;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
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

    private CreateFlowRequest(Builder builder) {
        super(builder);
        this.alertConf = builder.alertConf;
        this.alertDingDingGroupBizId = builder.alertDingDingGroupBizId;
        this.alertUserGroupBizId = builder.alertUserGroupBizId;
        this.application = builder.application;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.createCluster = builder.createCluster;
        this.cronExpression = builder.cronExpression;
        this.description = builder.description;
        this.endSchedule = builder.endSchedule;
        this.hostName = builder.hostName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentCategory = builder.parentCategory;
        this.parentFlowList = builder.parentFlowList;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startSchedule = builder.startSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
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

    public static final class Builder extends Request.Builder<CreateFlowRequest, Builder> {
        private String alertConf; 
        private String alertDingDingGroupBizId; 
        private String alertUserGroupBizId; 
        private String application; 
        private String clientToken; 
        private String clusterId; 
        private Boolean createCluster; 
        private String cronExpression; 
        private String description; 
        private Long endSchedule; 
        private String hostName; 
        private String name; 
        private String namespace; 
        private String parentCategory; 
        private String parentFlowList; 
        private String projectId; 
        private String regionId; 
        private Long startSchedule; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowRequest request) {
            super(request);
            this.alertConf = request.alertConf;
            this.alertDingDingGroupBizId = request.alertDingDingGroupBizId;
            this.alertUserGroupBizId = request.alertUserGroupBizId;
            this.application = request.application;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.createCluster = request.createCluster;
            this.cronExpression = request.cronExpression;
            this.description = request.description;
            this.endSchedule = request.endSchedule;
            this.hostName = request.hostName;
            this.name = request.name;
            this.namespace = request.namespace;
            this.parentCategory = request.parentCategory;
            this.parentFlowList = request.parentFlowList;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.startSchedule = request.startSchedule;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
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

        @Override
        public CreateFlowRequest build() {
            return new CreateFlowRequest(this);
        } 

    } 

}
