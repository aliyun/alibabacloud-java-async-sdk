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
 * {@link CreateWebFlowRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWebFlowRuleResponseBody</p>
 */
public class CreateWebFlowRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateWebFlowRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebFlowRuleResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateWebFlowRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A73AC37C-C617-4E3A-8049-372CF49C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The request was successful.</p>
         * </li>
         * <li><p><code>false</code>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateWebFlowRuleResponseBody build() {
            return new CreateWebFlowRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWebFlowRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWebFlowRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Burst")
        private Integer burst;

        @com.aliyun.core.annotation.NameInMap("ControlBehavior")
        private Integer controlBehavior;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MaxQueueingTimeMs")
        private Integer maxQueueingTimeMs;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private Integer metricType;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ParamItem")
        private String paramItem;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReourceMode")
        private Integer reourceMode;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("StatIntervalMs")
        private Integer statIntervalMs;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.burst = builder.burst;
            this.controlBehavior = builder.controlBehavior;
            this.enable = builder.enable;
            this.id = builder.id;
            this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
            this.metricType = builder.metricType;
            this.namespace = builder.namespace;
            this.paramItem = builder.paramItem;
            this.regionId = builder.regionId;
            this.reourceMode = builder.reourceMode;
            this.resource = builder.resource;
            this.statIntervalMs = builder.statIntervalMs;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return reourceMode
         */
        public Integer getReourceMode() {
            return this.reourceMode;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
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

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Integer burst; 
            private Integer controlBehavior; 
            private Boolean enable; 
            private Long id; 
            private Integer maxQueueingTimeMs; 
            private Integer metricType; 
            private String namespace; 
            private String paramItem; 
            private String regionId; 
            private Integer reourceMode; 
            private String resource; 
            private Integer statIntervalMs; 
            private Float threshold; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.burst = model.burst;
                this.controlBehavior = model.controlBehavior;
                this.enable = model.enable;
                this.id = model.id;
                this.maxQueueingTimeMs = model.maxQueueingTimeMs;
                this.metricType = model.metricType;
                this.namespace = model.namespace;
                this.paramItem = model.paramItem;
                this.regionId = model.regionId;
                this.reourceMode = model.reourceMode;
                this.resource = model.resource;
                this.statIntervalMs = model.statIntervalMs;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1****@c3df23522******</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-cloud-a</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of additional requests allowed for burst requests. The effect is equivalent to the maximum number of tokens of the token bucket algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder burst(Integer burst) {
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
                this.controlBehavior = controlBehavior;
                return this;
            }

            /**
             * <p>The rule status. Valid values:</p>
             * <ul>
             * <li><p>true: enabled</p>
             * </li>
             * <li><p>false: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The timeout period for queuing when the ControlBehavior parameter is set to 2. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
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
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The parameter description, which is a JSON string containing the following key-value pairs:</p>
             * <ul>
             * <li><p>parseStrategy: the parameter property (0: client IP address, 1: remote host, 2: header, 3: URL parameter)</p>
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
             * <p>{&quot;fieldName&quot;:&quot;testKey&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;testValue&quot;}</p>
             */
            public Builder paramItem(String paramItem) {
                this.paramItem = paramItem;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource mode</p>
             * <p>0: resource name mode</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reourceMode(Integer reourceMode) {
                this.reourceMode = reourceMode;
                return this;
            }

            /**
             * <p>Interface name: the application resources to which the rule applies. The interface name must be the same as that displayed on the API details page in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>/flow</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The length of the time window. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder statIntervalMs(Integer statIntervalMs) {
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
                this.threshold = threshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
