// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVSwitchCidrReservationUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetVSwitchCidrReservationUsageResponseBody</p>
 */
public class GetVSwitchCidrReservationUsageResponseBody extends TeaModel {
    @NameInMap("CidrReservationUsages")
    private java.util.List < CidrReservationUsages> cidrReservationUsages;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetVSwitchCidrReservationUsageResponseBody(Builder builder) {
        this.cidrReservationUsages = builder.cidrReservationUsages;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVSwitchCidrReservationUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidrReservationUsages
     */
    public java.util.List < CidrReservationUsages> getCidrReservationUsages() {
        return this.cidrReservationUsages;
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

    public static final class Builder {
        private java.util.List < CidrReservationUsages> cidrReservationUsages; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * A list of reserved CIDR blocks that are in use.
         */
        public Builder cidrReservationUsages(java.util.List < CidrReservationUsages> cidrReservationUsages) {
            this.cidrReservationUsages = cidrReservationUsages;
            return this;
        }

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

        public GetVSwitchCidrReservationUsageResponseBody build() {
            return new GetVSwitchCidrReservationUsageResponseBody(this);
        } 

    } 

    public static class CidrReservationUsages extends TeaModel {
        @NameInMap("IpPrefixCidr")
        private String ipPrefixCidr;

        @NameInMap("IpPrefixId")
        private String ipPrefixId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("VSwitchCidrReservationId")
        private String vSwitchCidrReservationId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private CidrReservationUsages(Builder builder) {
            this.ipPrefixCidr = builder.ipPrefixCidr;
            this.ipPrefixId = builder.ipPrefixId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.vSwitchCidrReservationId = builder.vSwitchCidrReservationId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CidrReservationUsages create() {
            return builder().build();
        }

        /**
         * @return ipPrefixCidr
         */
        public String getIpPrefixCidr() {
            return this.ipPrefixCidr;
        }

        /**
         * @return ipPrefixId
         */
        public String getIpPrefixId() {
            return this.ipPrefixId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return vSwitchCidrReservationId
         */
        public String getVSwitchCidrReservationId() {
            return this.vSwitchCidrReservationId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String ipPrefixCidr; 
            private String ipPrefixId; 
            private String resourceId; 
            private String resourceType; 
            private String vSwitchCidrReservationId; 
            private String vSwitchId; 

            /**
             * The CIDR block allocated to the ENI from the reserved CIDR block.
             */
            public Builder ipPrefixCidr(String ipPrefixCidr) {
                this.ipPrefixCidr = ipPrefixCidr;
                return this;
            }

            /**
             * The ID of the reserved CIDR block.
             */
            public Builder ipPrefixId(String ipPrefixId) {
                this.ipPrefixId = ipPrefixId;
                return this;
            }

            /**
             * The ID of the elastic network interface (ENI) whose CIDR block is allocated from the reserved CIDR block.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource to which a CIDR block is allocated from the reserved CIDR block. Only **NetworkInterface** may be returned, which indicates an ENI.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
             * The ID of the vSwitch to which the reserved CIDR block belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public CidrReservationUsages build() {
                return new CidrReservationUsages(this);
            } 

        } 

    }
}
