// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwimLaneListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwimLaneListResponseBody</p>
 */
public class GetSwimLaneListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SwimLaneList")
    private java.util.List < SwimLaneList> swimLaneList;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return swimLaneList
     */
    public java.util.List < SwimLaneList> getSwimLaneList() {
        return this.swimLaneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SwimLaneList> swimLaneList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of all the lanes in the lane group.
         */
        public Builder swimLaneList(java.util.List < SwimLaneList> swimLaneList) {
            this.swimLaneList = swimLaneList;
            return this;
        }

        public GetSwimLaneListResponseBody build() {
            return new GetSwimLaneListResponseBody(this);
        } 

    } 

    public static class SwimLaneList extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("IngressRule")
        private String ingressRule;

        @NameInMap("IngressService")
        private String ingressService;

        @NameInMap("LabelSelectorKey")
        private String labelSelectorKey;

        @NameInMap("LabelSelectorValue")
        private String labelSelectorValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("ServiceList")
        private String serviceList;

        private SwimLaneList(Builder builder) {
            this.groupName = builder.groupName;
            this.ingressRule = builder.ingressRule;
            this.ingressService = builder.ingressService;
            this.labelSelectorKey = builder.labelSelectorKey;
            this.labelSelectorValue = builder.labelSelectorValue;
            this.name = builder.name;
            this.serviceList = builder.serviceList;
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

        public static final class Builder {
            private String groupName; 
            private String ingressRule; 
            private String ingressService; 
            private String labelSelectorKey; 
            private String labelSelectorValue; 
            private String name; 
            private String serviceList; 

            /**
             * The name of the lane group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The traffic routing rule associated with the lane.
             */
            public Builder ingressRule(String ingressRule) {
                this.ingressRule = ingressRule;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder ingressService(String ingressService) {
                this.ingressService = ingressService;
                return this;
            }

            /**
             * The label key of the associated service workload. Fixed value: `ASM_TRAFFIC_TAG`.
             */
            public Builder labelSelectorKey(String labelSelectorKey) {
                this.labelSelectorKey = labelSelectorKey;
                return this;
            }

            /**
             * The label value of the associated service workload.``
             */
            public Builder labelSelectorValue(String labelSelectorValue) {
                this.labelSelectorValue = labelSelectorValue;
                return this;
            }

            /**
             * The name of the lane.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * A list of services associated with the lane.
             */
            public Builder serviceList(String serviceList) {
                this.serviceList = serviceList;
                return this;
            }

            public SwimLaneList build() {
                return new SwimLaneList(this);
            } 

        } 

    }
}
