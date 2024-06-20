// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3TransactionLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWeb3TransactionLabelsResponseBody</p>
 */
public class DescribeWeb3TransactionLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWeb3TransactionLabelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWeb3TransactionLabelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Return code. For the full list of codes, see Codes and Messages.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Response detailed message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The unique ID of the request, which can be used to locate issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWeb3TransactionLabelsResponseBody build() {
            return new DescribeWeb3TransactionLabelsResponseBody(this);
        } 

    } 

    public static class ContractDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("GasLimit")
        private Integer gasLimit;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private ContractDetails(Builder builder) {
            this.amount = builder.amount;
            this.from = builder.from;
            this.gasLimit = builder.gasLimit;
            this.index = builder.index;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContractDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return gasLimit
         */
        public Integer getGasLimit() {
            return this.gasLimit;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        public static final class Builder {
            private String amount; 
            private String from; 
            private Integer gasLimit; 
            private Integer index; 
            private String to; 

            /**
             * the value of internal transaction
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * the sender of internal transaction
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * the gaslimit of internal transaction
             */
            public Builder gasLimit(Integer gasLimit) {
                this.gasLimit = gasLimit;
                return this;
            }

            /**
             * the call layer of internal transaction
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * the receiver of internal transaction
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public ContractDetails build() {
                return new ContractDetails(this);
            } 

        } 

    }
    public static class InputDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("InputHash")
        private String inputHash;

        @com.aliyun.core.annotation.NameInMap("IsContract")
        private String isContract;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private InputDetails(Builder builder) {
            this.amount = builder.amount;
            this.inputHash = builder.inputHash;
            this.isContract = builder.isContract;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return inputHash
         */
        public String getInputHash() {
            return this.inputHash;
        }

        /**
         * @return isContract
         */
        public String getIsContract() {
            return this.isContract;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Integer amount; 
            private String inputHash; 
            private String isContract; 
            private String tag; 

            /**
             * example: 15. the amount of transation sent by the address
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * the address hash
             */
            public Builder inputHash(String inputHash) {
                this.inputHash = inputHash;
                return this;
            }

            /**
             * example: true. is it a contract
             */
            public Builder isContract(String isContract) {
                this.isContract = isContract;
                return this;
            }

            /**
             * example: Dex . the tag of the address
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public InputDetails build() {
                return new InputDetails(this);
            } 

        } 

    }
    public static class OutputDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("InputHash")
        private String inputHash;

        @com.aliyun.core.annotation.NameInMap("IsContract")
        private String isContract;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private OutputDetails(Builder builder) {
            this.amount = builder.amount;
            this.inputHash = builder.inputHash;
            this.isContract = builder.isContract;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return inputHash
         */
        public String getInputHash() {
            return this.inputHash;
        }

        /**
         * @return isContract
         */
        public String getIsContract() {
            return this.isContract;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Integer amount; 
            private String inputHash; 
            private String isContract; 
            private String tag; 

            /**
             * example: 15. the amount of transation sent by the address
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * the address hash
             */
            public Builder inputHash(String inputHash) {
                this.inputHash = inputHash;
                return this;
            }

            /**
             * example: true. is it a contract
             */
            public Builder isContract(String isContract) {
                this.isContract = isContract;
                return this;
            }

            /**
             * example: Dex. the tag of the address
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public OutputDetails build() {
                return new OutputDetails(this);
            } 

        } 

    }
    public static class TokenTransferDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Symbol")
        private String symbol;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("TokenContractAddress")
        private String tokenContractAddress;

        @com.aliyun.core.annotation.NameInMap("TokenId")
        private String tokenId;

        private TokenTransferDetails(Builder builder) {
            this.amount = builder.amount;
            this.from = builder.from;
            this.index = builder.index;
            this.symbol = builder.symbol;
            this.to = builder.to;
            this.token = builder.token;
            this.tokenContractAddress = builder.tokenContractAddress;
            this.tokenId = builder.tokenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenTransferDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return tokenContractAddress
         */
        public String getTokenContractAddress() {
            return this.tokenContractAddress;
        }

        /**
         * @return tokenId
         */
        public String getTokenId() {
            return this.tokenId;
        }

        public static final class Builder {
            private String amount; 
            private String from; 
            private Integer index; 
            private String symbol; 
            private String to; 
            private String token; 
            private String tokenContractAddress; 
            private String tokenId; 

            /**
             * the token amount
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * the sender of the token
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * the call layer of to token transfer
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * the token symbol
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * the receiver of the token
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            /**
             * the token name
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * the token address
             */
            public Builder tokenContractAddress(String tokenContractAddress) {
                this.tokenContractAddress = tokenContractAddress;
                return this;
            }

            /**
             * NFT ID, if the token is erc721
             */
            public Builder tokenId(String tokenId) {
                this.tokenId = tokenId;
                return this;
            }

            public TokenTransferDetails build() {
                return new TokenTransferDetails(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("ChainName")
        private String chainName;

        @com.aliyun.core.annotation.NameInMap("ChainShortName")
        private String chainShortName;

        @com.aliyun.core.annotation.NameInMap("ContractDetails")
        private java.util.List < ContractDetails> contractDetails;

        @com.aliyun.core.annotation.NameInMap("ErrorLog")
        private String errorLog;

        @com.aliyun.core.annotation.NameInMap("GasLimit")
        private Integer gasLimit;

        @com.aliyun.core.annotation.NameInMap("GasPrice")
        private String gasPrice;

        @com.aliyun.core.annotation.NameInMap("GasUsed")
        private Integer gasUsed;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("InputData")
        private String inputData;

        @com.aliyun.core.annotation.NameInMap("InputDetails")
        private java.util.List < InputDetails> inputDetails;

        @com.aliyun.core.annotation.NameInMap("MethodId")
        private String methodId;

        @com.aliyun.core.annotation.NameInMap("Nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("OutputDetails")
        private java.util.List < OutputDetails> outputDetails;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("TokenTransferDetails")
        private java.util.List < TokenTransferDetails> tokenTransferDetails;

        @com.aliyun.core.annotation.NameInMap("TransactionSymbol")
        private String transactionSymbol;

        @com.aliyun.core.annotation.NameInMap("TransactionTime")
        private String transactionTime;

        @com.aliyun.core.annotation.NameInMap("TransactionType")
        private String transactionType;

        @com.aliyun.core.annotation.NameInMap("Txfee")
        private String txfee;

        @com.aliyun.core.annotation.NameInMap("Txid")
        private String txid;

        private Data(Builder builder) {
            this.amount = builder.amount;
            this.chainName = builder.chainName;
            this.chainShortName = builder.chainShortName;
            this.contractDetails = builder.contractDetails;
            this.errorLog = builder.errorLog;
            this.gasLimit = builder.gasLimit;
            this.gasPrice = builder.gasPrice;
            this.gasUsed = builder.gasUsed;
            this.height = builder.height;
            this.index = builder.index;
            this.inputData = builder.inputData;
            this.inputDetails = builder.inputDetails;
            this.methodId = builder.methodId;
            this.nonce = builder.nonce;
            this.outputDetails = builder.outputDetails;
            this.state = builder.state;
            this.tokenTransferDetails = builder.tokenTransferDetails;
            this.transactionSymbol = builder.transactionSymbol;
            this.transactionTime = builder.transactionTime;
            this.transactionType = builder.transactionType;
            this.txfee = builder.txfee;
            this.txid = builder.txid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return chainName
         */
        public String getChainName() {
            return this.chainName;
        }

        /**
         * @return chainShortName
         */
        public String getChainShortName() {
            return this.chainShortName;
        }

        /**
         * @return contractDetails
         */
        public java.util.List < ContractDetails> getContractDetails() {
            return this.contractDetails;
        }

        /**
         * @return errorLog
         */
        public String getErrorLog() {
            return this.errorLog;
        }

        /**
         * @return gasLimit
         */
        public Integer getGasLimit() {
            return this.gasLimit;
        }

        /**
         * @return gasPrice
         */
        public String getGasPrice() {
            return this.gasPrice;
        }

        /**
         * @return gasUsed
         */
        public Integer getGasUsed() {
            return this.gasUsed;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return inputData
         */
        public String getInputData() {
            return this.inputData;
        }

        /**
         * @return inputDetails
         */
        public java.util.List < InputDetails> getInputDetails() {
            return this.inputDetails;
        }

        /**
         * @return methodId
         */
        public String getMethodId() {
            return this.methodId;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return outputDetails
         */
        public java.util.List < OutputDetails> getOutputDetails() {
            return this.outputDetails;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return tokenTransferDetails
         */
        public java.util.List < TokenTransferDetails> getTokenTransferDetails() {
            return this.tokenTransferDetails;
        }

        /**
         * @return transactionSymbol
         */
        public String getTransactionSymbol() {
            return this.transactionSymbol;
        }

        /**
         * @return transactionTime
         */
        public String getTransactionTime() {
            return this.transactionTime;
        }

        /**
         * @return transactionType
         */
        public String getTransactionType() {
            return this.transactionType;
        }

        /**
         * @return txfee
         */
        public String getTxfee() {
            return this.txfee;
        }

        /**
         * @return txid
         */
        public String getTxid() {
            return this.txid;
        }

        public static final class Builder {
            private String amount; 
            private String chainName; 
            private String chainShortName; 
            private java.util.List < ContractDetails> contractDetails; 
            private String errorLog; 
            private Integer gasLimit; 
            private String gasPrice; 
            private Integer gasUsed; 
            private Integer height; 
            private Integer index; 
            private String inputData; 
            private java.util.List < InputDetails> inputDetails; 
            private String methodId; 
            private String nonce; 
            private java.util.List < OutputDetails> outputDetails; 
            private Integer state; 
            private java.util.List < TokenTransferDetails> tokenTransferDetails; 
            private String transactionSymbol; 
            private String transactionTime; 
            private String transactionType; 
            private String txfee; 
            private String txid; 

            /**
             * the amount of native currency
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * chainName
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * short name of blockchain
             */
            public Builder chainShortName(String chainShortName) {
                this.chainShortName = chainShortName;
                return this;
            }

            /**
             * contract details
             */
            public Builder contractDetails(java.util.List < ContractDetails> contractDetails) {
                this.contractDetails = contractDetails;
                return this;
            }

            /**
             * error log
             */
            public Builder errorLog(String errorLog) {
                this.errorLog = errorLog;
                return this;
            }

            /**
             * gasLimit
             */
            public Builder gasLimit(Integer gasLimit) {
                this.gasLimit = gasLimit;
                return this;
            }

            /**
             * gasPrice
             */
            public Builder gasPrice(String gasPrice) {
                this.gasPrice = gasPrice;
                return this;
            }

            /**
             * gasUsed
             */
            public Builder gasUsed(Integer gasUsed) {
                this.gasUsed = gasUsed;
                return this;
            }

            /**
             * height
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * the position of the transaction in the block
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * input data
             */
            public Builder inputData(String inputData) {
                this.inputData = inputData;
                return this;
            }

            /**
             * input details
             */
            public Builder inputDetails(java.util.List < InputDetails> inputDetails) {
                this.inputDetails = inputDetails;
                return this;
            }

            /**
             * the method name of contract call. For external transaction method: [\"CALL\",\"CALLCODE\",\"DELEGATECALL\",\"STATICCALL\"]; for internal transaction method: the first 4 bytes of the hash of the method name
             */
            public Builder methodId(String methodId) {
                this.methodId = methodId;
                return this;
            }

            /**
             * nonce
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * output details
             */
            public Builder outputDetails(java.util.List < OutputDetails> outputDetails) {
                this.outputDetails = outputDetails;
                return this;
            }

            /**
             * the transaction state. 1: success 0: fail
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * token transfer details
             */
            public Builder tokenTransferDetails(java.util.List < TokenTransferDetails> tokenTransferDetails) {
                this.tokenTransferDetails = tokenTransferDetails;
                return this;
            }

            /**
             * the symbol of native currency
             */
            public Builder transactionSymbol(String transactionSymbol) {
                this.transactionSymbol = transactionSymbol;
                return this;
            }

            /**
             * the block timestamp
             */
            public Builder transactionTime(String transactionTime) {
                this.transactionTime = transactionTime;
                return this;
            }

            /**
             * Integer	0: legacy; 1: eip 2930; 2: eip 1559
             */
            public Builder transactionType(String transactionType) {
                this.transactionType = transactionType;
                return this;
            }

            /**
             * the transaction fee in eth
             */
            public Builder txfee(String txfee) {
                this.txfee = txfee;
                return this;
            }

            /**
             * Txid
             */
            public Builder txid(String txid) {
                this.txid = txid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
