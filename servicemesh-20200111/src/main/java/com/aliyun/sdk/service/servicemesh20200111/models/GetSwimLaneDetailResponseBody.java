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
 * {@link GetSwimLaneDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwimLaneDetailResponseBody</p>
 */
public class GetSwimLaneDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IngressRule")
    private String ingressRule;

    @com.aliyun.core.annotation.NameInMap("IngressService")
    private String ingressService;

    @com.aliyun.core.annotation.NameInMap("LabelSelectorKey")
    private String labelSelectorKey;

    @com.aliyun.core.annotation.NameInMap("LabelSelectorValue")
    private String labelSelectorValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServicesList")
    private String servicesList;

    @com.aliyun.core.annotation.NameInMap("ValidationMessage")
    private String validationMessage;

    @com.aliyun.core.annotation.NameInMap("WeightedIngressDestination")
    private String weightedIngressDestination;

    private GetSwimLaneDetailResponseBody(Builder builder) {
        this.ingressRule = builder.ingressRule;
        this.ingressService = builder.ingressService;
        this.labelSelectorKey = builder.labelSelectorKey;
        this.labelSelectorValue = builder.labelSelectorValue;
        this.requestId = builder.requestId;
        this.servicesList = builder.servicesList;
        this.validationMessage = builder.validationMessage;
        this.weightedIngressDestination = builder.weightedIngressDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwimLaneDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ingressRule
     */
    public String getIngressRule() {
        return this.ingressRule;
    }

    /**
     * @return ingressService
     */
    public String getIngressService() {
        return this.ingressService;
    }

    /**
     * @return labelSelectorKey
     */
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    /**
     * @return labelSelectorValue
     */
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servicesList
     */
    public String getServicesList() {
        return this.servicesList;
    }

    /**
     * @return validationMessage
     */
    public String getValidationMessage() {
        return this.validationMessage;
    }

    /**
     * @return weightedIngressDestination
     */
    public String getWeightedIngressDestination() {
        return this.weightedIngressDestination;
    }

    public static final class Builder {
        private String ingressRule; 
        private String ingressService; 
        private String labelSelectorKey; 
        private String labelSelectorValue; 
        private String requestId; 
        private String servicesList; 
        private String validationMessage; 
        private String weightedIngressDestination; 

        private Builder() {
        } 

        private Builder(GetSwimLaneDetailResponseBody model) {
            this.ingressRule = model.ingressRule;
            this.ingressService = model.ingressService;
            this.labelSelectorKey = model.labelSelectorKey;
            this.labelSelectorValue = model.labelSelectorValue;
            this.requestId = model.requestId;
            this.servicesList = model.servicesList;
            this.validationMessage = model.validationMessage;
            this.weightedIngressDestination = model.weightedIngressDestination;
        } 

        /**
         * <p>The traffic routing rule that routes traffic to the lane by using the ingress gateway. The traffic routing rule contains one or more custom routes.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Domains&quot;:[&quot;<em>&quot;],&quot;RouteName&quot;:&quot;r1&quot;,&quot;MatchRequest&quot;:{&quot;Headers&quot;:[{&quot;Name&quot;:&quot;x-asm-prefer-tag&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;s1&quot;}],&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mock&quot;}},&quot;RouteDestinations&quot;:[{&quot;Destination&quot;:{&quot;Host&quot;:&quot;mocka.default.svc.cluster.local&quot;,&quot;Subset&quot;:&quot;s1&quot;}}]},{&quot;Domains&quot;:[&quot;</em>&quot;],&quot;RouteName&quot;:&quot;hello&quot;,&quot;MatchRequest&quot;:{&quot;Headers&quot;:[{&quot;Name&quot;:&quot;x-asm-prefer-tag&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;s1&quot;}],&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mocktest&quot;}},&quot;RouteDestinations&quot;:[{&quot;Destination&quot;:{&quot;Host&quot;:&quot;mocka.default.svc.cluster.local&quot;,&quot;Subset&quot;:&quot;s1&quot;}}]}]</p>
         */
        public Builder ingressRule(String ingressRule) {
            this.ingressRule = ingressRule;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>mocka.default.svc.cluster.local</p>
         */
        public Builder ingressService(String ingressService) {
            this.ingressService = ingressService;
            return this;
        }

        /**
         * <p>The label key of the associated service workload. The value is fixed as <strong>ASM_TRAFFIC_TAG</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ASM_TRAFFIC_TAG</p>
         */
        public Builder labelSelectorKey(String labelSelectorKey) {
            this.labelSelectorKey = labelSelectorKey;
            return this;
        }

        /**
         * <p>The value of ASM_TRAFFIC_TAG.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder labelSelectorValue(String labelSelectorValue) {
            this.labelSelectorValue = labelSelectorValue;
            return this;
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
         * <p>A list of services associated with the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
         */
        public Builder servicesList(String servicesList) {
            this.servicesList = servicesList;
            return this;
        }

        /**
         * <p>The status of the swimlane. If the configuration is successful and takes effect, a <code>null</code> is returned. Otherwise, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;code&quot;:&quot;CODE_UNEFFECTED_SWIMLANE_LABEL&quot;,&quot;level&quot;:&quot;warning&quot;,&quot;message&quot;:&quot;The label selector defined in the ASMSwimLane has no effect on any workload instance.&quot;}]</p>
         */
        public Builder validationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            return this;
        }

        /**
         * <p>This parameter is returned only when the IngressRoutingStrategy parameter is set to weighted. This parameter indicates the domain name of Services in each lane and the request routing weight. The value of this parameter is a serialized JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RouteDestination&quot;:{&quot;Host&quot;:&quot;mocka.default.svc.cluster.local&quot;,&quot;Subset&quot;:&quot;s1&quot;},&quot;Weight&quot;:40}</p>
         */
        public Builder weightedIngressDestination(String weightedIngressDestination) {
            this.weightedIngressDestination = weightedIngressDestination;
            return this;
        }

        public GetSwimLaneDetailResponseBody build() {
            return new GetSwimLaneDetailResponseBody(this);
        } 

    } 

}
