// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMPCoSPhaseHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListMPCoSPhaseHistoryResponseBody</p>
 */
public class ListMPCoSPhaseHistoryResponseBody extends TeaModel {
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

    private ListMPCoSPhaseHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMPCoSPhaseHistoryResponseBody create() {
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

        public ListMPCoSPhaseHistoryResponseBody build() {
            return new ListMPCoSPhaseHistoryResponseBody(this);
        } 

    } 

    public static class PageData extends TeaModel {
        @NameInMap("BlockHash")
        private String blockHash;

        @NameInMap("BlockNumber")
        private Long blockNumber;

        @NameInMap("DataHash")
        private String dataHash;

        @NameInMap("DataSeq")
        private String dataSeq;

        @NameInMap("DataValue")
        private String dataValue;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("PreviousHash")
        private String previousHash;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TransactionHash")
        private String transactionHash;

        private PageData(Builder builder) {
            this.blockHash = builder.blockHash;
            this.blockNumber = builder.blockNumber;
            this.dataHash = builder.dataHash;
            this.dataSeq = builder.dataSeq;
            this.dataValue = builder.dataValue;
            this.iotId = builder.iotId;
            this.previousHash = builder.previousHash;
            this.productKey = builder.productKey;
            this.timestamp = builder.timestamp;
            this.transactionHash = builder.transactionHash;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
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
         * @return dataSeq
         */
        public String getDataSeq() {
            return this.dataSeq;
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
            private String dataSeq; 
            private String dataValue; 
            private String iotId; 
            private String previousHash; 
            private String productKey; 
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
             * DataSeq.
             */
            public Builder dataSeq(String dataSeq) {
                this.dataSeq = dataSeq;
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

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Num")
        private Integer num;

        @NameInMap("PageData")
        private java.util.List < PageData> pageData;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.num = builder.num;
            this.pageData = builder.pageData;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        /**
         * @return pageData
         */
        public java.util.List < PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer num; 
            private java.util.List < PageData> pageData; 
            private Integer size; 
            private Integer total; 

            /**
             * Num.
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            /**
             * PageData.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
