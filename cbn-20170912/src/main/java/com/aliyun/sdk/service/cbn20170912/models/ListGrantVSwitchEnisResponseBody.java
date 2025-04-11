// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListGrantVSwitchEnisResponseBody} extends {@link TeaModel}
 *
 * <p>ListGrantVSwitchEnisResponseBody</p>
 */
public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GrantVSwitchEnis")
    private java.util.List<GrantVSwitchEnis> grantVSwitchEnis;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantVSwitchEnis
     */
    public java.util.List<GrantVSwitchEnis> getGrantVSwitchEnis() {
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
        private java.util.List<GrantVSwitchEnis> grantVSwitchEnis; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListGrantVSwitchEnisResponseBody model) {
            this.grantVSwitchEnis = model.grantVSwitchEnis;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the ENI.</p>
         */
        public Builder grantVSwitchEnis(java.util.List<GrantVSwitchEnis> grantVSwitchEnis) {
            this.grantVSwitchEnis = grantVSwitchEnis;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DBFE1736-2F33-5309-9954-875B11E9519D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * <blockquote>
         * <p>If MaxResults and NextToken are sued to query results by page, ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGrantVSwitchEnisResponseBody build() {
            return new ListGrantVSwitchEnisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGrantVSwitchEnisResponseBody} extends {@link TeaModel}
     *
     * <p>ListGrantVSwitchEnisResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(GrantVSwitchEnis model) {
                this.description = model.description;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfaceName = model.networkInterfaceName;
                this.primaryIpAddress = model.primaryIpAddress;
                this.transitRouterFlag = model.transitRouterFlag;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ENI description.</p>
             * 
             * <strong>example:</strong>
             * <p>created by CBN</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ENI ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-p0w172vv82kxzb49****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The ENI name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-eni-name</p>
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * <p>The primary private IPv4 address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * <p>Indicates whether the ENI is created by a transit router. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <p>ENIs that are created by transit routers cannot be used as multicast sources or members.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder transitRouterFlag(Boolean transitRouterFlag) {
                this.transitRouterFlag = transitRouterFlag;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-p0w9s2ig1jnwgrbzl****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-p0w9alkte4w2htrqe****</p>
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
