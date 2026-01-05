// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link LockSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>LockSnapshotResponseBody</p>
 */
public class LockSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LockedSnapshotInfo")
    private LockedSnapshotInfo lockedSnapshotInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LockSnapshotResponseBody(Builder builder) {
        this.lockedSnapshotInfo = builder.lockedSnapshotInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockSnapshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lockedSnapshotInfo
     */
    public LockedSnapshotInfo getLockedSnapshotInfo() {
        return this.lockedSnapshotInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LockedSnapshotInfo lockedSnapshotInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LockSnapshotResponseBody model) {
            this.lockedSnapshotInfo = model.lockedSnapshotInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Locked snapshot information.</p>
         */
        public Builder lockedSnapshotInfo(LockedSnapshotInfo lockedSnapshotInfo) {
            this.lockedSnapshotInfo = lockedSnapshotInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LockSnapshotResponseBody build() {
            return new LockSnapshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LockSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>LockSnapshotResponseBody</p>
     */
    public static class LockedSnapshotInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoolOffPeriod")
        private Integer coolOffPeriod;

        @com.aliyun.core.annotation.NameInMap("CoolOffPeriodExpiredTime")
        private String coolOffPeriodExpiredTime;

        @com.aliyun.core.annotation.NameInMap("LockCreationTime")
        private String lockCreationTime;

        @com.aliyun.core.annotation.NameInMap("LockDuration")
        private Integer lockDuration;

        @com.aliyun.core.annotation.NameInMap("LockDurationStartTime")
        private String lockDurationStartTime;

        @com.aliyun.core.annotation.NameInMap("LockExpiredTime")
        private String lockExpiredTime;

        @com.aliyun.core.annotation.NameInMap("LockStatus")
        private String lockStatus;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private LockedSnapshotInfo(Builder builder) {
            this.coolOffPeriod = builder.coolOffPeriod;
            this.coolOffPeriodExpiredTime = builder.coolOffPeriodExpiredTime;
            this.lockCreationTime = builder.lockCreationTime;
            this.lockDuration = builder.lockDuration;
            this.lockDurationStartTime = builder.lockDurationStartTime;
            this.lockExpiredTime = builder.lockExpiredTime;
            this.lockStatus = builder.lockStatus;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockedSnapshotInfo create() {
            return builder().build();
        }

        /**
         * @return coolOffPeriod
         */
        public Integer getCoolOffPeriod() {
            return this.coolOffPeriod;
        }

        /**
         * @return coolOffPeriodExpiredTime
         */
        public String getCoolOffPeriodExpiredTime() {
            return this.coolOffPeriodExpiredTime;
        }

        /**
         * @return lockCreationTime
         */
        public String getLockCreationTime() {
            return this.lockCreationTime;
        }

        /**
         * @return lockDuration
         */
        public Integer getLockDuration() {
            return this.lockDuration;
        }

        /**
         * @return lockDurationStartTime
         */
        public String getLockDurationStartTime() {
            return this.lockDurationStartTime;
        }

        /**
         * @return lockExpiredTime
         */
        public String getLockExpiredTime() {
            return this.lockExpiredTime;
        }

        /**
         * @return lockStatus
         */
        public String getLockStatus() {
            return this.lockStatus;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private Integer coolOffPeriod; 
            private String coolOffPeriodExpiredTime; 
            private String lockCreationTime; 
            private Integer lockDuration; 
            private String lockDurationStartTime; 
            private String lockExpiredTime; 
            private String lockStatus; 
            private String snapshotId; 

            private Builder() {
            } 

            private Builder(LockedSnapshotInfo model) {
                this.coolOffPeriod = model.coolOffPeriod;
                this.coolOffPeriodExpiredTime = model.coolOffPeriodExpiredTime;
                this.lockCreationTime = model.lockCreationTime;
                this.lockDuration = model.lockDuration;
                this.lockDurationStartTime = model.lockDurationStartTime;
                this.lockExpiredTime = model.lockExpiredTime;
                this.lockStatus = model.lockStatus;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The cooling-off period of the compliance mode. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder coolOffPeriod(Integer coolOffPeriod) {
                this.coolOffPeriod = coolOffPeriod;
                return this;
            }

            /**
             * <p>The end time of the cooling-off period in compliance mode. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format (in UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-15T13:00:00Z</p>
             */
            public Builder coolOffPeriodExpiredTime(String coolOffPeriodExpiredTime) {
                this.coolOffPeriodExpiredTime = coolOffPeriodExpiredTime;
                return this;
            }

            /**
             * <p>The date and time at which the snapshot is locked. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format (in UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-15T10:00:00Z</p>
             */
            public Builder lockCreationTime(String lockCreationTime) {
                this.lockCreationTime = lockCreationTime;
                return this;
            }

            /**
             * <p>The lock duration. After the lock duration ends, the snapshot lock will automatically expire. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lockDuration(Integer lockDuration) {
                this.lockDuration = lockDuration;
                return this;
            }

            /**
             * <p>The start time of the lock duration. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format (in UTC). If you lock a snapshot that is in the Progressing state, the lock time is not calculated until the snapshot enters the Accomplished state.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-15T10:00:00Z</p>
             */
            public Builder lockDurationStartTime(String lockDurationStartTime) {
                this.lockDurationStartTime = lockDurationStartTime;
                return this;
            }

            /**
             * <p>The time when the lock expires. The time follows the <a href="https://help.aliyun.com/zh/ecs/developer-reference/iso-8601-time-format?spm=a2c4g.11186623.0.0.277c6c92kl7kXM">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format (in UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16T10:00:00Z</p>
             */
            public Builder lockExpiredTime(String lockExpiredTime) {
                this.lockExpiredTime = lockExpiredTime;
                return this;
            }

            /**
             * <p>The lock status. Valid values:</p>
             * <ul>
             * <li>compliance-cooloff: The snapshot is locked in compliance mode but is still within the cooling-off period. Snapshots cannot be deleted, but users with the corresponding RAM permissions can unlock snapshots, extend or shorten the cooling-off period, and extend or shorten the lock duration.</li>
             * <li>compliance: The snapshot is locked in compliance mode and the cooling-off period has ended. Snapshots cannot be unlocked or deleted, but users with the corresponding RAM permissions can extend the lock duration.</li>
             * <li>expired: The snapshot was once locked, but the lock duration has ended and the lock has expired. The snapshot is currently not locked and can be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>compliance-cooloff</p>
             */
            public Builder lockStatus(String lockStatus) {
                this.lockStatus = lockStatus;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-9dp2qojdpdfmgfmf****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public LockedSnapshotInfo build() {
                return new LockedSnapshotInfo(this);
            } 

        } 

    }
}
