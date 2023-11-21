// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVSwitchCidrReservationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVSwitchCidrReservationsResponseBody</p>
 */
public class ListVSwitchCidrReservationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("VSwitchCidrReservations")
    private java.util.List < VSwitchCidrReservations> vSwitchCidrReservations;

    private ListVSwitchCidrReservationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vSwitchCidrReservations = builder.vSwitchCidrReservations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVSwitchCidrReservationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vSwitchCidrReservations
     */
    public java.util.List < VSwitchCidrReservations> getVSwitchCidrReservations() {
        return this.vSwitchCidrReservations;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List < VSwitchCidrReservations> vSwitchCidrReservations; 

        /**
         * The number of entries to return per page.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of reserved CIDR blocks.
         */
        public Builder vSwitchCidrReservations(java.util.List < VSwitchCidrReservations> vSwitchCidrReservations) {
            this.vSwitchCidrReservations = vSwitchCidrReservations;
            return this;
        }

        public ListVSwitchCidrReservationsResponseBody build() {
            return new ListVSwitchCidrReservationsResponseBody(this);
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
    public static class VSwitchCidrReservations extends TeaModel {
        @NameInMap("AssignedCidrCount")
        private Integer assignedCidrCount;

        @NameInMap("AvailableCidrCount")
        private Integer availableCidrCount;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Type")
        private String type;

        @NameInMap("VSwitchCidrReservationCidr")
        private String vSwitchCidrReservationCidr;

        @NameInMap("VSwitchCidrReservationDescription")
        private String vSwitchCidrReservationDescription;

        @NameInMap("VSwitchCidrReservationId")
        private String vSwitchCidrReservationId;

        @NameInMap("VSwitchCidrReservationName")
        private String vSwitchCidrReservationName;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private VSwitchCidrReservations(Builder builder) {
            this.assignedCidrCount = builder.assignedCidrCount;
            this.availableCidrCount = builder.availableCidrCount;
            this.creationTime = builder.creationTime;
            this.ipVersion = builder.ipVersion;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
            this.vSwitchCidrReservationCidr = builder.vSwitchCidrReservationCidr;
            this.vSwitchCidrReservationDescription = builder.vSwitchCidrReservationDescription;
            this.vSwitchCidrReservationId = builder.vSwitchCidrReservationId;
            this.vSwitchCidrReservationName = builder.vSwitchCidrReservationName;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchCidrReservations create() {
            return builder().build();
        }

        /**
         * @return assignedCidrCount
         */
        public Integer getAssignedCidrCount() {
            return this.assignedCidrCount;
        }

        /**
         * @return availableCidrCount
         */
        public Integer getAvailableCidrCount() {
            return this.availableCidrCount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vSwitchCidrReservationCidr
         */
        public String getVSwitchCidrReservationCidr() {
            return this.vSwitchCidrReservationCidr;
        }

        /**
         * @return vSwitchCidrReservationDescription
         */
        public String getVSwitchCidrReservationDescription() {
            return this.vSwitchCidrReservationDescription;
        }

        /**
         * @return vSwitchCidrReservationId
         */
        public String getVSwitchCidrReservationId() {
            return this.vSwitchCidrReservationId;
        }

        /**
         * @return vSwitchCidrReservationName
         */
        public String getVSwitchCidrReservationName() {
            return this.vSwitchCidrReservationName;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer assignedCidrCount; 
            private Integer availableCidrCount; 
            private String creationTime; 
            private String ipVersion; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String type; 
            private String vSwitchCidrReservationCidr; 
            private String vSwitchCidrReservationDescription; 
            private String vSwitchCidrReservationId; 
            private String vSwitchCidrReservationName; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The number of used prefixes in the reserved CIDR block.
             */
            public Builder assignedCidrCount(Integer assignedCidrCount) {
                this.assignedCidrCount = assignedCidrCount;
                return this;
            }

            /**
             * The number of available prefixes in the reserved CIDR block.
             */
            public Builder availableCidrCount(Integer availableCidrCount) {
                this.availableCidrCount = availableCidrCount;
                return this;
            }

            /**
             * The time when the reserved CIDR block was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The IP version of the reserved CIDR block. Valid values:
             * <p>
             * 
             * *   **IPv4** (default)
             * *   **IPv6**
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The status of the reserved CIDR block. Valid values:
             * <p>
             * 
             * *   **Assigning**
             * *   **Assigned**
             * *   **Releasing**
             * *   **Released**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the reserved CIDR block. Valid value: **prefix**. CIDR blocks are allocated from the reserved CIDR block.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The reserved CIDR block.
             */
            public Builder vSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
                this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
                return this;
            }

            /**
             * The description of the reserved CIDR block.
             */
            public Builder vSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
                this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
                return this;
            }

            /**
             * The ID of the reserved CIDR block.
             */
            public Builder vSwitchCidrReservationId(String vSwitchCidrReservationId) {
                this.vSwitchCidrReservationId = vSwitchCidrReservationId;
                return this;
            }

            /**
             * The name of the reserved CIDR block.
             */
            public Builder vSwitchCidrReservationName(String vSwitchCidrReservationName) {
                this.vSwitchCidrReservationName = vSwitchCidrReservationName;
                return this;
            }

            /**
             * The ID of the vSwitch to which the reserved CIDR block belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The virtual private cloud (VPC) to which the reserved CIDR block belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VSwitchCidrReservations build() {
                return new VSwitchCidrReservations(this);
            } 

        } 

    }
}
