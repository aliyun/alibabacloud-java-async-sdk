// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowInstanceResponseBody</p>
 */
public class GetWorkflowInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkflowInstanceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the workflow instance.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>workflowId=xxx is not existed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
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

        public GetWorkflowInstanceResponseBody build() {
            return new GetWorkflowInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowInstanceResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowInstanceResponseBody</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private Long source;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Long target;

        private Edges(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public Long getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Long source; 
            private Long target; 

            /**
             * <p>The upstream job instance of the current job instance. A value of 0 indicates that the upstream job instance is the root node.</p>
             * 
             * <strong>example:</strong>
             * <p>24058798</p>
             */
            public Builder source(Long source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The downstream job instance of the current job instance.</p>
             * 
             * <strong>example:</strong>
             * <p>24058796</p>
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowInstanceResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempt")
        private Integer attempt;

        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobInstanceId")
        private Long jobInstanceId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WorkAddr")
        private String workAddr;

        private Nodes(Builder builder) {
            this.attempt = builder.attempt;
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.jobId = builder.jobId;
            this.jobInstanceId = builder.jobInstanceId;
            this.jobName = builder.jobName;
            this.result = builder.result;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.workAddr = builder.workAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return attempt
         */
        public Integer getAttempt() {
            return this.attempt;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobInstanceId
         */
        public Long getJobInstanceId() {
            return this.jobInstanceId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return workAddr
         */
        public String getWorkAddr() {
            return this.workAddr;
        }

        public static final class Builder {
            private Integer attempt; 
            private String dataTime; 
            private String endTime; 
            private Long jobId; 
            private Long jobInstanceId; 
            private String jobName; 
            private String result; 
            private String scheduleTime; 
            private String startTime; 
            private Integer status; 
            private String workAddr; 

            /**
             * <p>The number of retries when the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * <p>The data timestamp of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:00</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The time when the job stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:21</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1472</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the job instance.</p>
             * 
             * <strong>example:</strong>
             * <p>24058796</p>
             */
            public Builder jobInstanceId(Long jobInstanceId) {
                this.jobInstanceId = jobInstanceId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestJob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The execution result of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>code=200</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The time when the job was scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:03</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The time when the job started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:03</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the job instance. Valid values: 1: The job instance is waiting for execution. 3: The job instance is running. 4: The job instance is run. 5: The job instance failed to run. 9: The job instance is rejected. Enumeration class: com.alibaba.schedulerx.common.domain.InstanceStatus.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The worker on which the job instance run.</p>
             * 
             * <strong>example:</strong>
             * <p>10.163.0.101:34027</p>
             */
            public Builder workAddr(String workAddr) {
                this.workAddr = workAddr;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowInstanceResponseBody</p>
     */
    public static class WfInstanceDag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edges")
        private java.util.List < Edges> edges;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        private WfInstanceDag(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WfInstanceDag create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List < Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List < Edges> edges; 
            private java.util.List < Nodes> nodes; 

            /**
             * <p>The dependencies between job instances.</p>
             */
            public Builder edges(java.util.List < Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>The job instances.</p>
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public WfInstanceDag build() {
                return new WfInstanceDag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowInstanceResponseBody</p>
     */
    public static class WfInstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private WfInstanceInfo(Builder builder) {
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WfInstanceInfo create() {
            return builder().build();
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dataTime; 
            private String endTime; 
            private String scheduleTime; 
            private String startTime; 
            private Integer status; 

            /**
             * <p>The data timestamp of the workflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:00</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The time when the workflow instance stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:21</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the workflow instance was scheduled to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:00</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The time when the workflow instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-03 18:00:01</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the workflow instance. Valid values:</p>
             * <ul>
             * <li>1: pending</li>
             * <li>2: preparing</li>
             * <li>3: running</li>
             * <li>4: successful</li>
             * <li>5: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public WfInstanceInfo build() {
                return new WfInstanceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WfInstanceDag")
        private WfInstanceDag wfInstanceDag;

        @com.aliyun.core.annotation.NameInMap("WfInstanceInfo")
        private WfInstanceInfo wfInstanceInfo;

        private Data(Builder builder) {
            this.wfInstanceDag = builder.wfInstanceDag;
            this.wfInstanceInfo = builder.wfInstanceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return wfInstanceDag
         */
        public WfInstanceDag getWfInstanceDag() {
            return this.wfInstanceDag;
        }

        /**
         * @return wfInstanceInfo
         */
        public WfInstanceInfo getWfInstanceInfo() {
            return this.wfInstanceInfo;
        }

        public static final class Builder {
            private WfInstanceDag wfInstanceDag; 
            private WfInstanceInfo wfInstanceInfo; 

            /**
             * <p>The directed acyclic graph (DAG) of the workflow instance, including nodes and dependencies.</p>
             */
            public Builder wfInstanceDag(WfInstanceDag wfInstanceDag) {
                this.wfInstanceDag = wfInstanceDag;
                return this;
            }

            /**
             * <p>The details of the workflow instance, including the state of the workflow instance, the time when the workflow instance started to run, the time when the workflow instance stopped running, the state of each job instance, and the dependencies between job instances.</p>
             */
            public Builder wfInstanceInfo(WfInstanceInfo wfInstanceInfo) {
                this.wfInstanceInfo = wfInstanceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
