// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopsInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopsInGroupResponseBody</p>
 */
public class DescribeDesktopsInGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OnlinePrePaidDesktopsCount")
    private Integer onlinePrePaidDesktopsCount;

    @com.aliyun.core.annotation.NameInMap("PaidDesktops")
    private java.util.List<PaidDesktops> paidDesktops;

    @com.aliyun.core.annotation.NameInMap("PaidDesktopsCount")
    private Integer paidDesktopsCount;

    @com.aliyun.core.annotation.NameInMap("PostPaidDesktops")
    private java.util.List<PostPaidDesktops> postPaidDesktops;

    @com.aliyun.core.annotation.NameInMap("PostPaidDesktopsCount")
    private Integer postPaidDesktopsCount;

    @com.aliyun.core.annotation.NameInMap("PostPaidDesktopsTotalAmount")
    private Integer postPaidDesktopsTotalAmount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningPrePaidDesktopsCount")
    private Integer runningPrePaidDesktopsCount;

    @com.aliyun.core.annotation.NameInMap("StopedPrePaidDesktopsCount")
    private Integer stopedPrePaidDesktopsCount;

    @com.aliyun.core.annotation.NameInMap("StoppedPrePaidDesktopsCount")
    private Integer stoppedPrePaidDesktopsCount;

    private DescribeDesktopsInGroupResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.onlinePrePaidDesktopsCount = builder.onlinePrePaidDesktopsCount;
        this.paidDesktops = builder.paidDesktops;
        this.paidDesktopsCount = builder.paidDesktopsCount;
        this.postPaidDesktops = builder.postPaidDesktops;
        this.postPaidDesktopsCount = builder.postPaidDesktopsCount;
        this.postPaidDesktopsTotalAmount = builder.postPaidDesktopsTotalAmount;
        this.requestId = builder.requestId;
        this.runningPrePaidDesktopsCount = builder.runningPrePaidDesktopsCount;
        this.stopedPrePaidDesktopsCount = builder.stopedPrePaidDesktopsCount;
        this.stoppedPrePaidDesktopsCount = builder.stoppedPrePaidDesktopsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsInGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return onlinePrePaidDesktopsCount
     */
    public Integer getOnlinePrePaidDesktopsCount() {
        return this.onlinePrePaidDesktopsCount;
    }

    /**
     * @return paidDesktops
     */
    public java.util.List<PaidDesktops> getPaidDesktops() {
        return this.paidDesktops;
    }

    /**
     * @return paidDesktopsCount
     */
    public Integer getPaidDesktopsCount() {
        return this.paidDesktopsCount;
    }

    /**
     * @return postPaidDesktops
     */
    public java.util.List<PostPaidDesktops> getPostPaidDesktops() {
        return this.postPaidDesktops;
    }

    /**
     * @return postPaidDesktopsCount
     */
    public Integer getPostPaidDesktopsCount() {
        return this.postPaidDesktopsCount;
    }

    /**
     * @return postPaidDesktopsTotalAmount
     */
    public Integer getPostPaidDesktopsTotalAmount() {
        return this.postPaidDesktopsTotalAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningPrePaidDesktopsCount
     */
    public Integer getRunningPrePaidDesktopsCount() {
        return this.runningPrePaidDesktopsCount;
    }

    /**
     * @return stopedPrePaidDesktopsCount
     */
    public Integer getStopedPrePaidDesktopsCount() {
        return this.stopedPrePaidDesktopsCount;
    }

    /**
     * @return stoppedPrePaidDesktopsCount
     */
    public Integer getStoppedPrePaidDesktopsCount() {
        return this.stoppedPrePaidDesktopsCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer onlinePrePaidDesktopsCount; 
        private java.util.List<PaidDesktops> paidDesktops; 
        private Integer paidDesktopsCount; 
        private java.util.List<PostPaidDesktops> postPaidDesktops; 
        private Integer postPaidDesktopsCount; 
        private Integer postPaidDesktopsTotalAmount; 
        private String requestId; 
        private Integer runningPrePaidDesktopsCount; 
        private Integer stopedPrePaidDesktopsCount; 
        private Integer stoppedPrePaidDesktopsCount; 

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of subscription cloud computers that are in the Connected state.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder onlinePrePaidDesktopsCount(Integer onlinePrePaidDesktopsCount) {
            this.onlinePrePaidDesktopsCount = onlinePrePaidDesktopsCount;
            return this;
        }

        /**
         * <p>The details about subscription cloud computers.</p>
         */
        public Builder paidDesktops(java.util.List<PaidDesktops> paidDesktops) {
            this.paidDesktops = paidDesktops;
            return this;
        }

        /**
         * <p>The total number of queried subscription cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder paidDesktopsCount(Integer paidDesktopsCount) {
            this.paidDesktopsCount = paidDesktopsCount;
            return this;
        }

        /**
         * <p>The details about pay-as-you-go cloud computers.</p>
         */
        public Builder postPaidDesktops(java.util.List<PostPaidDesktops> postPaidDesktops) {
            this.postPaidDesktops = postPaidDesktops;
            return this;
        }

        /**
         * <p>The total number of queried pay-as-you-go cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder postPaidDesktopsCount(Integer postPaidDesktopsCount) {
            this.postPaidDesktopsCount = postPaidDesktopsCount;
            return this;
        }

        /**
         * <p>The total amount of bills for pay-as-you-go cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder postPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
            this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of subscription cloud computers that are in the Running state.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder runningPrePaidDesktopsCount(Integer runningPrePaidDesktopsCount) {
            this.runningPrePaidDesktopsCount = runningPrePaidDesktopsCount;
            return this;
        }

        /**
         * <p>The number of subscription cloud computers that are in the Stopped state.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder stopedPrePaidDesktopsCount(Integer stopedPrePaidDesktopsCount) {
            this.stopedPrePaidDesktopsCount = stopedPrePaidDesktopsCount;
            return this;
        }

        /**
         * <p>The number of subscription cloud computers that are in the Stopped state.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder stoppedPrePaidDesktopsCount(Integer stoppedPrePaidDesktopsCount) {
            this.stoppedPrePaidDesktopsCount = stoppedPrePaidDesktopsCount;
            return this;
        }

        public DescribeDesktopsInGroupResponseBody build() {
            return new DescribeDesktopsInGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopsInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsInGroupResponseBody</p>
     */
    public static class PaidDesktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("EndUserName")
        private String endUserName;

        @com.aliyun.core.annotation.NameInMap("EndUserNames")
        private java.util.List<String> endUserNames;

        @com.aliyun.core.annotation.NameInMap("FotaVersion")
        private String fotaVersion;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ManagementFlag")
        private String managementFlag;

        @com.aliyun.core.annotation.NameInMap("ManagementFlags")
        private java.util.List<String> managementFlags;

        @com.aliyun.core.annotation.NameInMap("MemberEniIp")
        private String memberEniIp;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PrimaryEniIp")
        private String primaryEniIp;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ResetTime")
        private String resetTime;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private PaidDesktops(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.diskType = builder.diskType;
            this.endUserId = builder.endUserId;
            this.endUserIds = builder.endUserIds;
            this.endUserName = builder.endUserName;
            this.endUserNames = builder.endUserNames;
            this.fotaVersion = builder.fotaVersion;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.managementFlag = builder.managementFlag;
            this.managementFlags = builder.managementFlags;
            this.memberEniIp = builder.memberEniIp;
            this.osType = builder.osType;
            this.primaryEniIp = builder.primaryEniIp;
            this.protocolType = builder.protocolType;
            this.resetTime = builder.resetTime;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaidDesktops create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return endUserNames
         */
        public java.util.List<String> getEndUserNames() {
            return this.endUserNames;
        }

        /**
         * @return fotaVersion
         */
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return managementFlags
         */
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        /**
         * @return memberEniIp
         */
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return primaryEniIp
         */
        public String getPrimaryEniIp() {
            return this.primaryEniIp;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return resetTime
         */
        public String getResetTime() {
            return this.resetTime;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String diskType; 
            private String endUserId; 
            private java.util.List<String> endUserIds; 
            private String endUserName; 
            private java.util.List<String> endUserNames; 
            private String fotaVersion; 
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageName; 
            private String managementFlag; 
            private java.util.List<String> managementFlags; 
            private String memberEniIp; 
            private String osType; 
            private String primaryEniIp; 
            private String protocolType; 
            private String resetTime; 
            private Integer systemDiskSize; 

            /**
             * <p>The connection status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Unknown</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Connected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Disconnected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ud-7ftf5b6yu77b0****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Stopped</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Starting</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Rebuilding</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Running</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Stopping</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Expired</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Deleted</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Pending</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The type of the disk.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SYSTEM: system disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>DATA: data disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The ID of the authorized user of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The IDs of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The username of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * <p>The usernames of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
             */
            public Builder endUserNames(java.util.List<String> endUserNames) {
                this.endUserNames = endUserNames;
                return this;
            }

            /**
             * <p>The image version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0-R-20220914.17****</p>
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * <p>The version of the GPU driver.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-hn5v2mmk0****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Win10_ZC</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The flag that is used to manage the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Updating: The configurations of the cloud computer are being updated.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NoFlag: No flags are attached to the cloud computer.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoFlag</p>
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * <p>The flags that are used to manage the cloud computers.</p>
             */
            public Builder managementFlags(java.util.List<String> managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * <p>The IP address of the member network interface controller (NIC) of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder memberEniIp(String memberEniIp) {
                this.memberEniIp = memberEniIp;
                return this;
            }

            /**
             * <p>The OS.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Linux</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Windows</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The IP address of the primary NIC of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder primaryEniIp(String primaryEniIp) {
                this.primaryEniIp = primaryEniIp;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>HDX: High-definition Experience (HDX) protocol</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>ASP: Adaptive Streaming Protocol (ASP) protocol provided by Alibaba Cloud</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The time when the cloud computer was reset.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-03 08:48:08</p>
             */
            public Builder resetTime(String resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * <p>The system disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public PaidDesktops build() {
                return new PaidDesktops(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsInGroupResponseBody</p>
     */
    public static class PostPaidDesktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("CreateDuration")
        private String createDuration;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("EndUserName")
        private String endUserName;

        @com.aliyun.core.annotation.NameInMap("EndUserNames")
        private java.util.List<String> endUserNames;

        @com.aliyun.core.annotation.NameInMap("FotaVersion")
        private String fotaVersion;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ManagementFlag")
        private String managementFlag;

        @com.aliyun.core.annotation.NameInMap("ManagementFlags")
        private java.util.List<String> managementFlags;

        @com.aliyun.core.annotation.NameInMap("MemberEniIp")
        private String memberEniIp;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PrimaryEniIp")
        private String primaryEniIp;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("ResetTime")
        private String resetTime;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private PostPaidDesktops(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.createDuration = builder.createDuration;
            this.createTime = builder.createTime;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.diskType = builder.diskType;
            this.endUserId = builder.endUserId;
            this.endUserIds = builder.endUserIds;
            this.endUserName = builder.endUserName;
            this.endUserNames = builder.endUserNames;
            this.fotaVersion = builder.fotaVersion;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.managementFlag = builder.managementFlag;
            this.managementFlags = builder.managementFlags;
            this.memberEniIp = builder.memberEniIp;
            this.osType = builder.osType;
            this.primaryEniIp = builder.primaryEniIp;
            this.protocolType = builder.protocolType;
            this.releaseTime = builder.releaseTime;
            this.resetTime = builder.resetTime;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostPaidDesktops create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return createDuration
         */
        public String getCreateDuration() {
            return this.createDuration;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return endUserNames
         */
        public java.util.List<String> getEndUserNames() {
            return this.endUserNames;
        }

        /**
         * @return fotaVersion
         */
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return managementFlags
         */
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        /**
         * @return memberEniIp
         */
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return primaryEniIp
         */
        public String getPrimaryEniIp() {
            return this.primaryEniIp;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return resetTime
         */
        public String getResetTime() {
            return this.resetTime;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String createDuration; 
            private String createTime; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String diskType; 
            private String endUserId; 
            private java.util.List<String> endUserIds; 
            private String endUserName; 
            private java.util.List<String> endUserNames; 
            private String fotaVersion; 
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageName; 
            private String managementFlag; 
            private java.util.List<String> managementFlags; 
            private String memberEniIp; 
            private String osType; 
            private String primaryEniIp; 
            private String protocolType; 
            private String releaseTime; 
            private String resetTime; 
            private Integer systemDiskSize; 

            /**
             * <p>The connection status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Unknown</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Connected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Disconnected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The retention period of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>4153958447</p>
             */
            public Builder createDuration(String createDuration) {
                this.createDuration = createDuration;
                return this;
            }

            /**
             * <p>The time when the cloud computer was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-21T06:34:57Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ud-2i8qxpv6t1a07****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Stopped</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Starting</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Rebuilding</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Running</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Stopping</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Expired</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Deleted</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Pending</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Stopped</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The type of the disk.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SYSTEM: system disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>DATA: data disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The ID of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The IDs of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The username of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * <p>The usernames of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
             */
            public Builder endUserNames(java.util.List<String> endUserNames) {
                this.endUserNames = endUserNames;
                return this;
            }

            /**
             * <p>The image version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0-R-20220914.17****</p>
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * <p>The version of the GPU driver.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-hn5v2mmk0****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Win10_ZC</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The flag that is used to manage the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Updating: The configurations of the cloud computer are being updated.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NoFlag: No flags are attached to the cloud computer.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoFlag</p>
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * <p>The flags that are used to manage the cloud computers.</p>
             */
            public Builder managementFlags(java.util.List<String> managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * <p>The IP address of the member NIC of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder memberEniIp(String memberEniIp) {
                this.memberEniIp = memberEniIp;
                return this;
            }

            /**
             * <p>The OS.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Linux</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Windows</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The IP address of the primary NIC of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder primaryEniIp(String primaryEniIp) {
                this.primaryEniIp = primaryEniIp;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>HDX: HDX protocol</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>ASP: ASP protocol provided by Alibaba Cloud</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HDX</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The time when the cloud computer was released.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-21T16:34:57Z</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The time when the cloud computer was reset.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-03 08:48:08</p>
             */
            public Builder resetTime(String resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * <p>The system disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public PostPaidDesktops build() {
                return new PostPaidDesktops(this);
            } 

        } 

    }
}
