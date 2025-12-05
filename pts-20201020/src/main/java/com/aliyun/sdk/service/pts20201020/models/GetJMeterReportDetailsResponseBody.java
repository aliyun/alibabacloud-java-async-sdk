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
 * {@link GetJMeterReportDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterReportDetailsResponseBody</p>
 */
public class GetJMeterReportDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CodeKey")
    private String codeKey;

    @com.aliyun.core.annotation.NameInMap("DocumentUrl")
    private String documentUrl;

    @com.aliyun.core.annotation.NameInMap("DynamicCtx")
    private String dynamicCtx;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ReportOverView")
    private ReportOverView reportOverView;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SamplerMetricsList")
    private java.util.List<SamplerMetricsList> samplerMetricsList;

    @com.aliyun.core.annotation.NameInMap("SceneMetrics")
    private SceneMetrics sceneMetrics;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<SamplerMetricsList> getSamplerMetricsList() {
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
        private java.util.List<SamplerMetricsList> samplerMetricsList; 
        private SceneMetrics sceneMetrics; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetJMeterReportDetailsResponseBody model) {
            this.code = model.code;
            this.codeKey = model.codeKey;
            this.documentUrl = model.documentUrl;
            this.dynamicCtx = model.dynamicCtx;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.reportOverView = model.reportOverView;
            this.requestId = model.requestId;
            this.samplerMetricsList = model.samplerMetricsList;
            this.sceneMetrics = model.sceneMetrics;
            this.success = model.success;
        } 

        /**
         * <p>The system status code. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4001</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The code key that corresponds to the key in Medusa. If no code key is available, or if the content corresponding to the code key fails to be obtained or is empty, the returned message is displayed as the default information.</p>
         */
        public Builder codeKey(String codeKey) {
            this.codeKey = codeKey;
            return this;
        }

        /**
         * <p>The URL used to access the document.</p>
         */
        public Builder documentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }

        /**
         * <p>The returned dynamic contents that are separated by the &amp;&amp; operator.</p>
         */
        public Builder dynamicCtx(String dynamicCtx) {
            this.dynamicCtx = dynamicCtx;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
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
         * <p>The details of the report.</p>
         */
        public Builder reportOverView(ReportOverView reportOverView) {
            this.reportOverView = reportOverView;
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
         * <p>The dimensions of APIs.</p>
         */
        public Builder samplerMetricsList(java.util.List<SamplerMetricsList> samplerMetricsList) {
            this.samplerMetricsList = samplerMetricsList;
            return this;
        }

        /**
         * <p>The dimensions of the whole scenario.</p>
         */
        public Builder sceneMetrics(SceneMetrics sceneMetrics) {
            this.sceneMetrics = sceneMetrics;
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

        public GetJMeterReportDetailsResponseBody build() {
            return new GetJMeterReportDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJMeterReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetJMeterReportDetailsResponseBody</p>
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
             * <p>The number of used engines.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The end of the queried time range.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-03 10:45:11</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The report ID.</p>
             * 
             * <strong>example:</strong>
             * <p>GHB56VD</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The report name.</p>
             */
            public Builder reportName(String reportName) {
                this.reportName = reportName;
                return this;
            }

            /**
             * <p>The beginning of the queried time range.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-03 10:35:11</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The consumed Virtual User Minutes (VUM).</p>
             * 
             * <strong>example:</strong>
             * <p>4452</p>
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
     * {@link GetJMeterReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetJMeterReportDetailsResponseBody</p>
     */
    public static class SamplerMetricsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCount")
        private Long allCount;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Double avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgTps")
        private Double avgTps;

        @com.aliyun.core.annotation.NameInMap("FailCountReq")
        private Long failCountReq;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private Double maxRt;

        @com.aliyun.core.annotation.NameInMap("MinRt")
        private Double minRt;

        @com.aliyun.core.annotation.NameInMap("Seg75Rt")
        private Double seg75Rt;

        @com.aliyun.core.annotation.NameInMap("Seg90Rt")
        private Double seg90Rt;

        @com.aliyun.core.annotation.NameInMap("Seg99Rt")
        private Double seg99Rt;

        @com.aliyun.core.annotation.NameInMap("SuccessRateReq")
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

            private Builder() {
            } 

            private Builder(SamplerMetricsList model) {
                this.allCount = model.allCount;
                this.apiName = model.apiName;
                this.avgRt = model.avgRt;
                this.avgTps = model.avgTps;
                this.failCountReq = model.failCountReq;
                this.maxRt = model.maxRt;
                this.minRt = model.minRt;
                this.seg75Rt = model.seg75Rt;
                this.seg90Rt = model.seg90Rt;
                this.seg99Rt = model.seg99Rt;
                this.successRateReq = model.successRateReq;
            } 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>731</p>
             */
            public Builder allCount(Long allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * <p>The API name.</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The average RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>44.2</p>
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The average TPS.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder avgTps(Double avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * <p>The request failure rate.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * <p>The maximum RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder maxRt(Double maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * <p>The minimum RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder minRt(Double minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * <p>The 75th percentile of RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>22.4</p>
             */
            public Builder seg75Rt(Double seg75Rt) {
                this.seg75Rt = seg75Rt;
                return this;
            }

            /**
             * <p>The 90th percentile of RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>65</p>
             */
            public Builder seg90Rt(Double seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * <p>The 99th percentile of RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>77</p>
             */
            public Builder seg99Rt(Double seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * <p>The request success rate. The parameter value must be a non-negative number less than or equal to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link GetJMeterReportDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetJMeterReportDetailsResponseBody</p>
     */
    public static class SceneMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCount")
        private Long allCount;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Double avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgTps")
        private Double avgTps;

        @com.aliyun.core.annotation.NameInMap("FailCountReq")
        private Long failCountReq;

        @com.aliyun.core.annotation.NameInMap("Seg90Rt")
        private Double seg90Rt;

        @com.aliyun.core.annotation.NameInMap("Seg99Rt")
        private Double seg99Rt;

        @com.aliyun.core.annotation.NameInMap("SuccessRateReq")
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

            private Builder() {
            } 

            private Builder(SceneMetrics model) {
                this.allCount = model.allCount;
                this.avgRt = model.avgRt;
                this.avgTps = model.avgTps;
                this.failCountReq = model.failCountReq;
                this.seg90Rt = model.seg90Rt;
                this.seg99Rt = model.seg99Rt;
                this.successRateReq = model.successRateReq;
            } 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>717</p>
             */
            public Builder allCount(Long allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * <p>The average response time (RT). Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The average transactions per second (TPS).</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder avgTps(Double avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * <p>The request failure rate.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * <p>The 90th percentile of RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder seg90Rt(Double seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * <p>The 99th percentile of RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder seg99Rt(Double seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * <p>The request success rate. The parameter value must be a non-negative number less than or equal to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0.99</p>
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
