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
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List<Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Domains> domains; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDomainsResponseBody model) {
            this.domains = model.domains;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of accelerated domain names.</p>
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDomainsResponseBody build() {
            return new ListDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
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
             * <li><strong>Create</strong>: Create an instance.</li>
             * <li><strong>Update</strong>: Update the current instance.</li>
             * <li><strong>Delete</strong>: Delete the current instance.</li>
             * <li><strong>Associate</strong>: Reference the current instance.</li>
             * <li><strong>UserUnmanaged</strong>: Unmanage the instance.</li>
             * <li><strong>CreateChild</strong>: Create a child resource in the current instance.</li>
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
             * <p>Indicates whether the specified actions are managed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</li>
             * <li><strong>false</strong>: The specified actions are not managed, and you can perform the specified actions on the managed instance.</li>
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
    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
     */
    public static class Accelerators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
        private java.util.List<ServiceManagedInfos> serviceManagedInfos;

        private Accelerators(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.name = builder.name;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accelerators create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        public static final class Builder {
            private String acceleratorId; 
            private String name; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List<ServiceManagedInfos> serviceManagedInfos; 

            private Builder() {
            } 

            private Builder(Accelerators model) {
                this.acceleratorId = model.acceleratorId;
                this.name = model.name;
                this.serviceId = model.serviceId;
                this.serviceManaged = model.serviceManaged;
                this.serviceManagedInfos = model.serviceManagedInfos;
            } 

            /**
             * <p>The ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1odcab8tmno0hdq****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The name of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Accelerator</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the service that manages the GA instance.</p>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
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
             * <li><strong>true</strong>: The GA instance is managed.</li>
             * <li><strong>false</strong>: The GA instance is not managed.</li>
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
             * <p>The actions that you can perform on the managed instance.</p>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
             * </blockquote>
             * <ul>
             * <li>You can perform only specific actions on a managed instance.</li>
             * </ul>
             */
            public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            public Accelerators build() {
                return new Accelerators(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accelerators")
        private java.util.List<Accelerators> accelerators;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Domains(Builder builder) {
            this.accelerators = builder.accelerators;
            this.domain = builder.domain;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return accelerators
         */
        public java.util.List<Accelerators> getAccelerators() {
            return this.accelerators;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private java.util.List<Accelerators> accelerators; 
            private String domain; 
            private String state; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.accelerators = model.accelerators;
                this.domain = model.domain;
                this.state = model.state;
            } 

            /**
             * <p>A list of GA instances.</p>
             */
            public Builder accelerators(java.util.List<Accelerators> accelerators) {
                this.accelerators = accelerators;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ICP filing status of the accelerated domain name. Valid values:</p>
             * <ul>
             * <li><strong>illegal:</strong> The domain name is illegal.</li>
             * <li><strong>inactive:</strong> The domain name has not completed ICP filing.</li>
             * <li><strong>active:</strong> The domain name has a valid ICP number.</li>
             * <li><strong>unknown:</strong> The ICP filing status is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
