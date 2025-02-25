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
 * {@link GetVSwitchCidrReservationUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetVSwitchCidrReservationUsageResponseBody</p>
 */
public class GetVSwitchCidrReservationUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrReservationUsages")
    private java.util.List<CidrReservationUsages> cidrReservationUsages;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<CidrReservationUsages> getCidrReservationUsages() {
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
        private java.util.List<CidrReservationUsages> cidrReservationUsages; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>A list of reserved CIDR blocks that are in use.</p>
         */
        public Builder cidrReservationUsages(java.util.List<CidrReservationUsages> cidrReservationUsages) {
            this.cidrReservationUsages = cidrReservationUsages;
            return this;
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

        public GetVSwitchCidrReservationUsageResponseBody build() {
            return new GetVSwitchCidrReservationUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVSwitchCidrReservationUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetVSwitchCidrReservationUsageResponseBody</p>
     */
    public static class CidrReservationUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpPrefixCidr")
        private String ipPrefixCidr;

        @com.aliyun.core.annotation.NameInMap("IpPrefixId")
        private String ipPrefixId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationId")
        private String vSwitchCidrReservationId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * <p>The CIDR block allocated to the ENI from the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.64/28</p>
             */
            public Builder ipPrefixCidr(String ipPrefixCidr) {
                this.ipPrefixCidr = ipPrefixCidr;
                return this;
            }

            /**
             * <p>The ID of the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>vcr-bp1m12saqteraw3rp****</p>
             */
            public Builder ipPrefixId(String ipPrefixId) {
                this.ipPrefixId = ipPrefixId;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI) whose CIDR block is allocated from the reserved CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp14v2sdd3v8htln****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource to which a CIDR block is allocated from the reserved CIDR block. Only <strong>NetworkInterface</strong> may be returned, which indicates an ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>NetworkInterface</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
             * <p>The ID of the vSwitch to which the reserved CIDR block belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-25navfgbue4g****</p>
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
