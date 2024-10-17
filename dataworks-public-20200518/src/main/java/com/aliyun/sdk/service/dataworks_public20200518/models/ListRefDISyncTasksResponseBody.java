// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRefDISyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRefDISyncTasksResponseBody</p>
 */
public class ListRefDISyncTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRefDISyncTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRefDISyncTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937635973****</p>
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

        public ListRefDISyncTasksResponseBody build() {
            return new ListRefDISyncTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRefDISyncTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListRefDISyncTasksResponseBody</p>
     */
    public static class DISyncTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiDestinationDatasource")
        private String diDestinationDatasource;

        @com.aliyun.core.annotation.NameInMap("DiSourceDatasource")
        private String diSourceDatasource;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private DISyncTasks(Builder builder) {
            this.diDestinationDatasource = builder.diDestinationDatasource;
            this.diSourceDatasource = builder.diSourceDatasource;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DISyncTasks create() {
            return builder().build();
        }

        /**
         * @return diDestinationDatasource
         */
        public String getDiDestinationDatasource() {
            return this.diDestinationDatasource;
        }

        /**
         * @return diSourceDatasource
         */
        public String getDiSourceDatasource() {
            return this.diSourceDatasource;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String diDestinationDatasource; 
            private String diSourceDatasource; 
            private Long nodeId; 
            private String nodeName; 
            private String taskType; 

            /**
             * <p>The destination of the synchronization task. If the synchronization task has multiple destinations, the return value is a JSON array, such as \&quot;odps_writer\&quot;, \&quot;mysql\&quot;. If the RefType parameter is set to to, the synchronization tasks that use the specified data source as the destination are returned. In this case, the value of this parameter indicates the specified data source.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;qcc_polardb2&quot;]</p>
             */
            public Builder diDestinationDatasource(String diDestinationDatasource) {
                this.diDestinationDatasource = diDestinationDatasource;
                return this;
            }

            /**
             * <p>The source of the synchronization task. If the synchronization task has multiple sources, the return value is a JSON array, such as \&quot;odps_writer\&quot;, \&quot;mysql\&quot;. If the RefType parameter is set to from, the synchronization tasks that use the specified data source as the source are returned. In this case, the value of this parameter indicates the specified data source.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;odps_writer&quot;]</p>
             */
            public Builder diSourceDatasource(String diSourceDatasource) {
                this.diSourceDatasource = diSourceDatasource;
                return this;
            }

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd1234</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The type of the synchronization task. Valid values:</p>
             * <ul>
             * <li>DI_OFFLINE: batch synchronization task</li>
             * <li>DI_REALTIME: real-time synchronization task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DI_OFFLINE</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public DISyncTasks build() {
                return new DISyncTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRefDISyncTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListRefDISyncTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DISyncTasks")
        private java.util.List < DISyncTasks> DISyncTasks;

        private Data(Builder builder) {
            this.DISyncTasks = builder.DISyncTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DISyncTasks
         */
        public java.util.List < DISyncTasks> getDISyncTasks() {
            return this.DISyncTasks;
        }

        public static final class Builder {
            private java.util.List < DISyncTasks> DISyncTasks; 

            /**
             * <p>The details of the synchronization tasks. In most cases, a data source is used by multiple synchronization tasks. Therefore, the value of this parameter is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a synchronization task.</p>
             */
            public Builder DISyncTasks(java.util.List < DISyncTasks> DISyncTasks) {
                this.DISyncTasks = DISyncTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
