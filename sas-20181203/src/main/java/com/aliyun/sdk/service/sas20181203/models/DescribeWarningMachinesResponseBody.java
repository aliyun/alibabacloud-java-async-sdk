// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWarningMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWarningMachinesResponseBody</p>
 */
public class DescribeWarningMachinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WarningMachines")
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
         * The number of entries returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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

        /**
         * The information about the servers.
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
        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private Boolean bind;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @com.aliyun.core.annotation.NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("PortOpen")
        private Boolean portOpen;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * The edition of Security Center that is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **1**: Basic edition
             * *   **6**: Anti-virus edition
             * *   **5**: Advanced edition
             * *   **3**: Enterprise edition
             * *   **7**: Ultimate edition
             * *   **10**: Value-added Plan edition
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * The container ID.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The number of **high-risk** items on the server.
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * The server ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The number of **low-risk** items on the server.
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * The number of **medium-risk** items on the server.
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * The number of the check items that passed the baseline check on the server.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * Indicates whether a port on the server is accessible over the Internet. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder portOpen(Boolean portOpen) {
                this.portOpen = portOpen;
                return this;
            }

            /**
             * The ID of the region in which the server is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The verification status of the risk item after the risk item is fixed. Valid values:
             * <p>
             * 
             * *   **1**: complete
             * *   **2**: verifying
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the server on which the baseline check is performed.
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
