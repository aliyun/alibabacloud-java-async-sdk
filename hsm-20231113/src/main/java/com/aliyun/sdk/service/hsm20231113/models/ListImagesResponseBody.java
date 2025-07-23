// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link ListImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImagesResponseBody</p>
 */
public class ListImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Images> getImages() {
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
        private java.util.List<Images> images; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListImagesResponseBody model) {
            this.currentPage = model.currentPage;
            this.images = model.images;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The images returned.</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The number of images per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of images returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListImagesResponseBody build() {
            return new ListImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImagesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Images model) {
                this.backupId = model.backupId;
                this.copyTime = model.copyTime;
                this.exportTime = model.exportTime;
                this.imageId = model.imageId;
                this.instanceId = model.instanceId;
                this.mode = model.mode;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.sourceBackupUid = model.sourceBackupUid;
                this.sourceImageUid = model.sourceImageUid;
                this.sourceInstanceId = model.sourceInstanceId;
                this.sourceRegionId = model.sourceRegionId;
                this.status = model.status;
                this.vsmDigest = model.vsmDigest;
            } 

            /**
             * <p>The ID of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>backup-fdb897sdf****</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The time when the image was copied. Unit: milliseconds. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1641275680000</p>
             */
            public Builder copyTime(String copyTime) {
                this.copyTime = copyTime;
                return this;
            }

            /**
             * <p>The time when the image was generated. Unit: milliseconds. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782849566738</p>
             */
            public Builder exportTime(Long exportTime) {
                this.exportTime = exportTime;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>image-d79x4k11pmg19****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the hardware security module (HSM).</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-6ja1xknf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The image generation mode. Valid values:</p>
             * <ul>
             * <li>PERIODIC: It is automatically generated.</li>
             * <li>MANUAL: It is manually generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The description of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The ID of the source backup.</p>
             * 
             * <strong>example:</strong>
             * <p>backup-hodfhaol****</p>
             */
            public Builder sourceBackupUid(String sourceBackupUid) {
                this.sourceBackupUid = sourceBackupUid;
                return this;
            }

            /**
             * <p>The ID of the source image.</p>
             * 
             * <strong>example:</strong>
             * <p>image-ooopjygsn****</p>
             */
            public Builder sourceImageUid(String sourceImageUid) {
                this.sourceImageUid = sourceImageUid;
                return this;
            }

            /**
             * <p>The ID of the source HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-wz9i2dmefudfxtmb****</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region in which the source image resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * <p>The status of the image. Valid values:</p>
             * <ul>
             * <li>NEW: It is disabled.</li>
             * <li>DELETED: It is deleted.</li>
             * <li>CREATING: It is being created.</li>
             * <li>NORMAL: It is created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The digest of the HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>3kGeHnmQzXwSsfF0Jk9eJYhe2gP6An0/HlYIiZh1****</p>
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
