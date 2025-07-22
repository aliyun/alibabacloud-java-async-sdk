// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeSubnetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubnetsResponseBody</p>
 */
public class DescribeSubnetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Subnets")
    private java.util.List<Subnets> subnets;

    private DescribeSubnetsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.subnets = builder.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubnetsResponseBody create() {
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
     * @return subnets
     */
    public java.util.List<Subnets> getSubnets() {
        return this.subnets;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Subnets> subnets; 

        private Builder() {
        } 

        private Builder(DescribeSubnetsResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.subnets = model.subnets;
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
         * Subnets.
         */
        public Builder subnets(java.util.List<Subnets> subnets) {
            this.subnets = subnets;
            return this;
        }

        public DescribeSubnetsResponseBody build() {
            return new DescribeSubnetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSubnetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubnetsResponseBody</p>
     */
    public static class Subnets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetId")
        private String subnetId;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCount")
        private Integer totalEdsCount;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCountForGroup")
        private Integer totalEdsCountForGroup;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Subnets(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.name = builder.name;
            this.officeSiteId = builder.officeSiteId;
            this.status = builder.status;
            this.subnetId = builder.subnetId;
            this.totalEdsCount = builder.totalEdsCount;
            this.totalEdsCountForGroup = builder.totalEdsCountForGroup;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subnets create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return totalEdsCount
         */
        public Integer getTotalEdsCount() {
            return this.totalEdsCount;
        }

        /**
         * @return totalEdsCountForGroup
         */
        public Integer getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String name; 
            private String officeSiteId; 
            private String status; 
            private String subnetId; 
            private Integer totalEdsCount; 
            private Integer totalEdsCountForGroup; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Subnets model) {
                this.cidrBlock = model.cidrBlock;
                this.name = model.name;
                this.officeSiteId = model.officeSiteId;
                this.status = model.status;
                this.subnetId = model.subnetId;
                this.totalEdsCount = model.totalEdsCount;
                this.totalEdsCountForGroup = model.totalEdsCountForGroup;
                this.zoneId = model.zoneId;
            } 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
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
             * SubnetId.
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * TotalEdsCount.
             */
            public Builder totalEdsCount(Integer totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * TotalEdsCountForGroup.
             */
            public Builder totalEdsCountForGroup(Integer totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Subnets build() {
                return new Subnets(this);
            } 

        } 

    }
}
