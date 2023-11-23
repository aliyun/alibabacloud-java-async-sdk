// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
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
        private java.util.List < Domains> domains; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * A list of accelerated domain names.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDomainsResponseBody build() {
            return new ListDomainsResponseBody(this);
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
             * *   **Create**: Create an instance.
             * *   **Update**: Update the current instance.
             * *   **Delete**: Delete the current instance.
             * *   **Associate**: Reference the current instance.
             * *   **UserUnmanaged**: Unmanage the instance.
             * *   **CreateChild**: Create a child resource in the current instance.
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
             * Indicates whether the specified actions are managed. Valid values:
             * <p>
             * 
             * *   **true**: The specified actions are managed, and you cannot perform the specified actions on the managed instance.
             * *   **false**: The specified actions are not managed, and you can perform the specified actions on the managed instance.
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
    public static class Accelerators extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

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
        public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String name; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 

            /**
             * The ID of the GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The name of the GA instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the service that manages the GA instance.
             * <p>
             * 
             * >  This parameter takes effect only if **ServiceManaged** is set to **True**.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Indicates whether the GA instance is managed. Valid values:
             * <p>
             * 
             * *   **true**: The GA instance is managed.
             * *   **false**: The GA instance is not managed.
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The actions that you can perform on the managed instance.
             * <p>
             * 
             * >  This parameter takes effect only if **ServiceManaged** is set to **True**.
             * 
             * *   You can perform only specific actions on a managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            public Accelerators build() {
                return new Accelerators(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @NameInMap("Accelerators")
        private java.util.List < Accelerators> accelerators;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("State")
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
        public java.util.List < Accelerators> getAccelerators() {
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
            private java.util.List < Accelerators> accelerators; 
            private String domain; 
            private String state; 

            /**
             * A list of GA instances.
             */
            public Builder accelerators(java.util.List < Accelerators> accelerators) {
                this.accelerators = accelerators;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The ICP filing status of the accelerated domain name. Valid values:
             * <p>
             * 
             * *   **illegal:** The domain name is illegal.
             * *   **inactive:** The domain name has not completed ICP filing.
             * *   **active:** The domain name has a valid ICP number.
             * *   **unknown:** The ICP filing status is unknown.
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
