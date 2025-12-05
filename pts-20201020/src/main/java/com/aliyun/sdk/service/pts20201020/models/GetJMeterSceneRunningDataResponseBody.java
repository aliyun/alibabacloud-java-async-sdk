// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetJMeterSceneRunningDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterSceneRunningDataResponseBody</p>
 */
public class GetJMeterSceneRunningDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DocumentUrl")
    private String documentUrl;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningData")
    private RunningData runningData;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetJMeterSceneRunningDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.documentUrl = builder.documentUrl;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.runningData = builder.runningData;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterSceneRunningDataResponseBody create() {
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
     * @return documentUrl
     */
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return runningData
     */
    public RunningData getRunningData() {
        return this.runningData;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String documentUrl; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private RunningData runningData; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetJMeterSceneRunningDataResponseBody model) {
            this.code = model.code;
            this.documentUrl = model.documentUrl;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.runningData = model.runningData;
            this.success = model.success;
        } 

        /**
         * <p>The system status code. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The URL that is used to access the document.</p>
         */
        public Builder documentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }

        /**
         * <p>The HTTP status code. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The running data.</p>
         */
        public Builder runningData(RunningData runningData) {
            this.runningData = runningData;
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

        public GetJMeterSceneRunningDataResponseBody build() {
            return new GetJMeterSceneRunningDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJMeterSceneRunningDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetJMeterSceneRunningDataResponseBody</p>
     */
    public static class RunningData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("AgentIdList")
        private java.util.List<String> agentIdList;

        @com.aliyun.core.annotation.NameInMap("AllSampleStat")
        private java.util.Map<String, ?> allSampleStat;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("HasError")
        private Boolean hasError;

        @com.aliyun.core.annotation.NameInMap("HasReport")
        private Boolean hasReport;

        @com.aliyun.core.annotation.NameInMap("HoldFor")
        private Integer holdFor;

        @com.aliyun.core.annotation.NameInMap("IsDebugging")
        private Boolean isDebugging;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("SampleStatList")
        private java.util.List<java.util.Map<String, ?>> sampleStatList;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("StartTimeTS")
        private Long startTimeTS;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Vum")
        private Long vum;

        private RunningData(Builder builder) {
            this.agentCount = builder.agentCount;
            this.agentIdList = builder.agentIdList;
            this.allSampleStat = builder.allSampleStat;
            this.concurrency = builder.concurrency;
            this.errorMessage = builder.errorMessage;
            this.hasError = builder.hasError;
            this.hasReport = builder.hasReport;
            this.holdFor = builder.holdFor;
            this.isDebugging = builder.isDebugging;
            this.reportId = builder.reportId;
            this.sampleStatList = builder.sampleStatList;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.stageName = builder.stageName;
            this.startTimeTS = builder.startTimeTS;
            this.status = builder.status;
            this.vum = builder.vum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningData create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return agentIdList
         */
        public java.util.List<String> getAgentIdList() {
            return this.agentIdList;
        }

        /**
         * @return allSampleStat
         */
        public java.util.Map<String, ?> getAllSampleStat() {
            return this.allSampleStat;
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return hasError
         */
        public Boolean getHasError() {
            return this.hasError;
        }

        /**
         * @return hasReport
         */
        public Boolean getHasReport() {
            return this.hasReport;
        }

        /**
         * @return holdFor
         */
        public Integer getHoldFor() {
            return this.holdFor;
        }

        /**
         * @return isDebugging
         */
        public Boolean getIsDebugging() {
            return this.isDebugging;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return sampleStatList
         */
        public java.util.List<java.util.Map<String, ?>> getSampleStatList() {
            return this.sampleStatList;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return startTimeTS
         */
        public Long getStartTimeTS() {
            return this.startTimeTS;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vum
         */
        public Long getVum() {
            return this.vum;
        }

        public static final class Builder {
            private Integer agentCount; 
            private java.util.List<String> agentIdList; 
            private java.util.Map<String, ?> allSampleStat; 
            private Integer concurrency; 
            private String errorMessage; 
            private Boolean hasError; 
            private Boolean hasReport; 
            private Integer holdFor; 
            private Boolean isDebugging; 
            private String reportId; 
            private java.util.List<java.util.Map<String, ?>> sampleStatList; 
            private String sceneId; 
            private String sceneName; 
            private String stageName; 
            private Long startTimeTS; 
            private String status; 
            private Long vum; 

            private Builder() {
            } 

            private Builder(RunningData model) {
                this.agentCount = model.agentCount;
                this.agentIdList = model.agentIdList;
                this.allSampleStat = model.allSampleStat;
                this.concurrency = model.concurrency;
                this.errorMessage = model.errorMessage;
                this.hasError = model.hasError;
                this.hasReport = model.hasReport;
                this.holdFor = model.holdFor;
                this.isDebugging = model.isDebugging;
                this.reportId = model.reportId;
                this.sampleStatList = model.sampleStatList;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.stageName = model.stageName;
                this.startTimeTS = model.startTimeTS;
                this.status = model.status;
                this.vum = model.vum;
            } 

            /**
             * <p>The number of stress testing engines.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The stress testing engines.</p>
             */
            public Builder agentIdList(java.util.List<String> agentIdList) {
                this.agentIdList = agentIdList;
                return this;
            }

            /**
             * <p>The sampling status of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;failTps&quot;:0,&quot;successRtAvg&quot;:33,&quot;successRtMin&quot;:29,&quot;successRtSum&quot;:99407,         &quot;rtAvg&quot;:33.459104678559406,&quot;rtMin&quot;:29,&quot;failRtMax&quot;:0,&quot;duration&quot;:997,         &quot;samplerId&quot;:-1, &quot;successRtMax&quot;:133,&quot;fullStat&quot;:{       &quot;requestBytesSum&quot;:629926,&quot;successRtAvg&quot;:33,&quot;successRtMin&quot;:29,&quot;successRtSum&quot;:174551,&quot;count&quot;:5206,&quot;rtSeg99&quot;:53, &quot;successTps&quot;:2397.9732842008293,&quot;rtSeg90&quot;:36, &quot;rtSeg50&quot;:32,            &quot;rtSeg99Sum&quot;:53,&quot;rtAvg&quot;:33.528812908182864, &quot;rtMin&quot;:29,             &quot;failRtMax&quot;:0,&quot;duration&quot;:2171, &quot;successCount&quot;:5206,            &quot;rtSegStatCount&quot;:1,&quot;tps&quot;:2397.9732842008293 }, &quot;successCount&quot;:2971, &quot;failRtSum&quot;:0,&quot;failCount&quot;:0,&quot;count&quot;:2971,&quot;concurrency&quot;:100, &quot;successTps&quot;:2979.939819458375,&quot;tps&quot;:2979.939819458375,&quot;failRtAvg&quot;:0,         &quot;failRtMin&quot;:0,  &quot;rtMax&quot;:133}</p>
             */
            public Builder allSampleStat(java.util.Map<String, ?> allSampleStat) {
                this.allSampleStat = allSampleStat;
                return this;
            }

            /**
             * <p>The concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The error message returned for the stress testing process. If the request was successful, this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Engine lease failed.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether an error occurs in the stress testing process.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasError(Boolean hasError) {
                this.hasError = hasError;
                return this;
            }

            /**
             * <p>Indicates whether the report is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasReport(Boolean hasReport) {
                this.hasReport = hasReport;
                return this;
            }

            /**
             * <p>The duration of the stress testing plan. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder holdFor(Integer holdFor) {
                this.holdFor = holdFor;
                return this;
            }

            /**
             * <p>Indicates whether a debugging is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDebugging(Boolean isDebugging) {
                this.isDebugging = isDebugging;
                return this;
            }

            /**
             * <p>The stress testing task ID. This ID also means the report ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DYYPLDKS</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The status of samplers.</p>
             */
            public Builder sampleStatList(java.util.List<java.util.Map<String, ?>> sampleStatList) {
                this.sampleStatList = sampleStatList;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DYYPZIH</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The current stage.</p>
             * 
             * <strong>example:</strong>
             * <p>任务执行</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The timestamp when the stress testing is scheduled to start. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1639970040000</p>
             */
            public Builder startTimeTS(Long startTimeTS) {
                this.startTimeTS = startTimeTS;
                return this;
            }

            /**
             * <p>The stress testing status of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The consumed Virtual User Minutes (VUM).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder vum(Long vum) {
                this.vum = vum;
                return this;
            }

            public RunningData build() {
                return new RunningData(this);
            } 

        } 

    }
}
