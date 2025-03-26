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
 * {@link ListVSwitchCidrReservationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVSwitchCidrReservationsResponseBody</p>
 */
public class ListVSwitchCidrReservationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservations")
    private java.util.List<VSwitchCidrReservations> vSwitchCidrReservations;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VSwitchCidrReservations> getVSwitchCidrReservations() {
        return this.vSwitchCidrReservations;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<VSwitchCidrReservations> vSwitchCidrReservations; 

        private Builder() {
        } 

        private Builder(ListVSwitchCidrReservationsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vSwitchCidrReservations = model.vSwitchCidrReservations;
        } 

        /**
         * <p>The number of entries to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of reserved CIDR blocks.</p>
         */
        public Builder vSwitchCidrReservations(java.util.List<VSwitchCidrReservations> vSwitchCidrReservations) {
            this.vSwitchCidrReservations = vSwitchCidrReservations;
            return this;
        }

        public ListVSwitchCidrReservationsResponseBody build() {
            return new ListVSwitchCidrReservationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVSwitchCidrReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVSwitchCidrReservationsResponseBody</p>
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
     * {@link ListVSwitchCidrReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVSwitchCidrReservationsResponseBody</p>
     */
    public static class VSwitchCidrReservations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedCidrCount")
        private Integer assignedCidrCount;

        @com.aliyun.core.annotation.NameInMap("AvailableCidrCount")
        private Integer availableCidrCount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationCidr")
        private String vSwitchCidrReservationCidr;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationDescription")
        private String vSwitchCidrReservationDescription;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationId")
        private String vSwitchCidrReservationId;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationName")
        private String vSwitchCidrReservationName;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private String type; 
            private String vSwitchCidrReservationCidr; 
            private String vSwitchCidrReservationDescription; 
            private String vSwitchCidrReservationId; 
            private String vSwitchCidrReservationName; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VSwitchCidrReservations model) {
                this.assignedCidrCount = model.assignedCidrCount;
                this.availableCidrCount = model.availableCidrCount;
                this.creationTime = model.creationTime;
                this.ipVersion = model.ipVersion;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.vSwitchCidrReservationCidr = model.vSwitchCidrReservationCidr;
                this.vSwitchCidrReservationDescription = model.vSwitchCidrReservationDescription;
                this.vSwitchCidrReservationId = model.vSwitchCidrReservationId;
                this.vSwitchCidrReservationName = model.vSwitchCidrReservationName;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The number of used prefixes in the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder assignedCidrCount(Integer assignedCidrCount) {
                this.assignedCidrCount = assignedCidrCount;
                return this;
            }

            /**
             * <p>The number of available prefixes in the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder availableCidrCount(Integer availableCidrCount) {
                this.availableCidrCount = availableCidrCount;
                return this;
            }

            /**
             * <p>The time when the reserved CIDR block was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-14T10:02:37Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The IP version of the reserved CIDR block. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong> (default)</li>
             * <li><strong>IPv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The status of the reserved CIDR block. Valid values:</p>
             * <ul>
             * <li><strong>Assigning</strong></li>
             * <li><strong>Assigned</strong></li>
             * <li><strong>Releasing</strong></li>
             * <li><strong>Released</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Assigned</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the reserved CIDR block. Valid value: <strong>prefix</strong>. CIDR blocks are allocated from the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>prefix</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.64/28</p>
             */
            public Builder vSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
                this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
                return this;
            }

            /**
             * <p>The description of the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>ReservationDescription</p>
             */
            public Builder vSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
                this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
                return this;
            }

            /**
             * <p>The ID of the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>vcr-bp1m12saqteraw3rp****</p>
             */
            public Builder vSwitchCidrReservationId(String vSwitchCidrReservationId) {
                this.vSwitchCidrReservationId = vSwitchCidrReservationId;
                return this;
            }

            /**
             * <p>The name of the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>ReservationName</p>
             */
            public Builder vSwitchCidrReservationName(String vSwitchCidrReservationName) {
                this.vSwitchCidrReservationName = vSwitchCidrReservationName;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the reserved CIDR block belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-25navfgbue4g****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) to which the reserved CIDR block belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1wdz2pdhgurz1od****</p>
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
