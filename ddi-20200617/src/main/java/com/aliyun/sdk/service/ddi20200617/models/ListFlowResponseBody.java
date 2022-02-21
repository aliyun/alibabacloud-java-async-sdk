// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowResponseBody</p>
 */
public class ListFlowResponseBody extends TeaModel {
    @NameInMap("Flow")
    private Flow flow;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFlowResponseBody(Builder builder) {
        this.flow = builder.flow;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return flow
     */
    public Flow getFlow() {
        return this.flow;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Flow flow; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * 工作流列表
         */
        public Builder flow(Flow flow) {
            this.flow = flow;
            return this;
        }

        /**
         * 页码。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页数量。
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总数。
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFlowResponseBody build() {
            return new ListFlowResponseBody(this);
        } 

    } 

    public static class FlowFlow extends TeaModel {
        @NameInMap("AlertConf")
        private String alertConf;

        @NameInMap("AlertDingDingGroupBizId")
        private String alertDingDingGroupBizId;

        @NameInMap("AlertUserGroupBizId")
        private String alertUserGroupBizId;

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

        @NameInMap("Name")
        private String name;

        @NameInMap("Periodic")
        private Boolean periodic;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartSchedule")
        private Long startSchedule;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private FlowFlow(Builder builder) {
            this.alertConf = builder.alertConf;
            this.alertDingDingGroupBizId = builder.alertDingDingGroupBizId;
            this.alertUserGroupBizId = builder.alertUserGroupBizId;
            this.categoryId = builder.categoryId;
            this.clusterId = builder.clusterId;
            this.createCluster = builder.createCluster;
            this.cronExpr = builder.cronExpr;
            this.description = builder.description;
            this.endSchedule = builder.endSchedule;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.graph = builder.graph;
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.name = builder.name;
            this.periodic = builder.periodic;
            this.projectId = builder.projectId;
            this.startSchedule = builder.startSchedule;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowFlow create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String categoryId; 
            private String clusterId; 
            private Boolean createCluster; 
            private String cronExpr; 
            private String description; 
            private Long endSchedule; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String graph; 
            private String hostName; 
            private String id; 
            private String name; 
            private Boolean periodic; 
            private String projectId; 
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
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

            public FlowFlow build() {
                return new FlowFlow(this);
            } 

        } 

    }
    public static class Flow extends TeaModel {
        @NameInMap("Flow")
        private java.util.List < FlowFlow> flow;

        private Flow(Builder builder) {
            this.flow = builder.flow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flow create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public java.util.List < FlowFlow> getFlow() {
            return this.flow;
        }

        public static final class Builder {
            private java.util.List < FlowFlow> flow; 

            /**
             * 工作流列表
             */
            public Builder flow(java.util.List < FlowFlow> flow) {
                this.flow = flow;
                return this;
            }

            public Flow build() {
                return new Flow(this);
            } 

        } 

    }
}
