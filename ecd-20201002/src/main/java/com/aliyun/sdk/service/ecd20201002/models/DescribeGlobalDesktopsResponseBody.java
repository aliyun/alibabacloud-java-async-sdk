// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDesktopsResponseBody</p>
 */
public class DescribeGlobalDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private java.util.List<Desktops> desktops;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktops
     */
    public java.util.List<Desktops> getDesktops() {
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
        private java.util.List<Desktops> desktops; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGlobalDesktopsResponseBody model) {
            this.desktops = model.desktops;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the cloud computer.</p>
         */
        public Builder desktops(java.util.List<Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * <p>The token used to start the next query. If NextToken is empty, it indicates that there is no next query.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJkZWZhdWx0IjpbIjIwMjItMDgtMTdUM****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4686A731-D601-548C-83E2-4CB6371E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGlobalDesktopsResponseBody build() {
            return new DescribeGlobalDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Clients model) {
                this.clientType = model.clientType;
                this.status = model.status;
            } 

            /**
             * <p>The client type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>html5: the web client.</li>
             * <li>android: the Android client.</li>
             * <li>linux: Linux client.</li>
             * <li>ios: the iOS client.</li>
             * <li>windows: the Windows client.</li>
             * <li>macos: the macOS client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The status of the client.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>OFF: does not allow logon.</li>
             * <li>ON: allows logon.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
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
    /**
     * 
     * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopsResponseBody</p>
     */
    public static class DesktopTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("ExecutionTime")
        private String executionTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private DesktopTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.executionTime = builder.executionTime;
            this.interval = builder.interval;
            this.operationType = builder.operationType;
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
         * @return allowClientSetting
         */
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
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
         * @return executionTime
         */
        public String getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
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
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private String executionTime; 
            private Integer interval; 
            private String operationType; 
            private String resetType; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(DesktopTimers model) {
                this.allowClientSetting = model.allowClientSetting;
                this.cronExpression = model.cronExpression;
                this.enforce = model.enforce;
                this.executionTime = model.executionTime;
                this.interval = model.interval;
                this.operationType = model.operationType;
                this.resetType = model.resetType;
                this.timerType = model.timerType;
            } 

            /**
             * <p>Whether to allow clients to set policies.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The CRON expression for the scheduled task.</p>
             * <p>For example, a <code>0 0 4 1/1 * ?</code> indicates that the operation is executed every day from 4:00 a.m. on the first day of each month.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 ? * 1</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Indicates whether to forcibly execute the scheduled task. To <code>true</code> indicates that cloud computer and connection status detection are ignored, and scheduled tasks are forcibly executed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The task duration.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-31T15:59Z</p>
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * <p>The interval at which the monitoring data was queried. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HIBERNATE</li>
             * <li>SHUTDOWN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SHUTDOWN</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>For a reset task, you must set the reset type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RESET_TYPE_SYSTEM: resets the system disk.</li>
             * <li>RESET_TYPE_USER_DISK: resets the data disk.</li>
             * <li>RESET_TYPE_BOTH: resets the system disk and data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_BOTH</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NoOperationDisconnect: scheduled disconnection upon inactivity.</li>
             * <li>NoConnectShutdown: connectionless shutdown.</li>
             * <li>TimerBoot: scheduled start.</li>
             * <li>TimerReset: scheduled reset.</li>
             * <li>NoOperationShutdown: scheduled shutdown upon inactivity.</li>
             * <li>TimerShutdown: Stops the cloud computers on schedule.</li>
             * <li>NoOperationReboot: scheduled restart upon inactivity.</li>
             * <li>TimerReboot: scheduled restart.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoConnectShutdown</p>
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
    /**
     * 
     * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopsResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
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

            private Builder() {
            } 

            private Builder(Disks model) {
                this.diskId = model.diskId;
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
            } 

            /**
             * <p>The disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-jedbpr4sl9l37****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The disk type.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>SYSTEM: a system disk.</li>
             * <li>DATA: a data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
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
    /**
     * 
     * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopsResponseBody</p>
     */
    public static class FotaUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @com.aliyun.core.annotation.NameInMap("Force")
        private Boolean force;

        @com.aliyun.core.annotation.NameInMap("NewAppVersion")
        private String newAppVersion;

        @com.aliyun.core.annotation.NameInMap("NewDcdVersion")
        private String newDcdVersion;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteJp")
        private String releaseNoteJp;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private FotaUpdate(Builder builder) {
            this.channel = builder.channel;
            this.currentAppVersion = builder.currentAppVersion;
            this.force = builder.force;
            this.newAppVersion = builder.newAppVersion;
            this.newDcdVersion = builder.newDcdVersion;
            this.project = builder.project;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.releaseNoteJp = builder.releaseNoteJp;
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
         * @return newDcdVersion
         */
        public String getNewDcdVersion() {
            return this.newDcdVersion;
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
         * @return releaseNoteEn
         */
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        /**
         * @return releaseNoteJp
         */
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
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
            private String newDcdVersion; 
            private String project; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String releaseNoteJp; 
            private String size; 

            private Builder() {
            } 

            private Builder(FotaUpdate model) {
                this.channel = model.channel;
                this.currentAppVersion = model.currentAppVersion;
                this.force = model.force;
                this.newAppVersion = model.newAppVersion;
                this.newDcdVersion = model.newDcdVersion;
                this.project = model.project;
                this.releaseNote = model.releaseNote;
                this.releaseNoteEn = model.releaseNoteEn;
                this.releaseNoteJp = model.releaseNoteJp;
                this.size = model.size;
            } 

            /**
             * <p>Subscription Channel</p>
             * 
             * <strong>example:</strong>
             * <p>Enterprise</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The current version number of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0-D-20220102.xxxx</p>
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * <p>Whether to force upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder force(Boolean force) {
                this.force = force;
                return this;
            }

            /**
             * <p>The version number of the application after the update.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0-R-20220307.xxxx</p>
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * NewDcdVersion.
             */
            public Builder newDcdVersion(String newDcdVersion) {
                this.newDcdVersion = newDcdVersion;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>testProject</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The description of the version that can be upgraded.</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The English release note for the new image version.</p>
             * 
             * <strong>example:</strong>
             * <p>Release note</p>
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * <p>The Japanese release note for the new image version.</p>
             * 
             * <strong>example:</strong>
             * <p>リリースノート</p>
             */
            public Builder releaseNoteJp(String releaseNoteJp) {
                this.releaseNoteJp = releaseNoteJp;
                return this;
            }

            /**
             * <p>The size of the update package for the cloud computer image. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EstablishmentTime")
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

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.endUserId = model.endUserId;
                this.establishmentTime = model.establishmentTime;
            } 

            /**
             * <p>End user information.</p>
             * 
             * <strong>example:</strong>
             * <p>User1</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time when the session was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-07T08:23Z</p>
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
    /**
     * 
     * {@link DescribeGlobalDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopsResponseBody</p>
     */
    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Clients")
        private java.util.List<Clients> clients;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopTimers")
        private java.util.List<DesktopTimers> desktopTimers;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FotaUpdate")
        private FotaUpdate fotaUpdate;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Integer gpuMemory;

        @com.aliyun.core.annotation.NameInMap("HibernationBeta")
        private Boolean hibernationBeta;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LastStartTime")
        private String lastStartTime;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ManagementFlags")
        private java.util.List<String> managementFlags;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsDescription")
        private String osDescription;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RealDesktopId")
        private String realDesktopId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionLocation")
        private String regionLocation;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("SupportHibernation")
        private Boolean supportHibernation;

        @com.aliyun.core.annotation.NameInMap("UserCustomName")
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
            this.hibernationBeta = builder.hibernationBeta;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.lastStartTime = builder.lastStartTime;
            this.localName = builder.localName;
            this.managementFlags = builder.managementFlags;
            this.memory = builder.memory;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.os = builder.os;
            this.osDescription = builder.osDescription;
            this.osType = builder.osType;
            this.platform = builder.platform;
            this.policyGroupId = builder.policyGroupId;
            this.protocolType = builder.protocolType;
            this.realDesktopId = builder.realDesktopId;
            this.regionId = builder.regionId;
            this.regionLocation = builder.regionLocation;
            this.sessionType = builder.sessionType;
            this.sessions = builder.sessions;
            this.supportHibernation = builder.supportHibernation;
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
        public java.util.List<Clients> getClients() {
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
        public java.util.List<DesktopTimers> getDesktopTimers() {
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
        public java.util.List<Disks> getDisks() {
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
        public java.util.List<String> getEndUserIds() {
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
         * @return hibernationBeta
         */
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
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
        public java.util.List<String> getManagementFlags() {
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
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osDescription
         */
        public String getOsDescription() {
            return this.osDescription;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
         * @return regionLocation
         */
        public String getRegionLocation() {
            return this.regionLocation;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return supportHibernation
         */
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        /**
         * @return userCustomName
         */
        public String getUserCustomName() {
            return this.userCustomName;
        }

        public static final class Builder {
            private String chargeType; 
            private java.util.List<Clients> clients; 
            private String connectionStatus; 
            private Integer cpu; 
            private String creationTime; 
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private java.util.List<DesktopTimers> desktopTimers; 
            private String desktopType; 
            private String directoryId; 
            private java.util.List<Disks> disks; 
            private String endUserId; 
            private java.util.List<String> endUserIds; 
            private String expiredTime; 
            private FotaUpdate fotaUpdate; 
            private Integer gpuMemory; 
            private Boolean hibernationBeta; 
            private String hostName; 
            private String imageId; 
            private String lastStartTime; 
            private String localName; 
            private java.util.List<String> managementFlags; 
            private Long memory; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String os; 
            private String osDescription; 
            private String osType; 
            private String platform; 
            private String policyGroupId; 
            private String protocolType; 
            private String realDesktopId; 
            private String regionId; 
            private String regionLocation; 
            private String sessionType; 
            private java.util.List<Sessions> sessions; 
            private Boolean supportHibernation; 
            private String userCustomName; 

            private Builder() {
            } 

            private Builder(Desktops model) {
                this.chargeType = model.chargeType;
                this.clients = model.clients;
                this.connectionStatus = model.connectionStatus;
                this.cpu = model.cpu;
                this.creationTime = model.creationTime;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.desktopTimers = model.desktopTimers;
                this.desktopType = model.desktopType;
                this.directoryId = model.directoryId;
                this.disks = model.disks;
                this.endUserId = model.endUserId;
                this.endUserIds = model.endUserIds;
                this.expiredTime = model.expiredTime;
                this.fotaUpdate = model.fotaUpdate;
                this.gpuMemory = model.gpuMemory;
                this.hibernationBeta = model.hibernationBeta;
                this.hostName = model.hostName;
                this.imageId = model.imageId;
                this.lastStartTime = model.lastStartTime;
                this.localName = model.localName;
                this.managementFlags = model.managementFlags;
                this.memory = model.memory;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.officeSiteId = model.officeSiteId;
                this.os = model.os;
                this.osDescription = model.osDescription;
                this.osType = model.osType;
                this.platform = model.platform;
                this.policyGroupId = model.policyGroupId;
                this.protocolType = model.protocolType;
                this.realDesktopId = model.realDesktopId;
                this.regionId = model.regionId;
                this.regionLocation = model.regionLocation;
                this.sessionType = model.sessionType;
                this.sessions = model.sessions;
                this.supportHibernation = model.supportHibernation;
                this.userCustomName = model.userCustomName;
            } 

            /**
             * <p>The billing method of the cloud computer pool.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The information about the supported clients.</p>
             */
            public Builder clients(java.util.List<Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * <p>The state of the endpoint connection.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Connected</li>
             * <li>Disconnecting</li>
             * <li>Pending.</li>
             * <li>Connecting.</li>
             * <li>Disconnected.</li>
             * <li>Deleting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disconnected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the cloud computer was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-3uiojcc0j4kh7****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The cloud compute ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmucyy****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesktopName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The cloud computer status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The cloud computer timer object.</p>
             */
            public Builder desktopTimers(java.util.List<DesktopTimers> desktopTimers) {
                this.desktopTimers = desktopTimers;
                return this;
            }

            /**
             * <p>The cloud computer type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd.basic.large</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The network ID of the office. Same as <code>OfficeSiteId</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The disks.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * <p>The names of end users.</p>
             * 
             * <strong>example:</strong>
             * <p>User1</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The list of end user.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The expiration time of the cloud computer.</p>
             * <ul>
             * <li>For a cloud computer that is a package year or month, the return value is meaningful.</li>
             * <li>For pay-as-you-go cloud computers, the <code>2099-12-31T15:59Z</code> is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2021-12-31T15:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The information about image update.</p>
             */
            public Builder fotaUpdate(FotaUpdate fotaUpdate) {
                this.fotaUpdate = fotaUpdate;
                return this;
            }

            /**
             * <p>The GPU memory size. For GPU-accelerated cloud computers, this return value is significant. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder gpuMemory(Integer gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * <p>Indicates whether this is a beta version of the hibernation feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hibernationBeta(Boolean hibernationBeta) {
                this.hibernationBeta = hibernationBeta;
                return this;
            }

            /**
             * <p>The hostname of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-4zfb6zj728hhr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The time when the cloud desktop was last started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-13T15:59Z</p>
             */
            public Builder lastStartTime(String lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * <p>The region name.</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The list of cloud computer status.</p>
             */
            public Builder managementFlags(java.util.List<String> managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * <p>The memory of the cloud computer. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx</p>
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * <p>The IDs of the office networks.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>OS Type</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsDescription.
             */
            public Builder osDescription(String osDescription) {
                this.osDescription = osDescription;
                return this;
            }

            /**
             * <p>The operating system.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Linux</li>
             * <li>Windows</li>
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
             * <p>The OS platform.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Ubuntu</li>
             * <li>UOS</li>
             * <li>CentOS</li>
             * <li>Windows Server 2019</li>
             * <li>Windows Server 2016</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The cloud computer policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-9cktlowtxfl6****</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The type of the protocol.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>High-definition Experience (HDX)</li>
             * <li>ASP</li>
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
             * <p>If a shared cloud computer is assigned a real cloud computer, the ID of the cloud computer is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsm****</p>
             */
            public Builder realDesktopId(String realDesktopId) {
                this.realDesktopId = realDesktopId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionLocation.
             */
            public Builder regionLocation(String regionLocation) {
                this.regionLocation = regionLocation;
                return this;
            }

            /**
             * <p>The type of the session.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>SINGLE_SESSION</li>
             * <li>MULTIPLE_SESSION</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SINGLE_SESSION</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The list of session information.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>Indicates whether hibernation is supported.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: supported</li>
             * <li>false: not supported</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportHibernation(Boolean supportHibernation) {
                this.supportHibernation = supportHibernation;
                return this;
            }

            /**
             * <p>The custom cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesktop</p>
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
