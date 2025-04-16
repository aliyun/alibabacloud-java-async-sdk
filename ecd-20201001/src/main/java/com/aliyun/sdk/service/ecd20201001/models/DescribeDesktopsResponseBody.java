// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopsResponseBody</p>
 */
public class DescribeDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private java.util.List<Desktops> desktops;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopsResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsResponseBody create() {
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

        private Builder(DescribeDesktopsResponseBody model) {
            this.desktops = model.desktops;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Desktops.
         */
        public Builder desktops(java.util.List<Desktops> desktops) {
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

        public DescribeDesktopsResponseBody build() {
            return new DescribeDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
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
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private String dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LastStartTime")
        private String lastStartTime;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private Desktops(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.desktopType = builder.desktopType;
            this.directoryId = builder.directoryId;
            this.disks = builder.disks;
            this.endUserIds = builder.endUserIds;
            this.imageId = builder.imageId;
            this.lastStartTime = builder.lastStartTime;
            this.memory = builder.memory;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.officeSiteId = builder.officeSiteId;
            this.policyGroupId = builder.policyGroupId;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
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
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskSize
         */
        public String getDataDiskSize() {
            return this.dataDiskSize;
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
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
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
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String connectionStatus; 
            private Integer cpu; 
            private String creationTime; 
            private String dataDiskCategory; 
            private String dataDiskSize; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String desktopType; 
            private String directoryId; 
            private java.util.List<Disks> disks; 
            private java.util.List<String> endUserIds; 
            private String imageId; 
            private String lastStartTime; 
            private Long memory; 
            private String networkInterfaceId; 
            private String officeSiteId; 
            private String policyGroupId; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 

            private Builder() {
            } 

            private Builder(Desktops model) {
                this.connectionStatus = model.connectionStatus;
                this.cpu = model.cpu;
                this.creationTime = model.creationTime;
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskSize = model.dataDiskSize;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.desktopType = model.desktopType;
                this.directoryId = model.directoryId;
                this.disks = model.disks;
                this.endUserIds = model.endUserIds;
                this.imageId = model.imageId;
                this.lastStartTime = model.lastStartTime;
                this.memory = model.memory;
                this.networkInterfaceId = model.networkInterfaceId;
                this.officeSiteId = model.officeSiteId;
                this.policyGroupId = model.policyGroupId;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
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
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
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
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * EndUserIds.
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
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
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
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
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
