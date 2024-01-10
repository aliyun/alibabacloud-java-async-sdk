// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInsightsEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInsightsEventsResponseBody</p>
 */
public class ListInsightsEventsResponseBody extends TeaModel {
    @NameInMap("InsightsEvents")
    private java.util.List < InsightsEvents> insightsEvents;

    @NameInMap("RequestId")
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
    public java.util.List < InsightsEvents> getInsightsEvents() {
        return this.insightsEvents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InsightsEvents> insightsEvents; 
        private String requestId; 

        /**
         * The event details.
         */
        public Builder insightsEvents(java.util.List < InsightsEvents> insightsEvents) {
            this.insightsEvents = insightsEvents;
            return this;
        }

        /**
         * The title of the event.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInsightsEventsResponseBody build() {
            return new ListInsightsEventsResponseBody(this);
        } 

    } 

    public static class InsightsEvents extends TeaModel {
        @NameInMap("Date")
        private Long date;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Level")
        private String level;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("ProblemId")
        private String problemId;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
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
             * The time when the event occurred. The value is a timestamp.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * The description of the event.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The severity of the event.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The ID of the application associated with the event.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Problem identification.
             */
            public Builder problemId(String problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * The title of the event.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The type of the event.
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
