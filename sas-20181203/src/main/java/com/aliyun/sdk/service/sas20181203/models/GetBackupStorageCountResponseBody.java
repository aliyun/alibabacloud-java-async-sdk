// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBackupStorageCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupStorageCountResponseBody</p>
 */
public class GetBackupStorageCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupStorageCount")
    private BackupStorageCount backupStorageCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * BackupStorageCount.
         */
        public Builder backupStorageCount(BackupStorageCount backupStorageCount) {
            this.backupStorageCount = backupStorageCount;
            return this;
        }

        /**
         * RequestId.
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
        @com.aliyun.core.annotation.NameInMap("BuyStorageByte")
        private Long buyStorageByte;

        @com.aliyun.core.annotation.NameInMap("EcsUsageStorageByte")
        private Long ecsUsageStorageByte;

        @com.aliyun.core.annotation.NameInMap("Overflow")
        private Integer overflow;

        @com.aliyun.core.annotation.NameInMap("UniUsageStorageByte")
        private Long uniUsageStorageByte;

        @com.aliyun.core.annotation.NameInMap("UsageStorageByte")
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
             * BuyStorageByte.
             */
            public Builder buyStorageByte(Long buyStorageByte) {
                this.buyStorageByte = buyStorageByte;
                return this;
            }

            /**
             * EcsUsageStorageByte.
             */
            public Builder ecsUsageStorageByte(Long ecsUsageStorageByte) {
                this.ecsUsageStorageByte = ecsUsageStorageByte;
                return this;
            }

            /**
             * Overflow.
             */
            public Builder overflow(Integer overflow) {
                this.overflow = overflow;
                return this;
            }

            /**
             * UniUsageStorageByte.
             */
            public Builder uniUsageStorageByte(Long uniUsageStorageByte) {
                this.uniUsageStorageByte = uniUsageStorageByte;
                return this;
            }

            /**
             * UsageStorageByte.
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
