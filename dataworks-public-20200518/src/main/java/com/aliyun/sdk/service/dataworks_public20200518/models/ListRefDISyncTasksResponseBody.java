// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRefDISyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRefDISyncTasksResponseBody</p>
 */
public class ListRefDISyncTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListRefDISyncTasksResponseBody build() {
            return new ListRefDISyncTasksResponseBody(this);
        } 

    } 

    public static class DISyncTasks extends TeaModel {
        @NameInMap("DiDestinationDatasource")
        private String diDestinationDatasource;

        @NameInMap("DiSourceDatasource")
        private String diSourceDatasource;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("TaskType")
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
             * DiDestinationDatasource.
             */
            public Builder diDestinationDatasource(String diDestinationDatasource) {
                this.diDestinationDatasource = diDestinationDatasource;
                return this;
            }

            /**
             * DiSourceDatasource.
             */
            public Builder diSourceDatasource(String diSourceDatasource) {
                this.diSourceDatasource = diSourceDatasource;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * TaskType.
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
    public static class Data extends TeaModel {
        @NameInMap("DISyncTasks")
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
             * DISyncTasks.
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
