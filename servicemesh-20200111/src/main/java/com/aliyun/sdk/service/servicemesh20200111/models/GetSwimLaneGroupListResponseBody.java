// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link GetSwimLaneGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwimLaneGroupListResponseBody</p>
 */
public class GetSwimLaneGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SwimLaneGroupList")
    private java.util.List<SwimLaneGroupList> swimLaneGroupList;

    private GetSwimLaneGroupListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.swimLaneGroupList = builder.swimLaneGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwimLaneGroupListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return swimLaneGroupList
     */
    public java.util.List<SwimLaneGroupList> getSwimLaneGroupList() {
        return this.swimLaneGroupList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SwimLaneGroupList> swimLaneGroupList; 

        private Builder() {
        } 

        private Builder(GetSwimLaneGroupListResponseBody model) {
            this.requestId = model.requestId;
            this.swimLaneGroupList = model.swimLaneGroupList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yyyy</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the lane group.</p>
         */
        public Builder swimLaneGroupList(java.util.List<SwimLaneGroupList> swimLaneGroupList) {
            this.swimLaneGroupList = swimLaneGroupList;
            return this;
        }

        public GetSwimLaneGroupListResponseBody build() {
            return new GetSwimLaneGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSwimLaneGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSwimLaneGroupListResponseBody</p>
     */
    public static class SwimLaneGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FallbackTarget")
        private String fallbackTarget;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IngressGatewayName")
        private String ingressGatewayName;

        @com.aliyun.core.annotation.NameInMap("IngressRoutingStrategy")
        private String ingressRoutingStrategy;

        @com.aliyun.core.annotation.NameInMap("IngressType")
        private String ingressType;

        @com.aliyun.core.annotation.NameInMap("IsPermissive")
        private Boolean isPermissive;

        @com.aliyun.core.annotation.NameInMap("RouteHeader")
        private String routeHeader;

        @com.aliyun.core.annotation.NameInMap("ServiceLevelFallbackTarget")
        private String serviceLevelFallbackTarget;

        @com.aliyun.core.annotation.NameInMap("ServiceList")
        private String serviceList;

        @com.aliyun.core.annotation.NameInMap("SwimLaneLabels")
        private String swimLaneLabels;

        @com.aliyun.core.annotation.NameInMap("TraceHeader")
        private String traceHeader;

        @com.aliyun.core.annotation.NameInMap("WeightedIngressRule")
        private String weightedIngressRule;

        private SwimLaneGroupList(Builder builder) {
            this.fallbackTarget = builder.fallbackTarget;
            this.groupName = builder.groupName;
            this.ingressGatewayName = builder.ingressGatewayName;
            this.ingressRoutingStrategy = builder.ingressRoutingStrategy;
            this.ingressType = builder.ingressType;
            this.isPermissive = builder.isPermissive;
            this.routeHeader = builder.routeHeader;
            this.serviceLevelFallbackTarget = builder.serviceLevelFallbackTarget;
            this.serviceList = builder.serviceList;
            this.swimLaneLabels = builder.swimLaneLabels;
            this.traceHeader = builder.traceHeader;
            this.weightedIngressRule = builder.weightedIngressRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwimLaneGroupList create() {
            return builder().build();
        }

        /**
         * @return fallbackTarget
         */
        public String getFallbackTarget() {
            return this.fallbackTarget;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ingressGatewayName
         */
        public String getIngressGatewayName() {
            return this.ingressGatewayName;
        }

        /**
         * @return ingressRoutingStrategy
         */
        public String getIngressRoutingStrategy() {
            return this.ingressRoutingStrategy;
        }

        /**
         * @return ingressType
         */
        public String getIngressType() {
            return this.ingressType;
        }

        /**
         * @return isPermissive
         */
        public Boolean getIsPermissive() {
            return this.isPermissive;
        }

        /**
         * @return routeHeader
         */
        public String getRouteHeader() {
            return this.routeHeader;
        }

        /**
         * @return serviceLevelFallbackTarget
         */
        public String getServiceLevelFallbackTarget() {
            return this.serviceLevelFallbackTarget;
        }

        /**
         * @return serviceList
         */
        public String getServiceList() {
            return this.serviceList;
        }

        /**
         * @return swimLaneLabels
         */
        public String getSwimLaneLabels() {
            return this.swimLaneLabels;
        }

        /**
         * @return traceHeader
         */
        public String getTraceHeader() {
            return this.traceHeader;
        }

        /**
         * @return weightedIngressRule
         */
        public String getWeightedIngressRule() {
            return this.weightedIngressRule;
        }

        public static final class Builder {
            private String fallbackTarget; 
            private String groupName; 
            private String ingressGatewayName; 
            private String ingressRoutingStrategy; 
            private String ingressType; 
            private Boolean isPermissive; 
            private String routeHeader; 
            private String serviceLevelFallbackTarget; 
            private String serviceList; 
            private String swimLaneLabels; 
            private String traceHeader; 
            private String weightedIngressRule; 

            private Builder() {
            } 

            private Builder(SwimLaneGroupList model) {
                this.fallbackTarget = model.fallbackTarget;
                this.groupName = model.groupName;
                this.ingressGatewayName = model.ingressGatewayName;
                this.ingressRoutingStrategy = model.ingressRoutingStrategy;
                this.ingressType = model.ingressType;
                this.isPermissive = model.isPermissive;
                this.routeHeader = model.routeHeader;
                this.serviceLevelFallbackTarget = model.serviceLevelFallbackTarget;
                this.serviceList = model.serviceList;
                this.swimLaneLabels = model.swimLaneLabels;
                this.traceHeader = model.traceHeader;
                this.weightedIngressRule = model.weightedIngressRule;
            } 

            /**
             * <p>The name of the baseline lane of the lane group in permissive mode. This parameter is valid only for a lane group in permissive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>s1</p>
             */
            public Builder fallbackTarget(String fallbackTarget) {
                this.fallbackTarget = fallbackTarget;
                return this;
            }

            /**
             * <p>The name of a lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The name of the ASM ingress gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ingressgateway</p>
             */
            public Builder ingressGatewayName(String ingressGatewayName) {
                this.ingressGatewayName = ingressGatewayName;
                return this;
            }

            /**
             * <p>The policy used to route requests among multiple lanes in a lane group. Valid values:</p>
             * <ul>
             * <li>weighted: a weight-based request routing policy. Requests are matched based on uniform rules and then routed to different lanes in a lane group at a specified ratio.</li>
             * <li>rule-based: a rule-based request routing policy. Each lane is configured with request routing rules. Only requests that match the request routing rules of a specific lane are routed to the lane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>weighted</p>
             */
            public Builder ingressRoutingStrategy(String ingressRoutingStrategy) {
                this.ingressRoutingStrategy = ingressRoutingStrategy;
                return this;
            }

            /**
             * <p>The type of gateways in which you can configure request routing rules. You can configure request routing rules only in ASM gateways.</p>
             * 
             * <strong>example:</strong>
             * <p>ASM</p>
             */
            public Builder ingressType(String ingressType) {
                this.ingressType = ingressType;
                return this;
            }

            /**
             * <p>Indicates whether the lane group is in permissive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPermissive(Boolean isPermissive) {
                this.isPermissive = isPermissive;
                return this;
            }

            /**
             * <p>The request routing header of the lane group. It is valid only for a lane group in permissive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>x-asm-prefer-tag</p>
             */
            public Builder routeHeader(String routeHeader) {
                this.routeHeader = routeHeader;
                return this;
            }

            /**
             * ServiceLevelFallbackTarget.
             */
            public Builder serviceLevelFallbackTarget(String serviceLevelFallbackTarget) {
                this.serviceLevelFallbackTarget = serviceLevelFallbackTarget;
                return this;
            }

            /**
             * <p>The Services associated with the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
             */
            public Builder serviceList(String serviceList) {
                this.serviceList = serviceList;
                return this;
            }

            /**
             * <p>A serialized JSON string. The keys of the JSON object are the keys of the labels owned by all services in the lane group, and the values of the JSON object are arrays of all possible label values of the services in the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ASM_TRAFFIC_TAG&quot;:[&quot;v2&quot;,&quot;v3&quot;,&quot;v1&quot;],&quot;version&quot;:[&quot;v3&quot;,&quot;v1&quot;,&quot;v2&quot;]}</p>
             */
            public Builder swimLaneLabels(String swimLaneLabels) {
                this.swimLaneLabels = swimLaneLabels;
                return this;
            }

            /**
             * <p>The end-to-end (E2E) pass-through request header of the lane group. It is valid only for a lane group in permissive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>my-request-id</p>
             */
            public Builder traceHeader(String traceHeader) {
                this.traceHeader = traceHeader;
                return this;
            }

            /**
             * <p>The weight-based request routing rules for a lane group. This parameter is returned only when the IngressRoutingStrategy parameter is set to weighted.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Domains&quot;:[&quot;*&quot;],&quot;MatchRequests&quot;:[{&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mock&quot;},&quot;Headers&quot;:[{&quot;Name&quot;:&quot;test&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;yes&quot;}]}]}</p>
             */
            public Builder weightedIngressRule(String weightedIngressRule) {
                this.weightedIngressRule = weightedIngressRule;
                return this;
            }

            public SwimLaneGroupList build() {
                return new SwimLaneGroupList(this);
            } 

        } 

    }
}
