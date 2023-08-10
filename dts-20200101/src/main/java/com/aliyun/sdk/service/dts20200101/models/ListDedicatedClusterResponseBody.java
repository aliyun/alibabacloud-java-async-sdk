// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDedicatedClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ListDedicatedClusterResponseBody</p>
 */
public class ListDedicatedClusterResponseBody extends TeaModel {
    @NameInMap("DedicatedClusterStatusList")
    private DedicatedClusterStatusList dedicatedClusterStatusList;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListDedicatedClusterResponseBody(Builder builder) {
        this.dedicatedClusterStatusList = builder.dedicatedClusterStatusList;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDedicatedClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedClusterStatusList
     */
    public DedicatedClusterStatusList getDedicatedClusterStatusList() {
        return this.dedicatedClusterStatusList;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private DedicatedClusterStatusList dedicatedClusterStatusList; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private Integer totalRecordCount; 

        /**
         * The statuses of all clusters.
         */
        public Builder dedicatedClusterStatusList(DedicatedClusterStatusList dedicatedClusterStatusList) {
            this.dedicatedClusterStatusList = dedicatedClusterStatusList;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The page number of the returned page. The value must be an integer that is greater than 0. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Indicates whether the request was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of clusters that meet the query condition.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListDedicatedClusterResponseBody build() {
            return new ListDedicatedClusterResponseBody(this);
        } 

    } 

    public static class DedicatedClusterStatus extends TeaModel {
        @NameInMap("CpuUtilization")
        private Long cpuUtilization;

        @NameInMap("DedicatedClusterId")
        private String dedicatedClusterId;

        @NameInMap("DedicatedClusterName")
        private String dedicatedClusterName;

        @NameInMap("DiskUtilization")
        private Long diskUtilization;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("Du")
        private Long du;

        @NameInMap("DuUtilization")
        private Long duUtilization;

        @NameInMap("GmtCreated")
        private Long gmtCreated;

        @NameInMap("MemUtilization")
        private Long memUtilization;

        @NameInMap("NodeCount")
        private Long nodeCount;

        @NameInMap("OversoldDu")
        private Long oversoldDu;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        @NameInMap("TotalCpuCore")
        private Long totalCpuCore;

        @NameInMap("TotalDiskGBSize")
        private Long totalDiskGBSize;

        @NameInMap("TotalMemGBSize")
        private Long totalMemGBSize;

        @NameInMap("UsedCpuCore")
        private Long usedCpuCore;

        @NameInMap("UsedDiskGBSize")
        private Long usedDiskGBSize;

        @NameInMap("UsedDu")
        private Long usedDu;

        @NameInMap("UsedMemGBSize")
        private Long usedMemGBSize;

        private DedicatedClusterStatus(Builder builder) {
            this.cpuUtilization = builder.cpuUtilization;
            this.dedicatedClusterId = builder.dedicatedClusterId;
            this.dedicatedClusterName = builder.dedicatedClusterName;
            this.diskUtilization = builder.diskUtilization;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.du = builder.du;
            this.duUtilization = builder.duUtilization;
            this.gmtCreated = builder.gmtCreated;
            this.memUtilization = builder.memUtilization;
            this.nodeCount = builder.nodeCount;
            this.oversoldDu = builder.oversoldDu;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.totalCpuCore = builder.totalCpuCore;
            this.totalDiskGBSize = builder.totalDiskGBSize;
            this.totalMemGBSize = builder.totalMemGBSize;
            this.usedCpuCore = builder.usedCpuCore;
            this.usedDiskGBSize = builder.usedDiskGBSize;
            this.usedDu = builder.usedDu;
            this.usedMemGBSize = builder.usedMemGBSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedClusterStatus create() {
            return builder().build();
        }

        /**
         * @return cpuUtilization
         */
        public Long getCpuUtilization() {
            return this.cpuUtilization;
        }

        /**
         * @return dedicatedClusterId
         */
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        /**
         * @return dedicatedClusterName
         */
        public String getDedicatedClusterName() {
            return this.dedicatedClusterName;
        }

        /**
         * @return diskUtilization
         */
        public Long getDiskUtilization() {
            return this.diskUtilization;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return du
         */
        public Long getDu() {
            return this.du;
        }

        /**
         * @return duUtilization
         */
        public Long getDuUtilization() {
            return this.duUtilization;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return memUtilization
         */
        public Long getMemUtilization() {
            return this.memUtilization;
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return oversoldDu
         */
        public Long getOversoldDu() {
            return this.oversoldDu;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return totalCpuCore
         */
        public Long getTotalCpuCore() {
            return this.totalCpuCore;
        }

        /**
         * @return totalDiskGBSize
         */
        public Long getTotalDiskGBSize() {
            return this.totalDiskGBSize;
        }

        /**
         * @return totalMemGBSize
         */
        public Long getTotalMemGBSize() {
            return this.totalMemGBSize;
        }

        /**
         * @return usedCpuCore
         */
        public Long getUsedCpuCore() {
            return this.usedCpuCore;
        }

        /**
         * @return usedDiskGBSize
         */
        public Long getUsedDiskGBSize() {
            return this.usedDiskGBSize;
        }

        /**
         * @return usedDu
         */
        public Long getUsedDu() {
            return this.usedDu;
        }

        /**
         * @return usedMemGBSize
         */
        public Long getUsedMemGBSize() {
            return this.usedMemGBSize;
        }

        public static final class Builder {
            private Long cpuUtilization; 
            private String dedicatedClusterId; 
            private String dedicatedClusterName; 
            private Long diskUtilization; 
            private String dtsInstanceID; 
            private Long du; 
            private Long duUtilization; 
            private Long gmtCreated; 
            private Long memUtilization; 
            private Long nodeCount; 
            private Long oversoldDu; 
            private String regionId; 
            private String state; 
            private Long totalCpuCore; 
            private Long totalDiskGBSize; 
            private Long totalMemGBSize; 
            private Long usedCpuCore; 
            private Long usedDiskGBSize; 
            private Long usedDu; 
            private Long usedMemGBSize; 

            /**
             * The CPU utilization, in percentage.
             */
            public Builder cpuUtilization(Long cpuUtilization) {
                this.cpuUtilization = cpuUtilization;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder dedicatedClusterName(String dedicatedClusterName) {
                this.dedicatedClusterName = dedicatedClusterName;
                return this;
            }

            /**
             * The disk usage.
             */
            public Builder diskUtilization(Long diskUtilization) {
                this.diskUtilization = diskUtilization;
                return this;
            }

            /**
             * The ID of the DTS instance.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The number of DTS units (DUs).
             */
            public Builder du(Long du) {
                this.du = du;
                return this;
            }

            /**
             * The DU usage, in percentage.
             */
            public Builder duUtilization(Long duUtilization) {
                this.duUtilization = duUtilization;
                return this;
            }

            /**
             * The time when the cluster was created.
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The memory usage.
             */
            public Builder memUtilization(Long memUtilization) {
                this.memUtilization = memUtilization;
                return this;
            }

            /**
             * The number of nodes in the cluster.
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * The number of over-provisioned DUs.
             */
            public Builder oversoldDu(Long oversoldDu) {
                this.oversoldDu = oversoldDu;
                return this;
            }

            /**
             * The ID of the region in which the DTS instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   **init**: The cluster is being initialized.
             * *   **schedule**: The cluster is pending scheduling.
             * *   **running**: The cluster is running.
             * *   **upgrade**: The cluster is being upgraded.
             * *   **downgrade**: The cluster is being downgraded.
             * *   **locked**: The cluster is locked.
             * *   **releasing**: The cluster is being released.
             * *   **released**: The cluster is released.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The total number of CPU cores.
             */
            public Builder totalCpuCore(Long totalCpuCore) {
                this.totalCpuCore = totalCpuCore;
                return this;
            }

            /**
             * The total disk capacity. Unit: GB.
             */
            public Builder totalDiskGBSize(Long totalDiskGBSize) {
                this.totalDiskGBSize = totalDiskGBSize;
                return this;
            }

            /**
             * The total memory capacity. Unit: GB.
             */
            public Builder totalMemGBSize(Long totalMemGBSize) {
                this.totalMemGBSize = totalMemGBSize;
                return this;
            }

            /**
             * The number of used CPU cores.
             */
            public Builder usedCpuCore(Long usedCpuCore) {
                this.usedCpuCore = usedCpuCore;
                return this;
            }

            /**
             * The used disk capacity. Unit: GB.
             */
            public Builder usedDiskGBSize(Long usedDiskGBSize) {
                this.usedDiskGBSize = usedDiskGBSize;
                return this;
            }

            /**
             * The number of used DUs.
             */
            public Builder usedDu(Long usedDu) {
                this.usedDu = usedDu;
                return this;
            }

            /**
             * The used memory capacity. Unit: GB.
             */
            public Builder usedMemGBSize(Long usedMemGBSize) {
                this.usedMemGBSize = usedMemGBSize;
                return this;
            }

            public DedicatedClusterStatus build() {
                return new DedicatedClusterStatus(this);
            } 

        } 

    }
    public static class DedicatedClusterStatusList extends TeaModel {
        @NameInMap("DedicatedClusterStatus")
        private java.util.List < DedicatedClusterStatus> dedicatedClusterStatus;

        private DedicatedClusterStatusList(Builder builder) {
            this.dedicatedClusterStatus = builder.dedicatedClusterStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedClusterStatusList create() {
            return builder().build();
        }

        /**
         * @return dedicatedClusterStatus
         */
        public java.util.List < DedicatedClusterStatus> getDedicatedClusterStatus() {
            return this.dedicatedClusterStatus;
        }

        public static final class Builder {
            private java.util.List < DedicatedClusterStatus> dedicatedClusterStatus; 

            /**
             * DedicatedClusterStatus.
             */
            public Builder dedicatedClusterStatus(java.util.List < DedicatedClusterStatus> dedicatedClusterStatus) {
                this.dedicatedClusterStatus = dedicatedClusterStatus;
                return this;
            }

            public DedicatedClusterStatusList build() {
                return new DedicatedClusterStatusList(this);
            } 

        } 

    }
}
