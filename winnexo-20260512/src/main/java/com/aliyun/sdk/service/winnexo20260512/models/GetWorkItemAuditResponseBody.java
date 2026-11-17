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
         * <p>The common business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The complete work item audit records sorted in descending order of event time.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;eventId&quot;:&quot;evt_example&quot;,&quot;eventType&quot;:&quot;WORK_ITEM_UPDATED&quot;,&quot;occurredAt&quot;:&quot;2026-11-05T08:00:00Z&quot;,&quot;status&quot;:&quot;SUCCESS&quot;}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The common error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
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
             * <p>The list of field change details. Each item includes the changed field and its values before and after the change.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;field&quot;:&quot;title&quot;,&quot;before&quot;:&quot;Old title&quot;,&quot;after&quot;:&quot;New title&quot;}]</p>
             */
            public Builder changes(Object changes) {
                this.changes = changes;
                return this;
            }

            /**
             * <p>The event description.</p>
             * 
             * <strong>example:</strong>
             * <p>The work item title is changed to Quarterly Sales Opportunity Review</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique identifier of the audit event.</p>
             * 
             * <strong>example:</strong>
             * <p>evt_20261105_0001</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The audit event type, such as WORK_ITEM_UPDATED or TODO_COMPLETED.</p>
             * 
             * <strong>example:</strong>
             * <p>WORK_ITEM_UPDATED</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The time when the event occurred, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T08:00:00Z</p>
             */
            public Builder occurredAt(String occurredAt) {
                this.occurredAt = occurredAt;
                return this;
            }

            /**
             * <p>The display name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The user ID of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder operatorUserId(String operatorUserId) {
                this.operatorUserId = operatorUserId;
                return this;
            }

            /**
             * <p>The list of questions to be confirmed related to the event.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;question&quot;:&quot;Whether to continue execution&quot;}]</p>
             */
            public Builder questions(java.util.List<?> questions) {
                this.questions = questions;
                return this;
            }

            /**
             * <p>The event result payload as a JSON object. If no result is available, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
             */
            public Builder resultPayload(Object resultPayload) {
                this.resultPayload = resultPayload;
                return this;
            }

            /**
             * <p>The event status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The event title.</p>
             * 
             * <strong>example:</strong>
             * <p>Investigate sales opportunities</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the associated to-do item. If no to-do item is associated, an empty string is returned.</p>
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
