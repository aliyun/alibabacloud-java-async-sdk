// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainSubnetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainSubnetListResponseBody</p>
 */
public class DescribeAntChainSubnetListResponseBody extends TeaModel {
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

    private DescribeAntChainSubnetListResponseBody(Builder builder) {
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

    public static DescribeAntChainSubnetListResponseBody create() {
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

        public DescribeAntChainSubnetListResponseBody build() {
            return new DescribeAntChainSubnetListResponseBody(this);
        } 

    } 

    public static class BlockchainSubnetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("BlockHeight")
        private Long blockHeight;

        @com.aliyun.core.annotation.NameInMap("ConsortiumMember")
        private Boolean consortiumMember;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Monitor")
        private Boolean monitor;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeSum")
        private Integer nodeSum;

        @com.aliyun.core.annotation.NameInMap("Rest")
        private String rest;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransactionSum")
        private Long transactionSum;

        private BlockchainSubnetList(Builder builder) {
            this.antChainId = builder.antChainId;
            this.blockHeight = builder.blockHeight;
            this.consortiumMember = builder.consortiumMember;
            this.createTime = builder.createTime;
            this.groupId = builder.groupId;
            this.monitor = builder.monitor;
            this.name = builder.name;
            this.nodeSum = builder.nodeSum;
            this.rest = builder.rest;
            this.status = builder.status;
            this.transactionSum = builder.transactionSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockchainSubnetList create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return blockHeight
         */
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        /**
         * @return consortiumMember
         */
        public Boolean getConsortiumMember() {
            return this.consortiumMember;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return monitor
         */
        public Boolean getMonitor() {
            return this.monitor;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeSum
         */
        public Integer getNodeSum() {
            return this.nodeSum;
        }

        /**
         * @return rest
         */
        public String getRest() {
            return this.rest;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transactionSum
         */
        public Long getTransactionSum() {
            return this.transactionSum;
        }

        public static final class Builder {
            private String antChainId; 
            private Long blockHeight; 
            private Boolean consortiumMember; 
            private Long createTime; 
            private String groupId; 
            private Boolean monitor; 
            private String name; 
            private Integer nodeSum; 
            private String rest; 
            private String status; 
            private Long transactionSum; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * BlockHeight.
             */
            public Builder blockHeight(Long blockHeight) {
                this.blockHeight = blockHeight;
                return this;
            }

            /**
             * ConsortiumMember.
             */
            public Builder consortiumMember(Boolean consortiumMember) {
                this.consortiumMember = consortiumMember;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Monitor.
             */
            public Builder monitor(Boolean monitor) {
                this.monitor = monitor;
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
             * NodeSum.
             */
            public Builder nodeSum(Integer nodeSum) {
                this.nodeSum = nodeSum;
                return this;
            }

            /**
             * Rest.
             */
            public Builder rest(String rest) {
                this.rest = rest;
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
             * TransactionSum.
             */
            public Builder transactionSum(Long transactionSum) {
                this.transactionSum = transactionSum;
                return this;
            }

            public BlockchainSubnetList build() {
                return new BlockchainSubnetList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("BlockchainName")
        private String blockchainName;

        @com.aliyun.core.annotation.NameInMap("BlockchainSubnetList")
        private java.util.List < BlockchainSubnetList> blockchainSubnetList;

        @com.aliyun.core.annotation.NameInMap("ConsortiumAdmin")
        private Boolean consortiumAdmin;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.blockchainName = builder.blockchainName;
            this.blockchainSubnetList = builder.blockchainSubnetList;
            this.consortiumAdmin = builder.consortiumAdmin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return blockchainName
         */
        public String getBlockchainName() {
            return this.blockchainName;
        }

        /**
         * @return blockchainSubnetList
         */
        public java.util.List < BlockchainSubnetList> getBlockchainSubnetList() {
            return this.blockchainSubnetList;
        }

        /**
         * @return consortiumAdmin
         */
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

        public static final class Builder {
            private String antChainId; 
            private String blockchainName; 
            private java.util.List < BlockchainSubnetList> blockchainSubnetList; 
            private Boolean consortiumAdmin; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * BlockchainName.
             */
            public Builder blockchainName(String blockchainName) {
                this.blockchainName = blockchainName;
                return this;
            }

            /**
             * BlockchainSubnetList.
             */
            public Builder blockchainSubnetList(java.util.List < BlockchainSubnetList> blockchainSubnetList) {
                this.blockchainSubnetList = blockchainSubnetList;
                return this;
            }

            /**
             * ConsortiumAdmin.
             */
            public Builder consortiumAdmin(Boolean consortiumAdmin) {
                this.consortiumAdmin = consortiumAdmin;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
