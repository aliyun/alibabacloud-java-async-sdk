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
 * {@link ListPublicIpAddressPoolCidrBlocksResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolCidrBlocksResponseBody</p>
 */
public class ListPublicIpAddressPoolCidrBlocksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PublicIpPoolCidrBlockList")
    private java.util.List<PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return publicIpPoolCidrBlockList
     */
    public java.util.List<PublicIpPoolCidrBlockList> getPublicIpPoolCidrBlockList() {
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
        private java.util.List<PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPublicIpAddressPoolCidrBlocksResponseBody model) {
            this.nextToken = model.nextToken;
            this.publicIpPoolCidrBlockList = model.publicIpPoolCidrBlockList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> is returned, the value is the token that is used for the next query.</li>
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
         * <p>The total number of entries returned.</p>
         */
        public Builder publicIpPoolCidrBlockList(java.util.List<PublicIpPoolCidrBlockList> publicIpPoolCidrBlockList) {
            this.publicIpPoolCidrBlockList = publicIpPoolCidrBlockList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The maximum number of entries returned. Valid values: <strong>10</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBody build() {
            return new ListPublicIpAddressPoolCidrBlocksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublicIpAddressPoolCidrBlocksResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicIpAddressPoolCidrBlocksResponseBody</p>
     */
    public static class PublicIpPoolCidrBlockList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @com.aliyun.core.annotation.NameInMap("UsedIpNum")
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

            private Builder() {
            } 

            private Builder(PublicIpPoolCidrBlockList model) {
                this.cidrBlock = model.cidrBlock;
                this.creationTime = model.creationTime;
                this.publicIpAddressPoolId = model.publicIpAddressPoolId;
                this.status = model.status;
                this.totalIpNum = model.totalIpNum;
                this.usedIpNum = model.usedIpNum;
            } 

            /**
             * <p>The ID of the IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>47.0.XX.XX/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-10T01:37:38Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The information about the CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>pippool-6wetvn6fumkgycssx****</p>
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * <p>The time when the CIDR block was created. The time is displayed in <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of available IP addresses in the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * <p>The status of the CIDR block in the IP address pool. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong>: available</li>
             * <li><strong>Deleting</strong>: being deleted</li>
             * <li><strong>Modifying</strong>: being modified</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
