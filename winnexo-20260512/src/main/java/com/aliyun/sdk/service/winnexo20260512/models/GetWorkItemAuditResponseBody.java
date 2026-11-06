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
 * {@link GetWorkItemAuditResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemAuditResponseBody</p>
 */
public class GetWorkItemAuditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetWorkItemAuditResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemAuditResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWorkItemAuditResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>公共业务状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>按事件时间倒序排列的完整工作项审计记录</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;eventId&quot;:&quot;evt_example&quot;,&quot;eventType&quot;:&quot;WORK_ITEM_UPDATED&quot;,&quot;occurredAt&quot;:&quot;2026-11-05T08:00:00Z&quot;,&quot;status&quot;:&quot;SUCCESS&quot;}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>公共错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWorkItemAuditResponseBody build() {
            return new GetWorkItemAuditResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkItemAuditResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemAuditResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changes")
        private Object changes;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("occurredAt")
        private String occurredAt;

        @com.aliyun.core.annotation.NameInMap("operatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("operatorUserId")
        private String operatorUserId;

        @com.aliyun.core.annotation.NameInMap("questions")
        private java.util.List<?> questions;

        @com.aliyun.core.annotation.NameInMap("resultPayload")
        private Object resultPayload;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("todoId")
        private String todoId;

        private Items(Builder builder) {
            this.changes = builder.changes;
            this.description = builder.description;
            this.eventId = builder.eventId;
            this.eventType = builder.eventType;
            this.occurredAt = builder.occurredAt;
            this.operatorName = builder.operatorName;
            this.operatorUserId = builder.operatorUserId;
            this.questions = builder.questions;
            this.resultPayload = builder.resultPayload;
            this.status = builder.status;
            this.title = builder.title;
            this.todoId = builder.todoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return changes
         */
        public Object getChanges() {
            return this.changes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return occurredAt
         */
        public String getOccurredAt() {
            return this.occurredAt;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorUserId
         */
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        /**
         * @return questions
         */
        public java.util.List<?> getQuestions() {
            return this.questions;
        }

        /**
         * @return resultPayload
         */
        public Object getResultPayload() {
            return this.resultPayload;
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

        /**
         * @return todoId
         */
        public String getTodoId() {
            return this.todoId;
        }

        public static final class Builder {
            private Object changes; 
            private String description; 
            private String eventId; 
            private String eventType; 
            private String occurredAt; 
            private String operatorName; 
            private String operatorUserId; 
            private java.util.List<?> questions; 
            private Object resultPayload; 
            private String status; 
            private String title; 
            private String todoId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.changes = model.changes;
                this.description = model.description;
                this.eventId = model.eventId;
                this.eventType = model.eventType;
                this.occurredAt = model.occurredAt;
                this.operatorName = model.operatorName;
                this.operatorUserId = model.operatorUserId;
                this.questions = model.questions;
                this.resultPayload = model.resultPayload;
                this.status = model.status;
                this.title = model.title;
                this.todoId = model.todoId;
            } 

            /**
             * <p>字段变更明细列表，每项包含变更字段与前后值</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;field&quot;:&quot;title&quot;,&quot;before&quot;:&quot;旧标题&quot;,&quot;after&quot;:&quot;新标题&quot;}]</p>
             */
            public Builder changes(Object changes) {
                this.changes = changes;
                return this;
            }

            /**
             * <p>事件描述</p>
             * 
             * <strong>example:</strong>
             * <p>工作项标题调整为季度销售机会复盘</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>审计事件唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>evt_20261105_0001</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>审计事件类型，如 WORK_ITEM_UPDATED、TODO_COMPLETED</p>
             * 
             * <strong>example:</strong>
             * <p>WORK_ITEM_UPDATED</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>事件发生时间，ISO8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T08:00:00Z</p>
             */
            public Builder occurredAt(String occurredAt) {
                this.occurredAt = occurredAt;
                return this;
            }

            /**
             * <p>操作人显示名</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>操作人用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder operatorUserId(String operatorUserId) {
                this.operatorUserId = operatorUserId;
                return this;
            }

            /**
             * <p>事件涉及的待确认问题列表</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;question&quot;:&quot;是否继续执行&quot;}]</p>
             */
            public Builder questions(java.util.List<?> questions) {
                this.questions = questions;
                return this;
            }

            /**
             * <p>事件结果负载，JSON 对象；无结果时为空</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
             */
            public Builder resultPayload(Object resultPayload) {
                this.resultPayload = resultPayload;
                return this;
            }

            /**
             * <p>事件状态</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>事件标题</p>
             * 
             * <strong>example:</strong>
             * <p>调查销售机会</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>关联待办 ID；无关联时为空字符串</p>
             * 
             * <strong>example:</strong>
             * <p>todo_20261105_0007</p>
             */
            public Builder todoId(String todoId) {
                this.todoId = todoId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
