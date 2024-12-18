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

        /**
         * Count.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * QosList.
         */
        public Builder qosList(java.util.List<QosList> qosList) {
            this.qosList = qosList;
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
         * TotalCount.
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

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceProgressing.
             */
            public Builder instanceProgressing(Integer instanceProgressing) {
                this.instanceProgressing = instanceProgressing;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InstanceType.
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

            /**
             * BandwidthPercent.
             */
            public Builder bandwidthPercent(String bandwidthPercent) {
                this.bandwidthPercent = bandwidthPercent;
                return this;
            }

            /**
             * QosId.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * QueueDescription.
             */
            public Builder queueDescription(String queueDescription) {
                this.queueDescription = queueDescription;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * QueueType.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * Status.
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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

            /**
             * AssociatedInstanceList.
             */
            public Builder associatedInstanceList(java.util.List<AssociatedInstanceList> associatedInstanceList) {
                this.associatedInstanceList = associatedInstanceList;
                return this;
            }

            /**
             * Progressing.
             */
            public Builder progressing(Integer progressing) {
                this.progressing = progressing;
                return this;
            }

            /**
             * QosDescription.
             */
            public Builder qosDescription(String qosDescription) {
                this.qosDescription = qosDescription;
                return this;
            }

            /**
             * QosId.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * QosName.
             */
            public Builder qosName(String qosName) {
                this.qosName = qosName;
                return this;
            }

            /**
             * QueueList.
             */
            public Builder queueList(java.util.List<QueueList> queueList) {
                this.queueList = queueList;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * Tags.
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
