// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainBlockV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainBlockV2ResponseBody</p>
 */
public class DescribeAntChainBlockV2ResponseBody extends TeaModel {
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

    private DescribeAntChainBlockV2ResponseBody(Builder builder) {
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

    public static DescribeAntChainBlockV2ResponseBody create() {
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

        public DescribeAntChainBlockV2ResponseBody build() {
            return new DescribeAntChainBlockV2ResponseBody(this);
        } 

    } 

    public static class TransSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("BlockHash")
        private String blockHash;

        @com.aliyun.core.annotation.NameInMap("Category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("GasUsed")
        private Long gasUsed;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        @com.aliyun.core.annotation.NameInMap("TransTypeV10")
        private String transTypeV10;

        @com.aliyun.core.annotation.NameInMap("TransTypeV6")
        private String transTypeV6;

        private TransSummaryList(Builder builder) {
            this.alias = builder.alias;
            this.blockHash = builder.blockHash;
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.from = builder.from;
            this.gasUsed = builder.gasUsed;
            this.hash = builder.hash;
            this.height = builder.height;
            this.referenceCount = builder.referenceCount;
            this.to = builder.to;
            this.transTypeV10 = builder.transTypeV10;
            this.transTypeV6 = builder.transTypeV6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransSummaryList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return blockHash
         */
        public String getBlockHash() {
            return this.blockHash;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return gasUsed
         */
        public Long getGasUsed() {
            return this.gasUsed;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        /**
         * @return transTypeV10
         */
        public String getTransTypeV10() {
            return this.transTypeV10;
        }

        /**
         * @return transTypeV6
         */
        public String getTransTypeV6() {
            return this.transTypeV6;
        }

        public static final class Builder {
            private String alias; 
            private String blockHash; 
            private Integer category; 
            private Long createTime; 
            private String from; 
            private Long gasUsed; 
            private String hash; 
            private Long height; 
            private Integer referenceCount; 
            private String to; 
            private String transTypeV10; 
            private String transTypeV6; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * BlockHash.
             */
            public Builder blockHash(String blockHash) {
                this.blockHash = blockHash;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(Integer category) {
                this.category = category;
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
             * From.
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * GasUsed.
             */
            public Builder gasUsed(Long gasUsed) {
                this.gasUsed = gasUsed;
                return this;
            }

            /**
             * Hash.
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * ReferenceCount.
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * To.
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            /**
             * TransTypeV10.
             */
            public Builder transTypeV10(String transTypeV10) {
                this.transTypeV10 = transTypeV10;
                return this;
            }

            /**
             * TransTypeV6.
             */
            public Builder transTypeV6(String transTypeV6) {
                this.transTypeV6 = transTypeV6;
                return this;
            }

            public TransSummaryList build() {
                return new TransSummaryList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("BlockHash")
        private String blockHash;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("PreviousHash")
        private String previousHash;

        @com.aliyun.core.annotation.NameInMap("RootTxHash")
        private String rootTxHash;

        @com.aliyun.core.annotation.NameInMap("TransSummaryList")
        private java.util.List < TransSummaryList> transSummaryList;

        @com.aliyun.core.annotation.NameInMap("TransactionSize")
        private Integer transactionSize;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.blockHash = builder.blockHash;
            this.createTime = builder.createTime;
            this.height = builder.height;
            this.previousHash = builder.previousHash;
            this.rootTxHash = builder.rootTxHash;
            this.transSummaryList = builder.transSummaryList;
            this.transactionSize = builder.transactionSize;
            this.version = builder.version;
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
         * @return blockHash
         */
        public String getBlockHash() {
            return this.blockHash;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return previousHash
         */
        public String getPreviousHash() {
            return this.previousHash;
        }

        /**
         * @return rootTxHash
         */
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        /**
         * @return transSummaryList
         */
        public java.util.List < TransSummaryList> getTransSummaryList() {
            return this.transSummaryList;
        }

        /**
         * @return transactionSize
         */
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String antChainId; 
            private String blockHash; 
            private Long createTime; 
            private Integer height; 
            private String previousHash; 
            private String rootTxHash; 
            private java.util.List < TransSummaryList> transSummaryList; 
            private Integer transactionSize; 
            private Long version; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * BlockHash.
             */
            public Builder blockHash(String blockHash) {
                this.blockHash = blockHash;
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
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * PreviousHash.
             */
            public Builder previousHash(String previousHash) {
                this.previousHash = previousHash;
                return this;
            }

            /**
             * RootTxHash.
             */
            public Builder rootTxHash(String rootTxHash) {
                this.rootTxHash = rootTxHash;
                return this;
            }

            /**
             * TransSummaryList.
             */
            public Builder transSummaryList(java.util.List < TransSummaryList> transSummaryList) {
                this.transSummaryList = transSummaryList;
                return this;
            }

            /**
             * TransactionSize.
             */
            public Builder transactionSize(Integer transactionSize) {
                this.transactionSize = transactionSize;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
