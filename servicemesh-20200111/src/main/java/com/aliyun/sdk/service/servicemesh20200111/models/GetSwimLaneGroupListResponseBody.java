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
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("IngressGatewayName")
        private String ingressGatewayName;

        @NameInMap("IngressType")
        private String ingressType;

        @NameInMap("ServiceList")
        private String serviceList;

        private SwimLaneGroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.ingressGatewayName = builder.ingressGatewayName;
            this.ingressType = builder.ingressType;
            this.serviceList = builder.serviceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwimLaneGroupList create() {
            return builder().build();
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
         * @return serviceList
         */
        public String getServiceList() {
            return this.serviceList;
        }

        public static final class Builder {
            private String groupName; 
            private String ingressGatewayName; 
            private String ingressType; 
            private String serviceList; 

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
             * A list of services associated with the lane group.
             */
            public Builder serviceList(String serviceList) {
                this.serviceList = serviceList;
                return this;
            }

            public SwimLaneGroupList build() {
                return new SwimLaneGroupList(this);
            } 

        } 

    }
}
