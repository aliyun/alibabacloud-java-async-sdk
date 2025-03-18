// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link CreateEventRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateEventRuleRequest</p>
 */
public class CreateEventRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> eventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.List<EventMatchRule>> matchRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private CreateEventRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpoints = builder.endpoints;
        this.eventTypes = builder.eventTypes;
        this.matchRules = builder.matchRules;
        this.productName = builder.productName;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return eventTypes
     */
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return matchRules
     */
    public java.util.List<java.util.List<EventMatchRule>> getMatchRules() {
        return this.matchRules;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<CreateEventRuleRequest, Builder> {
        private String regionId; 
        private java.util.List<Endpoints> endpoints; 
        private java.util.List<String> eventTypes; 
        private java.util.List<java.util.List<EventMatchRule>> matchRules; 
        private String productName; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpoints = request.endpoints;
            this.eventTypes = request.eventTypes;
            this.matchRules = request.matchRules;
            this.productName = request.productName;
            this.ruleName = request.ruleName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            String endpointsShrink = shrink(endpoints, "Endpoints", "json");
            this.putQueryParameter("Endpoints", endpointsShrink);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eventTypes(java.util.List<String> eventTypes) {
            String eventTypesShrink = shrink(eventTypes, "EventTypes", "json");
            this.putQueryParameter("EventTypes", eventTypesShrink);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder matchRules(java.util.List<java.util.List<EventMatchRule>> matchRules) {
            String matchRulesShrink = shrink(matchRules, "MatchRules", "json");
            this.putQueryParameter("MatchRules", matchRulesShrink);
            this.matchRules = matchRules;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-xsXDW</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public CreateEventRuleRequest build() {
            return new CreateEventRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEventRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateEventRuleRequest</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("EndpointValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpointValue;

        private Endpoints(Builder builder) {
            this.endpointType = builder.endpointType;
            this.endpointValue = builder.endpointValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointValue
         */
        public String getEndpointValue() {
            return this.endpointValue;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointValue; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.endpointType = model.endpointType;
                this.endpointValue = model.endpointValue;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-xxx-queue</p>
             */
            public Builder endpointValue(String endpointValue) {
                this.endpointValue = endpointValue;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
