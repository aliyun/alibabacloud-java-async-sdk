// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListGatewayCircuitBreakerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayCircuitBreakerRuleResponseBody</p>
 */
public class ListGatewayCircuitBreakerRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGatewayCircuitBreakerRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayCircuitBreakerRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayCircuitBreakerRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayCircuitBreakerRuleResponseBody build() {
            return new ListGatewayCircuitBreakerRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayCircuitBreakerRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayCircuitBreakerRuleResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BehaviorType")
        private Integer behaviorType;

        @com.aliyun.core.annotation.NameInMap("BodyEncoding")
        private Integer bodyEncoding;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdList")
        private java.util.List<Long> idList;

        @com.aliyun.core.annotation.NameInMap("LimitMode")
        private Integer limitMode;

        @com.aliyun.core.annotation.NameInMap("MaxAllowedMs")
        private Integer maxAllowedMs;

        @com.aliyun.core.annotation.NameInMap("MinRequestAmount")
        private Integer minRequestAmount;

        @com.aliyun.core.annotation.NameInMap("RecoveryTimeoutSec")
        private Integer recoveryTimeoutSec;

        @com.aliyun.core.annotation.NameInMap("ResponseAdditionalHeaders")
        private String responseAdditionalHeaders;

        @com.aliyun.core.annotation.NameInMap("ResponseContentBody")
        private String responseContentBody;

        @com.aliyun.core.annotation.NameInMap("ResponseRedirectUrl")
        private String responseRedirectUrl;

        @com.aliyun.core.annotation.NameInMap("ResponseStatusCode")
        private Integer responseStatusCode;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("StatDurationSec")
        private Integer statDurationSec;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("TriggerRatio")
        private Integer triggerRatio;

        private Result(Builder builder) {
            this.behaviorType = builder.behaviorType;
            this.bodyEncoding = builder.bodyEncoding;
            this.enable = builder.enable;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.id = builder.id;
            this.idList = builder.idList;
            this.limitMode = builder.limitMode;
            this.maxAllowedMs = builder.maxAllowedMs;
            this.minRequestAmount = builder.minRequestAmount;
            this.recoveryTimeoutSec = builder.recoveryTimeoutSec;
            this.responseAdditionalHeaders = builder.responseAdditionalHeaders;
            this.responseContentBody = builder.responseContentBody;
            this.responseRedirectUrl = builder.responseRedirectUrl;
            this.responseStatusCode = builder.responseStatusCode;
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
            this.statDurationSec = builder.statDurationSec;
            this.strategy = builder.strategy;
            this.triggerRatio = builder.triggerRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return behaviorType
         */
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        /**
         * @return bodyEncoding
         */
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idList
         */
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        /**
         * @return limitMode
         */
        public Integer getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return maxAllowedMs
         */
        public Integer getMaxAllowedMs() {
            return this.maxAllowedMs;
        }

        /**
         * @return minRequestAmount
         */
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        /**
         * @return recoveryTimeoutSec
         */
        public Integer getRecoveryTimeoutSec() {
            return this.recoveryTimeoutSec;
        }

        /**
         * @return responseAdditionalHeaders
         */
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        /**
         * @return responseContentBody
         */
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        /**
         * @return responseRedirectUrl
         */
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        /**
         * @return responseStatusCode
         */
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return statDurationSec
         */
        public Integer getStatDurationSec() {
            return this.statDurationSec;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return triggerRatio
         */
        public Integer getTriggerRatio() {
            return this.triggerRatio;
        }

        public static final class Builder {
            private Integer behaviorType; 
            private Integer bodyEncoding; 
            private Integer enable; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Long id; 
            private java.util.List<Long> idList; 
            private Integer limitMode; 
            private Integer maxAllowedMs; 
            private Integer minRequestAmount; 
            private Integer recoveryTimeoutSec; 
            private String responseAdditionalHeaders; 
            private String responseContentBody; 
            private String responseRedirectUrl; 
            private Integer responseStatusCode; 
            private Long routeId; 
            private String routeName; 
            private Integer statDurationSec; 
            private Integer strategy; 
            private Integer triggerRatio; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.behaviorType = model.behaviorType;
                this.bodyEncoding = model.bodyEncoding;
                this.enable = model.enable;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.id = model.id;
                this.idList = model.idList;
                this.limitMode = model.limitMode;
                this.maxAllowedMs = model.maxAllowedMs;
                this.minRequestAmount = model.minRequestAmount;
                this.recoveryTimeoutSec = model.recoveryTimeoutSec;
                this.responseAdditionalHeaders = model.responseAdditionalHeaders;
                this.responseContentBody = model.responseContentBody;
                this.responseRedirectUrl = model.responseRedirectUrl;
                this.responseStatusCode = model.responseStatusCode;
                this.routeId = model.routeId;
                this.routeName = model.routeName;
                this.statDurationSec = model.statDurationSec;
                this.strategy = model.strategy;
                this.triggerRatio = model.triggerRatio;
            } 

            /**
             * BehaviorType.
             */
            public Builder behaviorType(Integer behaviorType) {
                this.behaviorType = behaviorType;
                return this;
            }

            /**
             * BodyEncoding.
             */
            public Builder bodyEncoding(Integer bodyEncoding) {
                this.bodyEncoding = bodyEncoding;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdList.
             */
            public Builder idList(java.util.List<Long> idList) {
                this.idList = idList;
                return this;
            }

            /**
             * LimitMode.
             */
            public Builder limitMode(Integer limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * MaxAllowedMs.
             */
            public Builder maxAllowedMs(Integer maxAllowedMs) {
                this.maxAllowedMs = maxAllowedMs;
                return this;
            }

            /**
             * MinRequestAmount.
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * RecoveryTimeoutSec.
             */
            public Builder recoveryTimeoutSec(Integer recoveryTimeoutSec) {
                this.recoveryTimeoutSec = recoveryTimeoutSec;
                return this;
            }

            /**
             * ResponseAdditionalHeaders.
             */
            public Builder responseAdditionalHeaders(String responseAdditionalHeaders) {
                this.responseAdditionalHeaders = responseAdditionalHeaders;
                return this;
            }

            /**
             * ResponseContentBody.
             */
            public Builder responseContentBody(String responseContentBody) {
                this.responseContentBody = responseContentBody;
                return this;
            }

            /**
             * ResponseRedirectUrl.
             */
            public Builder responseRedirectUrl(String responseRedirectUrl) {
                this.responseRedirectUrl = responseRedirectUrl;
                return this;
            }

            /**
             * ResponseStatusCode.
             */
            public Builder responseStatusCode(Integer responseStatusCode) {
                this.responseStatusCode = responseStatusCode;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * StatDurationSec.
             */
            public Builder statDurationSec(Integer statDurationSec) {
                this.statDurationSec = statDurationSec;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * TriggerRatio.
             */
            public Builder triggerRatio(Integer triggerRatio) {
                this.triggerRatio = triggerRatio;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayCircuitBreakerRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayCircuitBreakerRuleResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BehaviorType")
        private Integer behaviorType;

        @com.aliyun.core.annotation.NameInMap("BodyEncoding")
        private Integer bodyEncoding;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdList")
        private java.util.List<Long> idList;

        @com.aliyun.core.annotation.NameInMap("LimitMode")
        private Integer limitMode;

        @com.aliyun.core.annotation.NameInMap("MaxAllowedMs")
        private Integer maxAllowedMs;

        @com.aliyun.core.annotation.NameInMap("MinRequestAmount")
        private Integer minRequestAmount;

        @com.aliyun.core.annotation.NameInMap("RecoveryTimeoutSec")
        private Integer recoveryTimeoutSec;

        @com.aliyun.core.annotation.NameInMap("ResponseAdditionalHeaders")
        private String responseAdditionalHeaders;

        @com.aliyun.core.annotation.NameInMap("ResponseContentBody")
        private String responseContentBody;

        @com.aliyun.core.annotation.NameInMap("ResponseRedirectUrl")
        private String responseRedirectUrl;

        @com.aliyun.core.annotation.NameInMap("ResponseStatusCode")
        private Integer responseStatusCode;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("StatDurationSec")
        private Integer statDurationSec;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("TriggerRatio")
        private Integer triggerRatio;

        private Results(Builder builder) {
            this.behaviorType = builder.behaviorType;
            this.bodyEncoding = builder.bodyEncoding;
            this.enable = builder.enable;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.id = builder.id;
            this.idList = builder.idList;
            this.limitMode = builder.limitMode;
            this.maxAllowedMs = builder.maxAllowedMs;
            this.minRequestAmount = builder.minRequestAmount;
            this.recoveryTimeoutSec = builder.recoveryTimeoutSec;
            this.responseAdditionalHeaders = builder.responseAdditionalHeaders;
            this.responseContentBody = builder.responseContentBody;
            this.responseRedirectUrl = builder.responseRedirectUrl;
            this.responseStatusCode = builder.responseStatusCode;
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
            this.statDurationSec = builder.statDurationSec;
            this.strategy = builder.strategy;
            this.triggerRatio = builder.triggerRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return behaviorType
         */
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        /**
         * @return bodyEncoding
         */
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idList
         */
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        /**
         * @return limitMode
         */
        public Integer getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return maxAllowedMs
         */
        public Integer getMaxAllowedMs() {
            return this.maxAllowedMs;
        }

        /**
         * @return minRequestAmount
         */
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        /**
         * @return recoveryTimeoutSec
         */
        public Integer getRecoveryTimeoutSec() {
            return this.recoveryTimeoutSec;
        }

        /**
         * @return responseAdditionalHeaders
         */
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        /**
         * @return responseContentBody
         */
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        /**
         * @return responseRedirectUrl
         */
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        /**
         * @return responseStatusCode
         */
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return statDurationSec
         */
        public Integer getStatDurationSec() {
            return this.statDurationSec;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return triggerRatio
         */
        public Integer getTriggerRatio() {
            return this.triggerRatio;
        }

        public static final class Builder {
            private Integer behaviorType; 
            private Integer bodyEncoding; 
            private Integer enable; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Long id; 
            private java.util.List<Long> idList; 
            private Integer limitMode; 
            private Integer maxAllowedMs; 
            private Integer minRequestAmount; 
            private Integer recoveryTimeoutSec; 
            private String responseAdditionalHeaders; 
            private String responseContentBody; 
            private String responseRedirectUrl; 
            private Integer responseStatusCode; 
            private Long routeId; 
            private String routeName; 
            private Integer statDurationSec; 
            private Integer strategy; 
            private Integer triggerRatio; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.behaviorType = model.behaviorType;
                this.bodyEncoding = model.bodyEncoding;
                this.enable = model.enable;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.id = model.id;
                this.idList = model.idList;
                this.limitMode = model.limitMode;
                this.maxAllowedMs = model.maxAllowedMs;
                this.minRequestAmount = model.minRequestAmount;
                this.recoveryTimeoutSec = model.recoveryTimeoutSec;
                this.responseAdditionalHeaders = model.responseAdditionalHeaders;
                this.responseContentBody = model.responseContentBody;
                this.responseRedirectUrl = model.responseRedirectUrl;
                this.responseStatusCode = model.responseStatusCode;
                this.routeId = model.routeId;
                this.routeName = model.routeName;
                this.statDurationSec = model.statDurationSec;
                this.strategy = model.strategy;
                this.triggerRatio = model.triggerRatio;
            } 

            /**
             * BehaviorType.
             */
            public Builder behaviorType(Integer behaviorType) {
                this.behaviorType = behaviorType;
                return this;
            }

            /**
             * BodyEncoding.
             */
            public Builder bodyEncoding(Integer bodyEncoding) {
                this.bodyEncoding = bodyEncoding;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdList.
             */
            public Builder idList(java.util.List<Long> idList) {
                this.idList = idList;
                return this;
            }

            /**
             * LimitMode.
             */
            public Builder limitMode(Integer limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * MaxAllowedMs.
             */
            public Builder maxAllowedMs(Integer maxAllowedMs) {
                this.maxAllowedMs = maxAllowedMs;
                return this;
            }

            /**
             * MinRequestAmount.
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * RecoveryTimeoutSec.
             */
            public Builder recoveryTimeoutSec(Integer recoveryTimeoutSec) {
                this.recoveryTimeoutSec = recoveryTimeoutSec;
                return this;
            }

            /**
             * ResponseAdditionalHeaders.
             */
            public Builder responseAdditionalHeaders(String responseAdditionalHeaders) {
                this.responseAdditionalHeaders = responseAdditionalHeaders;
                return this;
            }

            /**
             * ResponseContentBody.
             */
            public Builder responseContentBody(String responseContentBody) {
                this.responseContentBody = responseContentBody;
                return this;
            }

            /**
             * ResponseRedirectUrl.
             */
            public Builder responseRedirectUrl(String responseRedirectUrl) {
                this.responseRedirectUrl = responseRedirectUrl;
                return this;
            }

            /**
             * ResponseStatusCode.
             */
            public Builder responseStatusCode(Integer responseStatusCode) {
                this.responseStatusCode = responseStatusCode;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * StatDurationSec.
             */
            public Builder statDurationSec(Integer statDurationSec) {
                this.statDurationSec = statDurationSec;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * TriggerRatio.
             */
            public Builder triggerRatio(Integer triggerRatio) {
                this.triggerRatio = triggerRatio;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayCircuitBreakerRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayCircuitBreakerRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.results = builder.results;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private java.util.List<Results> results; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.results = model.results;
                this.totalSize = model.totalSize;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
