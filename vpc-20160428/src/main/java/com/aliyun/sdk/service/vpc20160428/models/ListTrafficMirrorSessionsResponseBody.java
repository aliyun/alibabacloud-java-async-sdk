// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMirrorSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficMirrorSessionsResponseBody</p>
 */
public class ListTrafficMirrorSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessions")
    private java.util.List < TrafficMirrorSessions> trafficMirrorSessions;

    private ListTrafficMirrorSessionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficMirrorSessions = builder.trafficMirrorSessions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficMirrorSessionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficMirrorSessions
     */
    public java.util.List < TrafficMirrorSessions> getTrafficMirrorSessions() {
        return this.trafficMirrorSessions;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < TrafficMirrorSessions> trafficMirrorSessions; 

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next queries are sent.
         * *   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The details about the traffic mirror session.
         */
        public Builder trafficMirrorSessions(java.util.List < TrafficMirrorSessions> trafficMirrorSessions) {
            this.trafficMirrorSessions = trafficMirrorSessions;
            return this;
        }

        public ListTrafficMirrorSessionsResponseBody build() {
            return new ListTrafficMirrorSessionsResponseBody(this);
        } 

    } 

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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class TrafficMirrorSessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("PacketLength")
        private Integer packetLength;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionBusinessStatus")
        private String trafficMirrorSessionBusinessStatus;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionDescription")
        private String trafficMirrorSessionDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionId")
        private String trafficMirrorSessionId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionName")
        private String trafficMirrorSessionName;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionStatus")
        private String trafficMirrorSessionStatus;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorSourceIds")
        private java.util.List < String > trafficMirrorSourceIds;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorTargetId")
        private String trafficMirrorTargetId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorTargetType")
        private String trafficMirrorTargetType;

        @com.aliyun.core.annotation.NameInMap("VirtualNetworkId")
        private Integer virtualNetworkId;

        private TrafficMirrorSessions(Builder builder) {
            this.creationTime = builder.creationTime;
            this.enabled = builder.enabled;
            this.packetLength = builder.packetLength;
            this.priority = builder.priority;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
            this.trafficMirrorSessionBusinessStatus = builder.trafficMirrorSessionBusinessStatus;
            this.trafficMirrorSessionDescription = builder.trafficMirrorSessionDescription;
            this.trafficMirrorSessionId = builder.trafficMirrorSessionId;
            this.trafficMirrorSessionName = builder.trafficMirrorSessionName;
            this.trafficMirrorSessionStatus = builder.trafficMirrorSessionStatus;
            this.trafficMirrorSourceIds = builder.trafficMirrorSourceIds;
            this.trafficMirrorTargetId = builder.trafficMirrorTargetId;
            this.trafficMirrorTargetType = builder.trafficMirrorTargetType;
            this.virtualNetworkId = builder.virtualNetworkId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMirrorSessions create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return packetLength
         */
        public Integer getPacketLength() {
            return this.packetLength;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return trafficMirrorFilterId
         */
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        /**
         * @return trafficMirrorSessionBusinessStatus
         */
        public String getTrafficMirrorSessionBusinessStatus() {
            return this.trafficMirrorSessionBusinessStatus;
        }

        /**
         * @return trafficMirrorSessionDescription
         */
        public String getTrafficMirrorSessionDescription() {
            return this.trafficMirrorSessionDescription;
        }

        /**
         * @return trafficMirrorSessionId
         */
        public String getTrafficMirrorSessionId() {
            return this.trafficMirrorSessionId;
        }

        /**
         * @return trafficMirrorSessionName
         */
        public String getTrafficMirrorSessionName() {
            return this.trafficMirrorSessionName;
        }

        /**
         * @return trafficMirrorSessionStatus
         */
        public String getTrafficMirrorSessionStatus() {
            return this.trafficMirrorSessionStatus;
        }

        /**
         * @return trafficMirrorSourceIds
         */
        public java.util.List < String > getTrafficMirrorSourceIds() {
            return this.trafficMirrorSourceIds;
        }

        /**
         * @return trafficMirrorTargetId
         */
        public String getTrafficMirrorTargetId() {
            return this.trafficMirrorTargetId;
        }

        /**
         * @return trafficMirrorTargetType
         */
        public String getTrafficMirrorTargetType() {
            return this.trafficMirrorTargetType;
        }

        /**
         * @return virtualNetworkId
         */
        public Integer getVirtualNetworkId() {
            return this.virtualNetworkId;
        }

        public static final class Builder {
            private String creationTime; 
            private Boolean enabled; 
            private Integer packetLength; 
            private Integer priority; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorSessionBusinessStatus; 
            private String trafficMirrorSessionDescription; 
            private String trafficMirrorSessionId; 
            private String trafficMirrorSessionName; 
            private String trafficMirrorSessionStatus; 
            private java.util.List < String > trafficMirrorSourceIds; 
            private String trafficMirrorTargetId; 
            private String trafficMirrorTargetType; 
            private Integer virtualNetworkId; 

            /**
             * The time when the session is created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the traffic mirror session was enabled.
             * <p>
             * 
             * *   **false** 
             * *   **true**
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The maximum transmission unit.
             */
            public Builder packetLength(Integer packetLength) {
                this.packetLength = packetLength;
                return this;
            }

            /**
             * The priority of the traffic mirror session.
             * <p>
             * 
             * A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the resource group to which the traffic mirror session belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the filter.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * The status of the traffic mirror session.
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             */
            public Builder trafficMirrorSessionBusinessStatus(String trafficMirrorSessionBusinessStatus) {
                this.trafficMirrorSessionBusinessStatus = trafficMirrorSessionBusinessStatus;
                return this;
            }

            /**
             * The description of the traffic mirror session.
             */
            public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
                this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
                return this;
            }

            /**
             * The ID of the traffic mirror session.
             */
            public Builder trafficMirrorSessionId(String trafficMirrorSessionId) {
                this.trafficMirrorSessionId = trafficMirrorSessionId;
                return this;
            }

            /**
             * The name of the traffic mirror session.
             */
            public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
                this.trafficMirrorSessionName = trafficMirrorSessionName;
                return this;
            }

            /**
             * The status of the traffic mirror session. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Created**
             * *   **Modifying**
             * *   **Deleting**
             */
            public Builder trafficMirrorSessionStatus(String trafficMirrorSessionStatus) {
                this.trafficMirrorSessionStatus = trafficMirrorSessionStatus;
                return this;
            }

            /**
             * The ID of the traffic mirror source.
             */
            public Builder trafficMirrorSourceIds(java.util.List < String > trafficMirrorSourceIds) {
                this.trafficMirrorSourceIds = trafficMirrorSourceIds;
                return this;
            }

            /**
             * The ID of the traffic mirror destination.
             */
            public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
                this.trafficMirrorTargetId = trafficMirrorTargetId;
                return this;
            }

            /**
             * The type of the traffic mirror destination. Valid values:
             * <p>
             * 
             * *   **NetworkInterface**: an elastic network interface (ENI)
             * *   **SLB**: an internal-facing Server Load Balancer (SLB) instance
             */
            public Builder trafficMirrorTargetType(String trafficMirrorTargetType) {
                this.trafficMirrorTargetType = trafficMirrorTargetType;
                return this;
            }

            /**
             * You can specify VNIs to distinguish different mirrored traffic.
             */
            public Builder virtualNetworkId(Integer virtualNetworkId) {
                this.virtualNetworkId = virtualNetworkId;
                return this;
            }

            public TrafficMirrorSessions build() {
                return new TrafficMirrorSessions(this);
            } 

        } 

    }
}
