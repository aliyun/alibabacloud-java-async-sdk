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
 * {@link GetSwimLaneListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwimLaneListResponseBody</p>
 */
public class GetSwimLaneListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SwimLaneList")
    private java.util.List<SwimLaneList> swimLaneList;

    private GetSwimLaneListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.swimLaneList = builder.swimLaneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwimLaneListResponseBody create() {
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
     * @return swimLaneList
     */
    public java.util.List<SwimLaneList> getSwimLaneList() {
        return this.swimLaneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SwimLaneList> swimLaneList; 

        private Builder() {
        } 

        private Builder(GetSwimLaneListResponseBody model) {
            this.requestId = model.requestId;
            this.swimLaneList = model.swimLaneList;
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
         * <p>The swimlanes.</p>
         */
        public Builder swimLaneList(java.util.List<SwimLaneList> swimLaneList) {
            this.swimLaneList = swimLaneList;
            return this;
        }

        public GetSwimLaneListResponseBody build() {
            return new GetSwimLaneListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSwimLaneListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSwimLaneListResponseBody</p>
     */
    public static class SwimLaneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IngressRule")
        private String ingressRule;

        @com.aliyun.core.annotation.NameInMap("IngressService")
        private String ingressService;

        @com.aliyun.core.annotation.NameInMap("LabelSelectorKey")
        private String labelSelectorKey;

        @com.aliyun.core.annotation.NameInMap("LabelSelectorValue")
        private String labelSelectorValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceList")
        private String serviceList;

        @com.aliyun.core.annotation.NameInMap("ValidationMessage")
        private String validationMessage;

        @com.aliyun.core.annotation.NameInMap("WeightedIngressDestinatin")
        private String weightedIngressDestinatin;

        private SwimLaneList(Builder builder) {
            this.groupName = builder.groupName;
            this.ingressRule = builder.ingressRule;
            this.ingressService = builder.ingressService;
            this.labelSelectorKey = builder.labelSelectorKey;
            this.labelSelectorValue = builder.labelSelectorValue;
            this.name = builder.name;
            this.serviceList = builder.serviceList;
            this.validationMessage = builder.validationMessage;
            this.weightedIngressDestinatin = builder.weightedIngressDestinatin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwimLaneList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceList
         */
        public String getServiceList() {
            return this.serviceList;
        }

        /**
         * @return validationMessage
         */
        public String getValidationMessage() {
            return this.validationMessage;
        }

        /**
         * @return weightedIngressDestinatin
         */
        public String getWeightedIngressDestinatin() {
            return this.weightedIngressDestinatin;
        }

        public static final class Builder {
            private String groupName; 
            private String ingressRule; 
            private String ingressService; 
            private String labelSelectorKey; 
            private String labelSelectorValue; 
            private String name; 
            private String serviceList; 
            private String validationMessage; 
            private String weightedIngressDestinatin; 

            private Builder() {
            } 

            private Builder(SwimLaneList model) {
                this.groupName = model.groupName;
                this.ingressRule = model.ingressRule;
                this.ingressService = model.ingressService;
                this.labelSelectorKey = model.labelSelectorKey;
                this.labelSelectorValue = model.labelSelectorValue;
                this.name = model.name;
                this.serviceList = model.serviceList;
                this.validationMessage = model.validationMessage;
                this.weightedIngressDestinatin = model.weightedIngressDestinatin;
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
             * <p>The request routing rules.</p>
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
             * <p>The label key of the associated service workload. The value is fixed as <code>ASM_TRAFFIC_TAG</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ASM_TRAFFIC_TAG</p>
             */
            public Builder labelSelectorKey(String labelSelectorKey) {
                this.labelSelectorKey = labelSelectorKey;
                return this;
            }

            /**
             * <p>The label value of the associated service workload. The value is fixed as <code>ASM_TRAFFIC_TAG</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder labelSelectorValue(String labelSelectorValue) {
                this.labelSelectorValue = labelSelectorValue;
                return this;
            }

            /**
             * <p>The name of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>s1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Services associated with the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
             */
            public Builder serviceList(String serviceList) {
                this.serviceList = serviceList;
                return this;
            }

            /**
             * <p>The verification messages of the lane group. If the service does not exist in the lane group, the verification message is displayed in the verification messages of the lane group.</p>
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
            public Builder weightedIngressDestinatin(String weightedIngressDestinatin) {
                this.weightedIngressDestinatin = weightedIngressDestinatin;
                return this;
            }

            public SwimLaneList build() {
                return new SwimLaneList(this);
            } 

        } 

    }
}
