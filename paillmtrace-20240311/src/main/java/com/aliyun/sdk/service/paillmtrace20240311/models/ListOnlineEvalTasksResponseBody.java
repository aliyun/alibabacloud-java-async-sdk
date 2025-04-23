// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link ListOnlineEvalTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListOnlineEvalTasksResponseBody</p>
 */
public class ListOnlineEvalTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOnlineEvalTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnlineEvalTasksResponseBody create() {
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOnlineEvalTasksResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6F352A02-9C0D-54A7-B57C-663CF71D5714</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOnlineEvalTasksResponseBody build() {
            return new ListOnlineEvalTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOnlineEvalTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListOnlineEvalTasksResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOnlineEvalTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListOnlineEvalTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EvaluationConfig")
        private EvaluationConfig evaluationConfig;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List<Filters> filters;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtEndTime")
        private String gmtEndTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModelConfig")
        private ModelConfig modelConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SamplingFrequencyMinutes")
        private Integer samplingFrequencyMinutes;

        @com.aliyun.core.annotation.NameInMap("SamplingRatio")
        private Integer samplingRatio;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Tasks(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.appName = builder.appName;
            this.description = builder.description;
            this.evaluationConfig = builder.evaluationConfig;
            this.filters = builder.filters;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtEndTime = builder.gmtEndTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.id = builder.id;
            this.modelConfig = builder.modelConfig;
            this.name = builder.name;
            this.samplingFrequencyMinutes = builder.samplingFrequencyMinutes;
            this.samplingRatio = builder.samplingRatio;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return evaluationConfig
         */
        public EvaluationConfig getEvaluationConfig() {
            return this.evaluationConfig;
        }

        /**
         * @return filters
         */
        public java.util.List<Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtEndTime
         */
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modelConfig
         */
        public ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return samplingFrequencyMinutes
         */
        public Integer getSamplingFrequencyMinutes() {
            return this.samplingFrequencyMinutes;
        }

        /**
         * @return samplingRatio
         */
        public Integer getSamplingRatio() {
            return this.samplingRatio;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String appName; 
            private String description; 
            private EvaluationConfig evaluationConfig; 
            private java.util.List<Filters> filters; 
            private String gmtCreateTime; 
            private String gmtEndTime; 
            private String gmtStartTime; 
            private String id; 
            private ModelConfig modelConfig; 
            private String name; 
            private Integer samplingFrequencyMinutes; 
            private Integer samplingRatio; 
            private String status; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.aliyunUid = model.aliyunUid;
                this.appName = model.appName;
                this.description = model.description;
                this.evaluationConfig = model.evaluationConfig;
                this.filters = model.filters;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtEndTime = model.gmtEndTime;
                this.gmtStartTime = model.gmtStartTime;
                this.id = model.id;
                this.modelConfig = model.modelConfig;
                this.name = model.name;
                this.samplingFrequencyMinutes = model.samplingFrequencyMinutes;
                this.samplingRatio = model.samplingRatio;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * EvaluationConfig.
             */
            public Builder evaluationConfig(EvaluationConfig evaluationConfig) {
                this.evaluationConfig = evaluationConfig;
                return this;
            }

            /**
             * Filters.
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtEndTime.
             */
            public Builder gmtEndTime(String gmtEndTime) {
                this.gmtEndTime = gmtEndTime;
                return this;
            }

            /**
             * GmtStartTime.
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ModelConfig.
             */
            public Builder modelConfig(ModelConfig modelConfig) {
                this.modelConfig = modelConfig;
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
             * SamplingFrequencyMinutes.
             */
            public Builder samplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
                this.samplingFrequencyMinutes = samplingFrequencyMinutes;
                return this;
            }

            /**
             * SamplingRatio.
             */
            public Builder samplingRatio(Integer samplingRatio) {
                this.samplingRatio = samplingRatio;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
