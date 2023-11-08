// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExchangesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExchangesResponseBody</p>
 */
public class ListExchangesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListExchangesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExchangesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExchangesResponseBody build() {
            return new ListExchangesResponseBody(this);
        } 

    } 

    public static class Exchanges extends TeaModel {
        @NameInMap("Attributes")
        private java.util.Map < String, ? > attributes;

        @NameInMap("AutoDeleteState")
        private Boolean autoDeleteState;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ExchangeType")
        private String exchangeType;

        @NameInMap("Name")
        private String name;

        @NameInMap("VHostName")
        private String vHostName;

        private Exchanges(Builder builder) {
            this.attributes = builder.attributes;
            this.autoDeleteState = builder.autoDeleteState;
            this.createTime = builder.createTime;
            this.exchangeType = builder.exchangeType;
            this.name = builder.name;
            this.vHostName = builder.vHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exchanges create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.Map < String, ? > getAttributes() {
            return this.attributes;
        }

        /**
         * @return autoDeleteState
         */
        public Boolean getAutoDeleteState() {
            return this.autoDeleteState;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return exchangeType
         */
        public String getExchangeType() {
            return this.exchangeType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vHostName
         */
        public String getVHostName() {
            return this.vHostName;
        }

        public static final class Builder {
            private java.util.Map < String, ? > attributes; 
            private Boolean autoDeleteState; 
            private Long createTime; 
            private String exchangeType; 
            private String name; 
            private String vHostName; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.Map < String, ? > attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * AutoDeleteState.
             */
            public Builder autoDeleteState(Boolean autoDeleteState) {
                this.autoDeleteState = autoDeleteState;
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
             * ExchangeType.
             */
            public Builder exchangeType(String exchangeType) {
                this.exchangeType = exchangeType;
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
             * VHostName.
             */
            public Builder vHostName(String vHostName) {
                this.vHostName = vHostName;
                return this;
            }

            public Exchanges build() {
                return new Exchanges(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Exchanges")
        private java.util.List < Exchanges> exchanges;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.exchanges = builder.exchanges;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return exchanges
         */
        public java.util.List < Exchanges> getExchanges() {
            return this.exchanges;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < Exchanges> exchanges; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * Exchange。
             */
            public Builder exchanges(java.util.List < Exchanges> exchanges) {
                this.exchanges = exchanges;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
