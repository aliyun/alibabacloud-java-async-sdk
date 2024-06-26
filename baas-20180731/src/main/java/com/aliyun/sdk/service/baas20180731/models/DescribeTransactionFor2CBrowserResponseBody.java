// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransactionFor2CBrowserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransactionFor2CBrowserResponseBody</p>
 */
public class DescribeTransactionFor2CBrowserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeTransactionFor2CBrowserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransactionFor2CBrowserResponseBody create() {
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

        public DescribeTransactionFor2CBrowserResponseBody build() {
            return new DescribeTransactionFor2CBrowserResponseBody(this);
        } 

    } 

    public static class TransactionV10 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Extentions")
        private java.util.List < String > extentions;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("Gas")
        private String gas;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("Nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("SignatureList")
        private java.util.List < String > signatureList;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        @com.aliyun.core.annotation.NameInMap("TxType")
        private String txType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TransactionV10(Builder builder) {
            this.data = builder.data;
            this.extentions = builder.extentions;
            this.from = builder.from;
            this.gas = builder.gas;
            this.hash = builder.hash;
            this.nonce = builder.nonce;
            this.period = builder.period;
            this.signatureList = builder.signatureList;
            this.timestamp = builder.timestamp;
            this.to = builder.to;
            this.txType = builder.txType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransactionV10 create() {
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
         * @return signatureList
         */
        public java.util.List < String > getSignatureList() {
            return this.signatureList;
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
            private java.util.List < String > signatureList; 
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
             * SignatureList.
             */
            public Builder signatureList(java.util.List < String > signatureList) {
                this.signatureList = signatureList;
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

            public TransactionV10 build() {
                return new TransactionV10(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockHash")
        private String blockHash;

        @com.aliyun.core.annotation.NameInMap("BlockHeight")
        private Long blockHeight;

        @com.aliyun.core.annotation.NameInMap("BlockVersion")
        private Integer blockVersion;

        @com.aliyun.core.annotation.NameInMap("Category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentHash")
        private String contentHash;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyWrap")
        private String keyWrap;

        @com.aliyun.core.annotation.NameInMap("Nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("ReferenceList")
        private java.util.List < String > referenceList;

        @com.aliyun.core.annotation.NameInMap("TransTypeV6")
        private String transTypeV6;

        @com.aliyun.core.annotation.NameInMap("TransactionV10")
        private TransactionV10 transactionV10;

        private Result(Builder builder) {
            this.blockHash = builder.blockHash;
            this.blockHeight = builder.blockHeight;
            this.blockVersion = builder.blockVersion;
            this.category = builder.category;
            this.content = builder.content;
            this.contentHash = builder.contentHash;
            this.createTime = builder.createTime;
            this.hash = builder.hash;
            this.keyName = builder.keyName;
            this.keyWrap = builder.keyWrap;
            this.nonce = builder.nonce;
            this.referenceCount = builder.referenceCount;
            this.referenceList = builder.referenceList;
            this.transTypeV6 = builder.transTypeV6;
            this.transactionV10 = builder.transactionV10;
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
        public Integer getBlockVersion() {
            return this.blockVersion;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentHash
         */
        public String getContentHash() {
            return this.contentHash;
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
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyWrap
         */
        public String getKeyWrap() {
            return this.keyWrap;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return referenceList
         */
        public java.util.List < String > getReferenceList() {
            return this.referenceList;
        }

        /**
         * @return transTypeV6
         */
        public String getTransTypeV6() {
            return this.transTypeV6;
        }

        /**
         * @return transactionV10
         */
        public TransactionV10 getTransactionV10() {
            return this.transactionV10;
        }

        public static final class Builder {
            private String blockHash; 
            private Long blockHeight; 
            private Integer blockVersion; 
            private Integer category; 
            private String content; 
            private String contentHash; 
            private Long createTime; 
            private String hash; 
            private String keyName; 
            private String keyWrap; 
            private String nonce; 
            private Integer referenceCount; 
            private java.util.List < String > referenceList; 
            private String transTypeV6; 
            private TransactionV10 transactionV10; 

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
            public Builder blockVersion(Integer blockVersion) {
                this.blockVersion = blockVersion;
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentHash.
             */
            public Builder contentHash(String contentHash) {
                this.contentHash = contentHash;
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
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * KeyWrap.
             */
            public Builder keyWrap(String keyWrap) {
                this.keyWrap = keyWrap;
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
             * ReferenceCount.
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * ReferenceList.
             */
            public Builder referenceList(java.util.List < String > referenceList) {
                this.referenceList = referenceList;
                return this;
            }

            /**
             * TransTypeV6.
             */
            public Builder transTypeV6(String transTypeV6) {
                this.transTypeV6 = transTypeV6;
                return this;
            }

            /**
             * TransactionV10.
             */
            public Builder transactionV10(TransactionV10 transactionV10) {
                this.transactionV10 = transactionV10;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
