// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link ListEventRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventRulesResponseBody</p>
 */
public class ListEventRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEventRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListEventRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06273500-249F-5863-121D-74D51123E62C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEventRulesResponseBody build() {
            return new ListEventRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("EndpointValue")
        private String endpointValue;

        private Endpoint(Builder builder) {
            this.endpointType = builder.endpointType;
            this.endpointValue = builder.endpointValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointValue
         */
        public String getEndpointValue() {
            return this.endpointValue;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointValue; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.endpointType = model.endpointType;
                this.endpointValue = model.endpointValue;
            } 

            /**
             * <p>The endpoint type. Valid values:</p>
             * <ul>
             * <li><p><strong>topic</strong>: A topic can deliver messages to multiple subscribers. You can add or remove subscribers later.</p>
             * </li>
             * <li><p><strong>queue</strong>: Messages are delivered directly to a queue. This simplifies the delivery path, but you cannot add new subscribers later.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topic</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The actual value of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test-topic</p>
             */
            public Builder endpointValue(String endpointValue) {
                this.endpointValue = endpointValue;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class Subscriptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("EndpointValue")
        private String endpointValue;

        private Subscriptions(Builder builder) {
            this.endpointType = builder.endpointType;
            this.endpointValue = builder.endpointValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscriptions create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointValue
         */
        public String getEndpointValue() {
            return this.endpointValue;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointValue; 

            private Builder() {
            } 

            private Builder(Subscriptions model) {
                this.endpointType = model.endpointType;
                this.endpointValue = model.endpointValue;
            } 

            /**
             * <p>The endpoint type.</p>
             * 
             * <strong>example:</strong>
             * <p>queue</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The actual value of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>wyx-vp-complete-queue</p>
             */
            public Builder endpointValue(String endpointValue) {
                this.endpointValue = endpointValue;
                return this;
            }

            public Subscriptions build() {
                return new Subscriptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryMode")
        private String deliveryMode;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private Endpoint endpoint;

        @com.aliyun.core.annotation.NameInMap("EventTypes")
        private java.util.List<String> eventTypes;

        @com.aliyun.core.annotation.NameInMap("MatchRules")
        private java.util.List<java.util.List<EventMatchRule>> matchRules;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Subscriptions")
        private java.util.List<Subscriptions> subscriptions;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private PageData(Builder builder) {
            this.deliveryMode = builder.deliveryMode;
            this.endpoint = builder.endpoint;
            this.eventTypes = builder.eventTypes;
            this.matchRules = builder.matchRules;
            this.ruleName = builder.ruleName;
            this.subscriptions = builder.subscriptions;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return deliveryMode
         */
        public String getDeliveryMode() {
            return this.deliveryMode;
        }

        /**
         * @return endpoint
         */
        public Endpoint getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return eventTypes
         */
        public java.util.List<String> getEventTypes() {
            return this.eventTypes;
        }

        /**
         * @return matchRules
         */
        public java.util.List<java.util.List<EventMatchRule>> getMatchRules() {
            return this.matchRules;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return subscriptions
         */
        public java.util.List<Subscriptions> getSubscriptions() {
            return this.subscriptions;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String deliveryMode; 
            private Endpoint endpoint; 
            private java.util.List<String> eventTypes; 
            private java.util.List<java.util.List<EventMatchRule>> matchRules; 
            private String ruleName; 
            private java.util.List<Subscriptions> subscriptions; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.deliveryMode = model.deliveryMode;
                this.endpoint = model.endpoint;
                this.eventTypes = model.eventTypes;
                this.matchRules = model.matchRules;
                this.ruleName = model.ruleName;
                this.subscriptions = model.subscriptions;
                this.topicName = model.topicName;
            } 

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
             */
            public Builder deliveryMode(String deliveryMode) {
                this.deliveryMode = deliveryMode;
                return this;
            }

            /**
             * <p>The endpoint of the subscription.</p>
             */
            public Builder endpoint(Endpoint endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The list of event types.</p>
             */
            public Builder eventTypes(java.util.List<String> eventTypes) {
                this.eventTypes = eventTypes;
                return this;
            }

            /**
             * <p>The event matching rules. The rules have an OR relationship.</p>
             */
            public Builder matchRules(java.util.List<java.util.List<EventMatchRule>> matchRules) {
                this.matchRules = matchRules;
                return this;
            }

            /**
             * <p>The name of the event notification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-xsXDW</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The subscribers. A maximum of 20 entries are returned. If there are more subscribers, see <a href="https://help.aliyun.com/document_detail/2804757.html">List Subscriptions</a>.</p>
             */
            public Builder subscriptions(java.util.List<Subscriptions> subscriptions) {
                this.subscriptions = subscriptions;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-topic</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private Long pages;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.pageData = builder.pageData;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pages = builder.pages;
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

        /**
         * @return pageData
         */
        public java.util.List<PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pages
         */
        public Long getPages() {
            return this.pages;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<PageData> pageData; 
            private Long pageNum; 
            private Long pageSize; 
            private Long pages; 
            private Long size; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.pageData = model.pageData;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pages = model.pages;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * <p>This parameter is deprecated. The maximum number of entries is based on Total.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>This parameter is deprecated. Paged queries are based on PageNum.</p>
             * 
             * <strong>example:</strong>
             * <p>a88f58d504b8b4c4e0b5e8707e68181f</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The data entries.</p>
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * <p>The page number of the returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pages(Long pages) {
                this.pages = pages;
                return this;
            }

            /**
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>130</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
