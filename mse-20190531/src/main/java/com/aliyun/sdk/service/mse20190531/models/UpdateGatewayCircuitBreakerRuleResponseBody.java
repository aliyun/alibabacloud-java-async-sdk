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
 * {@link UpdateGatewayCircuitBreakerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGatewayCircuitBreakerRuleResponseBody</p>
 */
public class UpdateGatewayCircuitBreakerRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateGatewayCircuitBreakerRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayCircuitBreakerRuleResponseBody create() {
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

        private Builder(UpdateGatewayCircuitBreakerRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGatewayCircuitBreakerRuleResponseBody build() {
            return new UpdateGatewayCircuitBreakerRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayCircuitBreakerRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayCircuitBreakerRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
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
             * <p>The web fallback behavior type. Valid values:</p>
             * <ul>
             * <li>0: Return specified text.</li>
             * <li>1: Redirect to a specified page.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder behaviorType(Integer behaviorType) {
                this.behaviorType = behaviorType;
                return this;
            }

            /**
             * <p>The encoding type. Valid values:</p>
             * <ul>
             * <li>0: Plain text.</li>
             * <li>1: JSON.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bodyEncoding(Integer bodyEncoding) {
                this.bodyEncoding = bodyEncoding;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>14407</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-c9bc5afd61014165bd58f621b491****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The ID of the circuit breaker rule.</p>
             * 
             * <strong>example:</strong>
             * <p>369</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IDs of the filter rules.</p>
             */
            public Builder idList(java.util.List<Long> idList) {
                this.idList = idList;
                return this;
            }

            /**
             * <p>The threshold conversion mode. Valid values:</p>
             * <ul>
             * <li>0: Standalone.</li>
             * <li>1: Cluster.</li>
             * <li>2: Cluster to standalone.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder limitMode(Integer limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * <p>The slow call threshold in slow call mode.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxAllowedMs(Integer maxAllowedMs) {
                this.maxAllowedMs = maxAllowedMs;
                return this;
            }

            /**
             * <p>The minimum number of requests that triggers circuit breaking.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * <p>The recovery duration for circuit breaking.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder recoveryTimeoutSec(Integer recoveryTimeoutSec) {
                this.recoveryTimeoutSec = recoveryTimeoutSec;
                return this;
            }

            /**
             * <p>The custom headers, which are entered as key-value pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>key=value</p>
             */
            public Builder responseAdditionalHeaders(String responseAdditionalHeaders) {
                this.responseAdditionalHeaders = responseAdditionalHeaders;
                return this;
            }

            /**
             * <p>The HTTP response text.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder responseContentBody(String responseContentBody) {
                this.responseContentBody = responseContentBody;
                return this;
            }

            /**
             * <p>The redirect URL.</p>
             * 
             * <strong>example:</strong>
             * <p>www.******.com</p>
             */
            public Builder responseRedirectUrl(String responseRedirectUrl) {
                this.responseRedirectUrl = responseRedirectUrl;
                return this;
            }

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>201</p>
             */
            public Builder responseStatusCode(Integer responseStatusCode) {
                this.responseStatusCode = responseStatusCode;
                return this;
            }

            /**
             * <p>The ID of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>645</p>
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * <p>The name of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>routeName</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * <p>The statistical duration for circuit breaking.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder statDurationSec(Integer statDurationSec) {
                this.statDurationSec = statDurationSec;
                return this;
            }

            /**
             * <p>The threshold type. Valid values:</p>
             * <ul>
             * <li>0: Slow call.</li>
             * <li>1: Exception.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>The percentage that triggers circuit breaking.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder triggerRatio(Integer triggerRatio) {
                this.triggerRatio = triggerRatio;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
