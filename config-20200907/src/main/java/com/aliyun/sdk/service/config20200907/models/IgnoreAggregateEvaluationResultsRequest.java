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
 * {@link IgnoreAggregateEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreAggregateEvaluationResultsRequest</p>
 */
public class IgnoreAggregateEvaluationResultsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreDate")
    private String ignoreDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Resources> resources;

    private IgnoreAggregateEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleId = builder.configRuleId;
        this.ignoreDate = builder.ignoreDate;
        this.reason = builder.reason;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreAggregateEvaluationResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
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
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<IgnoreAggregateEvaluationResultsRequest, Builder> {
        private String aggregatorId; 
        private String configRuleId; 
        private String ignoreDate; 
        private String reason; 
        private java.util.List<Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreAggregateEvaluationResultsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleId = request.configRuleId;
            this.ignoreDate = request.ignoreDate;
            this.reason = request.reason;
            this.resources = request.resources;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-5b6c626622af008f****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
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
         * <p>The date from which the system automatically re-evaluates the ignored incompliant resources.</p>
         * <blockquote>
         * <p> If you leave this parameter empty, the system does not automatically re-evaluate the ignored incompliant resources. You must manually re-evaluate the ignored incompliant resources.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-06-01</p>
         */
        public Builder ignoreDate(String ignoreDate) {
            this.putBodyParameter("IgnoreDate", ignoreDate);
            this.ignoreDate = ignoreDate;
            return this;
        }

        /**
         * <p>The reason why you ignore the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>The reason why you ignore the resource.</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The resources to be ignored.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            String resourcesShrink = shrink(resources, "Resources", "json");
            this.putBodyParameter("Resources", resourcesShrink);
            this.resources = resources;
            return this;
        }

        @Override
        public IgnoreAggregateEvaluationResultsRequest build() {
            return new IgnoreAggregateEvaluationResultsRequest(this);
        } 

    } 

    /**
     * 
     * {@link IgnoreAggregateEvaluationResultsRequest} extends {@link TeaModel}
     *
     * <p>IgnoreAggregateEvaluationResultsRequest</p>
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
             * <p>For more information about how to obtain the ID of a region, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
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
             * <p>The ID of the Alibaba Cloud account to which the resources belong.</p>
             * <blockquote>
             * <p> You must specify the ID of the current management account or a member account in the account group of the management account.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder resourceAccountId(Long resourceAccountId) {
                this.resourceAccountId = resourceAccountId;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * <p>For more information about how to query the ID of a resource, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
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
             * <p>The type of the resource.</p>
             * <p>For more information about how to query the type of a resource, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
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
