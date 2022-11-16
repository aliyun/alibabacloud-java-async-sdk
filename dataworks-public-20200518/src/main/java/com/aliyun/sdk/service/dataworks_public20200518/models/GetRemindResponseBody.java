// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRemindResponseBody} extends {@link TeaModel}
 *
 * <p>GetRemindResponseBody</p>
 */
public class GetRemindResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetRemindResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRemindResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRemindResponseBody build() {
            return new GetRemindResponseBody(this);
        } 

    } 

    public static class Baselines extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("BaselineName")
        private String baselineName;

        private Baselines(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Baselines create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        public static final class Builder {
            private Long baselineId; 
            private String baselineName; 

            /**
             * BaselineId.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * BaselineName.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            public Baselines build() {
                return new Baselines(this);
            } 

        } 

    }
    public static class BizProcesses extends TeaModel {
        @NameInMap("BizId")
        private Long bizId;

        @NameInMap("BizProcessName")
        private String bizProcessName;

        private BizProcesses(Builder builder) {
            this.bizId = builder.bizId;
            this.bizProcessName = builder.bizProcessName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizProcesses create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public Long getBizId() {
            return this.bizId;
        }

        /**
         * @return bizProcessName
         */
        public String getBizProcessName() {
            return this.bizProcessName;
        }

        public static final class Builder {
            private Long bizId; 
            private String bizProcessName; 

            /**
             * BizId.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizProcessName.
             */
            public Builder bizProcessName(String bizProcessName) {
                this.bizProcessName = bizProcessName;
                return this;
            }

            public BizProcesses build() {
                return new BizProcesses(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProjectId")
        private Long projectId;

        private Nodes(Builder builder) {
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Long projectId; 

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Projects extends TeaModel {
        @NameInMap("ProjectId")
        private Long projectId;

        private Projects(Builder builder) {
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long projectId; 

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    public static class Robots extends TeaModel {
        @NameInMap("AtAll")
        private Boolean atAll;

        @NameInMap("WebUrl")
        private String webUrl;

        private Robots(Builder builder) {
            this.atAll = builder.atAll;
            this.webUrl = builder.webUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Robots create() {
            return builder().build();
        }

        /**
         * @return atAll
         */
        public Boolean getAtAll() {
            return this.atAll;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Boolean atAll; 
            private String webUrl; 

            /**
             * AtAll.
             */
            public Builder atAll(Boolean atAll) {
                this.atAll = atAll;
                return this;
            }

            /**
             * WebUrl.
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            public Robots build() {
                return new Robots(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlertInterval")
        private Integer alertInterval;

        @NameInMap("AlertMethods")
        private java.util.List < String > alertMethods;

        @NameInMap("AlertTargets")
        private java.util.List < String > alertTargets;

        @NameInMap("AlertUnit")
        private String alertUnit;

        @NameInMap("Baselines")
        private java.util.List < Baselines> baselines;

        @NameInMap("BizProcesses")
        private java.util.List < BizProcesses> bizProcesses;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("DndEnd")
        private String dndEnd;

        @NameInMap("DndStart")
        private String dndStart;

        @NameInMap("Founder")
        private String founder;

        @NameInMap("MaxAlertTimes")
        private Integer maxAlertTimes;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("Projects")
        private java.util.List < Projects> projects;

        @NameInMap("RemindId")
        private Long remindId;

        @NameInMap("RemindName")
        private String remindName;

        @NameInMap("RemindType")
        private String remindType;

        @NameInMap("RemindUnit")
        private String remindUnit;

        @NameInMap("Robots")
        private java.util.List < Robots> robots;

        @NameInMap("Useflag")
        private Boolean useflag;

        @NameInMap("Webhooks")
        private java.util.List < String > webhooks;

        private Data(Builder builder) {
            this.alertInterval = builder.alertInterval;
            this.alertMethods = builder.alertMethods;
            this.alertTargets = builder.alertTargets;
            this.alertUnit = builder.alertUnit;
            this.baselines = builder.baselines;
            this.bizProcesses = builder.bizProcesses;
            this.detail = builder.detail;
            this.dndEnd = builder.dndEnd;
            this.dndStart = builder.dndStart;
            this.founder = builder.founder;
            this.maxAlertTimes = builder.maxAlertTimes;
            this.nodes = builder.nodes;
            this.projects = builder.projects;
            this.remindId = builder.remindId;
            this.remindName = builder.remindName;
            this.remindType = builder.remindType;
            this.remindUnit = builder.remindUnit;
            this.robots = builder.robots;
            this.useflag = builder.useflag;
            this.webhooks = builder.webhooks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertInterval
         */
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        /**
         * @return alertMethods
         */
        public java.util.List < String > getAlertMethods() {
            return this.alertMethods;
        }

        /**
         * @return alertTargets
         */
        public java.util.List < String > getAlertTargets() {
            return this.alertTargets;
        }

        /**
         * @return alertUnit
         */
        public String getAlertUnit() {
            return this.alertUnit;
        }

        /**
         * @return baselines
         */
        public java.util.List < Baselines> getBaselines() {
            return this.baselines;
        }

        /**
         * @return bizProcesses
         */
        public java.util.List < BizProcesses> getBizProcesses() {
            return this.bizProcesses;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return dndEnd
         */
        public String getDndEnd() {
            return this.dndEnd;
        }

        /**
         * @return dndStart
         */
        public String getDndStart() {
            return this.dndStart;
        }

        /**
         * @return founder
         */
        public String getFounder() {
            return this.founder;
        }

        /**
         * @return maxAlertTimes
         */
        public Integer getMaxAlertTimes() {
            return this.maxAlertTimes;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return projects
         */
        public java.util.List < Projects> getProjects() {
            return this.projects;
        }

        /**
         * @return remindId
         */
        public Long getRemindId() {
            return this.remindId;
        }

        /**
         * @return remindName
         */
        public String getRemindName() {
            return this.remindName;
        }

        /**
         * @return remindType
         */
        public String getRemindType() {
            return this.remindType;
        }

        /**
         * @return remindUnit
         */
        public String getRemindUnit() {
            return this.remindUnit;
        }

        /**
         * @return robots
         */
        public java.util.List < Robots> getRobots() {
            return this.robots;
        }

        /**
         * @return useflag
         */
        public Boolean getUseflag() {
            return this.useflag;
        }

        /**
         * @return webhooks
         */
        public java.util.List < String > getWebhooks() {
            return this.webhooks;
        }

        public static final class Builder {
            private Integer alertInterval; 
            private java.util.List < String > alertMethods; 
            private java.util.List < String > alertTargets; 
            private String alertUnit; 
            private java.util.List < Baselines> baselines; 
            private java.util.List < BizProcesses> bizProcesses; 
            private String detail; 
            private String dndEnd; 
            private String dndStart; 
            private String founder; 
            private Integer maxAlertTimes; 
            private java.util.List < Nodes> nodes; 
            private java.util.List < Projects> projects; 
            private Long remindId; 
            private String remindName; 
            private String remindType; 
            private String remindUnit; 
            private java.util.List < Robots> robots; 
            private Boolean useflag; 
            private java.util.List < String > webhooks; 

            /**
             * AlertInterval.
             */
            public Builder alertInterval(Integer alertInterval) {
                this.alertInterval = alertInterval;
                return this;
            }

            /**
             * AlertMethods.
             */
            public Builder alertMethods(java.util.List < String > alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * AlertTargets.
             */
            public Builder alertTargets(java.util.List < String > alertTargets) {
                this.alertTargets = alertTargets;
                return this;
            }

            /**
             * AlertUnit.
             */
            public Builder alertUnit(String alertUnit) {
                this.alertUnit = alertUnit;
                return this;
            }

            /**
             * Baselines.
             */
            public Builder baselines(java.util.List < Baselines> baselines) {
                this.baselines = baselines;
                return this;
            }

            /**
             * BizProcesses.
             */
            public Builder bizProcesses(java.util.List < BizProcesses> bizProcesses) {
                this.bizProcesses = bizProcesses;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DndEnd.
             */
            public Builder dndEnd(String dndEnd) {
                this.dndEnd = dndEnd;
                return this;
            }

            /**
             * DndStart.
             */
            public Builder dndStart(String dndStart) {
                this.dndStart = dndStart;
                return this;
            }

            /**
             * Founder.
             */
            public Builder founder(String founder) {
                this.founder = founder;
                return this;
            }

            /**
             * MaxAlertTimes.
             */
            public Builder maxAlertTimes(Integer maxAlertTimes) {
                this.maxAlertTimes = maxAlertTimes;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Projects.
             */
            public Builder projects(java.util.List < Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * RemindId.
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * RemindName.
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * RemindType.
             */
            public Builder remindType(String remindType) {
                this.remindType = remindType;
                return this;
            }

            /**
             * RemindUnit.
             */
            public Builder remindUnit(String remindUnit) {
                this.remindUnit = remindUnit;
                return this;
            }

            /**
             * Robots.
             */
            public Builder robots(java.util.List < Robots> robots) {
                this.robots = robots;
                return this;
            }

            /**
             * Useflag.
             */
            public Builder useflag(Boolean useflag) {
                this.useflag = useflag;
                return this;
            }

            /**
             * Webhooks.
             */
            public Builder webhooks(java.util.List < String > webhooks) {
                this.webhooks = webhooks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
