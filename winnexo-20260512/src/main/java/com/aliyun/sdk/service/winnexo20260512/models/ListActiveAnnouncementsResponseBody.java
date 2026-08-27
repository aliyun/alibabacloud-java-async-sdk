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
 * {@link ListActiveAnnouncementsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActiveAnnouncementsResponseBody</p>
 */
public class ListActiveAnnouncementsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListActiveAnnouncementsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActiveAnnouncementsResponseBody create() {
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListActiveAnnouncementsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>当前生效公告列表</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>当前生效公告总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListActiveAnnouncementsResponseBody build() {
            return new ListActiveAnnouncementsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListActiveAnnouncementsResponseBody} extends {@link TeaModel}
     *
     * <p>ListActiveAnnouncementsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("announcementId")
        private Long announcementId;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private Long createdBy;

        @com.aliyun.core.annotation.NameInMap("displayPage")
        private String displayPage;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("effectiveEnd")
        private String effectiveEnd;

        @com.aliyun.core.annotation.NameInMap("effectiveStart")
        private String effectiveStart;

        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("publishedAt")
        private String publishedAt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Items(Builder builder) {
            this.announcementId = builder.announcementId;
            this.content = builder.content;
            this.createdBy = builder.createdBy;
            this.displayPage = builder.displayPage;
            this.displayType = builder.displayType;
            this.effectiveEnd = builder.effectiveEnd;
            this.effectiveStart = builder.effectiveStart;
            this.priority = builder.priority;
            this.publishedAt = builder.publishedAt;
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
         * @return announcementId
         */
        public Long getAnnouncementId() {
            return this.announcementId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createdBy
         */
        public Long getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return displayPage
         */
        public String getDisplayPage() {
            return this.displayPage;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return effectiveEnd
         */
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        /**
         * @return effectiveStart
         */
        public String getEffectiveStart() {
            return this.effectiveStart;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return publishedAt
         */
        public String getPublishedAt() {
            return this.publishedAt;
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
            private Long announcementId; 
            private String content; 
            private Long createdBy; 
            private String displayPage; 
            private String displayType; 
            private String effectiveEnd; 
            private String effectiveStart; 
            private String priority; 
            private String publishedAt; 
            private String status; 
            private String title; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.announcementId = model.announcementId;
                this.content = model.content;
                this.createdBy = model.createdBy;
                this.displayPage = model.displayPage;
                this.displayType = model.displayType;
                this.effectiveEnd = model.effectiveEnd;
                this.effectiveStart = model.effectiveStart;
                this.priority = model.priority;
                this.publishedAt = model.publishedAt;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>公告业务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder announcementId(Long announcementId) {
                this.announcementId = announcementId;
                return this;
            }

            /**
             * <p>公告正文</p>
             * 
             * <strong>example:</strong>
             * <p>系统将于今晚进行维护。</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>创建人平台用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder createdBy(Long createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>展示页面：ALL、FRONTEND、BACKEND</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder displayPage(String displayPage) {
                this.displayPage = displayPage;
                return this;
            }

            /**
             * <p>展示类型：POPUP、LIST、BANNER</p>
             * 
             * <strong>example:</strong>
             * <p>LIST</p>
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * <p>生效结束时间；为空表示永久有效，ISO8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-21T14:00:00+08:00</p>
             */
            public Builder effectiveEnd(String effectiveEnd) {
                this.effectiveEnd = effectiveEnd;
                return this;
            }

            /**
             * <p>生效开始时间；为空表示立即生效，ISO8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-20T14:00:00+08:00</p>
             */
            public Builder effectiveStart(String effectiveStart) {
                this.effectiveStart = effectiveStart;
                return this;
            }

            /**
             * <p>公告重要性</p>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>发布时间，ISO8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-20T14:00:00+08:00</p>
             */
            public Builder publishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
                return this;
            }

            /**
             * <p>公告状态，固定为 PUBLISHED</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>公告标题</p>
             * 
             * <strong>example:</strong>
             * <p>系统维护通知</p>
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
