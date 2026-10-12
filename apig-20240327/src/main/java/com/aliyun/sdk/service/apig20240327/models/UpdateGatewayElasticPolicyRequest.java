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
 * {@link UpdateGatewayElasticPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayElasticPolicyRequest</p>
 */
public class UpdateGatewayElasticPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elasticPolicy")
    private ElasticPolicy elasticPolicy;

    private UpdateGatewayElasticPolicyRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.elasticPolicy = builder.elasticPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayElasticPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return elasticPolicy
     */
    public ElasticPolicy getElasticPolicy() {
        return this.elasticPolicy;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayElasticPolicyRequest, Builder> {
        private String gatewayId; 
        private ElasticPolicy elasticPolicy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayElasticPolicyRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.elasticPolicy = request.elasticPolicy;
        } 

        /**
         * <p>The gateway ID. This parameter is used for RAM authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The elastic policy object.</p>
         */
        public Builder elasticPolicy(ElasticPolicy elasticPolicy) {
            this.putBodyParameter("elasticPolicy", elasticPolicy);
            this.elasticPolicy = elasticPolicy;
            return this;
        }

        @Override
        public UpdateGatewayElasticPolicyRequest build() {
            return new UpdateGatewayElasticPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayElasticPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayElasticPolicyRequest</p>
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
     * {@link UpdateGatewayElasticPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayElasticPolicyRequest</p>
     */
    public static class TimePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("units")
        private Integer units;

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
        public Integer getUnits() {
            return this.units;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private Integer units; 

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
            public Builder units(Integer units) {
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
     * {@link UpdateGatewayElasticPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayElasticPolicyRequest</p>
     */
    public static class ElasticPolicy extends TeaModel {
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
            private Boolean elasticEnabled; 
            private String elasticType; 
            private java.util.List<EnableScaleTimePolicyList> enableScaleTimePolicyList; 
            private Boolean loadWarningThreshold; 
            private Integer maxUnits; 
            private java.util.List<TimePolicyList> timePolicyList; 

            private Builder() {
            } 

            private Builder(ElasticPolicy model) {
                this.elasticEnabled = model.elasticEnabled;
                this.elasticType = model.elasticType;
                this.enableScaleTimePolicyList = model.enableScaleTimePolicyList;
                this.loadWarningThreshold = model.loadWarningThreshold;
                this.maxUnits = model.maxUnits;
                this.timePolicyList = model.timePolicyList;
            } 

            /**
             * <p>Specifies whether to enable the elastic policy. A value of false indicates that the elastic policy is disabled. When the elastic policy is disabled, other fields are not validated and the system directly proceeds with the disabling process.</p>
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
             * <p>CronHPA</p>
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The time periods during which AutoHPA is allowed to scale out, specified by startTime and endTime.</p>
             */
            public Builder enableScaleTimePolicyList(java.util.List<EnableScaleTimePolicyList> enableScaleTimePolicyList) {
                this.enableScaleTimePolicyList = enableScaleTimePolicyList;
                return this;
            }

            /**
             * <p>Specifies whether to enable the AutoHPA load alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder loadWarningThreshold(Boolean loadWarningThreshold) {
                this.loadWarningThreshold = loadWarningThreshold;
                return this;
            }

            /**
             * <p>The maximum number of replicas. This parameter is required for AutoHPA.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxUnits(Integer maxUnits) {
                this.maxUnits = maxUnits;
                return this;
            }

            /**
             * <p>The list of scheduled policies.</p>
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
}
