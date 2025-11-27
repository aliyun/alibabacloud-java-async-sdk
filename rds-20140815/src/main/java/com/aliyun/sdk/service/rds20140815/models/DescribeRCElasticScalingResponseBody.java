// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCElasticScalingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCElasticScalingResponseBody</p>
 */
public class DescribeRCElasticScalingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcuType")
    private String acuType;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingEnabled")
    private Boolean scalingEnabled;

    @com.aliyun.core.annotation.NameInMap("ScalingSupported")
    private Boolean scalingSupported;

    @com.aliyun.core.annotation.NameInMap("ScheduledRule")
    private String scheduledRule;

    @com.aliyun.core.annotation.NameInMap("ScheduledRuleTemplates")
    private ScheduledRuleTemplates scheduledRuleTemplates;

    @com.aliyun.core.annotation.NameInMap("TargetInstanceType")
    private String targetInstanceType;

    private DescribeRCElasticScalingResponseBody(Builder builder) {
        this.acuType = builder.acuType;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.scalingEnabled = builder.scalingEnabled;
        this.scalingSupported = builder.scalingSupported;
        this.scheduledRule = builder.scheduledRule;
        this.scheduledRuleTemplates = builder.scheduledRuleTemplates;
        this.targetInstanceType = builder.targetInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCElasticScalingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acuType
     */
    public String getAcuType() {
        return this.acuType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingEnabled
     */
    public Boolean getScalingEnabled() {
        return this.scalingEnabled;
    }

    /**
     * @return scalingSupported
     */
    public Boolean getScalingSupported() {
        return this.scalingSupported;
    }

    /**
     * @return scheduledRule
     */
    public String getScheduledRule() {
        return this.scheduledRule;
    }

    /**
     * @return scheduledRuleTemplates
     */
    public ScheduledRuleTemplates getScheduledRuleTemplates() {
        return this.scheduledRuleTemplates;
    }

    /**
     * @return targetInstanceType
     */
    public String getTargetInstanceType() {
        return this.targetInstanceType;
    }

    public static final class Builder {
        private String acuType; 
        private String instanceId; 
        private String requestId; 
        private Boolean scalingEnabled; 
        private Boolean scalingSupported; 
        private String scheduledRule; 
        private ScheduledRuleTemplates scheduledRuleTemplates; 
        private String targetInstanceType; 

        private Builder() {
        } 

        private Builder(DescribeRCElasticScalingResponseBody model) {
            this.acuType = model.acuType;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.scalingEnabled = model.scalingEnabled;
            this.scalingSupported = model.scalingSupported;
            this.scheduledRule = model.scheduledRule;
            this.scheduledRuleTemplates = model.scheduledRuleTemplates;
            this.targetInstanceType = model.targetInstanceType;
        } 

        /**
         * AcuType.
         */
        public Builder acuType(String acuType) {
            this.acuType = acuType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * ScalingEnabled.
         */
        public Builder scalingEnabled(Boolean scalingEnabled) {
            this.scalingEnabled = scalingEnabled;
            return this;
        }

        /**
         * ScalingSupported.
         */
        public Builder scalingSupported(Boolean scalingSupported) {
            this.scalingSupported = scalingSupported;
            return this;
        }

        /**
         * ScheduledRule.
         */
        public Builder scheduledRule(String scheduledRule) {
            this.scheduledRule = scheduledRule;
            return this;
        }

        /**
         * ScheduledRuleTemplates.
         */
        public Builder scheduledRuleTemplates(ScheduledRuleTemplates scheduledRuleTemplates) {
            this.scheduledRuleTemplates = scheduledRuleTemplates;
            return this;
        }

        /**
         * TargetInstanceType.
         */
        public Builder targetInstanceType(String targetInstanceType) {
            this.targetInstanceType = targetInstanceType;
            return this;
        }

        public DescribeRCElasticScalingResponseBody build() {
            return new DescribeRCElasticScalingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCElasticScalingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCElasticScalingResponseBody</p>
     */
    public static class ScheduledRuleTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<String> items;

        private ScheduledRuleTemplates(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledRuleTemplates create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<String> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<String> items; 

            private Builder() {
            } 

            private Builder(ScheduledRuleTemplates model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            public ScheduledRuleTemplates build() {
                return new ScheduledRuleTemplates(this);
            } 

        } 

    }
}
