// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsSceneRunningDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsSceneRunningDataResponseBody</p>
 */
public class GetPtsSceneRunningDataResponseBody extends TeaModel {
    @NameInMap("AgentLocation")
    private java.util.List < AgentLocation> agentLocation;

    @NameInMap("AliveAgents")
    private Integer aliveAgents;

    @NameInMap("AverageRt")
    private Long averageRt;

    @NameInMap("BeginTime")
    private Long beginTime;

    @NameInMap("ChainMonitorDataList")
    private java.util.List < ChainMonitorDataList> chainMonitorDataList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Concurrency")
    private Integer concurrency;

    @NameInMap("ConcurrencyLimit")
    private Integer concurrencyLimit;

    @NameInMap("FailedBusinessCount")
    private Long failedBusinessCount;

    @NameInMap("FailedRequestCount")
    private Long failedRequestCount;

    @NameInMap("HasReport")
    private Boolean hasReport;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestBps")
    private String requestBps;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResponseBps")
    private String responseBps;

    @NameInMap("Seg90Rt")
    private Long seg90Rt;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalAgents")
    private Integer totalAgents;

    @NameInMap("TotalRealQps")
    private Integer totalRealQps;

    @NameInMap("TotalRequestCount")
    private Long totalRequestCount;

    @NameInMap("TpsLimit")
    private Integer tpsLimit;

    @NameInMap("Vum")
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

    /**
     * @return agentLocation
     */
    public java.util.List < AgentLocation> getAgentLocation() {
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
    public java.util.List < ChainMonitorDataList> getChainMonitorDataList() {
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
        private java.util.List < AgentLocation> agentLocation; 
        private Integer aliveAgents; 
        private Long averageRt; 
        private Long beginTime; 
        private java.util.List < ChainMonitorDataList> chainMonitorDataList; 
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

        /**
         * AgentLocation.
         */
        public Builder agentLocation(java.util.List < AgentLocation> agentLocation) {
            this.agentLocation = agentLocation;
            return this;
        }

        /**
         * AliveAgents.
         */
        public Builder aliveAgents(Integer aliveAgents) {
            this.aliveAgents = aliveAgents;
            return this;
        }

        /**
         * AverageRt.
         */
        public Builder averageRt(Long averageRt) {
            this.averageRt = averageRt;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * ChainMonitorDataList.
         */
        public Builder chainMonitorDataList(java.util.List < ChainMonitorDataList> chainMonitorDataList) {
            this.chainMonitorDataList = chainMonitorDataList;
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
         * Concurrency.
         */
        public Builder concurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * ConcurrencyLimit.
         */
        public Builder concurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }

        /**
         * FailedBusinessCount.
         */
        public Builder failedBusinessCount(Long failedBusinessCount) {
            this.failedBusinessCount = failedBusinessCount;
            return this;
        }

        /**
         * FailedRequestCount.
         */
        public Builder failedRequestCount(Long failedRequestCount) {
            this.failedRequestCount = failedRequestCount;
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
         * RequestBps.
         */
        public Builder requestBps(String requestBps) {
            this.requestBps = requestBps;
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
         * ResponseBps.
         */
        public Builder responseBps(String responseBps) {
            this.responseBps = responseBps;
            return this;
        }

        /**
         * Seg90Rt.
         */
        public Builder seg90Rt(Long seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalAgents.
         */
        public Builder totalAgents(Integer totalAgents) {
            this.totalAgents = totalAgents;
            return this;
        }

        /**
         * TotalRealQps.
         */
        public Builder totalRealQps(Integer totalRealQps) {
            this.totalRealQps = totalRealQps;
            return this;
        }

        /**
         * TotalRequestCount.
         */
        public Builder totalRequestCount(Long totalRequestCount) {
            this.totalRequestCount = totalRequestCount;
            return this;
        }

        /**
         * TpsLimit.
         */
        public Builder tpsLimit(Integer tpsLimit) {
            this.tpsLimit = tpsLimit;
            return this;
        }

        /**
         * Vum.
         */
        public Builder vum(Long vum) {
            this.vum = vum;
            return this;
        }

        public GetPtsSceneRunningDataResponseBody build() {
            return new GetPtsSceneRunningDataResponseBody(this);
        } 

    } 

    public static class AgentLocation extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("Province")
        private String province;

        @NameInMap("Region")
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

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Region.
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
    public static class CheckPointResult extends TeaModel {
        @NameInMap("FailedBusinessCount")
        private Long failedBusinessCount;

        @NameInMap("FailedBusinessQps")
        private Float failedBusinessQps;

        @NameInMap("SucceedBusinessCount")
        private Long succeedBusinessCount;

        @NameInMap("SucceedBusinessQps")
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

            /**
             * FailedBusinessCount.
             */
            public Builder failedBusinessCount(Long failedBusinessCount) {
                this.failedBusinessCount = failedBusinessCount;
                return this;
            }

            /**
             * FailedBusinessQps.
             */
            public Builder failedBusinessQps(Float failedBusinessQps) {
                this.failedBusinessQps = failedBusinessQps;
                return this;
            }

            /**
             * SucceedBusinessCount.
             */
            public Builder succeedBusinessCount(Long succeedBusinessCount) {
                this.succeedBusinessCount = succeedBusinessCount;
                return this;
            }

            /**
             * SucceedBusinessQps.
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
    public static class ChainMonitorDataList extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("AverageRt")
        private Integer averageRt;

        @NameInMap("CheckPointResult")
        private CheckPointResult checkPointResult;

        @NameInMap("Concurrency")
        private Float concurrency;

        @NameInMap("ConfigQps")
        private Integer configQps;

        @NameInMap("Count2XX")
        private Long count2XX;

        @NameInMap("FailedCount")
        private Long failedCount;

        @NameInMap("FailedQps")
        private Float failedQps;

        @NameInMap("MaxRt")
        private Integer maxRt;

        @NameInMap("MinRt")
        private Integer minRt;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("Qps2XX")
        private Float qps2XX;

        @NameInMap("RealQps")
        private Float realQps;

        @NameInMap("TimePoint")
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

            /**
             * ApiId.
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
             * AverageRt.
             */
            public Builder averageRt(Integer averageRt) {
                this.averageRt = averageRt;
                return this;
            }

            /**
             * CheckPointResult.
             */
            public Builder checkPointResult(CheckPointResult checkPointResult) {
                this.checkPointResult = checkPointResult;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Float concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * ConfigQps.
             */
            public Builder configQps(Integer configQps) {
                this.configQps = configQps;
                return this;
            }

            /**
             * Count2XX.
             */
            public Builder count2XX(Long count2XX) {
                this.count2XX = count2XX;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * FailedQps.
             */
            public Builder failedQps(Float failedQps) {
                this.failedQps = failedQps;
                return this;
            }

            /**
             * MaxRt.
             */
            public Builder maxRt(Integer maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * MinRt.
             */
            public Builder minRt(Integer minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Qps2XX.
             */
            public Builder qps2XX(Float qps2XX) {
                this.qps2XX = qps2XX;
                return this;
            }

            /**
             * RealQps.
             */
            public Builder realQps(Float realQps) {
                this.realQps = realQps;
                return this;
            }

            /**
             * TimePoint.
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
