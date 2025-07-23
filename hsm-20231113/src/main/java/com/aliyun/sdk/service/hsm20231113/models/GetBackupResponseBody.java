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
 * {@link GetBackupResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupResponseBody</p>
 */
public class GetBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Backup")
    private Backup backup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBackupResponseBody(Builder builder) {
        this.backup = builder.backup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backup
     */
    public Backup getBackup() {
        return this.backup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Backup backup; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBackupResponseBody model) {
            this.backup = model.backup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the backup.</p>
         */
        public Builder backup(Backup backup) {
            this.backup = backup;
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

        public GetBackupResponseBody build() {
            return new GetBackupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBackupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBackupResponseBody</p>
     */
    public static class Backup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoImageCount")
        private Long autoImageCount;

        @com.aliyun.core.annotation.NameInMap("BackupHourInDay")
        private String backupHourInDay;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupPeriod")
        private Long backupPeriod;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxImageCount")
        private String maxImageCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextImageCreateTime")
        private Long nextImageCreateTime;

        @com.aliyun.core.annotation.NameInMap("OwnerInstanceId")
        private String ownerInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SpInstanceId")
        private String spInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Backup(Builder builder) {
            this.autoImageCount = builder.autoImageCount;
            this.backupHourInDay = builder.backupHourInDay;
            this.backupId = builder.backupId;
            this.backupPeriod = builder.backupPeriod;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.maxImageCount = builder.maxImageCount;
            this.name = builder.name;
            this.nextImageCreateTime = builder.nextImageCreateTime;
            this.ownerInstanceId = builder.ownerInstanceId;
            this.regionId = builder.regionId;
            this.releaseTime = builder.releaseTime;
            this.remark = builder.remark;
            this.spInstanceId = builder.spInstanceId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
        }

        /**
         * @return autoImageCount
         */
        public Long getAutoImageCount() {
            return this.autoImageCount;
        }

        /**
         * @return backupHourInDay
         */
        public String getBackupHourInDay() {
            return this.backupHourInDay;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupPeriod
         */
        public Long getBackupPeriod() {
            return this.backupPeriod;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxImageCount
         */
        public String getMaxImageCount() {
            return this.maxImageCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextImageCreateTime
         */
        public Long getNextImageCreateTime() {
            return this.nextImageCreateTime;
        }

        /**
         * @return ownerInstanceId
         */
        public String getOwnerInstanceId() {
            return this.ownerInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return spInstanceId
         */
        public String getSpInstanceId() {
            return this.spInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long autoImageCount; 
            private String backupHourInDay; 
            private String backupId; 
            private Long backupPeriod; 
            private Long createTime; 
            private Long expireTime; 
            private String instanceId; 
            private String maxImageCount; 
            private String name; 
            private Long nextImageCreateTime; 
            private String ownerInstanceId; 
            private String regionId; 
            private Long releaseTime; 
            private String remark; 
            private String spInstanceId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Backup model) {
                this.autoImageCount = model.autoImageCount;
                this.backupHourInDay = model.backupHourInDay;
                this.backupId = model.backupId;
                this.backupPeriod = model.backupPeriod;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.maxImageCount = model.maxImageCount;
                this.name = model.name;
                this.nextImageCreateTime = model.nextImageCreateTime;
                this.ownerInstanceId = model.ownerInstanceId;
                this.regionId = model.regionId;
                this.releaseTime = model.releaseTime;
                this.remark = model.remark;
                this.spInstanceId = model.spInstanceId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The number of images that are automatically backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoImageCount(Long autoImageCount) {
                this.autoImageCount = autoImageCount;
                return this;
            }

            /**
             * <p>The backup time in the 24-hour format.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder backupHourInDay(String backupHourInDay) {
                this.backupHourInDay = backupHourInDay;
                return this;
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
             * <p>The automatic backup cycle. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder backupPeriod(Long backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * <p>The time when the backup is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1682417553781</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time of the backup. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1682417553781</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the hardware security module (HSM) that is associated with the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-5yd35431****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum number of images.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxImageCount(String maxImageCount) {
                this.maxImageCount = maxImageCount;
                return this;
            }

            /**
             * <p>The name of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>backup-te****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The next time when the image is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1682417553781</p>
             */
            public Builder nextImageCreateTime(Long nextImageCreateTime) {
                this.nextImageCreateTime = nextImageCreateTime;
                return this;
            }

            /**
             * <p>The ID of the HSM to which the backup belongs. This parameter is available only for HSM backups outside the Chinese mainland and the value of this parameter is consistent with the value of InstanceId.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-huoahd****</p>
             */
            public Builder ownerInstanceId(String ownerInstanceId) {
                this.ownerInstanceId = ownerInstanceId;
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
             * <p>The time when the backup is released. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1641275680000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The description of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The ID of the backup. This parameter is available only for HSM backups in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>backup-fdb897sdfg53****</p>
             */
            public Builder spInstanceId(String spInstanceId) {
                this.spInstanceId = spInstanceId;
                return this;
            }

            /**
             * <p>The status of the backup. Valid values:</p>
             * <ul>
             * <li>NEW</li>
             * <li>EXPIRED</li>
             * <li>ENABLED</li>
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
             * <p>The type of the backup. Valid values:</p>
             * <ul>
             * <li>DEFAULT</li>
             * <li>NORMAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Backup build() {
                return new Backup(this);
            } 

        } 

    }
}
