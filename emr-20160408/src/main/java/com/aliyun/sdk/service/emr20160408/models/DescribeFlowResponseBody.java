// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowResponseBody</p>
 */
public class DescribeFlowResponseBody extends TeaModel {
    @NameInMap("AlertConf")
    private String alertConf;

    @NameInMap("AlertDingDingGroupBizId")
    private String alertDingDingGroupBizId;

    @NameInMap("AlertUserGroupBizId")
    private String alertUserGroupBizId;

    @NameInMap("Application")
    private String application;

    @NameInMap("CategoryId")
    private String categoryId;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CreateCluster")
    private Boolean createCluster;

    @NameInMap("CronExpr")
    private String cronExpr;

    @NameInMap("Description")
    private String description;

    @NameInMap("EditLockDetail")
    private String editLockDetail;

    @NameInMap("EndSchedule")
    private Long endSchedule;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Graph")
    private String graph;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("Id")
    private String id;

    @NameInMap("Lifecycle")
    private String lifecycle;

    @NameInMap("LogArchiveLocation")
    private String logArchiveLocation;

    @NameInMap("Name")
    private String name;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("ParentFlowList")
    private ParentFlowList parentFlowList;

    @NameInMap("Periodic")
    private Boolean periodic;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartSchedule")
    private Long startSchedule;

    @NameInMap("Status")
    private String status;

    @NameInMap("Type")
    private String type;

    private DescribeFlowResponseBody(Builder builder) {
        this.alertConf = builder.alertConf;
        this.alertDingDingGroupBizId = builder.alertDingDingGroupBizId;
        this.alertUserGroupBizId = builder.alertUserGroupBizId;
        this.application = builder.application;
        this.categoryId = builder.categoryId;
        this.clusterId = builder.clusterId;
        this.createCluster = builder.createCluster;
        this.cronExpr = builder.cronExpr;
        this.description = builder.description;
        this.editLockDetail = builder.editLockDetail;
        this.endSchedule = builder.endSchedule;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.graph = builder.graph;
        this.hostName = builder.hostName;
        this.id = builder.id;
        this.lifecycle = builder.lifecycle;
        this.logArchiveLocation = builder.logArchiveLocation;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentFlowList = builder.parentFlowList;
        this.periodic = builder.periodic;
        this.requestId = builder.requestId;
        this.startSchedule = builder.startSchedule;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowResponseBody create() {
        return builder().build();
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
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
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
     * @return editLockDetail
     */
    public String getEditLockDetail() {
        return this.editLockDetail;
    }

    /**
     * @return endSchedule
     */
    public Long getEndSchedule() {
        return this.endSchedule;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return graph
     */
    public String getGraph() {
        return this.graph;
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
     * @return parentFlowList
     */
    public ParentFlowList getParentFlowList() {
        return this.parentFlowList;
    }

    /**
     * @return periodic
     */
    public Boolean getPeriodic() {
        return this.periodic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alertConf; 
        private String alertDingDingGroupBizId; 
        private String alertUserGroupBizId; 
        private String application; 
        private String categoryId; 
        private String clusterId; 
        private Boolean createCluster; 
        private String cronExpr; 
        private String description; 
        private String editLockDetail; 
        private Long endSchedule; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String graph; 
        private String hostName; 
        private String id; 
        private String lifecycle; 
        private String logArchiveLocation; 
        private String name; 
        private String namespace; 
        private ParentFlowList parentFlowList; 
        private Boolean periodic; 
        private String requestId; 
        private Long startSchedule; 
        private String status; 
        private String type; 

        /**
         * AlertConf.
         */
        public Builder alertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }

        /**
         * AlertDingDingGroupBizId.
         */
        public Builder alertDingDingGroupBizId(String alertDingDingGroupBizId) {
            this.alertDingDingGroupBizId = alertDingDingGroupBizId;
            return this;
        }

        /**
         * AlertUserGroupBizId.
         */
        public Builder alertUserGroupBizId(String alertUserGroupBizId) {
            this.alertUserGroupBizId = alertUserGroupBizId;
            return this;
        }

        /**
         * Application.
         */
        public Builder application(String application) {
            this.application = application;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CreateCluster.
         */
        public Builder createCluster(Boolean createCluster) {
            this.createCluster = createCluster;
            return this;
        }

        /**
         * CronExpr.
         */
        public Builder cronExpr(String cronExpr) {
            this.cronExpr = cronExpr;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EditLockDetail.
         */
        public Builder editLockDetail(String editLockDetail) {
            this.editLockDetail = editLockDetail;
            return this;
        }

        /**
         * EndSchedule.
         */
        public Builder endSchedule(Long endSchedule) {
            this.endSchedule = endSchedule;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Graph.
         */
        public Builder graph(String graph) {
            this.graph = graph;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Lifecycle.
         */
        public Builder lifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * LogArchiveLocation.
         */
        public Builder logArchiveLocation(String logArchiveLocation) {
            this.logArchiveLocation = logArchiveLocation;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * ParentFlowList.
         */
        public Builder parentFlowList(ParentFlowList parentFlowList) {
            this.parentFlowList = parentFlowList;
            return this;
        }

        /**
         * Periodic.
         */
        public Builder periodic(Boolean periodic) {
            this.periodic = periodic;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartSchedule.
         */
        public Builder startSchedule(Long startSchedule) {
            this.startSchedule = startSchedule;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeFlowResponseBody build() {
            return new DescribeFlowResponseBody(this);
        } 

    } 

    public static class ParentFlow extends TeaModel {
        @NameInMap("ParentFlowId")
        private String parentFlowId;

        @NameInMap("ParentFlowName")
        private String parentFlowName;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectName")
        private String projectName;

        private ParentFlow(Builder builder) {
            this.parentFlowId = builder.parentFlowId;
            this.parentFlowName = builder.parentFlowName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParentFlow create() {
            return builder().build();
        }

        /**
         * @return parentFlowId
         */
        public String getParentFlowId() {
            return this.parentFlowId;
        }

        /**
         * @return parentFlowName
         */
        public String getParentFlowName() {
            return this.parentFlowName;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String parentFlowId; 
            private String parentFlowName; 
            private String projectId; 
            private String projectName; 

            /**
             * ParentFlowId.
             */
            public Builder parentFlowId(String parentFlowId) {
                this.parentFlowId = parentFlowId;
                return this;
            }

            /**
             * ParentFlowName.
             */
            public Builder parentFlowName(String parentFlowName) {
                this.parentFlowName = parentFlowName;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public ParentFlow build() {
                return new ParentFlow(this);
            } 

        } 

    }
    public static class ParentFlowList extends TeaModel {
        @NameInMap("ParentFlow")
        private java.util.List < ParentFlow> parentFlow;

        private ParentFlowList(Builder builder) {
            this.parentFlow = builder.parentFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParentFlowList create() {
            return builder().build();
        }

        /**
         * @return parentFlow
         */
        public java.util.List < ParentFlow> getParentFlow() {
            return this.parentFlow;
        }

        public static final class Builder {
            private java.util.List < ParentFlow> parentFlow; 

            /**
             * ParentFlow.
             */
            public Builder parentFlow(java.util.List < ParentFlow> parentFlow) {
                this.parentFlow = parentFlow;
                return this;
            }

            public ParentFlowList build() {
                return new ParentFlowList(this);
            } 

        } 

    }
}
