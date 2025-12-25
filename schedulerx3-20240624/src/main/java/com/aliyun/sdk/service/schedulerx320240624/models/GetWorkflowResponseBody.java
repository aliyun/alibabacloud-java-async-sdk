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
         * Code.
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Calendar.
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(Integer maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TimeExpression.
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * TimeType.
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * Updater.
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * Xattrs.
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
