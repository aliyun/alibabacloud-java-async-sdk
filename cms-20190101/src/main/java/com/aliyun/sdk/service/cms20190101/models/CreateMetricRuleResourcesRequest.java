// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMetricRuleResourcesRequest} extends {@link RequestModel}
 *
 * <p>CreateMetricRuleResourcesRequest</p>
 */
public class CreateMetricRuleResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private String overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    private CreateMetricRuleResourcesRequest(Builder builder) {
        super(builder);
        this.overwrite = builder.overwrite;
        this.resources = builder.resources;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricRuleResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return overwrite
     */
    public String getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<CreateMetricRuleResourcesRequest, Builder> {
        private String overwrite; 
        private String resources; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetricRuleResourcesRequest request) {
            super(request);
            this.overwrite = request.overwrite;
            this.resources = request.resources;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>Specifies whether to overwrite existing resources. Valid values:</p>
         * <ul>
         * <li>true: The resources submitted this time overwrite the previously associated resources.</li>
         * <li>false: The resources submitted this time do not overwrite the previously associated resources. The associated resources after submission include the previously associated resources and the resources submitted this time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder overwrite(String overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>The resources that are associated with the alert rule. Set the value to a JSON array.</p>
         * <blockquote>
         * <p> You can add up to 100 resources each time. An alert rule can be associated with up to 3,000 resources.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-a2d5q7pm3f9yr29e****&quot;}]</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze3w55tr2rcpejpcfap_59c96b85-0339-4f35-ba66-ae4e34d3****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public CreateMetricRuleResourcesRequest build() {
            return new CreateMetricRuleResourcesRequest(this);
        } 

    } 

}
