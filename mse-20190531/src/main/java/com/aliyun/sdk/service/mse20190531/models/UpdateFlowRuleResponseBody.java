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
 * {@link UpdateFlowRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFlowRuleResponseBody</p>
 */
public class UpdateFlowRuleResponseBody extends TeaModel {
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

    private UpdateFlowRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowRuleResponseBody create() {
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

        private Builder(UpdateFlowRuleResponseBody model) {
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
         * <p>The data of the node.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52BA6DA6-A702-4362-A32F-DFF79655****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>The request was successful.</p>
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>The request failed.</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateFlowRuleResponseBody build() {
            return new UpdateFlowRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFlowRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateFlowRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ControlBehavior")
        private Integer controlBehavior;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LimitApp")
        private String limitApp;

        @com.aliyun.core.annotation.NameInMap("MaxQueueingTimeMs")
        private Integer maxQueueingTimeMs;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.controlBehavior = builder.controlBehavior;
            this.enable = builder.enable;
            this.id = builder.id;
            this.limitApp = builder.limitApp;
            this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
            this.namespace = builder.namespace;
            this.resource = builder.resource;
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
         * @return limitApp
         */
        public String getLimitApp() {
            return this.limitApp;
        }

        /**
         * @return maxQueueingTimeMs
         */
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
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
            private Integer controlBehavior; 
            private Boolean enable; 
            private Long id; 
            private String limitApp; 
            private Integer maxQueueingTimeMs; 
            private String namespace; 
            private String resource; 
            private Float threshold; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.controlBehavior = model.controlBehavior;
                this.enable = model.enable;
                this.id = model.id;
                this.limitApp = model.limitApp;
                this.maxQueueingTimeMs = model.maxQueueingTimeMs;
                this.namespace = model.namespace;
                this.resource = model.resource;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hpn9ac29kz@e31a4b871******</p>
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
             * <p>The throttling effect.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>0</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>fast failure</p>
             * <!-- -->
             * </li>
             * <li><p>2</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>in queue</p>
             * <!-- --></li>
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
             * <p>Indicates whether the rule was enabled.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
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
             * <p>12</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LimitApp.
             */
            public Builder limitApp(String limitApp) {
                this.limitApp = limitApp;
                return this;
            }

            /**
             * <p>The timeout period for queuing when the value of ControlBehavior is set to 2. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
                this.maxQueueingTimeMs = maxQueueingTimeMs;
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
             * <p>The name of the API resource.</p>
             * 
             * <strong>example:</strong>
             * <p>/c</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The throttling threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
