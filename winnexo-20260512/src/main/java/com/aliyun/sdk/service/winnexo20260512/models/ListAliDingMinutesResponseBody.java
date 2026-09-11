// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListAliDingMinutesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliDingMinutesResponseBody</p>
 */
public class ListAliDingMinutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private String nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAliDingMinutesResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.message = builder.message;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliDingMinutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextCursor
     */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private String message; 
        private String nextCursor; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAliDingMinutesResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.message = model.message;
            this.nextCursor = model.nextCursor;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The location clusters.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token for the next retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-next-cursor</p>
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-id</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAliDingMinutesResponseBody build() {
            return new ListAliDingMinutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAliDingMinutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliDingMinutesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("durationMs")
        private Long durationMs;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("minutesId")
        private String minutesId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Items(Builder builder) {
            this.creatorName = builder.creatorName;
            this.durationMs = builder.durationMs;
            this.endTime = builder.endTime;
            this.minutesId = builder.minutesId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return durationMs
         */
        public Long getDurationMs() {
            return this.durationMs;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return minutesId
         */
        public String getMinutesId() {
            return this.minutesId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String creatorName; 
            private Long durationMs; 
            private String endTime; 
            private String minutesId; 
            private String startTime; 
            private String status; 
            private String title; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creatorName = model.creatorName;
                this.durationMs = model.durationMs;
                this.endTime = model.endTime;
                this.minutesId = model.minutesId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The execution duration of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>3600000</p>
             */
            public Builder durationMs(Long durationMs) {
                this.durationMs = durationMs;
                return this;
            }

            /**
             * <p>The end timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08T10:00:00+08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The DingTalk meeting minutes ID.</p>
             * 
             * <strong>example:</strong>
             * <p>76327569643231383535353939365f3436383537393431335f32</p>
             */
            public Builder minutesId(String minutesId) {
                this.minutesId = minutesId;
                return this;
            }

            /**
             * <p>The start timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08T09:00:00+08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Running is returned upon submission.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title of the scheduled meeting.</p>
             * 
             * <strong>example:</strong>
             * <p>Weekly Project Meeting</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
