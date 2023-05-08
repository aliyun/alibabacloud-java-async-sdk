// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceListResponseBody</p>
 */
public class DescribeExposedInstanceListResponseBody extends TeaModel {
    @NameInMap("ExposedInstances")
    private java.util.List < ExposedInstances> exposedInstances;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeExposedInstanceListResponseBody(Builder builder) {
        this.exposedInstances = builder.exposedInstances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return exposedInstances
     */
    public java.util.List < ExposedInstances> getExposedInstances() {
        return this.exposedInstances;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ExposedInstances> exposedInstances; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The port that is exposed on the Internet.
         */
        public Builder exposedInstances(java.util.List < ExposedInstances> exposedInstances) {
            this.exposedInstances = exposedInstances;
            return this;
        }

        /**
         * The public IP address of the server.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The resource from which the asset is exposed. Valid values:
         * <p>
         * 
         * *   **INTERNET_IP**: the public IP address of an ECS instance
         * *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
         * *   **EIP**: an elastic IP address (EIP)
         * *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExposedInstanceListResponseBody build() {
            return new DescribeExposedInstanceListResponseBody(this);
        } 

    } 

    public static class ExposedInstances extends TeaModel {
        @NameInMap("AsapVulCount")
        private Integer asapVulCount;

        @NameInMap("ExploitHealthCount")
        private Integer exploitHealthCount;

        @NameInMap("ExposureComponent")
        private String exposureComponent;

        @NameInMap("ExposureIp")
        private String exposureIp;

        @NameInMap("ExposurePort")
        private String exposurePort;

        @NameInMap("ExposureType")
        private String exposureType;

        @NameInMap("ExposureTypeId")
        private String exposureTypeId;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("LaterVulCount")
        private Integer laterVulCount;

        @NameInMap("NntfVulCount")
        private Integer nntfVulCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("TotalVulCount")
        private Integer totalVulCount;

        @NameInMap("Uuid")
        private String uuid;

        private ExposedInstances(Builder builder) {
            this.asapVulCount = builder.asapVulCount;
            this.exploitHealthCount = builder.exploitHealthCount;
            this.exposureComponent = builder.exposureComponent;
            this.exposureIp = builder.exposureIp;
            this.exposurePort = builder.exposurePort;
            this.exposureType = builder.exposureType;
            this.exposureTypeId = builder.exposureTypeId;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.laterVulCount = builder.laterVulCount;
            this.nntfVulCount = builder.nntfVulCount;
            this.regionId = builder.regionId;
            this.totalVulCount = builder.totalVulCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExposedInstances create() {
            return builder().build();
        }

        /**
         * @return asapVulCount
         */
        public Integer getAsapVulCount() {
            return this.asapVulCount;
        }

        /**
         * @return exploitHealthCount
         */
        public Integer getExploitHealthCount() {
            return this.exploitHealthCount;
        }

        /**
         * @return exposureComponent
         */
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        /**
         * @return exposureIp
         */
        public String getExposureIp() {
            return this.exposureIp;
        }

        /**
         * @return exposurePort
         */
        public String getExposurePort() {
            return this.exposurePort;
        }

        /**
         * @return exposureType
         */
        public String getExposureType() {
            return this.exposureType;
        }

        /**
         * @return exposureTypeId
         */
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return laterVulCount
         */
        public Integer getLaterVulCount() {
            return this.laterVulCount;
        }

        /**
         * @return nntfVulCount
         */
        public Integer getNntfVulCount() {
            return this.nntfVulCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return totalVulCount
         */
        public Integer getTotalVulCount() {
            return this.totalVulCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer asapVulCount; 
            private Integer exploitHealthCount; 
            private String exposureComponent; 
            private String exposureIp; 
            private String exposurePort; 
            private String exposureType; 
            private String exposureTypeId; 
            private Long groupId; 
            private String groupName; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Integer laterVulCount; 
            private Integer nntfVulCount; 
            private String regionId; 
            private Integer totalVulCount; 
            private String uuid; 

            /**
             * An array that consists of the details about the exposed asset.
             */
            public Builder asapVulCount(Integer asapVulCount) {
                this.asapVulCount = asapVulCount;
                return this;
            }

            /**
             * ExploitHealthCount.
             */
            public Builder exploitHealthCount(Integer exploitHealthCount) {
                this.exploitHealthCount = exploitHealthCount;
                return this;
            }

            /**
             * ExposureComponent.
             */
            public Builder exposureComponent(String exposureComponent) {
                this.exposureComponent = exposureComponent;
                return this;
            }

            /**
             * The number of entries returned on the current page.
             */
            public Builder exposureIp(String exposureIp) {
                this.exposureIp = exposureIp;
                return this;
            }

            /**
             * Queries the information about the servers that are exposed on the Internet.
             */
            public Builder exposurePort(String exposurePort) {
                this.exposurePort = exposurePort;
                return this;
            }

            /**
             * Specifies whether the server has vulnerabilities. Valid values:
             * <p>
             * 
             * *   **true**: The server has vulnerabilities.
             * *   **false**: The server does not have vulnerabilities.
             */
            public Builder exposureType(String exposureType) {
                this.exposureType = exposureType;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder exposureTypeId(String exposureTypeId) {
                this.exposureTypeId = exposureTypeId;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The pagination information.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * LaterVulCount.
             */
            public Builder laterVulCount(Integer laterVulCount) {
                this.laterVulCount = laterVulCount;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder nntfVulCount(Integer nntfVulCount) {
                this.nntfVulCount = nntfVulCount;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the ExposureType parameter.
             * <p>
             * 
             * *   If the value of the ExposureType parameter is **INTERNET_IP**, this parameter is empty.
             * *   If the value of the ExposureType parameter is **SLB**, the value of this parameter is the ID of the SLB instance.
             * *   If the value of the ExposureType parameter is **EIP**, the value of this parameter is the ID of the EIP.
             * *   If the value of the ExposureType parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.
             */
            public Builder totalVulCount(Integer totalVulCount) {
                this.totalVulCount = totalVulCount;
                return this;
            }

            /**
             * DescribeExposedInstanceList
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ExposedInstances build() {
                return new ExposedInstances(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The ID of the server group.
             * <p>
             * 
             * > You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The number of the page to return.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of low-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of medium-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
