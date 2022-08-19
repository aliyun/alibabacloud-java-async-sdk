// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolsResponseBody</p>
 */
public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PublicIpAddressPoolList")
    private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicIpAddressPoolsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.publicIpAddressPoolList = builder.publicIpAddressPoolList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicIpAddressPoolsResponseBody create() {
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
     * @return publicIpAddressPoolList
     */
    public java.util.List < PublicIpAddressPoolList> getPublicIpAddressPoolList() {
        return this.publicIpAddressPoolList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList; 
        private String requestId; 
        private Integer totalCount; 

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
         * PublicIpAddressPoolList.
         */
        public Builder publicIpAddressPoolList(java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList) {
            this.publicIpAddressPoolList = publicIpAddressPoolList;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicIpAddressPoolsResponseBody build() {
            return new ListPublicIpAddressPoolsResponseBody(this);
        } 

    } 

    public static class PublicIpCidrBlockList extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @NameInMap("UsedIpNum")
        private Integer usedIpNum;

        private PublicIpCidrBlockList(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.status = builder.status;
            this.totalIpNum = builder.totalIpNum;
            this.usedIpNum = builder.usedIpNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpCidrBlockList create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalIpNum
         */
        public Integer getTotalIpNum() {
            return this.totalIpNum;
        }

        /**
         * @return usedIpNum
         */
        public Integer getUsedIpNum() {
            return this.usedIpNum;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String creationTime; 
            private String status; 
            private Integer totalIpNum; 
            private Integer usedIpNum; 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * TotalIpNum.
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * UsedIpNum.
             */
            public Builder usedIpNum(Integer usedIpNum) {
                this.usedIpNum = usedIpNum;
                return this;
            }

            public PublicIpCidrBlockList build() {
                return new PublicIpCidrBlockList(this);
            } 

        } 

    }
    public static class PublicIpAddressPoolList extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("IpAddressRemaining")
        private Boolean ipAddressRemaining;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @NameInMap("PublicIpCidrBlockList")
        private java.util.List < PublicIpCidrBlockList> publicIpCidrBlockList;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @NameInMap("UsedIpNum")
        private Integer usedIpNum;

        @NameInMap("UserType")
        private Boolean userType;

        private PublicIpAddressPoolList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ipAddressRemaining = builder.ipAddressRemaining;
            this.isp = builder.isp;
            this.name = builder.name;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
            this.publicIpCidrBlockList = builder.publicIpCidrBlockList;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.totalIpNum = builder.totalIpNum;
            this.usedIpNum = builder.usedIpNum;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddressPoolList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipAddressRemaining
         */
        public Boolean getIpAddressRemaining() {
            return this.ipAddressRemaining;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publicIpAddressPoolId
         */
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        /**
         * @return publicIpCidrBlockList
         */
        public java.util.List < PublicIpCidrBlockList> getPublicIpCidrBlockList() {
            return this.publicIpCidrBlockList;
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
         * @return totalIpNum
         */
        public Integer getTotalIpNum() {
            return this.totalIpNum;
        }

        /**
         * @return usedIpNum
         */
        public Integer getUsedIpNum() {
            return this.usedIpNum;
        }

        /**
         * @return userType
         */
        public Boolean getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private Boolean ipAddressRemaining; 
            private String isp; 
            private String name; 
            private String publicIpAddressPoolId; 
            private java.util.List < PublicIpCidrBlockList> publicIpCidrBlockList; 
            private String regionId; 
            private String status; 
            private Integer totalIpNum; 
            private Integer usedIpNum; 
            private Boolean userType; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IpAddressRemaining.
             */
            public Builder ipAddressRemaining(Boolean ipAddressRemaining) {
                this.ipAddressRemaining = ipAddressRemaining;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
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
             * PublicIpAddressPoolId.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * PublicIpCidrBlockList.
             */
            public Builder publicIpCidrBlockList(java.util.List < PublicIpCidrBlockList> publicIpCidrBlockList) {
                this.publicIpCidrBlockList = publicIpCidrBlockList;
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
             * TotalIpNum.
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * UsedIpNum.
             */
            public Builder usedIpNum(Integer usedIpNum) {
                this.usedIpNum = usedIpNum;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(Boolean userType) {
                this.userType = userType;
                return this;
            }

            public PublicIpAddressPoolList build() {
                return new PublicIpAddressPoolList(this);
            } 

        } 

    }
}
