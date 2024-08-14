// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertMessageResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlertMessageResponseBody</p>
 */
public class GetAlertMessageResponseBody extends TeaModel {
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

    private GetAlertMessageResponseBody(Builder builder) {
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

    public static GetAlertMessageResponseBody create() {
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
         * The details of the returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAlertMessageResponseBody build() {
            return new GetAlertMessageResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
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
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long instanceId; 
            private Long nodeId; 
            private String nodeName; 
            private Long projectId; 
            private String status; 

            /**
             * The instance ID.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the workspace to which the node belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   NOT_RUN
             * *   WAIT_TIME
             * *   WAIT_RESOURCE
             * *   RUNNING
             * *   CHECKING
             * *   CHECKING_CONDITION
             * *   FAILURE
             * *   SUCCESS
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
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
             * The node ID.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the node owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the workspace to which the node belongs.
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
    public static class SlaAlert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("BaselineOwner")
        private String baselineOwner;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("InGroupId")
        private Integer inGroupId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SlaAlert(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.baselineOwner = builder.baselineOwner;
            this.bizdate = builder.bizdate;
            this.inGroupId = builder.inGroupId;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaAlert create() {
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

        /**
         * @return baselineOwner
         */
        public String getBaselineOwner() {
            return this.baselineOwner;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return inGroupId
         */
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long baselineId; 
            private String baselineName; 
            private String baselineOwner; 
            private Long bizdate; 
            private Integer inGroupId; 
            private Long projectId; 
            private String status; 

            /**
             * The baseline ID.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).
             */
            public Builder baselineOwner(String baselineOwner) {
                this.baselineOwner = baselineOwner;
                return this;
            }

            /**
             * The data timestamp of the baseline instance.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * The ID of the cycle of the baseline instance. Valid values of the ID of an hour-level cycle: \[1,24]. The ID of a day-level cycle is 1.
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * The ID of the workspace to which the baseline belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The status of the baseline. Valid values:
             * <p>
             * 
             * *   ERROR
             * *   SAFE
             * *   DANGEROUS
             * *   OVER
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SlaAlert build() {
                return new SlaAlert(this);
            } 

        } 

    }
    public static class Topics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TopicOwner")
        private String topicOwner;

        @com.aliyun.core.annotation.NameInMap("TopicStatus")
        private String topicStatus;

        private Topics(Builder builder) {
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
            this.topicOwner = builder.topicOwner;
            this.topicStatus = builder.topicStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topics create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return topicOwner
         */
        public String getTopicOwner() {
            return this.topicOwner;
        }

        /**
         * @return topicStatus
         */
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public static final class Builder {
            private Long instanceId; 
            private Long nodeId; 
            private Long topicId; 
            private String topicName; 
            private String topicOwner; 
            private String topicStatus; 

            /**
             * The ID of the instance that triggered the event.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the node that triggered the event.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * The name of the event.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the event owner.
             */
            public Builder topicOwner(String topicOwner) {
                this.topicOwner = topicOwner;
                return this;
            }

            /**
             * The status of the event. Valid values:
             * <p>
             * 
             * *   IGNORE
             * *   NEW
             * *   FIXING
             * *   RECOVER
             */
            public Builder topicStatus(String topicStatus) {
                this.topicStatus = topicStatus;
                return this;
            }

            public Topics build() {
                return new Topics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("AlertMessageStatus")
        private String alertMessageStatus;

        @com.aliyun.core.annotation.NameInMap("AlertMethod")
        private String alertMethod;

        @com.aliyun.core.annotation.NameInMap("AlertTime")
        private Long alertTime;

        @com.aliyun.core.annotation.NameInMap("AlertUser")
        private String alertUser;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < Instances> instances;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("RemindId")
        private Long remindId;

        @com.aliyun.core.annotation.NameInMap("RemindName")
        private String remindName;

        @com.aliyun.core.annotation.NameInMap("SlaAlert")
        private SlaAlert slaAlert;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Topics")
        private java.util.List < Topics> topics;

        private Data(Builder builder) {
            this.alertId = builder.alertId;
            this.alertMessageStatus = builder.alertMessageStatus;
            this.alertMethod = builder.alertMethod;
            this.alertTime = builder.alertTime;
            this.alertUser = builder.alertUser;
            this.content = builder.content;
            this.instances = builder.instances;
            this.nodes = builder.nodes;
            this.remindId = builder.remindId;
            this.remindName = builder.remindName;
            this.slaAlert = builder.slaAlert;
            this.source = builder.source;
            this.topics = builder.topics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertMessageStatus
         */
        public String getAlertMessageStatus() {
            return this.alertMessageStatus;
        }

        /**
         * @return alertMethod
         */
        public String getAlertMethod() {
            return this.alertMethod;
        }

        /**
         * @return alertTime
         */
        public Long getAlertTime() {
            return this.alertTime;
        }

        /**
         * @return alertUser
         */
        public String getAlertUser() {
            return this.alertUser;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return instances
         */
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
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
         * @return slaAlert
         */
        public SlaAlert getSlaAlert() {
            return this.slaAlert;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return topics
         */
        public java.util.List < Topics> getTopics() {
            return this.topics;
        }

        public static final class Builder {
            private Long alertId; 
            private String alertMessageStatus; 
            private String alertMethod; 
            private Long alertTime; 
            private String alertUser; 
            private String content; 
            private java.util.List < Instances> instances; 
            private java.util.List < Nodes> nodes; 
            private Long remindId; 
            private String remindName; 
            private SlaAlert slaAlert; 
            private String source; 
            private java.util.List < Topics> topics; 

            /**
             * The alert ID.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * The sending status of the notification. Valid values:
             * <p>
             * 
             * *   READY_TO_SEND: The notification is waiting to be sent.
             * *   SEND_FAIL: The notification fails to be sent.
             * *   SEND_SUCCESS: The notification is sent.
             * *   SEND_OVERLIMIT: The number of notifications that are sent exceeds the upper limit.
             */
            public Builder alertMessageStatus(String alertMessageStatus) {
                this.alertMessageStatus = alertMessageStatus;
                return this;
            }

            /**
             * The notification method. Valid values:
             * <p>
             * 
             * *   MAIL.
             * *   SMS.
             * *   PHONE. Only DataWorks Professional Edition and more advanced editions support the PHONE notification method.
             */
            public Builder alertMethod(String alertMethod) {
                this.alertMethod = alertMethod;
                return this;
            }

            /**
             * The time when the alert was reported.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the alert recipient.
             */
            public Builder alertUser(String alertUser) {
                this.alertUser = alertUser;
                return this;
            }

            /**
             * The content of the alert.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The instances that triggered the custom alert rule. This parameter is returned if the value of the Source parameter is REMIND_ALERT. This parameter is left empty if the value of the Source parameter is not REMIND_ALERT.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The nodes returned for different alert sources. The nodes that form a loop are returned if the value of the Source parameter is NODE_CYCLE_ALERT. The nodes that are isolated are returned if the value of the Source parameter is NODE_LONELY_ALERT.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * The ID of the custom alert rule that was triggered. This parameter is returned if the value of the Source parameter is REMIND_ALERT.
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * The name of the custom alert rule that was triggered. This parameter is returned if the value of the Source parameter is REMIND_ALERT.
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * The basic information about the baseline instance that triggered an alert. This parameter is returned if the value of the Source parameter is SLA_ALERT. This parameter is left empty if the value of the Source parameter is not SLA_ALERT.
             */
            public Builder slaAlert(SlaAlert slaAlert) {
                this.slaAlert = slaAlert;
                return this;
            }

            /**
             * The type of the alert. Valid values:
             * <p>
             * 
             * *   REMIND_ALERT: The alert is a custom alert.
             * *   TOPIC_ALERT: The alert is an event alert.
             * *   SLA_ALERT: The alert is a baseline alert.
             * *   NODE_CYCLE_ALERT: The alert is reported for a node dependency loop.
             * *   NODE_LONELY_ALERT: The alert is reported for isolated nodes.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The events that triggered alerts. This parameter is returned if the value of the Source parameter is TOPIC_ALERT. This parameter is left empty if the value of the Source parameter is not TOPIC_ALERT.
             */
            public Builder topics(java.util.List < Topics> topics) {
                this.topics = topics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
