// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The information about the connectivity test.</p>
         */
        public Builder taskList(TaskList taskList) {
            this.taskList = taskList;
            return this;
        }

        public TestNetworkConnectionResponseBody build() {
            return new TestNetworkConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestNetworkConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>TestNetworkConnectionResponseBody</p>
     */
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
             * <p>The reason why the data source and resource group failed the connectivity test. If data source and the resource group passed the connectivity test, this parameter is left empty.</p>
             */
            public Builder connectMessage(String connectMessage) {
                this.connectMessage = connectMessage;
                return this;
            }

            /**
             * <p>The result of the connectivity test. Valid values:</p>
             * <ul>
             * <li>true: The data source and the resource group passed the connectivity test.</li>
             * <li>false: The data source and the resource group failed the connectivity test. You can troubleshoot issues based on the ConnectMessage parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
