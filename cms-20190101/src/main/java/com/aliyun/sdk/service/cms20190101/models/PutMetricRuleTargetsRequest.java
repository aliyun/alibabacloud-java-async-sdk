// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutMetricRuleTargetsRequest</p>
 */
public class PutMetricRuleTargetsRequest extends Request {
    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("Targets")
    @Validation(required = true)
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
         * The list of resources that failed to be created or modified.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Targets.
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
        @NameInMap("Arn")
        @Validation(required = true)
        private String arn;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("JsonParams")
        private String jsonParams;

        @NameInMap("Level")
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
             * The ARN of the resource.
             * <p>
             * 
             * Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:
             * 
             * *   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.
             * *   {userId}: the ID of the Alibaba Cloud account.
             * *   {regionId}: the region ID of the message queue or topic.
             * *   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the resource for which alerts are triggered.
             * <p>
             * 
             * For information about how to obtain the ID of a resource for which alerts are triggered, see [DescribeMetricRuleTargets](~~121592~~).
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the resource for which alerts are triggered.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
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
