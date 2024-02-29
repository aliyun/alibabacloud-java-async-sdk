// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectTrafficQosResponseBody</p>
 */
public class DescribeExpressConnectTrafficQosResponseBody extends TeaModel {
    @NameInMap("Count")
    private String count;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("QosList")
    private java.util.List < QosList> qosList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < QosList> getQosList() {
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
        private java.util.List < QosList> qosList; 
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
        public Builder qosList(java.util.List < QosList> qosList) {
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

    public static class AssociatedInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceProgressing")
        private Integer instanceProgressing;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
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
    public static class QueueList extends TeaModel {
        @NameInMap("BandwidthPercent")
        private String bandwidthPercent;

        @NameInMap("QosId")
        private String qosId;

        @NameInMap("QueueDescription")
        private String queueDescription;

        @NameInMap("QueueId")
        private String queueId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("QueueType")
        private String queueType;

        @NameInMap("Status")
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
    public static class QosList extends TeaModel {
        @NameInMap("AssociatedInstanceList")
        private java.util.List < AssociatedInstanceList> associatedInstanceList;

        @NameInMap("Progressing")
        private Integer progressing;

        @NameInMap("QosDescription")
        private String qosDescription;

        @NameInMap("QosId")
        private String qosId;

        @NameInMap("QosName")
        private String qosName;

        @NameInMap("QueueList")
        private java.util.List < QueueList> queueList;

        @NameInMap("Status")
        private String status;

        private QosList(Builder builder) {
            this.associatedInstanceList = builder.associatedInstanceList;
            this.progressing = builder.progressing;
            this.qosDescription = builder.qosDescription;
            this.qosId = builder.qosId;
            this.qosName = builder.qosName;
            this.queueList = builder.queueList;
            this.status = builder.status;
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
        public java.util.List < AssociatedInstanceList> getAssociatedInstanceList() {
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
        public java.util.List < QueueList> getQueueList() {
            return this.queueList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < AssociatedInstanceList> associatedInstanceList; 
            private Integer progressing; 
            private String qosDescription; 
            private String qosId; 
            private String qosName; 
            private java.util.List < QueueList> queueList; 
            private String status; 

            /**
             * AssociatedInstanceList.
             */
            public Builder associatedInstanceList(java.util.List < AssociatedInstanceList> associatedInstanceList) {
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
            public Builder queueList(java.util.List < QueueList> queueList) {
                this.queueList = queueList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QosList build() {
                return new QosList(this);
            } 

        } 

    }
}
