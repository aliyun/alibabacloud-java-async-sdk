// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBackupStorageCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupStorageCountResponseBody</p>
 */
public class GetBackupStorageCountResponseBody extends TeaModel {
    @NameInMap("BackupStorageCount")
    private BackupStorageCount backupStorageCount;

    @NameInMap("RequestId")
    private String requestId;

    private GetBackupStorageCountResponseBody(Builder builder) {
        this.backupStorageCount = builder.backupStorageCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupStorageCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupStorageCount
     */
    public BackupStorageCount getBackupStorageCount() {
        return this.backupStorageCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupStorageCount backupStorageCount; 
        private String requestId; 

        /**
         * The details about the anti-ransomware capacity.
         */
        public Builder backupStorageCount(BackupStorageCount backupStorageCount) {
            this.backupStorageCount = backupStorageCount;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBackupStorageCountResponseBody build() {
            return new GetBackupStorageCountResponseBody(this);
        } 

    } 

    public static class BackupStorageCount extends TeaModel {
        @NameInMap("BuyStorageByte")
        private Long buyStorageByte;

        @NameInMap("EcsUsageStorageByte")
        private Long ecsUsageStorageByte;

        @NameInMap("Overflow")
        private Integer overflow;

        @NameInMap("UniUsageStorageByte")
        private Long uniUsageStorageByte;

        @NameInMap("UsageStorageByte")
        private Long usageStorageByte;

        private BackupStorageCount(Builder builder) {
            this.buyStorageByte = builder.buyStorageByte;
            this.ecsUsageStorageByte = builder.ecsUsageStorageByte;
            this.overflow = builder.overflow;
            this.uniUsageStorageByte = builder.uniUsageStorageByte;
            this.usageStorageByte = builder.usageStorageByte;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupStorageCount create() {
            return builder().build();
        }

        /**
         * @return buyStorageByte
         */
        public Long getBuyStorageByte() {
            return this.buyStorageByte;
        }

        /**
         * @return ecsUsageStorageByte
         */
        public Long getEcsUsageStorageByte() {
            return this.ecsUsageStorageByte;
        }

        /**
         * @return overflow
         */
        public Integer getOverflow() {
            return this.overflow;
        }

        /**
         * @return uniUsageStorageByte
         */
        public Long getUniUsageStorageByte() {
            return this.uniUsageStorageByte;
        }

        /**
         * @return usageStorageByte
         */
        public Long getUsageStorageByte() {
            return this.usageStorageByte;
        }

        public static final class Builder {
            private Long buyStorageByte; 
            private Long ecsUsageStorageByte; 
            private Integer overflow; 
            private Long uniUsageStorageByte; 
            private Long usageStorageByte; 

            /**
             * The anti-ransomware capacity that you purchased. Unit: bytes.
             */
            public Builder buyStorageByte(Long buyStorageByte) {
                this.buyStorageByte = buyStorageByte;
                return this;
            }

            /**
             * The storage capacity that is occupied by the backup data of your servers. Unit: bytes.
             */
            public Builder ecsUsageStorageByte(Long ecsUsageStorageByte) {
                this.ecsUsageStorageByte = ecsUsageStorageByte;
                return this;
            }

            /**
             * Indicates whether the anti-ransomware capacity that is used exceeds the anti-ransomware capacity that you purchased. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder overflow(Integer overflow) {
                this.overflow = overflow;
                return this;
            }

            /**
             * The storage capacity that is occupied by the backup data of your databases. Unit: bytes.
             */
            public Builder uniUsageStorageByte(Long uniUsageStorageByte) {
                this.uniUsageStorageByte = uniUsageStorageByte;
                return this;
            }

            /**
             * The total anti-ransomware capacity that is used. Unit: bytes.
             */
            public Builder usageStorageByte(Long usageStorageByte) {
                this.usageStorageByte = usageStorageByte;
                return this;
            }

            public BackupStorageCount build() {
                return new BackupStorageCount(this);
            } 

        } 

    }
}
