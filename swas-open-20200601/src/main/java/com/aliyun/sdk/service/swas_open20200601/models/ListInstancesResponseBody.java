// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of simple application servers returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("ImageContact")
        private String imageContact;

        @NameInMap("ImageIconUrl")
        private String imageIconUrl;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageType")
        private String imageType;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("OsType")
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
             * ImageContact.
             */
            public Builder imageContact(String imageContact) {
                this.imageContact = imageContact;
                return this;
            }

            /**
             * ImageIconUrl.
             */
            public Builder imageIconUrl(String imageIconUrl) {
                this.imageIconUrl = imageIconUrl;
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
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * OsType.
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
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("DiskCategory")
        private String diskCategory;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("Flow")
        private Double flow;

        @NameInMap("Memory")
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
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
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
             * DiskCategory.
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
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
             * Flow.
             */
            public Builder flow(Double flow) {
                this.flow = flow;
                return this;
            }

            /**
             * Memory.
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
    public static class Instances extends TeaModel {
        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Combination")
        private Boolean combination;

        @NameInMap("CombinationInstanceId")
        private String combinationInstanceId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DdosStatus")
        private String ddosStatus;

        @NameInMap("DisableReason")
        private String disableReason;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Image")
        private Image image;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InnerIpAddress")
        private String innerIpAddress;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uuid")
        private String uuid;

        private Instances(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.combination = builder.combination;
            this.combinationInstanceId = builder.combinationInstanceId;
            this.creationTime = builder.creationTime;
            this.ddosStatus = builder.ddosStatus;
            this.disableReason = builder.disableReason;
            this.expiredTime = builder.expiredTime;
            this.image = builder.image;
            this.imageId = builder.imageId;
            this.innerIpAddress = builder.innerIpAddress;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.planId = builder.planId;
            this.publicIpAddress = builder.publicIpAddress;
            this.regionId = builder.regionId;
            this.resourceSpec = builder.resourceSpec;
            this.status = builder.status;
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
            private String expiredTime; 
            private Image image; 
            private String imageId; 
            private String innerIpAddress; 
            private String instanceId; 
            private String instanceName; 
            private String planId; 
            private String publicIpAddress; 
            private String regionId; 
            private ResourceSpec resourceSpec; 
            private String status; 
            private String uuid; 

            /**
             * The status of the simple application server. Valid values:
             * <p>
             * 
             * *   Normal
             * *   Expired
             * *   Overdue
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
             * Combination.
             */
            public Builder combination(Boolean combination) {
                this.combination = combination;
                return this;
            }

            /**
             * CombinationInstanceId.
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
             * The DDoS protection status. Valid values:
             * <p>
             * 
             * *   Normal: Normal
             * *   BlackHole: Blackholing
             * *   Defense: Cleaning
             */
            public Builder ddosStatus(String ddosStatus) {
                this.ddosStatus = ddosStatus;
                return this;
            }

            /**
             * DisableReason.
             */
            public Builder disableReason(String disableReason) {
                this.disableReason = disableReason;
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
             * Image.
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
             * The internal IP address of the simple application server.
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
             * The ID of the plan.
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
             * The region ID of the simple application servers.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * The status of the simple application server. Valid values:
             * <p>
             * 
             * *   Pending
             * *   Starting
             * *   Running
             * *   Stopping
             * *   Stopped
             * *   Resetting
             * *   Upgrading
             * *   Disabled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
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
