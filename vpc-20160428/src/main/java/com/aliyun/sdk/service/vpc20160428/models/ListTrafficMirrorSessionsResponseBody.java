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
    private java.util.List<TrafficMirrorSessions> trafficMirrorSessions;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TrafficMirrorSessions> getTrafficMirrorSessions() {
        return this.trafficMirrorSessions;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List<TrafficMirrorSessions> trafficMirrorSessions; 

        private Builder() {
        } 

        private Builder(ListTrafficMirrorSessionsResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trafficMirrorSessions = model.trafficMirrorSessions;
        } 

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value is the token that is used for the subsequent query.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>739CA01C-92EB-4C69-BCC0-280149C6F41E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The details about the traffic mirror session.</p>
         */
        public Builder trafficMirrorSessions(java.util.List<TrafficMirrorSessions> trafficMirrorSessions) {
            this.trafficMirrorSessions = trafficMirrorSessions;
            return this;
        }

        public ListTrafficMirrorSessionsResponseBody build() {
            return new ListTrafficMirrorSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrafficMirrorSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMirrorSessionsResponseBody</p>
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
     * {@link ListTrafficMirrorSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMirrorSessionsResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        private java.util.List<String> trafficMirrorSourceIds;

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
        public java.util.List<Tags> getTags() {
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
        public java.util.List<String> getTrafficMirrorSourceIds() {
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
            private java.util.List<Tags> tags; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorSessionBusinessStatus; 
            private String trafficMirrorSessionDescription; 
            private String trafficMirrorSessionId; 
            private String trafficMirrorSessionName; 
            private String trafficMirrorSessionStatus; 
            private java.util.List<String> trafficMirrorSourceIds; 
            private String trafficMirrorTargetId; 
            private String trafficMirrorTargetType; 
            private Integer virtualNetworkId; 

            private Builder() {
            } 

            private Builder(TrafficMirrorSessions model) {
                this.creationTime = model.creationTime;
                this.enabled = model.enabled;
                this.packetLength = model.packetLength;
                this.priority = model.priority;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.trafficMirrorFilterId = model.trafficMirrorFilterId;
                this.trafficMirrorSessionBusinessStatus = model.trafficMirrorSessionBusinessStatus;
                this.trafficMirrorSessionDescription = model.trafficMirrorSessionDescription;
                this.trafficMirrorSessionId = model.trafficMirrorSessionId;
                this.trafficMirrorSessionName = model.trafficMirrorSessionName;
                this.trafficMirrorSessionStatus = model.trafficMirrorSessionStatus;
                this.trafficMirrorSourceIds = model.trafficMirrorSourceIds;
                this.trafficMirrorTargetId = model.trafficMirrorTargetId;
                this.trafficMirrorTargetType = model.trafficMirrorTargetType;
                this.virtualNetworkId = model.virtualNetworkId;
            } 

            /**
             * <p>The time when the session is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-05T15:26Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the traffic mirror session was enabled.</p>
             * <ul>
             * <li><strong>false</strong> </li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum transmission unit.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder packetLength(Integer packetLength) {
                this.packetLength = packetLength;
                return this;
            }

            /**
             * <p>The priority of the traffic mirror session.</p>
             * <p>A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the traffic mirror session belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the filter.</p>
             * 
             * <strong>example:</strong>
             * <p>tmf-j6cmls82xnc86vtpe****</p>
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * <p>The status of the traffic mirror session.</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder trafficMirrorSessionBusinessStatus(String trafficMirrorSessionBusinessStatus) {
                this.trafficMirrorSessionBusinessStatus = trafficMirrorSessionBusinessStatus;
                return this;
            }

            /**
             * <p>The description of the traffic mirror session.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a session.</p>
             */
            public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
                this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
                return this;
            }

            /**
             * <p>The ID of the traffic mirror session.</p>
             * 
             * <strong>example:</strong>
             * <p>tms-j6cla50buc44ap8tu****</p>
             */
            public Builder trafficMirrorSessionId(String trafficMirrorSessionId) {
                this.trafficMirrorSessionId = trafficMirrorSessionId;
                return this;
            }

            /**
             * <p>The name of the traffic mirror session.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
                this.trafficMirrorSessionName = trafficMirrorSessionName;
                return this;
            }

            /**
             * <p>The status of the traffic mirror session. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder trafficMirrorSessionStatus(String trafficMirrorSessionStatus) {
                this.trafficMirrorSessionStatus = trafficMirrorSessionStatus;
                return this;
            }

            /**
             * <p>The ID of the traffic mirror source.</p>
             */
            public Builder trafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
                this.trafficMirrorSourceIds = trafficMirrorSourceIds;
                return this;
            }

            /**
             * <p>The ID of the traffic mirror destination.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-j6c2fp57q8rr47rp****</p>
             */
            public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
                this.trafficMirrorTargetId = trafficMirrorTargetId;
                return this;
            }

            /**
             * <p>The type of the traffic mirror destination. Valid values:</p>
             * <ul>
             * <li><strong>NetworkInterface</strong>: an elastic network interface (ENI)</li>
             * <li><strong>SLB</strong>: an internal-facing Server Load Balancer (SLB) instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NetworkInterface</p>
             */
            public Builder trafficMirrorTargetType(String trafficMirrorTargetType) {
                this.trafficMirrorTargetType = trafficMirrorTargetType;
                return this;
            }

            /**
             * <p>You can specify VNIs to distinguish different mirrored traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
