// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpSetResponseBody</p>
 */
public class DescribeIpSetResponseBody extends TeaModel {
    @NameInMap("AccelerateRegionId")
    private String accelerateRegionId;

    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("IpAddressList")
    private java.util.List < String > ipAddressList;

    @NameInMap("IpSetId")
    private String ipSetId;

    @NameInMap("IpVersion")
    private String ipVersion;

    @NameInMap("IspType")
    private String ispType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @NameInMap("State")
    private String state;

    private DescribeIpSetResponseBody(Builder builder) {
        this.accelerateRegionId = builder.accelerateRegionId;
        this.acceleratorId = builder.acceleratorId;
        this.bandwidth = builder.bandwidth;
        this.ipAddressList = builder.ipAddressList;
        this.ipSetId = builder.ipSetId;
        this.ipVersion = builder.ipVersion;
        this.ispType = builder.ispType;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateRegionId
     */
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return ipAddressList
     */
    public java.util.List < String > getIpAddressList() {
        return this.ipAddressList;
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ispType
     */
    public String getIspType() {
        return this.ispType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return serviceManagedInfos
     */
    public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String accelerateRegionId; 
        private String acceleratorId; 
        private Integer bandwidth; 
        private java.util.List < String > ipAddressList; 
        private String ipSetId; 
        private String ipVersion; 
        private String ispType; 
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
        private String state; 

        /**
         * The ID of the acceleration region.
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The bandwidth that is allocated to the acceleration region. Unit: Mbit/s.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The list of accelerated IP addresses in the acceleration region.
         */
        public Builder ipAddressList(java.util.List < String > ipAddressList) {
            this.ipAddressList = ipAddressList;
            return this;
        }

        /**
         * The ID of the acceleration region.
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * The IP version. Valid values:
         * <p>
         * 
         * *   **IPv4**
         * *   **IPv6**
         * *   **DUAL_STACK**
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The line type of the elastic IP address (EIP) in the acceleration region. Valid values:
         * <p>
         * 
         * *   **BGP**: BGP (Multi-ISP) lines. This is the default value.
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines.
         */
        public Builder ispType(String ispType) {
            this.ispType = ispType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the service that manages the instance.
         * <p>
         * 
         * >  This parameter is returned only if the value of **ServiceManaged** is **true**.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Indicates whether the GA instance is managed. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * The actions that users can perform on the managed instance.
         * <p>
         * 
         * > *   This parameter is returned only if the value of **ServiceManaged** is **true**.
         * >*   Users can perform only specific actions on a managed instance.
         */
        public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * The status of the acceleration region. Valid values:
         * <p>
         * 
         * *   **init**: The acceleration region is being initialized.
         * *   **active**: The acceleration region is in the running state.
         * *   **updating**: The acceleration region is being configured.
         * *   **deleting**: The GA instance is being deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DescribeIpSetResponseBody build() {
            return new DescribeIpSetResponseBody(this);
        } 

    } 

    public static class ServiceManagedInfos extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ChildType")
        private String childType;

        @NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * The name of the action on the managed instance. Valid values:
             * <p>
             * 
             * *   **Create**
             * *   **Update**
             * *   **Delete**
             * *   **Associate**
             * *   **UserUnmanaged**
             * *   **CreateChild**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The type of the child resource. Valid values:
             * <p>
             * 
             * *   **Listener**: listener.
             * *   **IpSet**: acceleration region.
             * *   **EndpointGroup**: endpoint group.
             * *   **ForwardingRule**: forwarding rule.
             * *   **Endpoint**: endpoint.
             * *   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener.
             * *   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener.
             * 
             * >  This parameter takes effect only if **Action** is set to **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed.
             * <p>
             * 
             * *   **true**: The specified actions are managed, and users cannot perform the actions on the managed instance.
             * *   **false**: The specified actions are not managed, and users can perform the actions on the managed instance.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
}
