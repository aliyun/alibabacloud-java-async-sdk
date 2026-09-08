// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetTicketResponseBody</p>
 */
public class GetTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTicketResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTicketResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of incorrect parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BF268B34-09C2-43FD-BAC4-5D31EA633111</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTicketResponseBody build() {
            return new GetTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assignee")
        private String assignee;

        @com.aliyun.core.annotation.NameInMap("AssigneeName")
        private String assigneeName;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CloseCode")
        private String closeCode;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskId")
        private String currentTaskId;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskName")
        private String currentTaskName;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskStartTime")
        private Long currentTaskStartTime;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("TicketId")
        private String ticketId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Data(Builder builder) {
            this.assignee = builder.assignee;
            this.assigneeName = builder.assigneeName;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.closeCode = builder.closeCode;
            this.comment = builder.comment;
            this.context = builder.context;
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.currentTaskId = builder.currentTaskId;
            this.currentTaskName = builder.currentTaskName;
            this.currentTaskStartTime = builder.currentTaskStartTime;
            this.customerId = builder.customerId;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.source = builder.source;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.templateId = builder.templateId;
            this.templateVersion = builder.templateVersion;
            this.ticketId = builder.ticketId;
            this.title = builder.title;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assignee
         */
        public String getAssignee() {
            return this.assignee;
        }

        /**
         * @return assigneeName
         */
        public String getAssigneeName() {
            return this.assigneeName;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return closeCode
         */
        public String getCloseCode() {
            return this.closeCode;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return currentTaskId
         */
        public String getCurrentTaskId() {
            return this.currentTaskId;
        }

        /**
         * @return currentTaskName
         */
        public String getCurrentTaskName() {
            return this.currentTaskName;
        }

        /**
         * @return currentTaskStartTime
         */
        public Long getCurrentTaskStartTime() {
            return this.currentTaskStartTime;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String assignee; 
            private String assigneeName; 
            private String categoryId; 
            private String categoryName; 
            private String closeCode; 
            private String comment; 
            private String context; 
            private Long createdTime; 
            private String creator; 
            private String creatorName; 
            private String currentTaskId; 
            private String currentTaskName; 
            private Long currentTaskStartTime; 
            private String customerId; 
            private Long endTime; 
            private String instanceId; 
            private String jobId; 
            private String source; 
            private Long startTime; 
            private String state; 
            private String templateId; 
            private String templateVersion; 
            private String ticketId; 
            private String title; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assignee = model.assignee;
                this.assigneeName = model.assigneeName;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.closeCode = model.closeCode;
                this.comment = model.comment;
                this.context = model.context;
                this.createdTime = model.createdTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.currentTaskId = model.currentTaskId;
                this.currentTaskName = model.currentTaskName;
                this.currentTaskStartTime = model.currentTaskStartTime;
                this.customerId = model.customerId;
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
                this.source = model.source;
                this.startTime = model.startTime;
                this.state = model.state;
                this.templateId = model.templateId;
                this.templateVersion = model.templateVersion;
                this.ticketId = model.ticketId;
                this.title = model.title;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The ID of the assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>agent1@ccc-test</p>
             */
            public Builder assignee(String assignee) {
                this.assignee = assignee;
                return this;
            }

            /**
             * <p>The name of the assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席A</p>
             */
            public Builder assigneeName(String assigneeName) {
                this.assigneeName = assigneeName;
                return this;
            }

            /**
             * <p>The ticket category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8939-4223-86d0-6bd187905cc8</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The name of the ticket category.</p>
             * 
             * <strong>example:</strong>
             * <p>售后类目</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The reason for closing the ticket.</p>
             * <ul>
             * <li><p>Completed</p>
             * </li>
             * <li><p>Terminated</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder closeCode(String closeCode) {
                this.closeCode = closeCode;
                return this;
            }

            /**
             * <p>The comment.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The fields of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;productName&quot;:&quot;商品A&quot;}</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The time when the ticket was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1620259200000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>creator@ccc-test</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席B</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The ID of the current node.</p>
             * 
             * <strong>example:</strong>
             * <p>912f0b78-6639-4a93-ae18-0d832885c27e</p>
             */
            public Builder currentTaskId(String currentTaskId) {
                this.currentTaskId = currentTaskId;
                return this;
            }

            /**
             * <p>The name of the current node.</p>
             * 
             * <strong>example:</strong>
             * <p>节点1</p>
             */
            public Builder currentTaskName(String currentTaskName) {
                this.currentTaskName = currentTaskName;
                return this;
            }

            /**
             * <p>The time when the current node started.</p>
             * 
             * <strong>example:</strong>
             * <p>1693793208075</p>
             */
            public Builder currentTaskStartTime(Long currentTaskStartTime) {
                this.currentTaskStartTime = currentTaskStartTime;
                return this;
            }

            /**
             * <p>The customer ID. This is the customer ID in the customer profile of Cloud Contact Center.</p>
             * 
             * <strong>example:</strong>
             * <p>4223-86d0-6bd187905-891798749</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>The time when the ticket processing was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1687846259999</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-399383842187575296</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The source of the ticket.</p>
             * <ul>
             * <li><p>AUDIO: Voice service.</p>
             * </li>
             * <li><p>CHAT: Web service.</p>
             * </li>
             * <li><p>Console: Created in the ticket console.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Audio</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The time when the ticket processing started.</p>
             * 
             * <strong>example:</strong>
             * <p>1620259200000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ticket status.</p>
             * <ul>
             * <li><p>Processing</p>
             * </li>
             * <li><p>Withdrawal</p>
             * </li>
             * <li><p>Rejected</p>
             * </li>
             * <li><p>Closed</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ticket template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test_43c2671b-8939-4223-86d0-6bd187905cc8_*****0666238</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The version of the ticket template.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The ticket ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b3a6a131-359e-46bd-9bc5-1f5cb0ea093f</p>
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            /**
             * <p>The ticket title.</p>
             * 
             * <strong>example:</strong>
             * <p>售后工单</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The time of the last update.</p>
             * 
             * <strong>example:</strong>
             * <p>1693793208075</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
