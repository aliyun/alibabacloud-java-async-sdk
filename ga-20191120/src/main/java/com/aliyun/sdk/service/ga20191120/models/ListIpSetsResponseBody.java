// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpSetsResponseBody</p>
 */
public class ListIpSetsResponseBody extends TeaModel {
    @NameInMap("IpSets")
    private java.util.List < IpSets> ipSets;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIpSetsResponseBody(Builder builder) {
        this.ipSets = builder.ipSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipSets
     */
    public java.util.List < IpSets> getIpSets() {
        return this.ipSets;
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
        private java.util.List < IpSets> ipSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of the acceleration regions.
         */
        public Builder ipSets(java.util.List < IpSets> ipSets) {
            this.ipSets = ipSets;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpSetsResponseBody build() {
            return new ListIpSetsResponseBody(this);
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
             * 托管策略动作名称，取值：
             * <p>
             * - **Create**：创建实例。
             * - **Update**：更新当前实例。
             * - **Delete**：删除当前实例。
             * - **Associate**：引用/被引用当前实例。
             * - **UserUnmanaged**：用户解托管实例。
             * - **CreateChild**：在当前实例下创建子资源。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 子资源类型，取值：
             * <p>
             * - **Listener**：监听资源。
             * - **IpSet**：加速地域资源。
             * - **EndpointGroup**：终端节点组资源。
             * - **ForwardingRule**：转发策略资源。
             * - **Endpoint**：终端节点资源。
             * - **EndpointGroupDestination**：自定义路由监听下的终端节点组协议映射资源。
             * - **EndpointPolicy**：自定义路由监听下的终端节点通行策略资源。
             * > 仅在**Action**参数为**CreateChild**时有效
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * 托管策略动作是否被托管，取值：
             * <p>
             * - **true**：托管策略动作被托管，用户无权在托管实例下执行Action指定的操作。
             * - **false**：托管策略动作未被托管，用户可在托管实例下执行Action指定的操作。
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
    public static class IpSets extends TeaModel {
        @NameInMap("AccelerateRegionId")
        private String accelerateRegionId;

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

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @NameInMap("State")
        private String state;

        private IpSets(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipAddressList = builder.ipAddressList;
            this.ipSetId = builder.ipSetId;
            this.ipVersion = builder.ipVersion;
            this.ispType = builder.ispType;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSets create() {
            return builder().build();
        }

        /**
         * @return accelerateRegionId
         */
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
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
            private Integer bandwidth; 
            private java.util.List < String > ipAddressList; 
            private String ipSetId; 
            private String ipVersion; 
            private String ispType; 
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
             * The bandwidth that is allocated to the acceleration region. Unit: **Mbit/s**.
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
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.
             * 
             * If you are allowed to use single-ISP bandwidth, you can also specify one of the following values:
             * 
             * *   **ChinaTelecom**: China Telecom (single ISP)
             * *   **ChinaUnicom**: China Unicom (single ISP)
             * *   **ChinaMobile**: China Mobile (single ISP)
             * *   **ChinaTelecom_L2**: China Telecom \_L2 (single ISP)
             * *   **ChinaUnicom_L2**: China Unicom \_L2 (single ISP)
             * *   **ChinaMobile_L2**: China Mobile \_L2 (single ISP)
             * 
             * > Different acceleration regions support different single-ISP BGP lines.
             */
            public Builder ispType(String ispType) {
                this.ispType = ispType;
                return this;
            }

            /**
             * 托管实例所属的服务方ID。
             * <p>
             * 
             * > 仅在**ServiceManaged**参数为**True**时有效。
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * 是否为托管实例。取值：
             * <p>
             * 
             * - **true**：是托管资实例。
             * 
             * - **false**：不是托管实例。
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * 用户在此托管实例下可执行的动作策略列表。
             * <p>
             * 
             * > 仅在**ServiceManaged**参数为**True**时有效。
             * > - 当实例处于托管状态时，用户对实例的操作会受到限制，某些操作行为会被禁止。
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
             * *   **active**: The acceleration region is running.
             * *   **updating**: The acceleration region is being configured.
             * *   **deleting**: The acceleration region is being deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public IpSets build() {
                return new IpSets(this);
            } 

        } 

    }
}
