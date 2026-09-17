// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowResponseBody</p>
 */
public class GetWorkflowResponseBody extends TeaModel {
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

    private GetWorkflowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowResponseBody create() {
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

        private Builder(GetWorkflowResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error: content is null.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. This ID is unique to each request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>27B1345D-5F71-5972-8E4C-AABA6C6232F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkflowResponseBody build() {
            return new GetWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Calendar")
        private String calendar;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Integer maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeExpression")
        private String timeExpression;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private Integer timeType;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        @com.aliyun.core.annotation.NameInMap("Xattrs")
        private String xattrs;

        private Data(Builder builder) {
            this.appName = builder.appName;
            this.calendar = builder.calendar;
            this.creator = builder.creator;
            this.description = builder.description;
            this.maxConcurrency = builder.maxConcurrency;
            this.name = builder.name;
            this.status = builder.status;
            this.timeExpression = builder.timeExpression;
            this.timeType = builder.timeType;
            this.timezone = builder.timezone;
            this.updater = builder.updater;
            this.workflowId = builder.workflowId;
            this.xattrs = builder.xattrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
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
         * @return maxConcurrency
         */
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
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
        public Integer getTimeType() {
            return this.timeType;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
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

        /**
         * @return xattrs
         */
        public String getXattrs() {
            return this.xattrs;
        }

        public static final class Builder {
            private String appName; 
            private String calendar; 
            private String creator; 
            private String description; 
            private Integer maxConcurrency; 
            private String name; 
            private Integer status; 
            private String timeExpression; 
            private Integer timeType; 
            private String timezone; 
            private String updater; 
            private Long workflowId; 
            private String xattrs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appName = model.appName;
                this.calendar = model.calendar;
                this.creator = model.creator;
                this.description = model.description;
                this.maxConcurrency = model.maxConcurrency;
                this.name = model.name;
                this.status = model.status;
                this.timeExpression = model.timeExpression;
                this.timeType = model.timeType;
                this.timezone = model.timezone;
                this.updater = model.updater;
                this.workflowId = model.workflowId;
                this.xattrs = model.xattrs;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The custom calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>workday</p>
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * <p>The user who created the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>18582193685027xx</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The workflow description.</p>
             * 
             * <strong>example:</strong>
             * <p>my first workflow</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxConcurrency(Integer maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * <p>The workflow name.</p>
             * 
             * <strong>example:</strong>
             * <p>myWorkflow</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The workflow status.</p>
             * <ul>
             * <li><p>0: disabled</p>
             * </li>
             * <li><p>1: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time expression. The value of this parameter depends on the schedule type.</p>
             * <ul>
             * <li><p><strong>None</strong>: No expression is required.</p>
             * </li>
             * <li><p><strong>cron</strong>: A standard cron expression.</p>
             * </li>
             * <li><p><strong>API</strong>: No expression is required.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0 0 12 * * ?</p>
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * <p>The schedule type.</p>
             * <ul>
             * <li><p>-1: None</p>
             * </li>
             * <li><p>1: cron</p>
             * </li>
             * <li><p>100: API</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * <blockquote>
             * <p>If this parameter is omitted, the time zone of the server in the current region is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GMT+8</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The user who last updated the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>18582193685027xx</p>
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The extended attributes.</p>
             * <blockquote>
             * <p>This parameter is not supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder xattrs(String xattrs) {
                this.xattrs = xattrs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
