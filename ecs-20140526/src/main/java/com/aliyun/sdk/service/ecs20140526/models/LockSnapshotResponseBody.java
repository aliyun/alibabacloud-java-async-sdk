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
         * <p>The locked snapshot information.</p>
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

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

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
            this.lockMode = builder.lockMode;
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
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
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
            private String lockMode; 
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
                this.lockMode = model.lockMode;
                this.lockStatus = model.lockStatus;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The cool-off period in compliance mode. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder coolOffPeriod(Integer coolOffPeriod) {
                this.coolOffPeriod = coolOffPeriod;
                return this;
            }

            /**
             * <p>The time when the cool-off period in compliance mode ends. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-15T13:00:00Z</p>
             */
            public Builder coolOffPeriodExpiredTime(String coolOffPeriodExpiredTime) {
                this.coolOffPeriodExpiredTime = coolOffPeriodExpiredTime;
                return this;
            }

            /**
             * <p>The time when the snapshot was locked. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-15T10:00:00Z</p>
             */
            public Builder lockCreationTime(String lockCreationTime) {
                this.lockCreationTime = lockCreationTime;
                return this;
            }

            /**
             * <p>The lock duration. The snapshot lock automatically expires after the lock duration ends. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lockDuration(Integer lockDuration) {
                this.lockDuration = lockDuration;
                return this;
            }

            /**
             * <p>The time when the lock duration starts. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. </p>
             * <p>If you lock a snapshot that is in the progressing state, the lock duration starts only after the snapshot enters the accomplished state.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-15T10:00:00Z</p>
             */
            public Builder lockDurationStartTime(String lockDurationStartTime) {
                this.lockDurationStartTime = lockDurationStartTime;
                return this;
            }

            /**
             * <p>The time when the lock expires. The time follows the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/iso-8601-time-format">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16T10:00:00Z</p>
             */
            public Builder lockExpiredTime(String lockExpiredTime) {
                this.lockExpiredTime = lockExpiredTime;
                return this;
            }

            /**
             * <p>The lock mode. Valid values: </p>
             * <ul>
             * <li>compliance: The snapshot is locked in compliance mode. A snapshot locked in compliance mode cannot be unlocked by any user and can be deleted only after the lock duration expires. Users cannot shorten the lock duration, but users with the required RAM permissions can extend the lock duration at any time. When locking a snapshot in compliance mode, you can optionally specify a cool-off period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>compliance</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The lock status. Valid values: </p>
             * <ul>
             * <li>compliance-cooloff: The snapshot is locked in compliance mode but is still within the cool-off period. The snapshot cannot be deleted, but users with the required RAM permissions can unlock the snapshot, extend or shorten the cool-off period, and extend or shorten the lock duration. </li>
             * <li>compliance: The snapshot is locked in compliance mode and the cool-off period has ended. The snapshot cannot be unlocked or deleted, but users with the required RAM permissions can extend the lock duration. </li>
             * <li>expired: The snapshot was previously locked, but the lock duration has ended and the lock has expired. The snapshot is currently unlocked and can be deleted.</li>
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
