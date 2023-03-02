// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSPhaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMPCoSPhaseInfoResponseBody</p>
 */
public class DescribeMPCoSPhaseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMPCoSPhaseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPCoSPhaseInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMPCoSPhaseInfoResponseBody build() {
            return new DescribeMPCoSPhaseInfoResponseBody(this);
        } 

    } 

    public static class RelatedDataList extends TeaModel {
        @NameInMap("RelatedDataKey")
        private String relatedDataKey;

        @NameInMap("RelatedDataSeq")
        private String relatedDataSeq;

        @NameInMap("RelatedPhaseDataHash")
        private String relatedPhaseDataHash;

        @NameInMap("RelatedPhaseId")
        private String relatedPhaseId;

        @NameInMap("RelatedPhaseName")
        private String relatedPhaseName;

        private RelatedDataList(Builder builder) {
            this.relatedDataKey = builder.relatedDataKey;
            this.relatedDataSeq = builder.relatedDataSeq;
            this.relatedPhaseDataHash = builder.relatedPhaseDataHash;
            this.relatedPhaseId = builder.relatedPhaseId;
            this.relatedPhaseName = builder.relatedPhaseName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedDataList create() {
            return builder().build();
        }

        /**
         * @return relatedDataKey
         */
        public String getRelatedDataKey() {
            return this.relatedDataKey;
        }

        /**
         * @return relatedDataSeq
         */
        public String getRelatedDataSeq() {
            return this.relatedDataSeq;
        }

        /**
         * @return relatedPhaseDataHash
         */
        public String getRelatedPhaseDataHash() {
            return this.relatedPhaseDataHash;
        }

        /**
         * @return relatedPhaseId
         */
        public String getRelatedPhaseId() {
            return this.relatedPhaseId;
        }

        /**
         * @return relatedPhaseName
         */
        public String getRelatedPhaseName() {
            return this.relatedPhaseName;
        }

        public static final class Builder {
            private String relatedDataKey; 
            private String relatedDataSeq; 
            private String relatedPhaseDataHash; 
            private String relatedPhaseId; 
            private String relatedPhaseName; 

            /**
             * RelatedDataKey.
             */
            public Builder relatedDataKey(String relatedDataKey) {
                this.relatedDataKey = relatedDataKey;
                return this;
            }

            /**
             * RelatedDataSeq.
             */
            public Builder relatedDataSeq(String relatedDataSeq) {
                this.relatedDataSeq = relatedDataSeq;
                return this;
            }

            /**
             * RelatedPhaseDataHash.
             */
            public Builder relatedPhaseDataHash(String relatedPhaseDataHash) {
                this.relatedPhaseDataHash = relatedPhaseDataHash;
                return this;
            }

            /**
             * RelatedPhaseId.
             */
            public Builder relatedPhaseId(String relatedPhaseId) {
                this.relatedPhaseId = relatedPhaseId;
                return this;
            }

            /**
             * RelatedPhaseName.
             */
            public Builder relatedPhaseName(String relatedPhaseName) {
                this.relatedPhaseName = relatedPhaseName;
                return this;
            }

            public RelatedDataList build() {
                return new RelatedDataList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BlockHash")
        private String blockHash;

        @NameInMap("BlockNumber")
        private Long blockNumber;

        @NameInMap("DataHash")
        private String dataHash;

        @NameInMap("DataValue")
        private String dataValue;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("PreviousHash")
        private String previousHash;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("RelatedDataList")
        private java.util.List < RelatedDataList> relatedDataList;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TransactionHash")
        private String transactionHash;

        private Data(Builder builder) {
            this.blockHash = builder.blockHash;
            this.blockNumber = builder.blockNumber;
            this.dataHash = builder.dataHash;
            this.dataValue = builder.dataValue;
            this.iotId = builder.iotId;
            this.previousHash = builder.previousHash;
            this.productKey = builder.productKey;
            this.relatedDataList = builder.relatedDataList;
            this.timestamp = builder.timestamp;
            this.transactionHash = builder.transactionHash;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockHash
         */
        public String getBlockHash() {
            return this.blockHash;
        }

        /**
         * @return blockNumber
         */
        public Long getBlockNumber() {
            return this.blockNumber;
        }

        /**
         * @return dataHash
         */
        public String getDataHash() {
            return this.dataHash;
        }

        /**
         * @return dataValue
         */
        public String getDataValue() {
            return this.dataValue;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return previousHash
         */
        public String getPreviousHash() {
            return this.previousHash;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return relatedDataList
         */
        public java.util.List < RelatedDataList> getRelatedDataList() {
            return this.relatedDataList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return transactionHash
         */
        public String getTransactionHash() {
            return this.transactionHash;
        }

        public static final class Builder {
            private String blockHash; 
            private Long blockNumber; 
            private String dataHash; 
            private String dataValue; 
            private String iotId; 
            private String previousHash; 
            private String productKey; 
            private java.util.List < RelatedDataList> relatedDataList; 
            private Long timestamp; 
            private String transactionHash; 

            /**
             * BlockHash.
             */
            public Builder blockHash(String blockHash) {
                this.blockHash = blockHash;
                return this;
            }

            /**
             * BlockNumber.
             */
            public Builder blockNumber(Long blockNumber) {
                this.blockNumber = blockNumber;
                return this;
            }

            /**
             * DataHash.
             */
            public Builder dataHash(String dataHash) {
                this.dataHash = dataHash;
                return this;
            }

            /**
             * DataValue.
             */
            public Builder dataValue(String dataValue) {
                this.dataValue = dataValue;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
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
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * RelatedDataList.
             */
            public Builder relatedDataList(java.util.List < RelatedDataList> relatedDataList) {
                this.relatedDataList = relatedDataList;
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
             * TransactionHash.
             */
            public Builder transactionHash(String transactionHash) {
                this.transactionHash = transactionHash;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
