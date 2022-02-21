// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainsResponseBody</p>
 */
public class DescribeAntChainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAntChainsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainsResponseBody build() {
            return new DescribeAntChainsResponseBody(this);
        } 

    } 

    public static class AntChains extends TeaModel {
        @NameInMap("AntChainId")
        private String antChainId;

        @NameInMap("AntChainName")
        private String antChainName;

        @NameInMap("ChainType")
        private String chainType;

        @NameInMap("CipherSuit")
        private String cipherSuit;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("IsAdmin")
        private Boolean isAdmin;

        @NameInMap("MemberStatus")
        private String memberStatus;

        @NameInMap("MerkleTreeSuit")
        private String merkleTreeSuit;

        @NameInMap("Network")
        private String network;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceSize")
        private String resourceSize;

        @NameInMap("TlsAlgo")
        private String tlsAlgo;

        @NameInMap("Version")
        private String version;

        private AntChains(Builder builder) {
            this.antChainId = builder.antChainId;
            this.antChainName = builder.antChainName;
            this.chainType = builder.chainType;
            this.cipherSuit = builder.cipherSuit;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.isAdmin = builder.isAdmin;
            this.memberStatus = builder.memberStatus;
            this.merkleTreeSuit = builder.merkleTreeSuit;
            this.network = builder.network;
            this.nodeNum = builder.nodeNum;
            this.regionId = builder.regionId;
            this.resourceSize = builder.resourceSize;
            this.tlsAlgo = builder.tlsAlgo;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AntChains create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return antChainName
         */
        public String getAntChainName() {
            return this.antChainName;
        }

        /**
         * @return chainType
         */
        public String getChainType() {
            return this.chainType;
        }

        /**
         * @return cipherSuit
         */
        public String getCipherSuit() {
            return this.cipherSuit;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return isAdmin
         */
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        /**
         * @return memberStatus
         */
        public String getMemberStatus() {
            return this.memberStatus;
        }

        /**
         * @return merkleTreeSuit
         */
        public String getMerkleTreeSuit() {
            return this.merkleTreeSuit;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceSize
         */
        public String getResourceSize() {
            return this.resourceSize;
        }

        /**
         * @return tlsAlgo
         */
        public String getTlsAlgo() {
            return this.tlsAlgo;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String antChainId; 
            private String antChainName; 
            private String chainType; 
            private String cipherSuit; 
            private Long createTime; 
            private Long expireTime; 
            private Boolean isAdmin; 
            private String memberStatus; 
            private String merkleTreeSuit; 
            private String network; 
            private Integer nodeNum; 
            private String regionId; 
            private String resourceSize; 
            private String tlsAlgo; 
            private String version; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * AntChainName.
             */
            public Builder antChainName(String antChainName) {
                this.antChainName = antChainName;
                return this;
            }

            /**
             * ChainType.
             */
            public Builder chainType(String chainType) {
                this.chainType = chainType;
                return this;
            }

            /**
             * CipherSuit.
             */
            public Builder cipherSuit(String cipherSuit) {
                this.cipherSuit = cipherSuit;
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
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * IsAdmin.
             */
            public Builder isAdmin(Boolean isAdmin) {
                this.isAdmin = isAdmin;
                return this;
            }

            /**
             * MemberStatus.
             */
            public Builder memberStatus(String memberStatus) {
                this.memberStatus = memberStatus;
                return this;
            }

            /**
             * MerkleTreeSuit.
             */
            public Builder merkleTreeSuit(String merkleTreeSuit) {
                this.merkleTreeSuit = merkleTreeSuit;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * NodeNum.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
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
             * ResourceSize.
             */
            public Builder resourceSize(String resourceSize) {
                this.resourceSize = resourceSize;
                return this;
            }

            /**
             * TlsAlgo.
             */
            public Builder tlsAlgo(String tlsAlgo) {
                this.tlsAlgo = tlsAlgo;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AntChains build() {
                return new AntChains(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Pagination(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AntChains")
        private java.util.List < AntChains> antChains;

        @NameInMap("IsExist")
        private Boolean isExist;

        @NameInMap("Pagination")
        private Pagination pagination;

        private Result(Builder builder) {
            this.antChains = builder.antChains;
            this.isExist = builder.isExist;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChains
         */
        public java.util.List < AntChains> getAntChains() {
            return this.antChains;
        }

        /**
         * @return isExist
         */
        public Boolean getIsExist() {
            return this.isExist;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < AntChains> antChains; 
            private Boolean isExist; 
            private Pagination pagination; 

            /**
             * AntChains.
             */
            public Builder antChains(java.util.List < AntChains> antChains) {
                this.antChains = antChains;
                return this;
            }

            /**
             * IsExist.
             */
            public Builder isExist(Boolean isExist) {
                this.isExist = isExist;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
