// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMirrorSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficMirrorSessionsResponseBody</p>
 */
public class ListTrafficMirrorSessionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("TrafficMirrorSessions")
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrafficMirrorSessions.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class TrafficMirrorSessions extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("PacketLength")
        private Integer packetLength;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorSessionBusinessStatus")
        private String trafficMirrorSessionBusinessStatus;

        @NameInMap("TrafficMirrorSessionDescription")
        private String trafficMirrorSessionDescription;

        @NameInMap("TrafficMirrorSessionId")
        private String trafficMirrorSessionId;

        @NameInMap("TrafficMirrorSessionName")
        private String trafficMirrorSessionName;

        @NameInMap("TrafficMirrorSessionStatus")
        private String trafficMirrorSessionStatus;

        @NameInMap("TrafficMirrorSourceIds")
        private java.util.List < String > trafficMirrorSourceIds;

        @NameInMap("TrafficMirrorTargetId")
        private String trafficMirrorTargetId;

        @NameInMap("TrafficMirrorTargetType")
        private String trafficMirrorTargetType;

        @NameInMap("VirtualNetworkId")
        private Integer virtualNetworkId;

        private TrafficMirrorSessions(Builder builder) {
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
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * PacketLength.
             */
            public Builder packetLength(Integer packetLength) {
                this.packetLength = packetLength;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
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
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TrafficMirrorFilterId.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * TrafficMirrorSessionBusinessStatus.
             */
            public Builder trafficMirrorSessionBusinessStatus(String trafficMirrorSessionBusinessStatus) {
                this.trafficMirrorSessionBusinessStatus = trafficMirrorSessionBusinessStatus;
                return this;
            }

            /**
             * TrafficMirrorSessionDescription.
             */
            public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
                this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
                return this;
            }

            /**
             * TrafficMirrorSessionId.
             */
            public Builder trafficMirrorSessionId(String trafficMirrorSessionId) {
                this.trafficMirrorSessionId = trafficMirrorSessionId;
                return this;
            }

            /**
             * TrafficMirrorSessionName.
             */
            public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
                this.trafficMirrorSessionName = trafficMirrorSessionName;
                return this;
            }

            /**
             * TrafficMirrorSessionStatus.
             */
            public Builder trafficMirrorSessionStatus(String trafficMirrorSessionStatus) {
                this.trafficMirrorSessionStatus = trafficMirrorSessionStatus;
                return this;
            }

            /**
             * TrafficMirrorSourceIds.
             */
            public Builder trafficMirrorSourceIds(java.util.List < String > trafficMirrorSourceIds) {
                this.trafficMirrorSourceIds = trafficMirrorSourceIds;
                return this;
            }

            /**
             * TrafficMirrorTargetId.
             */
            public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
                this.trafficMirrorTargetId = trafficMirrorTargetId;
                return this;
            }

            /**
             * TrafficMirrorTargetType.
             */
            public Builder trafficMirrorTargetType(String trafficMirrorTargetType) {
                this.trafficMirrorTargetType = trafficMirrorTargetType;
                return this;
            }

            /**
             * VirtualNetworkId.
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
