// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGrantVSwitchEnisResponseBody} extends {@link TeaModel}
 *
 * <p>ListGrantVSwitchEnisResponseBody</p>
 */
public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GrantVSwitchEnis")
    private java.util.List < GrantVSwitchEnis> grantVSwitchEnis;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListGrantVSwitchEnisResponseBody(Builder builder) {
        this.grantVSwitchEnis = builder.grantVSwitchEnis;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGrantVSwitchEnisResponseBody create() {
        return builder().build();
    }

    /**
     * @return grantVSwitchEnis
     */
    public java.util.List < GrantVSwitchEnis> getGrantVSwitchEnis() {
        return this.grantVSwitchEnis;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < GrantVSwitchEnis> grantVSwitchEnis; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The information about the ENI.
         */
        public Builder grantVSwitchEnis(java.util.List < GrantVSwitchEnis> grantVSwitchEnis) {
            this.grantVSwitchEnis = grantVSwitchEnis;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
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
         * <p>
         * 
         * > If MaxResults and NextToken are sued to query results by page, ignore this parameter.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGrantVSwitchEnisResponseBody build() {
            return new ListGrantVSwitchEnisResponseBody(this);
        } 

    } 

    public static class GrantVSwitchEnis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("TransitRouterFlag")
        private Boolean transitRouterFlag;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private GrantVSwitchEnis(Builder builder) {
            this.description = builder.description;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.transitRouterFlag = builder.transitRouterFlag;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantVSwitchEnis create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return transitRouterFlag
         */
        public Boolean getTransitRouterFlag() {
            return this.transitRouterFlag;
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
            private String description; 
            private String networkInterfaceId; 
            private String networkInterfaceName; 
            private String primaryIpAddress; 
            private Boolean transitRouterFlag; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The ENI description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ENI ID.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The ENI name.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * The primary private IPv4 address of the ENI.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * Indicates whether the ENI is created by a transit router. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * ENIs that are created by transit routers cannot be used as multicast sources or members.
             */
            public Builder transitRouterFlag(Boolean transitRouterFlag) {
                this.transitRouterFlag = transitRouterFlag;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public GrantVSwitchEnis build() {
                return new GrantVSwitchEnis(this);
            } 

        } 

    }
}
