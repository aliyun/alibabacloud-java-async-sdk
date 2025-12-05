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
 * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsReportDetailsResponseBody</p>
 */
public class GetPtsReportDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiMetricsList")
    private java.util.List<ApiMetricsList> apiMetricsList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ReportOverView")
    private ReportOverView reportOverView;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneMetrics")
    private SceneMetrics sceneMetrics;

    @com.aliyun.core.annotation.NameInMap("SceneSnapShot")
    private SceneSnapShot sceneSnapShot;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPtsReportDetailsResponseBody(Builder builder) {
        this.apiMetricsList = builder.apiMetricsList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.reportOverView = builder.reportOverView;
        this.requestId = builder.requestId;
        this.sceneMetrics = builder.sceneMetrics;
        this.sceneSnapShot = builder.sceneSnapShot;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsReportDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiMetricsList
     */
    public java.util.List<ApiMetricsList> getApiMetricsList() {
        return this.apiMetricsList;
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
     * @return sceneMetrics
     */
    public SceneMetrics getSceneMetrics() {
        return this.sceneMetrics;
    }

    /**
     * @return sceneSnapShot
     */
    public SceneSnapShot getSceneSnapShot() {
        return this.sceneSnapShot;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<ApiMetricsList> apiMetricsList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private ReportOverView reportOverView; 
        private String requestId; 
        private SceneMetrics sceneMetrics; 
        private SceneSnapShot sceneSnapShot; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPtsReportDetailsResponseBody model) {
            this.apiMetricsList = model.apiMetricsList;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.reportOverView = model.reportOverView;
            this.requestId = model.requestId;
            this.sceneMetrics = model.sceneMetrics;
            this.sceneSnapShot = model.sceneSnapShot;
            this.success = model.success;
        } 

        /**
         * <p>The metrics for API operations in the PTS scenario</p>
         */
        public Builder apiMetricsList(java.util.List<ApiMetricsList> apiMetricsList) {
            this.apiMetricsList = apiMetricsList;
            return this;
        }

        /**
         * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. If the operation is successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message. If the operation is successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The summary of the report.</p>
         */
        public Builder reportOverView(ReportOverView reportOverView) {
            this.reportOverView = reportOverView;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metrics of the scenario.</p>
         */
        public Builder sceneMetrics(SceneMetrics sceneMetrics) {
            this.sceneMetrics = sceneMetrics;
            return this;
        }

        /**
         * <p>The snapshot of the scenario.</p>
         */
        public Builder sceneSnapShot(SceneSnapShot sceneSnapShot) {
            this.sceneSnapShot = sceneSnapShot;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
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

        public GetPtsReportDetailsResponseBody build() {
            return new GetPtsReportDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class ApiMetricsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCount")
        private Long allCount;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Float avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgTps")
        private Float avgTps;

        @com.aliyun.core.annotation.NameInMap("FailCountBiz")
        private Long failCountBiz;

        @com.aliyun.core.annotation.NameInMap("FailCountReq")
        private Long failCountReq;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private Float maxRt;

        @com.aliyun.core.annotation.NameInMap("MinRt")
        private Float minRt;

        @com.aliyun.core.annotation.NameInMap("Seg50Rt")
        private Float seg50Rt;

        @com.aliyun.core.annotation.NameInMap("Seg75Rt")
        private Float seg75Rt;

        @com.aliyun.core.annotation.NameInMap("Seg90Rt")
        private Float seg90Rt;

        @com.aliyun.core.annotation.NameInMap("Seg99Rt")
        private Float seg99Rt;

        @com.aliyun.core.annotation.NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @com.aliyun.core.annotation.NameInMap("SuccessRateReq")
        private Float successRateReq;

        private ApiMetricsList(Builder builder) {
            this.allCount = builder.allCount;
            this.apiName = builder.apiName;
            this.avgRt = builder.avgRt;
            this.avgTps = builder.avgTps;
            this.failCountBiz = builder.failCountBiz;
            this.failCountReq = builder.failCountReq;
            this.maxRt = builder.maxRt;
            this.minRt = builder.minRt;
            this.seg50Rt = builder.seg50Rt;
            this.seg75Rt = builder.seg75Rt;
            this.seg90Rt = builder.seg90Rt;
            this.seg99Rt = builder.seg99Rt;
            this.successRateBiz = builder.successRateBiz;
            this.successRateReq = builder.successRateReq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiMetricsList create() {
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
        public Float getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgTps
         */
        public Float getAvgTps() {
            return this.avgTps;
        }

        /**
         * @return failCountBiz
         */
        public Long getFailCountBiz() {
            return this.failCountBiz;
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
        public Float getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return minRt
         */
        public Float getMinRt() {
            return this.minRt;
        }

        /**
         * @return seg50Rt
         */
        public Float getSeg50Rt() {
            return this.seg50Rt;
        }

        /**
         * @return seg75Rt
         */
        public Float getSeg75Rt() {
            return this.seg75Rt;
        }

        /**
         * @return seg90Rt
         */
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        /**
         * @return seg99Rt
         */
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        /**
         * @return successRateBiz
         */
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        /**
         * @return successRateReq
         */
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

        public static final class Builder {
            private Long allCount; 
            private String apiName; 
            private Float avgRt; 
            private Float avgTps; 
            private Long failCountBiz; 
            private Long failCountReq; 
            private Float maxRt; 
            private Float minRt; 
            private Float seg50Rt; 
            private Float seg75Rt; 
            private Float seg90Rt; 
            private Float seg99Rt; 
            private Float successRateBiz; 
            private Float successRateReq; 

            private Builder() {
            } 

            private Builder(ApiMetricsList model) {
                this.allCount = model.allCount;
                this.apiName = model.apiName;
                this.avgRt = model.avgRt;
                this.avgTps = model.avgTps;
                this.failCountBiz = model.failCountBiz;
                this.failCountReq = model.failCountReq;
                this.maxRt = model.maxRt;
                this.minRt = model.minRt;
                this.seg50Rt = model.seg50Rt;
                this.seg75Rt = model.seg75Rt;
                this.seg90Rt = model.seg90Rt;
                this.seg99Rt = model.seg99Rt;
                this.successRateBiz = model.successRateBiz;
                this.successRateReq = model.successRateReq;
            } 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>11872</p>
             */
            public Builder allCount(Long allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-API</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The average response time. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>170.49</p>
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The average TPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100.61</p>
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * <p>The number of business-related failures. If a checkpoint is defined, a failure occurs when the conditions for the checkpoint are not satisfied.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
                return this;
            }

            /**
             * <p>The number of failed requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * <p>The maximum response time. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxRt(Float maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * <p>The minimum response time. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>162</p>
             */
            public Builder minRt(Float minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * <p>The 50th percentile response time.</p>
             * 
             * <strong>example:</strong>
             * <p>168</p>
             */
            public Builder seg50Rt(Float seg50Rt) {
                this.seg50Rt = seg50Rt;
                return this;
            }

            /**
             * <p>The 75th percentile response time.</p>
             * 
             * <strong>example:</strong>
             * <p>169</p>
             */
            public Builder seg75Rt(Float seg75Rt) {
                this.seg75Rt = seg75Rt;
                return this;
            }

            /**
             * <p>The 90th percentile response time.</p>
             * 
             * <strong>example:</strong>
             * <p>170</p>
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * <p>The 99th percentile response time.</p>
             * 
             * <strong>example:</strong>
             * <p>284</p>
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * <p>The business success rate. The value is the ratio of the number of successful business to the total number of business.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * <p>The request success rate. The value is the ratio of the number of successful requests to the total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successRateReq(Float successRateReq) {
                this.successRateReq = successRateReq;
                return this;
            }

            public ApiMetricsList build() {
                return new ApiMetricsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class ReportOverView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ReportName")
        private String reportName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Vum")
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

            private Builder() {
            } 

            private Builder(ReportOverView model) {
                this.agentCount = model.agentCount;
                this.endTime = model.endTime;
                this.reportId = model.reportId;
                this.reportName = model.reportName;
                this.startTime = model.startTime;
                this.vum = model.vum;
            } 

            /**
             * <p>The number of load generators. Each load generator has an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The end time of the performance testing task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-20 10:41:33</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>GHB56VD</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The name of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>PTS-TEST</p>
             */
            public Builder reportName(String reportName) {
                this.reportName = reportName;
                return this;
            }

            /**
             * <p>The start time of the performance testing task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-20 10:39:33</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The virtual user minutes (VUM).</p>
             * 
             * <strong>example:</strong>
             * <p>1012</p>
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
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class SceneMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCount")
        private Long allCount;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Float avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgTps")
        private Float avgTps;

        @com.aliyun.core.annotation.NameInMap("FailCountBiz")
        private Long failCountBiz;

        @com.aliyun.core.annotation.NameInMap("FailCountReq")
        private Long failCountReq;

        @com.aliyun.core.annotation.NameInMap("Seg90Rt")
        private Float seg90Rt;

        @com.aliyun.core.annotation.NameInMap("Seg99Rt")
        private Float seg99Rt;

        @com.aliyun.core.annotation.NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @com.aliyun.core.annotation.NameInMap("SuccessRateReq")
        private Float successRateReq;

        private SceneMetrics(Builder builder) {
            this.allCount = builder.allCount;
            this.avgRt = builder.avgRt;
            this.avgTps = builder.avgTps;
            this.failCountBiz = builder.failCountBiz;
            this.failCountReq = builder.failCountReq;
            this.seg90Rt = builder.seg90Rt;
            this.seg99Rt = builder.seg99Rt;
            this.successRateBiz = builder.successRateBiz;
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
        public Float getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgTps
         */
        public Float getAvgTps() {
            return this.avgTps;
        }

        /**
         * @return failCountBiz
         */
        public Long getFailCountBiz() {
            return this.failCountBiz;
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
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        /**
         * @return seg99Rt
         */
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        /**
         * @return successRateBiz
         */
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        /**
         * @return successRateReq
         */
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

        public static final class Builder {
            private Long allCount; 
            private Float avgRt; 
            private Float avgTps; 
            private Long failCountBiz; 
            private Long failCountReq; 
            private Float seg90Rt; 
            private Float seg99Rt; 
            private Float successRateBiz; 
            private Float successRateReq; 

            private Builder() {
            } 

            private Builder(SceneMetrics model) {
                this.allCount = model.allCount;
                this.avgRt = model.avgRt;
                this.avgTps = model.avgTps;
                this.failCountBiz = model.failCountBiz;
                this.failCountReq = model.failCountReq;
                this.seg90Rt = model.seg90Rt;
                this.seg99Rt = model.seg99Rt;
                this.successRateBiz = model.successRateBiz;
                this.successRateReq = model.successRateReq;
            } 

            /**
             * <p>The number of requests in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>11872</p>
             */
            public Builder allCount(Long allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * <p>The average response time in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>170.49</p>
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The average transactions per second (TPS) in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>100.61</p>
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * <p>The number of business failures in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
                return this;
            }

            /**
             * <p>The number of failed requests in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * <p>The 90th percentile response time.</p>
             * 
             * <strong>example:</strong>
             * <p>170</p>
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * <p>The 99th percentile response time.</p>
             * 
             * <strong>example:</strong>
             * <p>284</p>
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * <p>The business success rate in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * <p>The request success rate in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successRateReq(Float successRateReq) {
                this.successRateReq = successRateReq;
                return this;
            }

            public SceneMetrics build() {
                return new SceneMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class DomainBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<String> ips;

        private DomainBindingList(Builder builder) {
            this.domain = builder.domain;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBindingList create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ips
         */
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<String> ips; 

            private Builder() {
            } 

            private Builder(DomainBindingList model) {
                this.domain = model.domain;
                this.ips = model.ips;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The IP addresses bound to the domain name.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            public DomainBindingList build() {
                return new DomainBindingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class AdvanceSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionTimeoutInSecond")
        private Integer connectionTimeoutInSecond;

        @com.aliyun.core.annotation.NameInMap("DomainBindingList")
        private java.util.List<DomainBindingList> domainBindingList;

        @com.aliyun.core.annotation.NameInMap("LogRate")
        private Integer logRate;

        @com.aliyun.core.annotation.NameInMap("SuccessCode")
        private String successCode;

        private AdvanceSetting(Builder builder) {
            this.connectionTimeoutInSecond = builder.connectionTimeoutInSecond;
            this.domainBindingList = builder.domainBindingList;
            this.logRate = builder.logRate;
            this.successCode = builder.successCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceSetting create() {
            return builder().build();
        }

        /**
         * @return connectionTimeoutInSecond
         */
        public Integer getConnectionTimeoutInSecond() {
            return this.connectionTimeoutInSecond;
        }

        /**
         * @return domainBindingList
         */
        public java.util.List<DomainBindingList> getDomainBindingList() {
            return this.domainBindingList;
        }

        /**
         * @return logRate
         */
        public Integer getLogRate() {
            return this.logRate;
        }

        /**
         * @return successCode
         */
        public String getSuccessCode() {
            return this.successCode;
        }

        public static final class Builder {
            private Integer connectionTimeoutInSecond; 
            private java.util.List<DomainBindingList> domainBindingList; 
            private Integer logRate; 
            private String successCode; 

            private Builder() {
            } 

            private Builder(AdvanceSetting model) {
                this.connectionTimeoutInSecond = model.connectionTimeoutInSecond;
                this.domainBindingList = model.domainBindingList;
                this.logRate = model.logRate;
                this.successCode = model.successCode;
            } 

            /**
             * <p>The timeout period of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder connectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
                this.connectionTimeoutInSecond = connectionTimeoutInSecond;
                return this;
            }

            /**
             * <p>The domain name-IP address binding relationships.</p>
             */
            public Builder domainBindingList(java.util.List<DomainBindingList> domainBindingList) {
                this.domainBindingList = domainBindingList;
                return this;
            }

            /**
             * <p>The log sampling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder logRate(Integer logRate) {
                this.logRate = logRate;
                return this;
            }

            /**
             * <p>The custom success code.</p>
             * 
             * <strong>example:</strong>
             * <p>429,404</p>
             */
            public Builder successCode(String successCode) {
                this.successCode = successCode;
                return this;
            }

            public AdvanceSetting build() {
                return new AdvanceSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class FileParameterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileOssAddress")
        private String fileOssAddress;

        private FileParameterList(Builder builder) {
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileParameterList create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileOssAddress
         */
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        public static final class Builder {
            private String fileName; 
            private String fileOssAddress; 

            private Builder() {
            } 

            private Builder(FileParameterList model) {
                this.fileName = model.fileName;
                this.fileOssAddress = model.fileOssAddress;
            } 

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.csv">https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.csv</a></p>
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            public FileParameterList build() {
                return new FileParameterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class GlobalParameterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private GlobalParameterList(Builder builder) {
            this.paramName = builder.paramName;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalParameterList create() {
            return builder().build();
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramName; 
            private String paramValue; 

            private Builder() {
            } 

            private Builder(GlobalParameterList model) {
                this.paramName = model.paramName;
                this.paramValue = model.paramValue;
            } 

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public GlobalParameterList build() {
                return new GlobalParameterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class ApiLoadConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RpsBegin")
        private Integer rpsBegin;

        @com.aliyun.core.annotation.NameInMap("RpsLimit")
        private Integer rpsLimit;

        private ApiLoadConfigList(Builder builder) {
            this.rpsBegin = builder.rpsBegin;
            this.rpsLimit = builder.rpsLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiLoadConfigList create() {
            return builder().build();
        }

        /**
         * @return rpsBegin
         */
        public Integer getRpsBegin() {
            return this.rpsBegin;
        }

        /**
         * @return rpsLimit
         */
        public Integer getRpsLimit() {
            return this.rpsLimit;
        }

        public static final class Builder {
            private Integer rpsBegin; 
            private Integer rpsLimit; 

            private Builder() {
            } 

            private Builder(ApiLoadConfigList model) {
                this.rpsBegin = model.rpsBegin;
                this.rpsLimit = model.rpsLimit;
            } 

            /**
             * <p>The starting requests per second (RPS).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rpsBegin(Integer rpsBegin) {
                this.rpsBegin = rpsBegin;
                return this;
            }

            /**
             * <p>The maximum RPS.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rpsLimit(Integer rpsLimit) {
                this.rpsLimit = rpsLimit;
                return this;
            }

            public ApiLoadConfigList build() {
                return new ApiLoadConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllConcurrencyBegin")
        private Integer allConcurrencyBegin;

        @com.aliyun.core.annotation.NameInMap("AllConcurrencyLimit")
        private Integer allConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("AllRpsBegin")
        private Integer allRpsBegin;

        @com.aliyun.core.annotation.NameInMap("AllRpsLimit")
        private Integer allRpsLimit;

        private Configuration(Builder builder) {
            this.allConcurrencyBegin = builder.allConcurrencyBegin;
            this.allConcurrencyLimit = builder.allConcurrencyLimit;
            this.allRpsBegin = builder.allRpsBegin;
            this.allRpsLimit = builder.allRpsLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return allConcurrencyBegin
         */
        public Integer getAllConcurrencyBegin() {
            return this.allConcurrencyBegin;
        }

        /**
         * @return allConcurrencyLimit
         */
        public Integer getAllConcurrencyLimit() {
            return this.allConcurrencyLimit;
        }

        /**
         * @return allRpsBegin
         */
        public Integer getAllRpsBegin() {
            return this.allRpsBegin;
        }

        /**
         * @return allRpsLimit
         */
        public Integer getAllRpsLimit() {
            return this.allRpsLimit;
        }

        public static final class Builder {
            private Integer allConcurrencyBegin; 
            private Integer allConcurrencyLimit; 
            private Integer allRpsBegin; 
            private Integer allRpsLimit; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.allConcurrencyBegin = model.allConcurrencyBegin;
                this.allConcurrencyLimit = model.allConcurrencyLimit;
                this.allRpsBegin = model.allRpsBegin;
                this.allRpsLimit = model.allRpsLimit;
            } 

            /**
             * <p>The starting number of concurrent virtual users in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allConcurrencyBegin(Integer allConcurrencyBegin) {
                this.allConcurrencyBegin = allConcurrencyBegin;
                return this;
            }

            /**
             * <p>The maximum number of concurrent virtual users in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder allConcurrencyLimit(Integer allConcurrencyLimit) {
                this.allConcurrencyLimit = allConcurrencyLimit;
                return this;
            }

            /**
             * <p>The starting RPS in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder allRpsBegin(Integer allRpsBegin) {
                this.allRpsBegin = allRpsBegin;
                return this;
            }

            /**
             * <p>The maximum RPS in the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder allRpsLimit(Integer allRpsLimit) {
                this.allRpsLimit = allRpsLimit;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class RelationLoadConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrencyBegin")
        private Integer concurrencyBegin;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyLimit")
        private Integer concurrencyLimit;

        private RelationLoadConfigList(Builder builder) {
            this.concurrencyBegin = builder.concurrencyBegin;
            this.concurrencyLimit = builder.concurrencyLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationLoadConfigList create() {
            return builder().build();
        }

        /**
         * @return concurrencyBegin
         */
        public Integer getConcurrencyBegin() {
            return this.concurrencyBegin;
        }

        /**
         * @return concurrencyLimit
         */
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

        public static final class Builder {
            private Integer concurrencyBegin; 
            private Integer concurrencyLimit; 

            private Builder() {
            } 

            private Builder(RelationLoadConfigList model) {
                this.concurrencyBegin = model.concurrencyBegin;
                this.concurrencyLimit = model.concurrencyLimit;
            } 

            /**
             * <p>The starting number of concurrent virtual users.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder concurrencyBegin(Integer concurrencyBegin) {
                this.concurrencyBegin = concurrencyBegin;
                return this;
            }

            /**
             * <p>The maximum number of concurrent virtual users.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder concurrencyLimit(Integer concurrencyLimit) {
                this.concurrencyLimit = concurrencyLimit;
                return this;
            }

            public RelationLoadConfigList build() {
                return new RelationLoadConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class LoadConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("ApiLoadConfigList")
        private java.util.List<ApiLoadConfigList> apiLoadConfigList;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("MaxRunningTime")
        private Integer maxRunningTime;

        @com.aliyun.core.annotation.NameInMap("RelationLoadConfigList")
        private java.util.List<RelationLoadConfigList> relationLoadConfigList;

        @com.aliyun.core.annotation.NameInMap("TestMode")
        private String testMode;

        private LoadConfig(Builder builder) {
            this.agentCount = builder.agentCount;
            this.apiLoadConfigList = builder.apiLoadConfigList;
            this.configuration = builder.configuration;
            this.maxRunningTime = builder.maxRunningTime;
            this.relationLoadConfigList = builder.relationLoadConfigList;
            this.testMode = builder.testMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadConfig create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return apiLoadConfigList
         */
        public java.util.List<ApiLoadConfigList> getApiLoadConfigList() {
            return this.apiLoadConfigList;
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return maxRunningTime
         */
        public Integer getMaxRunningTime() {
            return this.maxRunningTime;
        }

        /**
         * @return relationLoadConfigList
         */
        public java.util.List<RelationLoadConfigList> getRelationLoadConfigList() {
            return this.relationLoadConfigList;
        }

        /**
         * @return testMode
         */
        public String getTestMode() {
            return this.testMode;
        }

        public static final class Builder {
            private Integer agentCount; 
            private java.util.List<ApiLoadConfigList> apiLoadConfigList; 
            private Configuration configuration; 
            private Integer maxRunningTime; 
            private java.util.List<RelationLoadConfigList> relationLoadConfigList; 
            private String testMode; 

            private Builder() {
            } 

            private Builder(LoadConfig model) {
                this.agentCount = model.agentCount;
                this.apiLoadConfigList = model.apiLoadConfigList;
                this.configuration = model.configuration;
                this.maxRunningTime = model.maxRunningTime;
                this.relationLoadConfigList = model.relationLoadConfigList;
                this.testMode = model.testMode;
            } 

            /**
             * <p>The number of load generators.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The API request load settings.</p>
             */
            public Builder apiLoadConfigList(java.util.List<ApiLoadConfigList> apiLoadConfigList) {
                this.apiLoadConfigList = apiLoadConfigList;
                return this;
            }

            /**
             * <p>The concurrency and RPS limits in the scenario.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The maximum running time. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxRunningTime(Integer maxRunningTime) {
                this.maxRunningTime = maxRunningTime;
                return this;
            }

            /**
             * <p>The settings of the session.</p>
             */
            public Builder relationLoadConfigList(java.util.List<RelationLoadConfigList> relationLoadConfigList) {
                this.relationLoadConfigList = relationLoadConfigList;
                return this;
            }

            /**
             * <p>The load application mode.</p>
             * 
             * <strong>example:</strong>
             * <p>TPS</p>
             */
            public Builder testMode(String testMode) {
                this.testMode = testMode;
                return this;
            }

            public LoadConfig build() {
                return new LoadConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class ApiListBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyValue")
        private String bodyValue;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        private ApiListBody(Builder builder) {
            this.bodyValue = builder.bodyValue;
            this.contentType = builder.contentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiListBody create() {
            return builder().build();
        }

        /**
         * @return bodyValue
         */
        public String getBodyValue() {
            return this.bodyValue;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        public static final class Builder {
            private String bodyValue; 
            private String contentType; 

            private Builder() {
            } 

            private Builder(ApiListBody model) {
                this.bodyValue = model.bodyValue;
                this.contentType = model.contentType;
            } 

            /**
             * <p>The content of the request body.</p>
             * 
             * <strong>example:</strong>
             * <p>{key:value}</p>
             */
            public Builder bodyValue(String bodyValue) {
                this.bodyValue = bodyValue;
                return this;
            }

            /**
             * <p>The type of the request body.</p>
             * 
             * <strong>example:</strong>
             * <p>application/x-www-form-urlencoded</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            public ApiListBody build() {
                return new ApiListBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class CheckPointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckPoint")
        private String checkPoint;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

        @com.aliyun.core.annotation.NameInMap("ExpectValue")
        private String expectValue;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private CheckPointList(Builder builder) {
            this.checkPoint = builder.checkPoint;
            this.checkType = builder.checkType;
            this.expectValue = builder.expectValue;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckPointList create() {
            return builder().build();
        }

        /**
         * @return checkPoint
         */
        public String getCheckPoint() {
            return this.checkPoint;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return expectValue
         */
        public String getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String checkPoint; 
            private String checkType; 
            private String expectValue; 
            private String operator; 

            private Builder() {
            } 

            private Builder(CheckPointList model) {
                this.checkPoint = model.checkPoint;
                this.checkType = model.checkType;
                this.expectValue = model.expectValue;
                this.operator = model.operator;
            } 

            /**
             * <p>The checked item.</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
             */
            public Builder checkPoint(String checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * <p>The check type.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPORTED_PARAM</p>
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * <p>The check operator.</p>
             * 
             * <strong>example:</strong>
             * <p>ctn</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public CheckPointList build() {
                return new CheckPointList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class ExportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("ExportName")
        private String exportName;

        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("ExportValue")
        private String exportValue;

        private ExportList(Builder builder) {
            this.count = builder.count;
            this.exportName = builder.exportName;
            this.exportType = builder.exportType;
            this.exportValue = builder.exportValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return exportName
         */
        public String getExportName() {
            return this.exportName;
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return exportValue
         */
        public String getExportValue() {
            return this.exportValue;
        }

        public static final class Builder {
            private String count; 
            private String exportName; 
            private String exportType; 
            private String exportValue; 

            private Builder() {
            } 

            private Builder(ExportList model) {
                this.count = model.count;
                this.exportName = model.exportName;
                this.exportType = model.exportType;
                this.exportValue = model.exportValue;
            } 

            /**
             * <p>The index of the export parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the export parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
             */
            public Builder exportName(String exportName) {
                this.exportName = exportName;
                return this;
            }

            /**
             * <p>The source of the export parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>BODY_JSON</p>
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * <p>The actual path from which you want to extract the export parameter values.</p>
             * 
             * <strong>example:</strong>
             * <p>data.userId</p>
             */
            public Builder exportValue(String exportValue) {
                this.exportValue = exportValue;
                return this;
            }

            public ExportList build() {
                return new ExportList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class HeaderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("HeaderValue")
        private String headerValue;

        private HeaderList(Builder builder) {
            this.headerName = builder.headerName;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderList create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerName; 
            private String headerValue; 

            private Builder() {
            } 

            private Builder(HeaderList model) {
                this.headerName = model.headerName;
                this.headerValue = model.headerValue;
            } 

            /**
             * <p>The name of the header.</p>
             * 
             * <strong>example:</strong>
             * <p>User-Agent</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The value of the header.</p>
             * 
             * <strong>example:</strong>
             * <p>PTS</p>
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public HeaderList build() {
                return new HeaderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class ApiList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("Body")
        private ApiListBody body;

        @com.aliyun.core.annotation.NameInMap("CheckPointList")
        private java.util.List<CheckPointList> checkPointList;

        @com.aliyun.core.annotation.NameInMap("ExportList")
        private java.util.List<ExportList> exportList;

        @com.aliyun.core.annotation.NameInMap("HeaderList")
        private java.util.List<HeaderList> headerList;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("RedirectCountLimit")
        private Integer redirectCountLimit;

        @com.aliyun.core.annotation.NameInMap("TimeoutInSecond")
        private Integer timeoutInSecond;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ApiList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.body = builder.body;
            this.checkPointList = builder.checkPointList;
            this.exportList = builder.exportList;
            this.headerList = builder.headerList;
            this.method = builder.method;
            this.redirectCountLimit = builder.redirectCountLimit;
            this.timeoutInSecond = builder.timeoutInSecond;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return body
         */
        public ApiListBody getBody() {
            return this.body;
        }

        /**
         * @return checkPointList
         */
        public java.util.List<CheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        /**
         * @return exportList
         */
        public java.util.List<ExportList> getExportList() {
            return this.exportList;
        }

        /**
         * @return headerList
         */
        public java.util.List<HeaderList> getHeaderList() {
            return this.headerList;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return redirectCountLimit
         */
        public Integer getRedirectCountLimit() {
            return this.redirectCountLimit;
        }

        /**
         * @return timeoutInSecond
         */
        public Integer getTimeoutInSecond() {
            return this.timeoutInSecond;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private ApiListBody body; 
            private java.util.List<CheckPointList> checkPointList; 
            private java.util.List<ExportList> exportList; 
            private java.util.List<HeaderList> headerList; 
            private String method; 
            private Integer redirectCountLimit; 
            private Integer timeoutInSecond; 
            private String url; 

            private Builder() {
            } 

            private Builder(ApiList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.body = model.body;
                this.checkPointList = model.checkPointList;
                this.exportList = model.exportList;
                this.headerList = model.headerList;
                this.method = model.method;
                this.redirectCountLimit = model.redirectCountLimit;
                this.timeoutInSecond = model.timeoutInSecond;
                this.url = model.url;
            } 

            /**
             * <p>The ID of the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>MNB45</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-API</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The request body.</p>
             */
            public Builder body(ApiListBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The checkpoints of the API operation.</p>
             */
            public Builder checkPointList(java.util.List<CheckPointList> checkPointList) {
                this.checkPointList = checkPointList;
                return this;
            }

            /**
             * <p>The export parameters.</p>
             */
            public Builder exportList(java.util.List<ExportList> exportList) {
                this.exportList = exportList;
                return this;
            }

            /**
             * <p>The headers.</p>
             */
            public Builder headerList(java.util.List<HeaderList> headerList) {
                this.headerList = headerList;
                return this;
            }

            /**
             * <p>The method of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The number of redirections.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder redirectCountLimit(Integer redirectCountLimit) {
                this.redirectCountLimit = redirectCountLimit;
                return this;
            }

            /**
             * <p>The timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeoutInSecond(Integer timeoutInSecond) {
                this.timeoutInSecond = timeoutInSecond;
                return this;
            }

            /**
             * <p>The URL to which the API request is sent.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/">http://www.example.com/</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ApiList build() {
                return new ApiList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class FileParameterExplainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseFile")
        private Boolean baseFile;

        @com.aliyun.core.annotation.NameInMap("CycleOnce")
        private Boolean cycleOnce;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileParamName")
        private String fileParamName;

        private FileParameterExplainList(Builder builder) {
            this.baseFile = builder.baseFile;
            this.cycleOnce = builder.cycleOnce;
            this.fileName = builder.fileName;
            this.fileParamName = builder.fileParamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileParameterExplainList create() {
            return builder().build();
        }

        /**
         * @return baseFile
         */
        public Boolean getBaseFile() {
            return this.baseFile;
        }

        /**
         * @return cycleOnce
         */
        public Boolean getCycleOnce() {
            return this.cycleOnce;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileParamName
         */
        public String getFileParamName() {
            return this.fileParamName;
        }

        public static final class Builder {
            private Boolean baseFile; 
            private Boolean cycleOnce; 
            private String fileName; 
            private String fileParamName; 

            private Builder() {
            } 

            private Builder(FileParameterExplainList model) {
                this.baseFile = model.baseFile;
                this.cycleOnce = model.cycleOnce;
                this.fileName = model.fileName;
                this.fileParamName = model.fileParamName;
            } 

            /**
             * <p>Indicates whether the file is used as the baseline file.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder baseFile(Boolean baseFile) {
                this.baseFile = baseFile;
                return this;
            }

            /**
             * <p>Indicates whether the parameters are used once.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cycleOnce(Boolean cycleOnce) {
                this.cycleOnce = cycleOnce;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The parameters in the file.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder fileParamName(String fileParamName) {
                this.fileParamName = fileParamName;
                return this;
            }

            public FileParameterExplainList build() {
                return new FileParameterExplainList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class RelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiList")
        private java.util.List<ApiList> apiList;

        @com.aliyun.core.annotation.NameInMap("FileParameterExplainList")
        private java.util.List<FileParameterExplainList> fileParameterExplainList;

        @com.aliyun.core.annotation.NameInMap("RelationId")
        private String relationId;

        @com.aliyun.core.annotation.NameInMap("RelationName")
        private String relationName;

        private RelationList(Builder builder) {
            this.apiList = builder.apiList;
            this.fileParameterExplainList = builder.fileParameterExplainList;
            this.relationId = builder.relationId;
            this.relationName = builder.relationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationList create() {
            return builder().build();
        }

        /**
         * @return apiList
         */
        public java.util.List<ApiList> getApiList() {
            return this.apiList;
        }

        /**
         * @return fileParameterExplainList
         */
        public java.util.List<FileParameterExplainList> getFileParameterExplainList() {
            return this.fileParameterExplainList;
        }

        /**
         * @return relationId
         */
        public String getRelationId() {
            return this.relationId;
        }

        /**
         * @return relationName
         */
        public String getRelationName() {
            return this.relationName;
        }

        public static final class Builder {
            private java.util.List<ApiList> apiList; 
            private java.util.List<FileParameterExplainList> fileParameterExplainList; 
            private String relationId; 
            private String relationName; 

            private Builder() {
            } 

            private Builder(RelationList model) {
                this.apiList = model.apiList;
                this.fileParameterExplainList = model.fileParameterExplainList;
                this.relationId = model.relationId;
                this.relationName = model.relationName;
            } 

            /**
             * <p>The settings of the API operation.</p>
             */
            public Builder apiList(java.util.List<ApiList> apiList) {
                this.apiList = apiList;
                return this;
            }

            /**
             * <p>The file parameters used by the session.</p>
             */
            public Builder fileParameterExplainList(java.util.List<FileParameterExplainList> fileParameterExplainList) {
                this.fileParameterExplainList = fileParameterExplainList;
                return this;
            }

            /**
             * <p>The ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>HGBN4D</p>
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * <p>The name of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-session-1</p>
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            public RelationList build() {
                return new RelationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportDetailsResponseBody</p>
     */
    public static class SceneSnapShot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvanceSetting")
        private AdvanceSetting advanceSetting;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileParameterList")
        private java.util.List<FileParameterList> fileParameterList;

        @com.aliyun.core.annotation.NameInMap("GlobalParameterList")
        private java.util.List<GlobalParameterList> globalParameterList;

        @com.aliyun.core.annotation.NameInMap("LoadConfig")
        private LoadConfig loadConfig;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RelationList")
        private java.util.List<RelationList> relationList;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SceneSnapShot(Builder builder) {
            this.advanceSetting = builder.advanceSetting;
            this.createTime = builder.createTime;
            this.fileParameterList = builder.fileParameterList;
            this.globalParameterList = builder.globalParameterList;
            this.loadConfig = builder.loadConfig;
            this.modifiedTime = builder.modifiedTime;
            this.relationList = builder.relationList;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneSnapShot create() {
            return builder().build();
        }

        /**
         * @return advanceSetting
         */
        public AdvanceSetting getAdvanceSetting() {
            return this.advanceSetting;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fileParameterList
         */
        public java.util.List<FileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        /**
         * @return globalParameterList
         */
        public java.util.List<GlobalParameterList> getGlobalParameterList() {
            return this.globalParameterList;
        }

        /**
         * @return loadConfig
         */
        public LoadConfig getLoadConfig() {
            return this.loadConfig;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return relationList
         */
        public java.util.List<RelationList> getRelationList() {
            return this.relationList;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private AdvanceSetting advanceSetting; 
            private String createTime; 
            private java.util.List<FileParameterList> fileParameterList; 
            private java.util.List<GlobalParameterList> globalParameterList; 
            private LoadConfig loadConfig; 
            private String modifiedTime; 
            private java.util.List<RelationList> relationList; 
            private String sceneId; 
            private String sceneName; 
            private String status; 

            private Builder() {
            } 

            private Builder(SceneSnapShot model) {
                this.advanceSetting = model.advanceSetting;
                this.createTime = model.createTime;
                this.fileParameterList = model.fileParameterList;
                this.globalParameterList = model.globalParameterList;
                this.loadConfig = model.loadConfig;
                this.modifiedTime = model.modifiedTime;
                this.relationList = model.relationList;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.status = model.status;
            } 

            /**
             * <p>The advanced settings of the scenario.</p>
             */
            public Builder advanceSetting(AdvanceSetting advanceSetting) {
                this.advanceSetting = advanceSetting;
                return this;
            }

            /**
             * <p>The time when the scenario was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-20 09:28:10</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The file used in the scenario.</p>
             */
            public Builder fileParameterList(java.util.List<FileParameterList> fileParameterList) {
                this.fileParameterList = fileParameterList;
                return this;
            }

            /**
             * <p>The global parameters.</p>
             */
            public Builder globalParameterList(java.util.List<GlobalParameterList> globalParameterList) {
                this.globalParameterList = globalParameterList;
                return this;
            }

            /**
             * <p>The load settings.</p>
             */
            public Builder loadConfig(LoadConfig loadConfig) {
                this.loadConfig = loadConfig;
                return this;
            }

            /**
             * <p>The last modification time of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-10 10:10:10</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The sessions.</p>
             */
            public Builder relationList(java.util.List<RelationList> relationList) {
                this.relationList = relationList;
                return this;
            }

            /**
             * <p>The ID of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>7HBNS3</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The name of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>PTS-TEST</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The status of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>STOPPED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SceneSnapShot build() {
                return new SceneSnapShot(this);
            } 

        } 

    }
}
