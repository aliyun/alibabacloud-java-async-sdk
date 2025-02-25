// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBlockResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBlockResponseBody</p>
 */
public class QueryBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private QueryBlockResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlockResponseBody create() {
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

        public QueryBlockResponseBody build() {
            return new QueryBlockResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

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
        private String transSummaryList;

        @com.aliyun.core.annotation.NameInMap("TransactionSize")
        private Integer transactionSize;

        private Result(Builder builder) {
            this.alias = builder.alias;
            this.blockHash = builder.blockHash;
            this.createTime = builder.createTime;
            this.height = builder.height;
            this.previousHash = builder.previousHash;
            this.rootTxHash = builder.rootTxHash;
            this.transSummaryList = builder.transSummaryList;
            this.transactionSize = builder.transactionSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
        public String getTransSummaryList() {
            return this.transSummaryList;
        }

        /**
         * @return transactionSize
         */
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

        public static final class Builder {
            private String alias; 
            private String blockHash; 
            private Long createTime; 
            private Integer height; 
            private String previousHash; 
            private String rootTxHash; 
            private String transSummaryList; 
            private Integer transactionSize; 

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
            public Builder transSummaryList(String transSummaryList) {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
