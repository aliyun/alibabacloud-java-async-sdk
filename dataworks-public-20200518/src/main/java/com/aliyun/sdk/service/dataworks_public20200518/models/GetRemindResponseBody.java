// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRemindResponseBody} extends {@link TeaModel}
 *
 * <p>GetRemindResponseBody</p>
 */
public class GetRemindResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The details of the custom alert rule.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFGH-IJKLMNOPQ</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRemindResponseBody build() {
            return new GetRemindResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class Baselines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
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
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
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
    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class BizProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private Long bizId;

        @com.aliyun.core.annotation.NameInMap("BizProcessName")
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
             * <p>The ID of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>9527</p>
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The name of the workflow.</p>
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
    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
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
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>9527951795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
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
    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectId")
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
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
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
    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTargets")
        private java.util.List < String > alertTargets;

        @com.aliyun.core.annotation.NameInMap("AlertUnit")
        private String alertUnit;

        private Receivers(Builder builder) {
            this.alertTargets = builder.alertTargets;
            this.alertUnit = builder.alertUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receivers create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List < String > alertTargets; 
            private String alertUnit; 

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

            public Receivers build() {
                return new Receivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class Robots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtAll")
        private Boolean atAll;

        @com.aliyun.core.annotation.NameInMap("WebUrl")
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
             * <p>Indicates whether all group members are notified when the alert notification is sent to a DingTalk group. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder atAll(Boolean atAll) {
                this.atAll = atAll;
                return this;
            }

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
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
    /**
     * 
     * {@link GetRemindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemindResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInterval")
        private Integer alertInterval;

        @com.aliyun.core.annotation.NameInMap("AlertMethods")
        private java.util.List < String > alertMethods;

        @com.aliyun.core.annotation.NameInMap("AlertTargets")
        private java.util.List < String > alertTargets;

        @com.aliyun.core.annotation.NameInMap("AlertUnit")
        private String alertUnit;

        @com.aliyun.core.annotation.NameInMap("AllowNodes")
        private java.util.List < Long > allowNodes;

        @com.aliyun.core.annotation.NameInMap("Baselines")
        private java.util.List < Baselines> baselines;

        @com.aliyun.core.annotation.NameInMap("BizProcesses")
        private java.util.List < BizProcesses> bizProcesses;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("DndEnd")
        private String dndEnd;

        @com.aliyun.core.annotation.NameInMap("DndStart")
        private String dndStart;

        @com.aliyun.core.annotation.NameInMap("Founder")
        private String founder;

        @com.aliyun.core.annotation.NameInMap("MaxAlertTimes")
        private Integer maxAlertTimes;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List < Projects> projects;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        private java.util.List < Receivers> receivers;

        @com.aliyun.core.annotation.NameInMap("RemindId")
        private Long remindId;

        @com.aliyun.core.annotation.NameInMap("RemindName")
        private String remindName;

        @com.aliyun.core.annotation.NameInMap("RemindType")
        private String remindType;

        @com.aliyun.core.annotation.NameInMap("RemindUnit")
        private String remindUnit;

        @com.aliyun.core.annotation.NameInMap("Robots")
        private java.util.List < Robots> robots;

        @com.aliyun.core.annotation.NameInMap("Useflag")
        private Boolean useflag;

        @com.aliyun.core.annotation.NameInMap("Webhooks")
        private java.util.List < String > webhooks;

        private Data(Builder builder) {
            this.alertInterval = builder.alertInterval;
            this.alertMethods = builder.alertMethods;
            this.alertTargets = builder.alertTargets;
            this.alertUnit = builder.alertUnit;
            this.allowNodes = builder.allowNodes;
            this.baselines = builder.baselines;
            this.bizProcesses = builder.bizProcesses;
            this.detail = builder.detail;
            this.dndEnd = builder.dndEnd;
            this.dndStart = builder.dndStart;
            this.founder = builder.founder;
            this.maxAlertTimes = builder.maxAlertTimes;
            this.nodes = builder.nodes;
            this.projects = builder.projects;
            this.receivers = builder.receivers;
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
         * @return allowNodes
         */
        public java.util.List < Long > getAllowNodes() {
            return this.allowNodes;
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
         * @return receivers
         */
        public java.util.List < Receivers> getReceivers() {
            return this.receivers;
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
            private java.util.List < Long > allowNodes; 
            private java.util.List < Baselines> baselines; 
            private java.util.List < BizProcesses> bizProcesses; 
            private String detail; 
            private String dndEnd; 
            private String dndStart; 
            private String founder; 
            private Integer maxAlertTimes; 
            private java.util.List < Nodes> nodes; 
            private java.util.List < Projects> projects; 
            private java.util.List < Receivers> receivers; 
            private Long remindId; 
            private String remindName; 
            private String remindType; 
            private String remindUnit; 
            private java.util.List < Robots> robots; 
            private Boolean useflag; 
            private java.util.List < String > webhooks; 

            /**
             * <p>The minimum interval at which alerts are reported. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder alertInterval(Integer alertInterval) {
                this.alertInterval = alertInterval;
                return this;
            }

            /**
             * <p>The alert notification method.</p>
             */
            public Builder alertMethods(java.util.List < String > alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * <p>The description of the alert recipient.</p>
             */
            public Builder alertTargets(java.util.List < String > alertTargets) {
                this.alertTargets = alertTargets;
                return this;
            }

            /**
             * <p>The recipient of the alert. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.</p>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder alertUnit(String alertUnit) {
                this.alertUnit = alertUnit;
                return this;
            }

            /**
             * AllowNodes.
             */
            public Builder allowNodes(java.util.List < Long > allowNodes) {
                this.allowNodes = allowNodes;
                return this;
            }

            /**
             * <p>The baselines to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BASELINE.</p>
             */
            public Builder baselines(java.util.List < Baselines> baselines) {
                this.baselines = baselines;
                return this;
            }

            /**
             * <p>The workflows to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BIZPROCESS.</p>
             */
            public Builder bizProcesses(java.util.List < BizProcesses> bizProcesses) {
                this.bizProcesses = bizProcesses;
                return this;
            }

            /**
             * <ul>
             * <li>If the value of the RemindType parameter is FINISHED, this parameter is left empty.</li>
             * <li>If the value of the RemindType parameter is UNFINISHED, the trigger conditions are returned as key-value pairs. Example: {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47]. Valid values of minu: [0,59].</li>
             * <li>If the value of the RemindType parameter is ERROR, this parameter is left empty.</li>
             * <li>If the value of the RemindType parameter is CYCLE_UNFINISHED, the trigger conditions are returned as key-value pairs. Example: {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}. The key indicates the ID of the cycle. Valid values: [1,288]. The value indicates the timeout period of the node that is running in the cycle. Specify the value in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</li>
             * <li>If the value of the RemindType parameter is TIMEOUT, the timeout period is returned. Unit: seconds. Example: 1800. This value indicates that an alert is reported if the node has run for more than 30 minutes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;hour&quot;:23,&quot;minu&quot;:59}</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The end time of the quiet hours. The value is in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder dndEnd(String dndEnd) {
                this.dndEnd = dndEnd;
                return this;
            }

            /**
             * <p>The start time of the quiet hours. The value is in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder dndStart(String dndStart) {
                this.dndStart = dndStart;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the creator of the custom alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>9527951795****</p>
             */
            public Builder founder(String founder) {
                this.founder = founder;
                return this;
            }

            /**
             * <p>The maximum number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxAlertTimes(Integer maxAlertTimes) {
                this.maxAlertTimes = maxAlertTimes;
                return this;
            }

            /**
             * <p>The nodes to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is NODE.</p>
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The workspaces to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is PROJECT.</p>
             */
            public Builder projects(java.util.List < Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * Receivers.
             */
            public Builder receivers(java.util.List < Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            /**
             * <p>The custom alert rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * <p>The conditions that trigger an alert. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder remindType(String remindType) {
                this.remindType = remindType;
                return this;
            }

            /**
             * <p>The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates a node. The value BASELINE indicates a baseline. The value PROJECT indicates a workspace. The value BIZPROCESS indicates a workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>NODE</p>
             */
            public Builder remindUnit(String remindUnit) {
                this.remindUnit = remindUnit;
                return this;
            }

            /**
             * <p>The webhook URLs of the DingTalk chatbots.</p>
             */
            public Builder robots(java.util.List < Robots> robots) {
                this.robots = robots;
                return this;
            }

            /**
             * <p>Indicates whether the custom alert rule is enabled. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useflag(Boolean useflag) {
                this.useflag = useflag;
                return this;
            }

            /**
             * <p>The information about the webhook URL.</p>
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
