// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomImagesResponseBody</p>
 */
public class ListCustomImagesResponseBody extends TeaModel {
    @NameInMap("CustomImages")
    private java.util.List < CustomImages> customImages;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * CustomImages.
         */
        public Builder customImages(java.util.List < CustomImages> customImages) {
            this.customImages = customImages;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomImagesResponseBody build() {
            return new ListCustomImagesResponseBody(this);
        } 

    } 

    public static class CustomImages extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataSnapshotId")
        private String dataSnapshotId;

        @NameInMap("DataSnapshotName")
        private String dataSnapshotName;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InShare")
        private Boolean inShare;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SystemSnapshotId")
        private String systemSnapshotId;

        @NameInMap("SystemSnapshotName")
        private String systemSnapshotName;

        private CustomImages(Builder builder) {
            this.creationTime = builder.creationTime;
            this.dataSnapshotId = builder.dataSnapshotId;
            this.dataSnapshotName = builder.dataSnapshotName;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.inShare = builder.inShare;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.systemSnapshotId = builder.systemSnapshotId;
            this.systemSnapshotName = builder.systemSnapshotName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomImages create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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

        public static final class Builder {
            private String creationTime; 
            private String dataSnapshotId; 
            private String dataSnapshotName; 
            private String description; 
            private String imageId; 
            private Boolean inShare; 
            private String instanceId; 
            private String instanceName; 
            private String name; 
            private String regionId; 
            private String status; 
            private String systemSnapshotId; 
            private String systemSnapshotName; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataSnapshotId.
             */
            public Builder dataSnapshotId(String dataSnapshotId) {
                this.dataSnapshotId = dataSnapshotId;
                return this;
            }

            /**
             * DataSnapshotName.
             */
            public Builder dataSnapshotName(String dataSnapshotName) {
                this.dataSnapshotName = dataSnapshotName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * InShare.
             */
            public Builder inShare(Boolean inShare) {
                this.inShare = inShare;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SystemSnapshotId.
             */
            public Builder systemSnapshotId(String systemSnapshotId) {
                this.systemSnapshotId = systemSnapshotId;
                return this;
            }

            /**
             * SystemSnapshotName.
             */
            public Builder systemSnapshotName(String systemSnapshotName) {
                this.systemSnapshotName = systemSnapshotName;
                return this;
            }

            public CustomImages build() {
                return new CustomImages(this);
            } 

        } 

    }
}
