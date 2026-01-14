// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpSetResponseBody</p>
 */
public class DescribeIpSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateRegionId")
    private String accelerateRegionId;

    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("IpAddressList")
    private java.util.List<String> ipAddressList;

    @com.aliyun.core.annotation.NameInMap("IpSetId")
    private String ipSetId;

    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.NameInMap("IspType")
    private String ispType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List<ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("State")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getIpAddressList() {
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
    public java.util.List<ServiceManagedInfos> getServiceManagedInfos() {
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
        private java.util.List<String> ipAddressList; 
        private String ipSetId; 
        private String ipVersion; 
        private String ispType; 
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
        private String state; 

        private Builder() {
        } 

        private Builder(DescribeIpSetResponseBody model) {
            this.accelerateRegionId = model.accelerateRegionId;
            this.acceleratorId = model.acceleratorId;
            this.bandwidth = model.bandwidth;
            this.ipAddressList = model.ipAddressList;
            this.ipSetId = model.ipSetId;
            this.ipVersion = model.ipVersion;
            this.ispType = model.ispType;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceManaged = model.serviceManaged;
            this.serviceManagedInfos = model.serviceManagedInfos;
            this.state = model.state;
        } 

        /**
         * <p>The ID of the acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1yeeq8yfoyszmqy****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The bandwidth that is allocated to the acceleration region. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The list of accelerated IP addresses in the acceleration region.</p>
         */
        public Builder ipAddressList(java.util.List<String> ipAddressList) {
            this.ipAddressList = ipAddressList;
            return this;
        }

        /**
         * <p>The ID of the acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>ips-bp11ilwqjdkjeg9r7****</p>
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong></li>
         * <li><strong>IPv6</strong></li>
         * <li><strong>DUAL_STACK</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong>: BGP (Multi-ISP) lines. This is the default value.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder ispType(String ispType) {
            this.ispType = ispType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6D2BFF54-6AF2-4679-88C4-2F2E187F16CB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the service that manages the instance.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</li>
         * <li>Users can perform only specific actions on a managed instance.</li>
         * </ul>
         * </blockquote>
         */
        public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * <p>The status of the acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The acceleration region is being initialized.</li>
         * <li><strong>active</strong>: The acceleration region is in the running state.</li>
         * <li><strong>updating</strong>: The acceleration region is being configured.</li>
         * <li><strong>deleting</strong>: The GA instance is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DescribeIpSetResponseBody build() {
            return new DescribeIpSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpSetResponseBody</p>
     */
    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
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

            private Builder() {
            } 

            private Builder(ServiceManagedInfos model) {
                this.action = model.action;
                this.childType = model.childType;
                this.isManaged = model.isManaged;
            } 

            /**
             * <p>The name of the action on the managed instance. Valid values:</p>
             * <ul>
             * <li><strong>Create</strong></li>
             * <li><strong>Update</strong></li>
             * <li><strong>Delete</strong></li>
             * <li><strong>Associate</strong></li>
             * <li><strong>UserUnmanaged</strong></li>
             * <li><strong>CreateChild</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Update</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the child resource. Valid values:</p>
             * <ul>
             * <li><strong>Listener</strong>: listener.</li>
             * <li><strong>IpSet</strong>: acceleration region.</li>
             * <li><strong>EndpointGroup</strong>: endpoint group.</li>
             * <li><strong>ForwardingRule</strong>: forwarding rule.</li>
             * <li><strong>Endpoint</strong>: endpoint.</li>
             * <li><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener.</li>
             * <li><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Listener</p>
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * <p>Indicates whether the specified actions are managed.</p>
             * <ul>
             * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the actions on the managed instance.</li>
             * <li><strong>false</strong>: The specified actions are not managed, and users can perform the actions on the managed instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
