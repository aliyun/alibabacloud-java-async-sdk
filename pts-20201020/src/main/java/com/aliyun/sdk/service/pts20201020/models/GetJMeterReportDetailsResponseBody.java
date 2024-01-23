// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterReportDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterReportDetailsResponseBody</p>
 */
public class GetJMeterReportDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CodeKey")
    private String codeKey;

    @NameInMap("DocumentUrl")
    private String documentUrl;

    @NameInMap("DynamicCtx")
    private String dynamicCtx;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("ReportOverView")
    private ReportOverView reportOverView;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SamplerMetricsList")
    private java.util.List < SamplerMetricsList> samplerMetricsList;

    @NameInMap("SceneMetrics")
    private SceneMetrics sceneMetrics;

    @NameInMap("Success")
    private Boolean success;

    private GetJMeterReportDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.codeKey = builder.codeKey;
        this.documentUrl = builder.documentUrl;
        this.dynamicCtx = builder.dynamicCtx;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.reportOverView = builder.reportOverView;
        this.requestId = builder.requestId;
        this.samplerMetricsList = builder.samplerMetricsList;
        this.sceneMetrics = builder.sceneMetrics;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterReportDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeKey
     */
    public String getCodeKey() {
        return this.codeKey;
    }

    /**
     * @return documentUrl
     */
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    /**
     * @return dynamicCtx
     */
    public String getDynamicCtx() {
        return this.dynamicCtx;
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
     * @return reportOverView
     */
    public ReportOverView getReportOverView() {
        return this.reportOverView;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return samplerMetricsList
     */
    public java.util.List < SamplerMetricsList> getSamplerMetricsList() {
        return this.samplerMetricsList;
    }

    /**
     * @return sceneMetrics
     */
    public SceneMetrics getSceneMetrics() {
        return this.sceneMetrics;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String codeKey; 
        private String documentUrl; 
        private String dynamicCtx; 
        private Integer httpStatusCode; 
        private String message; 
        private ReportOverView reportOverView; 
        private String requestId; 
        private java.util.List < SamplerMetricsList> samplerMetricsList; 
        private SceneMetrics sceneMetrics; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CodeKey.
         */
        public Builder codeKey(String codeKey) {
            this.codeKey = codeKey;
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
         * DynamicCtx.
         */
        public Builder dynamicCtx(String dynamicCtx) {
            this.dynamicCtx = dynamicCtx;
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
         * ReportOverView.
         */
        public Builder reportOverView(ReportOverView reportOverView) {
            this.reportOverView = reportOverView;
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
         * SamplerMetricsList.
         */
        public Builder samplerMetricsList(java.util.List < SamplerMetricsList> samplerMetricsList) {
            this.samplerMetricsList = samplerMetricsList;
            return this;
        }

        /**
         * SceneMetrics.
         */
        public Builder sceneMetrics(SceneMetrics sceneMetrics) {
            this.sceneMetrics = sceneMetrics;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJMeterReportDetailsResponseBody build() {
            return new GetJMeterReportDetailsResponseBody(this);
        } 

    } 

    public static class ReportOverView extends TeaModel {
        @NameInMap("AgentCount")
        private Integer agentCount;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ReportName")
        private String reportName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Vum")
        private Long vum;

        private ReportOverView(Builder builder) {
            this.agentCount = builder.agentCount;
            this.endTime = builder.endTime;
            this.reportId = builder.reportId;
            this.reportName = builder.reportName;
            this.startTime = builder.startTime;
            this.vum = builder.vum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportOverView create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportName
         */
        public String getReportName() {
            return this.reportName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return vum
         */
        public Long getVum() {
            return this.vum;
        }

        public static final class Builder {
            private Integer agentCount; 
            private String endTime; 
            private String reportId; 
            private String reportName; 
            private String startTime; 
            private Long vum; 

            /**
             * AgentCount.
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * ReportName.
             */
            public Builder reportName(String reportName) {
                this.reportName = reportName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Vum.
             */
            public Builder vum(Long vum) {
                this.vum = vum;
                return this;
            }

            public ReportOverView build() {
                return new ReportOverView(this);
            } 

        } 

    }
    public static class SamplerMetricsList extends TeaModel {
        @NameInMap("AllCount")
        private Long allCount;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("AvgRt")
        private Double avgRt;

        @NameInMap("AvgTps")
        private Double avgTps;

        @NameInMap("FailCountReq")
        private Long failCountReq;

        @NameInMap("MaxRt")
        private Double maxRt;

        @NameInMap("MinRt")
        private Double minRt;

        @NameInMap("Seg75Rt")
        private Double seg75Rt;

        @NameInMap("Seg90Rt")
        private Double seg90Rt;

        @NameInMap("Seg99Rt")
        private Double seg99Rt;

        @NameInMap("SuccessRateReq")
        private Double successRateReq;

        private SamplerMetricsList(Builder builder) {
            this.allCount = builder.allCount;
            this.apiName = builder.apiName;
            this.avgRt = builder.avgRt;
            this.avgTps = builder.avgTps;
            this.failCountReq = builder.failCountReq;
            this.maxRt = builder.maxRt;
            this.minRt = builder.minRt;
            this.seg75Rt = builder.seg75Rt;
            this.seg90Rt = builder.seg90Rt;
            this.seg99Rt = builder.seg99Rt;
            this.successRateReq = builder.successRateReq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplerMetricsList create() {
            return builder().build();
        }

        /**
         * @return allCount
         */
        public Long getAllCount() {
            return this.allCount;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return avgRt
         */
        public Double getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgTps
         */
        public Double getAvgTps() {
            return this.avgTps;
        }

        /**
         * @return failCountReq
         */
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        /**
         * @return maxRt
         */
        public Double getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return minRt
         */
        public Double getMinRt() {
            return this.minRt;
        }

        /**
         * @return seg75Rt
         */
        public Double getSeg75Rt() {
            return this.seg75Rt;
        }

        /**
         * @return seg90Rt
         */
        public Double getSeg90Rt() {
            return this.seg90Rt;
        }

        /**
         * @return seg99Rt
         */
        public Double getSeg99Rt() {
            return this.seg99Rt;
        }

        /**
         * @return successRateReq
         */
        public Double getSuccessRateReq() {
            return this.successRateReq;
        }

        public static final class Builder {
            private Long allCount; 
            private String apiName; 
            private Double avgRt; 
            private Double avgTps; 
            private Long failCountReq; 
            private Double maxRt; 
            private Double minRt; 
            private Double seg75Rt; 
            private Double seg90Rt; 
            private Double seg99Rt; 
            private Double successRateReq; 

            /**
             * AllCount.
             */
            public Builder allCount(Long allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * AvgRt.
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgTps.
             */
            public Builder avgTps(Double avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * FailCountReq.
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * MaxRt.
             */
            public Builder maxRt(Double maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * MinRt.
             */
            public Builder minRt(Double minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * Seg75Rt.
             */
            public Builder seg75Rt(Double seg75Rt) {
                this.seg75Rt = seg75Rt;
                return this;
            }

            /**
             * Seg90Rt.
             */
            public Builder seg90Rt(Double seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * Seg99Rt.
             */
            public Builder seg99Rt(Double seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * SuccessRateReq.
             */
            public Builder successRateReq(Double successRateReq) {
                this.successRateReq = successRateReq;
                return this;
            }

            public SamplerMetricsList build() {
                return new SamplerMetricsList(this);
            } 

        } 

    }
    public static class SceneMetrics extends TeaModel {
        @NameInMap("AllCount")
        private Long allCount;

        @NameInMap("AvgRt")
        private Double avgRt;

        @NameInMap("AvgTps")
        private Double avgTps;

        @NameInMap("FailCountReq")
        private Long failCountReq;

        @NameInMap("Seg90Rt")
        private Double seg90Rt;

        @NameInMap("Seg99Rt")
        private Double seg99Rt;

        @NameInMap("SuccessRateReq")
        private Double successRateReq;

        private SceneMetrics(Builder builder) {
            this.allCount = builder.allCount;
            this.avgRt = builder.avgRt;
            this.avgTps = builder.avgTps;
            this.failCountReq = builder.failCountReq;
            this.seg90Rt = builder.seg90Rt;
            this.seg99Rt = builder.seg99Rt;
            this.successRateReq = builder.successRateReq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneMetrics create() {
            return builder().build();
        }

        /**
         * @return allCount
         */
        public Long getAllCount() {
            return this.allCount;
        }

        /**
         * @return avgRt
         */
        public Double getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgTps
         */
        public Double getAvgTps() {
            return this.avgTps;
        }

        /**
         * @return failCountReq
         */
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        /**
         * @return seg90Rt
         */
        public Double getSeg90Rt() {
            return this.seg90Rt;
        }

        /**
         * @return seg99Rt
         */
        public Double getSeg99Rt() {
            return this.seg99Rt;
        }

        /**
         * @return successRateReq
         */
        public Double getSuccessRateReq() {
            return this.successRateReq;
        }

        public static final class Builder {
            private Long allCount; 
            private Double avgRt; 
            private Double avgTps; 
            private Long failCountReq; 
            private Double seg90Rt; 
            private Double seg99Rt; 
            private Double successRateReq; 

            /**
             * AllCount.
             */
            public Builder allCount(Long allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * AvgRt.
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgTps.
             */
            public Builder avgTps(Double avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * FailCountReq.
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * Seg90Rt.
             */
            public Builder seg90Rt(Double seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * Seg99Rt.
             */
            public Builder seg99Rt(Double seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * SuccessRateReq.
             */
            public Builder successRateReq(Double successRateReq) {
                this.successRateReq = successRateReq;
                return this;
            }

            public SceneMetrics build() {
                return new SceneMetrics(this);
            } 

        } 

    }
}
