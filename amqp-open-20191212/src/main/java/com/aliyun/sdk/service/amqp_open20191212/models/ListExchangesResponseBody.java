// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListExchangesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExchangesResponseBody</p>
 */
public class ListExchangesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FEBA5E0C-50D0-4FA6-A794-4901E5465***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExchangesResponseBody build() {
            return new ListExchangesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExchangesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExchangesResponseBody</p>
     */
    public static class Exchanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, ?> attributes;

        @com.aliyun.core.annotation.NameInMap("AutoDeleteState")
        private Boolean autoDeleteState;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExchangeType")
        private String exchangeType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("VHostName")
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
        public java.util.Map<String, ?> getAttributes() {
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
            private java.util.Map<String, ?> attributes; 
            private Boolean autoDeleteState; 
            private Long createTime; 
            private String exchangeType; 
            private String name; 
            private String vHostName; 

            /**
             * <p>The attributes. This parameter is unavailable in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder attributes(java.util.Map<String, ?> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Indicates whether the exchange was automatically deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoDeleteState(Boolean autoDeleteState) {
                this.autoDeleteState = autoDeleteState;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the exchange was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1580886216000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The exchange type.</p>
             * 
             * <strong>example:</strong>
             * <p>DIRECT</p>
             */
            public Builder exchangeType(String exchangeType) {
                this.exchangeType = exchangeType;
                return this;
            }

            /**
             * <p>The exchange name.</p>
             * 
             * <strong>example:</strong>
             * <p>amq.direct</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The vhost name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link ListExchangesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExchangesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exchanges")
        private java.util.List<Exchanges> exchanges;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
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
        public java.util.List<Exchanges> getExchanges() {
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
            private java.util.List<Exchanges> exchanges; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * <p>The exchanges.</p>
             */
            public Builder exchanges(java.util.List<Exchanges> exchanges) {
                this.exchanges = exchanges;
                return this;
            }

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that marks the end of the current returned page.``</p>
             * <ul>
             * <li>If the value of this parameter is empty, the next query is not required and the token used to start the next query is unavailable.``</li>
             * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.``</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AAAANDQBYW1xcC1jbi03cHAybXdiY3AwMGEBdmhvc3QBAXNkZndhYWJhATE2NDkzMTM4OTU5NDIB4o3z1pPwWzk4aYuiRffi8R6-****</p>
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
