// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointsResponseBody</p>
 */
public class ListVpcEndpointsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcEndpoints")
    private java.util.List < VpcEndpoints> vpcEndpoints;

    private ListVpcEndpointsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.vpcEndpoints = builder.vpcEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcEndpoints
     */
    public java.util.List < VpcEndpoints> getVpcEndpoints() {
        return this.vpcEndpoints;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < VpcEndpoints> vpcEndpoints; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcEndpoints.
         */
        public Builder vpcEndpoints(java.util.List < VpcEndpoints> vpcEndpoints) {
            this.vpcEndpoints = vpcEndpoints;
            return this;
        }

        public ListVpcEndpointsResponseBody build() {
            return new ListVpcEndpointsResponseBody(this);
        } 

    } 

    public static class VpcEndpoints extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("LedgerId")
        private String ledgerId;

        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcEndpointId")
        private String vpcEndpointId;

        @NameInMap("VpcId")
        private String vpcId;

        private VpcEndpoints(Builder builder) {
            this.address = builder.address;
            this.createTime = builder.createTime;
            this.ledgerId = builder.ledgerId;
            this.memberId = builder.memberId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcEndpointId = builder.vpcEndpointId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcEndpoints create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ledgerId
         */
        public String getLedgerId() {
            return this.ledgerId;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcEndpointId
         */
        public String getVpcEndpointId() {
            return this.vpcEndpointId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String address; 
            private Long createTime; 
            private String ledgerId; 
            private String memberId; 
            private String regionId; 
            private String status; 
            private String vSwitchId; 
            private String vpcEndpointId; 
            private String vpcId; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LedgerId.
             */
            public Builder ledgerId(String ledgerId) {
                this.ledgerId = ledgerId;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcEndpointId.
             */
            public Builder vpcEndpointId(String vpcEndpointId) {
                this.vpcEndpointId = vpcEndpointId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcEndpoints build() {
                return new VpcEndpoints(this);
            } 

        } 

    }
}
