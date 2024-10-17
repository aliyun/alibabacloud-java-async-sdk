// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAlertMessageResponseBody build() {
            return new GetAlertMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertMessageResponseBody</p>
     */
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12312312</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

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
             * <p>The ID of the workspace to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>NOT_RUN</li>
             * <li>WAIT_TIME</li>
             * <li>WAIT_RESOURCE</li>
             * <li>RUNNING</li>
             * <li>CHECKING</li>
             * <li>CHECKING_CONDITION</li>
             * <li>FAILURE</li>
             * <li>SUCCESS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOT_RUN</p>
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
    /**
     * 
     * {@link GetAlertMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertMessageResponseBody</p>
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
             * <p>95279527952****</p>
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
     * {@link GetAlertMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertMessageResponseBody</p>
     */
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
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>15142123</p>
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

            /**
             * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>952795279****</p>
             */
            public Builder baselineOwner(String baselineOwner) {
                this.baselineOwner = baselineOwner;
                return this;
            }

            /**
             * <p>The data timestamp of the baseline instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The ID of the cycle of the baseline instance. Valid values of the ID of an hour-level cycle: [1,24]. The ID of a day-level cycle is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the baseline belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the baseline. Valid values:</p>
             * <ul>
             * <li>ERROR</li>
             * <li>SAFE</li>
             * <li>DANGEROUS</li>
             * <li>OVER</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SAFE</p>
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
    /**
     * 
     * {@link GetAlertMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertMessageResponseBody</p>
     */
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
             * <p>The ID of the instance that triggered the event.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the node that triggered the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>412431</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the event owner.</p>
             * 
             * <strong>example:</strong>
             * <p>9527952795****</p>
             */
            public Builder topicOwner(String topicOwner) {
                this.topicOwner = topicOwner;
                return this;
            }

            /**
             * <p>The status of the event. Valid values:</p>
             * <ul>
             * <li>IGNORE</li>
             * <li>NEW</li>
             * <li>FIXING</li>
             * <li>RECOVER</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIXING</p>
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
    /**
     * 
     * {@link GetAlertMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertMessageResponseBody</p>
     */
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
             * <p>The alert ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The sending status of the notification. Valid values:</p>
             * <ul>
             * <li>READY_TO_SEND: The notification is waiting to be sent.</li>
             * <li>SEND_FAIL: The notification fails to be sent.</li>
             * <li>SEND_SUCCESS: The notification is sent.</li>
             * <li>SEND_OVERLIMIT: The number of notifications that are sent exceeds the upper limit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>READY_TO_SEND</p>
             */
            public Builder alertMessageStatus(String alertMessageStatus) {
                this.alertMessageStatus = alertMessageStatus;
                return this;
            }

            /**
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li>MAIL.</li>
             * <li>SMS.</li>
             * <li>PHONE. Only DataWorks Professional Edition and more advanced editions support the PHONE notification method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SMS</p>
             */
            public Builder alertMethod(String alertMethod) {
                this.alertMethod = alertMethod;
                return this;
            }

            /**
             * <p>The time when the alert was reported.</p>
             * 
             * <strong>example:</strong>
             * <p>1553524393000</p>
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>9527952795****</p>
             */
            public Builder alertUser(String alertUser) {
                this.alertUser = alertUser;
                return this;
            }

            /**
             * <p>The content of the alert.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The instances that triggered the custom alert rule. This parameter is returned if the value of the Source parameter is REMIND_ALERT. This parameter is left empty if the value of the Source parameter is not REMIND_ALERT.</p>
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The nodes returned for different alert sources. The nodes that form a loop are returned if the value of the Source parameter is NODE_CYCLE_ALERT. The nodes that are isolated are returned if the value of the Source parameter is NODE_LONELY_ALERT.</p>
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The ID of the custom alert rule that was triggered. This parameter is returned if the value of the Source parameter is REMIND_ALERT.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * <p>The name of the custom alert rule that was triggered. This parameter is returned if the value of the Source parameter is REMIND_ALERT.</p>
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * <p>The basic information about the baseline instance that triggered an alert. This parameter is returned if the value of the Source parameter is SLA_ALERT. This parameter is left empty if the value of the Source parameter is not SLA_ALERT.</p>
             */
            public Builder slaAlert(SlaAlert slaAlert) {
                this.slaAlert = slaAlert;
                return this;
            }

            /**
             * <p>The type of the alert. Valid values:</p>
             * <ul>
             * <li>REMIND_ALERT: The alert is a custom alert.</li>
             * <li>TOPIC_ALERT: The alert is an event alert.</li>
             * <li>SLA_ALERT: The alert is a baseline alert.</li>
             * <li>NODE_CYCLE_ALERT: The alert is reported for a node dependency loop.</li>
             * <li>NODE_LONELY_ALERT: The alert is reported for isolated nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REMIND_ALERT</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The events that triggered alerts. This parameter is returned if the value of the Source parameter is TOPIC_ALERT. This parameter is left empty if the value of the Source parameter is not TOPIC_ALERT.</p>
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
