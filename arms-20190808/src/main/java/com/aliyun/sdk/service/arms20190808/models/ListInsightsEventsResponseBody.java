// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListInsightsEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInsightsEventsResponseBody</p>
 */
public class ListInsightsEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InsightsEvents")
    private java.util.List<InsightsEvents> insightsEvents;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInsightsEventsResponseBody(Builder builder) {
        this.insightsEvents = builder.insightsEvents;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInsightsEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return insightsEvents
     */
    public java.util.List<InsightsEvents> getInsightsEvents() {
        return this.insightsEvents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InsightsEvents> insightsEvents; 
        private String requestId; 

        /**
         * <p>The details of the event.</p>
         */
        public Builder insightsEvents(java.util.List<InsightsEvents> insightsEvents) {
            this.insightsEvents = insightsEvents;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6F1174DC-6085-5353-AAE7-D4ADCD******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInsightsEventsResponseBody build() {
            return new ListInsightsEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInsightsEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInsightsEventsResponseBody</p>
     */
    public static class InsightsEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("ProblemId")
        private String problemId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InsightsEvents(Builder builder) {
            this.date = builder.date;
            this.desc = builder.desc;
            this.level = builder.level;
            this.pid = builder.pid;
            this.problemId = builder.problemId;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsightsEvents create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return problemId
         */
        public String getProblemId() {
            return this.problemId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long date; 
            private String desc; 
            private String level; 
            private String pid; 
            private String problemId; 
            private String title; 
            private String type; 

            /**
             * <p>The time when the event occurred. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1658890560</p>
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The description of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>The overall response time of the [HTTP] service of the application [sd] spikes at [2022-07-27 10:57:00]</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The severity of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>P3</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The ID of the application associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>dsv9zcel92@7da413b******</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The problem identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>erep3o9zue@01ebe697ab70566|@1499161100890550|@cn-hangzhou|@1701841800000|@1701842040000|@daa6c51a-3c44-4d57-9548-4e212c******</p>
             */
            public Builder problemId(String problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * <p>The title of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Average response-time spikes of application services</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The type of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>rtIncrease</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InsightsEvents build() {
                return new InsightsEvents(this);
            } 

        } 

    }
}
