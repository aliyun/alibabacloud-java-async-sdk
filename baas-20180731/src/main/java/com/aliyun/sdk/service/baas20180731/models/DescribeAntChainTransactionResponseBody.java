// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainTransactionResponseBody</p>
 */
public class DescribeAntChainTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAntChainTransactionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionResponseBody create() {
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

        public DescribeAntChainTransactionResponseBody build() {
            return new DescribeAntChainTransactionResponseBody(this);
        } 

    } 

    public static class Transaction extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("Extentions")
        private java.util.List < String > extentions;

        @NameInMap("From")
        private String from;

        @NameInMap("Gas")
        private String gas;

        @NameInMap("Hash")
        private String hash;

        @NameInMap("Nonce")
        private String nonce;

        @NameInMap("Period")
        private Long period;

        @NameInMap("Signatures")
        private java.util.List < String > signatures;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("To")
        private String to;

        @NameInMap("TxType")
        private String txType;

        @NameInMap("Value")
        private String value;

        private Transaction(Builder builder) {
            this.data = builder.data;
            this.extentions = builder.extentions;
            this.from = builder.from;
            this.gas = builder.gas;
            this.hash = builder.hash;
            this.nonce = builder.nonce;
            this.period = builder.period;
            this.signatures = builder.signatures;
            this.timestamp = builder.timestamp;
            this.to = builder.to;
            this.txType = builder.txType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transaction create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return extentions
         */
        public java.util.List < String > getExtentions() {
            return this.extentions;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return gas
         */
        public String getGas() {
            return this.gas;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        /**
         * @return signatures
         */
        public java.util.List < String > getSignatures() {
            return this.signatures;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        /**
         * @return txType
         */
        public String getTxType() {
            return this.txType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String data; 
            private java.util.List < String > extentions; 
            private String from; 
            private String gas; 
            private String hash; 
            private String nonce; 
            private Long period; 
            private java.util.List < String > signatures; 
            private Long timestamp; 
            private String to; 
            private String txType; 
            private String value; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Extentions.
             */
            public Builder extentions(java.util.List < String > extentions) {
                this.extentions = extentions;
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
             * Gas.
             */
            public Builder gas(String gas) {
                this.gas = gas;
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
             * Nonce.
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * Signatures.
             */
            public Builder signatures(java.util.List < String > signatures) {
                this.signatures = signatures;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
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
             * TxType.
             */
            public Builder txType(String txType) {
                this.txType = txType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Transaction build() {
                return new Transaction(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("BlockHash")
        private String blockHash;

        @NameInMap("BlockHeight")
        private Long blockHeight;

        @NameInMap("BlockVersion")
        private String blockVersion;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Hash")
        private String hash;

        @NameInMap("Transaction")
        private Transaction transaction;

        private Result(Builder builder) {
            this.blockHash = builder.blockHash;
            this.blockHeight = builder.blockHeight;
            this.blockVersion = builder.blockVersion;
            this.createTime = builder.createTime;
            this.hash = builder.hash;
            this.transaction = builder.transaction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return blockHash
         */
        public String getBlockHash() {
            return this.blockHash;
        }

        /**
         * @return blockHeight
         */
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        /**
         * @return blockVersion
         */
        public String getBlockVersion() {
            return this.blockVersion;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return transaction
         */
        public Transaction getTransaction() {
            return this.transaction;
        }

        public static final class Builder {
            private String blockHash; 
            private Long blockHeight; 
            private String blockVersion; 
            private Long createTime; 
            private String hash; 
            private Transaction transaction; 

            /**
             * BlockHash.
             */
            public Builder blockHash(String blockHash) {
                this.blockHash = blockHash;
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
             * BlockVersion.
             */
            public Builder blockVersion(String blockVersion) {
                this.blockVersion = blockVersion;
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
             * Hash.
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * Transaction.
             */
            public Builder transaction(Transaction transaction) {
                this.transaction = transaction;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
