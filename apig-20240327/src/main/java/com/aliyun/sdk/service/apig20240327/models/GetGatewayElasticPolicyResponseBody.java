// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetGatewayElasticPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayElasticPolicyResponseBody</p>
 */
public class GetGatewayElasticPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayElasticPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayElasticPolicyResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGatewayElasticPolicyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
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
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B7F02714-182D-55BC-AF0B-F454364445E4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayElasticPolicyResponseBody build() {
            return new GetGatewayElasticPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayElasticPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayElasticPolicyResponseBody</p>
     */
    public static class DisableScaleTimePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private DisableScaleTimePolicyList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisableScaleTimePolicyList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(DisableScaleTimePolicyList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The O&amp;M end time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The O&amp;M start time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public DisableScaleTimePolicyList build() {
                return new DisableScaleTimePolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayElasticPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayElasticPolicyResponseBody</p>
     */
    public static class EnableScaleTimePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private EnableScaleTimePolicyList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableScaleTimePolicyList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(EnableScaleTimePolicyList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The O&amp;M end time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The O&amp;M start time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public EnableScaleTimePolicyList build() {
                return new EnableScaleTimePolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayElasticPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayElasticPolicyResponseBody</p>
     */
    public static class TimePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("units")
        private Long units;

        private TimePolicyList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.units = builder.units;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimePolicyList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return units
         */
        public Long getUnits() {
            return this.units;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private Long units; 

            private Builder() {
            } 

            private Builder(TimePolicyList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.units = model.units;
            } 

            /**
             * <p>The O&amp;M end time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>06:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The O&amp;M start time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder units(Long units) {
                this.units = units;
                return this;
            }

            public TimePolicyList build() {
                return new TimePolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayElasticPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayElasticPolicyResponseBody</p>
     */
    public static class ElasticPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disableScaleTimePolicyList")
        private java.util.List<DisableScaleTimePolicyList> disableScaleTimePolicyList;

        @com.aliyun.core.annotation.NameInMap("elasticEnabled")
        private Boolean elasticEnabled;

        @com.aliyun.core.annotation.NameInMap("elasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("enableScaleTimePolicyList")
        private java.util.List<EnableScaleTimePolicyList> enableScaleTimePolicyList;

        @com.aliyun.core.annotation.NameInMap("loadWarningThreshold")
        private Boolean loadWarningThreshold;

        @com.aliyun.core.annotation.NameInMap("maxUnits")
        private Integer maxUnits;

        @com.aliyun.core.annotation.NameInMap("timePolicyList")
        private java.util.List<TimePolicyList> timePolicyList;

        private ElasticPolicy(Builder builder) {
            this.disableScaleTimePolicyList = builder.disableScaleTimePolicyList;
            this.elasticEnabled = builder.elasticEnabled;
            this.elasticType = builder.elasticType;
            this.enableScaleTimePolicyList = builder.enableScaleTimePolicyList;
            this.loadWarningThreshold = builder.loadWarningThreshold;
            this.maxUnits = builder.maxUnits;
            this.timePolicyList = builder.timePolicyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticPolicy create() {
            return builder().build();
        }

        /**
         * @return disableScaleTimePolicyList
         */
        public java.util.List<DisableScaleTimePolicyList> getDisableScaleTimePolicyList() {
            return this.disableScaleTimePolicyList;
        }

        /**
         * @return elasticEnabled
         */
        public Boolean getElasticEnabled() {
            return this.elasticEnabled;
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return enableScaleTimePolicyList
         */
        public java.util.List<EnableScaleTimePolicyList> getEnableScaleTimePolicyList() {
            return this.enableScaleTimePolicyList;
        }

        /**
         * @return loadWarningThreshold
         */
        public Boolean getLoadWarningThreshold() {
            return this.loadWarningThreshold;
        }

        /**
         * @return maxUnits
         */
        public Integer getMaxUnits() {
            return this.maxUnits;
        }

        /**
         * @return timePolicyList
         */
        public java.util.List<TimePolicyList> getTimePolicyList() {
            return this.timePolicyList;
        }

        public static final class Builder {
            private java.util.List<DisableScaleTimePolicyList> disableScaleTimePolicyList; 
            private Boolean elasticEnabled; 
            private String elasticType; 
            private java.util.List<EnableScaleTimePolicyList> enableScaleTimePolicyList; 
            private Boolean loadWarningThreshold; 
            private Integer maxUnits; 
            private java.util.List<TimePolicyList> timePolicyList; 

            private Builder() {
            } 

            private Builder(ElasticPolicy model) {
                this.disableScaleTimePolicyList = model.disableScaleTimePolicyList;
                this.elasticEnabled = model.elasticEnabled;
                this.elasticType = model.elasticType;
                this.enableScaleTimePolicyList = model.enableScaleTimePolicyList;
                this.loadWarningThreshold = model.loadWarningThreshold;
                this.maxUnits = model.maxUnits;
                this.timePolicyList = model.timePolicyList;
            } 

            /**
             * <p>The time periods during which AutoHPA scale-out is prohibited.</p>
             */
            public Builder disableScaleTimePolicyList(java.util.List<DisableScaleTimePolicyList> disableScaleTimePolicyList) {
                this.disableScaleTimePolicyList = disableScaleTimePolicyList;
                return this;
            }

            /**
             * <p>Indicates whether elastic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder elasticEnabled(Boolean elasticEnabled) {
                this.elasticEnabled = elasticEnabled;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>AutoHPA</p>
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The time periods during which AutoHPA scale-out is allowed.</p>
             */
            public Builder enableScaleTimePolicyList(java.util.List<EnableScaleTimePolicyList> enableScaleTimePolicyList) {
                this.enableScaleTimePolicyList = enableScaleTimePolicyList;
                return this;
            }

            /**
             * <p>The load alert threshold switch for AutoHPA.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder loadWarningThreshold(Boolean loadWarningThreshold) {
                this.loadWarningThreshold = loadWarningThreshold;
                return this;
            }

            /**
             * <p>The maximum number of replicas for AutoHPA.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxUnits(Integer maxUnits) {
                this.maxUnits = maxUnits;
                return this;
            }

            /**
             * <p>The list of CronHPA scheduled policies. Each entry includes units (number of replicas), startTime, and endTime.</p>
             */
            public Builder timePolicyList(java.util.List<TimePolicyList> timePolicyList) {
                this.timePolicyList = timePolicyList;
                return this;
            }

            public ElasticPolicy build() {
                return new ElasticPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayElasticPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayElasticPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticPolicy")
        private ElasticPolicy elasticPolicy;

        @com.aliyun.core.annotation.NameInMap("elasticStrategyId")
        private String elasticStrategyId;

        @com.aliyun.core.annotation.NameInMap("elasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        private Data(Builder builder) {
            this.elasticPolicy = builder.elasticPolicy;
            this.elasticStrategyId = builder.elasticStrategyId;
            this.elasticType = builder.elasticType;
            this.gatewayId = builder.gatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return elasticPolicy
         */
        public ElasticPolicy getElasticPolicy() {
            return this.elasticPolicy;
        }

        /**
         * @return elasticStrategyId
         */
        public String getElasticStrategyId() {
            return this.elasticStrategyId;
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        public static final class Builder {
            private ElasticPolicy elasticPolicy; 
            private String elasticStrategyId; 
            private String elasticType; 
            private String gatewayId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.elasticPolicy = model.elasticPolicy;
                this.elasticStrategyId = model.elasticStrategyId;
                this.elasticType = model.elasticType;
                this.gatewayId = model.gatewayId;
            } 

            /**
             * <p>The elastic policy configuration, deserialized from the elastic_config JSON field in the database.</p>
             */
            public Builder elasticPolicy(ElasticPolicy elasticPolicy) {
                this.elasticPolicy = elasticPolicy;
                return this;
            }

            /**
             * <p>The KubeOne AutoScaleStrategy instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder elasticStrategyId(String elasticStrategyId) {
                this.elasticStrategyId = elasticStrategyId;
                return this;
            }

            /**
             * <p>The elastic policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>CronHPA</p>
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
