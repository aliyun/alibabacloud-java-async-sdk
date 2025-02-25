// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainsV2ResponseBody</p>
 */
public class DescribeAntChainsV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAntChainsV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainsV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAntChainsV2ResponseBody build() {
            return new DescribeAntChainsV2ResponseBody(this);
        } 

    } 

    public static class AntChains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("AntChainName")
        private String antChainName;

        @com.aliyun.core.annotation.NameInMap("ChainType")
        private String chainType;

        @com.aliyun.core.annotation.NameInMap("CipherSuit")
        private String cipherSuit;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsAdmin")
        private Boolean isAdmin;

        @com.aliyun.core.annotation.NameInMap("MemberStatus")
        private String memberStatus;

        @com.aliyun.core.annotation.NameInMap("MerkleTreeSuit")
        private String merkleTreeSuit;

        @com.aliyun.core.annotation.NameInMap("MonitorStatus")
        private Boolean monitorStatus;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceSize")
        private String resourceSize;

        @com.aliyun.core.annotation.NameInMap("RestStatus")
        private String restStatus;

        @com.aliyun.core.annotation.NameInMap("TlsAlgo")
        private String tlsAlgo;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AntChains(Builder builder) {
            this.antChainId = builder.antChainId;
            this.antChainName = builder.antChainName;
            this.chainType = builder.chainType;
            this.cipherSuit = builder.cipherSuit;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.isAdmin = builder.isAdmin;
            this.memberStatus = builder.memberStatus;
            this.merkleTreeSuit = builder.merkleTreeSuit;
            this.monitorStatus = builder.monitorStatus;
            this.network = builder.network;
            this.nodeNum = builder.nodeNum;
            this.regionId = builder.regionId;
            this.resourceSize = builder.resourceSize;
            this.restStatus = builder.restStatus;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
         * @return monitorStatus
         */
        public Boolean getMonitorStatus() {
            return this.monitorStatus;
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
         * @return restStatus
         */
        public String getRestStatus() {
            return this.restStatus;
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
            private String instanceId; 
            private Boolean isAdmin; 
            private String memberStatus; 
            private String merkleTreeSuit; 
            private Boolean monitorStatus; 
            private String network; 
            private Integer nodeNum; 
            private String regionId; 
            private String resourceSize; 
            private String restStatus; 
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * MonitorStatus.
             */
            public Builder monitorStatus(Boolean monitorStatus) {
                this.monitorStatus = monitorStatus;
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
             * RestStatus.
             */
            public Builder restStatus(String restStatus) {
                this.restStatus = restStatus;
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
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        @com.aliyun.core.annotation.NameInMap("AntChains")
        private java.util.List < AntChains> antChains;

        @com.aliyun.core.annotation.NameInMap("IsExist")
        private Boolean isExist;

        @com.aliyun.core.annotation.NameInMap("Pagination")
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
