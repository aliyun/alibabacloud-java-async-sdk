// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Backup.
         */
        public Builder backup(Backup backup) {
            this.backup = backup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBackupResponseBody build() {
            return new GetBackupResponseBody(this);
        } 

    } 

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

            /**
             * AutoImageCount.
             */
            public Builder autoImageCount(Long autoImageCount) {
                this.autoImageCount = autoImageCount;
                return this;
            }

            /**
             * BackupHourInDay.
             */
            public Builder backupHourInDay(String backupHourInDay) {
                this.backupHourInDay = backupHourInDay;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupPeriod.
             */
            public Builder backupPeriod(Long backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * MaxImageCount.
             */
            public Builder maxImageCount(String maxImageCount) {
                this.maxImageCount = maxImageCount;
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
             * NextImageCreateTime.
             */
            public Builder nextImageCreateTime(Long nextImageCreateTime) {
                this.nextImageCreateTime = nextImageCreateTime;
                return this;
            }

            /**
             * OwnerInstanceId.
             */
            public Builder ownerInstanceId(String ownerInstanceId) {
                this.ownerInstanceId = ownerInstanceId;
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
             * ReleaseTime.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
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
             * SpInstanceId.
             */
            public Builder spInstanceId(String spInstanceId) {
                this.spInstanceId = spInstanceId;
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
             * Type.
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
