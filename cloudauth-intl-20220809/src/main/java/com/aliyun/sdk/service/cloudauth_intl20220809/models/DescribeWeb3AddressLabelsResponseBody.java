// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3AddressLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWeb3AddressLabelsResponseBody</p>
 */
public class DescribeWeb3AddressLabelsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeWeb3AddressLabelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWeb3AddressLabelsResponseBody create() {
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
         * The HTTP status code
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

        public DescribeWeb3AddressLabelsResponseBody build() {
            return new DescribeWeb3AddressLabelsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Balance")
        private String balance;

        @NameInMap("BalanceSymbol")
        private String balanceSymbol;

        @NameInMap("ChainName")
        private String chainName;

        @NameInMap("ChainShortName")
        private String chainShortName;

        @NameInMap("ContractAddress")
        private String contractAddress;

        @NameInMap("CreateContractAddress")
        private String createContractAddress;

        @NameInMap("CreateContractTransactionHash")
        private String createContractTransactionHash;

        @NameInMap("CustomRiskAssessment")
        private String customRiskAssessment;

        @NameInMap("FirstTransactionTime")
        private String firstTransactionTime;

        @NameInMap("IsProducerAddress")
        private String isProducerAddress;

        @NameInMap("LastTransactionTime")
        private String lastTransactionTime;

        @NameInMap("ReceiveAmount")
        private String receiveAmount;

        @NameInMap("SendAmount")
        private String sendAmount;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Token")
        private String token;

        @NameInMap("TokenAmount")
        private Integer tokenAmount;

        @NameInMap("TokenList")
        private String tokenList;

        @NameInMap("TransactionCount")
        private Integer transactionCount;

        private Data(Builder builder) {
            this.address = builder.address;
            this.balance = builder.balance;
            this.balanceSymbol = builder.balanceSymbol;
            this.chainName = builder.chainName;
            this.chainShortName = builder.chainShortName;
            this.contractAddress = builder.contractAddress;
            this.createContractAddress = builder.createContractAddress;
            this.createContractTransactionHash = builder.createContractTransactionHash;
            this.customRiskAssessment = builder.customRiskAssessment;
            this.firstTransactionTime = builder.firstTransactionTime;
            this.isProducerAddress = builder.isProducerAddress;
            this.lastTransactionTime = builder.lastTransactionTime;
            this.receiveAmount = builder.receiveAmount;
            this.sendAmount = builder.sendAmount;
            this.tag = builder.tag;
            this.token = builder.token;
            this.tokenAmount = builder.tokenAmount;
            this.tokenList = builder.tokenList;
            this.transactionCount = builder.transactionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return balance
         */
        public String getBalance() {
            return this.balance;
        }

        /**
         * @return balanceSymbol
         */
        public String getBalanceSymbol() {
            return this.balanceSymbol;
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
         * @return contractAddress
         */
        public String getContractAddress() {
            return this.contractAddress;
        }

        /**
         * @return createContractAddress
         */
        public String getCreateContractAddress() {
            return this.createContractAddress;
        }

        /**
         * @return createContractTransactionHash
         */
        public String getCreateContractTransactionHash() {
            return this.createContractTransactionHash;
        }

        /**
         * @return customRiskAssessment
         */
        public String getCustomRiskAssessment() {
            return this.customRiskAssessment;
        }

        /**
         * @return firstTransactionTime
         */
        public String getFirstTransactionTime() {
            return this.firstTransactionTime;
        }

        /**
         * @return isProducerAddress
         */
        public String getIsProducerAddress() {
            return this.isProducerAddress;
        }

        /**
         * @return lastTransactionTime
         */
        public String getLastTransactionTime() {
            return this.lastTransactionTime;
        }

        /**
         * @return receiveAmount
         */
        public String getReceiveAmount() {
            return this.receiveAmount;
        }

        /**
         * @return sendAmount
         */
        public String getSendAmount() {
            return this.sendAmount;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return tokenAmount
         */
        public Integer getTokenAmount() {
            return this.tokenAmount;
        }

        /**
         * @return tokenList
         */
        public String getTokenList() {
            return this.tokenList;
        }

        /**
         * @return transactionCount
         */
        public Integer getTransactionCount() {
            return this.transactionCount;
        }

        public static final class Builder {
            private String address; 
            private String balance; 
            private String balanceSymbol; 
            private String chainName; 
            private String chainShortName; 
            private String contractAddress; 
            private String createContractAddress; 
            private String createContractTransactionHash; 
            private String customRiskAssessment; 
            private String firstTransactionTime; 
            private String isProducerAddress; 
            private String lastTransactionTime; 
            private String receiveAmount; 
            private String sendAmount; 
            private String tag; 
            private String token; 
            private Integer tokenAmount; 
            private String tokenList; 
            private Integer transactionCount; 

            /**
             * address
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * amount of native currency
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * native currency of the chain
             */
            public Builder balanceSymbol(String balanceSymbol) {
                this.balanceSymbol = balanceSymbol;
                return this;
            }

            /**
             * ChainNameEnumstring name of blockchain
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * ChainShortName
             */
            public Builder chainShortName(String chainShortName) {
                this.chainShortName = chainShortName;
                return this;
            }

            /**
             * 0: EOA; 1: Contract
             */
            public Builder contractAddress(String contractAddress) {
                this.contractAddress = contractAddress;
                return this;
            }

            /**
             * the address of deployer if the current address is a contract, null if the current address is an EOA
             */
            public Builder createContractAddress(String createContractAddress) {
                this.createContractAddress = createContractAddress;
                return this;
            }

            /**
             * contract creation hash if the current address is a contract, null if the current address is an EOA
             */
            public Builder createContractTransactionHash(String createContractTransactionHash) {
                this.createContractTransactionHash = createContractTransactionHash;
                return this;
            }

            /**
             * customized assessment detail
             */
            public Builder customRiskAssessment(String customRiskAssessment) {
                this.customRiskAssessment = customRiskAssessment;
                return this;
            }

            /**
             * the first transaction hash sent by the address
             */
            public Builder firstTransactionTime(String firstTransactionTime) {
                this.firstTransactionTime = firstTransactionTime;
                return this;
            }

            /**
             * 0: Not validator; 1: validator
             */
            public Builder isProducerAddress(String isProducerAddress) {
                this.isProducerAddress = isProducerAddress;
                return this;
            }

            /**
             * the latest transaction hash sent by the address
             */
            public Builder lastTransactionTime(String lastTransactionTime) {
                this.lastTransactionTime = lastTransactionTime;
                return this;
            }

            /**
             * the amount of native currency received in 180 days
             */
            public Builder receiveAmount(String receiveAmount) {
                this.receiveAmount = receiveAmount;
                return this;
            }

            /**
             * the amount of native currency sent in 180 days
             */
            public Builder sendAmount(String sendAmount) {
                this.sendAmount = sendAmount;
                return this;
            }

            /**
             * tag
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * if the address is an erc20 token, returns the token name
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * the number of erc20 tokens involved with current address in 180 days
             */
            public Builder tokenAmount(Integer tokenAmount) {
                this.tokenAmount = tokenAmount;
                return this;
            }

            /**
             * address of erc20 tokens involved with current address in 180 days
             */
            public Builder tokenList(String tokenList) {
                this.tokenList = tokenList;
                return this;
            }

            /**
             * the number of transactions
             */
            public Builder transactionCount(Integer transactionCount) {
                this.transactionCount = transactionCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
