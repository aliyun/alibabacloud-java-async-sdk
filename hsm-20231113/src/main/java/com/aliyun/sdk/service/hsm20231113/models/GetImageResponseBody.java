// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageResponseBody</p>
 */
public class GetImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private Image image;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetImageResponseBody(Builder builder) {
        this.image = builder.image;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Image image; 
        private String requestId; 

        /**
         * Image.
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("CopyTime")
        private Long copyTime;

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

        private Image(Builder builder) {
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

        public static Image create() {
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
        public Long getCopyTime() {
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
            private Long copyTime; 
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
            public Builder copyTime(Long copyTime) {
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

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
