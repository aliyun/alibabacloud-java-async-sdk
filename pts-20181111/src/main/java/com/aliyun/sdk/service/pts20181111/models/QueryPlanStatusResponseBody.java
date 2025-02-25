// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20181111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPlanStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPlanStatusResponseBody</p>
 */
public class QueryPlanStatusResponseBody extends TeaModel {
    @NameInMap("AgentLocations")
    private AgentLocations agentLocations;

    @NameInMap("AliveAgentCount")
    private Integer aliveAgentCount;

    @NameInMap("AverageRt")
    private Integer averageRt;

    @NameInMap("BpsRequest")
    private String bpsRequest;

    @NameInMap("BpsResponse")
    private String bpsResponse;

    @NameInMap("Code")
    private String code;

    @NameInMap("Concurrency")
    private Integer concurrency;

    @NameInMap("ConcurrencyLimit")
    private Integer concurrencyLimit;

    @NameInMap("CurrentTime")
    private Long currentTime;

    @NameInMap("FailedBusinessCount")
    private Integer failedBusinessCount;

    @NameInMap("FailedRequestCount")
    private Integer failedRequestCount;

    @NameInMap("Message")
    private String message;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("ReportId")
    private Long reportId;

    @NameInMap("RequestCount")
    private String requestCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Seg90Rt")
    private Integer seg90Rt;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tips")
    private String tips;

    @NameInMap("TotalAgentCount")
    private Integer totalAgentCount;

    @NameInMap("Tps")
    private Integer tps;

    @NameInMap("TpsLimit")
    private Integer tpsLimit;

    @NameInMap("Vum")
    private Integer vum;

    private QueryPlanStatusResponseBody(Builder builder) {
        this.agentLocations = builder.agentLocations;
        this.aliveAgentCount = builder.aliveAgentCount;
        this.averageRt = builder.averageRt;
        this.bpsRequest = builder.bpsRequest;
        this.bpsResponse = builder.bpsResponse;
        this.code = builder.code;
        this.concurrency = builder.concurrency;
        this.concurrencyLimit = builder.concurrencyLimit;
        this.currentTime = builder.currentTime;
        this.failedBusinessCount = builder.failedBusinessCount;
        this.failedRequestCount = builder.failedRequestCount;
        this.message = builder.message;
        this.monitorData = builder.monitorData;
        this.reportId = builder.reportId;
        this.requestCount = builder.requestCount;
        this.requestId = builder.requestId;
        this.seg90Rt = builder.seg90Rt;
        this.startTime = builder.startTime;
        this.success = builder.success;
        this.tips = builder.tips;
        this.totalAgentCount = builder.totalAgentCount;
        this.tps = builder.tps;
        this.tpsLimit = builder.tpsLimit;
        this.vum = builder.vum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPlanStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return agentLocations
     */
    public AgentLocations getAgentLocations() {
        return this.agentLocations;
    }

    /**
     * @return aliveAgentCount
     */
    public Integer getAliveAgentCount() {
        return this.aliveAgentCount;
    }

    /**
     * @return averageRt
     */
    public Integer getAverageRt() {
        return this.averageRt;
    }

    /**
     * @return bpsRequest
     */
    public String getBpsRequest() {
        return this.bpsRequest;
    }

    /**
     * @return bpsResponse
     */
    public String getBpsResponse() {
        return this.bpsResponse;
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
     * @return currentTime
     */
    public Long getCurrentTime() {
        return this.currentTime;
    }

    /**
     * @return failedBusinessCount
     */
    public Integer getFailedBusinessCount() {
        return this.failedBusinessCount;
    }

    /**
     * @return failedRequestCount
     */
    public Integer getFailedRequestCount() {
        return this.failedRequestCount;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return monitorData
     */
    public MonitorData getMonitorData() {
        return this.monitorData;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return requestCount
     */
    public String getRequestCount() {
        return this.requestCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return seg90Rt
     */
    public Integer getSeg90Rt() {
        return this.seg90Rt;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tips
     */
    public String getTips() {
        return this.tips;
    }

    /**
     * @return totalAgentCount
     */
    public Integer getTotalAgentCount() {
        return this.totalAgentCount;
    }

    /**
     * @return tps
     */
    public Integer getTps() {
        return this.tps;
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
    public Integer getVum() {
        return this.vum;
    }

    public static final class Builder {
        private AgentLocations agentLocations; 
        private Integer aliveAgentCount; 
        private Integer averageRt; 
        private String bpsRequest; 
        private String bpsResponse; 
        private String code; 
        private Integer concurrency; 
        private Integer concurrencyLimit; 
        private Long currentTime; 
        private Integer failedBusinessCount; 
        private Integer failedRequestCount; 
        private String message; 
        private MonitorData monitorData; 
        private Long reportId; 
        private String requestCount; 
        private String requestId; 
        private Integer seg90Rt; 
        private Long startTime; 
        private Boolean success; 
        private String tips; 
        private Integer totalAgentCount; 
        private Integer tps; 
        private Integer tpsLimit; 
        private Integer vum; 

        /**
         * AgentLocations.
         */
        public Builder agentLocations(AgentLocations agentLocations) {
            this.agentLocations = agentLocations;
            return this;
        }

        /**
         * AliveAgentCount.
         */
        public Builder aliveAgentCount(Integer aliveAgentCount) {
            this.aliveAgentCount = aliveAgentCount;
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
         * BpsRequest.
         */
        public Builder bpsRequest(String bpsRequest) {
            this.bpsRequest = bpsRequest;
            return this;
        }

        /**
         * BpsResponse.
         */
        public Builder bpsResponse(String bpsResponse) {
            this.bpsResponse = bpsResponse;
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
         * CurrentTime.
         */
        public Builder currentTime(Long currentTime) {
            this.currentTime = currentTime;
            return this;
        }

        /**
         * FailedBusinessCount.
         */
        public Builder failedBusinessCount(Integer failedBusinessCount) {
            this.failedBusinessCount = failedBusinessCount;
            return this;
        }

        /**
         * FailedRequestCount.
         */
        public Builder failedRequestCount(Integer failedRequestCount) {
            this.failedRequestCount = failedRequestCount;
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
         * MonitorData.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * ReportId.
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * RequestCount.
         */
        public Builder requestCount(String requestCount) {
            this.requestCount = requestCount;
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
         * Seg90Rt.
         */
        public Builder seg90Rt(Integer seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
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
         * Tips.
         */
        public Builder tips(String tips) {
            this.tips = tips;
            return this;
        }

        /**
         * TotalAgentCount.
         */
        public Builder totalAgentCount(Integer totalAgentCount) {
            this.totalAgentCount = totalAgentCount;
            return this;
        }

        /**
         * Tps.
         */
        public Builder tps(Integer tps) {
            this.tps = tps;
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
        public Builder vum(Integer vum) {
            this.vum = vum;
            return this;
        }

        public QueryPlanStatusResponseBody build() {
            return new QueryPlanStatusResponseBody(this);
        } 

    } 

    public static class AgentLocations extends TeaModel {
        @NameInMap("AgentLocation")
        private java.util.List < java.util.Map<String, ?>> agentLocation;

        private AgentLocations(Builder builder) {
            this.agentLocation = builder.agentLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentLocations create() {
            return builder().build();
        }

        /**
         * @return agentLocation
         */
        public java.util.List < java.util.Map<String, ?>> getAgentLocation() {
            return this.agentLocation;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> agentLocation; 

            /**
             * AgentLocation.
             */
            public Builder agentLocation(java.util.List < java.util.Map<String, ?>> agentLocation) {
                this.agentLocation = agentLocation;
                return this;
            }

            public AgentLocations build() {
                return new AgentLocations(this);
            } 

        } 

    }
    public static class MonitorData extends TeaModel {
        @NameInMap("Data")
        private java.util.List < java.util.Map<String, ?>> data;

        private MonitorData(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
