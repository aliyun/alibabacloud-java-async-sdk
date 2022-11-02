// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceEventResponseBody</p>
 */
public class DescribeServiceEventResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < Events> events;

    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("TotalPageNum")
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

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
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
        private java.util.List < Events> events; 
        private Long pageNum; 
        private String requestId; 
        private Long totalCount; 
        private Long totalPageNum; 

        /**
         * Events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Long totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public DescribeServiceEventResponseBody build() {
            return new DescribeServiceEventResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.message = builder.message;
            this.reason = builder.reason;
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
            private String time; 
            private String type; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
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
