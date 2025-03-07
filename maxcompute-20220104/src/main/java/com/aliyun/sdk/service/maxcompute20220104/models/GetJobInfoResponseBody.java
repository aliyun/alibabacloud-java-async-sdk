// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobInfoResponseBody</p>
 */
public class GetJobInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetJobInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OBJECT_NOT_EXIST</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This object does not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0bb16654558425251398e27a9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobInfoResponseBody build() {
            return new GetJobInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
    public static class JobSubStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private JobSubStatusList(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSubStatusList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer code; 
            private String description; 
            private String startTime; 

            /**
             * <p>The code of the sub-status.</p>
             * 
             * <strong>example:</strong>
             * <p>1010</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of the sub-status.</p>
             * 
             * <strong>example:</strong>
             * <p>Waiting for scheduling</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The start time of the sub-status.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-05 00:04:15.717364 +0800</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public JobSubStatusList build() {
                return new JobSubStatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
    public static class SceneResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("params")
        private java.util.Map<String, String> params;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("sceneTag")
        private String sceneTag;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SceneResults(Builder builder) {
            this.description = builder.description;
            this.params = builder.params;
            this.scene = builder.scene;
            this.sceneTag = builder.sceneTag;
            this.summary = builder.summary;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneResults create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return params
         */
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return sceneTag
         */
        public String getSceneTag() {
            return this.sceneTag;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private java.util.Map<String, String> params; 
            private String scene; 
            private String sceneTag; 
            private String summary; 
            private String type; 

            /**
             * <p>The intelligent diagnostics result description.</p>
             * 
             * <strong>example:</strong>
             * <p>This job uses annual and monthly computing resources. It may be that the job is waiting for resources due to the large amount of overall job running data, many resources requested, and low job priority. Please go to Resource Consumption to view the specific situation. You can also go to Cost Optimization to see if you need to adjust resource configuration.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Information about the nodes where data skew or data expansion is detected. This parameter is returned only when the diagnostics scenario is data skew or data expansion.</p>
             */
            public Builder params(java.util.Map<String, String> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>LackResource</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result tag.</p>
             * 
             * <strong>example:</strong>
             * <p>SubscriptionLackResource</p>
             */
            public Builder sceneTag(String sceneTag) {
                this.sceneTag = sceneTag;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Insufficient computing resources available for the job. Click to view details.</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result type.</p>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SceneResults build() {
                return new SceneResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuUsage")
        private Long cuUsage;

        @com.aliyun.core.annotation.NameInMap("endAtTime")
        private Long endAtTime;

        @com.aliyun.core.annotation.NameInMap("extNodeId")
        private String extNodeId;

        @com.aliyun.core.annotation.NameInMap("extNodeOnDuty")
        private String extNodeOnDuty;

        @com.aliyun.core.annotation.NameInMap("extPlantFrom")
        private String extPlantFrom;

        @com.aliyun.core.annotation.NameInMap("inputBytes")
        private Double inputBytes;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("jobOwner")
        private String jobOwner;

        @com.aliyun.core.annotation.NameInMap("jobSubStatusList")
        private java.util.List<JobSubStatusList> jobSubStatusList;

        @com.aliyun.core.annotation.NameInMap("jobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("memoryUsage")
        private Long memoryUsage;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("quotaNickname")
        private String quotaNickname;

        @com.aliyun.core.annotation.NameInMap("quotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("runningAtTime")
        private Long runningAtTime;

        @com.aliyun.core.annotation.NameInMap("runningTime")
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("sceneResults")
        private java.util.List<SceneResults> sceneResults;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("submittedAtTime")
        private Long submittedAtTime;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("totalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("waitingTime")
        private Long waitingTime;

        private Data(Builder builder) {
            this.cuUsage = builder.cuUsage;
            this.endAtTime = builder.endAtTime;
            this.extNodeId = builder.extNodeId;
            this.extNodeOnDuty = builder.extNodeOnDuty;
            this.extPlantFrom = builder.extPlantFrom;
            this.inputBytes = builder.inputBytes;
            this.instanceId = builder.instanceId;
            this.jobOwner = builder.jobOwner;
            this.jobSubStatusList = builder.jobSubStatusList;
            this.jobType = builder.jobType;
            this.memoryUsage = builder.memoryUsage;
            this.priority = builder.priority;
            this.project = builder.project;
            this.quotaNickname = builder.quotaNickname;
            this.quotaType = builder.quotaType;
            this.region = builder.region;
            this.runningAtTime = builder.runningAtTime;
            this.runningTime = builder.runningTime;
            this.sceneResults = builder.sceneResults;
            this.signature = builder.signature;
            this.status = builder.status;
            this.submittedAtTime = builder.submittedAtTime;
            this.tenantId = builder.tenantId;
            this.totalTime = builder.totalTime;
            this.waitingTime = builder.waitingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cuUsage
         */
        public Long getCuUsage() {
            return this.cuUsage;
        }

        /**
         * @return endAtTime
         */
        public Long getEndAtTime() {
            return this.endAtTime;
        }

        /**
         * @return extNodeId
         */
        public String getExtNodeId() {
            return this.extNodeId;
        }

        /**
         * @return extNodeOnDuty
         */
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        /**
         * @return extPlantFrom
         */
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        /**
         * @return inputBytes
         */
        public Double getInputBytes() {
            return this.inputBytes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobOwner
         */
        public String getJobOwner() {
            return this.jobOwner;
        }

        /**
         * @return jobSubStatusList
         */
        public java.util.List<JobSubStatusList> getJobSubStatusList() {
            return this.jobSubStatusList;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return memoryUsage
         */
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return quotaNickname
         */
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return runningAtTime
         */
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return sceneResults
         */
        public java.util.List<SceneResults> getSceneResults() {
            return this.sceneResults;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submittedAtTime
         */
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return waitingTime
         */
        public Long getWaitingTime() {
            return this.waitingTime;
        }

        public static final class Builder {
            private Long cuUsage; 
            private Long endAtTime; 
            private String extNodeId; 
            private String extNodeOnDuty; 
            private String extPlantFrom; 
            private Double inputBytes; 
            private String instanceId; 
            private String jobOwner; 
            private java.util.List<JobSubStatusList> jobSubStatusList; 
            private String jobType; 
            private Long memoryUsage; 
            private Long priority; 
            private String project; 
            private String quotaNickname; 
            private String quotaType; 
            private String region; 
            private Long runningAtTime; 
            private Long runningTime; 
            private java.util.List<SceneResults> sceneResults; 
            private String signature; 
            private String status; 
            private Long submittedAtTime; 
            private String tenantId; 
            private Long totalTime; 
            private Long waitingTime; 

            /**
             * <p>CPU usage of the job at the snapshot time. Unit: Core.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cuUsage(Long cuUsage) {
                this.cuUsage = cuUsage;
                return this;
            }

            /**
             * <p>The time when the job was finished.</p>
             * 
             * <strong>example:</strong>
             * <p>1672112913</p>
             */
            public Builder endAtTime(Long endAtTime) {
                this.endAtTime = endAtTime;
                return this;
            }

            /**
             * <p>The ID of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>node_4</p>
             */
            public Builder extNodeId(String extNodeId) {
                this.extNodeId = extNodeId;
                return this;
            }

            /**
             * <p>The account ID of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>duty_2</p>
             */
            public Builder extNodeOnDuty(String extNodeOnDuty) {
                this.extNodeOnDuty = extNodeOnDuty;
                return this;
            }

            /**
             * <p>The upstream platform.</p>
             * 
             * <strong>example:</strong>
             * <p>platform_3</p>
             */
            public Builder extPlantFrom(String extPlantFrom) {
                this.extPlantFrom = extPlantFrom;
                return this;
            }

            /**
             * <p>The amount of scanned data for the job. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder inputBytes(Double inputBytes) {
                this.inputBytes = inputBytes;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20230410****60gg</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The account that commits the job.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$7632***@aliyun.com</p>
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * <p>The list of sub-status of the job.</p>
             */
            public Builder jobSubStatusList(java.util.List<JobSubStatusList> jobSubStatusList) {
                this.jobSubStatusList = jobSubStatusList;
                return this;
            }

            /**
             * <p>The type of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>Memory usage of the job at the snapshot time. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * <p>The priority of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_cdm_prod</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The nickname of the computing Quota used by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>os_bigdata</p>
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            /**
             * <p>The type of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The start time of the job.</p>
             * <blockquote>
             * <p>The time when the job received the first batch of computing resources.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1672112113</p>
             */
            public Builder runningAtTime(Long runningAtTime) {
                this.runningAtTime = runningAtTime;
                return this;
            }

            /**
             * <p>The running duration, which is the duration from the runningAtTime to the snapshotTime of the job. Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>The intelligent diagnostics results.</p>
             */
            public Builder sceneResults(java.util.List<SceneResults> sceneResults) {
                this.sceneResults = sceneResults;
                return this;
            }

            /**
             * <p>The signature of the SQL job.</p>
             * 
             * <strong>example:</strong>
             * <p>20c1efb4a7caca1865f4aa784bb500efae74af04</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the job was committed.</p>
             * 
             * <strong>example:</strong>
             * <p>1672112013</p>
             */
            public Builder submittedAtTime(Long submittedAtTime) {
                this.submittedAtTime = submittedAtTime;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4784****5249</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The interval from the time when the job was submitted to the snapshotTime .Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The duration from the time the job is submitted to the time the job starts to run. Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder waitingTime(Long waitingTime) {
                this.waitingTime = waitingTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
