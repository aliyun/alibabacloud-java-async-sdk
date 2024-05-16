// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestNetworkConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>TestNetworkConnectionResponseBody</p>
 */
public class TestNetworkConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private TaskList taskList;

    private TestNetworkConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestNetworkConnectionResponseBody create() {
        return builder().build();
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
     * @return taskList
     */
    public TaskList getTaskList() {
        return this.taskList;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private TaskList taskList; 

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The information about the connectivity test.
         */
        public Builder taskList(TaskList taskList) {
            this.taskList = taskList;
            return this;
        }

        public TestNetworkConnectionResponseBody build() {
            return new TestNetworkConnectionResponseBody(this);
        } 

    } 

    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectMessage")
        private String connectMessage;

        @com.aliyun.core.annotation.NameInMap("ConnectStatus")
        private Boolean connectStatus;

        private TaskList(Builder builder) {
            this.connectMessage = builder.connectMessage;
            this.connectStatus = builder.connectStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return connectMessage
         */
        public String getConnectMessage() {
            return this.connectMessage;
        }

        /**
         * @return connectStatus
         */
        public Boolean getConnectStatus() {
            return this.connectStatus;
        }

        public static final class Builder {
            private String connectMessage; 
            private Boolean connectStatus; 

            /**
             * The reason why the data source and resource group failed the connectivity test. If data source and the resource group passed the connectivity test, this parameter is left empty.
             */
            public Builder connectMessage(String connectMessage) {
                this.connectMessage = connectMessage;
                return this;
            }

            /**
             * The result of the connectivity test. Valid values:
             * <p>
             * 
             * *   true: The data source and the resource group passed the connectivity test.
             * *   false: The data source and the resource group failed the connectivity test. You can troubleshoot issues based on the ConnectMessage parameter.
             */
            public Builder connectStatus(Boolean connectStatus) {
                this.connectStatus = connectStatus;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
