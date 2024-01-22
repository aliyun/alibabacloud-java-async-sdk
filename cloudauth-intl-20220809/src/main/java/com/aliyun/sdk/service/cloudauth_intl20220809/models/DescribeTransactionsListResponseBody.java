// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransactionsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransactionsListResponseBody</p>
 */
public class DescribeTransactionsListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeTransactionsListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransactionsListResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Id of the request
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

        public DescribeTransactionsListResponseBody build() {
            return new DescribeTransactionsListResponseBody(this);
        } 

    } 

    public static class In extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Amount")
        private Float amount;

        @NameInMap("Label")
        private String label;

        @NameInMap("TxHashList")
        private java.util.List < String > txHashList;

        @NameInMap("Type")
        private Integer type;

        private In(Builder builder) {
            this.address = builder.address;
            this.amount = builder.amount;
            this.label = builder.label;
            this.txHashList = builder.txHashList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static In create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return amount
         */
        public Float getAmount() {
            return this.amount;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return txHashList
         */
        public java.util.List < String > getTxHashList() {
            return this.txHashList;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private Float amount; 
            private String label; 
            private java.util.List < String > txHashList; 
            private Integer type; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * TxHashList.
             */
            public Builder txHashList(java.util.List < String > txHashList) {
                this.txHashList = txHashList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public In build() {
                return new In(this);
            } 

        } 

    }
    public static class Out extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Amount")
        private Float amount;

        @NameInMap("Label")
        private String label;

        @NameInMap("TxHashList")
        private java.util.List < String > txHashList;

        @NameInMap("Type")
        private Integer type;

        private Out(Builder builder) {
            this.address = builder.address;
            this.amount = builder.amount;
            this.label = builder.label;
            this.txHashList = builder.txHashList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Out create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return amount
         */
        public Float getAmount() {
            return this.amount;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return txHashList
         */
        public java.util.List < String > getTxHashList() {
            return this.txHashList;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private Float amount; 
            private String label; 
            private java.util.List < String > txHashList; 
            private Integer type; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * TxHashList.
             */
            public Builder txHashList(java.util.List < String > txHashList) {
                this.txHashList = txHashList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Out build() {
                return new Out(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("In")
        private java.util.List < In> in;

        @NameInMap("Out")
        private java.util.List < Out> out;

        @NameInMap("Page")
        private Long page;

        @NameInMap("TotalPages")
        private Long totalPages;

        @NameInMap("TransactionsOnPage")
        private Long transactionsOnPage;

        private Data(Builder builder) {
            this.in = builder.in;
            this.out = builder.out;
            this.page = builder.page;
            this.totalPages = builder.totalPages;
            this.transactionsOnPage = builder.transactionsOnPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return in
         */
        public java.util.List < In> getIn() {
            return this.in;
        }

        /**
         * @return out
         */
        public java.util.List < Out> getOut() {
            return this.out;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        /**
         * @return transactionsOnPage
         */
        public Long getTransactionsOnPage() {
            return this.transactionsOnPage;
        }

        public static final class Builder {
            private java.util.List < In> in; 
            private java.util.List < Out> out; 
            private Long page; 
            private Long totalPages; 
            private Long transactionsOnPage; 

            /**
             * In.
             */
            public Builder in(java.util.List < In> in) {
                this.in = in;
                return this;
            }

            /**
             * Out.
             */
            public Builder out(java.util.List < Out> out) {
                this.out = out;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            /**
             * TransactionsOnPage.
             */
            public Builder transactionsOnPage(Long transactionsOnPage) {
                this.transactionsOnPage = transactionsOnPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
