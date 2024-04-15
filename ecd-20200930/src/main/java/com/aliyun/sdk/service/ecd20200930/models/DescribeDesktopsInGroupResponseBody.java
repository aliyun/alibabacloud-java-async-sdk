// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopsInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopsInGroupResponseBody</p>
 */
public class DescribeDesktopsInGroupResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OnlinePrePaidDesktopsCount")
    private Integer onlinePrePaidDesktopsCount;

    @NameInMap("PaidDesktops")
    private java.util.List < PaidDesktops> paidDesktops;

    @NameInMap("PaidDesktopsCount")
    private Integer paidDesktopsCount;

    @NameInMap("PostPaidDesktops")
    private java.util.List < PostPaidDesktops> postPaidDesktops;

    @NameInMap("PostPaidDesktopsCount")
    private Integer postPaidDesktopsCount;

    @NameInMap("PostPaidDesktopsTotalAmount")
    private Integer postPaidDesktopsTotalAmount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunningPrePaidDesktopsCount")
    private Integer runningPrePaidDesktopsCount;

    @NameInMap("StopedPrePaidDesktopsCount")
    private Integer stopedPrePaidDesktopsCount;

    @NameInMap("StoppedPrePaidDesktopsCount")
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
    public java.util.List < PaidDesktops> getPaidDesktops() {
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
    public java.util.List < PostPaidDesktops> getPostPaidDesktops() {
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
        private java.util.List < PaidDesktops> paidDesktops; 
        private Integer paidDesktopsCount; 
        private java.util.List < PostPaidDesktops> postPaidDesktops; 
        private Integer postPaidDesktopsCount; 
        private Integer postPaidDesktopsTotalAmount; 
        private String requestId; 
        private Integer runningPrePaidDesktopsCount; 
        private Integer stopedPrePaidDesktopsCount; 
        private Integer stoppedPrePaidDesktopsCount; 

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of subscription cloud computers that are in the Connected state.
         */
        public Builder onlinePrePaidDesktopsCount(Integer onlinePrePaidDesktopsCount) {
            this.onlinePrePaidDesktopsCount = onlinePrePaidDesktopsCount;
            return this;
        }

        /**
         * The details about subscription cloud computers.
         */
        public Builder paidDesktops(java.util.List < PaidDesktops> paidDesktops) {
            this.paidDesktops = paidDesktops;
            return this;
        }

        /**
         * The total number of queried subscription cloud computers.
         */
        public Builder paidDesktopsCount(Integer paidDesktopsCount) {
            this.paidDesktopsCount = paidDesktopsCount;
            return this;
        }

        /**
         * The details about pay-as-you-go cloud computers.
         */
        public Builder postPaidDesktops(java.util.List < PostPaidDesktops> postPaidDesktops) {
            this.postPaidDesktops = postPaidDesktops;
            return this;
        }

        /**
         * The total number of queried pay-as-you-go cloud computers.
         */
        public Builder postPaidDesktopsCount(Integer postPaidDesktopsCount) {
            this.postPaidDesktopsCount = postPaidDesktopsCount;
            return this;
        }

        /**
         * The total amount of bills for pay-as-you-go cloud computers.
         */
        public Builder postPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
            this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of subscription cloud computers that are in the Running state.
         */
        public Builder runningPrePaidDesktopsCount(Integer runningPrePaidDesktopsCount) {
            this.runningPrePaidDesktopsCount = runningPrePaidDesktopsCount;
            return this;
        }

        /**
         * The number of subscription cloud computers that are in the Stopped state.
         */
        public Builder stopedPrePaidDesktopsCount(Integer stopedPrePaidDesktopsCount) {
            this.stopedPrePaidDesktopsCount = stopedPrePaidDesktopsCount;
            return this;
        }

        /**
         * The number of subscription cloud computers that are in the Stopped state.
         */
        public Builder stoppedPrePaidDesktopsCount(Integer stoppedPrePaidDesktopsCount) {
            this.stoppedPrePaidDesktopsCount = stoppedPrePaidDesktopsCount;
            return this;
        }

        public DescribeDesktopsInGroupResponseBody build() {
            return new DescribeDesktopsInGroupResponseBody(this);
        } 

    } 

    public static class PaidDesktops extends TeaModel {
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @NameInMap("EndUserName")
        private String endUserName;

        @NameInMap("EndUserNames")
        private java.util.List < String > endUserNames;

        @NameInMap("FotaVersion")
        private String fotaVersion;

        @NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        @NameInMap("ManagementFlags")
        private java.util.List < String > managementFlags;

        @NameInMap("MemberEniIp")
        private String memberEniIp;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("PrimaryEniIp")
        private String primaryEniIp;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("ResetTime")
        private String resetTime;

        @NameInMap("SystemDiskSize")
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
        public java.util.List < String > getEndUserIds() {
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
        public java.util.List < String > getEndUserNames() {
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
        public java.util.List < String > getManagementFlags() {
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
            private java.util.List < String > endUserIds; 
            private String endUserName; 
            private java.util.List < String > endUserNames; 
            private String fotaVersion; 
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageName; 
            private String managementFlag; 
            private java.util.List < String > managementFlags; 
            private String memberEniIp; 
            private String osType; 
            private String primaryEniIp; 
            private String protocolType; 
            private String resetTime; 
            private Integer systemDiskSize; 

            /**
             * The connection status of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Unknown
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Connected
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Disconnected
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * The ID of the cloud computer.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the cloud computer.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The status of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Stopped
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Starting
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Rebuilding
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Running
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Stopping
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Expired
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Deleted
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Pending
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * The type of the disk.
             * <p>
             * 
             * Valid values:
             * 
             * *   SYSTEM: system disk
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DATA: data disk
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The ID of the authorized user of the cloud computer.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The IDs of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * The username of the authorized user.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * The usernames of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.
             */
            public Builder endUserNames(java.util.List < String > endUserNames) {
                this.endUserNames = endUserNames;
                return this;
            }

            /**
             * The image version.
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * The version of the GPU driver.
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The image name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The flag that is used to manage the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Updating: The configurations of the cloud computer are being updated.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoFlag: No flags are attached to the cloud computer.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * The flags that are used to manage the cloud computers.
             */
            public Builder managementFlags(java.util.List < String > managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * The IP address of the member network interface controller (NIC) of the instance.
             */
            public Builder memberEniIp(String memberEniIp) {
                this.memberEniIp = memberEniIp;
                return this;
            }

            /**
             * The OS.
             * <p>
             * 
             * Valid values:
             * 
             * *   Linux
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Windows
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The IP address of the primary NIC of the instance.
             */
            public Builder primaryEniIp(String primaryEniIp) {
                this.primaryEniIp = primaryEniIp;
                return this;
            }

            /**
             * The protocol.
             * <p>
             * 
             * Valid values:
             * 
             * *   HDX: High-definition Experience (HDX) protocol
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ASP: Adaptive Streaming Protocol (ASP) protocol provided by Alibaba Cloud
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The time when the cloud computer was reset.
             */
            public Builder resetTime(String resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * The system disk size. Unit: GiB.
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
    public static class PostPaidDesktops extends TeaModel {
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("CreateDuration")
        private String createDuration;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @NameInMap("EndUserName")
        private String endUserName;

        @NameInMap("EndUserNames")
        private java.util.List < String > endUserNames;

        @NameInMap("FotaVersion")
        private String fotaVersion;

        @NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        @NameInMap("ManagementFlags")
        private java.util.List < String > managementFlags;

        @NameInMap("MemberEniIp")
        private String memberEniIp;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("PrimaryEniIp")
        private String primaryEniIp;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("ReleaseTime")
        private String releaseTime;

        @NameInMap("ResetTime")
        private String resetTime;

        @NameInMap("SystemDiskSize")
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
        public java.util.List < String > getEndUserIds() {
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
        public java.util.List < String > getEndUserNames() {
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
        public java.util.List < String > getManagementFlags() {
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
            private java.util.List < String > endUserIds; 
            private String endUserName; 
            private java.util.List < String > endUserNames; 
            private String fotaVersion; 
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageName; 
            private String managementFlag; 
            private java.util.List < String > managementFlags; 
            private String memberEniIp; 
            private String osType; 
            private String primaryEniIp; 
            private String protocolType; 
            private String releaseTime; 
            private String resetTime; 
            private Integer systemDiskSize; 

            /**
             * The connection status of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Unknown
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Connected
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Disconnected
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * The retention period of the cloud computer.
             */
            public Builder createDuration(String createDuration) {
                this.createDuration = createDuration;
                return this;
            }

            /**
             * The time when the cloud computer was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the cloud computer.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the cloud computer.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The status of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Stopped
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Starting
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Rebuilding
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Running
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Stopping
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Expired
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Deleted
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Pending
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * The type of the disk.
             * <p>
             * 
             * Valid values:
             * 
             * *   SYSTEM: system disk
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DATA: data disk
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The ID of the authorized user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The IDs of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * The username of the authorized user.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * The usernames of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.
             */
            public Builder endUserNames(java.util.List < String > endUserNames) {
                this.endUserNames = endUserNames;
                return this;
            }

            /**
             * The image version.
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * The version of the GPU driver.
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The image name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The flag that is used to manage the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Updating: The configurations of the cloud computer are being updated.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NoFlag: No flags are attached to the cloud computer.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * The flags that are used to manage the cloud computers.
             */
            public Builder managementFlags(java.util.List < String > managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * The IP address of the member NIC of the instance.
             */
            public Builder memberEniIp(String memberEniIp) {
                this.memberEniIp = memberEniIp;
                return this;
            }

            /**
             * The OS.
             * <p>
             * 
             * Valid values:
             * 
             * *   Linux
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Windows
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The IP address of the primary NIC of the instance.
             */
            public Builder primaryEniIp(String primaryEniIp) {
                this.primaryEniIp = primaryEniIp;
                return this;
            }

            /**
             * The protocol.
             * <p>
             * 
             * Valid values:
             * 
             * *   HDX: HDX protocol
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ASP: ASP protocol provided by Alibaba Cloud
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The time when the cloud computer was released.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The time when the cloud computer was reset.
             */
            public Builder resetTime(String resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * The system disk size. Unit: GiB.
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
