// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectTrafficQosResponseBody</p>
 */
public class DescribeExpressConnectTrafficQosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QosList")
    private java.util.List<QosList> qosList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeExpressConnectTrafficQosResponseBody(Builder builder) {
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.qosList = builder.qosList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectTrafficQosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return qosList
     */
    public java.util.List<QosList> getQosList() {
        return this.qosList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String count; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QosList> qosList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeExpressConnectTrafficQosResponseBody model) {
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.qosList = model.qosList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about QoS policies.</p>
         */
        public Builder qosList(java.util.List<QosList> qosList) {
            this.qosList = qosList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4CF20CC7-D1FC-425B-A15B-DF7C8E2131A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExpressConnectTrafficQosResponseBody build() {
            return new DescribeExpressConnectTrafficQosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosResponseBody</p>
     */
    public static class AssociatedInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceProgressing")
        private Integer instanceProgressing;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private AssociatedInstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceProgressing = builder.instanceProgressing;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedInstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceProgressing
         */
        public Integer getInstanceProgressing() {
            return this.instanceProgressing;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceId; 
            private Integer instanceProgressing; 
            private String instanceStatus; 
            private String instanceType; 

            private Builder() {
            } 

            private Builder(AssociatedInstanceList model) {
                this.instanceId = model.instanceId;
                this.instanceProgressing = model.instanceProgressing;
                this.instanceStatus = model.instanceStatus;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The ID of the instance to which the QoS policy is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp159zj8zujwy3p07j83e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The configuration progress of the instance to which the QoS policy is associated. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder instanceProgressing(Integer instanceProgressing) {
                this.instanceProgressing = instanceProgressing;
                return this;
            }

            /**
             * <p>The state of the instance to which the QoS policy is associated. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is available.</li>
             * <li><strong>Configuring</strong>: The instance is being configured.</li>
             * <li><strong>Deleting</strong>: The instance is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The type of the instance to which the QoS policy is associated. Only <strong>PHYSICALCONNECTION</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICALCONNECTION</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public AssociatedInstanceList build() {
                return new AssociatedInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosResponseBody</p>
     */
    public static class QueueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPercent")
        private String bandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        @com.aliyun.core.annotation.NameInMap("QueueDescription")
        private String queueDescription;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private String queueId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("QueueType")
        private String queueType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QueueList(Builder builder) {
            this.bandwidthPercent = builder.bandwidthPercent;
            this.qosId = builder.qosId;
            this.queueDescription = builder.queueDescription;
            this.queueId = builder.queueId;
            this.queueName = builder.queueName;
            this.queueType = builder.queueType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueList create() {
            return builder().build();
        }

        /**
         * @return bandwidthPercent
         */
        public String getBandwidthPercent() {
            return this.bandwidthPercent;
        }

        /**
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
        }

        /**
         * @return queueDescription
         */
        public String getQueueDescription() {
            return this.queueDescription;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bandwidthPercent; 
            private String qosId; 
            private String queueDescription; 
            private String queueId; 
            private String queueName; 
            private String queueType; 
            private String status; 

            private Builder() {
            } 

            private Builder(QueueList model) {
                this.bandwidthPercent = model.bandwidthPercent;
                this.qosId = model.qosId;
                this.queueDescription = model.queueDescription;
                this.queueId = model.queueId;
                this.queueName = model.queueName;
                this.queueType = model.queueType;
                this.status = model.status;
            } 

            /**
             * <p>The percentage of bandwidth allocated to a QoS queue.</p>
             * <ul>
             * <li>If QueueType is set to <strong>Medium</strong>, this parameter is required. Valid values: <strong>1</strong> to <strong>100</strong>.</li>
             * <li>If QueueType is set to <strong>Default</strong>, a value of - is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidthPercent(String bandwidthPercent) {
                this.bandwidthPercent = bandwidthPercent;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-pksbqfmotl5hzqmhf8</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The description of the QoS queue.</p>
             * <p>The description can be up to <strong>256</strong> characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-test</p>
             */
            public Builder queueDescription(String queueDescription) {
                this.queueDescription = queueDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>The name of the QoS queue.</p>
             * <p>The name can be up to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-test</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The type of the QoS queue. Valid values:</p>
             * <ul>
             * <li><strong>High</strong>: high-priority queue.</li>
             * <li><strong>Medium</strong>: standard queue.</li>
             * <li><strong>Default</strong>: default queue.</li>
             * </ul>
             * <blockquote>
             * <p>You cannot create a default queue.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * <p>The state of the QoS queue. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The QoS queue is available.</li>
             * <li><strong>Configuring</strong>: The QoS queue is being configured.</li>
             * <li><strong>Deleting</strong>: The QoS queue is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueueList build() {
                return new QueueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosResponseBody</p>
     */
    public static class QosList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedInstanceList")
        private java.util.List<AssociatedInstanceList> associatedInstanceList;

        @com.aliyun.core.annotation.NameInMap("Progressing")
        private Integer progressing;

        @com.aliyun.core.annotation.NameInMap("QosDescription")
        private String qosDescription;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        @com.aliyun.core.annotation.NameInMap("QosName")
        private String qosName;

        @com.aliyun.core.annotation.NameInMap("QueueList")
        private java.util.List<QueueList> queueList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private QosList(Builder builder) {
            this.associatedInstanceList = builder.associatedInstanceList;
            this.progressing = builder.progressing;
            this.qosDescription = builder.qosDescription;
            this.qosId = builder.qosId;
            this.qosName = builder.qosName;
            this.queueList = builder.queueList;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosList create() {
            return builder().build();
        }

        /**
         * @return associatedInstanceList
         */
        public java.util.List<AssociatedInstanceList> getAssociatedInstanceList() {
            return this.associatedInstanceList;
        }

        /**
         * @return progressing
         */
        public Integer getProgressing() {
            return this.progressing;
        }

        /**
         * @return qosDescription
         */
        public String getQosDescription() {
            return this.qosDescription;
        }

        /**
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
        }

        /**
         * @return qosName
         */
        public String getQosName() {
            return this.qosName;
        }

        /**
         * @return queueList
         */
        public java.util.List<QueueList> getQueueList() {
            return this.queueList;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<AssociatedInstanceList> associatedInstanceList; 
            private Integer progressing; 
            private String qosDescription; 
            private String qosId; 
            private String qosName; 
            private java.util.List<QueueList> queueList; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(QosList model) {
                this.associatedInstanceList = model.associatedInstanceList;
                this.progressing = model.progressing;
                this.qosDescription = model.qosDescription;
                this.qosId = model.qosId;
                this.qosName = model.qosName;
                this.queueList = model.queueList;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The information about the instances to which the QoS policy is associated.</p>
             */
            public Builder associatedInstanceList(java.util.List<AssociatedInstanceList> associatedInstanceList) {
                this.associatedInstanceList = associatedInstanceList;
                return this;
            }

            /**
             * <p>The configuration progress of the QoS policy. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progressing(Integer progressing) {
                this.progressing = progressing;
                return this;
            }

            /**
             * <p>The description of the QoS policy.</p>
             * <p>The description can be up to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-test</p>
             */
            public Builder qosDescription(String qosDescription) {
                this.qosDescription = qosDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-pksbqfmotl5hzq****</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The name of the QoS policy.</p>
             * <p>The name can be up to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-test</p>
             */
            public Builder qosName(String qosName) {
                this.qosName = qosName;
                return this;
            }

            /**
             * <p>The information about the QoS queues.</p>
             */
            public Builder queueList(java.util.List<QueueList> queueList) {
                this.queueList = queueList;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmz7vtyl4f***</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The state of the QoS policy. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The QoS policy is available.</li>
             * <li><strong>Configuring</strong>: The QoS policy is being configured.</li>
             * </ul>
             * <blockquote>
             * <p>If a QoS policy is in the Configuring state, you cannot perform most of the operations to create, update, or delete QoS policies, QoS queues, or QoS rules.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public QosList build() {
                return new QosList(this);
            } 

        } 

    }
}
