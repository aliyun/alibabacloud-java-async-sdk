// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ListJobStepResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobStepResponseBody</p>
 */
public class ListJobStepResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobSteps")
    private java.util.List<JobSteps> jobSteps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UseV2API")
    private Boolean useV2API;

    private ListJobStepResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobSteps = builder.jobSteps;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.useV2API = builder.useV2API;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobStepResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobSteps
     */
    public java.util.List<JobSteps> getJobSteps() {
        return this.jobSteps;
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
     * @return useV2API
     */
    public Boolean getUseV2API() {
        return this.useV2API;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<JobSteps> jobSteps; 
        private String requestId; 
        private Boolean success; 
        private Boolean useV2API; 

        private Builder() {
        } 

        private Builder(ListJobStepResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobSteps = model.jobSteps;
            this.requestId = model.requestId;
            this.success = model.success;
            this.useV2API = model.useV2API;
        } 

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The task step information.</p>
         */
        public Builder jobSteps(java.util.List<JobSteps> jobSteps) {
            this.jobSteps = jobSteps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates whether the Console 2.0 API is used.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder useV2API(Boolean useV2API) {
            this.useV2API = useV2API;
            return this;
        }

        public ListJobStepResponseBody build() {
            return new ListJobStepResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobStepResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobStepResponseBody</p>
     */
    public static class ErrorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HelpUrl")
        private String helpUrl;

        private ErrorDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.helpUrl = builder.helpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public static final class Builder {
            private String errorCode; 
            private String helpUrl; 

            private Builder() {
            } 

            private Builder(ErrorDetails model) {
                this.errorCode = model.errorCode;
                this.helpUrl = model.helpUrl;
            } 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>URL of the help document.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobStepResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobStepResponseBody</p>
     */
    public static class SubJobStepsErrorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HelpUrl")
        private String helpUrl;

        private SubJobStepsErrorDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.helpUrl = builder.helpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubJobStepsErrorDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public static final class Builder {
            private String errorCode; 
            private String helpUrl; 

            private Builder() {
            } 

            private Builder(SubJobStepsErrorDetails model) {
                this.errorCode = model.errorCode;
                this.helpUrl = model.helpUrl;
            } 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>URL of the help document.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            public SubJobStepsErrorDetails build() {
                return new SubJobStepsErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobStepResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobStepResponseBody</p>
     */
    public static class SubJobSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<SubJobStepsErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("IncLatencyMilliseconds")
        private String incLatencyMilliseconds;

        @com.aliyun.core.annotation.NameInMap("IncLatencySeconds")
        private Long incLatencySeconds;

        @com.aliyun.core.annotation.NameInMap("JobStepId")
        private String jobStepId;

        @com.aliyun.core.annotation.NameInMap("JobStepName")
        private String jobStepName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NeedAcceleration")
        private Boolean needAcceleration;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Serial")
        private Integer serial;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private SubJobSteps(Builder builder) {
            this.bootTime = builder.bootTime;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.errMsg = builder.errMsg;
            this.errorDetails = builder.errorDetails;
            this.finishTime = builder.finishTime;
            this.incLatencyMilliseconds = builder.incLatencyMilliseconds;
            this.incLatencySeconds = builder.incLatencySeconds;
            this.jobStepId = builder.jobStepId;
            this.jobStepName = builder.jobStepName;
            this.modifyTime = builder.modifyTime;
            this.needAcceleration = builder.needAcceleration;
            this.progress = builder.progress;
            this.serial = builder.serial;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubJobSteps create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<SubJobStepsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return incLatencyMilliseconds
         */
        public String getIncLatencyMilliseconds() {
            return this.incLatencyMilliseconds;
        }

        /**
         * @return incLatencySeconds
         */
        public Long getIncLatencySeconds() {
            return this.incLatencySeconds;
        }

        /**
         * @return jobStepId
         */
        public String getJobStepId() {
            return this.jobStepId;
        }

        /**
         * @return jobStepName
         */
        public String getJobStepName() {
            return this.jobStepName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return needAcceleration
         */
        public Boolean getNeedAcceleration() {
            return this.needAcceleration;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return serial
         */
        public Integer getSerial() {
            return this.serial;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String bootTime; 
            private String code; 
            private String createTime; 
            private String errMsg; 
            private java.util.List<SubJobStepsErrorDetails> errorDetails; 
            private String finishTime; 
            private String incLatencyMilliseconds; 
            private Long incLatencySeconds; 
            private String jobStepId; 
            private String jobStepName; 
            private String modifyTime; 
            private Boolean needAcceleration; 
            private Integer progress; 
            private Integer serial; 
            private String state; 

            private Builder() {
            } 

            private Builder(SubJobSteps model) {
                this.bootTime = model.bootTime;
                this.code = model.code;
                this.createTime = model.createTime;
                this.errMsg = model.errMsg;
                this.errorDetails = model.errorDetails;
                this.finishTime = model.finishTime;
                this.incLatencyMilliseconds = model.incLatencyMilliseconds;
                this.incLatencySeconds = model.incLatencySeconds;
                this.jobStepId = model.jobStepId;
                this.jobStepName = model.jobStepName;
                this.modifyTime = model.modifyTime;
                this.needAcceleration = model.needAcceleration;
                this.progress = model.progress;
                this.serial = model.serial;
                this.state = model.state;
            } 

            /**
             * <p>The time when the sub-job was started, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02T02:00:21Z</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>Sub-task step identity.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the sub-job was created, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-20T02:13:12Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>UncaughtException:java.lang.NullPointerException</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>Error message.</p>
             */
            public Builder errorDetails(java.util.List<SubJobStepsErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * <p>End time of the sub-task, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T02:15:14Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>Incremental data latency, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder incLatencyMilliseconds(String incLatencyMilliseconds) {
                this.incLatencyMilliseconds = incLatencyMilliseconds;
                return this;
            }

            /**
             * <p>Incremental data latency, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder incLatencySeconds(Long incLatencySeconds) {
                this.incLatencySeconds = incLatencySeconds;
                return this;
            }

            /**
             * <p>Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mj3z9w9s10am68o_0004_0000</p>
             */
            public Builder jobStepId(String jobStepId) {
                this.jobStepId = jobStepId;
                return this;
            }

            /**
             * <p>Sub-job step information. Valid values are as follows:</p>
             * <ul>
             * <li>Precheck: precheck phase</li>
             * <li>Incremental data service: incremental data collection phase</li>
             * <li>dts.step.struct.load: schema migration phase</li>
             * <li>dts.step.data.load: full migration phase</li>
             * <li>etl-check: extract, transform, and load (ETL) phase</li>
             * <li>Consistency validation: data verification phase</li>
             * <li>Synchronization: incremental synchronization phase</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder jobStepName(String jobStepName) {
                this.jobStepName = jobStepName;
                return this;
            }

            /**
             * <p>The time when the sub-job was updated, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-22T02:04:35Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>Indicates whether the acceleration feature is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needAcceleration(Boolean needAcceleration) {
                this.needAcceleration = needAcceleration;
                return this;
            }

            /**
             * <p>Progress of the sub-job step.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Serial number of the sub-task step. Indicates the task execution order; the smaller the numeric value, the earlier the execution order.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder serial(Integer serial) {
                this.serial = serial;
                return this;
            }

            /**
             * <p>Status of the sub-task step. Valid values:</p>
             * <ul>
             * <li>Failed: failed.</li>
             * <li>Pause: paused.</li>
             * <li>Schedule: scheduled.</li>
             * <li>Init: initialization.</li>
             * <li>Running: synchronizing.</li>
             * <li>Catched: waiting for synchronization.</li>
             * <li>Finished: ended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public SubJobSteps build() {
                return new SubJobSteps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobStepResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobStepResponseBody</p>
     */
    public static class JobSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("IncLatencyMilliseconds")
        private Long incLatencyMilliseconds;

        @com.aliyun.core.annotation.NameInMap("IncLatencySeconds")
        private Long incLatencySeconds;

        @com.aliyun.core.annotation.NameInMap("JobStepId")
        private String jobStepId;

        @com.aliyun.core.annotation.NameInMap("JobStepName")
        private String jobStepName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NeedAcceleration")
        private Boolean needAcceleration;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Serial")
        private Integer serial;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SubJobCount")
        private Integer subJobCount;

        @com.aliyun.core.annotation.NameInMap("SubJobSteps")
        private java.util.List<SubJobSteps> subJobSteps;

        @com.aliyun.core.annotation.NameInMap("redisPhaseType")
        private String redisPhaseType;

        private JobSteps(Builder builder) {
            this.bootTime = builder.bootTime;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.errMsg = builder.errMsg;
            this.errorDetails = builder.errorDetails;
            this.finishTime = builder.finishTime;
            this.incLatencyMilliseconds = builder.incLatencyMilliseconds;
            this.incLatencySeconds = builder.incLatencySeconds;
            this.jobStepId = builder.jobStepId;
            this.jobStepName = builder.jobStepName;
            this.modifyTime = builder.modifyTime;
            this.needAcceleration = builder.needAcceleration;
            this.progress = builder.progress;
            this.serial = builder.serial;
            this.state = builder.state;
            this.subJobCount = builder.subJobCount;
            this.subJobSteps = builder.subJobSteps;
            this.redisPhaseType = builder.redisPhaseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSteps create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return incLatencyMilliseconds
         */
        public Long getIncLatencyMilliseconds() {
            return this.incLatencyMilliseconds;
        }

        /**
         * @return incLatencySeconds
         */
        public Long getIncLatencySeconds() {
            return this.incLatencySeconds;
        }

        /**
         * @return jobStepId
         */
        public String getJobStepId() {
            return this.jobStepId;
        }

        /**
         * @return jobStepName
         */
        public String getJobStepName() {
            return this.jobStepName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return needAcceleration
         */
        public Boolean getNeedAcceleration() {
            return this.needAcceleration;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return serial
         */
        public Integer getSerial() {
            return this.serial;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return subJobCount
         */
        public Integer getSubJobCount() {
            return this.subJobCount;
        }

        /**
         * @return subJobSteps
         */
        public java.util.List<SubJobSteps> getSubJobSteps() {
            return this.subJobSteps;
        }

        /**
         * @return redisPhaseType
         */
        public String getRedisPhaseType() {
            return this.redisPhaseType;
        }

        public static final class Builder {
            private String bootTime; 
            private String code; 
            private String createTime; 
            private String errMsg; 
            private java.util.List<ErrorDetails> errorDetails; 
            private String finishTime; 
            private Long incLatencyMilliseconds; 
            private Long incLatencySeconds; 
            private String jobStepId; 
            private String jobStepName; 
            private String modifyTime; 
            private Boolean needAcceleration; 
            private Integer progress; 
            private Integer serial; 
            private String state; 
            private Integer subJobCount; 
            private java.util.List<SubJobSteps> subJobSteps; 
            private String redisPhaseType; 

            private Builder() {
            } 

            private Builder(JobSteps model) {
                this.bootTime = model.bootTime;
                this.code = model.code;
                this.createTime = model.createTime;
                this.errMsg = model.errMsg;
                this.errorDetails = model.errorDetails;
                this.finishTime = model.finishTime;
                this.incLatencyMilliseconds = model.incLatencyMilliseconds;
                this.incLatencySeconds = model.incLatencySeconds;
                this.jobStepId = model.jobStepId;
                this.jobStepName = model.jobStepName;
                this.modifyTime = model.modifyTime;
                this.needAcceleration = model.needAcceleration;
                this.progress = model.progress;
                this.serial = model.serial;
                this.state = model.state;
                this.subJobCount = model.subJobCount;
                this.subJobSteps = model.subJobSteps;
                this.redisPhaseType = model.redisPhaseType;
            } 

            /**
             * <p>The job start time, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-11T09:33:23Z</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>Task step identity.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The job creation time, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-28T17:13:51Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>fullcheck find different records : 2372</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The error message.</p>
             */
            public Builder errorDetails(java.util.List<ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * <p>Task end time, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T02:15:14Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>Incremental data latency, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder incLatencyMilliseconds(Long incLatencyMilliseconds) {
                this.incLatencyMilliseconds = incLatencyMilliseconds;
                return this;
            }

            /**
             * <p>Incremental data latency, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder incLatencySeconds(Long incLatencySeconds) {
                this.incLatencySeconds = incLatencySeconds;
                return this;
            }

            /**
             * <p>The task step ID.</p>
             * 
             * <strong>example:</strong>
             * <p>l02c1f7h179****</p>
             */
            public Builder jobStepId(String jobStepId) {
                this.jobStepId = jobStepId;
                return this;
            }

            /**
             * <p>Task step information. Valid values:</p>
             * <ul>
             * <li>Precheck: precheck phase</li>
             * <li>Incremental data service: incremental data collection phase</li>
             * <li>dts.step.struct.load: schema migration phase</li>
             * <li>dts.step.data.load: full migration phase</li>
             * <li>etl-check: extract, transform, and load phase</li>
             * <li>Consistency validation: data verification phase</li>
             * <li>Synchronization: incremental synchronization phase</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>预检查</p>
             */
            public Builder jobStepName(String jobStepName) {
                this.jobStepName = jobStepName;
                return this;
            }

            /**
             * <p>The time when the job was updated, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-03T02:26:14Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>Indicates whether the acceleration feature should be provided.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needAcceleration(Boolean needAcceleration) {
                this.needAcceleration = needAcceleration;
                return this;
            }

            /**
             * <p>The progress of the task step.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Task step serial number. Indicates the task execution order. A smaller value indicates an earlier execution order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serial(Integer serial) {
                this.serial = serial;
                return this;
            }

            /**
             * <p>Task step status.</p>
             * 
             * <strong>example:</strong>
             * <p>○ Finished</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The number of sub-jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subJobCount(Integer subJobCount) {
                this.subJobCount = subJobCount;
                return this;
            }

            /**
             * <p>Step information of the sub-job.</p>
             */
            public Builder subJobSteps(java.util.List<SubJobSteps> subJobSteps) {
                this.subJobSteps = subJobSteps;
                return this;
            }

            /**
             * <p>Used to distinguish between the Redis full and incremental phases. Valid values:</p>
             * <ul>
             * <li>full: Full phase</li>
             * <li>inc: Incremental phase</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>full</p>
             */
            public Builder redisPhaseType(String redisPhaseType) {
                this.redisPhaseType = redisPhaseType;
                return this;
            }

            public JobSteps build() {
                return new JobSteps(this);
            } 

        } 

    }
}
