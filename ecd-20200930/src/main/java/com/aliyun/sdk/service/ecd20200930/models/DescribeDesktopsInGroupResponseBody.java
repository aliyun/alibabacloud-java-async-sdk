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

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OnlinePrePaidDesktopsCount.
         */
        public Builder onlinePrePaidDesktopsCount(Integer onlinePrePaidDesktopsCount) {
            this.onlinePrePaidDesktopsCount = onlinePrePaidDesktopsCount;
            return this;
        }

        /**
         * PaidDesktops.
         */
        public Builder paidDesktops(java.util.List < PaidDesktops> paidDesktops) {
            this.paidDesktops = paidDesktops;
            return this;
        }

        /**
         * PaidDesktopsCount.
         */
        public Builder paidDesktopsCount(Integer paidDesktopsCount) {
            this.paidDesktopsCount = paidDesktopsCount;
            return this;
        }

        /**
         * PostPaidDesktops.
         */
        public Builder postPaidDesktops(java.util.List < PostPaidDesktops> postPaidDesktops) {
            this.postPaidDesktops = postPaidDesktops;
            return this;
        }

        /**
         * PostPaidDesktopsCount.
         */
        public Builder postPaidDesktopsCount(Integer postPaidDesktopsCount) {
            this.postPaidDesktopsCount = postPaidDesktopsCount;
            return this;
        }

        /**
         * PostPaidDesktopsTotalAmount.
         */
        public Builder postPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
            this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunningPrePaidDesktopsCount.
         */
        public Builder runningPrePaidDesktopsCount(Integer runningPrePaidDesktopsCount) {
            this.runningPrePaidDesktopsCount = runningPrePaidDesktopsCount;
            return this;
        }

        /**
         * StopedPrePaidDesktopsCount.
         */
        public Builder stopedPrePaidDesktopsCount(Integer stopedPrePaidDesktopsCount) {
            this.stopedPrePaidDesktopsCount = stopedPrePaidDesktopsCount;
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

        @NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        @NameInMap("OsType")
        private String osType;

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
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.managementFlag = builder.managementFlag;
            this.osType = builder.osType;
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
         * @return osType
         */
        public String getOsType() {
            return this.osType;
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
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageName; 
            private String managementFlag; 
            private String osType; 
            private String resetTime; 
            private Integer systemDiskSize; 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DesktopStatus.
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EndUserIds.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * EndUserName.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * EndUserNames.
             */
            public Builder endUserNames(java.util.List < String > endUserNames) {
                this.endUserNames = endUserNames;
                return this;
            }

            /**
             * GpuDriverVersion.
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ManagementFlag.
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * ResetTime.
             */
            public Builder resetTime(String resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * SystemDiskSize.
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

        @NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        @NameInMap("OsType")
        private String osType;

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
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.managementFlag = builder.managementFlag;
            this.osType = builder.osType;
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
         * @return osType
         */
        public String getOsType() {
            return this.osType;
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
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageName; 
            private String managementFlag; 
            private String osType; 
            private String releaseTime; 
            private String resetTime; 
            private Integer systemDiskSize; 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * CreateDuration.
             */
            public Builder createDuration(String createDuration) {
                this.createDuration = createDuration;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DesktopStatus.
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EndUserIds.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * EndUserName.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * EndUserNames.
             */
            public Builder endUserNames(java.util.List < String > endUserNames) {
                this.endUserNames = endUserNames;
                return this;
            }

            /**
             * GpuDriverVersion.
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ManagementFlag.
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * ResetTime.
             */
            public Builder resetTime(String resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * SystemDiskSize.
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
