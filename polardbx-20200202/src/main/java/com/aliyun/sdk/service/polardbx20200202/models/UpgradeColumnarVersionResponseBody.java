// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link UpgradeColumnarVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeColumnarVersionResponseBody</p>
 */
public class UpgradeColumnarVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpgradeColumnarVersionResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeColumnarVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpgradeColumnarVersionResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AE4F6C34-****-45AA-B5DC-4B8D816F6305</p>
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

        public UpgradeColumnarVersionResponseBody build() {
            return new UpgradeColumnarVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeColumnarVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeColumnarVersionResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private TaskList(Builder builder) {
            this.dbInstanceName = builder.dbInstanceName;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String dbInstanceName; 
            private Integer taskId; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.dbInstanceName = model.dbInstanceName;
                this.taskId = model.taskId;
            } 

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpgradeColumnarVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeColumnarVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("TaskList")
        private java.util.List<TaskList> taskList;

        private Data(Builder builder) {
            this.minorVersion = builder.minorVersion;
            this.taskList = builder.taskList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return taskList
         */
        public java.util.List<TaskList> getTaskList() {
            return this.taskList;
        }

        public static final class Builder {
            private String minorVersion; 
            private java.util.List<TaskList> taskList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.minorVersion = model.minorVersion;
                this.taskList = model.taskList;
            } 

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * TaskList.
             */
            public Builder taskList(java.util.List<TaskList> taskList) {
                this.taskList = taskList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
