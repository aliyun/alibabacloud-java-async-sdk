// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link PutMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutMetricRuleTargetsRequest</p>
 */
public class PutMetricRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    private PutMetricRuleTargetsRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<PutMetricRuleTargetsRequest, Builder> {
        private Boolean dryRun; 
        private String ruleId; 
        private java.util.List<Targets> targets; 

        private Builder() {
            super();
        } 

        private Builder(PutMetricRuleTargetsRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.ruleId = request.ruleId;
            this.targets = request.targets;
        } 

        /**
         * <p>Specifies whether to perform a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ae06917_75a8c43178ab66****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>None.</p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public PutMetricRuleTargetsRequest build() {
            return new PutMetricRuleTargetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutMetricRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutMetricRuleTargetsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Targets model) {
                this.arn = model.arn;
                this.id = model.id;
                this.jsonParams = model.jsonParams;
                this.level = model.level;
            } 

            /**
             * <p>The ARN of the resource. Simple Message Queue (formerly MNS), Auto Scaling (ESS), Simple Log Service (SLS), and Function Compute (FC) are supported.</p>
             * <p>The ARN parameters for Simple Message Queue (formerly MNS) are as follows:</p>
             * <p><code>acs:mns:{regionId}:{userId}:/{resource type}/{resource name}/message</code>.</p>
             * <ul>
             * <li><p>{regionId}: the region where the Simple Message Queue (formerly MNS) queue or topic resides.</p>
             * </li>
             * <li><p>{userId}: the Alibaba Cloud account to which the resource belongs.</p>
             * </li>
             * <li><p>{resource type}: the type of the resource that accepts alerts. Valid values:</p>
             * <ul>
             * <li><strong>queues</strong>: queue</li>
             * <li><strong>topics</strong>: topic</li>
             * </ul>
             * </li>
             * <li><p>{resource name}: the name of the resource.</p>
             * <ul>
             * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
             * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
             * </ul>
             * </li>
             * </ul>
             * <p>The ARN for Auto Scaling:</p>
             * <p>acs:ess:{regionId}:{userId}:scalingGroupId/{scaling group ID}:scalingRuleId/{scaling rule ID}</p>
             * <p>The ARN for Simple Log Service:</p>
             * <p>acs:log:{regionId}:{userId}:project/{project name}/logstore/{Logstore name}</p>
             * <p>The ARN for Function Compute:</p>
             * <p>acs:fc:{regionId}:{userId}:services/{service name}/functions/{function name}</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the alert trigger target.</p>
             * <p>For more information about how to obtain the ID of an alert trigger target, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-formatted parameters for the alert callback.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>INFO: information</li>
             * <li>WARN: warning</li>
             * <li>CRITICAL: critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
