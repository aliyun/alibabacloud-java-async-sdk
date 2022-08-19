// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolCidrBlocksResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolCidrBlocksResponseBody</p>
 */
public class ListPublicIpAddressPoolCidrBlocksResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PublicIpPoolCidrBlockList")
    private java.util.List < PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicIpAddressPoolCidrBlocksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.publicIpPoolCidrBlockList = builder.publicIpPoolCidrBlockList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicIpAddressPoolCidrBlocksResponseBody create() {
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
     * @return publicIpPoolCidrBlockList
     */
    public java.util.List < PublicIpPoolCidrBlockList> getPublicIpPoolCidrBlockList() {
        return this.publicIpPoolCidrBlockList;
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
        private java.util.List < PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList; 
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
         * PublicIpPoolCidrBlockList.
         */
        public Builder publicIpPoolCidrBlockList(java.util.List < PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList) {
            this.publicIpPoolCidrBlockList = publicIpPoolCidrBlockList;
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

        public ListPublicIpAddressPoolCidrBlocksResponseBody build() {
            return new ListPublicIpAddressPoolCidrBlocksResponseBody(this);
        } 

    } 

    public static class PublicIpPoolCidrBlockList extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @NameInMap("UsedIpNum")
        private Integer usedIpNum;

        private PublicIpPoolCidrBlockList(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
            this.status = builder.status;
            this.totalIpNum = builder.totalIpNum;
            this.usedIpNum = builder.usedIpNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpPoolCidrBlockList create() {
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
         * @return publicIpAddressPoolId
         */
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
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
            private String publicIpAddressPoolId; 
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
             * PublicIpAddressPoolId.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
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

            public PublicIpPoolCidrBlockList build() {
                return new PublicIpPoolCidrBlockList(this);
            } 

        } 

    }
}
