// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwimLaneGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwimLaneGroupListResponseBody</p>
 */
public class GetSwimLaneGroupListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SwimLaneGroupList")
    private java.util.List < SwimLaneGroupList> swimLaneGroupList;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return swimLaneGroupList
     */
    public java.util.List < SwimLaneGroupList> getSwimLaneGroupList() {
        return this.swimLaneGroupList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SwimLaneGroupList> swimLaneGroupList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the lane groups.
         */
        public Builder swimLaneGroupList(java.util.List < SwimLaneGroupList> swimLaneGroupList) {
            this.swimLaneGroupList = swimLaneGroupList;
            return this;
        }

        public GetSwimLaneGroupListResponseBody build() {
            return new GetSwimLaneGroupListResponseBody(this);
        } 

    } 

    public static class SwimLaneGroupList extends TeaModel {
        @NameInMap("FallbackTarget")
        private String fallbackTarget;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("IngressGatewayName")
        private String ingressGatewayName;

        @NameInMap("IngressType")
        private String ingressType;

        @NameInMap("IsPermissive")
        private Boolean isPermissive;

        @NameInMap("RouteHeader")
        private String routeHeader;

        @NameInMap("ServiceList")
        private String serviceList;

        @NameInMap("SwimLaneLabels")
        private String swimLaneLabels;

        @NameInMap("TraceHeader")
        private String traceHeader;

        private SwimLaneGroupList(Builder builder) {
            this.fallbackTarget = builder.fallbackTarget;
            this.groupName = builder.groupName;
            this.ingressGatewayName = builder.ingressGatewayName;
            this.ingressType = builder.ingressType;
            this.isPermissive = builder.isPermissive;
            this.routeHeader = builder.routeHeader;
            this.serviceList = builder.serviceList;
            this.swimLaneLabels = builder.swimLaneLabels;
            this.traceHeader = builder.traceHeader;
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

        public static final class Builder {
            private String fallbackTarget; 
            private String groupName; 
            private String ingressGatewayName; 
            private String ingressType; 
            private Boolean isPermissive; 
            private String routeHeader; 
            private String serviceList; 
            private String swimLaneLabels; 
            private String traceHeader; 

            /**
             * FallbackTarget.
             */
            public Builder fallbackTarget(String fallbackTarget) {
                this.fallbackTarget = fallbackTarget;
                return this;
            }

            /**
             * The name of the lane group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The name of the ingress gateway.
             */
            public Builder ingressGatewayName(String ingressGatewayName) {
                this.ingressGatewayName = ingressGatewayName;
                return this;
            }

            /**
             * The ingress type. Traffic routing rules can be configured only in an ingress gateway.
             */
            public Builder ingressType(String ingressType) {
                this.ingressType = ingressType;
                return this;
            }

            /**
             * IsPermissive.
             */
            public Builder isPermissive(Boolean isPermissive) {
                this.isPermissive = isPermissive;
                return this;
            }

            /**
             * RouteHeader.
             */
            public Builder routeHeader(String routeHeader) {
                this.routeHeader = routeHeader;
                return this;
            }

            /**
             * A list of services associated with the lane group.
             */
            public Builder serviceList(String serviceList) {
                this.serviceList = serviceList;
                return this;
            }

            /**
             * SwimLaneLabels.
             */
            public Builder swimLaneLabels(String swimLaneLabels) {
                this.swimLaneLabels = swimLaneLabels;
                return this;
            }

            /**
             * TraceHeader.
             */
            public Builder traceHeader(String traceHeader) {
                this.traceHeader = traceHeader;
                return this;
            }

            public SwimLaneGroupList build() {
                return new SwimLaneGroupList(this);
            } 

        } 

    }
}
