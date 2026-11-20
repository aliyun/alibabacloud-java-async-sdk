// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceEventResponseBody</p>
 */
public class DescribeServiceEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Long totalPageNum;

    private DescribeServiceEventResponseBody(Builder builder) {
        this.events = builder.events;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPageNum
     */
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private java.util.List<Events> events; 
        private Long pageNum; 
        private String requestId; 
        private Long totalCount; 
        private Long totalPageNum; 

        private Builder() {
        } 

        private Builder(DescribeServiceEventResponseBody model) {
            this.events = model.events;
            this.pageNum = model.pageNum;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * <p>The list of events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3D491C94-6239-5318-B4B4-799D859***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalPageNum(Long totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public DescribeServiceEventResponseBody build() {
            return new DescribeServiceEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceEventResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.message = builder.message;
            this.reason = builder.reason;
            this.resource = builder.resource;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String message; 
            private String reason; 
            private String resource; 
            private String time; 
            private String type; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.message = model.message;
                this.reason = model.reason;
                this.resource = model.resource;
                this.time = model.time;
                this.type = model.type;
            } 

            /**
             * <p>The event information (a formatted JSON string).</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;versionId\&quot;:1,\&quot;message\&quot;:\&quot;Stage scale complete\&quot;,\&quot;availableInstance\&quot;:1,\&quot;unavailableInstance\&quot;:0}</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the event (information about service status changes).</p>
             * 
             * <strong>example:</strong>
             * <p>Updating</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li><p>Service: service.</p>
             * </li>
             * <li><p>Pod: service instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Service</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The UTC time when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-09 06:30:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li>Normal: normal events.</li>
             * <li>Warning: abnormal events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
