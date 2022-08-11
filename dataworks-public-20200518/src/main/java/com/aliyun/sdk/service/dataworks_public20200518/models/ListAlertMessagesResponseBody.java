// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertMessagesResponseBody</p>
 */
public class ListAlertMessagesResponseBody extends TeaModel {
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

    private ListAlertMessagesResponseBody(Builder builder) {
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

    public static ListAlertMessagesResponseBody create() {
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

        public ListAlertMessagesResponseBody build() {
            return new ListAlertMessagesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Status")
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
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

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
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
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
    public static class SlaAlert extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("BaselineName")
        private String baselineName;

        @NameInMap("BaselineOwner")
        private String baselineOwner;

        @NameInMap("Bizdate")
        private Long bizdate;

        @NameInMap("InGroupId")
        private Integer inGroupId;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Status")
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

            /**
             * BaselineOwner.
             */
            public Builder baselineOwner(String baselineOwner) {
                this.baselineOwner = baselineOwner;
                return this;
            }

            /**
             * Bizdate.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * InGroupId.
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("TopicId")
        private Long topicId;

        @NameInMap("TopicName")
        private String topicName;

        @NameInMap("TopicOwner")
        private String topicOwner;

        @NameInMap("TopicStatus")
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
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * TopicOwner.
             */
            public Builder topicOwner(String topicOwner) {
                this.topicOwner = topicOwner;
                return this;
            }

            /**
             * TopicStatus.
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
    public static class AlertMessages extends TeaModel {
        @NameInMap("AlertId")
        private Long alertId;

        @NameInMap("AlertMessageStatus")
        private String alertMessageStatus;

        @NameInMap("AlertMethod")
        private String alertMethod;

        @NameInMap("AlertTime")
        private Long alertTime;

        @NameInMap("AlertUser")
        private String alertUser;

        @NameInMap("Content")
        private String content;

        @NameInMap("Instances")
        private java.util.List < Instances> instances;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("RemindId")
        private Long remindId;

        @NameInMap("RemindName")
        private String remindName;

        @NameInMap("SlaAlert")
        private SlaAlert slaAlert;

        @NameInMap("Source")
        private String source;

        @NameInMap("Topics")
        private java.util.List < Topics> topics;

        private AlertMessages(Builder builder) {
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

        public static AlertMessages create() {
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
             * AlertId.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * AlertMessageStatus.
             */
            public Builder alertMessageStatus(String alertMessageStatus) {
                this.alertMessageStatus = alertMessageStatus;
                return this;
            }

            /**
             * AlertMethod.
             */
            public Builder alertMethod(String alertMethod) {
                this.alertMethod = alertMethod;
                return this;
            }

            /**
             * AlertTime.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * AlertUser.
             */
            public Builder alertUser(String alertUser) {
                this.alertUser = alertUser;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
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
             * SlaAlert.
             */
            public Builder slaAlert(SlaAlert slaAlert) {
                this.slaAlert = slaAlert;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Topics.
             */
            public Builder topics(java.util.List < Topics> topics) {
                this.topics = topics;
                return this;
            }

            public AlertMessages build() {
                return new AlertMessages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlertMessages")
        private java.util.List < AlertMessages> alertMessages;

        @NameInMap("PageNumber")
        private String pageNumber;

        @NameInMap("PageSize")
        private String pageSize;

        @NameInMap("TotalCount")
        private String totalCount;

        private Data(Builder builder) {
            this.alertMessages = builder.alertMessages;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertMessages
         */
        public java.util.List < AlertMessages> getAlertMessages() {
            return this.alertMessages;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AlertMessages> alertMessages; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            /**
             * AlertMessages.
             */
            public Builder alertMessages(java.util.List < AlertMessages> alertMessages) {
                this.alertMessages = alertMessages;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
