// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomImagesResponseBody</p>
 */
public class ListCustomImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomImages")
    private java.util.List < CustomImages> customImages;

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

    /**
     * @return customImages
     */
    public java.util.List < CustomImages> getCustomImages() {
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
        private java.util.List < CustomImages> customImages; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The array of queried custom images.
         */
        public Builder customImages(java.util.List < CustomImages> customImages) {
            this.customImages = customImages;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomImagesResponseBody build() {
            return new ListCustomImagesResponseBody(this);
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
             * The tag key of the custom image.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the custom image.
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
    public static class CustomImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateInstances")
        private java.util.List < String > createInstances;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemSnapshotId")
        private String systemSnapshotId;

        @com.aliyun.core.annotation.NameInMap("SystemSnapshotName")
        private String systemSnapshotName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

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
            this.resourceGroupId = builder.resourceGroupId;
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
        public java.util.List < String > getCreateInstances() {
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < String > createInstances; 
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
            private String resourceGroupId; 
            private String status; 
            private String systemSnapshotId; 
            private String systemSnapshotName; 
            private java.util.List < Tags> tags; 
            private Long userId; 

            /**
             * CreateInstances.
             */
            public Builder createInstances(java.util.List < String > createInstances) {
                this.createInstances = createInstances;
                return this;
            }

            /**
             * The time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the data disk snapshot.
             */
            public Builder dataSnapshotId(String dataSnapshotId) {
                this.dataSnapshotId = dataSnapshotId;
                return this;
            }

            /**
             * The name of the data disk snapshot.
             */
            public Builder dataSnapshotName(String dataSnapshotName) {
                this.dataSnapshotName = dataSnapshotName;
                return this;
            }

            /**
             * The description of the custom image.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the custom image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Indicates whether the custom image is shared to Elastic Compute Service (ECS).
             */
            public Builder inShare(Boolean inShare) {
                this.inShare = inShare;
                return this;
            }

            /**
             * InShareUser.
             */
            public Builder inShareUser(Boolean inShareUser) {
                this.inShareUser = inShareUser;
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
             * The name of the custom image.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the custom image.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the system disk snapshot.
             */
            public Builder systemSnapshotId(String systemSnapshotId) {
                this.systemSnapshotId = systemSnapshotId;
                return this;
            }

            /**
             * The name of the system disk snapshot.
             */
            public Builder systemSnapshotName(String systemSnapshotName) {
                this.systemSnapshotName = systemSnapshotName;
                return this;
            }

            /**
             * The tags of the custom image.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserId.
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
