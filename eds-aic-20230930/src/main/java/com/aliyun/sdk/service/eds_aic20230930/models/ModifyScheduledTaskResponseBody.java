// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyScheduledTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyScheduledTaskResponseBody</p>
 */
public class ModifyScheduledTaskResponseBody extends TeaModel {
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

    private ModifyScheduledTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScheduledTaskResponseBody create() {
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

        private Builder(ModifyScheduledTaskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of modification results.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ModifyScheduledTaskResponseBody build() {
            return new ModifyScheduledTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyScheduledTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyScheduledTaskResponseBody</p>
     */
    public static class InstanceResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private InstanceResults(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResults create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorMessage; 
            private String instanceId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(InstanceResults model) {
                this.errorMessage = model.errorMessage;
                this.instanceId = model.instanceId;
                this.success = model.success;
            } 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance not found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-4dkmkip0l0uw*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public InstanceResults build() {
                return new InstanceResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyScheduledTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyScheduledTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceResults")
        private java.util.List<InstanceResults> instanceResults;

        @com.aliyun.core.annotation.NameInMap("NewVersion")
        private Integer newVersion;

        @com.aliyun.core.annotation.NameInMap("ScheduledId")
        private String scheduledId;

        private Tasks(Builder builder) {
            this.instanceResults = builder.instanceResults;
            this.newVersion = builder.newVersion;
            this.scheduledId = builder.scheduledId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return instanceResults
         */
        public java.util.List<InstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

        /**
         * @return newVersion
         */
        public Integer getNewVersion() {
            return this.newVersion;
        }

        /**
         * @return scheduledId
         */
        public String getScheduledId() {
            return this.scheduledId;
        }

        public static final class Builder {
            private java.util.List<InstanceResults> instanceResults; 
            private Integer newVersion; 
            private String scheduledId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.instanceResults = model.instanceResults;
                this.newVersion = model.newVersion;
                this.scheduledId = model.scheduledId;
            } 

            /**
             * <p>The list of batch delivery results for instance scheduled tasks.</p>
             */
            public Builder instanceResults(java.util.List<InstanceResults> instanceResults) {
                this.instanceResults = instanceResults;
                return this;
            }

            /**
             * <p>The updated CAS version number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder newVersion(Integer newVersion) {
                this.newVersion = newVersion;
                return this;
            }

            /**
             * <p>The scheduled task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sch-260705-agbx*****</p>
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
