// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsReportDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsReportDetailsResponseBody</p>
 */
public class GetPtsReportDetailsResponseBody extends TeaModel {
    @NameInMap("ApiMetricsList")
    private java.util.List < ApiMetricsList> apiMetricsList;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("ReportOverView")
    private ReportOverView reportOverView;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneMetrics")
    private SceneMetrics sceneMetrics;

    @NameInMap("SceneSnapShot")
    private SceneSnapShot sceneSnapShot;

    @NameInMap("Success")
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

    /**
     * @return apiMetricsList
     */
    public java.util.List < ApiMetricsList> getApiMetricsList() {
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
        private java.util.List < ApiMetricsList> apiMetricsList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private ReportOverView reportOverView; 
        private String requestId; 
        private SceneMetrics sceneMetrics; 
        private SceneSnapShot sceneSnapShot; 
        private Boolean success; 

        /**
         * ApiMetricsList.
         */
        public Builder apiMetricsList(java.util.List < ApiMetricsList> apiMetricsList) {
            this.apiMetricsList = apiMetricsList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SceneMetrics.
         */
        public Builder sceneMetrics(SceneMetrics sceneMetrics) {
            this.sceneMetrics = sceneMetrics;
            return this;
        }

        /**
         * SceneSnapShot.
         */
        public Builder sceneSnapShot(SceneSnapShot sceneSnapShot) {
            this.sceneSnapShot = sceneSnapShot;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPtsReportDetailsResponseBody build() {
            return new GetPtsReportDetailsResponseBody(this);
        } 

    } 

    public static class ApiMetricsList extends TeaModel {
        @NameInMap("AllCount")
        private Long allCount;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("AvgRt")
        private Float avgRt;

        @NameInMap("AvgTps")
        private Float avgTps;

        @NameInMap("FailCountBiz")
        private Long failCountBiz;

        @NameInMap("FailCountReq")
        private Long failCountReq;

        @NameInMap("MaxRt")
        private Float maxRt;

        @NameInMap("MinRt")
        private Float minRt;

        @NameInMap("Seg50Rt")
        private Float seg50Rt;

        @NameInMap("Seg75Rt")
        private Float seg75Rt;

        @NameInMap("Seg90Rt")
        private Float seg90Rt;

        @NameInMap("Seg99Rt")
        private Float seg99Rt;

        @NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @NameInMap("SuccessRateReq")
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
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgTps.
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * FailCountBiz.
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
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
            public Builder maxRt(Float maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * MinRt.
             */
            public Builder minRt(Float minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * Seg50Rt.
             */
            public Builder seg50Rt(Float seg50Rt) {
                this.seg50Rt = seg50Rt;
                return this;
            }

            /**
             * Seg75Rt.
             */
            public Builder seg75Rt(Float seg75Rt) {
                this.seg75Rt = seg75Rt;
                return this;
            }

            /**
             * Seg90Rt.
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * Seg99Rt.
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * SuccessRateBiz.
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * SuccessRateReq.
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
    public static class SceneMetrics extends TeaModel {
        @NameInMap("AllCount")
        private Long allCount;

        @NameInMap("AvgRt")
        private Float avgRt;

        @NameInMap("AvgTps")
        private Float avgTps;

        @NameInMap("FailCountBiz")
        private Long failCountBiz;

        @NameInMap("FailCountReq")
        private Long failCountReq;

        @NameInMap("Seg90Rt")
        private Float seg90Rt;

        @NameInMap("Seg99Rt")
        private Float seg99Rt;

        @NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @NameInMap("SuccessRateReq")
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
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgTps.
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * FailCountBiz.
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
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
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * Seg99Rt.
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * SuccessRateBiz.
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * SuccessRateReq.
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
    public static class DomainBindingList extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Ips")
        private java.util.List < String > ips;

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
        public java.util.List < String > getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List < String > ips; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            public DomainBindingList build() {
                return new DomainBindingList(this);
            } 

        } 

    }
    public static class AdvanceSetting extends TeaModel {
        @NameInMap("ConnectionTimeoutInSecond")
        private Integer connectionTimeoutInSecond;

        @NameInMap("DomainBindingList")
        private java.util.List < DomainBindingList> domainBindingList;

        @NameInMap("LogRate")
        private Integer logRate;

        @NameInMap("SuccessCode")
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
        public java.util.List < DomainBindingList> getDomainBindingList() {
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
            private java.util.List < DomainBindingList> domainBindingList; 
            private Integer logRate; 
            private String successCode; 

            /**
             * ConnectionTimeoutInSecond.
             */
            public Builder connectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
                this.connectionTimeoutInSecond = connectionTimeoutInSecond;
                return this;
            }

            /**
             * DomainBindingList.
             */
            public Builder domainBindingList(java.util.List < DomainBindingList> domainBindingList) {
                this.domainBindingList = domainBindingList;
                return this;
            }

            /**
             * LogRate.
             */
            public Builder logRate(Integer logRate) {
                this.logRate = logRate;
                return this;
            }

            /**
             * SuccessCode.
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
    public static class FileParameterList extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileOssAddress")
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

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileOssAddress.
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
    public static class GlobalParameterList extends TeaModel {
        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamValue")
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

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamValue.
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
    public static class ApiLoadConfigList extends TeaModel {
        @NameInMap("RpsBegin")
        private Integer rpsBegin;

        @NameInMap("RpsLimit")
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

            /**
             * RpsBegin.
             */
            public Builder rpsBegin(Integer rpsBegin) {
                this.rpsBegin = rpsBegin;
                return this;
            }

            /**
             * RpsLimit.
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
    public static class Configuration extends TeaModel {
        @NameInMap("AllConcurrencyBegin")
        private Integer allConcurrencyBegin;

        @NameInMap("AllConcurrencyLimit")
        private Integer allConcurrencyLimit;

        @NameInMap("AllRpsBegin")
        private Integer allRpsBegin;

        @NameInMap("AllRpsLimit")
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

            /**
             * AllConcurrencyBegin.
             */
            public Builder allConcurrencyBegin(Integer allConcurrencyBegin) {
                this.allConcurrencyBegin = allConcurrencyBegin;
                return this;
            }

            /**
             * AllConcurrencyLimit.
             */
            public Builder allConcurrencyLimit(Integer allConcurrencyLimit) {
                this.allConcurrencyLimit = allConcurrencyLimit;
                return this;
            }

            /**
             * AllRpsBegin.
             */
            public Builder allRpsBegin(Integer allRpsBegin) {
                this.allRpsBegin = allRpsBegin;
                return this;
            }

            /**
             * AllRpsLimit.
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
    public static class RelationLoadConfigList extends TeaModel {
        @NameInMap("ConcurrencyBegin")
        private Integer concurrencyBegin;

        @NameInMap("ConcurrencyLimit")
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

            /**
             * ConcurrencyBegin.
             */
            public Builder concurrencyBegin(Integer concurrencyBegin) {
                this.concurrencyBegin = concurrencyBegin;
                return this;
            }

            /**
             * ConcurrencyLimit.
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
    public static class LoadConfig extends TeaModel {
        @NameInMap("AgentCount")
        private Integer agentCount;

        @NameInMap("ApiLoadConfigList")
        private java.util.List < ApiLoadConfigList> apiLoadConfigList;

        @NameInMap("Configuration")
        private Configuration configuration;

        @NameInMap("MaxRunningTime")
        private Integer maxRunningTime;

        @NameInMap("RelationLoadConfigList")
        private java.util.List < RelationLoadConfigList> relationLoadConfigList;

        @NameInMap("TestMode")
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
        public java.util.List < ApiLoadConfigList> getApiLoadConfigList() {
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
        public java.util.List < RelationLoadConfigList> getRelationLoadConfigList() {
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
            private java.util.List < ApiLoadConfigList> apiLoadConfigList; 
            private Configuration configuration; 
            private Integer maxRunningTime; 
            private java.util.List < RelationLoadConfigList> relationLoadConfigList; 
            private String testMode; 

            /**
             * AgentCount.
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * ApiLoadConfigList.
             */
            public Builder apiLoadConfigList(java.util.List < ApiLoadConfigList> apiLoadConfigList) {
                this.apiLoadConfigList = apiLoadConfigList;
                return this;
            }

            /**
             * Configuration.
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * MaxRunningTime.
             */
            public Builder maxRunningTime(Integer maxRunningTime) {
                this.maxRunningTime = maxRunningTime;
                return this;
            }

            /**
             * RelationLoadConfigList.
             */
            public Builder relationLoadConfigList(java.util.List < RelationLoadConfigList> relationLoadConfigList) {
                this.relationLoadConfigList = relationLoadConfigList;
                return this;
            }

            /**
             * TestMode.
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
    public static class ApiListBody extends TeaModel {
        @NameInMap("BodyValue")
        private String bodyValue;

        @NameInMap("ContentType")
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

            /**
             * BodyValue.
             */
            public Builder bodyValue(String bodyValue) {
                this.bodyValue = bodyValue;
                return this;
            }

            /**
             * ContentType.
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
    public static class CheckPointList extends TeaModel {
        @NameInMap("CheckPoint")
        private String checkPoint;

        @NameInMap("CheckType")
        private String checkType;

        @NameInMap("ExpectValue")
        private String expectValue;

        @NameInMap("Operator")
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

            /**
             * CheckPoint.
             */
            public Builder checkPoint(String checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * ExpectValue.
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * Operator.
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
    public static class ExportList extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("ExportName")
        private String exportName;

        @NameInMap("ExportType")
        private String exportType;

        @NameInMap("ExportValue")
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

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * ExportName.
             */
            public Builder exportName(String exportName) {
                this.exportName = exportName;
                return this;
            }

            /**
             * ExportType.
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * ExportValue.
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
    public static class HeaderList extends TeaModel {
        @NameInMap("HeaderName")
        private String headerName;

        @NameInMap("HeaderValue")
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

            /**
             * HeaderName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * HeaderValue.
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
    public static class ApiList extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("Body")
        private ApiListBody body;

        @NameInMap("CheckPointList")
        private java.util.List < CheckPointList> checkPointList;

        @NameInMap("ExportList")
        private java.util.List < ExportList> exportList;

        @NameInMap("HeaderList")
        private java.util.List < HeaderList> headerList;

        @NameInMap("Method")
        private String method;

        @NameInMap("RedirectCountLimit")
        private Integer redirectCountLimit;

        @NameInMap("TimeoutInSecond")
        private Integer timeoutInSecond;

        @NameInMap("Url")
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
        public java.util.List < CheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        /**
         * @return exportList
         */
        public java.util.List < ExportList> getExportList() {
            return this.exportList;
        }

        /**
         * @return headerList
         */
        public java.util.List < HeaderList> getHeaderList() {
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
            private java.util.List < CheckPointList> checkPointList; 
            private java.util.List < ExportList> exportList; 
            private java.util.List < HeaderList> headerList; 
            private String method; 
            private Integer redirectCountLimit; 
            private Integer timeoutInSecond; 
            private String url; 

            /**
             * API ID。
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
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
             * Body.
             */
            public Builder body(ApiListBody body) {
                this.body = body;
                return this;
            }

            /**
             * CheckPointList.
             */
            public Builder checkPointList(java.util.List < CheckPointList> checkPointList) {
                this.checkPointList = checkPointList;
                return this;
            }

            /**
             * ExportList.
             */
            public Builder exportList(java.util.List < ExportList> exportList) {
                this.exportList = exportList;
                return this;
            }

            /**
             * HeaderList.
             */
            public Builder headerList(java.util.List < HeaderList> headerList) {
                this.headerList = headerList;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * RedirectCountLimit.
             */
            public Builder redirectCountLimit(Integer redirectCountLimit) {
                this.redirectCountLimit = redirectCountLimit;
                return this;
            }

            /**
             * TimeoutInSecond.
             */
            public Builder timeoutInSecond(Integer timeoutInSecond) {
                this.timeoutInSecond = timeoutInSecond;
                return this;
            }

            /**
             * Url.
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
    public static class FileParameterExplainList extends TeaModel {
        @NameInMap("BaseFile")
        private Boolean baseFile;

        @NameInMap("CycleOnce")
        private Boolean cycleOnce;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileParamName")
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

            /**
             * BaseFile.
             */
            public Builder baseFile(Boolean baseFile) {
                this.baseFile = baseFile;
                return this;
            }

            /**
             * CycleOnce.
             */
            public Builder cycleOnce(Boolean cycleOnce) {
                this.cycleOnce = cycleOnce;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileParamName.
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
    public static class RelationList extends TeaModel {
        @NameInMap("ApiList")
        private java.util.List < ApiList> apiList;

        @NameInMap("FileParameterExplainList")
        private java.util.List < FileParameterExplainList> fileParameterExplainList;

        @NameInMap("RelationId")
        private String relationId;

        @NameInMap("RelationName")
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
        public java.util.List < ApiList> getApiList() {
            return this.apiList;
        }

        /**
         * @return fileParameterExplainList
         */
        public java.util.List < FileParameterExplainList> getFileParameterExplainList() {
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
            private java.util.List < ApiList> apiList; 
            private java.util.List < FileParameterExplainList> fileParameterExplainList; 
            private String relationId; 
            private String relationName; 

            /**
             * ApiList.
             */
            public Builder apiList(java.util.List < ApiList> apiList) {
                this.apiList = apiList;
                return this;
            }

            /**
             * FileParameterExplainList.
             */
            public Builder fileParameterExplainList(java.util.List < FileParameterExplainList> fileParameterExplainList) {
                this.fileParameterExplainList = fileParameterExplainList;
                return this;
            }

            /**
             * RelationId.
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * RelationName.
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
    public static class SceneSnapShot extends TeaModel {
        @NameInMap("AdvanceSetting")
        private AdvanceSetting advanceSetting;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FileParameterList")
        private java.util.List < FileParameterList> fileParameterList;

        @NameInMap("GlobalParameterList")
        private java.util.List < GlobalParameterList> globalParameterList;

        @NameInMap("LoadConfig")
        private LoadConfig loadConfig;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RelationList")
        private java.util.List < RelationList> relationList;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("Status")
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
        public java.util.List < FileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        /**
         * @return globalParameterList
         */
        public java.util.List < GlobalParameterList> getGlobalParameterList() {
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
        public java.util.List < RelationList> getRelationList() {
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
            private java.util.List < FileParameterList> fileParameterList; 
            private java.util.List < GlobalParameterList> globalParameterList; 
            private LoadConfig loadConfig; 
            private String modifiedTime; 
            private java.util.List < RelationList> relationList; 
            private String sceneId; 
            private String sceneName; 
            private String status; 

            /**
             * AdvanceSetting.
             */
            public Builder advanceSetting(AdvanceSetting advanceSetting) {
                this.advanceSetting = advanceSetting;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FileParameterList.
             */
            public Builder fileParameterList(java.util.List < FileParameterList> fileParameterList) {
                this.fileParameterList = fileParameterList;
                return this;
            }

            /**
             * GlobalParameterList.
             */
            public Builder globalParameterList(java.util.List < GlobalParameterList> globalParameterList) {
                this.globalParameterList = globalParameterList;
                return this;
            }

            /**
             * LoadConfig.
             */
            public Builder loadConfig(LoadConfig loadConfig) {
                this.loadConfig = loadConfig;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RelationList.
             */
            public Builder relationList(java.util.List < RelationList> relationList) {
                this.relationList = relationList;
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
             * Status.
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
