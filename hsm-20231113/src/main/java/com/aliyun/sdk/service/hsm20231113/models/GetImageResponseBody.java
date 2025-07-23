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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetImageResponseBody model) {
            this.image = model.image;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The image information.</p>
         */
        public Builder image(Image image) {
            this.image = image;
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

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Image model) {
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
             * <p>backup-1618017313</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The time when the image was copied. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1641275680000</p>
             */
            public Builder copyTime(Long copyTime) {
                this.copyTime = copyTime;
                return this;
            }

            /**
             * <p>The time when the image was generated. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1786776567788</p>
             */
            public Builder exportTime(Long exportTime) {
                this.exportTime = exportTime;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>image-wz9c5ths5dfuwx47****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the hardware security module (HSM).</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-9lb32vll****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The image generation mode. Valid values:</p>
             * <ul>
             * <li>PERIODIC</li>
             * <li>MANUAL</li>
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
             * <p>backup-gfuiasdfa****</p>
             */
            public Builder sourceBackupUid(String sourceBackupUid) {
                this.sourceBackupUid = sourceBackupUid;
                return this;
            }

            /**
             * <p>The ID of the source image.</p>
             * 
             * <strong>example:</strong>
             * <p>image-kklhhhh****</p>
             */
            public Builder sourceImageUid(String sourceImageUid) {
                this.sourceImageUid = sourceImageUid;
                return this;
            }

            /**
             * <p>The ID of the source HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-wz9fnmvx190shfbk****</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the source image.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * <p>The status of the image. Valid values:</p>
             * <ul>
             * <li>NEW</li>
             * <li>DELETED</li>
             * <li>CREATING</li>
             * <li>NORMAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NEW</p>
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

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
