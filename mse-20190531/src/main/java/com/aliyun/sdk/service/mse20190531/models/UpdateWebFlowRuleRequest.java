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
 * {@link UpdateWebFlowRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebFlowRuleRequest</p>
 */
public class UpdateWebFlowRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Burst")
    private Integer burst;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlBehavior")
    private Integer controlBehavior;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxQueueingTimeMs")
    private Integer maxQueueingTimeMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private Integer metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamItem")
    private String paramItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceMode")
    private Integer resourceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatIntervalMs")
    private Integer statIntervalMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Float threshold;

    private UpdateWebFlowRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.burst = builder.burst;
        this.controlBehavior = builder.controlBehavior;
        this.enable = builder.enable;
        this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
        this.metricType = builder.metricType;
        this.namespace = builder.namespace;
        this.paramItem = builder.paramItem;
        this.regionId = builder.regionId;
        this.resourceMode = builder.resourceMode;
        this.ruleId = builder.ruleId;
        this.statIntervalMs = builder.statIntervalMs;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebFlowRuleRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return burst
     */
    public Integer getBurst() {
        return this.burst;
    }

    /**
     * @return controlBehavior
     */
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return maxQueueingTimeMs
     */
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    /**
     * @return metricType
     */
    public Integer getMetricType() {
        return this.metricType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return paramItem
     */
    public String getParamItem() {
        return this.paramItem;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceMode
     */
    public Integer getResourceMode() {
        return this.resourceMode;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return statIntervalMs
     */
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<UpdateWebFlowRuleRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private Integer burst; 
        private Integer controlBehavior; 
        private Boolean enable; 
        private Integer maxQueueingTimeMs; 
        private Integer metricType; 
        private String namespace; 
        private String paramItem; 
        private String regionId; 
        private Integer resourceMode; 
        private Long ruleId; 
        private Integer statIntervalMs; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebFlowRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.burst = request.burst;
            this.controlBehavior = request.controlBehavior;
            this.enable = request.enable;
            this.maxQueueingTimeMs = request.maxQueueingTimeMs;
            this.metricType = request.metricType;
            this.namespace = request.namespace;
            this.paramItem = request.paramItem;
            this.regionId = request.regionId;
            this.resourceMode = request.resourceMode;
            this.ruleId = request.ruleId;
            this.statIntervalMs = request.statIntervalMs;
            this.threshold = request.threshold;
        } 

        /**
         * <p>The language in which you want the results to be displayed. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1****@c3df23522******</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The number of additional requests allowed for burst requests. The effect is equivalent to the maximum number of tokens for the token bucket algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder burst(Integer burst) {
            this.putQueryParameter("Burst", burst);
            this.burst = burst;
            return this;
        }

        /**
         * <p>The flow control method. Valid values:</p>
         * <ul>
         * <li><p>0: fast failure</p>
         * </li>
         * <li><p>2: wait in queue</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder controlBehavior(Integer controlBehavior) {
            this.putQueryParameter("ControlBehavior", controlBehavior);
            this.controlBehavior = controlBehavior;
            return this;
        }

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><p>true (enabled)</p>
         * </li>
         * <li><p>false (disabled)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The timeout period. Unit: milliseconds. This parameter is required if the ControlBehavior parameter is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.putQueryParameter("MaxQueueingTimeMs", maxQueueingTimeMs);
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }

        /**
         * <p>The threshold type. Valid values:</p>
         * <ul>
         * <li>1: number of requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder metricType(Integer metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The parameter description item, which is a JSON string containing the following key-value pairs:</p>
         * <ul>
         * <li><p>parseStrategy: the parameter property (0: client IP address. 1: remote host. 2: header. 3: URL parameter)</p>
         * </li>
         * <li><p>fieldName: the header name or URL parameter name. You must specify this key only if parseStrategy is set to 2 or 3</p>
         * </li>
         * <li><p>matchStrategy: the method to match the property value. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched. Valid values: 0 (exact match), 2 (regular expression match), and 3 (substring match)</p>
         * </li>
         * <li><p>pattern: the match string. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fieldName&quot;:&quot;key&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;value&quot;}</p>
         */
        public Builder paramItem(String paramItem) {
            this.putQueryParameter("ParamItem", paramItem);
            this.paramItem = paramItem;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource mode. Valid values:</p>
         * <ul>
         * <li>0: resource name mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder resourceMode(Integer resourceMode) {
            this.putQueryParameter("ResourceMode", resourceMode);
            this.resourceMode = resourceMode;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The length of the time window. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder statIntervalMs(Integer statIntervalMs) {
            this.putQueryParameter("StatIntervalMs", statIntervalMs);
            this.statIntervalMs = statIntervalMs;
            return this;
        }

        /**
         * <p>The threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public UpdateWebFlowRuleRequest build() {
            return new UpdateWebFlowRuleRequest(this);
        } 

    } 

}
