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
         * InsightsEvents.
         */
        public Builder insightsEvents(java.util.List < InsightsEvents> insightsEvents) {
            this.insightsEvents = insightsEvents;
            return this;
        }

        /**
         * 请求ID
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

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        private InsightsEvents(Builder builder) {
            this.date = builder.date;
            this.desc = builder.desc;
            this.level = builder.level;
            this.pid = builder.pid;
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
            private String title; 
            private String type; 

            /**
             * Date.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
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
