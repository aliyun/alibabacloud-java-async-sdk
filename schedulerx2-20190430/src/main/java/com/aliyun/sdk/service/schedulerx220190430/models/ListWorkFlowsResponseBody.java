// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ListWorkFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkFlowsResponseBody</p>
 */
public class ListWorkFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWorkFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkFlowsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListWorkFlowsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data of the workflow.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>workflow is not existed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>883AFE93-FB03-4FA9-A958-E750C6DE120C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkFlowsResponseBody build() {
            return new ListWorkFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkFlowsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Calendar")
        private String calendar;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private String maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("TimeExpression")
        private String timeExpression;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private String timeType;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        private Records(Builder builder) {
            this.calendar = builder.calendar;
            this.creator = builder.creator;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.maxConcurrency = builder.maxConcurrency;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.timeExpression = builder.timeExpression;
            this.timeType = builder.timeType;
            this.updater = builder.updater;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return calendar
         */
        public String getCalendar() {
            return this.calendar;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return maxConcurrency
         */
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return timeExpression
         */
        public String getTimeExpression() {
            return this.timeExpression;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return updater
         */
        public String getUpdater() {
            return this.updater;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String calendar; 
            private String creator; 
            private String description; 
            private String groupId; 
            private String maxConcurrency; 
            private String name; 
            private String namespace; 
            private String timeExpression; 
            private String timeType; 
            private String updater; 
            private Long workflowId; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.calendar = model.calendar;
                this.creator = model.creator;
                this.description = model.description;
                this.groupId = model.groupId;
                this.maxConcurrency = model.maxConcurrency;
                this.name = model.name;
                this.namespace = model.namespace;
                this.timeExpression = model.timeExpression;
                this.timeType = model.timeType;
                this.updater = model.updater;
                this.workflowId = model.workflowId;
            } 

            /**
             * <p>The calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>workday</p>
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1144881807903942</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>No description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hxm.test</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The maximum concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * <p>The workflow name.</p>
             * 
             * <strong>example:</strong>
             * <p>test3</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
             * 
             * <strong>example:</strong>
             * <p>4a06d5ea-f576-4326-842c-fb14ea043d8d</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The time expression.</p>
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * <p>The time type of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>cron</p>
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>The updater.</p>
             * 
             * <strong>example:</strong>
             * <p>1144881807903942</p>
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1339</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkFlowsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.total = model.total;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The row of data.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
