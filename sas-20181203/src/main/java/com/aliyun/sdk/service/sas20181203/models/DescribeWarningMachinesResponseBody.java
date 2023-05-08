// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWarningMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWarningMachinesResponseBody</p>
 */
public class DescribeWarningMachinesResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WarningMachines")
    private java.util.List < WarningMachines> warningMachines;

    private DescribeWarningMachinesResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.warningMachines = builder.warningMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarningMachinesResponseBody create() {
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

    /**
     * @return warningMachines
     */
    public java.util.List < WarningMachines> getWarningMachines() {
        return this.warningMachines;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < WarningMachines> warningMachines; 

        /**
         * The verification status of the risk item after the risk item is fixed. Valid values:
         * <p>
         * 
         * *   **1**: complete
         * *   **2**: verifying
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The name of the server on which the baseline check is performed.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * An array that consists of the servers.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The value of the field that is used to search for the container.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
         */
        public Builder warningMachines(java.util.List < WarningMachines> warningMachines) {
            this.warningMachines = warningMachines;
            return this;
        }

        public DescribeWarningMachinesResponseBody build() {
            return new DescribeWarningMachinesResponseBody(this);
        } 

    } 

    public static class WarningMachines extends TeaModel {
        @NameInMap("AuthVersion")
        private Integer authVersion;

        @NameInMap("Bind")
        private Boolean bind;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("PortOpen")
        private Boolean portOpen;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uuid")
        private String uuid;

        private WarningMachines(Builder builder) {
            this.authVersion = builder.authVersion;
            this.bind = builder.bind;
            this.containerId = builder.containerId;
            this.containerName = builder.containerName;
            this.highWarningCount = builder.highWarningCount;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
            this.passCount = builder.passCount;
            this.portOpen = builder.portOpen;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningMachines create() {
            return builder().build();
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
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
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return portOpen
         */
        public Boolean getPortOpen() {
            return this.portOpen;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer authVersion; 
            private Boolean bind; 
            private String containerId; 
            private String containerName; 
            private Integer highWarningCount; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 
            private Integer passCount; 
            private Boolean portOpen; 
            private String regionId; 
            private Integer status; 
            private String uuid; 

            /**
             * AuthVersion.
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * Bind.
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * ContainerId.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * ContainerName.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **10**.
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
             * The UUID of the server on which the baseline check is performed. Separate multiple UUIDs with commas (,).
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Queries information about servers on which a baseline check is performed. The information includes the IDs of the servers, the statistics of a risk item, and the status of the risk item.
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * MediumWarningCount.
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * PassCount.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * DescribeWarningMachines
             */
            public Builder portOpen(Boolean portOpen) {
                this.portOpen = portOpen;
                return this;
            }

            /**
             * The number of entries returned on the current page.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public WarningMachines build() {
                return new WarningMachines(this);
            } 

        } 

    }
}
