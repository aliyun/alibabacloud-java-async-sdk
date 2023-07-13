// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricRuleResourcesRequest} extends {@link RequestModel}
 *
 * <p>CreateMetricRuleResourcesRequest</p>
 */
public class CreateMetricRuleResourcesRequest extends Request {
    @Query
    @NameInMap("Overwrite")
    private String overwrite;

    @Query
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    @Query
    @NameInMap("RuleId")
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
         * The resources to be associated with the alert rule. The value is a JSON array.
         * <p>
         * 
         * >  You can add up to 100 resources each time. An alert rule can be associated with up to 3,000 resources.
         */
        public Builder overwrite(String overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * Specifies whether to overwrite the existing data. Valid values:
         * <p>
         * 
         * *   true: The resources submitted this time will overwrite the previous associated resources.
         * *   false: The resources submitted this time will not overwrite the previous associated resources. The associated resources after submission include the previous associated resources and the resources submitted this time.
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
