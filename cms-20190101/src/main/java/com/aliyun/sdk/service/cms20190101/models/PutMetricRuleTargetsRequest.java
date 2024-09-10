// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutMetricRuleTargetsRequest</p>
 */
public class PutMetricRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Targets> targets;

    private PutMetricRuleTargetsRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMetricRuleTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return targets
     */
    public java.util.List < Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<PutMetricRuleTargetsRequest, Builder> {
        private String ruleId; 
        private java.util.List < Targets> targets; 

        private Builder() {
            super();
        } 

        private Builder(PutMetricRuleTargetsRequest request) {
            super(request);
            this.ruleId = request.ruleId;
            this.targets = request.targets;
        } 

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * N/A.
         */
        public Builder targets(java.util.List < Targets> targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public PutMetricRuleTargetsRequest build() {
            return new PutMetricRuleTargetsRequest(this);
        } 

    } 

    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParams")
        private String jsonParams;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Targets(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParams = builder.jsonParams;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jsonParams
         */
        public String getJsonParams() {
            return this.jsonParams;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String arn; 
            private String id; 
            private String jsonParams; 
            private String level; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the resource. Message Service (MNS), Auto Scaling, Simple Log Service, and Function Compute are supported.
             * <p>
             * 
             * The following part describes the ARN of MNS and the parameters provided by the ARN:
             * 
             * `acs:mns:{regionId}:{userId}:/{Resource type}/{Resource name}/message`.
             * 
             * *   {regionId}: the region ID of the message queue or topic.
             * 
             * *   {userId}: the ID of the Alibaba Cloud account that owns the resource.
             * 
             * *   {Resource type}: the type of the resource for which alerts are triggered. Valid values:
             * 
             *     *   **queues**
             *     *   **topics**
             * 
             * *   {Resource name}: the resource name.
             * 
             *     *   If the resource type is **queues**, the resource name is the queue name.
             *     *   If the resource type is **topics**, the resource name is the topic name.
             * 
             * ARN of Auto Scaling:
             * 
             * acs:ess:{regionId}:{userId}:scalingGroupId/{Scaling group ID}:scalingRuleId/{Scaling rule ID}
             * 
             * ARN of Simple Log Service:
             * 
             * acs:log:{regionId}:{userId}:project/{Project name}/logstore/{Logstore name}
             * 
             * ARN of Function Compute:
             * 
             * acs:fc:{regionId}:{userId}:services/{Service name}/functions/{Function name}
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the resource for which alerts are triggered.
             * <p>
             * 
             * For more information about how to obtain the ID of the resource for which alerts are triggered, see [DescribeMetricRuleTargets](~~121592~~).
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The JSON-formatted parameters of the alert callback.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   INFO
             * *   WARN
             * *   CRITICAL
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
