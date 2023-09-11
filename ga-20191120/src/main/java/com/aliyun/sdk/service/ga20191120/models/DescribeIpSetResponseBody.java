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
         * The version of the IP protocol. Valid values:
         * <p>
         * 
         * *   **IPv4**
         * *   **IPv6**
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The line type of the elastic IP address (EIP) in the acceleration region. Valid values:
         * <p>
         * 
         * *   **BGP**: BGP (Multi-ISP) lines.
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines.
         * 
         * If you are allowed to use single-ISP bandwidth, one of the following values is returned:
         * 
         * *   **ChinaTelecom**: China Telecom (single ISP).
         * *   **ChinaUnicom**: China Unicom (single ISP).
         * *   **ChinaMobile**: China Mobile (single ISP).
         * *   **ChinaTelecom_L2**: China Telecom (single ISP)\_L2.
         * *   **ChinaUnicom_L2**: China Unicom (single ISP)\_L2.
         * *   **ChinaMobile_L2**: China Mobile (single ISP)\_L2.
         * 
         * >  The supported single-ISP type varies with the acceleration region.
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
         * The service ID to which the managed instance belongs.
         * <p>
         * 
         * >  Valid only when the ServiceManaged parameter is True.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Is it a managed instance. Valid values:
         * <p>
         * 
         * - true
         * - false
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * A list of action policies that users can execute on this managed instance.
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
             * Managed policy action name, Valid values:
             * <p>
             * 
             * - Create
             * - Update
             * - Delete
             * - Associate
             * - UserUnmanaged
             * - CreateChild
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Sub resource type, Valid values:
             * <p>
             * 
             * - Listener
             * - IpSet
             * - EndpointGroup
             * - ForwardingRule
             * - Endpoint
             * - EndpointGroupDestination
             * - EndpointPolicy
             * 
             * >Only valid when the Action parameter is CreateChild.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Is the managed policy action managed, Valid values:
             * <p>
             * 
             * - true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.
             * 
             * - false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.
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
