// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryDeleteTaskCheckDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeleteTaskCheckDataResponseBody</p>
 */
public class QueryDeleteTaskCheckDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskCheckDataDtoList")
    private java.util.List<TaskCheckDataDtoList> taskCheckDataDtoList;

    private QueryDeleteTaskCheckDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskCheckDataDtoList = builder.taskCheckDataDtoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeleteTaskCheckDataResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskCheckDataDtoList
     */
    public java.util.List<TaskCheckDataDtoList> getTaskCheckDataDtoList() {
        return this.taskCheckDataDtoList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TaskCheckDataDtoList> taskCheckDataDtoList; 

        private Builder() {
        } 

        private Builder(QueryDeleteTaskCheckDataResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskCheckDataDtoList = model.taskCheckDataDtoList;
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

        /**
         * TaskCheckDataDtoList.
         */
        public Builder taskCheckDataDtoList(java.util.List<TaskCheckDataDtoList> taskCheckDataDtoList) {
            this.taskCheckDataDtoList = taskCheckDataDtoList;
            return this;
        }

        public QueryDeleteTaskCheckDataResponseBody build() {
            return new QueryDeleteTaskCheckDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeleteTaskCheckDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeleteTaskCheckDataResponseBody</p>
     */
    public static class TaskCheckDataDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckerDesc")
        private String checkerDesc;

        @com.aliyun.core.annotation.NameInMap("CheckerName")
        private String checkerName;

        @com.aliyun.core.annotation.NameInMap("CheckerUniKey")
        private String checkerUniKey;

        @com.aliyun.core.annotation.NameInMap("DependencyLevel")
        private String dependencyLevel;

        private TaskCheckDataDtoList(Builder builder) {
            this.checkerDesc = builder.checkerDesc;
            this.checkerName = builder.checkerName;
            this.checkerUniKey = builder.checkerUniKey;
            this.dependencyLevel = builder.dependencyLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskCheckDataDtoList create() {
            return builder().build();
        }

        /**
         * @return checkerDesc
         */
        public String getCheckerDesc() {
            return this.checkerDesc;
        }

        /**
         * @return checkerName
         */
        public String getCheckerName() {
            return this.checkerName;
        }

        /**
         * @return checkerUniKey
         */
        public String getCheckerUniKey() {
            return this.checkerUniKey;
        }

        /**
         * @return dependencyLevel
         */
        public String getDependencyLevel() {
            return this.dependencyLevel;
        }

        public static final class Builder {
            private String checkerDesc; 
            private String checkerName; 
            private String checkerUniKey; 
            private String dependencyLevel; 

            private Builder() {
            } 

            private Builder(TaskCheckDataDtoList model) {
                this.checkerDesc = model.checkerDesc;
                this.checkerName = model.checkerName;
                this.checkerUniKey = model.checkerUniKey;
                this.dependencyLevel = model.dependencyLevel;
            } 

            /**
             * CheckerDesc.
             */
            public Builder checkerDesc(String checkerDesc) {
                this.checkerDesc = checkerDesc;
                return this;
            }

            /**
             * CheckerName.
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * CheckerUniKey.
             */
            public Builder checkerUniKey(String checkerUniKey) {
                this.checkerUniKey = checkerUniKey;
                return this;
            }

            /**
             * DependencyLevel.
             */
            public Builder dependencyLevel(String dependencyLevel) {
                this.dependencyLevel = dependencyLevel;
                return this;
            }

            public TaskCheckDataDtoList build() {
                return new TaskCheckDataDtoList(this);
            } 

        } 

    }
}
