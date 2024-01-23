// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterSceneRunningDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterSceneRunningDataResponseBody</p>
 */
public class GetJMeterSceneRunningDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DocumentUrl")
    private String documentUrl;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunningData")
    private RunningData runningData;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DocumentUrl.
         */
        public Builder documentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * RunningData.
         */
        public Builder runningData(RunningData runningData) {
            this.runningData = runningData;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJMeterSceneRunningDataResponseBody build() {
            return new GetJMeterSceneRunningDataResponseBody(this);
        } 

    } 

    public static class RunningData extends TeaModel {
        @NameInMap("AgentCount")
        private Integer agentCount;

        @NameInMap("AgentIdList")
        private java.util.List < String > agentIdList;

        @NameInMap("AllSampleStat")
        private java.util.Map < String, ? > allSampleStat;

        @NameInMap("Concurrency")
        private Integer concurrency;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("HasError")
        private Boolean hasError;

        @NameInMap("HasReport")
        private Boolean hasReport;

        @NameInMap("HoldFor")
        private Integer holdFor;

        @NameInMap("IsDebugging")
        private Boolean isDebugging;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("SampleStatList")
        private java.util.List < java.util.Map<String, ?>> sampleStatList;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("StartTimeTS")
        private Long startTimeTS;

        @NameInMap("Status")
        private String status;

        @NameInMap("Vum")
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
        public java.util.List < String > getAgentIdList() {
            return this.agentIdList;
        }

        /**
         * @return allSampleStat
         */
        public java.util.Map < String, ? > getAllSampleStat() {
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
        public java.util.List < java.util.Map<String, ?>> getSampleStatList() {
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
            private java.util.List < String > agentIdList; 
            private java.util.Map < String, ? > allSampleStat; 
            private Integer concurrency; 
            private String errorMessage; 
            private Boolean hasError; 
            private Boolean hasReport; 
            private Integer holdFor; 
            private Boolean isDebugging; 
            private String reportId; 
            private java.util.List < java.util.Map<String, ?>> sampleStatList; 
            private String sceneId; 
            private String sceneName; 
            private String stageName; 
            private Long startTimeTS; 
            private String status; 
            private Long vum; 

            /**
             * AgentCount.
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * AgentIdList.
             */
            public Builder agentIdList(java.util.List < String > agentIdList) {
                this.agentIdList = agentIdList;
                return this;
            }

            /**
             * AllSampleStat.
             */
            public Builder allSampleStat(java.util.Map < String, ? > allSampleStat) {
                this.allSampleStat = allSampleStat;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * HasError.
             */
            public Builder hasError(Boolean hasError) {
                this.hasError = hasError;
                return this;
            }

            /**
             * HasReport.
             */
            public Builder hasReport(Boolean hasReport) {
                this.hasReport = hasReport;
                return this;
            }

            /**
             * HoldFor.
             */
            public Builder holdFor(Integer holdFor) {
                this.holdFor = holdFor;
                return this;
            }

            /**
             * IsDebugging.
             */
            public Builder isDebugging(Boolean isDebugging) {
                this.isDebugging = isDebugging;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * SampleStatList.
             */
            public Builder sampleStatList(java.util.List < java.util.Map<String, ?>> sampleStatList) {
                this.sampleStatList = sampleStatList;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * StartTimeTS.
             */
            public Builder startTimeTS(Long startTimeTS) {
                this.startTimeTS = startTimeTS;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Vum.
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
