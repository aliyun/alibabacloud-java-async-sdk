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
 * {@link GetPtsSceneRunningDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsSceneRunningDataResponseBody</p>
 */
public class GetPtsSceneRunningDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentLocation")
    private java.util.List<AgentLocation> agentLocation;

    @com.aliyun.core.annotation.NameInMap("AliveAgents")
    private Integer aliveAgents;

    @com.aliyun.core.annotation.NameInMap("AverageRt")
    private Long averageRt;

    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.NameInMap("ChainMonitorDataList")
    private java.util.List<ChainMonitorDataList> chainMonitorDataList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.NameInMap("ConcurrencyLimit")
    private Integer concurrencyLimit;

    @com.aliyun.core.annotation.NameInMap("FailedBusinessCount")
    private Long failedBusinessCount;

    @com.aliyun.core.annotation.NameInMap("FailedRequestCount")
    private Long failedRequestCount;

    @com.aliyun.core.annotation.NameInMap("HasReport")
    private Boolean hasReport;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestBps")
    private String requestBps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseBps")
    private String responseBps;

    @com.aliyun.core.annotation.NameInMap("Seg90Rt")
    private Long seg90Rt;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalAgents")
    private Integer totalAgents;

    @com.aliyun.core.annotation.NameInMap("TotalRealQps")
    private Integer totalRealQps;

    @com.aliyun.core.annotation.NameInMap("TotalRequestCount")
    private Long totalRequestCount;

    @com.aliyun.core.annotation.NameInMap("TpsLimit")
    private Integer tpsLimit;

    @com.aliyun.core.annotation.NameInMap("Vum")
    private Long vum;

    private GetPtsSceneRunningDataResponseBody(Builder builder) {
        this.agentLocation = builder.agentLocation;
        this.aliveAgents = builder.aliveAgents;
        this.averageRt = builder.averageRt;
        this.beginTime = builder.beginTime;
        this.chainMonitorDataList = builder.chainMonitorDataList;
        this.code = builder.code;
        this.concurrency = builder.concurrency;
        this.concurrencyLimit = builder.concurrencyLimit;
        this.failedBusinessCount = builder.failedBusinessCount;
        this.failedRequestCount = builder.failedRequestCount;
        this.hasReport = builder.hasReport;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestBps = builder.requestBps;
        this.requestId = builder.requestId;
        this.responseBps = builder.responseBps;
        this.seg90Rt = builder.seg90Rt;
        this.status = builder.status;
        this.success = builder.success;
        this.totalAgents = builder.totalAgents;
        this.totalRealQps = builder.totalRealQps;
        this.totalRequestCount = builder.totalRequestCount;
        this.tpsLimit = builder.tpsLimit;
        this.vum = builder.vum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsSceneRunningDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentLocation
     */
    public java.util.List<AgentLocation> getAgentLocation() {
        return this.agentLocation;
    }

    /**
     * @return aliveAgents
     */
    public Integer getAliveAgents() {
        return this.aliveAgents;
    }

    /**
     * @return averageRt
     */
    public Long getAverageRt() {
        return this.averageRt;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return chainMonitorDataList
     */
    public java.util.List<ChainMonitorDataList> getChainMonitorDataList() {
        return this.chainMonitorDataList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return concurrencyLimit
     */
    public Integer getConcurrencyLimit() {
        return this.concurrencyLimit;
    }

    /**
     * @return failedBusinessCount
     */
    public Long getFailedBusinessCount() {
        return this.failedBusinessCount;
    }

    /**
     * @return failedRequestCount
     */
    public Long getFailedRequestCount() {
        return this.failedRequestCount;
    }

    /**
     * @return hasReport
     */
    public Boolean getHasReport() {
        return this.hasReport;
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
     * @return requestBps
     */
    public String getRequestBps() {
        return this.requestBps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseBps
     */
    public String getResponseBps() {
        return this.responseBps;
    }

    /**
     * @return seg90Rt
     */
    public Long getSeg90Rt() {
        return this.seg90Rt;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalAgents
     */
    public Integer getTotalAgents() {
        return this.totalAgents;
    }

    /**
     * @return totalRealQps
     */
    public Integer getTotalRealQps() {
        return this.totalRealQps;
    }

    /**
     * @return totalRequestCount
     */
    public Long getTotalRequestCount() {
        return this.totalRequestCount;
    }

    /**
     * @return tpsLimit
     */
    public Integer getTpsLimit() {
        return this.tpsLimit;
    }

    /**
     * @return vum
     */
    public Long getVum() {
        return this.vum;
    }

    public static final class Builder {
        private java.util.List<AgentLocation> agentLocation; 
        private Integer aliveAgents; 
        private Long averageRt; 
        private Long beginTime; 
        private java.util.List<ChainMonitorDataList> chainMonitorDataList; 
        private String code; 
        private Integer concurrency; 
        private Integer concurrencyLimit; 
        private Long failedBusinessCount; 
        private Long failedRequestCount; 
        private Boolean hasReport; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestBps; 
        private String requestId; 
        private String responseBps; 
        private Long seg90Rt; 
        private Integer status; 
        private Boolean success; 
        private Integer totalAgents; 
        private Integer totalRealQps; 
        private Long totalRequestCount; 
        private Integer tpsLimit; 
        private Long vum; 

        private Builder() {
        } 

        private Builder(GetPtsSceneRunningDataResponseBody model) {
            this.agentLocation = model.agentLocation;
            this.aliveAgents = model.aliveAgents;
            this.averageRt = model.averageRt;
            this.beginTime = model.beginTime;
            this.chainMonitorDataList = model.chainMonitorDataList;
            this.code = model.code;
            this.concurrency = model.concurrency;
            this.concurrencyLimit = model.concurrencyLimit;
            this.failedBusinessCount = model.failedBusinessCount;
            this.failedRequestCount = model.failedRequestCount;
            this.hasReport = model.hasReport;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestBps = model.requestBps;
            this.requestId = model.requestId;
            this.responseBps = model.responseBps;
            this.seg90Rt = model.seg90Rt;
            this.status = model.status;
            this.success = model.success;
            this.totalAgents = model.totalAgents;
            this.totalRealQps = model.totalRealQps;
            this.totalRequestCount = model.totalRequestCount;
            this.tpsLimit = model.tpsLimit;
            this.vum = model.vum;
        } 

        /**
         * <p>The location information of stress testers.</p>
         */
        public Builder agentLocation(java.util.List<AgentLocation> agentLocation) {
            this.agentLocation = agentLocation;
            return this;
        }

        /**
         * <p>The number of healthy engines.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder aliveAgents(Integer aliveAgents) {
            this.aliveAgents = aliveAgents;
            return this;
        }

        /**
         * <p>The average RT.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder averageRt(Long averageRt) {
            this.averageRt = averageRt;
            return this;
        }

        /**
         * <p>The start time of the stress testing that is displayed as a timestamp. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1651895518339</p>
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The stress testing details of the GetPtsSceneRunningData operation.</p>
         */
        public Builder chainMonitorDataList(java.util.List<ChainMonitorDataList> chainMonitorDataList) {
            this.chainMonitorDataList = chainMonitorDataList;
            return this;
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
         * <p>The total concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder concurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder concurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }

        /**
         * <p>The total number of failed businesses.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        public Builder failedBusinessCount(Long failedBusinessCount) {
            this.failedBusinessCount = failedBusinessCount;
            return this;
        }

        /**
         * <p>The number of failed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder failedRequestCount(Long failedRequestCount) {
            this.failedRequestCount = failedRequestCount;
            return this;
        }

        /**
         * <p>Indicates whether a report is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasReport(Boolean hasReport) {
            this.hasReport = hasReport;
            return this;
        }

        /**
         * <p>The HTTP status code. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>no message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The size of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>89kb</p>
         */
        public Builder requestBps(String requestBps) {
            this.requestBps = requestBps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The size of the response body.</p>
         * 
         * <strong>example:</strong>
         * <p>8kb</p>
         */
        public Builder responseBps(String responseBps) {
            this.responseBps = responseBps;
            return this;
        }

        /**
         * <p>The 90th percentile of reaction time (RT).</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder seg90Rt(Long seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }

        /**
         * <p>The scenario status. The default parameter value is 7.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder status(Integer status) {
            this.status = status;
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

        /**
         * <p>The total number of stress testers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalAgents(Integer totalAgents) {
            this.totalAgents = totalAgents;
            return this;
        }

        /**
         * <p>The total number of queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalRealQps(Integer totalRealQps) {
            this.totalRealQps = totalRealQps;
            return this;
        }

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>8900</p>
         */
        public Builder totalRequestCount(Long totalRequestCount) {
            this.totalRequestCount = totalRequestCount;
            return this;
        }

        /**
         * <p>The maximum transactions per second (TPS).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder tpsLimit(Integer tpsLimit) {
            this.tpsLimit = tpsLimit;
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

        public GetPtsSceneRunningDataResponseBody build() {
            return new GetPtsSceneRunningDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPtsSceneRunningDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsSceneRunningDataResponseBody</p>
     */
    public static class AgentLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private AgentLocation(Builder builder) {
            this.count = builder.count;
            this.isp = builder.isp;
            this.province = builder.province;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentLocation create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer count; 
            private String isp; 
            private String province; 
            private String region; 

            private Builder() {
            } 

            private Builder(AgentLocation model) {
                this.count = model.count;
                this.isp = model.isp;
                this.province = model.province;
                this.region = model.region;
            } 

            /**
             * <p>The number of stress testers.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The provider of the stress tester.</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The province in which the stress tester resides.</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The region in which the stress tester resides.</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public AgentLocation build() {
                return new AgentLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsSceneRunningDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsSceneRunningDataResponseBody</p>
     */
    public static class CheckPointResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedBusinessCount")
        private Long failedBusinessCount;

        @com.aliyun.core.annotation.NameInMap("FailedBusinessQps")
        private Float failedBusinessQps;

        @com.aliyun.core.annotation.NameInMap("SucceedBusinessCount")
        private Long succeedBusinessCount;

        @com.aliyun.core.annotation.NameInMap("SucceedBusinessQps")
        private Float succeedBusinessQps;

        private CheckPointResult(Builder builder) {
            this.failedBusinessCount = builder.failedBusinessCount;
            this.failedBusinessQps = builder.failedBusinessQps;
            this.succeedBusinessCount = builder.succeedBusinessCount;
            this.succeedBusinessQps = builder.succeedBusinessQps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckPointResult create() {
            return builder().build();
        }

        /**
         * @return failedBusinessCount
         */
        public Long getFailedBusinessCount() {
            return this.failedBusinessCount;
        }

        /**
         * @return failedBusinessQps
         */
        public Float getFailedBusinessQps() {
            return this.failedBusinessQps;
        }

        /**
         * @return succeedBusinessCount
         */
        public Long getSucceedBusinessCount() {
            return this.succeedBusinessCount;
        }

        /**
         * @return succeedBusinessQps
         */
        public Float getSucceedBusinessQps() {
            return this.succeedBusinessQps;
        }

        public static final class Builder {
            private Long failedBusinessCount; 
            private Float failedBusinessQps; 
            private Long succeedBusinessCount; 
            private Float succeedBusinessQps; 

            private Builder() {
            } 

            private Builder(CheckPointResult model) {
                this.failedBusinessCount = model.failedBusinessCount;
                this.failedBusinessQps = model.failedBusinessQps;
                this.succeedBusinessCount = model.succeedBusinessCount;
                this.succeedBusinessQps = model.succeedBusinessQps;
            } 

            /**
             * <p>The number of failed businesses.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder failedBusinessCount(Long failedBusinessCount) {
                this.failedBusinessCount = failedBusinessCount;
                return this;
            }

            /**
             * <p>The RPS of failed businesses.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder failedBusinessQps(Float failedBusinessQps) {
                this.failedBusinessQps = failedBusinessQps;
                return this;
            }

            /**
             * <p>The number of successful businesses.</p>
             * 
             * <strong>example:</strong>
             * <p>908</p>
             */
            public Builder succeedBusinessCount(Long succeedBusinessCount) {
                this.succeedBusinessCount = succeedBusinessCount;
                return this;
            }

            /**
             * <p>The RPS of the successful businesses.</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder succeedBusinessQps(Float succeedBusinessQps) {
                this.succeedBusinessQps = succeedBusinessQps;
                return this;
            }

            public CheckPointResult build() {
                return new CheckPointResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPtsSceneRunningDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsSceneRunningDataResponseBody</p>
     */
    public static class ChainMonitorDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AverageRt")
        private Integer averageRt;

        @com.aliyun.core.annotation.NameInMap("CheckPointResult")
        private CheckPointResult checkPointResult;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Float concurrency;

        @com.aliyun.core.annotation.NameInMap("ConfigQps")
        private Integer configQps;

        @com.aliyun.core.annotation.NameInMap("Count2XX")
        private Long count2XX;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("FailedQps")
        private Float failedQps;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private Integer maxRt;

        @com.aliyun.core.annotation.NameInMap("MinRt")
        private Integer minRt;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Qps2XX")
        private Float qps2XX;

        @com.aliyun.core.annotation.NameInMap("RealQps")
        private Float realQps;

        @com.aliyun.core.annotation.NameInMap("TimePoint")
        private Long timePoint;

        private ChainMonitorDataList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.averageRt = builder.averageRt;
            this.checkPointResult = builder.checkPointResult;
            this.concurrency = builder.concurrency;
            this.configQps = builder.configQps;
            this.count2XX = builder.count2XX;
            this.failedCount = builder.failedCount;
            this.failedQps = builder.failedQps;
            this.maxRt = builder.maxRt;
            this.minRt = builder.minRt;
            this.nodeId = builder.nodeId;
            this.qps2XX = builder.qps2XX;
            this.realQps = builder.realQps;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChainMonitorDataList create() {
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
         * @return averageRt
         */
        public Integer getAverageRt() {
            return this.averageRt;
        }

        /**
         * @return checkPointResult
         */
        public CheckPointResult getCheckPointResult() {
            return this.checkPointResult;
        }

        /**
         * @return concurrency
         */
        public Float getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return configQps
         */
        public Integer getConfigQps() {
            return this.configQps;
        }

        /**
         * @return count2XX
         */
        public Long getCount2XX() {
            return this.count2XX;
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return failedQps
         */
        public Float getFailedQps() {
            return this.failedQps;
        }

        /**
         * @return maxRt
         */
        public Integer getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return minRt
         */
        public Integer getMinRt() {
            return this.minRt;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return qps2XX
         */
        public Float getQps2XX() {
            return this.qps2XX;
        }

        /**
         * @return realQps
         */
        public Float getRealQps() {
            return this.realQps;
        }

        /**
         * @return timePoint
         */
        public Long getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private Integer averageRt; 
            private CheckPointResult checkPointResult; 
            private Float concurrency; 
            private Integer configQps; 
            private Long count2XX; 
            private Long failedCount; 
            private Float failedQps; 
            private Integer maxRt; 
            private Integer minRt; 
            private Long nodeId; 
            private Float qps2XX; 
            private Float realQps; 
            private Long timePoint; 

            private Builder() {
            } 

            private Builder(ChainMonitorDataList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.averageRt = model.averageRt;
                this.checkPointResult = model.checkPointResult;
                this.concurrency = model.concurrency;
                this.configQps = model.configQps;
                this.count2XX = model.count2XX;
                this.failedCount = model.failedCount;
                this.failedQps = model.failedQps;
                this.maxRt = model.maxRt;
                this.minRt = model.minRt;
                this.nodeId = model.nodeId;
                this.qps2XX = model.qps2XX;
                this.realQps = model.realQps;
                this.timePoint = model.timePoint;
            } 

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ANBDC8B</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
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
             * <p>The average RT.</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
             */
            public Builder averageRt(Integer averageRt) {
                this.averageRt = averageRt;
                return this;
            }

            /**
             * <p>The check point results.</p>
             */
            public Builder checkPointResult(CheckPointResult checkPointResult) {
                this.checkPointResult = checkPointResult;
                return this;
            }

            /**
             * <p>The concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder concurrency(Float concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The RPS of successful and failed requests.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder configQps(Integer configQps) {
                this.configQps = configQps;
                return this;
            }

            /**
             * <p>The number of successful requests.</p>
             * 
             * <strong>example:</strong>
             * <p>7890</p>
             */
            public Builder count2XX(Long count2XX) {
                this.count2XX = count2XX;
                return this;
            }

            /**
             * <p>The total number of failed requests.</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The RPS of failed requests.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder failedQps(Float failedQps) {
                this.failedQps = failedQps;
                return this;
            }

            /**
             * <p>The maximum RT.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder maxRt(Integer maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * <p>The minimum RT.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder minRt(Integer minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>78509</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The Requests Per Second (RPS) of successful requests.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder qps2XX(Float qps2XX) {
                this.qps2XX = qps2XX;
                return this;
            }

            /**
             * <p>The actual RPS.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder realQps(Float realQps) {
                this.realQps = realQps;
                return this;
            }

            /**
             * <p>The point in time at which the stress testing is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1278908899</p>
             */
            public Builder timePoint(Long timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public ChainMonitorDataList build() {
                return new ChainMonitorDataList(this);
            } 

        } 

    }
}
