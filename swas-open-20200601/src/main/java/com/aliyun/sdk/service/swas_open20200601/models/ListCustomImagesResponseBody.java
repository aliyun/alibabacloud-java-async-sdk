// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomImagesResponseBody</p>
 */
public class ListCustomImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomImages")
    private java.util.List<CustomImages> customImages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListCustomImagesResponseBody(Builder builder) {
        this.customImages = builder.customImages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customImages
     */
    public java.util.List<CustomImages> getCustomImages() {
        return this.customImages;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CustomImages> customImages; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomImagesResponseBody model) {
            this.customImages = model.customImages;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The array of queried custom images.</p>
         */
        public Builder customImages(java.util.List<CustomImages> customImages) {
            this.customImages = customImages;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomImagesResponseBody build() {
            return new ListCustomImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomImagesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomImagesResponseBody</p>
     */
    public static class CustomImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateInstances")
        private java.util.List<String> createInstances;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataSnapshotId")
        private String dataSnapshotId;

        @com.aliyun.core.annotation.NameInMap("DataSnapshotName")
        private String dataSnapshotName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InShare")
        private Boolean inShare;

        @com.aliyun.core.annotation.NameInMap("InShareUser")
        private Boolean inShareUser;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequiredDataDiskSize")
        private Integer requiredDataDiskSize;

        @com.aliyun.core.annotation.NameInMap("RequiredSystemDiskSize")
        private Integer requiredSystemDiskSize;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceImageName")
        private String sourceImageName;

        @com.aliyun.core.annotation.NameInMap("SourceImageVersion")
        private String sourceImageVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemSnapshotId")
        private String systemSnapshotId;

        @com.aliyun.core.annotation.NameInMap("SystemSnapshotName")
        private String systemSnapshotName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private CustomImages(Builder builder) {
            this.createInstances = builder.createInstances;
            this.creationTime = builder.creationTime;
            this.dataSnapshotId = builder.dataSnapshotId;
            this.dataSnapshotName = builder.dataSnapshotName;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.inShare = builder.inShare;
            this.inShareUser = builder.inShareUser;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.name = builder.name;
            this.osType = builder.osType;
            this.regionId = builder.regionId;
            this.requiredDataDiskSize = builder.requiredDataDiskSize;
            this.requiredSystemDiskSize = builder.requiredSystemDiskSize;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceImageName = builder.sourceImageName;
            this.sourceImageVersion = builder.sourceImageVersion;
            this.status = builder.status;
            this.systemSnapshotId = builder.systemSnapshotId;
            this.systemSnapshotName = builder.systemSnapshotName;
            this.tags = builder.tags;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomImages create() {
            return builder().build();
        }

        /**
         * @return createInstances
         */
        public java.util.List<String> getCreateInstances() {
            return this.createInstances;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataSnapshotId
         */
        public String getDataSnapshotId() {
            return this.dataSnapshotId;
        }

        /**
         * @return dataSnapshotName
         */
        public String getDataSnapshotName() {
            return this.dataSnapshotName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return inShare
         */
        public Boolean getInShare() {
            return this.inShare;
        }

        /**
         * @return inShareUser
         */
        public Boolean getInShareUser() {
            return this.inShareUser;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requiredDataDiskSize
         */
        public Integer getRequiredDataDiskSize() {
            return this.requiredDataDiskSize;
        }

        /**
         * @return requiredSystemDiskSize
         */
        public Integer getRequiredSystemDiskSize() {
            return this.requiredSystemDiskSize;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sourceImageName
         */
        public String getSourceImageName() {
            return this.sourceImageName;
        }

        /**
         * @return sourceImageVersion
         */
        public String getSourceImageVersion() {
            return this.sourceImageVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemSnapshotId
         */
        public String getSystemSnapshotId() {
            return this.systemSnapshotId;
        }

        /**
         * @return systemSnapshotName
         */
        public String getSystemSnapshotName() {
            return this.systemSnapshotName;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<String> createInstances; 
            private String creationTime; 
            private String dataSnapshotId; 
            private String dataSnapshotName; 
            private String description; 
            private String imageId; 
            private Boolean inShare; 
            private Boolean inShareUser; 
            private String instanceId; 
            private String instanceName; 
            private String name; 
            private String osType; 
            private String regionId; 
            private Integer requiredDataDiskSize; 
            private Integer requiredSystemDiskSize; 
            private String resourceGroupId; 
            private String sourceImageName; 
            private String sourceImageVersion; 
            private String status; 
            private String systemSnapshotId; 
            private String systemSnapshotName; 
            private java.util.List<Tags> tags; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(CustomImages model) {
                this.createInstances = model.createInstances;
                this.creationTime = model.creationTime;
                this.dataSnapshotId = model.dataSnapshotId;
                this.dataSnapshotName = model.dataSnapshotName;
                this.description = model.description;
                this.imageId = model.imageId;
                this.inShare = model.inShare;
                this.inShareUser = model.inShareUser;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.name = model.name;
                this.osType = model.osType;
                this.regionId = model.regionId;
                this.requiredDataDiskSize = model.requiredDataDiskSize;
                this.requiredSystemDiskSize = model.requiredSystemDiskSize;
                this.resourceGroupId = model.resourceGroupId;
                this.sourceImageName = model.sourceImageName;
                this.sourceImageVersion = model.sourceImageVersion;
                this.status = model.status;
                this.systemSnapshotId = model.systemSnapshotId;
                this.systemSnapshotName = model.systemSnapshotName;
                this.tags = model.tags;
                this.userId = model.userId;
            } 

            /**
             * <p>The simple application servers created from the image.</p>
             */
            public Builder createInstances(java.util.List<String> createInstances) {
                this.createInstances = createInstances;
                return this;
            }

            /**
             * <p>The time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-09T02:28:06Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the data disk snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp19rn9u8eqzlfb***</p>
             */
            public Builder dataSnapshotId(String dataSnapshotId) {
                this.dataSnapshotId = dataSnapshotId;
                return this;
            }

            /**
             * <p>The name of the data disk snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>data disk snapshot</p>
             */
            public Builder dataSnapshotName(String dataSnapshotName) {
                this.dataSnapshotName = dataSnapshotName;
                return this;
            }

            /**
             * <p>The description of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>test-custom-image</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1e79zktg26n2b***</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Indicates whether the custom image is shared to Elastic Compute Service (ECS).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder inShare(Boolean inShare) {
                this.inShare = inShare;
                return this;
            }

            /**
             * <p>Indicates whether the custom image is shared across accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder inShareUser(Boolean inShareUser) {
                this.inShareUser = inShareUser;
                return this;
            }

            /**
             * <p>The ID of the simple application server from which the image is derived.</p>
             * 
             * <strong>example:</strong>
             * <p>2d06ee0520b44de1ae88d4be****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>swas-asdf23***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The name of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>hua</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operating system type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
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
             * <p>The size of the image data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder requiredDataDiskSize(Integer requiredDataDiskSize) {
                this.requiredDataDiskSize = requiredDataDiskSize;
                return this;
            }

            /**
             * <p>The size of the image system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder requiredSystemDiskSize(Integer requiredSystemDiskSize) {
                this.requiredSystemDiskSize = requiredSystemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2h2lvp3ublq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The name of the source image that is used to create the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
             */
            public Builder sourceImageName(String sourceImageName) {
                this.sourceImageName = sourceImageName;
                return this;
            }

            /**
             * <p>The version of the source image that is used to create the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder sourceImageVersion(String sourceImageVersion) {
                this.sourceImageVersion = sourceImageVersion;
                return this;
            }

            /**
             * <p>The status of the custom image. Valid values:</p>
             * <ul>
             * <li>0: copying</li>
             * <li>1: available</li>
             * <li>2: unavailable</li>
             * <li>3: creation failed</li>
             * <li>4: creating</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the system disk snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp1h173hj21puxb***</p>
             */
            public Builder systemSnapshotId(String systemSnapshotId) {
                this.systemSnapshotId = systemSnapshotId;
                return this;
            }

            /**
             * <p>The name of the system disk snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>system disk snapshot</p>
             */
            public Builder systemSnapshotName(String systemSnapshotName) {
                this.systemSnapshotName = systemSnapshotName;
                return this;
            }

            /**
             * <p>The tags of the custom image.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>180185828710****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public CustomImages build() {
                return new CustomImages(this);
            } 

        } 

    }
}
