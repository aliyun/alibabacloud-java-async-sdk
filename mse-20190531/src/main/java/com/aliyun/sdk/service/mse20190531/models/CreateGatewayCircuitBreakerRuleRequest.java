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
 * {@link CreateGatewayCircuitBreakerRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayCircuitBreakerRuleRequest</p>
 */
public class CreateGatewayCircuitBreakerRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BehaviorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer behaviorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BodyEncoding")
    private Integer bodyEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAllowedMs")
    private Integer maxAllowedMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinRequestAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer minRequestAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryTimeoutSec")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer recoveryTimeoutSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseContentBody")
    private String responseContentBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseRedirectUrl")
    private String responseRedirectUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseStatusCode")
    private Integer responseStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long routeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatDurationSec")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer statDurationSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerRatio")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer triggerRatio;

    private CreateGatewayCircuitBreakerRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.behaviorType = builder.behaviorType;
        this.bodyEncoding = builder.bodyEncoding;
        this.enable = builder.enable;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.maxAllowedMs = builder.maxAllowedMs;
        this.minRequestAmount = builder.minRequestAmount;
        this.recoveryTimeoutSec = builder.recoveryTimeoutSec;
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

    public static CreateGatewayCircuitBreakerRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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

    public static final class Builder extends Request.Builder<CreateGatewayCircuitBreakerRuleRequest, Builder> {
        private String acceptLanguage; 
        private Integer behaviorType; 
        private Integer bodyEncoding; 
        private Integer enable; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Integer maxAllowedMs; 
        private Integer minRequestAmount; 
        private Integer recoveryTimeoutSec; 
        private String responseContentBody; 
        private String responseRedirectUrl; 
        private Integer responseStatusCode; 
        private Long routeId; 
        private String routeName; 
        private Integer statDurationSec; 
        private Integer strategy; 
        private Integer triggerRatio; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayCircuitBreakerRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.behaviorType = request.behaviorType;
            this.bodyEncoding = request.bodyEncoding;
            this.enable = request.enable;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.maxAllowedMs = request.maxAllowedMs;
            this.minRequestAmount = request.minRequestAmount;
            this.recoveryTimeoutSec = request.recoveryTimeoutSec;
            this.responseContentBody = request.responseContentBody;
            this.responseRedirectUrl = request.responseRedirectUrl;
            this.responseStatusCode = request.responseStatusCode;
            this.routeId = request.routeId;
            this.routeName = request.routeName;
            this.statDurationSec = request.statDurationSec;
            this.strategy = request.strategy;
            this.triggerRatio = request.triggerRatio;
        } 

        /**
         * <p>The language in which you want the results to be displayed. Valid values: zh (default): Chinese. en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The type of the web fallback behavior.</p>
         * <p>0: returns the specified content.</p>
         * <p>1: redirects to the specified page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder behaviorType(Integer behaviorType) {
            this.putQueryParameter("BehaviorType", behaviorType);
            this.behaviorType = behaviorType;
            return this;
        }

        /**
         * <p>The encoding type.</p>
         * <p>0: plain text</p>
         * <p>1: JSON</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder bodyEncoding(Integer bodyEncoding) {
            this.putQueryParameter("BodyEncoding", bodyEncoding);
            this.bodyEncoding = bodyEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule.</p>
         * <p>0: disables the rule.</p>
         * <p>1: enables the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14407</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c9bc5afd61014165bd58f621b491*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The threshold in slow call proportion mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxAllowedMs(Integer maxAllowedMs) {
            this.putQueryParameter("MaxAllowedMs", maxAllowedMs);
            this.maxAllowedMs = maxAllowedMs;
            return this;
        }

        /**
         * <p>The minimum number of requests to trigger circuit breaking.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minRequestAmount(Integer minRequestAmount) {
            this.putQueryParameter("MinRequestAmount", minRequestAmount);
            this.minRequestAmount = minRequestAmount;
            return this;
        }

        /**
         * <p>The circuit breaking timeout period.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder recoveryTimeoutSec(Integer recoveryTimeoutSec) {
            this.putQueryParameter("RecoveryTimeoutSec", recoveryTimeoutSec);
            this.recoveryTimeoutSec = recoveryTimeoutSec;
            return this;
        }

        /**
         * <p>The HTTP text to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder responseContentBody(String responseContentBody) {
            this.putQueryParameter("ResponseContentBody", responseContentBody);
            this.responseContentBody = responseContentBody;
            return this;
        }

        /**
         * <p>The redirection URL.</p>
         * 
         * <strong>example:</strong>
         * <p>www.******.com</p>
         */
        public Builder responseRedirectUrl(String responseRedirectUrl) {
            this.putQueryParameter("ResponseRedirectUrl", responseRedirectUrl);
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>429</p>
         */
        public Builder responseStatusCode(Integer responseStatusCode) {
            this.putQueryParameter("ResponseStatusCode", responseStatusCode);
            this.responseStatusCode = responseStatusCode;
            return this;
        }

        /**
         * <p>The route ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>645</p>
         */
        public Builder routeId(Long routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>The route name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>routeName</p>
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>The statistical duration for triggering circuit breaking.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder statDurationSec(Integer statDurationSec) {
            this.putQueryParameter("StatDurationSec", statDurationSec);
            this.statDurationSec = statDurationSec;
            return this;
        }

        /**
         * <p>The type of the threshold.</p>
         * <p>0: slow call proportion</p>
         * <p>1: failure proportion</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder strategy(Integer strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>The request percentage that triggers circuit breaking.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder triggerRatio(Integer triggerRatio) {
            this.putQueryParameter("TriggerRatio", triggerRatio);
            this.triggerRatio = triggerRatio;
            return this;
        }

        @Override
        public CreateGatewayCircuitBreakerRuleRequest build() {
            return new CreateGatewayCircuitBreakerRuleRequest(this);
        } 

    } 

}
