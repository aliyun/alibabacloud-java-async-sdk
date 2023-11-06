// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevertEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>RevertEvaluationResultsRequest</p>
 */
public class RevertEvaluationResultsRequest extends Request {
    @Body
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    @Body
    @NameInMap("Resources")
    @Validation(required = true)
    private java.util.List < Resources> resources;

    private RevertEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevertEvaluationResultsRequest create() {
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
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<RevertEvaluationResultsRequest, Builder> {
        private String configRuleId; 
        private java.util.List < Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(RevertEvaluationResultsRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
            this.resources = request.resources;
        } 

        /**
         * The rule ID.
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
         * The resources that are to be re-evaluated.
         */
        public Builder resources(java.util.List < Resources> resources) {
            String resourcesShrink = shrink(resources, "Resources", "json");
            this.putBodyParameter("Resources", resourcesShrink);
            this.resources = resources;
            return this;
        }

        @Override
        public RevertEvaluationResultsRequest build() {
            return new RevertEvaluationResultsRequest(this);
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
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder resourceAccountId(Long resourceAccountId) {
                this.resourceAccountId = resourceAccountId;
                return this;
            }

            /**
             * The resource ID.
             * <p>
             * 
             * For more information about how to obtain the ID of a resource, see [ListDiscoveredResources](~~169620~~).
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The resource type.
             * <p>
             * 
             * For more information about how to query the type of a resource, see [ListDiscoveredResources](~~169620~~).
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
