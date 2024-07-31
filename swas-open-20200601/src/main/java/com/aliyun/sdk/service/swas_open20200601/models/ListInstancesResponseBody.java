// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the simple application servers.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class DiskTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DiskTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DiskTags build() {
                return new DiskTags(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskChargeType")
        private String diskChargeType;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("DiskTags")
        private java.util.List < DiskTags> diskTags;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Disks(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.device = builder.device;
            this.diskChargeType = builder.diskChargeType;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.diskTags = builder.diskTags;
            this.diskType = builder.diskType;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
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
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskChargeType
         */
        public String getDiskChargeType() {
            return this.diskChargeType;
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
         * @return diskTags
         */
        public java.util.List < DiskTags> getDiskTags() {
            return this.diskTags;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String category; 
            private String creationTime; 
            private String device; 
            private String diskChargeType; 
            private String diskId; 
            private String diskName; 
            private java.util.List < DiskTags> diskTags; 
            private String diskType; 
            private String regionId; 
            private String remark; 
            private String resourceGroupId; 
            private Integer size; 
            private String status; 

            /**
             * The category of the disk. Valid values:
             * <p>
             * 
             * *   ESSD: ESSD of PL0
             * *   SSD: standard SSD
             * *   CLOUD_EFFICIENCY: an ultra disk.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the simple application server was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The device name of the disk after the disk is attached to the simple application server.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The billing method of the disk.
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * The disk ID.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The disk name.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The tags that are added to the disk.
             */
            public Builder diskTags(java.util.List < DiskTags> diskTags) {
                this.diskTags = diskTags;
                return this;
            }

            /**
             * The disk type. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The remarks of the disk.
             */
            public Builder remark(String remark) {
                this.remark = remark;
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
             * The disk size. Unit: GB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the disk. Valid values:
             * <p>
             * 
             * *   ReIniting: The disk is being initialized.
             * *   Creating: The disk is being created.
             * *   In_use: The disk is in use.
             * *   Available: The disk can be attached.
             * *   Attaching: The disk is being attached.
             * *   Detaching: The disk is being detached.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageContact")
        private String imageContact;

        @com.aliyun.core.annotation.NameInMap("ImageIconUrl")
        private String imageIconUrl;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        private Image(Builder builder) {
            this.imageContact = builder.imageContact;
            this.imageIconUrl = builder.imageIconUrl;
            this.imageName = builder.imageName;
            this.imageType = builder.imageType;
            this.imageVersion = builder.imageVersion;
            this.osType = builder.osType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return imageContact
         */
        public String getImageContact() {
            return this.imageContact;
        }

        /**
         * @return imageIconUrl
         */
        public String getImageIconUrl() {
            return this.imageIconUrl;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        public static final class Builder {
            private String imageContact; 
            private String imageIconUrl; 
            private String imageName; 
            private String imageType; 
            private String imageVersion; 
            private String osType; 

            /**
             * The image provider.
             */
            public Builder imageContact(String imageContact) {
                this.imageContact = imageContact;
                return this;
            }

            /**
             * The URL of the image icon.
             */
            public Builder imageIconUrl(String imageIconUrl) {
                this.imageIconUrl = imageIconUrl;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The type of the image. Valid values:
             * <p>
             * 
             * *   system
             * *   app
             * *   custom
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * The image tag.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * The OS.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("Flow")
        private Double flow;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Double memory;

        private ResourceSpec(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.cpu = builder.cpu;
            this.diskCategory = builder.diskCategory;
            this.diskSize = builder.diskSize;
            this.flow = builder.flow;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return flow
         */
        public Double getFlow() {
            return this.flow;
        }

        /**
         * @return memory
         */
        public Double getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer cpu; 
            private String diskCategory; 
            private Integer diskSize; 
            private Double flow; 
            private Double memory; 

            /**
             * The bandwidth of the server.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The number of vCPUs of the simple application server.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The category of the disk. Valid values:
             * <p>
             * 
             * *   ESSD: enhanced SSD (ESSD) of PL0
             * *   SSD: standard SSD
             * *   CLOUD_EFFICIENCY: ultra disk
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * The disk size.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The amount of the traffic.
             * <p>
             * 
             * *   A value of 0 indicates the traffic amount of a bandwidth-based simple application server.
             * *   A non-zero value indicates the traffic amount of a data transfer plan-based simple application server.
             */
            public Builder flow(Double flow) {
                this.flow = flow;
                return this;
            }

            /**
             * The memory size of the server.
             */
            public Builder memory(Double memory) {
                this.memory = memory;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key of the simple application server.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the simple application server.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Combination")
        private Boolean combination;

        @com.aliyun.core.annotation.NameInMap("CombinationInstanceId")
        private String combinationInstanceId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DdosStatus")
        private String ddosStatus;

        @com.aliyun.core.annotation.NameInMap("DisableReason")
        private String disableReason;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List < Disks> disks;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Image")
        private Image image;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InnerIpAddress")
        private String innerIpAddress;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Instances(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.combination = builder.combination;
            this.combinationInstanceId = builder.combinationInstanceId;
            this.creationTime = builder.creationTime;
            this.ddosStatus = builder.ddosStatus;
            this.disableReason = builder.disableReason;
            this.disks = builder.disks;
            this.expiredTime = builder.expiredTime;
            this.image = builder.image;
            this.imageId = builder.imageId;
            this.innerIpAddress = builder.innerIpAddress;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.planId = builder.planId;
            this.publicIpAddress = builder.publicIpAddress;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceSpec = builder.resourceSpec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return combination
         */
        public Boolean getCombination() {
            return this.combination;
        }

        /**
         * @return combinationInstanceId
         */
        public String getCombinationInstanceId() {
            return this.combinationInstanceId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ddosStatus
         */
        public String getDdosStatus() {
            return this.ddosStatus;
        }

        /**
         * @return disableReason
         */
        public String getDisableReason() {
            return this.disableReason;
        }

        /**
         * @return disks
         */
        public java.util.List < Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return innerIpAddress
         */
        public String getInnerIpAddress() {
            return this.innerIpAddress;
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
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
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
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
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
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String businessStatus; 
            private String chargeType; 
            private Boolean combination; 
            private String combinationInstanceId; 
            private String creationTime; 
            private String ddosStatus; 
            private String disableReason; 
            private java.util.List < Disks> disks; 
            private String expiredTime; 
            private Image image; 
            private String imageId; 
            private String innerIpAddress; 
            private String instanceId; 
            private String instanceName; 
            private String planId; 
            private String publicIpAddress; 
            private String regionId; 
            private String resourceGroupId; 
            private ResourceSpec resourceSpec; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String uuid; 

            /**
             * The status of the server. Valid values:
             * <p>
             * 
             * *   Normal: The server is normal.
             * *   Expired: The server expires.
             * *   Overdue: The payment of the server is overdue.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The billing method of the simple application server.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Indicates whether the simple application server uses a bundle plan.
             */
            public Builder combination(Boolean combination) {
                this.combination = combination;
                return this;
            }

            /**
             * The ID of the simple application server that uses a bundle plan.
             */
            public Builder combinationInstanceId(String combinationInstanceId) {
                this.combinationInstanceId = combinationInstanceId;
                return this;
            }

            /**
             * The time when the simple application server was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The DDoS protection status of the server. Valid values:
             * <p>
             * 
             * *   Normal: The DDoS protection status of the server is normal.
             * *   BlackHole: The server is in blackhole filtering.
             * *   Defense: The server is being scrubbed.
             */
            public Builder ddosStatus(String ddosStatus) {
                this.ddosStatus = ddosStatus;
                return this;
            }

            /**
             * The reason why the server is disabled. Valid values:
             * <p>
             * 
             * *   FINANCIAL: The server is locked due to overdue payments.
             * *   SECURITY: The server is locked for security reasons.
             * *   EXPIRED: The server is expired.
             */
            public Builder disableReason(String disableReason) {
                this.disableReason = disableReason;
                return this;
            }

            /**
             * The disks that are attached to the simple application server.
             */
            public Builder disks(java.util.List < Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * The time when the simple application server expires. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The description of the image.
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The private IP address of the simple application server.
             */
            public Builder innerIpAddress(String innerIpAddress) {
                this.innerIpAddress = innerIpAddress;
                return this;
            }

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the simple application server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The ID of the instance plan.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the server belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The specifications of the resource.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * The status of the simple application server. Valid values:
             * <p>
             * 
             * *   Pending: The server is being prepared.
             * *   Starting: The server is being started.
             * *   Running: The server is running.
             * *   Stopping: The server is being stopped.
             * *   Stopped: The server is stopped.
             * *   Resetting: The server is being reset.
             * *   Upgrading: The server is being upgraded.
             * *   Disabled: The server is not available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags that are added to the simple application server.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The universally unique identifier (UUID) of the simple application server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
