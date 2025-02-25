// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImagesResponseBody</p>
 */
public class ListImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List < Images> images;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListImagesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.images = builder.images;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return images
     */
    public java.util.List < Images> getImages() {
        return this.images;
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
        private Integer currentPage; 
        private java.util.List < Images> images; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListImagesResponseBody build() {
            return new ListImagesResponseBody(this);
        } 

    } 

    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("CopyTime")
        private String copyTime;

        @com.aliyun.core.annotation.NameInMap("ExportTime")
        private Long exportTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SourceBackupUid")
        private String sourceBackupUid;

        @com.aliyun.core.annotation.NameInMap("SourceImageUid")
        private String sourceImageUid;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceRegionId")
        private String sourceRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VsmDigest")
        private String vsmDigest;

        private Images(Builder builder) {
            this.backupId = builder.backupId;
            this.copyTime = builder.copyTime;
            this.exportTime = builder.exportTime;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.mode = builder.mode;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.sourceBackupUid = builder.sourceBackupUid;
            this.sourceImageUid = builder.sourceImageUid;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceRegionId = builder.sourceRegionId;
            this.status = builder.status;
            this.vsmDigest = builder.vsmDigest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return copyTime
         */
        public String getCopyTime() {
            return this.copyTime;
        }

        /**
         * @return exportTime
         */
        public Long getExportTime() {
            return this.exportTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
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
         * @return sourceBackupUid
         */
        public String getSourceBackupUid() {
            return this.sourceBackupUid;
        }

        /**
         * @return sourceImageUid
         */
        public String getSourceImageUid() {
            return this.sourceImageUid;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vsmDigest
         */
        public String getVsmDigest() {
            return this.vsmDigest;
        }

        public static final class Builder {
            private String backupId; 
            private String copyTime; 
            private Long exportTime; 
            private String imageId; 
            private String instanceId; 
            private String mode; 
            private String regionId; 
            private String remark; 
            private String sourceBackupUid; 
            private String sourceImageUid; 
            private String sourceInstanceId; 
            private String sourceRegionId; 
            private String status; 
            private String vsmDigest; 

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * CopyTime.
             */
            public Builder copyTime(String copyTime) {
                this.copyTime = copyTime;
                return this;
            }

            /**
             * ExportTime.
             */
            public Builder exportTime(Long exportTime) {
                this.exportTime = exportTime;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
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
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SourceBackupUid.
             */
            public Builder sourceBackupUid(String sourceBackupUid) {
                this.sourceBackupUid = sourceBackupUid;
                return this;
            }

            /**
             * SourceImageUid.
             */
            public Builder sourceImageUid(String sourceImageUid) {
                this.sourceImageUid = sourceImageUid;
                return this;
            }

            /**
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * SourceRegionId.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
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
             * VsmDigest.
             */
            public Builder vsmDigest(String vsmDigest) {
                this.vsmDigest = vsmDigest;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
