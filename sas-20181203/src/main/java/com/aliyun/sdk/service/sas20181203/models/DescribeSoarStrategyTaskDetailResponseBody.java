// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSoarStrategyTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarStrategyTaskDetailResponseBody</p>
 */
public class DescribeSoarStrategyTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskDetail")
    private TaskDetail taskDetail;

    private DescribeSoarStrategyTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskDetail = builder.taskDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskDetail
     */
    public TaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static final class Builder {
        private String requestId; 
        private TaskDetail taskDetail; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FBBEB173-1F43-505F-A876-C03ECDF6CE4C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the task.</p>
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        public DescribeSoarStrategyTaskDetailResponseBody build() {
            return new DescribeSoarStrategyTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSoarStrategyTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarStrategyTaskDetailResponseBody</p>
     */
    public static class TaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private String logInfo;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("ProcessInfo")
        private String processInfo;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private TaskDetail(Builder builder) {
            this.logInfo = builder.logInfo;
            this.params = builder.params;
            this.processInfo = builder.processInfo;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetail create() {
            return builder().build();
        }

        /**
         * @return logInfo
         */
        public String getLogInfo() {
            return this.logInfo;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return processInfo
         */
        public String getProcessInfo() {
            return this.processInfo;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String logInfo; 
            private String params; 
            private String processInfo; 
            private String taskName; 

            /**
             * <p>The operational log information of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;resultContent&quot;: &quot;{&quot;failedNum&quot;:0,&quot;totalNum&quot;:1,&quot;successNum&quot;:1}&quot;,
             * &quot;resultStatus&quot;: 0,
             * &quot;status&quot;: 2
             * }</p>
             */
            public Builder logInfo(String logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            /**
             * <p>The parameters of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;name&quot;: &quot;vulList&quot;,
             *         &quot;associationProperty&quot;: &quot;sasAllVul&quot;,
             *         &quot;value&quot;: [
             *             {
             *                 &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
             *                 &quot;instanceId&quot;: &quot;i-bp10i3dtyq7x4<strong><strong>5e&quot;,
             *                 &quot;instanceName&quot;: &quot;xxx&quot;,
             *                 &quot;vulId&quot;: 1222,
             *                 &quot;vulName&quot;: &quot;centos:7:cesa-2024:1249&quot;,
             *                 &quot;vulAliasName&quot;: &quot;CESA-2024:1249&quot;,
             *                 &quot;vulTag&quot;: &quot;oval&quot;,
             *                 &quot;vulUuid&quot;: &quot;3c5eb76a-df89-</strong></strong>-85ef-67562cdc2344&quot;,
             *                 &quot;vulType&quot;: &quot;cve&quot;,
             *                 &quot;vulModifyTs&quot;: 1721324258000
             *             }
             *         ]
             *     },
             *     {
             *         &quot;name&quot;: &quot;snapshotConfig&quot;,
             *         &quot;associationProperty&quot;: &quot;snapshotConfig&quot;,
             *         &quot;value&quot;: {
             *             &quot;ttl&quot;: 1
             *         }
             *     },
             *     {
             *         &quot;name&quot;: &quot;notifyConfig&quot;,
             *         &quot;associationProperty&quot;: &quot;notifyConfig&quot;,
             *         &quot;value&quot;: {
             *             &quot;ding&quot;: [
             *                 {
             *                     &quot;value&quot;: 2195,
             *                     &quot;label&quot;: &quot;test&quot;
             *                 }
             *             ]
             *         }
             *     }
             * ]</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The process information of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;edges&quot;: [
             *         {
             *             &quot;level&quot;: 0,
             *             &quot;removeFlag&quot;: 0,
             *             &quot;source&quot;: 1,
             *             &quot;target&quot;: 8
             *         }
             *     ],
             *     &quot;nodes&quot;: [
             *         {
             *             &quot;actionId&quot;: &quot;Action_014s73k&quot;,
             *             &quot;iconUrl&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1T*****jSZLeXXb9kVXa-12-14.svg">https://img.alicdn.com/tfs/TB1T*****jSZLeXXb9kVXa-12-14.svg</a>&quot;,
             *             &quot;id&quot;: 1,
             *             &quot;label&quot;: &quot;describeDisks&quot;,
             *             &quot;nodeName&quot;: &quot;DescribeDisks&quot;,
             *             &quot;status&quot;: 0,
             *             &quot;type&quot;: &quot;openAPI&quot;
             *         }
             *     ]
             * }</p>
             */
            public Builder processInfo(String processInfo) {
                this.processInfo = processInfo;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-1</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public TaskDetail build() {
                return new TaskDetail(this);
            } 

        } 

    }
}
