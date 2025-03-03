// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListEventBusesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventBusesResponseBody</p>
 */
public class ListEventBusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEventBusesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventBusesResponseBody create() {
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
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>Success: The request was successful.</li>
         * <li>Other codes: The request failed. For information about error codes, see Error codes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidArgument</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D1DCF64A-3F2C-5323-ADCB-3F4DF30FAD2D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. If the operation was successful, the value true is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEventBusesResponseBody build() {
            return new ListEventBusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventBusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventBusesResponseBody</p>
     */
    public static class EventBuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventBusARN")
        private String eventBusARN;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        private EventBuses(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.eventBusARN = builder.eventBusARN;
            this.eventBusName = builder.eventBusName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBuses create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventBusARN
         */
        public String getEventBusARN() {
            return this.eventBusARN;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String description; 
            private String eventBusARN; 
            private String eventBusName; 

            /**
             * <p>The timestamp that indicates when the event bus was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1607071602000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>bus_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:123456789098***:eventbus/default</p>
             */
            public Builder eventBusARN(String eventBusARN) {
                this.eventBusARN = eventBusARN;
                return this;
            }

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            public EventBuses build() {
                return new EventBuses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventBusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventBusesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventBuses")
        private java.util.List<EventBuses> eventBuses;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.eventBuses = builder.eventBuses;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventBuses
         */
        public java.util.List<EventBuses> getEventBuses() {
            return this.eventBuses;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<EventBuses> eventBuses; 
            private String nextToken; 
            private Integer total; 

            /**
             * <p>The event buses.</p>
             */
            public Builder eventBuses(java.util.List<EventBuses> eventBuses) {
                this.eventBuses = eventBuses;
                return this;
            }

            /**
             * <p>If excess return values exist, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
