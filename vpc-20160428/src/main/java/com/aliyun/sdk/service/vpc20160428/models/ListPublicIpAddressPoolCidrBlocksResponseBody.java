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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PublicIpPoolCidrBlockList")
    private java.util.List < PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicIpAddressPoolCidrBlocksResponseBody(Builder builder) {
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
        private String nextToken; 
        private java.util.List < PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** was not returned, it indicates that no additional results exist.
         * *   If **NextToken** is returned, the value is the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder publicIpPoolCidrBlockList(java.util.List < PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList) {
            this.publicIpPoolCidrBlockList = publicIpPoolCidrBlockList;
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
         * The maximum number of entries returned. Valid values: **10** to **100**. Default value: **10**.
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
             * The ID of the IP address pool.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The CIDR blocks.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The information about the CIDR blocks.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * The time when the CIDR block was created. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The total number of available IP addresses in the CIDR block.
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * The status of the CIDR block in the IP address pool. Valid values:
             * <p>
             * 
             * *   **Created**: available
             * *   **Deleting**: being deleted
             * *   **Modifying**: being modified
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
