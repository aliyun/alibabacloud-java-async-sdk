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
 * {@link UpgradeCDCVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeCDCVersionResponseBody</p>
 */
public class UpgradeCDCVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpgradeCDCVersionResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeCDCVersionResponseBody create() {
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

        private Builder(UpgradeCDCVersionResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CB4307F5-3D04-51E8-ABAD-49E0B3F962FC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpgradeCDCVersionResponseBody build() {
            return new UpgradeCDCVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeCDCVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeCDCVersionResponseBody</p>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf68f345****88zf8</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The target task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1861190497624654848</p>
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
     * {@link UpgradeCDCVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeCDCVersionResponseBody</p>
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
             * <p>The target version number.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb-2.4.0_5.4.19-20250116_xcluster5.4.20-20241213</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The list of upgrade tasks.</p>
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
