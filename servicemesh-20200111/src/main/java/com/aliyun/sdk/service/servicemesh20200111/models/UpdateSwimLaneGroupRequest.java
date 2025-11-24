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
 * {@link UpdateSwimLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimLaneGroupRequest</p>
 */
public class UpdateSwimLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallbackTarget")
    private String fallbackTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IngressRoutingStrategy")
    private String ingressRoutingStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceLevelFallbackTarget")
    private String serviceLevelFallbackTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicesList")
    private String servicesList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WeightedIngressRule")
    private String weightedIngressRule;

    private UpdateSwimLaneGroupRequest(Builder builder) {
        super(builder);
        this.fallbackTarget = builder.fallbackTarget;
        this.groupName = builder.groupName;
        this.ingressRoutingStrategy = builder.ingressRoutingStrategy;
        this.serviceLevelFallbackTarget = builder.serviceLevelFallbackTarget;
        this.serviceMeshId = builder.serviceMeshId;
        this.servicesList = builder.servicesList;
        this.weightedIngressRule = builder.weightedIngressRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSwimLaneGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ingressRoutingStrategy
     */
    public String getIngressRoutingStrategy() {
        return this.ingressRoutingStrategy;
    }

    /**
     * @return serviceLevelFallbackTarget
     */
    public String getServiceLevelFallbackTarget() {
        return this.serviceLevelFallbackTarget;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return servicesList
     */
    public String getServicesList() {
        return this.servicesList;
    }

    /**
     * @return weightedIngressRule
     */
    public String getWeightedIngressRule() {
        return this.weightedIngressRule;
    }

    public static final class Builder extends Request.Builder<UpdateSwimLaneGroupRequest, Builder> {
        private String fallbackTarget; 
        private String groupName; 
        private String ingressRoutingStrategy; 
        private String serviceLevelFallbackTarget; 
        private String serviceMeshId; 
        private String servicesList; 
        private String weightedIngressRule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimLaneGroupRequest request) {
            super(request);
            this.fallbackTarget = request.fallbackTarget;
            this.groupName = request.groupName;
            this.ingressRoutingStrategy = request.ingressRoutingStrategy;
            this.serviceLevelFallbackTarget = request.serviceLevelFallbackTarget;
            this.serviceMeshId = request.serviceMeshId;
            this.servicesList = request.servicesList;
            this.weightedIngressRule = request.weightedIngressRule;
        } 

        /**
         * <p>The name of the baseline lane in the lane group if the lane group is in permissive mode. This parameter is valid only for a lane group in permissive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>s1</p>
         */
        public Builder fallbackTarget(String fallbackTarget) {
            this.putBodyParameter("FallbackTarget", fallbackTarget);
            this.fallbackTarget = fallbackTarget;
            return this;
        }

        /**
         * <p>The name of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
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
            this.putBodyParameter("IngressRoutingStrategy", ingressRoutingStrategy);
            this.ingressRoutingStrategy = ingressRoutingStrategy;
            return this;
        }

        /**
         * ServiceLevelFallbackTarget.
         */
        public Builder serviceLevelFallbackTarget(String serviceLevelFallbackTarget) {
            this.putBodyParameter("ServiceLevelFallbackTarget", serviceLevelFallbackTarget);
            this.serviceLevelFallbackTarget = serviceLevelFallbackTarget;
            return this;
        }

        /**
         * <p>The Service Mesh (ASM) instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>A list of services associated with the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
         */
        public Builder servicesList(String servicesList) {
            this.putBodyParameter("ServicesList", servicesList);
            this.servicesList = servicesList;
            return this;
        }

        /**
         * <p>The weight-based request routing rules for a lane group. You can specify this parameter only when the IngressRoutingStrategy parameter is set to weighted.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Domains&quot;:[&quot;*&quot;],&quot;MatchRequests&quot;:[{&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mock&quot;},&quot;Headers&quot;:[{&quot;Name&quot;:&quot;test&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;yes&quot;}]}]}</p>
         */
        public Builder weightedIngressRule(String weightedIngressRule) {
            this.putBodyParameter("WeightedIngressRule", weightedIngressRule);
            this.weightedIngressRule = weightedIngressRule;
            return this;
        }

        @Override
        public UpdateSwimLaneGroupRequest build() {
            return new UpdateSwimLaneGroupRequest(this);
        } 

    } 

}
