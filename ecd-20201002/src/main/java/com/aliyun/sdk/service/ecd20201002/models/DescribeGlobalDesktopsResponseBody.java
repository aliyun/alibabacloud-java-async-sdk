// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDesktopsResponseBody</p>
 */
public class DescribeGlobalDesktopsResponseBody extends TeaModel {
    @NameInMap("Desktops")
    private java.util.List < Desktops> desktops;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGlobalDesktopsResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDesktopsResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktops
     */
    public java.util.List < Desktops> getDesktops() {
        return this.desktops;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Desktops> desktops; 
        private String nextToken; 
        private String requestId; 

        /**
         * Desktops.
         */
        public Builder desktops(java.util.List < Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGlobalDesktopsResponseBody build() {
            return new DescribeGlobalDesktopsResponseBody(this);
        } 

    } 

    public static class Clients extends TeaModel {
        @NameInMap("ClientType")
        private String clientType;

        @NameInMap("Status")
        private String status;

        private Clients(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clientType; 
            private String status; 

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
    public static class DesktopTimers extends TeaModel {
        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("Enforce")
        private Boolean enforce;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("ResetType")
        private String resetType;

        @NameInMap("TimerType")
        private String timerType;

        private DesktopTimers(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.resetType = builder.resetType;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTimers create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private String resetType; 
            private String timerType; 

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Enforce.
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * TimerType.
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public DesktopTimers build() {
                return new DesktopTimers(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private String diskType;

        private Disks(Builder builder) {
            this.diskId = builder.diskId;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private String diskId; 
            private Integer diskSize; 
            private String diskType; 

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    public static class FotaUpdate extends TeaModel {
        @NameInMap("Channel")
        private String channel;

        @NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @NameInMap("Force")
        private Boolean force;

        @NameInMap("NewAppVersion")
        private String newAppVersion;

        @NameInMap("Project")
        private String project;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("Size")
        private String size;

        private FotaUpdate(Builder builder) {
            this.channel = builder.channel;
            this.currentAppVersion = builder.currentAppVersion;
            this.force = builder.force;
            this.newAppVersion = builder.newAppVersion;
            this.project = builder.project;
            this.releaseNote = builder.releaseNote;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaUpdate create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return currentAppVersion
         */
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /**
         * @return force
         */
        public Boolean getForce() {
            return this.force;
        }

        /**
         * @return newAppVersion
         */
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String channel; 
            private String currentAppVersion; 
            private Boolean force; 
            private String newAppVersion; 
            private String project; 
            private String releaseNote; 
            private String size; 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * CurrentAppVersion.
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * Force.
             */
            public Builder force(Boolean force) {
                this.force = force;
                return this;
            }

            /**
             * NewAppVersion.
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public FotaUpdate build() {
                return new FotaUpdate(this);
            } 

        } 

    }
    public static class Sessions extends TeaModel {
        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EstablishmentTime")
        private String establishmentTime;

        private Sessions(Builder builder) {
            this.endUserId = builder.endUserId;
            this.establishmentTime = builder.establishmentTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return establishmentTime
         */
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        public static final class Builder {
            private String endUserId; 
            private String establishmentTime; 

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EstablishmentTime.
             */
            public Builder establishmentTime(String establishmentTime) {
                this.establishmentTime = establishmentTime;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    public static class Desktops extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Clients")
        private java.util.List < Clients> clients;

        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("DesktopTimers")
        private java.util.List < DesktopTimers> desktopTimers;

        @NameInMap("DesktopType")
        private String desktopType;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("Disks")
        private java.util.List < Disks> disks;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("FotaUpdate")
        private FotaUpdate fotaUpdate;

        @NameInMap("GpuMemory")
        private Integer gpuMemory;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("LastStartTime")
        private String lastStartTime;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ManagementFlags")
        private java.util.List < String > managementFlags;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("PolicyGroupId")
        private String policyGroupId;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RealDesktopId")
        private String realDesktopId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Sessions")
        private java.util.List < Sessions> sessions;

        @NameInMap("UserCustomName")
        private String userCustomName;

        private Desktops(Builder builder) {
            this.chargeType = builder.chargeType;
            this.clients = builder.clients;
            this.connectionStatus = builder.connectionStatus;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.desktopTimers = builder.desktopTimers;
            this.desktopType = builder.desktopType;
            this.directoryId = builder.directoryId;
            this.disks = builder.disks;
            this.endUserId = builder.endUserId;
            this.endUserIds = builder.endUserIds;
            this.expiredTime = builder.expiredTime;
            this.fotaUpdate = builder.fotaUpdate;
            this.gpuMemory = builder.gpuMemory;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.lastStartTime = builder.lastStartTime;
            this.localName = builder.localName;
            this.managementFlags = builder.managementFlags;
            this.memory = builder.memory;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.osType = builder.osType;
            this.policyGroupId = builder.policyGroupId;
            this.protocolType = builder.protocolType;
            this.realDesktopId = builder.realDesktopId;
            this.regionId = builder.regionId;
            this.sessions = builder.sessions;
            this.userCustomName = builder.userCustomName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clients
         */
        public java.util.List < Clients> getClients() {
            return this.clients;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
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
         * @return desktopTimers
         */
        public java.util.List < DesktopTimers> getDesktopTimers() {
            return this.desktopTimers;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return disks
         */
        public java.util.List < Disks> getDisks() {
            return this.disks;
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return fotaUpdate
         */
        public FotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        /**
         * @return gpuMemory
         */
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return lastStartTime
         */
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return managementFlags
         */
        public java.util.List < String > getManagementFlags() {
            return this.managementFlags;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return realDesktopId
         */
        public String getRealDesktopId() {
            return this.realDesktopId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sessions
         */
        public java.util.List < Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return userCustomName
         */
        public String getUserCustomName() {
            return this.userCustomName;
        }

        public static final class Builder {
            private String chargeType; 
            private java.util.List < Clients> clients; 
            private String connectionStatus; 
            private Integer cpu; 
            private String creationTime; 
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private java.util.List < DesktopTimers> desktopTimers; 
            private String desktopType; 
            private String directoryId; 
            private java.util.List < Disks> disks; 
            private String endUserId; 
            private java.util.List < String > endUserIds; 
            private String expiredTime; 
            private FotaUpdate fotaUpdate; 
            private Integer gpuMemory; 
            private String hostName; 
            private String imageId; 
            private String lastStartTime; 
            private String localName; 
            private java.util.List < String > managementFlags; 
            private Long memory; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String osType; 
            private String policyGroupId; 
            private String protocolType; 
            private String realDesktopId; 
            private String regionId; 
            private java.util.List < Sessions> sessions; 
            private String userCustomName; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Clients.
             */
            public Builder clients(java.util.List < Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DesktopGroupId.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
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
             * DesktopTimers.
             */
            public Builder desktopTimers(java.util.List < DesktopTimers> desktopTimers) {
                this.desktopTimers = desktopTimers;
                return this;
            }

            /**
             * DesktopType.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * Disks.
             */
            public Builder disks(java.util.List < Disks> disks) {
                this.disks = disks;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * FotaUpdate.
             */
            public Builder fotaUpdate(FotaUpdate fotaUpdate) {
                this.fotaUpdate = fotaUpdate;
                return this;
            }

            /**
             * GpuMemory.
             */
            public Builder gpuMemory(Integer gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
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
             * LastStartTime.
             */
            public Builder lastStartTime(String lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ManagementFlags.
             */
            public Builder managementFlags(java.util.List < String > managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NetworkInterfaceIp.
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
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
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * RealDesktopId.
             */
            public Builder realDesktopId(String realDesktopId) {
                this.realDesktopId = realDesktopId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Sessions.
             */
            public Builder sessions(java.util.List < Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * UserCustomName.
             */
            public Builder userCustomName(String userCustomName) {
                this.userCustomName = userCustomName;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
