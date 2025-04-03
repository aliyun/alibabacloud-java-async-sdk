// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link RevertEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>RevertEvaluationResultsRequest</p>
 */
public class RevertEvaluationResultsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Resources> resources;

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
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<RevertEvaluationResultsRequest, Builder> {
        private String configRuleId; 
        private java.util.List<Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(RevertEvaluationResultsRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
            this.resources = request.resources;
        } 

        /**
         * <p>The rule ID.</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-7e72626622af0051****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The resources that are to be re-evaluated.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
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

    /**
     * 
     * {@link RevertEvaluationResultsRequest} extends {@link TeaModel}
     *
     * <p>RevertEvaluationResultsRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long resourceAccountId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Resources model) {
                this.region = model.region;
                this.resourceAccountId = model.resourceAccountId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The ID of the region in which the resource resides.</p>
             * <p>For more information about how to obtain the ID of the region in which a resource resides, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder resourceAccountId(Long resourceAccountId) {
                this.resourceAccountId = resourceAccountId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * <p>For more information about how to obtain the ID of a resource, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-hp3a3b4ztyfm2plgm****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>For more information about how to query the type of a resource, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::SLB::LoadBalancer</p>
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
