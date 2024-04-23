// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiskResponseBody</p>
 */
public class GetDiskResponseBody extends TeaModel {
    @NameInMap("Disk")
    private Disk disk;

    @NameInMap("RequestId")
    private String requestId;

    private GetDiskResponseBody(Builder builder) {
        this.disk = builder.disk;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return disk
     */
    public Disk getDisk() {
        return this.disk;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Disk disk; 
        private String requestId; 

        /**
         * The information of the disk.
         */
        public Builder disk(Disk disk) {
            this.disk = disk;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDiskResponseBody build() {
            return new GetDiskResponseBody(this);
        } 

    } 

    public static class Ecs extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        private Ecs(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ecs create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Ecs build() {
                return new Ecs(this);
            } 

        } 

    }
    public static class Pod extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("PodId")
        private String podId;

        private Pod(Builder builder) {
            this.clusterId = builder.clusterId;
            this.podId = builder.podId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pod create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        public static final class Builder {
            private String clusterId; 
            private String podId; 

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The pod ID.
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            public Pod build() {
                return new Pod(this);
            } 

        } 

    }
    public static class AccessAuthorization extends TeaModel {
        @NameInMap("AccessToken")
        private String accessToken;

        @NameInMap("Ecs")
        private Ecs ecs;

        @NameInMap("Pod")
        private Pod pod;

        private AccessAuthorization(Builder builder) {
            this.accessToken = builder.accessToken;
            this.ecs = builder.ecs;
            this.pod = builder.pod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessAuthorization create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return ecs
         */
        public Ecs getEcs() {
            return this.ecs;
        }

        /**
         * @return pod
         */
        public Pod getPod() {
            return this.pod;
        }

        public static final class Builder {
            private String accessToken; 
            private Ecs ecs; 
            private Pod pod; 

            /**
             * The token that is used to access the disk.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * The information of ecs.
             */
            public Builder ecs(Ecs ecs) {
                this.ecs = ecs;
                return this;
            }

            /**
             * The information of pod.
             */
            public Builder pod(Pod pod) {
                this.pod = pod;
                return this;
            }

            public AccessAuthorization build() {
                return new AccessAuthorization(this);
            } 

        } 

    }
    public static class Attachments extends TeaModel {
        @NameInMap("AttachedTime")
        private String attachedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NamespaceId")
        private Integer namespaceId;

        private Attachments(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.instanceId = builder.instanceId;
            this.namespaceId = builder.namespaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespaceId
         */
        public Integer getNamespaceId() {
            return this.namespaceId;
        }

        public static final class Builder {
            private String attachedTime; 
            private String instanceId; 
            private Integer namespaceId; 

            /**
             * The time when the disk was attached.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(Integer namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Disk extends TeaModel {
        @NameInMap("AccessAuthorization")
        private java.util.List < AccessAuthorization> accessAuthorization;

        @NameInMap("AttachedTime")
        private String attachedTime;

        @NameInMap("Attachments")
        private java.util.List < Attachments> attachments;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("Category")
        private String category;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DetachedTime")
        private String detachedTime;

        @NameInMap("DeviceNguid")
        private String deviceNguid;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("Iops")
        private Long iops;

        @NameInMap("IopsRead")
        private Long iopsRead;

        @NameInMap("IopsWrite")
        private Long iopsWrite;

        @NameInMap("KmsKeyId")
        private String kmsKeyId;

        @NameInMap("ModifyAt")
        private String modifyAt;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Throughput")
        private Long throughput;

        @NameInMap("ZoneId")
        private String zoneId;

        private Disk(Builder builder) {
            this.accessAuthorization = builder.accessAuthorization;
            this.attachedTime = builder.attachedTime;
            this.attachments = builder.attachments;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.detachedTime = builder.detachedTime;
            this.deviceNguid = builder.deviceNguid;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.iops = builder.iops;
            this.iopsRead = builder.iopsRead;
            this.iopsWrite = builder.iopsWrite;
            this.kmsKeyId = builder.kmsKeyId;
            this.modifyAt = builder.modifyAt;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.size = builder.size;
            this.status = builder.status;
            this.tags = builder.tags;
            this.throughput = builder.throughput;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return accessAuthorization
         */
        public java.util.List < AccessAuthorization> getAccessAuthorization() {
            return this.accessAuthorization;
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return attachments
         */
        public java.util.List < Attachments> getAttachments() {
            return this.attachments;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detachedTime
         */
        public String getDetachedTime() {
            return this.detachedTime;
        }

        /**
         * @return deviceNguid
         */
        public String getDeviceNguid() {
            return this.deviceNguid;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return iops
         */
        public Long getIops() {
            return this.iops;
        }

        /**
         * @return iopsRead
         */
        public Long getIopsRead() {
            return this.iopsRead;
        }

        /**
         * @return iopsWrite
         */
        public Long getIopsWrite() {
            return this.iopsWrite;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return modifyAt
         */
        public String getModifyAt() {
            return this.modifyAt;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return throughput
         */
        public Long getThroughput() {
            return this.throughput;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < AccessAuthorization> accessAuthorization; 
            private String attachedTime; 
            private java.util.List < Attachments> attachments; 
            private Boolean burstingEnabled; 
            private String category; 
            private String creationTime; 
            private String description; 
            private String detachedTime; 
            private String deviceNguid; 
            private String diskId; 
            private String diskName; 
            private Boolean encrypted; 
            private Long iops; 
            private Long iopsRead; 
            private Long iopsWrite; 
            private String kmsKeyId; 
            private String modifyAt; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private String regionId; 
            private String resourceGroupId; 
            private Long size; 
            private String status; 
            private java.util.List < Tags> tags; 
            private Long throughput; 
            private String zoneId; 

            /**
             * The access authorization information of the disk.
             */
            public Builder accessAuthorization(java.util.List < AccessAuthorization> accessAuthorization) {
                this.accessAuthorization = accessAuthorization;
                return this;
            }

            /**
             * The time when the disk was attached.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The attachment information of the disk.
             */
            public Builder attachments(java.util.List < Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * Specifies whether to enable the performance burst feature for the disk. Valid values:
             * <p>
             * 
             * * true: enable the performance burst feature.
             * * false: disable the performance burst feature.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The category of the disk.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the disk was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the disk.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the disk was detached.
             */
            public Builder detachedTime(String detachedTime) {
                this.detachedTime = detachedTime;
                return this;
            }

            /**
             * The maximum number of read and write operations per second. Unit: operations/s.
             */
            public Builder deviceNguid(String deviceNguid) {
                this.deviceNguid = deviceNguid;
                return this;
            }

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The name of the disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Specifies whether to encrypt the disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * IOPS.
             */
            public Builder iops(Long iops) {
                this.iops = iops;
                return this;
            }

            /**
             * The maximum number of read operations per second. Unit: operations/s.
             */
            public Builder iopsRead(Long iopsRead) {
                this.iopsRead = iopsRead;
                return this;
            }

            /**
             * The maximum number of write operations per second. Unit: operations/s.
             */
            public Builder iopsWrite(Long iopsWrite) {
                this.iopsWrite = iopsWrite;
                return this;
            }

            /**
             * The ID of the KMS key.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * The time when the disk was modfied.
             */
            public Builder modifyAt(String modifyAt) {
                this.modifyAt = modifyAt;
                return this;
            }

            /**
             * The performance level of the ESSD. Valid values:
             * <p>
             * 
             * * PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * * PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * * PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * * PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}
             * <p>
             * 
             * Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}
             * 
             * >  This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The region ID of the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the disk belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The size of the disk. Unit: GB.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The states of disk. Valid values:
             * <p>
             * 
             * * In_use
             * * Available
             * * Attaching
             * * Detaching
             * * Creating
             * * ReIniting
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The details of the tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The throughput of the disk.
             * <p>
             * 
             * Unit: MB/s.
             */
            public Builder throughput(Long throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * The ID of the zone where the disk resides.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
