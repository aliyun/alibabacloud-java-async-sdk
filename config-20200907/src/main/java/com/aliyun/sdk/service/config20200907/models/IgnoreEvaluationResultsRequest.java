// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreEvaluationResultsRequest</p>
 */
public class IgnoreEvaluationResultsRequest extends Request {
    @Body
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    @Body
    @NameInMap("IgnoreDate")
    private String ignoreDate;

    @Body
    @NameInMap("Reason")
    private String reason;

    @Body
    @NameInMap("Resources")
    @Validation(required = true)
    private java.util.List < Resources> resources;

    private IgnoreEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
        this.ignoreDate = builder.ignoreDate;
        this.reason = builder.reason;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreEvaluationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return ignoreDate
     */
    public String getIgnoreDate() {
        return this.ignoreDate;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<IgnoreEvaluationResultsRequest, Builder> {
        private String configRuleId; 
        private String ignoreDate; 
        private String reason; 
        private java.util.List < Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreEvaluationResultsRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
            this.ignoreDate = request.ignoreDate;
            this.reason = request.reason;
            this.resources = request.resources;
        } 

        /**
         * The ID of the rule.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The date from which the system automatically re-evaluates the ignored incompliant resources.
         * <p>
         * 
         * >  If you leave this parameter empty, the system does not automatically re-evaluate the ignored incompliant resources. You must manually re-evaluate the ignored incompliant resources.
         */
        public Builder ignoreDate(String ignoreDate) {
            this.putBodyParameter("IgnoreDate", ignoreDate);
            this.ignoreDate = ignoreDate;
            return this;
        }

        /**
         * The reason why you want to ignore the resource.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The resources to be ignored.
         */
        public Builder resources(java.util.List < Resources> resources) {
            String resourcesShrink = shrink(resources, "Resources", "json");
            this.putBodyParameter("Resources", resourcesShrink);
            this.resources = resources;
            return this;
        }

        @Override
        public IgnoreEvaluationResultsRequest build() {
            return new IgnoreEvaluationResultsRequest(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        @NameInMap("ResourceAccountId")
        @Validation(required = true)
        private Long resourceAccountId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        private String resourceType;

        private Resources(Builder builder) {
            this.region = builder.region;
            this.resourceAccountId = builder.resourceAccountId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceAccountId
         */
        public Long getResourceAccountId() {
            return this.resourceAccountId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String region; 
            private Long resourceAccountId; 
            private String resourceId; 
            private String resourceType; 

            /**
             * The ID of the region in which the resource resides.
             * <p>
             * 
             * For more information about how to obtain the ID of the region in which a resource resides, see [ListDiscoveredResources](~~169620~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the resources belong.
             */
            public Builder resourceAccountId(Long resourceAccountId) {
                this.resourceAccountId = resourceAccountId;
                return this;
            }

            /**
             * The ID of the resource.
             * <p>
             * 
             * For more information about how to obtain the ID of a resource, see [ListDiscoveredResources](~~169620~~).
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
             * <p>
             * 
             * For more information about how to obtain the type of a resource, see [ListDiscoveredResources](~~169620~~).
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
