// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetGpuClusterListAlarmRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetGpuClusterListAlarmRecordResponseBody</p>
 */
public class GetGpuClusterListAlarmRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private String total;

    private GetGpuClusterListAlarmRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGpuClusterListAlarmRecordResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
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
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private String total; 

        private Builder() {
        } 

        private Builder(GetGpuClusterListAlarmRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The response code. Valid values: Success and Sysom.ServerError.</p>
         * 
         * <strong>example:</strong>
         * <p>Success or Sysom.ServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of alert data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the code is not Success.</p>
         * 
         * <strong>example:</strong>
         * <p>server error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>real request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public GetGpuClusterListAlarmRecordResponseBody build() {
            return new GetGpuClusterListAlarmRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGpuClusterListAlarmRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetGpuClusterListAlarmRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmCluster")
        private String alarmCluster;

        @com.aliyun.core.annotation.NameInMap("alarmExtInfo")
        private Object alarmExtInfo;

        @com.aliyun.core.annotation.NameInMap("alarmId")
        private String alarmId;

        @com.aliyun.core.annotation.NameInMap("alarmLog")
        private String alarmLog;

        @com.aliyun.core.annotation.NameInMap("alarmTask")
        private String alarmTask;

        @com.aliyun.core.annotation.NameInMap("alarmTime")
        private String alarmTime;

        @com.aliyun.core.annotation.NameInMap("alarmTopology")
        private Object alarmTopology;

        @com.aliyun.core.annotation.NameInMap("alarmType")
        private String alarmType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.alarmCluster = builder.alarmCluster;
            this.alarmExtInfo = builder.alarmExtInfo;
            this.alarmId = builder.alarmId;
            this.alarmLog = builder.alarmLog;
            this.alarmTask = builder.alarmTask;
            this.alarmTime = builder.alarmTime;
            this.alarmTopology = builder.alarmTopology;
            this.alarmType = builder.alarmType;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmCluster
         */
        public String getAlarmCluster() {
            return this.alarmCluster;
        }

        /**
         * @return alarmExtInfo
         */
        public Object getAlarmExtInfo() {
            return this.alarmExtInfo;
        }

        /**
         * @return alarmId
         */
        public String getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmLog
         */
        public String getAlarmLog() {
            return this.alarmLog;
        }

        /**
         * @return alarmTask
         */
        public String getAlarmTask() {
            return this.alarmTask;
        }

        /**
         * @return alarmTime
         */
        public String getAlarmTime() {
            return this.alarmTime;
        }

        /**
         * @return alarmTopology
         */
        public Object getAlarmTopology() {
            return this.alarmTopology;
        }

        /**
         * @return alarmType
         */
        public String getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String alarmCluster; 
            private Object alarmExtInfo; 
            private String alarmId; 
            private String alarmLog; 
            private String alarmTask; 
            private String alarmTime; 
            private Object alarmTopology; 
            private String alarmType; 
            private String status; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alarmCluster = model.alarmCluster;
                this.alarmExtInfo = model.alarmExtInfo;
                this.alarmId = model.alarmId;
                this.alarmLog = model.alarmLog;
                this.alarmTask = model.alarmTask;
                this.alarmTime = model.alarmTime;
                this.alarmTopology = model.alarmTopology;
                this.alarmType = model.alarmType;
                this.status = model.status;
                this.uid = model.uid;
            } 

            /**
             * <p>The cluster where the alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster1</p>
             */
            public Builder alarmCluster(String alarmCluster) {
                this.alarmCluster = alarmCluster;
                return this;
            }

            /**
             * <p>The extended information of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * error_node_gpu, 
             * error_pod,<br>task_pod_list, 
             * error_type, 
             * kernel,<br>}</p>
             */
            public Builder alarmExtInfo(Object alarmExtInfo) {
                this.alarmExtInfo = alarmExtInfo;
                return this;
            }

            /**
             * <p>The unique ID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>746d13f8-9662-4441-b76b-a8ed8d485195</p>
             */
            public Builder alarmId(String alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>The alerting event log.</p>
             * 
             * <strong>example:</strong>
             * <p>cuda OOM：xxxxx</p>
             */
            public Builder alarmLog(String alarmLog) {
                this.alarmLog = alarmLog;
                return this;
            }

            /**
             * <p>The ID of the task where the anomaly occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>task job id</p>
             */
            public Builder alarmTask(String alarmTask) {
                this.alarmTask = alarmTask;
                return this;
            }

            /**
             * <p>The date and time when the alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-22 18:16:25</p>
             */
            public Builder alarmTime(String alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            /**
             * <p>The topology snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>topology data，e.g.
             *       &quot;alarmTopology&quot;: {
             *         &quot;nodes&quot;: [
             *           {
             *             &quot;gpu_list&quot;: [
             *               {
             *                 &quot;values&quot;: {
             *                   &quot;Basic&quot;: [
             *                     {
             *                       &quot;value&quot;: &quot;1&quot;,
             *                       &quot;key&quot;: &quot;Gpu Number\n&quot;
             *                     }
             *                   ],
             *                   &quot;Metric&quot;: [
             *                     {
             *                       &quot;value&quot;: &quot;50&quot;,
             *                       &quot;key&quot;: &quot;gpu_util(%)\n&quot;
             *                     }
             *                   ],
             *                   &quot;Exception&quot;: [
             *                     {
             *                       &quot;value&quot;: &quot;NCCL HANG&quot;,
             *                       &quot;key&quot;: &quot;error0&quot;
             *                     }
             *                   ]
             *                 },
             *                 &quot;name&quot;: &quot;GPU1&quot;,
             *                 &quot;style&quot;: {
             *                   &quot;fill&quot;: &quot;#e94242\n&quot;,
             *                   &quot;opacity&quot;: &quot;0.1&quot;
             *                 },
             *                 &quot;id&quot;: &quot;6cc37fbc&quot;
             *               }
             *             ],
             *             &quot;values&quot;: {
             *               &quot;Basic&quot;: [
             *                 {
             *                   &quot;value&quot;: &quot;i-xxxxxx&quot;,
             *                   &quot;key&quot;: &quot;instance&quot;
             *                 }
             *               ],
             *               &quot;Metric&quot;: [
             *                 {
             *                   &quot;value&quot;: &quot;value of metrics 1&quot;,
             *                   &quot;key&quot;: &quot;name of metric 1&quot;
             *                 }
             *               ],
             *               &quot;Exception&quot;: [
             *                 {
             *                   &quot;value&quot;: &quot;NCCL HANG&quot;,
             *                   &quot;key&quot;: &quot;error0&quot;
             *                 }
             *               ]
             *             },
             *             &quot;name&quot;: &quot;i-xxxxxx\n&quot;,
             *             &quot;style&quot;: {
             *               &quot;fillOpacity&quot;: &quot;0.5&quot;,
             *               &quot;fill&quot;: &quot;#e94242\n&quot;
             *             },
             *             &quot;id&quot;: &quot;975fbcb0&quot;
             *           }
             *         ],
             *         &quot;edges&quot;: [
             *           {
             *             &quot;src_id&quot;: &quot;00534a88&quot;,
             *             &quot;values&quot;: {
             *               &quot;Basic&quot;: [
             *                 {
             *                   &quot;value&quot;: &quot;v2.22.3\n&quot;,
             *                   &quot;key&quot;: &quot;NCCL Version\n&quot;
             *                 }
             *               ],
             *               &quot;Metric&quot;: [
             *                 {
             *                   &quot;value&quot;: &quot;10000&quot;,
             *                   &quot;key&quot;: &quot;Recv Msg Count&quot;
             *                 }
             *               ],
             *               &quot;Exception&quot;: [
             *                 {
             *                   &quot;value&quot;: &quot;NCCL HANG&quot;,
             *                   &quot;key&quot;: &quot;error0&quot;
             *                 }
             *               ]
             *             },
             *             &quot;dst_id&quot;: &quot;260525e9&quot;,
             *             &quot;style&quot;: {
             *               &quot;opacity&quot;: &quot;0.1&quot;,
             *               &quot;lineWidth&quot;: &quot;1&quot;,
             *               &quot;selectedStyle&quot;: &quot;\&quot;{\\\&quot;opacity\\\&quot;: 1, \\\&quot;lineWidth\\\&quot;: 1}\&quot;\n&quot;,
             *               &quot;stroke&quot;: &quot;#e94242&quot;
             *             },
             *             &quot;type&quot;: &quot;GPU&quot;
             *           }
             *         ]
             *       },</p>
             */
            public Builder alarmTopology(Object alarmTopology) {
                this.alarmTopology = alarmTopology;
                return this;
            }

            /**
             * <p>The alerting type.</p>
             * 
             * <strong>example:</strong>
             * <p>cuda OOM</p>
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>running、blocking、restart、exited、failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1234123412352311</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
